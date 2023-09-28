package com.solers.delivery.event.cleanup;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.FieldSelector;

import org.apache.lucene.document.FieldSelectorResult;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.search.HitCollector;
//import org.apache.lucene.search.Collector;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.store.Directory;

import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.lucene.SingleFieldSelector;
import com.solers.lucene.Converter;


public class LuceneEventCleanupTask implements Runnable {
    
    protected static final Logger log = Logger.getLogger(LuceneEventCleanupTask.class);
    
    private final LuceneHelper helper;
    private final Integer daysToKeepContentEvents;
    private final Integer daysTokeepSynchronizationEvents;
    
    public LuceneEventCleanupTask(LuceneHelper helper, Integer daysToKeepContentEvents, Integer daysTokeepSynchronizationEvents) {
        this.helper = helper;
        this.daysToKeepContentEvents = daysToKeepContentEvents;
        this.daysTokeepSynchronizationEvents = daysTokeepSynchronizationEvents;
    }

    public void run() {
        log.info("Running lucene event cleanup task");
        for (File contentSetFile : list(helper.getEventDirectory())) {
            long contentSetId = Long.parseLong(contentSetFile.getName());
            for (File index : list(contentSetFile)) {
                if (index.getName().equals("synchronizations")) {
                    cleanupSynchronizations(contentSetId, index.getName());
                } else {
                    cleanupDetails(contentSetId, index.getName());
                }
            }
        }
    }
    
    private File [] list(File dir) {
        File [] files = dir.listFiles();
        if (files == null) {
            return new File [] {};
        }
        return files;
    }
    
    private void cleanupSynchronizations(long contentSetId, String indexName) {
        cleanup(helper.getIndex(contentSetId, indexName), getSynchronizationEventCutoff());
    }
    
    private void cleanupDetails(long contentSetId, String indexName) {
        cleanup(helper.getIndex(contentSetId, indexName), getContentEventCutoff());
    }
    
    private void cleanup(Directory index, Date cutoff) {
        IndexReader reader = null;
        IndexSearcher searcher = null;
        try {
            if (!IndexWriter.isLocked(index) && IndexReader.indexExists(index)) {
                reader = IndexReader.open(index);
                searcher = new IndexSearcher(reader);
                searcher.search(new MatchAllDocsQuery(), new RemovingHitCollector(reader, cutoff));
            }
        } catch (IOException ex) {
            log.error("Error cleaning up directory: " + index, ex);
        } finally {
            LuceneHelper.close(searcher);
            LuceneHelper.close(reader);
        }
    }
    
    private Date getContentEventCutoff() {
        return getDate(daysToKeepContentEvents);
    }
    
    private Date getSynchronizationEventCutoff() {
        return getDate(daysTokeepSynchronizationEvents);
    }
    
    private Date getDate(Integer days) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - days);
        return calendar.getTime();
    }
    
    private static class RemovingHitCollector extends HitCollector 
    {
    
        private final IndexReader reader;
        private final FieldSelector selector;
        private final Date date;
        
        public RemovingHitCollector(IndexReader reader, Date date) {
            this.reader = reader;
            this.date = date;
            this.selector = new SingleFieldSelector("timeStamp", FieldSelectorResult.LOAD_AND_BREAK);
        }

        @Override
        public void collect(int docNum, float score) {
        try {
               Document doc = reader.document(docNum, selector);
               Date timestamp = (Date) Converter.DATE.convertFrom(doc.get("timeStamp"));
               if (timestamp != null && timestamp.before(date)) {
                   reader.deleteDocument(docNum);
               }
           } catch (IOException ex) {
               log.error("Error removing record in index: "+reader.directory(), ex);
           }
        }
        
    }
}


/* keep new 

package com.solers.delivery.event.cleanup;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
//import java.util.Set;

import org.apache.log4j.Logger;
//import org.apache.lucene.document.Document;
//import org.apache.lucene.document.StoredFieldVisitor;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
//import org.apache.lucene.index.LeafReaderContext;
//import org.apache.lucene.index.OpenMode;
//import org.apache.lucene.index.IndexWriterConfig.OpenMode;
//import org.apache.lucene.search.Collector;
//import org.apache.lucene.search.LeafCollector;
//import org.apache.lucene.search.ScoreMode;
//import org.apache.lucene.search.Scorable;
//import org.apache.lucene.search.Query;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.store.Directory;

import com.solers.delivery.lucene.LuceneHelper;
//import com.solers.lucene.Converter;

public class LuceneEventCleanupTask implements Runnable {

    protected static final Logger log = Logger.getLogger(LuceneEventCleanupTask.class);

    private final LuceneHelper helper;
    private final Integer daysToKeepContentEvents;
    private final Integer daysTokeepSynchronizationEvents;

    public LuceneEventCleanupTask(LuceneHelper helper, Integer daysToKeepContentEvents,
            Integer daysTokeepSynchronizationEvents) {
        this.helper = helper;
        this.daysToKeepContentEvents = daysToKeepContentEvents;
        this.daysTokeepSynchronizationEvents = daysTokeepSynchronizationEvents;
    }

    public void run() {
        log.info("Running lucene event cleanup task");
        for (File contentSetFile : list(helper.getEventDirectory())) {
            long contentSetId = Long.parseLong(contentSetFile.getName());
            for (File index : list(contentSetFile)) {
                if (index.getName().equals("synchronizations")) {
                    cleanupSynchronizations(contentSetId, index.getName());
                } else {
                    cleanupDetails(contentSetId, index.getName());
                }
            }
        }
    }

    private File[] list(File dir) {
        File[] files = dir.listFiles();
        if (files == null) {
            return new File[] {};
        }
        return files;
    }

    private void cleanupSynchronizations(long contentSetId, String indexName) {
        cleanup(helper.getIndex(contentSetId, indexName), getSynchronizationEventCutoff());
    }

    private void cleanupDetails(long contentSetId, String indexName) {
        cleanup(helper.getIndex(contentSetId, indexName), getContentEventCutoff());
    }

    private void cleanup(Directory index, Date cutoff) {
        IndexReader reader = null;
        IndexWriter writer = null;
        try {
            if (DirectoryReader.indexExists(index)) {
                reader = DirectoryReader.open(index);
                writer = new IndexWriter(index, new IndexWriterConfig());
                writer.deleteDocuments(new MatchAllDocsQuery());
                writer.commit();
            }
        } catch (IOException ex) {
            log.error("Error cleaning up directory: " + index, ex);
        } finally {
            close(writer);
            close(reader);
        }
    }

    private Date getContentEventCutoff() {
        return getDate(daysToKeepContentEvents);
    }

    private Date getSynchronizationEventCutoff() {
        return getDate(daysTokeepSynchronizationEvents);
    }

    private Date getDate(Integer days) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - days);
        return calendar.getTime();
    }

    private void close(IndexWriter writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException ex) {
                log.error("Error closing IndexWriter", ex);
            }
        }
    }

    private void close(IndexReader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException ex) {
                log.error("Error closing IndexReader", ex);
            }
        }
    }
}
*/



/* old code

package com.solers.delivery.event.cleanup;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.FieldSelector;

import org.apache.lucene.document.FieldSelectorResult;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.search.HitCollector;
//import org.apache.lucene.search.Collector;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.store.Directory;

import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.lucene.SingleFieldSelector;
import com.solers.lucene.Converter;


public class LuceneEventCleanupTask implements Runnable {
    
    protected static final Logger log = Logger.getLogger(LuceneEventCleanupTask.class);
    
    private final LuceneHelper helper;
    private final Integer daysToKeepContentEvents;
    private final Integer daysTokeepSynchronizationEvents;
    
    public LuceneEventCleanupTask(LuceneHelper helper, Integer daysToKeepContentEvents, Integer daysTokeepSynchronizationEvents) {
        this.helper = helper;
        this.daysToKeepContentEvents = daysToKeepContentEvents;
        this.daysTokeepSynchronizationEvents = daysTokeepSynchronizationEvents;
    }

    public void run() {
        log.info("Running lucene event cleanup task");
        for (File contentSetFile : list(helper.getEventDirectory())) {
            long contentSetId = Long.parseLong(contentSetFile.getName());
            for (File index : list(contentSetFile)) {
                if (index.getName().equals("synchronizations")) {
                    cleanupSynchronizations(contentSetId, index.getName());
                } else {
                    cleanupDetails(contentSetId, index.getName());
                }
            }
        }
    }
    
    private File [] list(File dir) {
        File [] files = dir.listFiles();
        if (files == null) {
            return new File [] {};
        }
        return files;
    }
    
    private void cleanupSynchronizations(long contentSetId, String indexName) {
        cleanup(helper.getIndex(contentSetId, indexName), getSynchronizationEventCutoff());
    }
    
    private void cleanupDetails(long contentSetId, String indexName) {
        cleanup(helper.getIndex(contentSetId, indexName), getContentEventCutoff());
    }
    
    private void cleanup(Directory index, Date cutoff) {
        IndexReader reader = null;
        IndexSearcher searcher = null;
        try {
            if (!IndexWriter.isLocked(index) && IndexReader.indexExists(index)) {
                reader = IndexReader.open(index);
                searcher = new IndexSearcher(reader);
                searcher.search(new MatchAllDocsQuery(), new RemovingHitCollector(reader, cutoff));
            }
        } catch (IOException ex) {
            log.error("Error cleaning up directory: " + index, ex);
        } finally {
            LuceneHelper.close(searcher);
            LuceneHelper.close(reader);
        }
    }
    
    private Date getContentEventCutoff() {
        return getDate(daysToKeepContentEvents);
    }
    
    private Date getSynchronizationEventCutoff() {
        return getDate(daysTokeepSynchronizationEvents);
    }
    
    private Date getDate(Integer days) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - days);
        return calendar.getTime();
    }
    
    private static class RemovingHitCollector extends HitCollector 
    {
    
        private final IndexReader reader;
        private final FieldSelector selector;
        private final Date date;
        
        public RemovingHitCollector(IndexReader reader, Date date) {
            this.reader = reader;
            this.date = date;
            this.selector = new SingleFieldSelector("timeStamp", FieldSelectorResult.LOAD_AND_BREAK);
        }

        @Override
        public void collect(int docNum, float score) {
        try {
               Document doc = reader.document(docNum, selector);
               Date timestamp = (Date) Converter.DATE.convertFrom(doc.get("timeStamp"));
               if (timestamp != null && timestamp.before(date)) {
                   reader.deleteDocument(docNum);
               }
           } catch (IOException ex) {
               log.error("Error removing record in index: "+reader.directory(), ex);
           }
        }
        
    }
}
*/
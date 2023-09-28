package com.solers.delivery.event.listener;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.FieldSelector;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.HitCollector;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Searcher;
import org.apache.lucene.store.Directory;

import com.solers.delivery.content.status.ConsumerProgress;
import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.SynchronizationEvent;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.lucene.MultiFieldSelector;
import com.solers.delivery.lucene.QueryBuilder;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.delivery.reports.history.SynchronizationHistory;
import com.solers.jmx.MonitoredExecutorService;
import com.solers.lucene.DocumentCreator;
import com.solers.lucene.DocumentResult;

public class LuceneSupplierEventListener extends FlushingListener {
    
    protected static final Logger log = Logger.getLogger(LuceneSupplierEventListener.class);
    
    protected final LuceneHelper helper;
    protected final SynchronizationHistory history;
    protected final ExecutorService service;
    
    public LuceneSupplierEventListener(LuceneHelper helper, SynchronizationHistory history, int batchSize, int flushTime) {
        super(batchSize, flushTime);
        this.helper = helper;
        this.history = history;
        this.service = new MonitoredExecutorService(getClass().getSimpleName());
    }
    
    @Override
    public void received(ContentEvent event) {
        
    }
    
    @Override
    public void supplierSynchronizationCompleted(SynchronizationEvent event) {
        // Ensure that any pending content events are processed ahead of this event
        flush();
        service.submit(new SyncCompletedTask(event, helper, history));
    }

    @Override
    public void supplierSynchronizationStarted(SynchronizationEvent event) {
        event.setElapsedTime(System.currentTimeMillis());
        service.submit(new SyncStartedTask(event, helper));
    }
    
    @Override
    protected void flush(List<ContentEvent> events) {
        service.submit(new LuceneContentEventFlusher(helper, events));
    }
    
    private static class SyncStartedTask implements Runnable {
        private final SynchronizationEvent event;
        private final LuceneHelper helper;
        
        public SyncStartedTask(SynchronizationEvent event, LuceneHelper helper) {
            this.event = event;
            this.helper = helper;
        }

        public void run() {
            try {
                helper.addDocument(helper.getIndex(event.getContentSetId()), DocumentCreator.create(event));
            } catch (IOException ex) {
                log.error("An error occured", ex);
            } 
        }
    }
    
    private static class SyncCompletedTask implements Runnable {
        private final SynchronizationEvent event;
        private final LuceneHelper helper;
        private final SynchronizationHistory history;
        
        public SyncCompletedTask(SynchronizationEvent event, LuceneHelper helper, SynchronizationHistory history) {
            this.event = event;
            this.helper = helper;
            this.history = history;
        }

        public void run() {
            helper.optimizeIndex(event.getContentSetId(), event.getId());
            
            Synchronization sync = history.getSynchronization(event.getContentSetId(), event.getId());
            event.setElapsedTime(System.currentTimeMillis() - sync.getTimestamp());
            event.setProgress(calculateProgress());
            event.setTimestamp(sync.getTimestamp());
            event.setHost(sync.getHost());
            
            IndexWriter writer = null;
            try {
                writer = new IndexWriter(helper.getIndex(event.getContentSetId()), new StandardAnalyzer(), IndexWriter.MaxFieldLength.UNLIMITED);
                writer.deleteDocuments(new Term("id", event.getId()));
            } catch (IOException ex) {
                log.error("An error occured", ex);
            } finally {
                LuceneHelper.close(writer);
            }
            
            try {
                writer = new IndexWriter(helper.getIndex(event.getContentSetId()), new StandardAnalyzer(), IndexWriter.MaxFieldLength.UNLIMITED);
                DocumentResult r = DocumentCreator.create(event);
                writer.addDocument(r.getDocument(), r.getAnalyzer());
            } catch (IOException ex) {
                log.error("An error occured", ex);
            } finally {
                LuceneHelper.close(writer);
            }
            
            helper.optimizeIndex(event.getContentSetId());
            
            if (event.isEmpty()) {
                helper.removeIndex(event.getContentSetId(), event.getId());
            }
        }
        
        private ConsumerProgress calculateProgress() {
            ConsumerProgress progress = new ConsumerProgress();
            progress.initialize(0, 0);
            Directory index = helper.getIndex(event.getContentSetId(), event.getId());
            if (!helper.indexExists(index)) {
                return progress;
            }
            IndexReader r = null;
            Searcher s = null;
            try {
                r = IndexReader.open(index);
                s = new IndexSearcher(r);
                s.search(new QueryBuilder().toQuery(), new ProgressHitCollector(progress, r));
            } catch (IOException ex) {
                log.error("Error reading stats", ex);
            } finally {
                LuceneHelper.close(s);
                LuceneHelper.close(r);
            }
            return progress;
        }
    }
    
    private static class ProgressHitCollector extends HitCollector {

        private final ConsumerProgress progress;
        private final IndexReader reader;
        private final FieldSelector selector;
        
        public ProgressHitCollector(ConsumerProgress progress, IndexReader reader) {
            this.progress = progress;
            this.reader = reader;
            this.selector = new MultiFieldSelector("bytesRequested", "bytesFailed");
        }

        @Override
        public void collect(int docNum, float arg1) {
            try {
                Document doc = reader.document(docNum, selector);
                long bytes = Long.parseLong(doc.get("bytesRequested"));
                long failed = Long.parseLong(doc.get("bytesFailed"));
                
                progress.added(bytes, failed == 0);
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}


/* new code
package com.solers.delivery.event.listener;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
//import org.apache.lucene.document.FieldSelector;
import org.apache.lucene.document.StoredField; 
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.HitCollector;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Searcher;
import org.apache.lucene.store.Directory;

import com.solers.delivery.content.status.ConsumerProgress;
import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.SynchronizationEvent;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.lucene.MultiFieldSelector;
import com.solers.delivery.lucene.QueryBuilder;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.delivery.reports.history.SynchronizationHistory;
import com.solers.jmx.MonitoredExecutorService;
import com.solers.lucene.DocumentCreator;
import com.solers.lucene.DocumentResult;

public class LuceneSupplierEventListener extends FlushingListener {

    protected static final Logger log = Logger.getLogger(LuceneSupplierEventListener.class);

    protected final LuceneHelper helper;
    protected final SynchronizationHistory history;
    protected final ExecutorService service;

    public LuceneSupplierEventListener(LuceneHelper helper, SynchronizationHistory history, int batchSize, int flushTime) {
        super(batchSize, flushTime);
        this.helper = helper;
        this.history = history;
        this.service = new MonitoredExecutorService(getClass().getSimpleName());
    }

    @Override
    public void received(ContentEvent event) {

    }

    @Override
    public void supplierSynchronizationCompleted(SynchronizationEvent event) {
        // Ensure that any pending content events are processed ahead of this event
        flush();
        service.submit(new SyncCompletedTask(event, helper, history));
    }

    @Override
    public void supplierSynchronizationStarted(SynchronizationEvent event) {
        event.setElapsedTime(System.currentTimeMillis());
        service.submit(new SyncStartedTask(event, helper));
    }

    @Override
    protected void flush(List<ContentEvent> events) {
        service.submit(new LuceneContentEventFlusher(helper, events));
    }

    private static class SyncStartedTask implements Runnable {
        private final SynchronizationEvent event;
        private final LuceneHelper helper;

        public SyncStartedTask(SynchronizationEvent event, LuceneHelper helper) {
            this.event = event;
            this.helper = helper;
        }

        public void run() {
            try {
                helper.addDocument(helper.getIndex(event.getContentSetId()), DocumentCreator.create(event));
            } catch (IOException ex) {
                log.error("An error occurred", ex);
            }
        }
    }

    private static class SyncCompletedTask implements Runnable {
        private final SynchronizationEvent event;
        private final LuceneHelper helper;
        private final SynchronizationHistory history;

        public SyncCompletedTask(SynchronizationEvent event, LuceneHelper helper, SynchronizationHistory history) {
            this.event = event;
            this.helper = helper;
            this.history = history;
        }

        public void run() {
            helper.optimizeIndex(event.getContentSetId(), event.getId());

            Synchronization sync = history.getSynchronization(event.getContentSetId(), event.getId());
            event.setElapsedTime(System.currentTimeMillis() - sync.getTimestamp());
            event.setProgress(calculateProgress());
            event.setTimestamp(sync.getTimestamp());
            event.setHost(sync.getHost());

            IndexWriter writer = null;
            try {
                writer = new IndexWriter(helper.getIndex(event.getContentSetId()), new StandardAnalyzer());
                writer.deleteDocuments(new Term("id", event.getId()));
            } catch (IOException ex) {
                log.error("An error occurred", ex);
            } finally {
                LuceneHelper.close(writer);
            }

            try {
                writer = new IndexWriter(helper.getIndex(event.getContentSetId()), new StandardAnalyzer());
                DocumentResult r = DocumentCreator.create(event);
                writer.addDocument(r.getDocument());
            } catch (IOException ex) {
                log.error("An error occurred", ex);
            } finally {
                LuceneHelper.close(writer);
            }

            helper.optimizeIndex(event.getContentSetId());

            if (event.isEmpty()) {
                helper.removeIndex(event.getContentSetId(), event.getId());
            }
        }

        private ConsumerProgress calculateProgress() {
            ConsumerProgress progress = new ConsumerProgress();
            progress.initialize(0, 0);
            Directory index = helper.getIndex(event.getContentSetId(), event.getId());
            if (!helper.indexExists(index)) {
                return progress;
            }
            try (IndexReader reader = IndexReader.open(index);
                    Searcher searcher = new IndexSearcher(reader)) {
                Query query = new QueryBuilder().toQuery();
                searcher.search(query, new ProgressHitCollector(progress, reader));
            } catch (IOException ex) {
                log.error("Error reading stats", ex);
            }
            return progress;
        }
    }

    private static class ProgressHitCollector extends HitCollector {

        private final ConsumerProgress progress;
        private final IndexReader reader;
        private final FieldSelector selector;

        public ProgressHitCollector(ConsumerProgress progress, IndexReader reader) {
            this.progress = progress;
            this.reader = reader;
            this.selector = new MultiFieldSelector("bytesRequested", "bytesFailed");
        }

        @Override
        public void collect(int docNum, float arg1) {
            try {
                Document doc = reader.document(docNum, selector);
                long bytes = Long.parseLong(doc.get("bytesRequested"));
                long failed = Long.parseLong(doc.get("bytesFailed"));

                progress.added(bytes, failed == 0);
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

*/



/* old code

package com.solers.delivery.event.listener;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.FieldSelector;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.HitCollector;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Searcher;
import org.apache.lucene.store.Directory;

import com.solers.delivery.content.status.ConsumerProgress;
import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.SynchronizationEvent;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.lucene.MultiFieldSelector;
import com.solers.delivery.lucene.QueryBuilder;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.delivery.reports.history.SynchronizationHistory;
import com.solers.jmx.MonitoredExecutorService;
import com.solers.lucene.DocumentCreator;
import com.solers.lucene.DocumentResult;

public class LuceneSupplierEventListener extends FlushingListener {
    
    protected static final Logger log = Logger.getLogger(LuceneSupplierEventListener.class);
    
    protected final LuceneHelper helper;
    protected final SynchronizationHistory history;
    protected final ExecutorService service;
    
    public LuceneSupplierEventListener(LuceneHelper helper, SynchronizationHistory history, int batchSize, int flushTime) {
        super(batchSize, flushTime);
        this.helper = helper;
        this.history = history;
        this.service = new MonitoredExecutorService(getClass().getSimpleName());
    }
    
    @Override
    public void received(ContentEvent event) {
        
    }
    
    @Override
    public void supplierSynchronizationCompleted(SynchronizationEvent event) {
        // Ensure that any pending content events are processed ahead of this event
        flush();
        service.submit(new SyncCompletedTask(event, helper, history));
    }

    @Override
    public void supplierSynchronizationStarted(SynchronizationEvent event) {
        event.setElapsedTime(System.currentTimeMillis());
        service.submit(new SyncStartedTask(event, helper));
    }
    
    @Override
    protected void flush(List<ContentEvent> events) {
        service.submit(new LuceneContentEventFlusher(helper, events));
    }
    
    private static class SyncStartedTask implements Runnable {
        private final SynchronizationEvent event;
        private final LuceneHelper helper;
        
        public SyncStartedTask(SynchronizationEvent event, LuceneHelper helper) {
            this.event = event;
            this.helper = helper;
        }

        public void run() {
            try {
                helper.addDocument(helper.getIndex(event.getContentSetId()), DocumentCreator.create(event));
            } catch (IOException ex) {
                log.error("An error occured", ex);
            } 
        }
    }
    
    private static class SyncCompletedTask implements Runnable {
        private final SynchronizationEvent event;
        private final LuceneHelper helper;
        private final SynchronizationHistory history;
        
        public SyncCompletedTask(SynchronizationEvent event, LuceneHelper helper, SynchronizationHistory history) {
            this.event = event;
            this.helper = helper;
            this.history = history;
        }

        public void run() {
            helper.optimizeIndex(event.getContentSetId(), event.getId());
            
            Synchronization sync = history.getSynchronization(event.getContentSetId(), event.getId());
            event.setElapsedTime(System.currentTimeMillis() - sync.getTimestamp());
            event.setProgress(calculateProgress());
            event.setTimestamp(sync.getTimestamp());
            event.setHost(sync.getHost());
            
            IndexWriter writer = null;
            try {
                writer = new IndexWriter(helper.getIndex(event.getContentSetId()), new StandardAnalyzer(), IndexWriter.MaxFieldLength.UNLIMITED);
                writer.deleteDocuments(new Term("id", event.getId()));
            } catch (IOException ex) {
                log.error("An error occured", ex);
            } finally {
                LuceneHelper.close(writer);
            }
            
            try {
                writer = new IndexWriter(helper.getIndex(event.getContentSetId()), new StandardAnalyzer(), IndexWriter.MaxFieldLength.UNLIMITED);
                DocumentResult r = DocumentCreator.create(event);
                writer.addDocument(r.getDocument(), r.getAnalyzer());
            } catch (IOException ex) {
                log.error("An error occured", ex);
            } finally {
                LuceneHelper.close(writer);
            }
            
            helper.optimizeIndex(event.getContentSetId());
            
            if (event.isEmpty()) {
                helper.removeIndex(event.getContentSetId(), event.getId());
            }
        }
        
        private ConsumerProgress calculateProgress() {
            ConsumerProgress progress = new ConsumerProgress();
            progress.initialize(0, 0);
            Directory index = helper.getIndex(event.getContentSetId(), event.getId());
            if (!helper.indexExists(index)) {
                return progress;
            }
            IndexReader r = null;
            Searcher s = null;
            try {
                r = IndexReader.open(index);
                s = new IndexSearcher(r);
                s.search(new QueryBuilder().toQuery(), new ProgressHitCollector(progress, r));
            } catch (IOException ex) {
                log.error("Error reading stats", ex);
            } finally {
                LuceneHelper.close(s);
                LuceneHelper.close(r);
            }
            return progress;
        }
    }
    
    private static class ProgressHitCollector extends HitCollector {

        private final ConsumerProgress progress;
        private final IndexReader reader;
        private final FieldSelector selector;
        
        public ProgressHitCollector(ConsumerProgress progress, IndexReader reader) {
            this.progress = progress;
            this.reader = reader;
            this.selector = new MultiFieldSelector("bytesRequested", "bytesFailed");
        }

        @Override
        public void collect(int docNum, float arg1) {
            try {
                Document doc = reader.document(docNum, selector);
                long bytes = Long.parseLong(doc.get("bytesRequested"));
                long failed = Long.parseLong(doc.get("bytesFailed"));
                
                progress.added(bytes, failed == 0);
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
*/
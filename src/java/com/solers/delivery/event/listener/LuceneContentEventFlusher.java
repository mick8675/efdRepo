package com.solers.delivery.event.listener;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriter;

import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.ContentEventComparator;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.lucene.DocumentCreator;
import com.solers.lucene.DocumentResult;


public class LuceneContentEventFlusher implements Runnable {
    
    private static final Logger log = Logger.getLogger(LuceneContentEventFlusher.class);
    private static final Comparator<ContentEvent> SORTER = new ContentEventComparator();
    
    private final LuceneHelper helper;
    private final List<ContentEvent> events;
    private final StackTraceElement [] stack;
    
    public LuceneContentEventFlusher(LuceneHelper helper, List<ContentEvent> events) {
        this.helper = helper;
        this.events = events;
        this.stack = Thread.currentThread().getStackTrace();
    }
    public void run() {
        Collections.sort(events, SORTER);
        
        IndexWriter writer = null;
        String id = "";
        try {
            for (ContentEvent event : events) {
                if (!id.equals(event.getSynchronizationId())) {
                    LuceneHelper.close(writer);
                    id = event.getSynchronizationId();
                    writer = new IndexWriter(helper.getIndex(event.getContentSetId(), event.getSynchronizationId()), new StandardAnalyzer(), IndexWriter.MaxFieldLength.UNLIMITED);
                }
                handle(writer, event);
            }
        } catch (IOException ex) {
            log.error("An error occured", ex);
            Exception t = new Exception();
            t.setStackTrace(stack);
            log.error("Originating stack", t);
        } finally {
            LuceneHelper.close(writer);
        }
    }
    
    protected void handle(IndexWriter writer, ContentEvent event) throws IOException {
        DocumentResult r = DocumentCreator.create(event);
        writer.addDocument(r.getDocument(), r.getAnalyzer());
    }
}


/*new code
package com.solers.delivery.event.listener;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;

import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.ContentEventComparator;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.lucene.DocumentCreator;
import com.solers.lucene.DocumentResult;

public class LuceneContentEventFlusher implements Runnable {

    private static final Logger log = Logger.getLogger(LuceneContentEventFlusher.class);
    private static final Comparator<ContentEvent> SORTER = new ContentEventComparator();

    private final LuceneHelper helper;
    private final List<ContentEvent> events;
    private final StackTraceElement[] stack;

    public LuceneContentEventFlusher(LuceneHelper helper, List<ContentEvent> events) {
        this.helper = helper;
        this.events = events;
        this.stack = Thread.currentThread().getStackTrace();
    }

    public void run() {
        Collections.sort(events, SORTER);

        IndexWriter writer = null;
        String id = "";
        try {
            for (ContentEvent event : events) {
                if (!id.equals(event.getSynchronizationId())) {
                    close(writer);
                    id = event.getSynchronizationId();
                    writer = createIndexWriter(event);
                }
                handle(writer, event);
            }
        } catch (IOException ex) {
            log.error("An error occurred", ex);
            Exception t = new Exception();
            t.setStackTrace(stack);
            log.error("Originating stack", t);
        } finally {
            close(writer);
        }
    }

    protected IndexWriter createIndexWriter(ContentEvent event) throws IOException {
        IndexWriterConfig config = new IndexWriterConfig(new StandardAnalyzer());
        config.setOpenMode(OpenMode.CREATE_OR_APPEND);
        return new IndexWriter(helper.getIndex(event.getContentSetId(), event.getSynchronizationId()), config);
    }

    protected void handle(IndexWriter writer, ContentEvent event) throws IOException {
        DocumentResult r = DocumentCreator.create(event);
        writer.addDocument(r.getDocument());
    }

    protected void close(IndexWriter writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException ex) {
                log.error("Error closing IndexWriter", ex);
            }
        }
    }
}

*/




/* old code
package com.solers.delivery.event.listener;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriter;

import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.ContentEventComparator;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.lucene.DocumentCreator;
import com.solers.lucene.DocumentResult;


public class LuceneContentEventFlusher implements Runnable {
    
    private static final Logger log = Logger.getLogger(LuceneContentEventFlusher.class);
    private static final Comparator<ContentEvent> SORTER = new ContentEventComparator();
    
    private final LuceneHelper helper;
    private final List<ContentEvent> events;
    private final StackTraceElement [] stack;
    
    public LuceneContentEventFlusher(LuceneHelper helper, List<ContentEvent> events) {
        this.helper = helper;
        this.events = events;
        this.stack = Thread.currentThread().getStackTrace();
    }
    public void run() {
        Collections.sort(events, SORTER);
        
        IndexWriter writer = null;
        String id = "";
        try {
            for (ContentEvent event : events) {
                if (!id.equals(event.getSynchronizationId())) {
                    LuceneHelper.close(writer);
                    id = event.getSynchronizationId();
                    writer = new IndexWriter(helper.getIndex(event.getContentSetId(), event.getSynchronizationId()), new StandardAnalyzer(), IndexWriter.MaxFieldLength.UNLIMITED);
                }
                handle(writer, event);
            }
        } catch (IOException ex) {
            log.error("An error occured", ex);
            Exception t = new Exception();
            t.setStackTrace(stack);
            log.error("Originating stack", t);
        } finally {
            LuceneHelper.close(writer);
        }
    }
    
    protected void handle(IndexWriter writer, ContentEvent event) throws IOException {
        DocumentResult r = DocumentCreator.create(event);
        writer.addDocument(r.getDocument(), r.getAnalyzer());
    }
}
*/
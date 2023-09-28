package com.solers.delivery.rest.reports;

import java.util.Date;
import java.util.List;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.delivery.reports.history.SynchronizationHistory;
import com.solers.delivery.rest.Utils;


public class HistoryDetailsResource extends HistoryResource {
    
    private String detailsId;
    
    public HistoryDetailsResource(ContentService service, SynchronizationHistory history) {
        super(service, history);
    }
    
    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        this.detailsId = Utils.findString(request, response, "detailsId");
    }

    @Override
    protected List<?> data(Date startTime, Date endTime, int max, boolean showAll) {
        Synchronization sync = history.getSynchronization(id, detailsId);
        if (sync == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
            return null;
        }
        return history.getSynchronizationDetails(id, detailsId, null, null, SynchronizationHistory.PAGE_SIZE);
    }
}

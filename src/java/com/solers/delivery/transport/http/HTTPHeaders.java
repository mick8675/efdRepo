package com.solers.delivery.transport.http;

import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpHeaderValue;

public enum HTTPHeaders 
{

    // Request Custom Headers
    CONTENT_SET_NAME("ContentSetName", "-1", true), 
    GBS_RETRIEVAL("GBS", "true", true), 
    INVENTORY_TIMESTAMP("LastKnownInventory", "0", true),
    SYNC_ID("SyncId", "0", true),
    
    // Request Standard Headers
    USER_AGENT("User-Agent", "EFD/2.2", false),
    RANGE(HttpHeader.RANGE.toString(), "0", false), 
    ACCEPT_ENCODING("Accept-Encoding", HttpHeaderValue.GZIP.asString(), false),
    
    // Response Standard Headers
    CONTENT_RANGE(HttpHeader.CONTENT_RANGE.toString(), "0-", false), 
    CONTENT_LENGTH(HttpHeader.CONTENT_LENGTH.toString(), "0", false), 
    CONTENT_ENCODING(HttpHeader.CONTENT_ENCODING.toString(), HttpHeaderValue.GZIP.asString(), false),
    DATE(HttpHeader.DATE.toString(), "", false);
    
    public static final String CUSTOM_HEADER_PREFIX = "X-EFD-";

    private final String headerName;
    private final String defaultValue;

    HTTPHeaders(String headerName, String defaultValue, boolean custom) {
        this.headerName = custom ? CUSTOM_HEADER_PREFIX + headerName : headerName;
        this.defaultValue = defaultValue;
    }

    public String headerName() {
        return headerName;
    }

    public String defaultValue() {
        return defaultValue;
    }
}


/*original code

package com.solers.delivery.transport.http;

import org.mortbay.jetty.HttpHeaderValues;
import org.mortbay.jetty.HttpHeaders;

public enum HTTPHeaders {

    // Request Custom Headers
    CONTENT_SET_NAME("ContentSetName", "-1", true), 
    GBS_RETRIEVAL("GBS", "true", true), 
    INVENTORY_TIMESTAMP("LastKnownInventory", "0", true),
    SYNC_ID("SyncId", "0", true),
    
    // Request Standard Headers
    USER_AGENT("User-Agent", "EFD/2.2", false),
    RANGE(HttpHeaders.RANGE, "0", false), 
    ACCEPT_ENCODING("Accept-Encoding", HttpHeaderValues.GZIP, false),
    
    // Response Standard Headers
    CONTENT_RANGE(HttpHeaders.CONTENT_RANGE, "0-", false), 
    CONTENT_LENGTH(HttpHeaders.CONTENT_LENGTH, "0", false), 
    CONTENT_ENCODING(HttpHeaders.CONTENT_ENCODING, HttpHeaderValues.GZIP, false),
    DATE(HttpHeaders.DATE, "", false);
    
    public static final String CUSTOM_HEADER_PREFIX = "X-EFD-";

    private final String headerName;
    private final String defaultValue;

    HTTPHeaders(String headerName, String defaultValue, boolean custom) {
        this.headerName = custom ? CUSTOM_HEADER_PREFIX + headerName : headerName;
        this.defaultValue = defaultValue;
    }

    public String headerName() {
        return headerName;
    }

    public String defaultValue() {
        return defaultValue;
    }
}
*/
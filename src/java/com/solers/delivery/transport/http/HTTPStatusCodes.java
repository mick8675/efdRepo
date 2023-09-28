package com.solers.delivery.transport.http;

import org.eclipse.jetty.http.HttpStatus;

public enum HTTPStatusCodes {

    OK(HttpStatus.OK_200, "The request succeeded normally"), 
    OK_PARTIAL(HttpStatus.PARTIAL_CONTENT_206, "The request succeeded normally"),
    OK_NOT_MODIFIED(HttpStatus.NOT_MODIFIED_304, "The request succeeded; the resource has not been modified."),
    UNKNOWN_CONTENT_SET_NAME(HttpStatus.PRECONDITION_FAILED_412, "The content set name provided does not map to an existing content set"), 
    DISABLED_CONTENT_SET(HttpStatus.FORBIDDEN_403, "The content set name provided is currently disabled"),
    GBS_DELIVERY(HttpStatus.ACCEPTED_202, "The file has been queued for delivery via GBS"),
    UNSUPPORTED_METHOD(HttpStatus.METHOD_NOT_ALLOWED_405, "The HTTP method received is not supported"), 
    NO_CONTENT_SET_NAME(HttpStatus.BAD_REQUEST_400, "No content set name header has been provided"), 
    NOT_FOUND(HttpStatus.NOT_FOUND_404, "The requested file could not be found"), 
    NOT_READABLE(HttpStatus.FORBIDDEN_403, "The requested file is not readable"), 
    ACCESS_DENIED(HttpStatus.UNAUTHORIZED_401, "You do not have permission to access the requested content set"),
    NOT_FILE(HttpStatus.FORBIDDEN_403, "The requested file is a directory"),
    UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE_503, "The requested supplier is not ready (no inventory bundles available)"),
    UNKNOWN(-1, "Unknown response");

    private final int code;
    private final String message;

    HTTPStatusCodes(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
    
    public static HTTPStatusCodes fromCode(int code) {
        for (HTTPStatusCodes value : HTTPStatusCodes.values()) {
            if (value.code() == code) {
                return value;
            }
        }
        
        return UNKNOWN;
    }
}




/*original code 
package com.solers.delivery.transport.http;

import org.mortbay.jetty.Response;

public enum HTTPStatusCodes {

    OK(Response.SC_OK, "The request succeeded normally"), 
    OK_PARTIAL(Response.SC_PARTIAL_CONTENT, "The request succeeded normally"),
    OK_NOT_MODIFIED(Response.SC_NOT_MODIFIED, "The request succeeded; the resource has not been modified."),
    // Status code (412) indicating that the precondition given in one or more of the request-header fields evaluated to false when it was tested on the server.
    UNKNOWN_CONTENT_SET_NAME(Response.SC_PRECONDITION_FAILED, "The content set name provided does not map to an existing content set"), 
    DISABLED_CONTENT_SET(Response.SC_FORBIDDEN, "The content set name provided is currently disabled"),
    // Status code (202) indicating that a request was accepted for processing, but was not completed.
    GBS_DELIVERY(Response.SC_ACCEPTED, "The file has been queued for delivery via GBS"),
    UNSUPPORTED_METHOD(Response.SC_METHOD_NOT_ALLOWED, "The HTTP method received is not supported"), 
    NO_CONTENT_SET_NAME(Response.SC_BAD_REQUEST, "No content set name header has been provided"), 
    NOT_FOUND(Response.SC_NOT_FOUND, "The requested file could not be found"), 
    NOT_READABLE(Response.SC_FORBIDDEN, "The requested file is not readable"), 
    ACCESS_DENIED(Response.SC_UNAUTHORIZED, "You do not have permission to access the requested content set"),
    NOT_FILE(Response.SC_FORBIDDEN, "The requested file is a directory"),
    UNAVAILABLE(Response.SC_SERVICE_UNAVAILABLE, "The requested supplier is not ready (no inventory bundles available)"),
    UNKNOWN(-1, "Unknown response");

    private final int code;
    private final String message;

    HTTPStatusCodes(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
    
    public static HTTPStatusCodes fromCode(int code) {
        for (HTTPStatusCodes value : HTTPStatusCodes.values()) {
            if (value.code() == code) {
                return value;
            }
        }
        
        return UNKNOWN;
    }

}
*/
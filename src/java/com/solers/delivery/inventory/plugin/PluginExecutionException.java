/****************************************************************
 *
 * Solers, Inc. as the author of Enterprise File Delivery 2.1 (EFD 2.1)
 * source code submitted herewith to the Government under contract
 * retains those intellectual property rights as set forth by the Federal 
 * Acquisition Regulations agreement (FAR). The Government has 
 * unlimited rights to redistribute copies of the EFD 2.1 in 
 * executable or source format to support operational installation 
 * and software maintenance. Additionally, the executable or 
 * source may be used or modified for by third parties as 
 * directed by the government.
 *
 * (c) 2009 Solers, Inc.
 ***********************************************************/
package com.solers.delivery.inventory.plugin;

public class PluginExecutionException extends PluginException {
    private static final long serialVersionUID = 1L;

    public PluginExecutionException(String message) {
        super(message);
    }
    
    public PluginExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public PluginExecutionException(Throwable cause) {
        super(cause);
    }
}

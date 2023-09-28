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
package com.solers.delivery.transport.gbs;

import java.io.File;

import com.solers.delivery.domain.ContentSet;
/**
 * GBS Service interface
 */
public interface GBSService extends Runnable {
    public void addContentSet(ContentSet contentSet);
    public void removeContentSet(Long id);
    public void startContentSet(Long id);
    public void stopContentSet(Long id);
    public void addFile(String consumerContentSet, String syncKey, String supplierContentSet,
                        String host, File file, String path);
}

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
package com.solers.delivery.install;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import com.solers.delivery.web.combine.Combiner;

/**
 * @author <a href="mailto:kevin.conaway@solers.com">Kevin Conaway</a>
 */
public class CombineTask extends Task {
    
    private String root;
    private String file;
    
    public void setRoot(String root) {
        this.root = root;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public void execute() throws BuildException {
        File root = new File(this.root);
        File file = new File(this.file);
        Combiner combiner = new Combiner(root);
        try {
            combiner.combine(file, file);
        } catch (Exception ex) {
            throw new BuildException(ex);
        }
    }
    
}

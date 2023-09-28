/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.security;

import java.io.FileDescriptor;
import java.security.Permission;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class ScriptingSecurityManagerIT {
    
    public ScriptingSecurityManagerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkPermission method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckPermission_Permission() {
        System.out.println("checkPermission");
        Permission perm = null;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkPermission(perm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPermission method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckPermission_Permission_Object() {
        System.out.println("checkPermission");
        Permission perm = null;
        Object context = null;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkPermission(perm, context);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAccept method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckAccept() {
        System.out.println("checkAccept");
        String hostIP = "";
        int port = 0;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkAccept(hostIP, port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkConnect method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckConnect_String_int() {
        System.out.println("checkConnect");
        String hostIP = "";
        int port = 0;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkConnect(hostIP, port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkConnect method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckConnect_3args() {
        System.out.println("checkConnect");
        String hostIP = "";
        int port = 0;
        Object context = null;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkConnect(hostIP, port, context);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkListen method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckListen() {
        System.out.println("checkListen");
        int port = 0;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkListen(port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkExit method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckExit() {
        System.out.println("checkExit");
        int status = 0;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkExit(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkExec method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckExec() {
        System.out.println("checkExec");
        String cmd = "";
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkExec(cmd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRead method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckRead_FileDescriptor() {
        System.out.println("checkRead");
        FileDescriptor fd = null;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkRead(fd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDelete method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckDelete() {
        System.out.println("checkDelete");
        String file = "";
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkDelete(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRead method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckRead_String() {
        System.out.println("checkRead");
        String file = "";
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkRead(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRead method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckRead_String_Object() {
        System.out.println("checkRead");
        String file = "";
        Object context = null;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkRead(file, context);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkWrite method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckWrite_FileDescriptor() {
        System.out.println("checkWrite");
        FileDescriptor fd = null;
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkWrite(fd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkWrite method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckWrite_String() {
        System.out.println("checkWrite");
        String file = "";
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkWrite(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkClassContext method, of class ScriptingSecurityManager.
     */
    @Test
    public void testCheckClassContext() {
        System.out.println("checkClassContext");
        ScriptingSecurityManager instance = new ScriptingSecurityManager();
        instance.checkClassContext();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author banyu
 */
public class CProfileIT {
    
    public CProfileIT() {
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
     * Test of actionPerformed method, of class CProfile.
     */
//    @Test
//    public void testActionPerformed() {
//        System.out.println("actionPerformed");
//        ActionEvent e = null;
//        CProfile instance = new CProfile();
//        instance.actionPerformed(e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of toMainMenuRektor method, of class CProfile.
     */
    @Test
    public void testToMainMenuRektor() {
        System.out.println("toMainMenuRektor");
        CProfile instance = new CProfile();
        instance.toMainMenuRektor();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

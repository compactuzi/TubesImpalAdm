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
public class CMMRIT {
    
    public CMMRIT() {
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
     * Test of actionPerformed method, of class CMMR.
     */
//    @Test
//    public void testActionPerformed() {
//        System.out.println("actionPerformed");
//        ActionEvent e = null;
//        CMMR instance = null;
//        instance.actionPerformed(e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of toProfile method, of class CMMR.
     */
    @Test
    public void testToProfile() {
        System.out.println("toProfile");
        CMMR instance = new CMMR("");
        instance.toProfile();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toData method, of class CMMR.
     */
    @Test
    public void testToData() {
        System.out.println("toData");
        CMMR instance = new CMMR("");
        instance.toData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toLogin method, of class CMMR.
     */
    @Test
    public void testToLogin() {
        System.out.println("toLogin");
        CMMR instance = new CMMR("");
        instance.toLogin();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

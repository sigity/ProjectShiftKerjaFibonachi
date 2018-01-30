/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sigit Yudhianto
 */
public class HariTest {
    
    public HariTest() {
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
     * Test of MFibonacci method, of class Hari.
     */
    @org.junit.Test
    public void testMFibonacci() {
        System.out.println("MFibonacci");
        int n = 6;
        Hari instance = new Hari();
        int expResult = 8;
        int result = instance.MFibonacci(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of HitungHari method, of class Hari.
     */
    @org.junit.Test
    public void testHitungHari() {
        System.out.println("HitungHari");
        Hari instance = new Hari();
        int hari =100;
        assertEquals(11,instance.HitungHari(hari).size());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

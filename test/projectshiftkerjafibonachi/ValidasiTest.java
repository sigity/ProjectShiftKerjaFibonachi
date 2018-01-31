/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ValidasiTest {
    
    public ValidasiTest() {
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
     * Test of validasiHari method, of class Validasi.
     */
    @Test
    public void testValidasiHari() throws Exception {
        System.out.println("validasiHari");
        int jmInteger = 120;
//        boolean expResult = false;
        boolean result = Validasi.validasiHari(jmInteger);
        assertEquals(true, result);
    }

    /**
     * Test of validasiPekerja method, of class Validasi.
     */
    @Test
    public void testValidasiPekerja() throws Exception {
        System.out.println("validasiPekerja");
        int jmlpekerja = 4;
//        boolean expResult = false;
        boolean result = Validasi.validasiPekerja(jmlpekerja);
        assertEquals(true, result);
    }
    
}

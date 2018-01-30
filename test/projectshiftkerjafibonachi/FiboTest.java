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
public class FiboTest {
    
    public FiboTest() {
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
     * Test of methodFibonacci method, of class Fibo.
     */
    @Test
    public void testMethodFibonacci() {
        System.out.println("methodFibonacci");
        int n = 0;
        Fibo instance = new Fibo();
        int expResult = 0;
        int result = instance.methodFibonacci(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hitung method, of class Fibo.
     */
    @Test
    public void testHitung() {
        System.out.println("Hitung");
        int hari = 0;
        Fibo instance = new Fibo();
        List expResult = null;
        List result = instance.Hitung(hari);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegawai method, of class Fibo.
     */
    @Test
    public void testPegawai() {
        System.out.println("pegawai");
        int jmlpegawai = 0;
        Fibo instance = new Fibo();
        List expResult = null;
        List result = instance.pegawai(jmlpegawai);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Fibo.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        List<String> nm = null;
        List<Integer> hr = null;
        int jmlpekerja = 0;
        Fibo instance = new Fibo();
        instance.print(nm, hr, jmlpekerja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Fibo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fibo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

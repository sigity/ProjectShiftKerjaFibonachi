/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.util.List;
import javax.swing.JTable;
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
public class PekerjaTest {
    
    public PekerjaTest() {
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
     * Test of HitungPekerja method, of class Pekerja.
     */
    @Test
    public void testHitungPekerja() throws Exception {
        System.out.println("HitungPekerja");
        int jmlpekerja = 4;
        Pekerja instance = new Pekerja();
        List nmpekerja = instance.HitungPekerja(jmlpekerja);
        assertEquals(4, nmpekerja.size());
    }

    /**
     * Test of print method, of class Pekerja.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        List<String> nm = null;
        List<Integer> hr = null;
        int jmlpekerja = 0;
        JTable jTable = null;
        Pekerja instance = new Pekerja();
        instance.print(nm, hr, jmlpekerja, jTable);
    }
    
}

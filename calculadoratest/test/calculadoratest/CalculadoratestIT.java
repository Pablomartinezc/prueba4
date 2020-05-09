/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iot19
 */
public class CalculadoratestIT {
    private Calculadoratest calcu;
    
    public CalculadoratestIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void crearcalculadora() {
        calcu = new Calculadoratest(20,10);
    }
    
    @After
    public void cerrarCalculadora() {
         calcu = null;
    }

    /**
     * Test of suma method, of class Calculadoratest.
     */
    @Test
    public void testSuma() {
        
        
        int expResult = 30;
        int result = calcu.suma();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of resta method, of class Calculadoratest.
     */
    @Test
    public void testResta() {
        
        int expResult = 10;
        int result = calcu.resta();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of resta2 method, of class Calculadoratest.
     */
    @Test
    public void testResta2() {
        
        assertTrue(true);
    }

    /**
     * Test of multiplica method, of class Calculadoratest.
     */
    @Test
    public void testMultiplica() {
        
        int expResult = 200;
        int result = calcu.multiplica();
        assertEquals(expResult, result);
    }

    

    /**
     * Test of divide2 method, of class Calculadoratest.
     */
    @Test
    public void testDivide2() {
        
        int expResult = 2;
        int result = calcu.divide2();
        assertEquals(expResult, result);
        assertNotNull("El segundo numero no puede ser 0 ",result);
    }

    /**
     * Test of divide method, of class Calculadoratest.
     */
    /*@Test
    public void testDivide() {
        System.out.println("divide");
        Calculadoratest instance = null;
        int expResult = 0;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of divide0 method, of class Calculadoratest.
     */
    /*@Test (expected = java.lang.ArithmeticException.class)
    public void Divide0(){
        Calculadoratest calcu = new Calculadoratest (20,0);
        int result = calcu.divide0();
    }*/
    

    /**
     * Test of main method, of class Calculadoratest.
     */
    

    
    
}

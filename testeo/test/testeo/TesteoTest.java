/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class TesteoTest {
    
   
    /**
     * Test of suma method, of class Testeo.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        float primerSumando = 4F;
        float segundoSumando = 3F;
        Testeo instance = new Testeo();
        float expResult = 7F;
        float result = instance.suma(primerSumando, segundoSumando);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

import static org.testng.Assert.*;

/**
 *
 * @author pc-asus
 */
public class AnimalsNGTest {
    
    public AnimalsNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of deplacer method, of class Animals.
     */
    @org.testng.annotations.Test
    public void testDeplacer() {
        System.out.println("deplacer");
        Animals instance = new Animals();
        instance.deplacer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

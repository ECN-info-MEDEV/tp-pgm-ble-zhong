/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uble
 */
public class UtilsTest {
   
   public UtilsTest() {
   }
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }

   /**
    * Test of concatWords method, of class Utils.
    */
   @Test
   public void testConcatWords() {
      System.out.println("concatWords");
      String[] words = null;
      assertEquals(  "", Utils.concatWords(words));
      String[] words2 = {"o","k"};
      assertEquals(  "ok", Utils.concatWords(words2));
     
      System.out.println("concatWords");
      assertEquals("Hello, world!", Utils.concatWords(new String[]{"Hello", ", ", "world", "!"}));

   }
   
   

   /**
    * Test of computeFactorial method, of class Utils.
    */
   
   @Test (expected=IllegalArgumentException.class)
public void checkExpectedException() {
System.out.println("checkExpectedException");
final int factorialOf = -5;
System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
}


   
}

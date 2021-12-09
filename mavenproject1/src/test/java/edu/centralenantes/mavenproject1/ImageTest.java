/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.mavenproject1;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author uble
 */
public class ImageTest {
   
   public ImageTest() {
   }
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }

   

   

   /**
    * Test of lire method, of class Image.
    */
   @Test
   public void testLire() {
      System.out.println("lire");
      String file_name = "coins.pgm";
      Image instance = new Image();
      instance.lire(file_name);
      assertEquals(instance.getImage()[0][0],49);
   }

   /**
    * Test of seuillage method, of class Image.
    */
   
   @Test
   public void testSeuillage() {
      System.out.println("seuillage");
      String file_name = "coins.pgm";
      Image instance = new Image();
      instance.lire(file_name);
      Image img = new Image();
      img.lire(file_name);
      int expResult = 0;
      int result = instance.seuillage(img);
      assertEquals(expResult, result);
      
      //TEst avec un pixel modif
      String file_modif ="coins_modif.pgm";
      Image img_modif = new Image();
      img_modif.lire(file_modif);
      assertEquals(1,instance.seuillage(img_modif));
      
      //Test taille différente
      String file_taille ="coins_taille_dif.pgm";
      Image img_taille = new Image();
      img_taille.lire(file_taille);
      assertEquals(-1,instance.seuillage(img_taille));
      
   }

   /**
    * Test of difference method, of class Image.
    */
   @Test
   public void testDifference() {
      System.out.println("difference");
      System.out.println("seuillage");
      String file_name = "coins.pgm";
      Image instance = new Image();
      instance.lire(file_name);
      Image img = new Image();
      img.lire(file_name);
      int expResult = 0;
      Image result = instance.difference(img);
      assertEquals(expResult, result.getImage()[0][0]);
      
      //Test avec diff
      String file_modif ="coins_modif.pgm";
      Image img_modif = new Image();
      img_modif.lire(file_modif);
      result=instance.difference(img_modif);
      assertEquals(1,result.getImage()[0][0]);
      
      //Test avec une image de taille différente
      String file_taille ="coins_taille_dif.pgm";
      Image img_taille = new Image();
      img_taille.lire(file_taille);
      result=instance.difference(img_taille);
      assertEquals(instance.getImage()[0][0],result.getImage()[0][0]);
   }

   /**
    * Test of getFiveInt method, of class Image.
    */
   @Ignore
   @Test
   public void testGetFiveInt() {
      System.out.println("getFiveInt");
      Image instance = new Image();
      ArrayList<Integer> expResult = null;
      ArrayList<Integer> result = instance.getFiveInt();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of histo method, of class Image.
    */
   @Ignore
   @Test
   public void testHisto() {
      System.out.println("histo");
      ArrayList<Integer> l1 = null;
      Image instance = new Image();
      instance.histo(l1);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.switchtest;

/**
 *
 * @author uble
 */
public class SwitchTest {

   /**
    * @param args
    */
   public static void main(String[] args) {
      String color = "red";
      String colorRGB;
      colorRGB = switch (color) {
         case "black" -> "000000";
         case "red" -> "ff0000";
         case "green" -> "008000";
         case "blue" -> "0000ff";
         default -> "Invalid color";
      };
      System.out.println(colorRGB);
   }
}

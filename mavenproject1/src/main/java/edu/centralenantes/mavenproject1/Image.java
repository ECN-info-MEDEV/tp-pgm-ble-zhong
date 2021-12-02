/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.mavenproject1;

/**
 *
 * @author uble
 */
public class Image {
   private int[][] image;
    public void histo(int x) {
        System.out.println("Histogram:\n");
        int array[] = { 0, 0, 0, 0, 0 };

        String output = "Value\tHistogram";

        for (int counter = 0; counter < array.length; counter++) {
            output += "\n" + array[counter] + "\t";

            for (int stars = 0; stars < array[counter]; stars++) {
                output += "*";
            }
        }
        System.out.println(output);
    }

}

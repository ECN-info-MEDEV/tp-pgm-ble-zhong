/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.mavenproject1;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author uble
 */
public class Image {
   private int[][] image;
   private int max;

   public int[][] getImage() {
      return image;
   }

   public void setImage(int[][] image) {
      this.image = image;
   }

   public int getMax() {
      return max;
   }

   public void setMax(int max) {
      this.max = max;
   }
   
   
   
   public void lire(String file_name){
      try {
         BufferedReader fichier = new BufferedReader(new FileReader(file_name));
         String strCurrentLine;
         int longueur = 0;
         int largeur = 0;
         boolean debut = false;
         boolean image = false;
         boolean taille = false;
         boolean max = false;
         int ligne = 0;
         int colonne = 0;
         String delimiteurs = " ,.;";
         while ((strCurrentLine = fichier.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(strCurrentLine, delimiteurs);
            String mot = tokenizer.nextToken();
                  System.out.println(strCurrentLine);
                  //System.out.println(mot);
                  if("#".equals(mot)){
                     debut = true;
                     System.out.println("début");
                     continue;
                  }
                  if (debut == true){
                     if ((image == false)&&(taille == false)){
                        // deal with the first word in each line
                        longueur = Integer.parseInt(mot);
                        mot = tokenizer.nextToken();
                        largeur = Integer.parseInt(mot);   
                        System.out.println("long" +longueur);
                        System.out.println("larg" +largeur);
                        this.image= new int[longueur][largeur];
                        taille = true;
                        continue;
                     }
                     if ((image == false)&&(taille == true)){
                        this.max=Integer.parseInt(mot);
                        System.out.println("max"+this.max);
                        image = true;
                        continue;
                     }
                     if (image ==true){
                        while (tokenizer.hasMoreTokens()) {
                        mot = tokenizer.nextToken();
                           //System.out.println(this.image[ligne][colonne]);
                           //System.out.println("ligne"+ligne);
                           //System.out.println("colonne"+colonne);
                        try {
                           this.image[ligne][colonne] = Integer.parseInt(mot);
                           //System.out.println(this.image[ligne][colonne]);
                           //System.out.println(mot);
                           colonne+=1;
                           if (colonne==largeur-2){
                              ligne+=1;
                              colonne=0;
                           }
                           
                           
                        } catch (NumberFormatException e1) {
                            
                        }

                    }
                     }
                  }
                  
             }
         System.out.println(longueur);
         System.out.println(largeur);
      }
     catch (Exception e) {
            e.printStackTrace();
     }
   }
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

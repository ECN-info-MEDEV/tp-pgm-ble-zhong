/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.mavenproject1;


import java.io.*;
import static java.lang.Math.abs;
import java.util.StringTokenizer;

import java.util.ArrayList;
import java.util.Random;


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
                  //System.out.println(strCurrentLine);
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
                        mot = tokenizer.nextToken();
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
   
   public int seuillage(Image img){
      int result = -1;
      if ((img.getImage().length != this.image.length) || (img.getImage()[0].length!=this.image[0].length)){
         return result;
      }
      else {
         result=0;
         for (int i = 0; i < this.image.length; i++) {
            for (int j = 0; j < this.image[0].length; j++) {
              if(this.image[i][j]!=img.getImage()[i][j]){
                 result+=1;
              }
            }
         }
         return result;
      }
   }
   public Image difference(Image img){
      Image diff = new Image();
      diff.max = this.max;
      if ((img.getImage().length != this.image.length) || (img.getImage()[0].length!=this.image[0].length)){
         return this;
      }
      else {
         diff.image= new int[this.image.length][this.image[0].length];
         for (int i = 0; i < this.image.length; i++) {
            for (int j = 0; j < this.image[0].length; j++) {
              diff.image[i][j] = abs(this.image[i][j] - img.getImage()[i][j]);  
            }
         }
         return diff;
      }
   }
   
   /* public Image zoom(int zoom){
      if (zoom==0){
         return this;
      }
      else if (zoom<0){
         Image dezoom = new Image();
         dezoom.max=this.max;
         dezoom.image= new int[this.image.length/zoom][this.image[0].length/zoom];
         for (int i = 0; i < this.image.length; i++) {
            for (int j = 0; j < this.image[0].length; j++) {
              dezoom.image[i][j] = this.image[i][j] - img.getImage()[i][j];  
            }
         }
      }
      else {
         Image zoomImg = new Image();
         zoomImg.max=this.max;
         zoomImg.image= new int[this.image.length*zoom][this.image[0].length*zoom];
         for (int i = 0; i < this.image.length; i++) {
            for (int j = 0; j < this.image[0].length; j++) {
               for (int k=0; k<zoom;k++){
                  zoomImg.image[i+k][j+k] = this.image[i][j];
               }
                
         }
         }
         
      }
   }
*/
    public ArrayList<Integer> getFiveInt() {

        // initialize the 5 counters
        ArrayList<Integer> l1 = new ArrayList<>();
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;

        // calculate the times of occurrence for each group
        for (int i = 0; i < this.image.length; i++) {
            for (int j = 0; j < this.image[0].length; j++) {
                if (this.image[i][j] <= 50) {
                    x1 += 1;
                } else if (50 < this.image[i][j] && this.image[i][j] <= 100) {
                    x2 += 1;
                } else if (100 < this.image[i][j] && this.image[i][j] <= 150) {
                    x3 += 1;
                } else if (150 < this.image[i][j] && this.image[i][j] <= 200) {
                    x4 += 1;
                } else if (200 < this.image[i][j]) {
                    x5 += 1;
                }
            }
        }

        l1.add(x1 / 1000);
        l1.add(x2 / 1000);
        l1.add(x3 / 1000);
        l1.add(x4 / 1000);
        l1.add(x5 / 1000);
        return l1;
    }

    public void histo(ArrayList<Integer> l1) {
        System.out.println("Histogram:\n");
        int array[] = { l1.get(0), l1.get(1), l1.get(2), l1.get(3), l1.get(4) };

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

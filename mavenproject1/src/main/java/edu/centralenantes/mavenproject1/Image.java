/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.mavenproject1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author uble
 */
public class Image {
    private int[][] image;
    private int max;

    public ArrayList<Integer> getFiveInt() {
        // for test:
        this.image = new int[255][255];
        for (int i = 0; i < 255; i++) {
            for (int j = 0; j < 255; j++) {
                Random rand = new Random();
                this.image[i][j] = rand.nextInt(255);
            }
        }

        // initialize the 5 counters
        ArrayList<Integer> l1 = new ArrayList<>();
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;

        // calculate the times of occurrence for each group
        for (int i = 0; i < 255; i++) {
            for (int j = 0; j < 255; j++) {
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

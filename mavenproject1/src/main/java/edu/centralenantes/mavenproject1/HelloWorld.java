/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author uble
 */
public class HelloWorld {

    /**
     * @param args
     */
    // FIXME 1: this is a fix
    public static void main(String[] args) {
        System.out.println("Hello World\n");
        Image i = new Image();

        
        i.lire("coins.pgm");
        System.out.println(i.getImage()[50][20]);     

        System.out.println("five int");
        ArrayList<Integer> l1 = i.getFiveInt();
        // Get five int because we separate 255 in 5 groups:
        // 0-50, 51-100, 101-150, 151-200, 201-255
        System.out.println("histo");
        i.histo(l1);
    }
    // TODO 1: This is an action item
    // TODO 2: this is the second action item

}
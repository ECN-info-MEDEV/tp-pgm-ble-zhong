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
public class App1 extends java.applet.Applet {

   /**
    * Initializes the applet App1
    */
   public void init() {
      try {
         java.awt.EventQueue.invokeAndWait(new Runnable() {
            public void run() {
               initComponents();
            }
         });
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }

   /**
    * This method is called from within the init() method to initialize the
    * form. WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      setLayout(new java.awt.BorderLayout());
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   // End of variables declaration//GEN-END:variables
}
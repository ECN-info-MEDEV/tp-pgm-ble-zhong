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

      jToolBar1 = new javax.swing.JToolBar();
      jButton2 = new javax.swing.JButton();
      jButton1 = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jList1 = new javax.swing.JList<>();

      setLayout(new java.awt.BorderLayout());

      jToolBar1.setRollover(true);

      jButton2.setText("jButton2");
      jButton2.setFocusable(false);
      jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jToolBar1.add(jButton2);

      jButton1.setText("jButton1");
      jButton1.setFocusable(false);
      jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });
      jToolBar1.add(jButton1);

      jList1.setModel(new javax.swing.AbstractListModel<String>() {
         String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane1.setViewportView(jList1);

      jToolBar1.add(jScrollPane1);

      add(jToolBar1, java.awt.BorderLayout.CENTER);
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jButton1ActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JList<String> jList1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JToolBar jToolBar1;
   // End of variables declaration//GEN-END:variables
}

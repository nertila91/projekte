/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemanagersystem;

/**
 *
 * @author vikto
 */
public class ManagerSystem extends javax.swing.JFrame {

    /**
     * Creates new form ManagerSystem
     */
    public ManagerSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCustomers = new javax.swing.JButton();
        btnOffices = new javax.swing.JButton();
        btnPlines = new javax.swing.JButton();
        btnOrderDetails = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnPayments = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        lblManagerSystem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/costumers.jpg"))); // NOI18N
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });
        getContentPane().add(btnCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 220, 120));

        btnOffices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/offices.jpg"))); // NOI18N
        btnOffices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfficesActionPerformed(evt);
            }
        });
        getContentPane().add(btnOffices, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 220, 120));

        btnPlines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/olines.jpg"))); // NOI18N
        btnPlines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlinesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlines, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 220, 120));

        btnOrderDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/orderdetails.jpg"))); // NOI18N
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 220, 120));

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/produkt.jpg"))); // NOI18N
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        getContentPane().add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 220, 120));

        btnOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/order.jpg"))); // NOI18N
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 220, 120));

        btnPayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/payment.jpg"))); // NOI18N
        btnPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentsActionPerformed(evt);
            }
        });
        getContentPane().add(btnPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 220, 120));

        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/employee1.jpg"))); // NOI18N
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 220, 120));

        lblManagerSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/Lable.jpg"))); // NOI18N
        getContentPane().add(lblManagerSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        // TODO add your handling code here:
        Customers s = new Customers();
      s.setVisible(true);
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void btnOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailsActionPerformed
        // TODO add your handling code here:
             OrderDetails s = new OrderDetails();
      s.setVisible(true);
    }//GEN-LAST:event_btnOrderDetailsActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
      Employees s = new Employees();
      s.setVisible(true);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnOfficesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfficesActionPerformed
        // TODO add your handling code here:
        Offices s = new Offices();
      s.setVisible(true);
    }//GEN-LAST:event_btnOfficesActionPerformed

    private void btnPlinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlinesActionPerformed
        // TODO add your handling code here:
             ProductLines s = new ProductLines();
      s.setVisible(true);
    }//GEN-LAST:event_btnPlinesActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        // TODO add your handling code here:
        Products s = new Products();
      s.setVisible(true);
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
             Orders s = new Orders();
      s.setVisible(true);
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentsActionPerformed
        // TODO add your handling code here:
             Payments s = new Payments();
      s.setVisible(true);
    }//GEN-LAST:event_btnPaymentsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnOffices;
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnPayments;
    private javax.swing.JButton btnPlines;
    private javax.swing.JButton btnProducts;
    private javax.swing.JLabel lblManagerSystem;
    // End of variables declaration//GEN-END:variables
}

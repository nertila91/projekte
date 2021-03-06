/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemanagersystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vikto
 */
public class OrderDetails extends javax.swing.JFrame {

    /**
     * Creates new form OrderDetails
     */
    public OrderDetails() {
        initComponents();
    }
    String driver ="MySQL (Connector/J driver) (1)";
    String url ="jdbc:mysql://localhost:3306/classicmodels?zeroDateTimeBehavior=convertToNull";
    String user ="root";
    String pass ="";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderDetailsImg = new javax.swing.JLabel();
        lblOrderNumber = new javax.swing.JLabel();
        txtOrderNumber = new javax.swing.JTextField();
        lblProductCode = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        lblQuantityOrdered = new javax.swing.JLabel();
        txtQuantityOrdered = new javax.swing.JTextField();
        lblPriceEach = new javax.swing.JLabel();
        txtPriceEach = new javax.swing.JTextField();
        lblOrderLineNumber = new javax.swing.JLabel();
        txtOrderLineNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        tblOrderDetails = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(OrderDetailsImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblOrderNumber.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblOrderNumber.setText("OrderNumber");
        getContentPane().add(lblOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 30));

        txtOrderNumber.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 210, 30));

        lblProductCode.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblProductCode.setText("ProductCode");
        getContentPane().add(lblProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 210, 30));

        txtProductCode.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 210, 30));

        lblQuantityOrdered.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblQuantityOrdered.setText("QuantityOrdered");
        getContentPane().add(lblQuantityOrdered, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, 30));

        txtQuantityOrdered.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtQuantityOrdered, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 210, 30));

        lblPriceEach.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblPriceEach.setText("PriceEach");
        getContentPane().add(lblPriceEach, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 210, 30));

        txtPriceEach.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtPriceEach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceEachActionPerformed(evt);
            }
        });
        getContentPane().add(txtPriceEach, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 210, 30));

        lblOrderLineNumber.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblOrderLineNumber.setText("OrderLineNumber");
        getContentPane().add(lblOrderLineNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 200, 30));

        txtOrderLineNumber.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtOrderLineNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderLineNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrderLineNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 210, 30));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/1=.jpg"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 100, 100));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/edit.jpg"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 100, 100));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/delete.jpg"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 100, 100));

        txtSearch.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 550, 190, 100));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/serch.jpg"))); // NOI18N
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 100, 100));
        btnSearch.getAccessibleContext().setAccessibleName("jButton4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblOrderDetails.setViewportView(jTable1);

        getContentPane().add(tblOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 640, 390));
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       
        try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "Update orderdetails set productCode=?,quantityOrdered=?,priceEach=?,orderLineNumber=? where orderNumber=?";
        
        PreparedStatement pst =con.prepareStatement(sql);
        
        pst.setString(1, txtProductCode.getText());
        pst.setString(2, txtQuantityOrdered.getText());
        pst.setString(3, txtPriceEach.getText());
        pst.setString(4, txtOrderLineNumber.getText());
        pst.setString(5, txtOrderNumber.getText());
        
       
        
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Update Successfully");
        
    }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        
        Update_table();
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      
        
                  try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "insert into orderdetails"
                +"(orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber)"
                +"values(?,?,?,?,?)";
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setString(1, txtOrderNumber.getText());
        pst.setString(2, txtProductCode.getText());
        pst.setString(3, txtQuantityOrdered.getText());
        pst.setString(4, txtPriceEach.getText());
        pst.setString(4, txtOrderLineNumber.getText());
        
       
        
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Insert Successfully");
        
    }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        
       Update_table(); 
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtPriceEachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceEachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceEachActionPerformed

    private void txtOrderLineNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderLineNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderLineNumberActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "Delete from orderdetails where orderNumber=?";
        
        PreparedStatement pst =con.prepareStatement(sql);
        
        
        pst.setString(1, txtOrderNumber.getText());
        
       
        
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Delete Successfully");
        
    }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        
        
        Update_table();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OrderDetailsImg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblOrderLineNumber;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblPriceEach;
    private javax.swing.JLabel lblProductCode;
    private javax.swing.JLabel lblQuantityOrdered;
    private javax.swing.JScrollPane tblOrderDetails;
    private javax.swing.JTextField txtOrderLineNumber;
    private javax.swing.JTextField txtOrderNumber;
    private javax.swing.JTextField txtPriceEach;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtQuantityOrdered;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void Update_table() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

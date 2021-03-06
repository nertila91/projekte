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
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("classicmodels?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        products_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Products_1 p");
        products_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : products_1Query.getResultList();
        ProductsImg = new javax.swing.JLabel();
        lblProductCode = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductLine = new javax.swing.JLabel();
        txtProductLine = new javax.swing.JTextField();
        lblProductScale = new javax.swing.JLabel();
        txtProductScale = new javax.swing.JTextField();
        lblProductVendor = new javax.swing.JLabel();
        txtProductVendor = new javax.swing.JTextField();
        lblProductDescription = new javax.swing.JLabel();
        txtProductDescription = new javax.swing.JTextField();
        lblQuantityInStock = new javax.swing.JLabel();
        txtQuantityInStock = new javax.swing.JTextField();
        lblBuyPrice = new javax.swing.JLabel();
        txtBuyPrice = new javax.swing.JTextField();
        lblMSRP = new javax.swing.JLabel();
        txtMSRP = new javax.swing.JTextField();
        tblProducts = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/Untitled design (3).jpg"))); // NOI18N
        getContentPane().add(ProductsImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 560, 110));

        lblProductCode.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblProductCode.setText("ProductCode");
        getContentPane().add(lblProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        txtProductCode.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, 30));

        lblProductName.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblProductName.setText("ProductName");
        getContentPane().add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtProductName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 200, 30));

        lblProductLine.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblProductLine.setText("ProductLine");
        getContentPane().add(lblProductLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        txtProductLine.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtProductLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductLineActionPerformed(evt);
            }
        });
        getContentPane().add(txtProductLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 200, 30));

        lblProductScale.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblProductScale.setText("ProductScale");
        getContentPane().add(lblProductScale, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        txtProductScale.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtProductScale, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, 30));

        lblProductVendor.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblProductVendor.setText("ProductVendor");
        getContentPane().add(lblProductVendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        txtProductVendor.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtProductVendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 200, 30));

        lblProductDescription.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblProductDescription.setText("ProductDescription");
        getContentPane().add(lblProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        txtProductDescription.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 200, 30));

        lblQuantityInStock.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblQuantityInStock.setText("QuantityInStock");
        getContentPane().add(lblQuantityInStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        txtQuantityInStock.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtQuantityInStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 200, 30));

        lblBuyPrice.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblBuyPrice.setText("BuyPrice");
        getContentPane().add(lblBuyPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 90, -1));

        txtBuyPrice.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtBuyPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 200, 30));

        lblMSRP.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblMSRP.setText("MSRP");
        getContentPane().add(lblMSRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, -1));

        txtMSRP.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtMSRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSRPActionPerformed(evt);
            }
        });
        getContentPane().add(txtMSRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 200, 30));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, products_1List, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productCode}"));
        columnBinding.setColumnName("Product Code");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productName}"));
        columnBinding.setColumnName("Product Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productLine}"));
        columnBinding.setColumnName("Product Line");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productScale}"));
        columnBinding.setColumnName("Product Scale");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productVendor}"));
        columnBinding.setColumnName("Product Vendor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${productDescription}"));
        columnBinding.setColumnName("Product Description");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantityInStock}"));
        columnBinding.setColumnName("Quantity In Stock");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${buyPrice}"));
        columnBinding.setColumnName("Buy Price");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${msrp}"));
        columnBinding.setColumnName("Msrp");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        tblProducts.setViewportView(jTable1);

        getContentPane().add(tblProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 670, 350));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/1=.jpg"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 100, 100));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/edit.jpg"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 100, 100));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/delete.jpg"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 100, 100));

        txtSearch.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 220, 100));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java gui/serch.jpg"))); // NOI18N
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 100, 100));
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 660));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMSRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSRPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSRPActionPerformed

    private void txtProductLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductLineActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        
                   try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "insert into products"
                +"(productCode,productName,productLine,productScale,productVendor,productDescription,quantityInStock,buyPrice,MSRP)"
                +"values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setString(1, txtProductCode.getText());
        pst.setString(2, txtProductName.getText());
        pst.setString(3, txtProductLine.getText());
        pst.setString(4, txtProductScale.getText());
        pst.setString(5, txtProductVendor.getText());
        pst.setString(6, txtProductDescription.getText());
        pst.setString(7, txtQuantityInStock.getText());
        pst.setString(8, txtBuyPrice.getText());
        pst.setString(9, txtMSRP.getText());
        
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Insert Successfully");
        
    }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        Update_table();
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
          try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "Update products set productName=?,productLine?,productScale=?,productVendor=?,productDescription=?,quantityInStock=?,buyPrice=?,MSRP=?  where productCode=?";
     
        PreparedStatement pst =con.prepareStatement(sql);
        
       
        pst.setString(1, txtProductName.getText());
        pst.setString(2, txtProductLine.getText());
        pst.setString(3, txtProductScale.getText());
        pst.setString(4, txtProductVendor.getText());
        pst.setString(5, txtProductDescription.getText());
        pst.setString(6, txtQuantityInStock.getText());
        pst.setString(7, txtBuyPrice.getText());
        pst.setString(8, txtMSRP.getText());
        pst.setString(9, txtProductCode.getText());
        
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Update Successfully");
        
    }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        
        Update_table();
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "Delete from where productCode=?";
     
        PreparedStatement pst =con.prepareStatement(sql);
        
       
        
        pst.setString(1, txtProductCode.getText());
        
        
        
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProductsImg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblBuyPrice;
    private javax.swing.JLabel lblMSRP;
    private javax.swing.JLabel lblProductCode;
    private javax.swing.JLabel lblProductDescription;
    private javax.swing.JLabel lblProductLine;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductScale;
    private javax.swing.JLabel lblProductVendor;
    private javax.swing.JLabel lblQuantityInStock;
    private java.util.List<samplemanagersystem.Products_1> products_1List;
    private javax.persistence.Query products_1Query;
    private javax.swing.JScrollPane tblProducts;
    private javax.swing.JTextField txtBuyPrice;
    private javax.swing.JTextField txtMSRP;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductDescription;
    private javax.swing.JTextField txtProductLine;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductScale;
    private javax.swing.JTextField txtProductVendor;
    private javax.swing.JTextField txtQuantityInStock;
    private javax.swing.JTextField txtSearch;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void Update_table() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

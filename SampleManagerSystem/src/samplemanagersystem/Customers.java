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
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Customers
     */
    public Customers() {
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
        customers_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customers_1 c");
        customers_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customers_1Query.getResultList();
        CostomersImg = new javax.swing.JLabel();
        lblCustomerNumber = new javax.swing.JLabel();
        txtCustomerNumber = new javax.swing.JTextField();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblContactLastName = new javax.swing.JLabel();
        txtContactLastName = new javax.swing.JTextField();
        lblContactFirstName = new javax.swing.JLabel();
        txtContactFirstName = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblAddressLine1 = new javax.swing.JLabel();
        txtAddressLine1 = new javax.swing.JTextField();
        lblAddressLine2 = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblPostalCode = new javax.swing.JLabel();
        txtPostalCode = new javax.swing.JTextField();
        lblSalesRepEmployeesNumber = new javax.swing.JLabel();
        txtSalesRepEmployeesNumber = new javax.swing.JTextField();
        lblCreditLimit = new javax.swing.JLabel();
        txtCreditLimit = new javax.swing.JTextField();
        tblCustomers = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CostomersImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\vikto\\Desktop\\java gui\\Untitled design (1).jpg")); // NOI18N
        getContentPane().add(CostomersImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 580, 100));

        lblCustomerNumber.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblCustomerNumber.setText("CustomerNumber");
        getContentPane().add(lblCustomerNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtCustomerNumber.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtCustomerNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtCustomerNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 190, 30));

        lblCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblCustomerName.setText("CustomerName");
        getContentPane().add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtCustomerName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 190, 30));

        lblContactLastName.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblContactLastName.setText("ContactLastName");
        getContentPane().add(lblContactLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtContactLastName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtContactLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 190, 30));

        lblContactFirstName.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblContactFirstName.setText("ContactFirstName");
        getContentPane().add(lblContactFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtContactFirstName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtContactFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 190, 30));

        lblPhone.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblPhone.setText("Phone");
        getContentPane().add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        txtPhone.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 190, 30));

        lblAddressLine1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblAddressLine1.setText("AddressLine1");
        getContentPane().add(lblAddressLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        txtAddressLine1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtAddressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressLine1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddressLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 340, 190, 30));

        lblAddressLine2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblAddressLine2.setText("AddressLine2");
        getContentPane().add(lblAddressLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        txtAddressLine2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtAddressLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 190, 30));

        lblCity.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblCity.setText("City");
        getContentPane().add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        txtCity.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 190, 30));

        lblState.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblState.setText("State");
        getContentPane().add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        txtState.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 190, 30));

        lblPostalCode.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblPostalCode.setText("PostalCode");
        getContentPane().add(lblPostalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        txtPostalCode.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtPostalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 190, 30));

        lblSalesRepEmployeesNumber.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblSalesRepEmployeesNumber.setText("SalesRepENumber");
        getContentPane().add(lblSalesRepEmployeesNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        txtSalesRepEmployeesNumber.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtSalesRepEmployeesNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalesRepEmployeesNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalesRepEmployeesNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 190, 30));

        lblCreditLimit.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblCreditLimit.setText("CreditLimit");
        getContentPane().add(lblCreditLimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        txtCreditLimit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtCreditLimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 190, 30));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, customers_1List, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${customerNumber}"));
        columnBinding.setColumnName("Customer Number");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${customerName}"));
        columnBinding.setColumnName("Customer Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${contactLastName}"));
        columnBinding.setColumnName("Contact Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${contactFirstName}"));
        columnBinding.setColumnName("Contact First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${addressLine1}"));
        columnBinding.setColumnName("Address Line1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${addressLine2}"));
        columnBinding.setColumnName("Address Line2");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${city}"));
        columnBinding.setColumnName("City");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${state}"));
        columnBinding.setColumnName("State");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${postalCode}"));
        columnBinding.setColumnName("Postal Code");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${country}"));
        columnBinding.setColumnName("Country");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salesRepEmployeeNumber}"));
        columnBinding.setColumnName("Sales Rep Employee Number");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creditLimit}"));
        columnBinding.setColumnName("Credit Limit");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        tblCustomers.setViewportView(jTable1);

        getContentPane().add(tblCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 680, 400));

        btnAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\vikto\\Desktop\\java gui\\1=.jpg")); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 100, 100));

        btnEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\vikto\\Desktop\\java gui\\edit.jpg")); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 100, 100));

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\vikto\\Desktop\\java gui\\delete.jpg")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 100, 100));

        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\vikto\\Desktop\\java gui\\serch.jpg")); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 100, 100));

        txtSearch.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 230, 100));

        txtCountry.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        getContentPane().add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 190, 30));

        lblCountry.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblCountry.setText("Country");
        getContentPane().add(lblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\vikto\\Desktop\\java gui\\lablewhite.png")); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 660));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNumberActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtAddressLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine1ActionPerformed

    private void txtSalesRepEmployeesNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalesRepEmployeesNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalesRepEmployeesNumberActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
   
      try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "Delete from customers  where customerNumber=?";
        PreparedStatement pst =con.prepareStatement(sql);
  
        pst.setString(1, txtCustomerNumber.getText());
        
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Delete Successfully");
        
    }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(this, e.getMessage());  
        }        
        
        Update_table();
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        try
    {
   
        Connection con=DriverManager.getConnection(url, user, pass);
        String 
        
        sql = "insert into customers"
                +"(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit)"
                +"values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst =con.prepareStatement(sql);
        pst.setString(1, txtCustomerNumber.getText());
        pst.setString(2, txtCustomerName.getText());
        pst.setString(3, txtContactLastName.getText());
        pst.setString(4, txtContactFirstName.getText());
        pst.setString(5, txtPhone.getText());
        pst.setString(6, txtAddressLine1.getText());
        pst.setString(7, txtAddressLine2.getText());
        pst.setString(8, txtCity.getText());
        pst.setString(9, txtState.getText());
        pst.setString(10, txtPostalCode.getText());
        pst.setString(11, txtCountry.getText());
        pst.setString(12, txtSalesRepEmployeesNumber.getText());
        pst.setString(13, txtCreditLimit.getText());
        
        
        
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
        
        sql = "Update customers set customerName=?,contactLastName=?,contactFirstName=?,phone=?,addressLine1=?,addressLine2=?,city=?,state=?,postalCode=?,country=?,salesRepEmployeeNumber=?,creditLimit=? where customerNumber=?";
        PreparedStatement pst =con.prepareStatement(sql);
        
        pst.setString(1, txtCustomerName.getText());
        pst.setString(2, txtContactLastName.getText());
        pst.setString(3, txtContactFirstName.getText());
        pst.setString(4, txtPhone.getText());
        pst.setString(5, txtAddressLine1.getText());
        pst.setString(6, txtAddressLine2.getText());
        pst.setString(7, txtCity.getText());
        pst.setString(8, txtState.getText());
        pst.setString(9, txtPostalCode.getText());
        pst.setString(10, txtCountry.getText());
        pst.setString(11, txtSalesRepEmployeesNumber.getText());
        pst.setString(12, txtCreditLimit.getText());
        pst.setString(13, txtCustomerNumber.getText());
        
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Update Successfully");
        
    }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(this, e.getMessage());  
        }
        Update_table();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
      
        
        
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CostomersImg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private java.util.List<samplemanagersystem.Customers_1> customers_1List;
    private javax.persistence.Query customers_1Query;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactFirstName;
    private javax.swing.JLabel lblContactLastName;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblCreditLimit;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerNumber;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPostalCode;
    private javax.swing.JLabel lblSalesRepEmployeesNumber;
    private javax.swing.JLabel lblState;
    private javax.swing.JScrollPane tblCustomers;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactFirstName;
    private javax.swing.JTextField txtContactLastName;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtCreditLimit;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerNumber;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtSalesRepEmployeesNumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtState;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void Update_table() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
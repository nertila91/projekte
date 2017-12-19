/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemanagersystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author vikto
 */
@Entity
@Table(name = "customers", catalog = "classicmodels", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customers_1.findAll", query = "SELECT c FROM Customers_1 c")
    , @NamedQuery(name = "Customers_1.findByCustomerNumber", query = "SELECT c FROM Customers_1 c WHERE c.customerNumber = :customerNumber")
    , @NamedQuery(name = "Customers_1.findByCustomerName", query = "SELECT c FROM Customers_1 c WHERE c.customerName = :customerName")
    , @NamedQuery(name = "Customers_1.findByContactLastName", query = "SELECT c FROM Customers_1 c WHERE c.contactLastName = :contactLastName")
    , @NamedQuery(name = "Customers_1.findByContactFirstName", query = "SELECT c FROM Customers_1 c WHERE c.contactFirstName = :contactFirstName")
    , @NamedQuery(name = "Customers_1.findByPhone", query = "SELECT c FROM Customers_1 c WHERE c.phone = :phone")
    , @NamedQuery(name = "Customers_1.findByAddressLine1", query = "SELECT c FROM Customers_1 c WHERE c.addressLine1 = :addressLine1")
    , @NamedQuery(name = "Customers_1.findByAddressLine2", query = "SELECT c FROM Customers_1 c WHERE c.addressLine2 = :addressLine2")
    , @NamedQuery(name = "Customers_1.findByCity", query = "SELECT c FROM Customers_1 c WHERE c.city = :city")
    , @NamedQuery(name = "Customers_1.findByState", query = "SELECT c FROM Customers_1 c WHERE c.state = :state")
    , @NamedQuery(name = "Customers_1.findByPostalCode", query = "SELECT c FROM Customers_1 c WHERE c.postalCode = :postalCode")
    , @NamedQuery(name = "Customers_1.findByCountry", query = "SELECT c FROM Customers_1 c WHERE c.country = :country")
    , @NamedQuery(name = "Customers_1.findBySalesRepEmployeeNumber", query = "SELECT c FROM Customers_1 c WHERE c.salesRepEmployeeNumber = :salesRepEmployeeNumber")
    , @NamedQuery(name = "Customers_1.findByCreditLimit", query = "SELECT c FROM Customers_1 c WHERE c.creditLimit = :creditLimit")})
public class Customers_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "customerNumber")
    private Integer customerNumber;
    @Basic(optional = false)
    @Column(name = "customerName")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "contactLastName")
    private String contactLastName;
    @Basic(optional = false)
    @Column(name = "contactFirstName")
    private String contactFirstName;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "addressLine1")
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "postalCode")
    private String postalCode;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Column(name = "salesRepEmployeeNumber")
    private Integer salesRepEmployeeNumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "creditLimit")
    private BigDecimal creditLimit;

    public Customers_1() {
    }

    public Customers_1(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Customers_1(Integer customerNumber, String customerName, String contactLastName, String contactFirstName, String phone, String addressLine1, String city, String country) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.country = country;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        Integer oldCustomerNumber = this.customerNumber;
        this.customerNumber = customerNumber;
        changeSupport.firePropertyChange("customerNumber", oldCustomerNumber, customerNumber);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        String oldCustomerName = this.customerName;
        this.customerName = customerName;
        changeSupport.firePropertyChange("customerName", oldCustomerName, customerName);
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        String oldContactLastName = this.contactLastName;
        this.contactLastName = contactLastName;
        changeSupport.firePropertyChange("contactLastName", oldContactLastName, contactLastName);
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        String oldContactFirstName = this.contactFirstName;
        this.contactFirstName = contactFirstName;
        changeSupport.firePropertyChange("contactFirstName", oldContactFirstName, contactFirstName);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        String oldAddressLine1 = this.addressLine1;
        this.addressLine1 = addressLine1;
        changeSupport.firePropertyChange("addressLine1", oldAddressLine1, addressLine1);
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        String oldAddressLine2 = this.addressLine2;
        this.addressLine2 = addressLine2;
        changeSupport.firePropertyChange("addressLine2", oldAddressLine2, addressLine2);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        String oldPostalCode = this.postalCode;
        this.postalCode = postalCode;
        changeSupport.firePropertyChange("postalCode", oldPostalCode, postalCode);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public Integer getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        Integer oldSalesRepEmployeeNumber = this.salesRepEmployeeNumber;
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        changeSupport.firePropertyChange("salesRepEmployeeNumber", oldSalesRepEmployeeNumber, salesRepEmployeeNumber);
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        BigDecimal oldCreditLimit = this.creditLimit;
        this.creditLimit = creditLimit;
        changeSupport.firePropertyChange("creditLimit", oldCreditLimit, creditLimit);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerNumber != null ? customerNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers_1)) {
            return false;
        }
        Customers_1 other = (Customers_1) object;
        if ((this.customerNumber == null && other.customerNumber != null) || (this.customerNumber != null && !this.customerNumber.equals(other.customerNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "samplemanagersystem.Customers_1[ customerNumber=" + customerNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

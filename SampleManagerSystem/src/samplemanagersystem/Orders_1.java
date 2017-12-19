/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemanagersystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author vikto
 */
@Entity
@Table(name = "orders", catalog = "classicmodels", schema = "")
@NamedQueries({
    @NamedQuery(name = "Orders_1.findAll", query = "SELECT o FROM Orders_1 o")
    , @NamedQuery(name = "Orders_1.findByOrderNumber", query = "SELECT o FROM Orders_1 o WHERE o.orderNumber = :orderNumber")
    , @NamedQuery(name = "Orders_1.findByOrderDate", query = "SELECT o FROM Orders_1 o WHERE o.orderDate = :orderDate")
    , @NamedQuery(name = "Orders_1.findByRequiredDate", query = "SELECT o FROM Orders_1 o WHERE o.requiredDate = :requiredDate")
    , @NamedQuery(name = "Orders_1.findByShippedDate", query = "SELECT o FROM Orders_1 o WHERE o.shippedDate = :shippedDate")
    , @NamedQuery(name = "Orders_1.findByStatus", query = "SELECT o FROM Orders_1 o WHERE o.status = :status")
    , @NamedQuery(name = "Orders_1.findByCustomerNumber", query = "SELECT o FROM Orders_1 o WHERE o.customerNumber = :customerNumber")})
public class Orders_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "orderNumber")
    private Integer orderNumber;
    @Basic(optional = false)
    @Column(name = "orderDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Basic(optional = false)
    @Column(name = "requiredDate")
    @Temporal(TemporalType.DATE)
    private Date requiredDate;
    @Column(name = "shippedDate")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Lob
    @Column(name = "comments")
    private String comments;
    @Basic(optional = false)
    @Column(name = "customerNumber")
    private int customerNumber;

    public Orders_1() {
    }

    public Orders_1(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Orders_1(Integer orderNumber, Date orderDate, Date requiredDate, String status, int customerNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.status = status;
        this.customerNumber = customerNumber;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        Integer oldOrderNumber = this.orderNumber;
        this.orderNumber = orderNumber;
        changeSupport.firePropertyChange("orderNumber", oldOrderNumber, orderNumber);
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        Date oldOrderDate = this.orderDate;
        this.orderDate = orderDate;
        changeSupport.firePropertyChange("orderDate", oldOrderDate, orderDate);
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        Date oldRequiredDate = this.requiredDate;
        this.requiredDate = requiredDate;
        changeSupport.firePropertyChange("requiredDate", oldRequiredDate, requiredDate);
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        Date oldShippedDate = this.shippedDate;
        this.shippedDate = shippedDate;
        changeSupport.firePropertyChange("shippedDate", oldShippedDate, shippedDate);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        String oldComments = this.comments;
        this.comments = comments;
        changeSupport.firePropertyChange("comments", oldComments, comments);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        int oldCustomerNumber = this.customerNumber;
        this.customerNumber = customerNumber;
        changeSupport.firePropertyChange("customerNumber", oldCustomerNumber, customerNumber);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderNumber != null ? orderNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders_1)) {
            return false;
        }
        Orders_1 other = (Orders_1) object;
        if ((this.orderNumber == null && other.orderNumber != null) || (this.orderNumber != null && !this.orderNumber.equals(other.orderNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "samplemanagersystem.Orders_1[ orderNumber=" + orderNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

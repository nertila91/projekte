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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author vikto
 */
@Entity
@Table(name = "products", catalog = "classicmodels", schema = "")
@NamedQueries({
    @NamedQuery(name = "Products_1.findAll", query = "SELECT p FROM Products_1 p")
    , @NamedQuery(name = "Products_1.findByProductCode", query = "SELECT p FROM Products_1 p WHERE p.productCode = :productCode")
    , @NamedQuery(name = "Products_1.findByProductName", query = "SELECT p FROM Products_1 p WHERE p.productName = :productName")
    , @NamedQuery(name = "Products_1.findByProductLine", query = "SELECT p FROM Products_1 p WHERE p.productLine = :productLine")
    , @NamedQuery(name = "Products_1.findByProductScale", query = "SELECT p FROM Products_1 p WHERE p.productScale = :productScale")
    , @NamedQuery(name = "Products_1.findByProductVendor", query = "SELECT p FROM Products_1 p WHERE p.productVendor = :productVendor")
    , @NamedQuery(name = "Products_1.findByQuantityInStock", query = "SELECT p FROM Products_1 p WHERE p.quantityInStock = :quantityInStock")
    , @NamedQuery(name = "Products_1.findByBuyPrice", query = "SELECT p FROM Products_1 p WHERE p.buyPrice = :buyPrice")
    , @NamedQuery(name = "Products_1.findByMsrp", query = "SELECT p FROM Products_1 p WHERE p.msrp = :msrp")})
public class Products_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "productCode")
    private String productCode;
    @Basic(optional = false)
    @Column(name = "productName")
    private String productName;
    @Basic(optional = false)
    @Column(name = "productLine")
    private String productLine;
    @Basic(optional = false)
    @Column(name = "productScale")
    private String productScale;
    @Basic(optional = false)
    @Column(name = "productVendor")
    private String productVendor;
    @Basic(optional = false)
    @Lob
    @Column(name = "productDescription")
    private String productDescription;
    @Basic(optional = false)
    @Column(name = "quantityInStock")
    private short quantityInStock;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "buyPrice")
    private BigDecimal buyPrice;
    @Basic(optional = false)
    @Column(name = "MSRP")
    private BigDecimal msrp;

    public Products_1() {
    }

    public Products_1(String productCode) {
        this.productCode = productCode;
    }

    public Products_1(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, short quantityInStock, BigDecimal buyPrice, BigDecimal msrp) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.msrp = msrp;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        String oldProductCode = this.productCode;
        this.productCode = productCode;
        changeSupport.firePropertyChange("productCode", oldProductCode, productCode);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        String oldProductName = this.productName;
        this.productName = productName;
        changeSupport.firePropertyChange("productName", oldProductName, productName);
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        String oldProductLine = this.productLine;
        this.productLine = productLine;
        changeSupport.firePropertyChange("productLine", oldProductLine, productLine);
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        String oldProductScale = this.productScale;
        this.productScale = productScale;
        changeSupport.firePropertyChange("productScale", oldProductScale, productScale);
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        String oldProductVendor = this.productVendor;
        this.productVendor = productVendor;
        changeSupport.firePropertyChange("productVendor", oldProductVendor, productVendor);
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        String oldProductDescription = this.productDescription;
        this.productDescription = productDescription;
        changeSupport.firePropertyChange("productDescription", oldProductDescription, productDescription);
    }

    public short getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(short quantityInStock) {
        short oldQuantityInStock = this.quantityInStock;
        this.quantityInStock = quantityInStock;
        changeSupport.firePropertyChange("quantityInStock", oldQuantityInStock, quantityInStock);
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        BigDecimal oldBuyPrice = this.buyPrice;
        this.buyPrice = buyPrice;
        changeSupport.firePropertyChange("buyPrice", oldBuyPrice, buyPrice);
    }

    public BigDecimal getMsrp() {
        return msrp;
    }

    public void setMsrp(BigDecimal msrp) {
        BigDecimal oldMsrp = this.msrp;
        this.msrp = msrp;
        changeSupport.firePropertyChange("msrp", oldMsrp, msrp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCode != null ? productCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products_1)) {
            return false;
        }
        Products_1 other = (Products_1) object;
        if ((this.productCode == null && other.productCode != null) || (this.productCode != null && !this.productCode.equals(other.productCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "samplemanagersystem.Products_1[ productCode=" + productCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

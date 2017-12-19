/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemanagersystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "productlines", catalog = "classicmodels", schema = "")
@NamedQueries({
    @NamedQuery(name = "Productlines_1.findAll", query = "SELECT p FROM Productlines_1 p")
    , @NamedQuery(name = "Productlines_1.findByProductLine", query = "SELECT p FROM Productlines_1 p WHERE p.productLine = :productLine")
    , @NamedQuery(name = "Productlines_1.findByTextDescription", query = "SELECT p FROM Productlines_1 p WHERE p.textDescription = :textDescription")})
public class Productlines_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "productLine")
    private String productLine;
    @Column(name = "textDescription")
    private String textDescription;
    @Lob
    @Column(name = "htmlDescription")
    private String htmlDescription;
    @Lob
    @Column(name = "image")
    private byte[] image;

    public Productlines_1() {
    }

    public Productlines_1(String productLine) {
        this.productLine = productLine;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        String oldProductLine = this.productLine;
        this.productLine = productLine;
        changeSupport.firePropertyChange("productLine", oldProductLine, productLine);
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        String oldTextDescription = this.textDescription;
        this.textDescription = textDescription;
        changeSupport.firePropertyChange("textDescription", oldTextDescription, textDescription);
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        String oldHtmlDescription = this.htmlDescription;
        this.htmlDescription = htmlDescription;
        changeSupport.firePropertyChange("htmlDescription", oldHtmlDescription, htmlDescription);
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        byte[] oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productLine != null ? productLine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productlines_1)) {
            return false;
        }
        Productlines_1 other = (Productlines_1) object;
        if ((this.productLine == null && other.productLine != null) || (this.productLine != null && !this.productLine.equals(other.productLine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "samplemanagersystem.Productlines_1[ productLine=" + productLine + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

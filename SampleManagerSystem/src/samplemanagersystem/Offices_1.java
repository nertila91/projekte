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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author vikto
 */
@Entity
@Table(name = "offices", catalog = "classicmodels", schema = "")
@NamedQueries({
    @NamedQuery(name = "Offices_1.findAll", query = "SELECT o FROM Offices_1 o")
    , @NamedQuery(name = "Offices_1.findByOfficeCode", query = "SELECT o FROM Offices_1 o WHERE o.officeCode = :officeCode")
    , @NamedQuery(name = "Offices_1.findByCity", query = "SELECT o FROM Offices_1 o WHERE o.city = :city")
    , @NamedQuery(name = "Offices_1.findByPhone", query = "SELECT o FROM Offices_1 o WHERE o.phone = :phone")
    , @NamedQuery(name = "Offices_1.findByAddressLine1", query = "SELECT o FROM Offices_1 o WHERE o.addressLine1 = :addressLine1")
    , @NamedQuery(name = "Offices_1.findByAddressLine2", query = "SELECT o FROM Offices_1 o WHERE o.addressLine2 = :addressLine2")
    , @NamedQuery(name = "Offices_1.findByState", query = "SELECT o FROM Offices_1 o WHERE o.state = :state")
    , @NamedQuery(name = "Offices_1.findByCountry", query = "SELECT o FROM Offices_1 o WHERE o.country = :country")
    , @NamedQuery(name = "Offices_1.findByPostalCode", query = "SELECT o FROM Offices_1 o WHERE o.postalCode = :postalCode")
    , @NamedQuery(name = "Offices_1.findByTerritory", query = "SELECT o FROM Offices_1 o WHERE o.territory = :territory")})
public class Offices_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "officeCode")
    private String officeCode;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "addressLine1")
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "postalCode")
    private String postalCode;
    @Basic(optional = false)
    @Column(name = "territory")
    private String territory;

    public Offices_1() {
    }

    public Offices_1(String officeCode) {
        this.officeCode = officeCode;
    }

    public Offices_1(String officeCode, String city, String phone, String addressLine1, String country, String postalCode, String territory) {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.country = country;
        this.postalCode = postalCode;
        this.territory = territory;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        String oldOfficeCode = this.officeCode;
        this.officeCode = officeCode;
        changeSupport.firePropertyChange("officeCode", oldOfficeCode, officeCode);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        String oldPostalCode = this.postalCode;
        this.postalCode = postalCode;
        changeSupport.firePropertyChange("postalCode", oldPostalCode, postalCode);
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        String oldTerritory = this.territory;
        this.territory = territory;
        changeSupport.firePropertyChange("territory", oldTerritory, territory);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (officeCode != null ? officeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offices_1)) {
            return false;
        }
        Offices_1 other = (Offices_1) object;
        if ((this.officeCode == null && other.officeCode != null) || (this.officeCode != null && !this.officeCode.equals(other.officeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "samplemanagersystem.Offices_1[ officeCode=" + officeCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

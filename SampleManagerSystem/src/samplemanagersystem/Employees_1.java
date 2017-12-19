/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemanagersystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author vikto
 */
@Entity
@Table(name = "employees", catalog = "classicmodels", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employees_1.findAll", query = "SELECT e FROM Employees_1 e")
    , @NamedQuery(name = "Employees_1.findByEmployeeNumber", query = "SELECT e FROM Employees_1 e WHERE e.employeeNumber = :employeeNumber")
    , @NamedQuery(name = "Employees_1.findByLastName", query = "SELECT e FROM Employees_1 e WHERE e.lastName = :lastName")
    , @NamedQuery(name = "Employees_1.findByFirstName", query = "SELECT e FROM Employees_1 e WHERE e.firstName = :firstName")
    , @NamedQuery(name = "Employees_1.findByExtension", query = "SELECT e FROM Employees_1 e WHERE e.extension = :extension")
    , @NamedQuery(name = "Employees_1.findByEmail", query = "SELECT e FROM Employees_1 e WHERE e.email = :email")
    , @NamedQuery(name = "Employees_1.findByOfficeCode", query = "SELECT e FROM Employees_1 e WHERE e.officeCode = :officeCode")
    , @NamedQuery(name = "Employees_1.findByJobTitle", query = "SELECT e FROM Employees_1 e WHERE e.jobTitle = :jobTitle")})
public class Employees_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "employeeNumber")
    private Integer employeeNumber;
    @Basic(optional = false)
    @Column(name = "lastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "firstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "extension")
    private String extension;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "officeCode")
    private String officeCode;
    @Basic(optional = false)
    @Column(name = "jobTitle")
    private String jobTitle;
    @OneToMany(mappedBy = "reportsTo")
    private List<Employees_1> employeesList;
    @JoinColumn(name = "reportsTo", referencedColumnName = "employeeNumber")
    @ManyToOne
    private Employees_1 reportsTo;

    public Employees_1() {
    }

    public Employees_1(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Employees_1(Integer employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.jobTitle = jobTitle;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        Integer oldEmployeeNumber = this.employeeNumber;
        this.employeeNumber = employeeNumber;
        changeSupport.firePropertyChange("employeeNumber", oldEmployeeNumber, employeeNumber);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        String oldExtension = this.extension;
        this.extension = extension;
        changeSupport.firePropertyChange("extension", oldExtension, extension);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        String oldOfficeCode = this.officeCode;
        this.officeCode = officeCode;
        changeSupport.firePropertyChange("officeCode", oldOfficeCode, officeCode);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        String oldJobTitle = this.jobTitle;
        this.jobTitle = jobTitle;
        changeSupport.firePropertyChange("jobTitle", oldJobTitle, jobTitle);
    }

    public List<Employees_1> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees_1> employeesList) {
        this.employeesList = employeesList;
    }

    public Employees_1 getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employees_1 reportsTo) {
        Employees_1 oldReportsTo = this.reportsTo;
        this.reportsTo = reportsTo;
        changeSupport.firePropertyChange("reportsTo", oldReportsTo, reportsTo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeNumber != null ? employeeNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees_1)) {
            return false;
        }
        Employees_1 other = (Employees_1) object;
        if ((this.employeeNumber == null && other.employeeNumber != null) || (this.employeeNumber != null && !this.employeeNumber.equals(other.employeeNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "samplemanagersystem.Employees_1[ employeeNumber=" + employeeNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

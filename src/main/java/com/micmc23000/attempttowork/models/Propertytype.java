/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micmc23000.attempttowork.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "propertytype")
@NamedQueries({
    @NamedQuery(name = "Propertytype.findAll", query = "SELECT p FROM Propertytype p"),
    @NamedQuery(name = "Propertytype.findByPropertyTypeId", query = "SELECT p FROM Propertytype p WHERE p.propertyTypeId = :propertyTypeId"),
    @NamedQuery(name = "Propertytype.findByName", query = "SELECT p FROM Propertytype p WHERE p.name = :name")})
public class Propertytype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PropertyTypeId")
    private Integer propertyTypeId;
    @Size(max = 20)
    @Column(name = "Name")
    private String name;

    public Propertytype() {
    }

    public Propertytype(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyTypeId != null ? propertyTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propertytype)) {
            return false;
        }
        Propertytype other = (Propertytype) object;
        if ((this.propertyTypeId == null && other.propertyTypeId != null) || (this.propertyTypeId != null && !this.propertyTypeId.equals(other.propertyTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.micmc23000.attempttowork.Propertytype[ propertyTypeId=" + propertyTypeId + " ]";
    }
    
}

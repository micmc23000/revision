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
@Table(name = "garagetype")
@NamedQueries({
    @NamedQuery(name = "Garagetype.findAll", query = "SELECT g FROM Garagetype g"),
    @NamedQuery(name = "Garagetype.findByGarageTypeId", query = "SELECT g FROM Garagetype g WHERE g.garageTypeId = :garageTypeId"),
    @NamedQuery(name = "Garagetype.findByName", query = "SELECT g FROM Garagetype g WHERE g.name = :name")})
public class Garagetype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GarageTypeId")
    private Integer garageTypeId;
    @Size(max = 20)
    @Column(name = "Name")
    private String name;

    public Garagetype() {
    }

    public Garagetype(Integer garageTypeId) {
        this.garageTypeId = garageTypeId;
    }

    public Integer getGarageTypeId() {
        return garageTypeId;
    }

    public void setGarageTypeId(Integer garageTypeId) {
        this.garageTypeId = garageTypeId;
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
        hash += (garageTypeId != null ? garageTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Garagetype)) {
            return false;
        }
        Garagetype other = (Garagetype) object;
        if ((this.garageTypeId == null && other.garageTypeId != null) || (this.garageTypeId != null && !this.garageTypeId.equals(other.garageTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.micmc23000.attempttowork.Garagetype[ garageTypeId=" + garageTypeId + " ]";
    }
    
}

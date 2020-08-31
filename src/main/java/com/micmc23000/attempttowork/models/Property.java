/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micmc23000.attempttowork.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "property")
@NamedQueries({
    @NamedQuery(name = "Property.findAll", query = "SELECT p FROM Property p"),
    @NamedQuery(name = "Property.findByPropertyId", query = "SELECT p FROM Property p WHERE p.propertyId = :propertyId"),
    @NamedQuery(name = "Property.findByStreet", query = "SELECT p FROM Property p WHERE p.street = :street"),
    @NamedQuery(name = "Property.findByCity", query = "SELECT p FROM Property p WHERE p.city = :city"),
    @NamedQuery(name = "Property.findByListingNumber", query = "SELECT p FROM Property p WHERE p.listingNumber = :listingNumber"),
    @NamedQuery(name = "Property.findByStyleId", query = "SELECT p FROM Property p WHERE p.styleId = :styleId"),
    @NamedQuery(name = "Property.findByPropertyTypeId", query = "SELECT p FROM Property p WHERE p.propertyTypeId = :propertyTypeId"),
    @NamedQuery(name = "Property.findByBedrooms", query = "SELECT p FROM Property p WHERE p.bedrooms = :bedrooms"),
    @NamedQuery(name = "Property.findByBathrooms", query = "SELECT p FROM Property p WHERE p.bathrooms = :bathrooms"),
    @NamedQuery(name = "Property.findBySquareFeet", query = "SELECT p FROM Property p WHERE p.squareFeet = :squareFeet"),
    @NamedQuery(name = "Property.findByBerRating", query = "SELECT p FROM Property p WHERE p.berRating = :berRating"),
    @NamedQuery(name = "Property.findByLotSize", query = "SELECT p FROM Property p WHERE p.lotSize = :lotSize"),
    @NamedQuery(name = "Property.findByGarageSize", query = "SELECT p FROM Property p WHERE p.garageSize = :garageSize"),
    @NamedQuery(name = "Property.findByGarageTypeId", query = "SELECT p FROM Property p WHERE p.garageTypeId = :garageTypeId"),
    @NamedQuery(name = "Property.findByAgentId", query = "SELECT p FROM Property p WHERE p.agentId = :agentId"),
    @NamedQuery(name = "Property.findByPhotoFileName", query = "SELECT p FROM Property p WHERE p.photoFileName = :photoFileName"),
    @NamedQuery(name = "Property.findByPrice", query = "SELECT p FROM Property p WHERE p.price = :price"),
    @NamedQuery(name = "Property.findByDateAdded", query = "SELECT p FROM Property p WHERE p.dateAdded = :dateAdded")})
public class Property implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PropertyId")
    private Integer propertyId;
    @Size(max = 50)
    @Column(name = "Street")
    private String street;
    @Size(max = 25)
    @Column(name = "City")
    private String city;
    @Column(name = "ListingNumber")
    private Integer listingNumber;
    @Column(name = "StyleId")
    private Integer styleId;
    @Column(name = "PropertyTypeId")
    private Integer propertyTypeId;
    @Column(name = "Bedrooms")
    private Integer bedrooms;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Bathrooms")
    private Float bathrooms;
    @Column(name = "SquareFeet")
    private Integer squareFeet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "BerRating")
    private String berRating;
    @Lob
    @Size(max = 65535)
    @Column(name = "Description")
    private String description;
    @Size(max = 25)
    @Column(name = "LotSize")
    private String lotSize;
    @Column(name = "GarageSize")
    private Short garageSize;
    @Column(name = "GarageTypeId")
    private Integer garageTypeId;
    @Column(name = "AgentId")
    private Integer agentId;
    @Size(max = 50)
    @Column(name = "PhotoFileName")
    private String photoFileName;
    @Column(name = "Price")
    private Double price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateAdded")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;

    public Property() {
    }

    public Property(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Property(Integer propertyId, String berRating, Date dateAdded) {
        this.propertyId = propertyId;
        this.berRating = berRating;
        this.dateAdded = dateAdded;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getListingNumber() {
        return listingNumber;
    }

    public void setListingNumber(Integer listingNumber) {
        this.listingNumber = listingNumber;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Float getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Float bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Integer squareFeet) {
        this.squareFeet = squareFeet;
    }

    public String getBerRating() {
        return berRating;
    }

    public void setBerRating(String berRating) {
        this.berRating = berRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLotSize() {
        return lotSize;
    }

    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    public Short getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(Short garageSize) {
        this.garageSize = garageSize;
    }

    public Integer getGarageTypeId() {
        return garageTypeId;
    }

    public void setGarageTypeId(Integer garageTypeId) {
        this.garageTypeId = garageTypeId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyId != null ? propertyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Property)) {
            return false;
        }
        Property other = (Property) object;
        if ((this.propertyId == null && other.propertyId != null) || (this.propertyId != null && !this.propertyId.equals(other.propertyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.micmc23000.attempttowork.Property[ propertyId=" + propertyId + " ]";
    }
    
}

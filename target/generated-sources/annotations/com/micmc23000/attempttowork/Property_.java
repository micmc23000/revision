package com.micmc23000.attempttowork;

import com.micmc23000.attempttowork.models.Property;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-31T18:31:37")
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, Integer> agentId;
    public static volatile SingularAttribute<Property, String> photoFileName;
    public static volatile SingularAttribute<Property, String> city;
    public static volatile SingularAttribute<Property, String> berRating;
    public static volatile SingularAttribute<Property, String> lotSize;
    public static volatile SingularAttribute<Property, String> description;
    public static volatile SingularAttribute<Property, Float> bathrooms;
    public static volatile SingularAttribute<Property, Date> dateAdded;
    public static volatile SingularAttribute<Property, Integer> bedrooms;
    public static volatile SingularAttribute<Property, Integer> propertyTypeId;
    public static volatile SingularAttribute<Property, Integer> listingNumber;
    public static volatile SingularAttribute<Property, String> street;
    public static volatile SingularAttribute<Property, Integer> styleId;
    public static volatile SingularAttribute<Property, Double> price;
    public static volatile SingularAttribute<Property, Integer> squareFeet;
    public static volatile SingularAttribute<Property, Integer> garageTypeId;
    public static volatile SingularAttribute<Property, Integer> propertyId;
    public static volatile SingularAttribute<Property, Short> garageSize;

}
/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

public class GetCardResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4810027120006336347L;
    private String id;
    private String lastFourDigits;
    private String brand;
    private String holderName;
    private int expMonth;
    private int expYear;
    private String status;
    private DateTime createdAt;
    private DateTime updatedAt;
    private GetBillingAddressResponse billingAddress;
    private GetCustomerResponse customer;
    private LinkedHashMap<String, String> metadata;
    private String type;
    private String holderDocument;
    private DateTime deletedAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("last_four_digits")
    public String getLastFourDigits ( ) { 
        return this.lastFourDigits;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("last_four_digits")
    public void setLastFourDigits (String value) { 
        this.lastFourDigits = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("brand")
    public String getBrand ( ) { 
        return this.brand;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("brand")
    public void setBrand (String value) { 
        this.brand = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("holder_name")
    public String getHolderName ( ) { 
        return this.holderName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("holder_name")
    public void setHolderName (String value) { 
        this.holderName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exp_month")
    public int getExpMonth ( ) { 
        return this.expMonth;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exp_month")
    public void setExpMonth (int value) { 
        this.expMonth = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exp_year")
    public int getExpYear ( ) { 
        return this.expYear;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exp_year")
    public void setExpYear (int value) { 
        this.expYear = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_address")
    public GetBillingAddressResponse getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (GetBillingAddressResponse value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customer")
    public GetCustomerResponse getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customer")
    public void setCustomer (GetCustomerResponse value) { 
        this.customer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * Card type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Card type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Document number for the card's holder
     */
    @JsonGetter("holder_document")
    public String getHolderDocument ( ) { 
        return this.holderDocument;
    }
    
    /** SETTER
     * Document number for the card's holder
     */
    @JsonSetter("holder_document")
    public void setHolderDocument (String value) { 
        this.holderDocument = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deleted_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDeletedAt ( ) { 
        return this.deletedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt (DateTime value) { 
        this.deletedAt = value;
    }
 
}
 
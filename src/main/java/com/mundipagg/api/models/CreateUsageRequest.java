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

public class CreateUsageRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5709481668694913784L;
    private int quantity;
    private String description;
    private DateTime usedAt;
    private String code;
    private String group;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("quantity")
    public int getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (int value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("used_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUsedAt ( ) { 
        return this.usedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("used_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUsedAt (DateTime value) { 
        this.usedAt = value;
    }
 
    /** GETTER
     * Identification code in the client system
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Identification code in the client system
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * identification group in the client system
     */
    @JsonGetter("group")
    public String getGroup ( ) { 
        return this.group;
    }
    
    /** SETTER
     * identification group in the client system
     */
    @JsonSetter("group")
    public void setGroup (String value) { 
        this.group = value;
    }
 
}
 
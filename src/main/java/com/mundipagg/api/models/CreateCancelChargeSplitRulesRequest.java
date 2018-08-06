/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCancelChargeSplitRulesRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5416246792840431602L;
    private String id;
    private int amount;
    private String type;
    /** GETTER
     * The split rule gateway id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The split rule gateway id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * The split rule amount
     */
    @JsonGetter("Amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * The split rule amount
     */
    @JsonSetter("Amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * The amount type (flat ou percentage)
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The amount type (flat ou percentage)
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 
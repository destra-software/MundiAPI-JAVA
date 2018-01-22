/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSetupRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5667295613920440101L;
    private int amount;
    private String description;
    private CreatePaymentRequest payment;
    /** GETTER
     * Setup amount
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Setup amount
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Payment data
     */
    @JsonGetter("payment")
    public CreatePaymentRequest getPayment ( ) { 
        return this.payment;
    }
    
    /** SETTER
     * Payment data
     */
    @JsonSetter("payment")
    public void setPayment (CreatePaymentRequest value) { 
        this.payment = value;
    }
 
}
 
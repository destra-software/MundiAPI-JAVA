/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCheckoutCardInstallmentOptionRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5385144448724513214L;
    private int number;
    private int total;
    /** GETTER
     * Installment quantity
     */
    @JsonGetter("number")
    public int getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * Installment quantity
     */
    @JsonSetter("number")
    public void setNumber (int value) { 
        this.number = value;
    }
 
    /** GETTER
     * Total amount
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * Total amount
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
    }
 
}
 
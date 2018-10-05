/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCheckoutBankTransferRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2297303768365403301L;
    private List<String> bank;
    private int retries;
    /** GETTER
     * Bank
     */
    @JsonGetter("bank")
    public List<String> getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * Bank
     */
    @JsonSetter("bank")
    public void setBank (List<String> value) { 
        this.bank = value;
    }
 
    /** GETTER
     * Number of retries for processing
     */
    @JsonGetter("retries")
    public int getRetries ( ) { 
        return this.retries;
    }
    
    /** SETTER
     * Number of retries for processing
     */
    @JsonSetter("retries")
    public void setRetries (int value) { 
        this.retries = value;
    }
 
}
 
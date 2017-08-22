/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetSafetyPayTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = 4638399390287593981L;
    private String url;
    private String bankTid;
    private Date paidAt;
    private Integer paidAmount;
    /** GETTER
     * Payment url
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * Payment url
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * Transaction identifier on bank
     */
    @JsonGetter("bank_tid")
    public String getBankTid ( ) { 
        return this.bankTid;
    }
    
    /** SETTER
     * Transaction identifier on bank
     */
    @JsonSetter("bank_tid")
    public void setBankTid (String value) { 
        this.bankTid = value;
    }
 
    /** GETTER
     * Payment date
     */
    @JsonGetter("paid_at")
    public Date getPaidAt ( ) { 
        return this.paidAt;
    }
    
    /** SETTER
     * Payment date
     */
    @JsonSetter("paid_at")
    public void setPaidAt (Date value) { 
        this.paidAt = value;
    }
 
    /** GETTER
     * Paid amount
     */
    @JsonGetter("paid_amount")
    public Integer getPaidAmount ( ) { 
        return this.paidAmount;
    }
    
    /** SETTER
     * Paid amount
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount (Integer value) { 
        this.paidAmount = value;
    }
 
}
 
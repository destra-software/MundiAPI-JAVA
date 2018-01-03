/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListRecipientResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5245791011254170035L;
    private List<GetRecipientResponse> data;
    private PagingResponse paging;
    /** GETTER
     * Recipients
     */
    @JsonGetter("data")
    public List<GetRecipientResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * Recipients
     */
    @JsonSetter("data")
    public void setData (List<GetRecipientResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 
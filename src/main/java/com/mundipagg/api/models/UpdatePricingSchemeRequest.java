/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class UpdatePricingSchemeRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -8655159033752113243L;
    private String schemeType;
    private List<UpdatePriceBracketRequest> priceBrackets;
    private Integer price;
    private Integer minimumPrice;
    private Double percentage;
    /** GETTER
     * Scheme type
     */
    @JsonGetter("scheme_type")
    public String getSchemeType ( ) { 
        return this.schemeType;
    }
    
    /** SETTER
     * Scheme type
     */
    @JsonSetter("scheme_type")
    public void setSchemeType (String value) { 
        this.schemeType = value;
    }
 
    /** GETTER
     * Price brackets
     */
    @JsonGetter("price_brackets")
    public List<UpdatePriceBracketRequest> getPriceBrackets ( ) { 
        return this.priceBrackets;
    }
    
    /** SETTER
     * Price brackets
     */
    @JsonSetter("price_brackets")
    public void setPriceBrackets (List<UpdatePriceBracketRequest> value) { 
        this.priceBrackets = value;
    }
 
    /** GETTER
     * Price
     */
    @JsonGetter("price")
    public Integer getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * Price
     */
    @JsonSetter("price")
    public void setPrice (Integer value) { 
        this.price = value;
    }
 
    /** GETTER
     * Minimum price
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * Minimum price
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
    /** GETTER
     * percentual value used in pricing_scheme Percent
     */
    @JsonGetter("percentage")
    public Double getPercentage ( ) { 
        return this.percentage;
    }
    
    /** SETTER
     * percentual value used in pricing_scheme Percent
     */
    @JsonSetter("percentage")
    public void setPercentage (Double value) { 
        this.percentage = value;
    }
 
}

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

public class GetPeriodResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5196086154198511028L;
    private DateTime startAt;
    private DateTime endAt;
    private String id;
    private DateTime billingAt;
    private GetSubscriptionResponse subscription;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("start_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getStartAt ( ) { 
        return this.startAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("start_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartAt (DateTime value) { 
        this.startAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("end_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getEndAt ( ) { 
        return this.endAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("end_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndAt (DateTime value) { 
        this.endAt = value;
    }
 
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
    @JsonGetter("billing_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getBillingAt ( ) { 
        return this.billingAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBillingAt (DateTime value) { 
        this.billingAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("subscription")
    public GetSubscriptionResponse getSubscription ( ) { 
        return this.subscription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("subscription")
    public void setSubscription (GetSubscriptionResponse value) { 
        this.subscription = value;
    }
 
}
 
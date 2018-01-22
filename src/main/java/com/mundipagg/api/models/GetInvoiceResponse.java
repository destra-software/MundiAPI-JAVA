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

public class GetInvoiceResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5340430381479436639L;
    private String id;
    private String code;
    private String url;
    private int amount;
    private String status;
    private String paymentMethod;
    private DateTime createdAt;
    private List<GetInvoiceItemResponse> items;
    private GetCustomerResponse customer;
    private GetChargeResponse charge;
    private int installments;
    private GetBillingAddressResponse billingAddress;
    private GetSubscriptionResponse subscription;
    private GetPeriodResponse cycle;
    private GetShippingResponse shipping;
    private LinkedHashMap<String, String> metadata;
    private DateTime dueAt;
    private DateTime canceledAt;
    private DateTime billingAt;
    private DateTime seenAt;
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
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
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
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
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
    @JsonGetter("items")
    public List<GetInvoiceItemResponse> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("items")
    public void setItems (List<GetInvoiceItemResponse> value) { 
        this.items = value;
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
    @JsonGetter("charge")
    public GetChargeResponse getCharge ( ) { 
        return this.charge;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("charge")
    public void setCharge (GetChargeResponse value) { 
        this.charge = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("installments")
    public int getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("installments")
    public void setInstallments (int value) { 
        this.installments = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cycle")
    public GetPeriodResponse getCycle ( ) { 
        return this.cycle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cycle")
    public void setCycle (GetPeriodResponse value) { 
        this.cycle = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("shipping")
    public GetShippingResponse getShipping ( ) { 
        return this.shipping;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("shipping")
    public void setShipping (GetShippingResponse value) { 
        this.shipping = value;
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
     * TODO: Write general description for this method
     */
    @JsonGetter("due_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDueAt ( ) { 
        return this.dueAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt (DateTime value) { 
        this.dueAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("canceled_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCanceledAt ( ) { 
        return this.canceledAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("canceled_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCanceledAt (DateTime value) { 
        this.canceledAt = value;
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
    @JsonGetter("seen_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getSeenAt ( ) { 
        return this.seenAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("seen_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setSeenAt (DateTime value) { 
        this.seenAt = value;
    }
 
}
 
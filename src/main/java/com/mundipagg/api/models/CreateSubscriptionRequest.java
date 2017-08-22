/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSubscriptionRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4912253889012952779L;
    private CreateCustomerRequest customer;
    private CreateCardRequest card;
    private String code;
    private String paymentMethod;
    private String billingType;
    private String statementDescriptor;
    private String description;
    private String currency;
    private String interval;
    private int intervalCount;
    private CreatePricingSchemeRequest pricingScheme;
    private List<CreateSubscriptionItemRequest> items;
    private CreateShippingRequest shipping;
    private List<CreateDiscountRequest> discounts;
    private LinkedHashMap<String, String> metadata;
    private CreateSetupRequest setup;
    private String planId;
    private String customerId;
    private String cardId;
    private Integer billingDay;
    private Integer installments;
    private Date startAt;
    private Integer minimumPrice;
    private Integer cycles;
    private String cardToken;
    /** GETTER
     * Customer
     */
    @JsonGetter("customer")
    public CreateCustomerRequest getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * Customer
     */
    @JsonSetter("customer")
    public void setCustomer (CreateCustomerRequest value) { 
        this.customer = value;
    }
 
    /** GETTER
     * Card
     */
    @JsonGetter("card")
    public CreateCardRequest getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Card
     */
    @JsonSetter("card")
    public void setCard (CreateCardRequest value) { 
        this.card = value;
    }
 
    /** GETTER
     * Subscription code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Subscription code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * Payment method
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * Payment method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
    }
 
    /** GETTER
     * Billing type
     */
    @JsonGetter("billing_type")
    public String getBillingType ( ) { 
        return this.billingType;
    }
    
    /** SETTER
     * Billing type
     */
    @JsonSetter("billing_type")
    public void setBillingType (String value) { 
        this.billingType = value;
    }
 
    /** GETTER
     * Statement descriptor for credit card subscriptions
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Statement descriptor for credit card subscriptions
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Subscription description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Subscription description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Currency
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * Currency
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * Interval
     */
    @JsonGetter("interval")
    public String getInterval ( ) { 
        return this.interval;
    }
    
    /** SETTER
     * Interval
     */
    @JsonSetter("interval")
    public void setInterval (String value) { 
        this.interval = value;
    }
 
    /** GETTER
     * Interval count
     */
    @JsonGetter("interval_count")
    public int getIntervalCount ( ) { 
        return this.intervalCount;
    }
    
    /** SETTER
     * Interval count
     */
    @JsonSetter("interval_count")
    public void setIntervalCount (int value) { 
        this.intervalCount = value;
    }
 
    /** GETTER
     * Subscription pricing scheme
     */
    @JsonGetter("pricing_scheme")
    public CreatePricingSchemeRequest getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * Subscription pricing scheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (CreatePricingSchemeRequest value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * Subscription items
     */
    @JsonGetter("items")
    public List<CreateSubscriptionItemRequest> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * Subscription items
     */
    @JsonSetter("items")
    public void setItems (List<CreateSubscriptionItemRequest> value) { 
        this.items = value;
    }
 
    /** GETTER
     * Shipping
     */
    @JsonGetter("shipping")
    public CreateShippingRequest getShipping ( ) { 
        return this.shipping;
    }
    
    /** SETTER
     * Shipping
     */
    @JsonSetter("shipping")
    public void setShipping (CreateShippingRequest value) { 
        this.shipping = value;
    }
 
    /** GETTER
     * Discounts
     */
    @JsonGetter("discounts")
    public List<CreateDiscountRequest> getDiscounts ( ) { 
        return this.discounts;
    }
    
    /** SETTER
     * Discounts
     */
    @JsonSetter("discounts")
    public void setDiscounts (List<CreateDiscountRequest> value) { 
        this.discounts = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * Setup data
     */
    @JsonGetter("setup")
    public CreateSetupRequest getSetup ( ) { 
        return this.setup;
    }
    
    /** SETTER
     * Setup data
     */
    @JsonSetter("setup")
    public void setSetup (CreateSetupRequest value) { 
        this.setup = value;
    }
 
    /** GETTER
     * Plan id
     */
    @JsonGetter("plan_id")
    public String getPlanId ( ) { 
        return this.planId;
    }
    
    /** SETTER
     * Plan id
     */
    @JsonSetter("plan_id")
    public void setPlanId (String value) { 
        this.planId = value;
    }
 
    /** GETTER
     * Customer id
     */
    @JsonGetter("customer_id")
    public String getCustomerId ( ) { 
        return this.customerId;
    }
    
    /** SETTER
     * Customer id
     */
    @JsonSetter("customer_id")
    public void setCustomerId (String value) { 
        this.customerId = value;
    }
 
    /** GETTER
     * Card id
     */
    @JsonGetter("card_id")
    public String getCardId ( ) { 
        return this.cardId;
    }
    
    /** SETTER
     * Card id
     */
    @JsonSetter("card_id")
    public void setCardId (String value) { 
        this.cardId = value;
    }
 
    /** GETTER
     * Billing day
     */
    @JsonGetter("billing_day")
    public Integer getBillingDay ( ) { 
        return this.billingDay;
    }
    
    /** SETTER
     * Billing day
     */
    @JsonSetter("billing_day")
    public void setBillingDay (Integer value) { 
        this.billingDay = value;
    }
 
    /** GETTER
     * Number of installments
     */
    @JsonGetter("installments")
    public Integer getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * Number of installments
     */
    @JsonSetter("installments")
    public void setInstallments (Integer value) { 
        this.installments = value;
    }
 
    /** GETTER
     * Subscription start date
     */
    @JsonGetter("start_at")
    public Date getStartAt ( ) { 
        return this.startAt;
    }
    
    /** SETTER
     * Subscription start date
     */
    @JsonSetter("start_at")
    public void setStartAt (Date value) { 
        this.startAt = value;
    }
 
    /** GETTER
     * Subscription minimum price
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * Subscription minimum price
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
    /** GETTER
     * Number of cycles
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * Card token
     */
    @JsonGetter("card_token")
    public String getCardToken ( ) { 
        return this.cardToken;
    }
    
    /** SETTER
     * Card token
     */
    @JsonSetter("card_token")
    public void setCardToken (String value) { 
        this.cardToken = value;
    }
 
}
 
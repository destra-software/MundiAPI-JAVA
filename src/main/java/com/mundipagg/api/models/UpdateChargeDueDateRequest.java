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

public class UpdateChargeDueDateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5060319138227826604L;
    private DateTime dueAt;
    /** GETTER
     * The charge's new due date
     */
    @JsonGetter("due_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDueAt ( ) { 
        return this.dueAt;
    }
    
    /** SETTER
     * The charge's new due date
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt (DateTime value) { 
        this.dueAt = value;
    }
 
}
 
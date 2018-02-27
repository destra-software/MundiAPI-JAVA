/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetSellerResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4795730094659267003L;
    private String id;
    private String name;
    private String code;
    private String document;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;
    private GetAddressResponse address;
    private LinkedHashMap<String, String> metadata;
    private String deletedAt;
    /** GETTER
     * Identification
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Identification
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
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
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
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
     * Status
     */
    @JsonGetter("Status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("Status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Creation date
     */
    @JsonGetter("CreatedAt")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Creation date
     */
    @JsonSetter("CreatedAt")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Updated date
     */
    @JsonGetter("UpdatedAt")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Updated date
     */
    @JsonSetter("UpdatedAt")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * Address
     */
    @JsonGetter("Address")
    public GetAddressResponse getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Address
     */
    @JsonSetter("Address")
    public void setAddress (GetAddressResponse value) { 
        this.address = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("Metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("Metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * Deleted date
     */
    @JsonGetter("DeletedAt")
    public String getDeletedAt ( ) { 
        return this.deletedAt;
    }
    
    /** SETTER
     * Deleted date
     */
    @JsonSetter("DeletedAt")
    public void setDeletedAt (String value) { 
        this.deletedAt = value;
    }
 
}
 
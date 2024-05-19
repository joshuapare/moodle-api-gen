/*
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.joshuapare.JSON;

/**
 * BlockIomadCompanyAdminRestrictCapabilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminRestrictCapabilityRequest {
  public static final String SERIALIZED_NAME_ALLOW = "allow";
  @SerializedName(SERIALIZED_NAME_ALLOW)
  private Boolean allow = null;

  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private String capability = "null";

  public static final String SERIALIZED_NAME_COMPANYID = "companyid";
  @SerializedName(SERIALIZED_NAME_COMPANYID)
  private Integer companyid = null;

  public static final String SERIALIZED_NAME_ROLEID = "roleid";
  @SerializedName(SERIALIZED_NAME_ROLEID)
  private Integer roleid = null;

  public static final String SERIALIZED_NAME_TEMPLATEID = "templateid";
  @SerializedName(SERIALIZED_NAME_TEMPLATEID)
  private Integer templateid = 0;

  public BlockIomadCompanyAdminRestrictCapabilityRequest() {
  }

  public BlockIomadCompanyAdminRestrictCapabilityRequest allow(Boolean allow) {
    this.allow = allow;
    return this;
  }

   /**
   * Set capability?
   * @return allow
  **/
  @javax.annotation.Nonnull
  public Boolean getAllow() {
    return allow;
  }

  public void setAllow(Boolean allow) {
    this.allow = allow;
  }


  public BlockIomadCompanyAdminRestrictCapabilityRequest capability(String capability) {
    this.capability = capability;
    return this;
  }

   /**
   * The capability
   * @return capability
  **/
  @javax.annotation.Nonnull
  public String getCapability() {
    return capability;
  }

  public void setCapability(String capability) {
    this.capability = capability;
  }


  public BlockIomadCompanyAdminRestrictCapabilityRequest companyid(Integer companyid) {
    this.companyid = companyid;
    return this;
  }

   /**
   * Company ID. Ignored if templateid is non-zero
   * @return companyid
  **/
  @javax.annotation.Nonnull
  public Integer getCompanyid() {
    return companyid;
  }

  public void setCompanyid(Integer companyid) {
    this.companyid = companyid;
  }


  public BlockIomadCompanyAdminRestrictCapabilityRequest roleid(Integer roleid) {
    this.roleid = roleid;
    return this;
  }

   /**
   * Role ID
   * @return roleid
  **/
  @javax.annotation.Nonnull
  public Integer getRoleid() {
    return roleid;
  }

  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
  }


  public BlockIomadCompanyAdminRestrictCapabilityRequest templateid(Integer templateid) {
    this.templateid = templateid;
    return this;
  }

   /**
   * Template ID. Set to 0 if company restriction
   * @return templateid
  **/
  @javax.annotation.Nullable
  public Integer getTemplateid() {
    return templateid;
  }

  public void setTemplateid(Integer templateid) {
    this.templateid = templateid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminRestrictCapabilityRequest blockIomadCompanyAdminRestrictCapabilityRequest = (BlockIomadCompanyAdminRestrictCapabilityRequest) o;
    return Objects.equals(this.allow, blockIomadCompanyAdminRestrictCapabilityRequest.allow) &&
        Objects.equals(this.capability, blockIomadCompanyAdminRestrictCapabilityRequest.capability) &&
        Objects.equals(this.companyid, blockIomadCompanyAdminRestrictCapabilityRequest.companyid) &&
        Objects.equals(this.roleid, blockIomadCompanyAdminRestrictCapabilityRequest.roleid) &&
        Objects.equals(this.templateid, blockIomadCompanyAdminRestrictCapabilityRequest.templateid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, capability, companyid, roleid, templateid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminRestrictCapabilityRequest {\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    companyid: ").append(toIndentedString(companyid)).append("\n");
    sb.append("    roleid: ").append(toIndentedString(roleid)).append("\n");
    sb.append("    templateid: ").append(toIndentedString(templateid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("allow");
    openapiFields.add("capability");
    openapiFields.add("companyid");
    openapiFields.add("roleid");
    openapiFields.add("templateid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("allow");
    openapiRequiredFields.add("capability");
    openapiRequiredFields.add("companyid");
    openapiRequiredFields.add("roleid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminRestrictCapabilityRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminRestrictCapabilityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminRestrictCapabilityRequest is not found in the empty JSON string", BlockIomadCompanyAdminRestrictCapabilityRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminRestrictCapabilityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminRestrictCapabilityRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlockIomadCompanyAdminRestrictCapabilityRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("capability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `capability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("capability").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminRestrictCapabilityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminRestrictCapabilityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminRestrictCapabilityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminRestrictCapabilityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminRestrictCapabilityRequest>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminRestrictCapabilityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminRestrictCapabilityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminRestrictCapabilityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminRestrictCapabilityRequest
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminRestrictCapabilityRequest
  */
  public static BlockIomadCompanyAdminRestrictCapabilityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminRestrictCapabilityRequest.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminRestrictCapabilityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


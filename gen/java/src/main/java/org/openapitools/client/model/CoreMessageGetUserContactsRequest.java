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
 * CoreMessageGetUserContactsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetUserContactsRequest {
  public static final String SERIALIZED_NAME_LIMITFROM = "limitfrom";
  @SerializedName(SERIALIZED_NAME_LIMITFROM)
  private Integer limitfrom = 0;

  public static final String SERIALIZED_NAME_LIMITNUM = "limitnum";
  @SerializedName(SERIALIZED_NAME_LIMITNUM)
  private Integer limitnum = 0;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public CoreMessageGetUserContactsRequest() {
  }

  public CoreMessageGetUserContactsRequest limitfrom(Integer limitfrom) {
    this.limitfrom = limitfrom;
    return this;
  }

   /**
   * Limit from
   * @return limitfrom
  **/
  @javax.annotation.Nullable
  public Integer getLimitfrom() {
    return limitfrom;
  }

  public void setLimitfrom(Integer limitfrom) {
    this.limitfrom = limitfrom;
  }


  public CoreMessageGetUserContactsRequest limitnum(Integer limitnum) {
    this.limitnum = limitnum;
    return this;
  }

   /**
   * Limit number
   * @return limitnum
  **/
  @javax.annotation.Nullable
  public Integer getLimitnum() {
    return limitnum;
  }

  public void setLimitnum(Integer limitnum) {
    this.limitnum = limitnum;
  }


  public CoreMessageGetUserContactsRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The id of the user who we retrieving the contacts for
   * @return userid
  **/
  @javax.annotation.Nonnull
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetUserContactsRequest coreMessageGetUserContactsRequest = (CoreMessageGetUserContactsRequest) o;
    return Objects.equals(this.limitfrom, coreMessageGetUserContactsRequest.limitfrom) &&
        Objects.equals(this.limitnum, coreMessageGetUserContactsRequest.limitnum) &&
        Objects.equals(this.userid, coreMessageGetUserContactsRequest.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitfrom, limitnum, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetUserContactsRequest {\n");
    sb.append("    limitfrom: ").append(toIndentedString(limitfrom)).append("\n");
    sb.append("    limitnum: ").append(toIndentedString(limitnum)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
    openapiFields.add("limitfrom");
    openapiFields.add("limitnum");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetUserContactsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetUserContactsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetUserContactsRequest is not found in the empty JSON string", CoreMessageGetUserContactsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetUserContactsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetUserContactsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageGetUserContactsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetUserContactsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetUserContactsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetUserContactsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetUserContactsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetUserContactsRequest>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetUserContactsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetUserContactsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetUserContactsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetUserContactsRequest
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetUserContactsRequest
  */
  public static CoreMessageGetUserContactsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetUserContactsRequest.class);
  }

 /**
  * Convert an instance of CoreMessageGetUserContactsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


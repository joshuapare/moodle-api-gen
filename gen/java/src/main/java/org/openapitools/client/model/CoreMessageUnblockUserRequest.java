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
 * CoreMessageUnblockUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageUnblockUserRequest {
  public static final String SERIALIZED_NAME_UNBLOCKEDUSERID = "unblockeduserid";
  @SerializedName(SERIALIZED_NAME_UNBLOCKEDUSERID)
  private Integer unblockeduserid = null;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public CoreMessageUnblockUserRequest() {
  }

  public CoreMessageUnblockUserRequest unblockeduserid(Integer unblockeduserid) {
    this.unblockeduserid = unblockeduserid;
    return this;
  }

   /**
   * The id of the user being unblocked
   * @return unblockeduserid
  **/
  @javax.annotation.Nonnull
  public Integer getUnblockeduserid() {
    return unblockeduserid;
  }

  public void setUnblockeduserid(Integer unblockeduserid) {
    this.unblockeduserid = unblockeduserid;
  }


  public CoreMessageUnblockUserRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The id of the user who is unblocking
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
    CoreMessageUnblockUserRequest coreMessageUnblockUserRequest = (CoreMessageUnblockUserRequest) o;
    return Objects.equals(this.unblockeduserid, coreMessageUnblockUserRequest.unblockeduserid) &&
        Objects.equals(this.userid, coreMessageUnblockUserRequest.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unblockeduserid, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageUnblockUserRequest {\n");
    sb.append("    unblockeduserid: ").append(toIndentedString(unblockeduserid)).append("\n");
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
    openapiFields.add("unblockeduserid");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("unblockeduserid");
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageUnblockUserRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageUnblockUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageUnblockUserRequest is not found in the empty JSON string", CoreMessageUnblockUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageUnblockUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageUnblockUserRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageUnblockUserRequest.openapiRequiredFields) {
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
       if (!CoreMessageUnblockUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageUnblockUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageUnblockUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageUnblockUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageUnblockUserRequest>() {
           @Override
           public void write(JsonWriter out, CoreMessageUnblockUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageUnblockUserRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageUnblockUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageUnblockUserRequest
  * @throws IOException if the JSON string is invalid with respect to CoreMessageUnblockUserRequest
  */
  public static CoreMessageUnblockUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageUnblockUserRequest.class);
  }

 /**
  * Convert an instance of CoreMessageUnblockUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


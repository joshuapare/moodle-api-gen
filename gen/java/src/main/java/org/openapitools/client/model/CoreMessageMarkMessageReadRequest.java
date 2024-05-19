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
 * CoreMessageMarkMessageReadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageMarkMessageReadRequest {
  public static final String SERIALIZED_NAME_MESSAGEID = "messageid";
  @SerializedName(SERIALIZED_NAME_MESSAGEID)
  private Integer messageid = null;

  public static final String SERIALIZED_NAME_TIMEREAD = "timeread";
  @SerializedName(SERIALIZED_NAME_TIMEREAD)
  private Integer timeread = 0;

  public CoreMessageMarkMessageReadRequest() {
  }

  public CoreMessageMarkMessageReadRequest messageid(Integer messageid) {
    this.messageid = messageid;
    return this;
  }

   /**
   * id of the message in the messages table
   * @return messageid
  **/
  @javax.annotation.Nonnull
  public Integer getMessageid() {
    return messageid;
  }

  public void setMessageid(Integer messageid) {
    this.messageid = messageid;
  }


  public CoreMessageMarkMessageReadRequest timeread(Integer timeread) {
    this.timeread = timeread;
    return this;
  }

   /**
   * timestamp for when the message should be marked read
   * @return timeread
  **/
  @javax.annotation.Nullable
  public Integer getTimeread() {
    return timeread;
  }

  public void setTimeread(Integer timeread) {
    this.timeread = timeread;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageMarkMessageReadRequest coreMessageMarkMessageReadRequest = (CoreMessageMarkMessageReadRequest) o;
    return Objects.equals(this.messageid, coreMessageMarkMessageReadRequest.messageid) &&
        Objects.equals(this.timeread, coreMessageMarkMessageReadRequest.timeread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageid, timeread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageMarkMessageReadRequest {\n");
    sb.append("    messageid: ").append(toIndentedString(messageid)).append("\n");
    sb.append("    timeread: ").append(toIndentedString(timeread)).append("\n");
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
    openapiFields.add("messageid");
    openapiFields.add("timeread");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messageid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageMarkMessageReadRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageMarkMessageReadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageMarkMessageReadRequest is not found in the empty JSON string", CoreMessageMarkMessageReadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageMarkMessageReadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageMarkMessageReadRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageMarkMessageReadRequest.openapiRequiredFields) {
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
       if (!CoreMessageMarkMessageReadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageMarkMessageReadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageMarkMessageReadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageMarkMessageReadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageMarkMessageReadRequest>() {
           @Override
           public void write(JsonWriter out, CoreMessageMarkMessageReadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageMarkMessageReadRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageMarkMessageReadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageMarkMessageReadRequest
  * @throws IOException if the JSON string is invalid with respect to CoreMessageMarkMessageReadRequest
  */
  public static CoreMessageMarkMessageReadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageMarkMessageReadRequest.class);
  }

 /**
  * Convert an instance of CoreMessageMarkMessageReadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


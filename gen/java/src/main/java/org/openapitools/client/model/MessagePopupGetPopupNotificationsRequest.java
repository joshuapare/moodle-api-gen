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
 * MessagePopupGetPopupNotificationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class MessagePopupGetPopupNotificationsRequest {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 0;

  public static final String SERIALIZED_NAME_NEWESTFIRST = "newestfirst";
  @SerializedName(SERIALIZED_NAME_NEWESTFIRST)
  private Boolean newestfirst = true;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_USERIDTO = "useridto";
  @SerializedName(SERIALIZED_NAME_USERIDTO)
  private Integer useridto = null;

  public MessagePopupGetPopupNotificationsRequest() {
  }

  public MessagePopupGetPopupNotificationsRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * the number of results to return
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public MessagePopupGetPopupNotificationsRequest newestfirst(Boolean newestfirst) {
    this.newestfirst = newestfirst;
    return this;
  }

   /**
   * true for ordering by newest first, false for oldest first
   * @return newestfirst
  **/
  @javax.annotation.Nullable
  public Boolean getNewestfirst() {
    return newestfirst;
  }

  public void setNewestfirst(Boolean newestfirst) {
    this.newestfirst = newestfirst;
  }


  public MessagePopupGetPopupNotificationsRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * offset the result set by a given amount
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public MessagePopupGetPopupNotificationsRequest useridto(Integer useridto) {
    this.useridto = useridto;
    return this;
  }

   /**
   * the user id who received the message, 0 for current user
   * @return useridto
  **/
  @javax.annotation.Nonnull
  public Integer getUseridto() {
    return useridto;
  }

  public void setUseridto(Integer useridto) {
    this.useridto = useridto;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePopupGetPopupNotificationsRequest messagePopupGetPopupNotificationsRequest = (MessagePopupGetPopupNotificationsRequest) o;
    return Objects.equals(this.limit, messagePopupGetPopupNotificationsRequest.limit) &&
        Objects.equals(this.newestfirst, messagePopupGetPopupNotificationsRequest.newestfirst) &&
        Objects.equals(this.offset, messagePopupGetPopupNotificationsRequest.offset) &&
        Objects.equals(this.useridto, messagePopupGetPopupNotificationsRequest.useridto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, newestfirst, offset, useridto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePopupGetPopupNotificationsRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    newestfirst: ").append(toIndentedString(newestfirst)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    useridto: ").append(toIndentedString(useridto)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("newestfirst");
    openapiFields.add("offset");
    openapiFields.add("useridto");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("useridto");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MessagePopupGetPopupNotificationsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessagePopupGetPopupNotificationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessagePopupGetPopupNotificationsRequest is not found in the empty JSON string", MessagePopupGetPopupNotificationsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MessagePopupGetPopupNotificationsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessagePopupGetPopupNotificationsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessagePopupGetPopupNotificationsRequest.openapiRequiredFields) {
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
       if (!MessagePopupGetPopupNotificationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessagePopupGetPopupNotificationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessagePopupGetPopupNotificationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessagePopupGetPopupNotificationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MessagePopupGetPopupNotificationsRequest>() {
           @Override
           public void write(JsonWriter out, MessagePopupGetPopupNotificationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessagePopupGetPopupNotificationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessagePopupGetPopupNotificationsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessagePopupGetPopupNotificationsRequest
  * @throws IOException if the JSON string is invalid with respect to MessagePopupGetPopupNotificationsRequest
  */
  public static MessagePopupGetPopupNotificationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessagePopupGetPopupNotificationsRequest.class);
  }

 /**
  * Convert an instance of MessagePopupGetPopupNotificationsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

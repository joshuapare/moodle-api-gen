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
 * CoreMessageGetUnreadConversationCounts200ResponseTypes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetUnreadConversationCounts200ResponseTypes {
  public static final String SERIALIZED_NAME_1 = "1";
  @SerializedName(SERIALIZED_NAME_1)
  private Integer _1 = null;

  public static final String SERIALIZED_NAME_2 = "2";
  @SerializedName(SERIALIZED_NAME_2)
  private Integer _2 = null;

  public static final String SERIALIZED_NAME_3 = "3";
  @SerializedName(SERIALIZED_NAME_3)
  private Integer _3 = null;

  public CoreMessageGetUnreadConversationCounts200ResponseTypes() {
  }

  public CoreMessageGetUnreadConversationCounts200ResponseTypes _1(Integer _1) {
    this._1 = _1;
    return this;
  }

   /**
   * Total number of unread individual conversations
   * @return _1
  **/
  @javax.annotation.Nonnull
  public Integer get1() {
    return _1;
  }

  public void set1(Integer _1) {
    this._1 = _1;
  }


  public CoreMessageGetUnreadConversationCounts200ResponseTypes _2(Integer _2) {
    this._2 = _2;
    return this;
  }

   /**
   * Total number of unread group conversations
   * @return _2
  **/
  @javax.annotation.Nonnull
  public Integer get2() {
    return _2;
  }

  public void set2(Integer _2) {
    this._2 = _2;
  }


  public CoreMessageGetUnreadConversationCounts200ResponseTypes _3(Integer _3) {
    this._3 = _3;
    return this;
  }

   /**
   * Total number of unread self conversations
   * @return _3
  **/
  @javax.annotation.Nonnull
  public Integer get3() {
    return _3;
  }

  public void set3(Integer _3) {
    this._3 = _3;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetUnreadConversationCounts200ResponseTypes coreMessageGetUnreadConversationCounts200ResponseTypes = (CoreMessageGetUnreadConversationCounts200ResponseTypes) o;
    return Objects.equals(this._1, coreMessageGetUnreadConversationCounts200ResponseTypes._1) &&
        Objects.equals(this._2, coreMessageGetUnreadConversationCounts200ResponseTypes._2) &&
        Objects.equals(this._3, coreMessageGetUnreadConversationCounts200ResponseTypes._3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1, _2, _3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetUnreadConversationCounts200ResponseTypes {\n");
    sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
    sb.append("    _2: ").append(toIndentedString(_2)).append("\n");
    sb.append("    _3: ").append(toIndentedString(_3)).append("\n");
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
    openapiFields.add("1");
    openapiFields.add("2");
    openapiFields.add("3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("1");
    openapiRequiredFields.add("2");
    openapiRequiredFields.add("3");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetUnreadConversationCounts200ResponseTypes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetUnreadConversationCounts200ResponseTypes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetUnreadConversationCounts200ResponseTypes is not found in the empty JSON string", CoreMessageGetUnreadConversationCounts200ResponseTypes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetUnreadConversationCounts200ResponseTypes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetUnreadConversationCounts200ResponseTypes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageGetUnreadConversationCounts200ResponseTypes.openapiRequiredFields) {
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
       if (!CoreMessageGetUnreadConversationCounts200ResponseTypes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetUnreadConversationCounts200ResponseTypes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetUnreadConversationCounts200ResponseTypes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetUnreadConversationCounts200ResponseTypes.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetUnreadConversationCounts200ResponseTypes>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetUnreadConversationCounts200ResponseTypes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetUnreadConversationCounts200ResponseTypes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetUnreadConversationCounts200ResponseTypes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetUnreadConversationCounts200ResponseTypes
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetUnreadConversationCounts200ResponseTypes
  */
  public static CoreMessageGetUnreadConversationCounts200ResponseTypes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetUnreadConversationCounts200ResponseTypes.class);
  }

 /**
  * Convert an instance of CoreMessageGetUnreadConversationCounts200ResponseTypes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = "null";

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = "null";

  public CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner() {
  }

  public CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The data that failed the validation
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner coreEnrolUnenrolUserEnrolment200ResponseErrorsInner = (CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner) o;
    return Objects.equals(this.key, coreEnrolUnenrolUserEnrolment200ResponseErrorsInner.key) &&
        Objects.equals(this.message, coreEnrolUnenrolUserEnrolment200ResponseErrorsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner is not found in the empty JSON string", CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner>() {
           @Override
           public void write(JsonWriter out, CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner
  * @throws IOException if the JSON string is invalid with respect to CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner
  */
  public static CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.class);
  }

 /**
  * Convert an instance of CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


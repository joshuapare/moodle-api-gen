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
 * CoreChangeEditmodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreChangeEditmodeRequest {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Integer context = null;

  public static final String SERIALIZED_NAME_SETMODE = "setmode";
  @SerializedName(SERIALIZED_NAME_SETMODE)
  private Boolean setmode = null;

  public CoreChangeEditmodeRequest() {
  }

  public CoreChangeEditmodeRequest context(Integer context) {
    this.context = context;
    return this;
  }

   /**
   * Page context id
   * @return context
  **/
  @javax.annotation.Nonnull
  public Integer getContext() {
    return context;
  }

  public void setContext(Integer context) {
    this.context = context;
  }


  public CoreChangeEditmodeRequest setmode(Boolean setmode) {
    this.setmode = setmode;
    return this;
  }

   /**
   * Set edit mode to
   * @return setmode
  **/
  @javax.annotation.Nonnull
  public Boolean getSetmode() {
    return setmode;
  }

  public void setSetmode(Boolean setmode) {
    this.setmode = setmode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreChangeEditmodeRequest coreChangeEditmodeRequest = (CoreChangeEditmodeRequest) o;
    return Objects.equals(this.context, coreChangeEditmodeRequest.context) &&
        Objects.equals(this.setmode, coreChangeEditmodeRequest.setmode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, setmode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreChangeEditmodeRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    setmode: ").append(toIndentedString(setmode)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("setmode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("context");
    openapiRequiredFields.add("setmode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreChangeEditmodeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreChangeEditmodeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreChangeEditmodeRequest is not found in the empty JSON string", CoreChangeEditmodeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreChangeEditmodeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreChangeEditmodeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreChangeEditmodeRequest.openapiRequiredFields) {
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
       if (!CoreChangeEditmodeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreChangeEditmodeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreChangeEditmodeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreChangeEditmodeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreChangeEditmodeRequest>() {
           @Override
           public void write(JsonWriter out, CoreChangeEditmodeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreChangeEditmodeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreChangeEditmodeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreChangeEditmodeRequest
  * @throws IOException if the JSON string is invalid with respect to CoreChangeEditmodeRequest
  */
  public static CoreChangeEditmodeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreChangeEditmodeRequest.class);
  }

 /**
  * Convert an instance of CoreChangeEditmodeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

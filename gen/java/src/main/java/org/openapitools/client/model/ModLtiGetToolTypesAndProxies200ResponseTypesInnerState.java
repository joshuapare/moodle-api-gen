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
 * ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiGetToolTypesAndProxies200ResponseTypesInnerState {
  public static final String SERIALIZED_NAME_CONFIGURED = "configured";
  @SerializedName(SERIALIZED_NAME_CONFIGURED)
  private Boolean configured;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Boolean pending;

  public static final String SERIALIZED_NAME_REJECTED = "rejected";
  @SerializedName(SERIALIZED_NAME_REJECTED)
  private Boolean rejected;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_UNKNOWN = "unknown";
  @SerializedName(SERIALIZED_NAME_UNKNOWN)
  private Boolean unknown;

  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState() {
  }

  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState configured(Boolean configured) {
    this.configured = configured;
    return this;
  }

   /**
   * Is the state configured
   * @return configured
  **/
  @javax.annotation.Nonnull
  public Boolean getConfigured() {
    return configured;
  }

  public void setConfigured(Boolean configured) {
    this.configured = configured;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Is the state pending
   * @return pending
  **/
  @javax.annotation.Nonnull
  public Boolean getPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState rejected(Boolean rejected) {
    this.rejected = rejected;
    return this;
  }

   /**
   * Is the state rejected
   * @return rejected
  **/
  @javax.annotation.Nonnull
  public Boolean getRejected() {
    return rejected;
  }

  public void setRejected(Boolean rejected) {
    this.rejected = rejected;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Tool type state name string
   * @return text
  **/
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState unknown(Boolean unknown) {
    this.unknown = unknown;
    return this;
  }

   /**
   * Is the state unknown
   * @return unknown
  **/
  @javax.annotation.Nonnull
  public Boolean getUnknown() {
    return unknown;
  }

  public void setUnknown(Boolean unknown) {
    this.unknown = unknown;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLtiGetToolTypesAndProxies200ResponseTypesInnerState modLtiGetToolTypesAndProxies200ResponseTypesInnerState = (ModLtiGetToolTypesAndProxies200ResponseTypesInnerState) o;
    return Objects.equals(this.configured, modLtiGetToolTypesAndProxies200ResponseTypesInnerState.configured) &&
        Objects.equals(this.pending, modLtiGetToolTypesAndProxies200ResponseTypesInnerState.pending) &&
        Objects.equals(this.rejected, modLtiGetToolTypesAndProxies200ResponseTypesInnerState.rejected) &&
        Objects.equals(this.text, modLtiGetToolTypesAndProxies200ResponseTypesInnerState.text) &&
        Objects.equals(this.unknown, modLtiGetToolTypesAndProxies200ResponseTypesInnerState.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured, pending, rejected, text, unknown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiGetToolTypesAndProxies200ResponseTypesInnerState {\n");
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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
    openapiFields.add("configured");
    openapiFields.add("pending");
    openapiFields.add("rejected");
    openapiFields.add("text");
    openapiFields.add("unknown");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configured");
    openapiRequiredFields.add("pending");
    openapiRequiredFields.add("rejected");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("unknown");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiGetToolTypesAndProxies200ResponseTypesInnerState is not found in the empty JSON string", ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiGetToolTypesAndProxies200ResponseTypesInnerState` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiGetToolTypesAndProxies200ResponseTypesInnerState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiGetToolTypesAndProxies200ResponseTypesInnerState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiGetToolTypesAndProxies200ResponseTypesInnerState>() {
           @Override
           public void write(JsonWriter out, ModLtiGetToolTypesAndProxies200ResponseTypesInnerState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiGetToolTypesAndProxies200ResponseTypesInnerState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
  * @throws IOException if the JSON string is invalid with respect to ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
  */
  public static ModLtiGetToolTypesAndProxies200ResponseTypesInnerState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.class);
  }

 /**
  * Convert an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


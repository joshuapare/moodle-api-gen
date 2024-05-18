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
 * TinyAutosaveResumeSessionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class TinyAutosaveResumeSessionRequest {
  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid;

  public static final String SERIALIZED_NAME_DRAFTID = "draftid";
  @SerializedName(SERIALIZED_NAME_DRAFTID)
  private Integer draftid = null;

  public static final String SERIALIZED_NAME_ELEMENTID = "elementid";
  @SerializedName(SERIALIZED_NAME_ELEMENTID)
  private String elementid;

  public static final String SERIALIZED_NAME_PAGEHASH = "pagehash";
  @SerializedName(SERIALIZED_NAME_PAGEHASH)
  private String pagehash;

  public static final String SERIALIZED_NAME_PAGEINSTANCE = "pageinstance";
  @SerializedName(SERIALIZED_NAME_PAGEINSTANCE)
  private String pageinstance;

  public TinyAutosaveResumeSessionRequest() {
  }

  public TinyAutosaveResumeSessionRequest contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * The context id that owns the editor
   * @return contextid
  **/
  @javax.annotation.Nonnull
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public TinyAutosaveResumeSessionRequest draftid(Integer draftid) {
    this.draftid = draftid;
    return this;
  }

   /**
   * The new draft item id to resume files to
   * @return draftid
  **/
  @javax.annotation.Nonnull
  public Integer getDraftid() {
    return draftid;
  }

  public void setDraftid(Integer draftid) {
    this.draftid = draftid;
  }


  public TinyAutosaveResumeSessionRequest elementid(String elementid) {
    this.elementid = elementid;
    return this;
  }

   /**
   * The ID of the element
   * @return elementid
  **/
  @javax.annotation.Nonnull
  public String getElementid() {
    return elementid;
  }

  public void setElementid(String elementid) {
    this.elementid = elementid;
  }


  public TinyAutosaveResumeSessionRequest pagehash(String pagehash) {
    this.pagehash = pagehash;
    return this;
  }

   /**
   * The page hash
   * @return pagehash
  **/
  @javax.annotation.Nonnull
  public String getPagehash() {
    return pagehash;
  }

  public void setPagehash(String pagehash) {
    this.pagehash = pagehash;
  }


  public TinyAutosaveResumeSessionRequest pageinstance(String pageinstance) {
    this.pageinstance = pageinstance;
    return this;
  }

   /**
   * The page instance
   * @return pageinstance
  **/
  @javax.annotation.Nonnull
  public String getPageinstance() {
    return pageinstance;
  }

  public void setPageinstance(String pageinstance) {
    this.pageinstance = pageinstance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TinyAutosaveResumeSessionRequest tinyAutosaveResumeSessionRequest = (TinyAutosaveResumeSessionRequest) o;
    return Objects.equals(this.contextid, tinyAutosaveResumeSessionRequest.contextid) &&
        Objects.equals(this.draftid, tinyAutosaveResumeSessionRequest.draftid) &&
        Objects.equals(this.elementid, tinyAutosaveResumeSessionRequest.elementid) &&
        Objects.equals(this.pagehash, tinyAutosaveResumeSessionRequest.pagehash) &&
        Objects.equals(this.pageinstance, tinyAutosaveResumeSessionRequest.pageinstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextid, draftid, elementid, pagehash, pageinstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TinyAutosaveResumeSessionRequest {\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    draftid: ").append(toIndentedString(draftid)).append("\n");
    sb.append("    elementid: ").append(toIndentedString(elementid)).append("\n");
    sb.append("    pagehash: ").append(toIndentedString(pagehash)).append("\n");
    sb.append("    pageinstance: ").append(toIndentedString(pageinstance)).append("\n");
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
    openapiFields.add("contextid");
    openapiFields.add("draftid");
    openapiFields.add("elementid");
    openapiFields.add("pagehash");
    openapiFields.add("pageinstance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contextid");
    openapiRequiredFields.add("draftid");
    openapiRequiredFields.add("elementid");
    openapiRequiredFields.add("pagehash");
    openapiRequiredFields.add("pageinstance");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TinyAutosaveResumeSessionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TinyAutosaveResumeSessionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TinyAutosaveResumeSessionRequest is not found in the empty JSON string", TinyAutosaveResumeSessionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TinyAutosaveResumeSessionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TinyAutosaveResumeSessionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TinyAutosaveResumeSessionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("elementid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `elementid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("elementid").toString()));
      }
      if (!jsonObj.get("pagehash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pagehash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pagehash").toString()));
      }
      if (!jsonObj.get("pageinstance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageinstance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageinstance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TinyAutosaveResumeSessionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TinyAutosaveResumeSessionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TinyAutosaveResumeSessionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TinyAutosaveResumeSessionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TinyAutosaveResumeSessionRequest>() {
           @Override
           public void write(JsonWriter out, TinyAutosaveResumeSessionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TinyAutosaveResumeSessionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TinyAutosaveResumeSessionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TinyAutosaveResumeSessionRequest
  * @throws IOException if the JSON string is invalid with respect to TinyAutosaveResumeSessionRequest
  */
  public static TinyAutosaveResumeSessionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TinyAutosaveResumeSessionRequest.class);
  }

 /**
  * Convert an instance of TinyAutosaveResumeSessionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

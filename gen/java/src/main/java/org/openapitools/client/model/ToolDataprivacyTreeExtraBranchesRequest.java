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
 * ToolDataprivacyTreeExtraBranchesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolDataprivacyTreeExtraBranchesRequest {
  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid = null;

  public static final String SERIALIZED_NAME_ELEMENT = "element";
  @SerializedName(SERIALIZED_NAME_ELEMENT)
  private String element = "null";

  public ToolDataprivacyTreeExtraBranchesRequest() {
  }

  public ToolDataprivacyTreeExtraBranchesRequest contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * The context id to expand
   * @return contextid
  **/
  @javax.annotation.Nonnull
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public ToolDataprivacyTreeExtraBranchesRequest element(String element) {
    this.element = element;
    return this;
  }

   /**
   * The element we are interested on
   * @return element
  **/
  @javax.annotation.Nonnull
  public String getElement() {
    return element;
  }

  public void setElement(String element) {
    this.element = element;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolDataprivacyTreeExtraBranchesRequest toolDataprivacyTreeExtraBranchesRequest = (ToolDataprivacyTreeExtraBranchesRequest) o;
    return Objects.equals(this.contextid, toolDataprivacyTreeExtraBranchesRequest.contextid) &&
        Objects.equals(this.element, toolDataprivacyTreeExtraBranchesRequest.element);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextid, element);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolDataprivacyTreeExtraBranchesRequest {\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
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
    openapiFields.add("element");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contextid");
    openapiRequiredFields.add("element");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolDataprivacyTreeExtraBranchesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolDataprivacyTreeExtraBranchesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolDataprivacyTreeExtraBranchesRequest is not found in the empty JSON string", ToolDataprivacyTreeExtraBranchesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolDataprivacyTreeExtraBranchesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolDataprivacyTreeExtraBranchesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolDataprivacyTreeExtraBranchesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("element").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `element` to be a primitive type in the JSON string but got `%s`", jsonObj.get("element").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolDataprivacyTreeExtraBranchesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolDataprivacyTreeExtraBranchesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolDataprivacyTreeExtraBranchesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolDataprivacyTreeExtraBranchesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolDataprivacyTreeExtraBranchesRequest>() {
           @Override
           public void write(JsonWriter out, ToolDataprivacyTreeExtraBranchesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolDataprivacyTreeExtraBranchesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolDataprivacyTreeExtraBranchesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolDataprivacyTreeExtraBranchesRequest
  * @throws IOException if the JSON string is invalid with respect to ToolDataprivacyTreeExtraBranchesRequest
  */
  public static ToolDataprivacyTreeExtraBranchesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolDataprivacyTreeExtraBranchesRequest.class);
  }

 /**
  * Convert an instance of ToolDataprivacyTreeExtraBranchesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


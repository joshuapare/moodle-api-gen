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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ToolMobileCallExternalFunctions200ResponseResponsesInner;

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
 * ToolMobileCallExternalFunctions200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolMobileCallExternalFunctions200Response {
  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<ToolMobileCallExternalFunctions200ResponseResponsesInner> responses = new ArrayList<>();

  public ToolMobileCallExternalFunctions200Response() {
  }

  public ToolMobileCallExternalFunctions200Response responses(List<ToolMobileCallExternalFunctions200ResponseResponsesInner> responses) {
    this.responses = responses;
    return this;
  }

  public ToolMobileCallExternalFunctions200Response addResponsesItem(ToolMobileCallExternalFunctions200ResponseResponsesInner responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  @javax.annotation.Nonnull
  public List<ToolMobileCallExternalFunctions200ResponseResponsesInner> getResponses() {
    return responses;
  }

  public void setResponses(List<ToolMobileCallExternalFunctions200ResponseResponsesInner> responses) {
    this.responses = responses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolMobileCallExternalFunctions200Response toolMobileCallExternalFunctions200Response = (ToolMobileCallExternalFunctions200Response) o;
    return Objects.equals(this.responses, toolMobileCallExternalFunctions200Response.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolMobileCallExternalFunctions200Response {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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
    openapiFields.add("responses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("responses");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolMobileCallExternalFunctions200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolMobileCallExternalFunctions200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolMobileCallExternalFunctions200Response is not found in the empty JSON string", ToolMobileCallExternalFunctions200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolMobileCallExternalFunctions200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolMobileCallExternalFunctions200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolMobileCallExternalFunctions200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("responses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `responses` to be an array in the JSON string but got `%s`", jsonObj.get("responses").toString()));
      }

      JsonArray jsonArrayresponses = jsonObj.getAsJsonArray("responses");
      // validate the required field `responses` (array)
      for (int i = 0; i < jsonArrayresponses.size(); i++) {
        ToolMobileCallExternalFunctions200ResponseResponsesInner.validateJsonElement(jsonArrayresponses.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolMobileCallExternalFunctions200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolMobileCallExternalFunctions200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolMobileCallExternalFunctions200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolMobileCallExternalFunctions200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolMobileCallExternalFunctions200Response>() {
           @Override
           public void write(JsonWriter out, ToolMobileCallExternalFunctions200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolMobileCallExternalFunctions200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolMobileCallExternalFunctions200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolMobileCallExternalFunctions200Response
  * @throws IOException if the JSON string is invalid with respect to ToolMobileCallExternalFunctions200Response
  */
  public static ToolMobileCallExternalFunctions200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolMobileCallExternalFunctions200Response.class);
  }

 /**
  * Convert an instance of ToolMobileCallExternalFunctions200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


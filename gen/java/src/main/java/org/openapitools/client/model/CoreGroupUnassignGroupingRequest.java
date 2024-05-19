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
import org.openapitools.client.model.CoreGroupUnassignGroupingRequestUnassignmentsInner;

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
 * CoreGroupUnassignGroupingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGroupUnassignGroupingRequest {
  public static final String SERIALIZED_NAME_UNASSIGNMENTS = "unassignments";
  @SerializedName(SERIALIZED_NAME_UNASSIGNMENTS)
  private List<CoreGroupUnassignGroupingRequestUnassignmentsInner> unassignments = new ArrayList<>();

  public CoreGroupUnassignGroupingRequest() {
  }

  public CoreGroupUnassignGroupingRequest unassignments(List<CoreGroupUnassignGroupingRequestUnassignmentsInner> unassignments) {
    this.unassignments = unassignments;
    return this;
  }

  public CoreGroupUnassignGroupingRequest addUnassignmentsItem(CoreGroupUnassignGroupingRequestUnassignmentsInner unassignmentsItem) {
    if (this.unassignments == null) {
      this.unassignments = new ArrayList<>();
    }
    this.unassignments.add(unassignmentsItem);
    return this;
  }

   /**
   * Get unassignments
   * @return unassignments
  **/
  @javax.annotation.Nonnull
  public List<CoreGroupUnassignGroupingRequestUnassignmentsInner> getUnassignments() {
    return unassignments;
  }

  public void setUnassignments(List<CoreGroupUnassignGroupingRequestUnassignmentsInner> unassignments) {
    this.unassignments = unassignments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGroupUnassignGroupingRequest coreGroupUnassignGroupingRequest = (CoreGroupUnassignGroupingRequest) o;
    return Objects.equals(this.unassignments, coreGroupUnassignGroupingRequest.unassignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unassignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGroupUnassignGroupingRequest {\n");
    sb.append("    unassignments: ").append(toIndentedString(unassignments)).append("\n");
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
    openapiFields.add("unassignments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("unassignments");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGroupUnassignGroupingRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGroupUnassignGroupingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGroupUnassignGroupingRequest is not found in the empty JSON string", CoreGroupUnassignGroupingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGroupUnassignGroupingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGroupUnassignGroupingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGroupUnassignGroupingRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("unassignments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unassignments` to be an array in the JSON string but got `%s`", jsonObj.get("unassignments").toString()));
      }

      JsonArray jsonArrayunassignments = jsonObj.getAsJsonArray("unassignments");
      // validate the required field `unassignments` (array)
      for (int i = 0; i < jsonArrayunassignments.size(); i++) {
        CoreGroupUnassignGroupingRequestUnassignmentsInner.validateJsonElement(jsonArrayunassignments.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGroupUnassignGroupingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGroupUnassignGroupingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGroupUnassignGroupingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGroupUnassignGroupingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGroupUnassignGroupingRequest>() {
           @Override
           public void write(JsonWriter out, CoreGroupUnassignGroupingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGroupUnassignGroupingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGroupUnassignGroupingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGroupUnassignGroupingRequest
  * @throws IOException if the JSON string is invalid with respect to CoreGroupUnassignGroupingRequest
  */
  public static CoreGroupUnassignGroupingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGroupUnassignGroupingRequest.class);
  }

 /**
  * Convert an instance of CoreGroupUnassignGroupingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


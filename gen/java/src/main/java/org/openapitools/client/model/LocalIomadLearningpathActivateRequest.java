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
 * LocalIomadLearningpathActivateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class LocalIomadLearningpathActivateRequest {
  public static final String SERIALIZED_NAME_PATHID = "pathid";
  @SerializedName(SERIALIZED_NAME_PATHID)
  private Integer pathid = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Integer state = null;

  public LocalIomadLearningpathActivateRequest() {
  }

  public LocalIomadLearningpathActivateRequest pathid(Integer pathid) {
    this.pathid = pathid;
    return this;
  }

   /**
   * ID of Learning Path
   * @return pathid
  **/
  @javax.annotation.Nonnull
  public Integer getPathid() {
    return pathid;
  }

  public void setPathid(Integer pathid) {
    this.pathid = pathid;
  }


  public LocalIomadLearningpathActivateRequest state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Active (1) / deactivate (0)
   * @return state
  **/
  @javax.annotation.Nonnull
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalIomadLearningpathActivateRequest localIomadLearningpathActivateRequest = (LocalIomadLearningpathActivateRequest) o;
    return Objects.equals(this.pathid, localIomadLearningpathActivateRequest.pathid) &&
        Objects.equals(this.state, localIomadLearningpathActivateRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathid, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalIomadLearningpathActivateRequest {\n");
    sb.append("    pathid: ").append(toIndentedString(pathid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("pathid");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pathid");
    openapiRequiredFields.add("state");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LocalIomadLearningpathActivateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LocalIomadLearningpathActivateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocalIomadLearningpathActivateRequest is not found in the empty JSON string", LocalIomadLearningpathActivateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LocalIomadLearningpathActivateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocalIomadLearningpathActivateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LocalIomadLearningpathActivateRequest.openapiRequiredFields) {
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
       if (!LocalIomadLearningpathActivateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalIomadLearningpathActivateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalIomadLearningpathActivateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalIomadLearningpathActivateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalIomadLearningpathActivateRequest>() {
           @Override
           public void write(JsonWriter out, LocalIomadLearningpathActivateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalIomadLearningpathActivateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalIomadLearningpathActivateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalIomadLearningpathActivateRequest
  * @throws IOException if the JSON string is invalid with respect to LocalIomadLearningpathActivateRequest
  */
  public static LocalIomadLearningpathActivateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalIomadLearningpathActivateRequest.class);
  }

 /**
  * Convert an instance of LocalIomadLearningpathActivateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


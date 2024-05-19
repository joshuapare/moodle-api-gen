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
 * CoreXapiDeleteStateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreXapiDeleteStateRequest {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activityId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId = "null";

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private String agent = "null";

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "null";

  public static final String SERIALIZED_NAME_REGISTRATION = "registration";
  @SerializedName(SERIALIZED_NAME_REGISTRATION)
  private String registration = "null";

  public static final String SERIALIZED_NAME_STATE_ID = "stateId";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private String stateId = "null";

  public CoreXapiDeleteStateRequest() {
  }

  public CoreXapiDeleteStateRequest activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * xAPI activity ID IRI
   * @return activityId
  **/
  @javax.annotation.Nonnull
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public CoreXapiDeleteStateRequest agent(String agent) {
    this.agent = agent;
    return this;
  }

   /**
   * The xAPI agent json
   * @return agent
  **/
  @javax.annotation.Nonnull
  public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }


  public CoreXapiDeleteStateRequest component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Component name
   * @return component
  **/
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreXapiDeleteStateRequest registration(String registration) {
    this.registration = registration;
    return this;
  }

   /**
   * The xAPI registration UUID
   * @return registration
  **/
  @javax.annotation.Nullable
  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }


  public CoreXapiDeleteStateRequest stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * The xAPI state ID
   * @return stateId
  **/
  @javax.annotation.Nonnull
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreXapiDeleteStateRequest coreXapiDeleteStateRequest = (CoreXapiDeleteStateRequest) o;
    return Objects.equals(this.activityId, coreXapiDeleteStateRequest.activityId) &&
        Objects.equals(this.agent, coreXapiDeleteStateRequest.agent) &&
        Objects.equals(this.component, coreXapiDeleteStateRequest.component) &&
        Objects.equals(this.registration, coreXapiDeleteStateRequest.registration) &&
        Objects.equals(this.stateId, coreXapiDeleteStateRequest.stateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, agent, component, registration, stateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreXapiDeleteStateRequest {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
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
    openapiFields.add("activityId");
    openapiFields.add("agent");
    openapiFields.add("component");
    openapiFields.add("registration");
    openapiFields.add("stateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activityId");
    openapiRequiredFields.add("agent");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("stateId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreXapiDeleteStateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreXapiDeleteStateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreXapiDeleteStateRequest is not found in the empty JSON string", CoreXapiDeleteStateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreXapiDeleteStateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreXapiDeleteStateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreXapiDeleteStateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("activityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activityId").toString()));
      }
      if (!jsonObj.get("agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent").toString()));
      }
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if ((jsonObj.get("registration") != null && !jsonObj.get("registration").isJsonNull()) && !jsonObj.get("registration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration").toString()));
      }
      if (!jsonObj.get("stateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreXapiDeleteStateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreXapiDeleteStateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreXapiDeleteStateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreXapiDeleteStateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreXapiDeleteStateRequest>() {
           @Override
           public void write(JsonWriter out, CoreXapiDeleteStateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreXapiDeleteStateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreXapiDeleteStateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreXapiDeleteStateRequest
  * @throws IOException if the JSON string is invalid with respect to CoreXapiDeleteStateRequest
  */
  public static CoreXapiDeleteStateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreXapiDeleteStateRequest.class);
  }

 /**
  * Convert an instance of CoreXapiDeleteStateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


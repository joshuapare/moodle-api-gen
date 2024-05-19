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
 * CoreXapiGetStatesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreXapiGetStatesRequest {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activityId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private String agent;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_REGISTRATION = "registration";
  @SerializedName(SERIALIZED_NAME_REGISTRATION)
  private String registration;

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private String since = "null";

  public CoreXapiGetStatesRequest() {
  }

  public CoreXapiGetStatesRequest activityId(String activityId) {
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


  public CoreXapiGetStatesRequest agent(String agent) {
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


  public CoreXapiGetStatesRequest component(String component) {
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


  public CoreXapiGetStatesRequest registration(String registration) {
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


  public CoreXapiGetStatesRequest since(String since) {
    this.since = since;
    return this;
  }

   /**
   * Filter ids stored since the timestamp (exclusive)
   * @return since
  **/
  @javax.annotation.Nullable
  public String getSince() {
    return since;
  }

  public void setSince(String since) {
    this.since = since;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreXapiGetStatesRequest coreXapiGetStatesRequest = (CoreXapiGetStatesRequest) o;
    return Objects.equals(this.activityId, coreXapiGetStatesRequest.activityId) &&
        Objects.equals(this.agent, coreXapiGetStatesRequest.agent) &&
        Objects.equals(this.component, coreXapiGetStatesRequest.component) &&
        Objects.equals(this.registration, coreXapiGetStatesRequest.registration) &&
        Objects.equals(this.since, coreXapiGetStatesRequest.since);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, agent, component, registration, since);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreXapiGetStatesRequest {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
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
    openapiFields.add("since");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activityId");
    openapiRequiredFields.add("agent");
    openapiRequiredFields.add("component");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreXapiGetStatesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreXapiGetStatesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreXapiGetStatesRequest is not found in the empty JSON string", CoreXapiGetStatesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreXapiGetStatesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreXapiGetStatesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreXapiGetStatesRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("since") != null && !jsonObj.get("since").isJsonNull()) && !jsonObj.get("since").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `since` to be a primitive type in the JSON string but got `%s`", jsonObj.get("since").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreXapiGetStatesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreXapiGetStatesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreXapiGetStatesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreXapiGetStatesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreXapiGetStatesRequest>() {
           @Override
           public void write(JsonWriter out, CoreXapiGetStatesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreXapiGetStatesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreXapiGetStatesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreXapiGetStatesRequest
  * @throws IOException if the JSON string is invalid with respect to CoreXapiGetStatesRequest
  */
  public static CoreXapiGetStatesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreXapiGetStatesRequest.class);
  }

 /**
  * Convert an instance of CoreXapiGetStatesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


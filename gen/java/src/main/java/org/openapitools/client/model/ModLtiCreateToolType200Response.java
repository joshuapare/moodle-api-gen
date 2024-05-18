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
import org.openapitools.client.model.ModLtiCreateToolType200ResponseState;
import org.openapitools.client.model.ModLtiCreateToolType200ResponseUrls;

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
 * ModLtiCreateToolType200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiCreateToolType200Response {
  public static final String SERIALIZED_NAME_CAPABILITYGROUPS = "capabilitygroups";
  @SerializedName(SERIALIZED_NAME_CAPABILITYGROUPS)
  private List<Object> capabilitygroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENTID = "clientid";
  @SerializedName(SERIALIZED_NAME_CLIENTID)
  private String clientid = "null";

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid = 0;

  public static final String SERIALIZED_NAME_DEPLOYMENTID = "deploymentid";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENTID)
  private Integer deploymentid = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "null";

  public static final String SERIALIZED_NAME_HASCAPABILITYGROUPS = "hascapabilitygroups";
  @SerializedName(SERIALIZED_NAME_HASCAPABILITYGROUPS)
  private Boolean hascapabilitygroups = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_INSTANCECOUNT = "instancecount";
  @SerializedName(SERIALIZED_NAME_INSTANCECOUNT)
  private Integer instancecount = null;

  public static final String SERIALIZED_NAME_INSTANCEIDS = "instanceids";
  @SerializedName(SERIALIZED_NAME_INSTANCEIDS)
  private List<Object> instanceids = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PLATFORMID = "platformid";
  @SerializedName(SERIALIZED_NAME_PLATFORMID)
  private String platformid = "null";

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ModLtiCreateToolType200ResponseState state;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private ModLtiCreateToolType200ResponseUrls urls;

  public ModLtiCreateToolType200Response() {
  }

  public ModLtiCreateToolType200Response capabilitygroups(List<Object> capabilitygroups) {
    this.capabilitygroups = capabilitygroups;
    return this;
  }

  public ModLtiCreateToolType200Response addCapabilitygroupsItem(Object capabilitygroupsItem) {
    if (this.capabilitygroups == null) {
      this.capabilitygroups = new ArrayList<>();
    }
    this.capabilitygroups.add(capabilitygroupsItem);
    return this;
  }

   /**
   * Get capabilitygroups
   * @return capabilitygroups
  **/
  @javax.annotation.Nullable
  public List<Object> getCapabilitygroups() {
    return capabilitygroups;
  }

  public void setCapabilitygroups(List<Object> capabilitygroups) {
    this.capabilitygroups = capabilitygroups;
  }


  public ModLtiCreateToolType200Response clientid(String clientid) {
    this.clientid = clientid;
    return this;
  }

   /**
   * Client ID
   * @return clientid
  **/
  @javax.annotation.Nonnull
  public String getClientid() {
    return clientid;
  }

  public void setClientid(String clientid) {
    this.clientid = clientid;
  }


  public ModLtiCreateToolType200Response courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Tool type course
   * @return courseid
  **/
  @javax.annotation.Nullable
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public ModLtiCreateToolType200Response deploymentid(Integer deploymentid) {
    this.deploymentid = deploymentid;
    return this;
  }

   /**
   * Deployment ID
   * @return deploymentid
  **/
  @javax.annotation.Nonnull
  public Integer getDeploymentid() {
    return deploymentid;
  }

  public void setDeploymentid(Integer deploymentid) {
    this.deploymentid = deploymentid;
  }


  public ModLtiCreateToolType200Response description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Tool type description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ModLtiCreateToolType200Response hascapabilitygroups(Boolean hascapabilitygroups) {
    this.hascapabilitygroups = hascapabilitygroups;
    return this;
  }

   /**
   * Indicate if capabilitygroups is populated
   * @return hascapabilitygroups
  **/
  @javax.annotation.Nonnull
  public Boolean getHascapabilitygroups() {
    return hascapabilitygroups;
  }

  public void setHascapabilitygroups(Boolean hascapabilitygroups) {
    this.hascapabilitygroups = hascapabilitygroups;
  }


  public ModLtiCreateToolType200Response id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Tool type id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModLtiCreateToolType200Response instancecount(Integer instancecount) {
    this.instancecount = instancecount;
    return this;
  }

   /**
   * The number of times this tool is being used
   * @return instancecount
  **/
  @javax.annotation.Nonnull
  public Integer getInstancecount() {
    return instancecount;
  }

  public void setInstancecount(Integer instancecount) {
    this.instancecount = instancecount;
  }


  public ModLtiCreateToolType200Response instanceids(List<Object> instanceids) {
    this.instanceids = instanceids;
    return this;
  }

  public ModLtiCreateToolType200Response addInstanceidsItem(Object instanceidsItem) {
    if (this.instanceids == null) {
      this.instanceids = new ArrayList<>();
    }
    this.instanceids.add(instanceidsItem);
    return this;
  }

   /**
   * Get instanceids
   * @return instanceids
  **/
  @javax.annotation.Nullable
  public List<Object> getInstanceids() {
    return instanceids;
  }

  public void setInstanceids(List<Object> instanceids) {
    this.instanceids = instanceids;
  }


  public ModLtiCreateToolType200Response name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tool type name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModLtiCreateToolType200Response platformid(String platformid) {
    this.platformid = platformid;
    return this;
  }

   /**
   * Platform ID
   * @return platformid
  **/
  @javax.annotation.Nonnull
  public String getPlatformid() {
    return platformid;
  }

  public void setPlatformid(String platformid) {
    this.platformid = platformid;
  }


  public ModLtiCreateToolType200Response state(ModLtiCreateToolType200ResponseState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  public ModLtiCreateToolType200ResponseState getState() {
    return state;
  }

  public void setState(ModLtiCreateToolType200ResponseState state) {
    this.state = state;
  }


  public ModLtiCreateToolType200Response urls(ModLtiCreateToolType200ResponseUrls urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nonnull
  public ModLtiCreateToolType200ResponseUrls getUrls() {
    return urls;
  }

  public void setUrls(ModLtiCreateToolType200ResponseUrls urls) {
    this.urls = urls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLtiCreateToolType200Response modLtiCreateToolType200Response = (ModLtiCreateToolType200Response) o;
    return Objects.equals(this.capabilitygroups, modLtiCreateToolType200Response.capabilitygroups) &&
        Objects.equals(this.clientid, modLtiCreateToolType200Response.clientid) &&
        Objects.equals(this.courseid, modLtiCreateToolType200Response.courseid) &&
        Objects.equals(this.deploymentid, modLtiCreateToolType200Response.deploymentid) &&
        Objects.equals(this.description, modLtiCreateToolType200Response.description) &&
        Objects.equals(this.hascapabilitygroups, modLtiCreateToolType200Response.hascapabilitygroups) &&
        Objects.equals(this.id, modLtiCreateToolType200Response.id) &&
        Objects.equals(this.instancecount, modLtiCreateToolType200Response.instancecount) &&
        Objects.equals(this.instanceids, modLtiCreateToolType200Response.instanceids) &&
        Objects.equals(this.name, modLtiCreateToolType200Response.name) &&
        Objects.equals(this.platformid, modLtiCreateToolType200Response.platformid) &&
        Objects.equals(this.state, modLtiCreateToolType200Response.state) &&
        Objects.equals(this.urls, modLtiCreateToolType200Response.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilitygroups, clientid, courseid, deploymentid, description, hascapabilitygroups, id, instancecount, instanceids, name, platformid, state, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiCreateToolType200Response {\n");
    sb.append("    capabilitygroups: ").append(toIndentedString(capabilitygroups)).append("\n");
    sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    deploymentid: ").append(toIndentedString(deploymentid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hascapabilitygroups: ").append(toIndentedString(hascapabilitygroups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instancecount: ").append(toIndentedString(instancecount)).append("\n");
    sb.append("    instanceids: ").append(toIndentedString(instanceids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platformid: ").append(toIndentedString(platformid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
    openapiFields.add("capabilitygroups");
    openapiFields.add("clientid");
    openapiFields.add("courseid");
    openapiFields.add("deploymentid");
    openapiFields.add("description");
    openapiFields.add("hascapabilitygroups");
    openapiFields.add("id");
    openapiFields.add("instancecount");
    openapiFields.add("instanceids");
    openapiFields.add("name");
    openapiFields.add("platformid");
    openapiFields.add("state");
    openapiFields.add("urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientid");
    openapiRequiredFields.add("deploymentid");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("hascapabilitygroups");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("instancecount");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("platformid");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("urls");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiCreateToolType200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiCreateToolType200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiCreateToolType200Response is not found in the empty JSON string", ModLtiCreateToolType200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiCreateToolType200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiCreateToolType200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLtiCreateToolType200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("capabilitygroups") != null && !jsonObj.get("capabilitygroups").isJsonNull() && !jsonObj.get("capabilitygroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `capabilitygroups` to be an array in the JSON string but got `%s`", jsonObj.get("capabilitygroups").toString()));
      }
      if (!jsonObj.get("clientid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientid").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("instanceids") != null && !jsonObj.get("instanceids").isJsonNull() && !jsonObj.get("instanceids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceids` to be an array in the JSON string but got `%s`", jsonObj.get("instanceids").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("platformid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platformid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platformid").toString()));
      }
      // validate the required field `state`
      ModLtiCreateToolType200ResponseState.validateJsonElement(jsonObj.get("state"));
      // validate the required field `urls`
      ModLtiCreateToolType200ResponseUrls.validateJsonElement(jsonObj.get("urls"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiCreateToolType200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiCreateToolType200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiCreateToolType200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiCreateToolType200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiCreateToolType200Response>() {
           @Override
           public void write(JsonWriter out, ModLtiCreateToolType200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiCreateToolType200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiCreateToolType200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiCreateToolType200Response
  * @throws IOException if the JSON string is invalid with respect to ModLtiCreateToolType200Response
  */
  public static ModLtiCreateToolType200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiCreateToolType200Response.class);
  }

 /**
  * Convert an instance of ModLtiCreateToolType200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


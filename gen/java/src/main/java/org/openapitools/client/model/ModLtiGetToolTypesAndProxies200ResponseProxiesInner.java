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
 * ModLtiGetToolTypesAndProxies200ResponseProxiesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiGetToolTypesAndProxies200ResponseProxiesInner {
  public static final String SERIALIZED_NAME_CAPABILITYOFFERED = "capabilityoffered";
  @SerializedName(SERIALIZED_NAME_CAPABILITYOFFERED)
  private String capabilityoffered;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGURL = "regurl";
  @SerializedName(SERIALIZED_NAME_REGURL)
  private String regurl;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_SERVICEOFFERED = "serviceoffered";
  @SerializedName(SERIALIZED_NAME_SERVICEOFFERED)
  private String serviceoffered;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Integer state;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_TOOLPROXY = "toolproxy";
  @SerializedName(SERIALIZED_NAME_TOOLPROXY)
  private String toolproxy;

  public static final String SERIALIZED_NAME_VENDORCODE = "vendorcode";
  @SerializedName(SERIALIZED_NAME_VENDORCODE)
  private String vendorcode;

  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner() {
  }

  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner capabilityoffered(String capabilityoffered) {
    this.capabilityoffered = capabilityoffered;
    return this;
  }

   /**
   * Tool proxy capabilities offered
   * @return capabilityoffered
  **/
  @javax.annotation.Nullable
  public String getCapabilityoffered() {
    return capabilityoffered;
  }

  public void setCapabilityoffered(String capabilityoffered) {
    this.capabilityoffered = capabilityoffered;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Tool proxy globally unique identifier
   * @return guid
  **/
  @javax.annotation.Nullable
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Tool proxy id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tool proxy name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner regurl(String regurl) {
    this.regurl = regurl;
    return this;
  }

   /**
   * Tool proxy registration URL
   * @return regurl
  **/
  @javax.annotation.Nullable
  public String getRegurl() {
    return regurl;
  }

  public void setRegurl(String regurl) {
    this.regurl = regurl;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Tool proxy shared secret
   * @return secret
  **/
  @javax.annotation.Nullable
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner serviceoffered(String serviceoffered) {
    this.serviceoffered = serviceoffered;
    return this;
  }

   /**
   * Tool proxy services offered
   * @return serviceoffered
  **/
  @javax.annotation.Nullable
  public String getServiceoffered() {
    return serviceoffered;
  }

  public void setServiceoffered(String serviceoffered) {
    this.serviceoffered = serviceoffered;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Tool proxy state
   * @return state
  **/
  @javax.annotation.Nullable
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * Tool proxy time created
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * Tool proxy modified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner toolproxy(String toolproxy) {
    this.toolproxy = toolproxy;
    return this;
  }

   /**
   * Tool proxy
   * @return toolproxy
  **/
  @javax.annotation.Nullable
  public String getToolproxy() {
    return toolproxy;
  }

  public void setToolproxy(String toolproxy) {
    this.toolproxy = toolproxy;
  }


  public ModLtiGetToolTypesAndProxies200ResponseProxiesInner vendorcode(String vendorcode) {
    this.vendorcode = vendorcode;
    return this;
  }

   /**
   * Tool proxy consumer code
   * @return vendorcode
  **/
  @javax.annotation.Nullable
  public String getVendorcode() {
    return vendorcode;
  }

  public void setVendorcode(String vendorcode) {
    this.vendorcode = vendorcode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLtiGetToolTypesAndProxies200ResponseProxiesInner modLtiGetToolTypesAndProxies200ResponseProxiesInner = (ModLtiGetToolTypesAndProxies200ResponseProxiesInner) o;
    return Objects.equals(this.capabilityoffered, modLtiGetToolTypesAndProxies200ResponseProxiesInner.capabilityoffered) &&
        Objects.equals(this.guid, modLtiGetToolTypesAndProxies200ResponseProxiesInner.guid) &&
        Objects.equals(this.id, modLtiGetToolTypesAndProxies200ResponseProxiesInner.id) &&
        Objects.equals(this.name, modLtiGetToolTypesAndProxies200ResponseProxiesInner.name) &&
        Objects.equals(this.regurl, modLtiGetToolTypesAndProxies200ResponseProxiesInner.regurl) &&
        Objects.equals(this.secret, modLtiGetToolTypesAndProxies200ResponseProxiesInner.secret) &&
        Objects.equals(this.serviceoffered, modLtiGetToolTypesAndProxies200ResponseProxiesInner.serviceoffered) &&
        Objects.equals(this.state, modLtiGetToolTypesAndProxies200ResponseProxiesInner.state) &&
        Objects.equals(this.timecreated, modLtiGetToolTypesAndProxies200ResponseProxiesInner.timecreated) &&
        Objects.equals(this.timemodified, modLtiGetToolTypesAndProxies200ResponseProxiesInner.timemodified) &&
        Objects.equals(this.toolproxy, modLtiGetToolTypesAndProxies200ResponseProxiesInner.toolproxy) &&
        Objects.equals(this.vendorcode, modLtiGetToolTypesAndProxies200ResponseProxiesInner.vendorcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilityoffered, guid, id, name, regurl, secret, serviceoffered, state, timecreated, timemodified, toolproxy, vendorcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiGetToolTypesAndProxies200ResponseProxiesInner {\n");
    sb.append("    capabilityoffered: ").append(toIndentedString(capabilityoffered)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regurl: ").append(toIndentedString(regurl)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    serviceoffered: ").append(toIndentedString(serviceoffered)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    toolproxy: ").append(toIndentedString(toolproxy)).append("\n");
    sb.append("    vendorcode: ").append(toIndentedString(vendorcode)).append("\n");
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
    openapiFields.add("capabilityoffered");
    openapiFields.add("guid");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("regurl");
    openapiFields.add("secret");
    openapiFields.add("serviceoffered");
    openapiFields.add("state");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("toolproxy");
    openapiFields.add("vendorcode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiGetToolTypesAndProxies200ResponseProxiesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiGetToolTypesAndProxies200ResponseProxiesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiGetToolTypesAndProxies200ResponseProxiesInner is not found in the empty JSON string", ModLtiGetToolTypesAndProxies200ResponseProxiesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiGetToolTypesAndProxies200ResponseProxiesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiGetToolTypesAndProxies200ResponseProxiesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("capabilityoffered") != null && !jsonObj.get("capabilityoffered").isJsonNull()) && !jsonObj.get("capabilityoffered").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `capabilityoffered` to be a primitive type in the JSON string but got `%s`", jsonObj.get("capabilityoffered").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("regurl") != null && !jsonObj.get("regurl").isJsonNull()) && !jsonObj.get("regurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regurl").toString()));
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if ((jsonObj.get("serviceoffered") != null && !jsonObj.get("serviceoffered").isJsonNull()) && !jsonObj.get("serviceoffered").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceoffered` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceoffered").toString()));
      }
      if ((jsonObj.get("toolproxy") != null && !jsonObj.get("toolproxy").isJsonNull()) && !jsonObj.get("toolproxy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toolproxy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toolproxy").toString()));
      }
      if ((jsonObj.get("vendorcode") != null && !jsonObj.get("vendorcode").isJsonNull()) && !jsonObj.get("vendorcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorcode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiGetToolTypesAndProxies200ResponseProxiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiGetToolTypesAndProxies200ResponseProxiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiGetToolTypesAndProxies200ResponseProxiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiGetToolTypesAndProxies200ResponseProxiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiGetToolTypesAndProxies200ResponseProxiesInner>() {
           @Override
           public void write(JsonWriter out, ModLtiGetToolTypesAndProxies200ResponseProxiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiGetToolTypesAndProxies200ResponseProxiesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiGetToolTypesAndProxies200ResponseProxiesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiGetToolTypesAndProxies200ResponseProxiesInner
  * @throws IOException if the JSON string is invalid with respect to ModLtiGetToolTypesAndProxies200ResponseProxiesInner
  */
  public static ModLtiGetToolTypesAndProxies200ResponseProxiesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiGetToolTypesAndProxies200ResponseProxiesInner.class);
  }

 /**
  * Convert an instance of ModLtiGetToolTypesAndProxies200ResponseProxiesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

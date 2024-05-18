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
 * ModLtiGetToolProxyRegistrationRequest200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiGetToolProxyRegistrationRequest200Response {
  public static final String SERIALIZED_NAME_LAUNCH_PRESENTATION_RETURN_URL = "launch_presentation_return_url";
  @SerializedName(SERIALIZED_NAME_LAUNCH_PRESENTATION_RETURN_URL)
  private String launchPresentationReturnUrl = "null";

  public static final String SERIALIZED_NAME_LTI_MESSAGE_TYPE = "lti_message_type";
  @SerializedName(SERIALIZED_NAME_LTI_MESSAGE_TYPE)
  private String ltiMessageType = "null";

  public static final String SERIALIZED_NAME_LTI_VERSION = "lti_version";
  @SerializedName(SERIALIZED_NAME_LTI_VERSION)
  private String ltiVersion = "null";

  public static final String SERIALIZED_NAME_REG_KEY = "reg_key";
  @SerializedName(SERIALIZED_NAME_REG_KEY)
  private String regKey = "null";

  public static final String SERIALIZED_NAME_REG_PASSWORD = "reg_password";
  @SerializedName(SERIALIZED_NAME_REG_PASSWORD)
  private String regPassword = "null";

  public static final String SERIALIZED_NAME_REG_URL = "reg_url";
  @SerializedName(SERIALIZED_NAME_REG_URL)
  private String regUrl = "null";

  public static final String SERIALIZED_NAME_TC_PROFILE_URL = "tc_profile_url";
  @SerializedName(SERIALIZED_NAME_TC_PROFILE_URL)
  private String tcProfileUrl = "null";

  public ModLtiGetToolProxyRegistrationRequest200Response() {
  }

  public ModLtiGetToolProxyRegistrationRequest200Response launchPresentationReturnUrl(String launchPresentationReturnUrl) {
    this.launchPresentationReturnUrl = launchPresentationReturnUrl;
    return this;
  }

   /**
   * URL to redirect on registration completion
   * @return launchPresentationReturnUrl
  **/
  @javax.annotation.Nonnull
  public String getLaunchPresentationReturnUrl() {
    return launchPresentationReturnUrl;
  }

  public void setLaunchPresentationReturnUrl(String launchPresentationReturnUrl) {
    this.launchPresentationReturnUrl = launchPresentationReturnUrl;
  }


  public ModLtiGetToolProxyRegistrationRequest200Response ltiMessageType(String ltiMessageType) {
    this.ltiMessageType = ltiMessageType;
    return this;
  }

   /**
   * LTI message type
   * @return ltiMessageType
  **/
  @javax.annotation.Nonnull
  public String getLtiMessageType() {
    return ltiMessageType;
  }

  public void setLtiMessageType(String ltiMessageType) {
    this.ltiMessageType = ltiMessageType;
  }


  public ModLtiGetToolProxyRegistrationRequest200Response ltiVersion(String ltiVersion) {
    this.ltiVersion = ltiVersion;
    return this;
  }

   /**
   * LTI version
   * @return ltiVersion
  **/
  @javax.annotation.Nonnull
  public String getLtiVersion() {
    return ltiVersion;
  }

  public void setLtiVersion(String ltiVersion) {
    this.ltiVersion = ltiVersion;
  }


  public ModLtiGetToolProxyRegistrationRequest200Response regKey(String regKey) {
    this.regKey = regKey;
    return this;
  }

   /**
   * Tool proxy registration key
   * @return regKey
  **/
  @javax.annotation.Nonnull
  public String getRegKey() {
    return regKey;
  }

  public void setRegKey(String regKey) {
    this.regKey = regKey;
  }


  public ModLtiGetToolProxyRegistrationRequest200Response regPassword(String regPassword) {
    this.regPassword = regPassword;
    return this;
  }

   /**
   * Tool proxy registration password
   * @return regPassword
  **/
  @javax.annotation.Nonnull
  public String getRegPassword() {
    return regPassword;
  }

  public void setRegPassword(String regPassword) {
    this.regPassword = regPassword;
  }


  public ModLtiGetToolProxyRegistrationRequest200Response regUrl(String regUrl) {
    this.regUrl = regUrl;
    return this;
  }

   /**
   * Tool proxy registration url
   * @return regUrl
  **/
  @javax.annotation.Nonnull
  public String getRegUrl() {
    return regUrl;
  }

  public void setRegUrl(String regUrl) {
    this.regUrl = regUrl;
  }


  public ModLtiGetToolProxyRegistrationRequest200Response tcProfileUrl(String tcProfileUrl) {
    this.tcProfileUrl = tcProfileUrl;
    return this;
  }

   /**
   * Tool consumers profile URL
   * @return tcProfileUrl
  **/
  @javax.annotation.Nonnull
  public String getTcProfileUrl() {
    return tcProfileUrl;
  }

  public void setTcProfileUrl(String tcProfileUrl) {
    this.tcProfileUrl = tcProfileUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLtiGetToolProxyRegistrationRequest200Response modLtiGetToolProxyRegistrationRequest200Response = (ModLtiGetToolProxyRegistrationRequest200Response) o;
    return Objects.equals(this.launchPresentationReturnUrl, modLtiGetToolProxyRegistrationRequest200Response.launchPresentationReturnUrl) &&
        Objects.equals(this.ltiMessageType, modLtiGetToolProxyRegistrationRequest200Response.ltiMessageType) &&
        Objects.equals(this.ltiVersion, modLtiGetToolProxyRegistrationRequest200Response.ltiVersion) &&
        Objects.equals(this.regKey, modLtiGetToolProxyRegistrationRequest200Response.regKey) &&
        Objects.equals(this.regPassword, modLtiGetToolProxyRegistrationRequest200Response.regPassword) &&
        Objects.equals(this.regUrl, modLtiGetToolProxyRegistrationRequest200Response.regUrl) &&
        Objects.equals(this.tcProfileUrl, modLtiGetToolProxyRegistrationRequest200Response.tcProfileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchPresentationReturnUrl, ltiMessageType, ltiVersion, regKey, regPassword, regUrl, tcProfileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiGetToolProxyRegistrationRequest200Response {\n");
    sb.append("    launchPresentationReturnUrl: ").append(toIndentedString(launchPresentationReturnUrl)).append("\n");
    sb.append("    ltiMessageType: ").append(toIndentedString(ltiMessageType)).append("\n");
    sb.append("    ltiVersion: ").append(toIndentedString(ltiVersion)).append("\n");
    sb.append("    regKey: ").append(toIndentedString(regKey)).append("\n");
    sb.append("    regPassword: ").append(toIndentedString(regPassword)).append("\n");
    sb.append("    regUrl: ").append(toIndentedString(regUrl)).append("\n");
    sb.append("    tcProfileUrl: ").append(toIndentedString(tcProfileUrl)).append("\n");
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
    openapiFields.add("launch_presentation_return_url");
    openapiFields.add("lti_message_type");
    openapiFields.add("lti_version");
    openapiFields.add("reg_key");
    openapiFields.add("reg_password");
    openapiFields.add("reg_url");
    openapiFields.add("tc_profile_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("launch_presentation_return_url");
    openapiRequiredFields.add("lti_message_type");
    openapiRequiredFields.add("lti_version");
    openapiRequiredFields.add("reg_key");
    openapiRequiredFields.add("reg_password");
    openapiRequiredFields.add("reg_url");
    openapiRequiredFields.add("tc_profile_url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiGetToolProxyRegistrationRequest200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiGetToolProxyRegistrationRequest200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiGetToolProxyRegistrationRequest200Response is not found in the empty JSON string", ModLtiGetToolProxyRegistrationRequest200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiGetToolProxyRegistrationRequest200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiGetToolProxyRegistrationRequest200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLtiGetToolProxyRegistrationRequest200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("launch_presentation_return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `launch_presentation_return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("launch_presentation_return_url").toString()));
      }
      if (!jsonObj.get("lti_message_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lti_message_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lti_message_type").toString()));
      }
      if (!jsonObj.get("lti_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lti_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lti_version").toString()));
      }
      if (!jsonObj.get("reg_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reg_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reg_key").toString()));
      }
      if (!jsonObj.get("reg_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reg_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reg_password").toString()));
      }
      if (!jsonObj.get("reg_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reg_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reg_url").toString()));
      }
      if (!jsonObj.get("tc_profile_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tc_profile_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tc_profile_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiGetToolProxyRegistrationRequest200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiGetToolProxyRegistrationRequest200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiGetToolProxyRegistrationRequest200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiGetToolProxyRegistrationRequest200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiGetToolProxyRegistrationRequest200Response>() {
           @Override
           public void write(JsonWriter out, ModLtiGetToolProxyRegistrationRequest200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiGetToolProxyRegistrationRequest200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiGetToolProxyRegistrationRequest200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiGetToolProxyRegistrationRequest200Response
  * @throws IOException if the JSON string is invalid with respect to ModLtiGetToolProxyRegistrationRequest200Response
  */
  public static ModLtiGetToolProxyRegistrationRequest200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiGetToolProxyRegistrationRequest200Response.class);
  }

 /**
  * Convert an instance of ModLtiGetToolProxyRegistrationRequest200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

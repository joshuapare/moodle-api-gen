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
 * CoreUserAddUserDeviceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreUserAddUserDeviceRequest {
  public static final String SERIALIZED_NAME_APPID = "appid";
  @SerializedName(SERIALIZED_NAME_APPID)
  private String appid = "null";

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform = "null";

  public static final String SERIALIZED_NAME_PUBLICKEY = "publickey";
  @SerializedName(SERIALIZED_NAME_PUBLICKEY)
  private String publickey = "null";

  public static final String SERIALIZED_NAME_PUSHID = "pushid";
  @SerializedName(SERIALIZED_NAME_PUSHID)
  private String pushid = "null";

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid = "null";

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version = "null";

  public CoreUserAddUserDeviceRequest() {
  }

  public CoreUserAddUserDeviceRequest appid(String appid) {
    this.appid = appid;
    return this;
  }

   /**
   * the app id, usually something like com.moodle.moodlemobile
   * @return appid
  **/
  @javax.annotation.Nonnull
  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }


  public CoreUserAddUserDeviceRequest model(String model) {
    this.model = model;
    return this;
  }

   /**
   * the device model &#39;Nexus4&#39; or &#39;iPad1,1&#39; etc.
   * @return model
  **/
  @javax.annotation.Nonnull
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public CoreUserAddUserDeviceRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the device name, &#39;occam&#39; or &#39;iPhone&#39; etc.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreUserAddUserDeviceRequest platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * the device platform &#39;iOS&#39; or &#39;Android&#39; etc.
   * @return platform
  **/
  @javax.annotation.Nonnull
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public CoreUserAddUserDeviceRequest publickey(String publickey) {
    this.publickey = publickey;
    return this;
  }

   /**
   * the app generated public key
   * @return publickey
  **/
  @javax.annotation.Nullable
  public String getPublickey() {
    return publickey;
  }

  public void setPublickey(String publickey) {
    this.publickey = publickey;
  }


  public CoreUserAddUserDeviceRequest pushid(String pushid) {
    this.pushid = pushid;
    return this;
  }

   /**
   * the device PUSH token/key/identifier/registration id
   * @return pushid
  **/
  @javax.annotation.Nonnull
  public String getPushid() {
    return pushid;
  }

  public void setPushid(String pushid) {
    this.pushid = pushid;
  }


  public CoreUserAddUserDeviceRequest uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * the device UUID
   * @return uuid
  **/
  @javax.annotation.Nonnull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public CoreUserAddUserDeviceRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * the device version &#39;6.1.2&#39; or &#39;4.2.2&#39; etc.
   * @return version
  **/
  @javax.annotation.Nonnull
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreUserAddUserDeviceRequest coreUserAddUserDeviceRequest = (CoreUserAddUserDeviceRequest) o;
    return Objects.equals(this.appid, coreUserAddUserDeviceRequest.appid) &&
        Objects.equals(this.model, coreUserAddUserDeviceRequest.model) &&
        Objects.equals(this.name, coreUserAddUserDeviceRequest.name) &&
        Objects.equals(this.platform, coreUserAddUserDeviceRequest.platform) &&
        Objects.equals(this.publickey, coreUserAddUserDeviceRequest.publickey) &&
        Objects.equals(this.pushid, coreUserAddUserDeviceRequest.pushid) &&
        Objects.equals(this.uuid, coreUserAddUserDeviceRequest.uuid) &&
        Objects.equals(this.version, coreUserAddUserDeviceRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, model, name, platform, publickey, pushid, uuid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreUserAddUserDeviceRequest {\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    publickey: ").append(toIndentedString(publickey)).append("\n");
    sb.append("    pushid: ").append(toIndentedString(pushid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("appid");
    openapiFields.add("model");
    openapiFields.add("name");
    openapiFields.add("platform");
    openapiFields.add("publickey");
    openapiFields.add("pushid");
    openapiFields.add("uuid");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("appid");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("pushid");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreUserAddUserDeviceRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreUserAddUserDeviceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreUserAddUserDeviceRequest is not found in the empty JSON string", CoreUserAddUserDeviceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreUserAddUserDeviceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreUserAddUserDeviceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreUserAddUserDeviceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appid").toString()));
      }
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("publickey") != null && !jsonObj.get("publickey").isJsonNull()) && !jsonObj.get("publickey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publickey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publickey").toString()));
      }
      if (!jsonObj.get("pushid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pushid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pushid").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreUserAddUserDeviceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreUserAddUserDeviceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreUserAddUserDeviceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreUserAddUserDeviceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreUserAddUserDeviceRequest>() {
           @Override
           public void write(JsonWriter out, CoreUserAddUserDeviceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreUserAddUserDeviceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreUserAddUserDeviceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreUserAddUserDeviceRequest
  * @throws IOException if the JSON string is invalid with respect to CoreUserAddUserDeviceRequest
  */
  public static CoreUserAddUserDeviceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreUserAddUserDeviceRequest.class);
  }

 /**
  * Convert an instance of CoreUserAddUserDeviceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


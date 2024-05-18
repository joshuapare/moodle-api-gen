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
 * CoreUserUpdateUserDevicePublicKeyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreUserUpdateUserDevicePublicKeyRequest {
  public static final String SERIALIZED_NAME_APPID = "appid";
  @SerializedName(SERIALIZED_NAME_APPID)
  private String appid = "null";

  public static final String SERIALIZED_NAME_PUBLICKEY = "publickey";
  @SerializedName(SERIALIZED_NAME_PUBLICKEY)
  private String publickey;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public CoreUserUpdateUserDevicePublicKeyRequest() {
  }

  public CoreUserUpdateUserDevicePublicKeyRequest appid(String appid) {
    this.appid = appid;
    return this;
  }

   /**
   * The app id, something like com.moodle.moodlemobile
   * @return appid
  **/
  @javax.annotation.Nonnull
  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }


  public CoreUserUpdateUserDevicePublicKeyRequest publickey(String publickey) {
    this.publickey = publickey;
    return this;
  }

   /**
   * the app generated public key
   * @return publickey
  **/
  @javax.annotation.Nonnull
  public String getPublickey() {
    return publickey;
  }

  public void setPublickey(String publickey) {
    this.publickey = publickey;
  }


  public CoreUserUpdateUserDevicePublicKeyRequest uuid(String uuid) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreUserUpdateUserDevicePublicKeyRequest coreUserUpdateUserDevicePublicKeyRequest = (CoreUserUpdateUserDevicePublicKeyRequest) o;
    return Objects.equals(this.appid, coreUserUpdateUserDevicePublicKeyRequest.appid) &&
        Objects.equals(this.publickey, coreUserUpdateUserDevicePublicKeyRequest.publickey) &&
        Objects.equals(this.uuid, coreUserUpdateUserDevicePublicKeyRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, publickey, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreUserUpdateUserDevicePublicKeyRequest {\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    publickey: ").append(toIndentedString(publickey)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
    openapiFields.add("publickey");
    openapiFields.add("uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("appid");
    openapiRequiredFields.add("publickey");
    openapiRequiredFields.add("uuid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreUserUpdateUserDevicePublicKeyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreUserUpdateUserDevicePublicKeyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreUserUpdateUserDevicePublicKeyRequest is not found in the empty JSON string", CoreUserUpdateUserDevicePublicKeyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreUserUpdateUserDevicePublicKeyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreUserUpdateUserDevicePublicKeyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreUserUpdateUserDevicePublicKeyRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appid").toString()));
      }
      if (!jsonObj.get("publickey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publickey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publickey").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreUserUpdateUserDevicePublicKeyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreUserUpdateUserDevicePublicKeyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreUserUpdateUserDevicePublicKeyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreUserUpdateUserDevicePublicKeyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreUserUpdateUserDevicePublicKeyRequest>() {
           @Override
           public void write(JsonWriter out, CoreUserUpdateUserDevicePublicKeyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreUserUpdateUserDevicePublicKeyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreUserUpdateUserDevicePublicKeyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreUserUpdateUserDevicePublicKeyRequest
  * @throws IOException if the JSON string is invalid with respect to CoreUserUpdateUserDevicePublicKeyRequest
  */
  public static CoreUserUpdateUserDevicePublicKeyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreUserUpdateUserDevicePublicKeyRequest.class);
  }

 /**
  * Convert an instance of CoreUserUpdateUserDevicePublicKeyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


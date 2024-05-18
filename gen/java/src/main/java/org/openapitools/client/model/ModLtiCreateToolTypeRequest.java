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
 * ModLtiCreateToolTypeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiCreateToolTypeRequest {
  public static final String SERIALIZED_NAME_CARTRIDGEURL = "cartridgeurl";
  @SerializedName(SERIALIZED_NAME_CARTRIDGEURL)
  private String cartridgeurl = "";

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = "";

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret = "";

  public ModLtiCreateToolTypeRequest() {
  }

  public ModLtiCreateToolTypeRequest cartridgeurl(String cartridgeurl) {
    this.cartridgeurl = cartridgeurl;
    return this;
  }

   /**
   * URL to cardridge to load tool information
   * @return cartridgeurl
  **/
  @javax.annotation.Nullable
  public String getCartridgeurl() {
    return cartridgeurl;
  }

  public void setCartridgeurl(String cartridgeurl) {
    this.cartridgeurl = cartridgeurl;
  }


  public ModLtiCreateToolTypeRequest key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Consumer key
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public ModLtiCreateToolTypeRequest secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Shared secret
   * @return secret
  **/
  @javax.annotation.Nullable
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLtiCreateToolTypeRequest modLtiCreateToolTypeRequest = (ModLtiCreateToolTypeRequest) o;
    return Objects.equals(this.cartridgeurl, modLtiCreateToolTypeRequest.cartridgeurl) &&
        Objects.equals(this.key, modLtiCreateToolTypeRequest.key) &&
        Objects.equals(this.secret, modLtiCreateToolTypeRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartridgeurl, key, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiCreateToolTypeRequest {\n");
    sb.append("    cartridgeurl: ").append(toIndentedString(cartridgeurl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
    openapiFields.add("cartridgeurl");
    openapiFields.add("key");
    openapiFields.add("secret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiCreateToolTypeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiCreateToolTypeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiCreateToolTypeRequest is not found in the empty JSON string", ModLtiCreateToolTypeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiCreateToolTypeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiCreateToolTypeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cartridgeurl") != null && !jsonObj.get("cartridgeurl").isJsonNull()) && !jsonObj.get("cartridgeurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cartridgeurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cartridgeurl").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiCreateToolTypeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiCreateToolTypeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiCreateToolTypeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiCreateToolTypeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiCreateToolTypeRequest>() {
           @Override
           public void write(JsonWriter out, ModLtiCreateToolTypeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiCreateToolTypeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiCreateToolTypeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiCreateToolTypeRequest
  * @throws IOException if the JSON string is invalid with respect to ModLtiCreateToolTypeRequest
  */
  public static ModLtiCreateToolTypeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiCreateToolTypeRequest.class);
  }

 /**
  * Convert an instance of ModLtiCreateToolTypeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * ModChatGetChatLatestMessagesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModChatGetChatLatestMessagesRequest {
  public static final String SERIALIZED_NAME_CHATLASTTIME = "chatlasttime";
  @SerializedName(SERIALIZED_NAME_CHATLASTTIME)
  private Integer chatlasttime = 0;

  public static final String SERIALIZED_NAME_CHATSID = "chatsid";
  @SerializedName(SERIALIZED_NAME_CHATSID)
  private String chatsid = "null";

  public ModChatGetChatLatestMessagesRequest() {
  }

  public ModChatGetChatLatestMessagesRequest chatlasttime(Integer chatlasttime) {
    this.chatlasttime = chatlasttime;
    return this;
  }

   /**
   * last time messages were retrieved (epoch time)
   * @return chatlasttime
  **/
  @javax.annotation.Nullable
  public Integer getChatlasttime() {
    return chatlasttime;
  }

  public void setChatlasttime(Integer chatlasttime) {
    this.chatlasttime = chatlasttime;
  }


  public ModChatGetChatLatestMessagesRequest chatsid(String chatsid) {
    this.chatsid = chatsid;
    return this;
  }

   /**
   * chat session id (obtained via mod_chat_login_user)
   * @return chatsid
  **/
  @javax.annotation.Nonnull
  public String getChatsid() {
    return chatsid;
  }

  public void setChatsid(String chatsid) {
    this.chatsid = chatsid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModChatGetChatLatestMessagesRequest modChatGetChatLatestMessagesRequest = (ModChatGetChatLatestMessagesRequest) o;
    return Objects.equals(this.chatlasttime, modChatGetChatLatestMessagesRequest.chatlasttime) &&
        Objects.equals(this.chatsid, modChatGetChatLatestMessagesRequest.chatsid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatlasttime, chatsid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModChatGetChatLatestMessagesRequest {\n");
    sb.append("    chatlasttime: ").append(toIndentedString(chatlasttime)).append("\n");
    sb.append("    chatsid: ").append(toIndentedString(chatsid)).append("\n");
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
    openapiFields.add("chatlasttime");
    openapiFields.add("chatsid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chatsid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModChatGetChatLatestMessagesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModChatGetChatLatestMessagesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModChatGetChatLatestMessagesRequest is not found in the empty JSON string", ModChatGetChatLatestMessagesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModChatGetChatLatestMessagesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModChatGetChatLatestMessagesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModChatGetChatLatestMessagesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("chatsid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chatsid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chatsid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModChatGetChatLatestMessagesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModChatGetChatLatestMessagesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModChatGetChatLatestMessagesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModChatGetChatLatestMessagesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModChatGetChatLatestMessagesRequest>() {
           @Override
           public void write(JsonWriter out, ModChatGetChatLatestMessagesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModChatGetChatLatestMessagesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModChatGetChatLatestMessagesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModChatGetChatLatestMessagesRequest
  * @throws IOException if the JSON string is invalid with respect to ModChatGetChatLatestMessagesRequest
  */
  public static ModChatGetChatLatestMessagesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModChatGetChatLatestMessagesRequest.class);
  }

 /**
  * Convert an instance of ModChatGetChatLatestMessagesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

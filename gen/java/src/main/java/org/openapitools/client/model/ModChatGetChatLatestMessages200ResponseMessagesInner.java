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
 * ModChatGetChatLatestMessages200ResponseMessagesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModChatGetChatLatestMessages200ResponseMessagesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = "null";

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private Boolean system = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp = null;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public ModChatGetChatLatestMessages200ResponseMessagesInner() {
  }

  public ModChatGetChatLatestMessages200ResponseMessagesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * message id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModChatGetChatLatestMessages200ResponseMessagesInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message text
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public ModChatGetChatLatestMessages200ResponseMessagesInner system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * true if is a system message (like user joined)
   * @return system
  **/
  @javax.annotation.Nullable
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }


  public ModChatGetChatLatestMessages200ResponseMessagesInner timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * timestamp for the message
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ModChatGetChatLatestMessages200ResponseMessagesInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * user id
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModChatGetChatLatestMessages200ResponseMessagesInner modChatGetChatLatestMessages200ResponseMessagesInner = (ModChatGetChatLatestMessages200ResponseMessagesInner) o;
    return Objects.equals(this.id, modChatGetChatLatestMessages200ResponseMessagesInner.id) &&
        Objects.equals(this.message, modChatGetChatLatestMessages200ResponseMessagesInner.message) &&
        Objects.equals(this.system, modChatGetChatLatestMessages200ResponseMessagesInner.system) &&
        Objects.equals(this.timestamp, modChatGetChatLatestMessages200ResponseMessagesInner.timestamp) &&
        Objects.equals(this.userid, modChatGetChatLatestMessages200ResponseMessagesInner.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, system, timestamp, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModChatGetChatLatestMessages200ResponseMessagesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("system");
    openapiFields.add("timestamp");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModChatGetChatLatestMessages200ResponseMessagesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModChatGetChatLatestMessages200ResponseMessagesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModChatGetChatLatestMessages200ResponseMessagesInner is not found in the empty JSON string", ModChatGetChatLatestMessages200ResponseMessagesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModChatGetChatLatestMessages200ResponseMessagesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModChatGetChatLatestMessages200ResponseMessagesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModChatGetChatLatestMessages200ResponseMessagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModChatGetChatLatestMessages200ResponseMessagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModChatGetChatLatestMessages200ResponseMessagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModChatGetChatLatestMessages200ResponseMessagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModChatGetChatLatestMessages200ResponseMessagesInner>() {
           @Override
           public void write(JsonWriter out, ModChatGetChatLatestMessages200ResponseMessagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModChatGetChatLatestMessages200ResponseMessagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModChatGetChatLatestMessages200ResponseMessagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModChatGetChatLatestMessages200ResponseMessagesInner
  * @throws IOException if the JSON string is invalid with respect to ModChatGetChatLatestMessages200ResponseMessagesInner
  */
  public static ModChatGetChatLatestMessages200ResponseMessagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModChatGetChatLatestMessages200ResponseMessagesInner.class);
  }

 /**
  * Convert an instance of ModChatGetChatLatestMessages200ResponseMessagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
import org.openapitools.client.model.ToolLpSearchUsers200ResponseUsersInner;

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
 * ToolLpSearchUsers200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpSearchUsers200Response {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = null;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<ToolLpSearchUsers200ResponseUsersInner> users = new ArrayList<>();

  public ToolLpSearchUsers200Response() {
  }

  public ToolLpSearchUsers200Response count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of results.
   * @return count
  **/
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public ToolLpSearchUsers200Response users(List<ToolLpSearchUsers200ResponseUsersInner> users) {
    this.users = users;
    return this;
  }

  public ToolLpSearchUsers200Response addUsersItem(ToolLpSearchUsers200ResponseUsersInner usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nonnull
  public List<ToolLpSearchUsers200ResponseUsersInner> getUsers() {
    return users;
  }

  public void setUsers(List<ToolLpSearchUsers200ResponseUsersInner> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolLpSearchUsers200Response toolLpSearchUsers200Response = (ToolLpSearchUsers200Response) o;
    return Objects.equals(this.count, toolLpSearchUsers200Response.count) &&
        Objects.equals(this.users, toolLpSearchUsers200Response.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpSearchUsers200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("users");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpSearchUsers200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpSearchUsers200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpSearchUsers200Response is not found in the empty JSON string", ToolLpSearchUsers200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpSearchUsers200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpSearchUsers200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpSearchUsers200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }

      JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
      // validate the required field `users` (array)
      for (int i = 0; i < jsonArrayusers.size(); i++) {
        ToolLpSearchUsers200ResponseUsersInner.validateJsonElement(jsonArrayusers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpSearchUsers200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpSearchUsers200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpSearchUsers200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpSearchUsers200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpSearchUsers200Response>() {
           @Override
           public void write(JsonWriter out, ToolLpSearchUsers200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpSearchUsers200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpSearchUsers200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpSearchUsers200Response
  * @throws IOException if the JSON string is invalid with respect to ToolLpSearchUsers200Response
  */
  public static ToolLpSearchUsers200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpSearchUsers200Response.class);
  }

 /**
  * Convert an instance of ToolLpSearchUsers200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


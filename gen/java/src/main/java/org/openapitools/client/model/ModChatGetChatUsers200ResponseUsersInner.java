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
 * ModChatGetChatUsers200ResponseUsersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModChatGetChatUsers200ResponseUsersInner {
  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PROFILEIMAGEURL = "profileimageurl";
  @SerializedName(SERIALIZED_NAME_PROFILEIMAGEURL)
  private String profileimageurl = "null";

  public ModChatGetChatUsers200ResponseUsersInner() {
  }

  public ModChatGetChatUsers200ResponseUsersInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * user full name
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public ModChatGetChatUsers200ResponseUsersInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * user id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModChatGetChatUsers200ResponseUsersInner profileimageurl(String profileimageurl) {
    this.profileimageurl = profileimageurl;
    return this;
  }

   /**
   * user picture URL
   * @return profileimageurl
  **/
  @javax.annotation.Nullable
  public String getProfileimageurl() {
    return profileimageurl;
  }

  public void setProfileimageurl(String profileimageurl) {
    this.profileimageurl = profileimageurl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModChatGetChatUsers200ResponseUsersInner modChatGetChatUsers200ResponseUsersInner = (ModChatGetChatUsers200ResponseUsersInner) o;
    return Objects.equals(this.fullname, modChatGetChatUsers200ResponseUsersInner.fullname) &&
        Objects.equals(this.id, modChatGetChatUsers200ResponseUsersInner.id) &&
        Objects.equals(this.profileimageurl, modChatGetChatUsers200ResponseUsersInner.profileimageurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullname, id, profileimageurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModChatGetChatUsers200ResponseUsersInner {\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profileimageurl: ").append(toIndentedString(profileimageurl)).append("\n");
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
    openapiFields.add("fullname");
    openapiFields.add("id");
    openapiFields.add("profileimageurl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModChatGetChatUsers200ResponseUsersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModChatGetChatUsers200ResponseUsersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModChatGetChatUsers200ResponseUsersInner is not found in the empty JSON string", ModChatGetChatUsers200ResponseUsersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModChatGetChatUsers200ResponseUsersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModChatGetChatUsers200ResponseUsersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if ((jsonObj.get("profileimageurl") != null && !jsonObj.get("profileimageurl").isJsonNull()) && !jsonObj.get("profileimageurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileimageurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileimageurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModChatGetChatUsers200ResponseUsersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModChatGetChatUsers200ResponseUsersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModChatGetChatUsers200ResponseUsersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModChatGetChatUsers200ResponseUsersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModChatGetChatUsers200ResponseUsersInner>() {
           @Override
           public void write(JsonWriter out, ModChatGetChatUsers200ResponseUsersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModChatGetChatUsers200ResponseUsersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModChatGetChatUsers200ResponseUsersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModChatGetChatUsers200ResponseUsersInner
  * @throws IOException if the JSON string is invalid with respect to ModChatGetChatUsers200ResponseUsersInner
  */
  public static ModChatGetChatUsers200ResponseUsersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModChatGetChatUsers200ResponseUsersInner.class);
  }

 /**
  * Convert an instance of ModChatGetChatUsers200ResponseUsersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


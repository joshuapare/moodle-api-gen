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
 * CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version = "null";

  public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner() {
  }

  public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Badge id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Badge name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @javax.annotation.Nullable
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version
   * @return version
  **/
  @javax.annotation.Nullable
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
    CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner coreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner = (CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner) o;
    return Objects.equals(this.id, coreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.id) &&
        Objects.equals(this.language, coreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.language) &&
        Objects.equals(this.name, coreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.name) &&
        Objects.equals(this.type, coreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.type) &&
        Objects.equals(this.version, coreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, name, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("language");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner is not found in the empty JSON string", CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner>() {
           @Override
           public void write(JsonWriter out, CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner
  * @throws IOException if the JSON string is invalid with respect to CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner
  */
  public static CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.class);
  }

 /**
  * Convert an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner {
  public static final String SERIALIZED_NAME_GROUPIMAGEURL = "groupimageurl";
  @SerializedName(SERIALIZED_NAME_GROUPIMAGEURL)
  private String groupimageurl = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner() {
  }

  public CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner groupimageurl(String groupimageurl) {
    this.groupimageurl = groupimageurl;
    return this;
  }

   /**
   * Group image URL
   * @return groupimageurl
  **/
  @javax.annotation.Nullable
  public String getGroupimageurl() {
    return groupimageurl;
  }

  public void setGroupimageurl(String groupimageurl) {
    this.groupimageurl = groupimageurl;
  }


  public CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An ID for the group
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full name of the group
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner coreGradesGetGroupsForSearchWidget200ResponseGroupsInner = (CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner) o;
    return Objects.equals(this.groupimageurl, coreGradesGetGroupsForSearchWidget200ResponseGroupsInner.groupimageurl) &&
        Objects.equals(this.id, coreGradesGetGroupsForSearchWidget200ResponseGroupsInner.id) &&
        Objects.equals(this.name, coreGradesGetGroupsForSearchWidget200ResponseGroupsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupimageurl, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner {\n");
    sb.append("    groupimageurl: ").append(toIndentedString(groupimageurl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("groupimageurl");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner is not found in the empty JSON string", CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("groupimageurl") != null && !jsonObj.get("groupimageurl").isJsonNull()) && !jsonObj.get("groupimageurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupimageurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupimageurl").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner>() {
           @Override
           public void write(JsonWriter out, CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
  * @throws IOException if the JSON string is invalid with respect to CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner
  */
  public static CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.class);
  }

 /**
  * Convert an instance of CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


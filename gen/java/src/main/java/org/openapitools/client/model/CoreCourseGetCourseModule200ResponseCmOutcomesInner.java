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
 * CoreCourseGetCourseModule200ResponseCmOutcomesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseGetCourseModule200ResponseCmOutcomesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private String scale = "null";

  public CoreCourseGetCourseModule200ResponseCmOutcomesInner() {
  }

  public CoreCourseGetCourseModule200ResponseCmOutcomesInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Outcome id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CoreCourseGetCourseModule200ResponseCmOutcomesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Outcome full name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreCourseGetCourseModule200ResponseCmOutcomesInner scale(String scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Scale items
   * @return scale
  **/
  @javax.annotation.Nullable
  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseGetCourseModule200ResponseCmOutcomesInner coreCourseGetCourseModule200ResponseCmOutcomesInner = (CoreCourseGetCourseModule200ResponseCmOutcomesInner) o;
    return Objects.equals(this.id, coreCourseGetCourseModule200ResponseCmOutcomesInner.id) &&
        Objects.equals(this.name, coreCourseGetCourseModule200ResponseCmOutcomesInner.name) &&
        Objects.equals(this.scale, coreCourseGetCourseModule200ResponseCmOutcomesInner.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseGetCourseModule200ResponseCmOutcomesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("scale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseGetCourseModule200ResponseCmOutcomesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseGetCourseModule200ResponseCmOutcomesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseGetCourseModule200ResponseCmOutcomesInner is not found in the empty JSON string", CoreCourseGetCourseModule200ResponseCmOutcomesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseGetCourseModule200ResponseCmOutcomesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseGetCourseModule200ResponseCmOutcomesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseGetCourseModule200ResponseCmOutcomesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseGetCourseModule200ResponseCmOutcomesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseGetCourseModule200ResponseCmOutcomesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseGetCourseModule200ResponseCmOutcomesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseGetCourseModule200ResponseCmOutcomesInner>() {
           @Override
           public void write(JsonWriter out, CoreCourseGetCourseModule200ResponseCmOutcomesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseGetCourseModule200ResponseCmOutcomesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseGetCourseModule200ResponseCmOutcomesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseGetCourseModule200ResponseCmOutcomesInner
  * @throws IOException if the JSON string is invalid with respect to CoreCourseGetCourseModule200ResponseCmOutcomesInner
  */
  public static CoreCourseGetCourseModule200ResponseCmOutcomesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseGetCourseModule200ResponseCmOutcomesInner.class);
  }

 /**
  * Convert an instance of CoreCourseGetCourseModule200ResponseCmOutcomesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


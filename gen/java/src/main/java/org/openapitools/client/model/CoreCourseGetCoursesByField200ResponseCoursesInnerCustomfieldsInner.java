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
 * CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUERAW = "valueraw";
  @SerializedName(SERIALIZED_NAME_VALUERAW)
  private String valueraw;

  public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner() {
  }

  public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * The shortname of the custom field - to be able to build the field class in the code
   * @return shortname
  **/
  @javax.annotation.Nullable
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the custom field - text field, checkbox...
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner valueraw(String valueraw) {
    this.valueraw = valueraw;
    return this;
  }

   /**
   * The raw value of the custom field
   * @return valueraw
  **/
  @javax.annotation.Nullable
  public String getValueraw() {
    return valueraw;
  }

  public void setValueraw(String valueraw) {
    this.valueraw = valueraw;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner coreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner = (CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner) o;
    return Objects.equals(this.name, coreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.name) &&
        Objects.equals(this.shortname, coreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.shortname) &&
        Objects.equals(this.type, coreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.type) &&
        Objects.equals(this.value, coreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.value) &&
        Objects.equals(this.valueraw, coreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.valueraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortname, type, value, valueraw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueraw: ").append(toIndentedString(valueraw)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("shortname");
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("valueraw");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner is not found in the empty JSON string", CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("valueraw") != null && !jsonObj.get("valueraw").isJsonNull()) && !jsonObj.get("valueraw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueraw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueraw").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner>() {
           @Override
           public void write(JsonWriter out, CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
  * @throws IOException if the JSON string is invalid with respect to CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
  */
  public static CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.class);
  }

 /**
  * Convert an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


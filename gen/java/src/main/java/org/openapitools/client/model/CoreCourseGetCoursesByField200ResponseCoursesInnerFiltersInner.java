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
 * CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter = "null";

  public static final String SERIALIZED_NAME_INHERITEDSTATE = "inheritedstate";
  @SerializedName(SERIALIZED_NAME_INHERITEDSTATE)
  private Integer inheritedstate = null;

  public static final String SERIALIZED_NAME_LOCALSTATE = "localstate";
  @SerializedName(SERIALIZED_NAME_LOCALSTATE)
  private Integer localstate = null;

  public CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner() {
  }

  public CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Filter plugin name
   * @return filter
  **/
  @javax.annotation.Nullable
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }


  public CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner inheritedstate(Integer inheritedstate) {
    this.inheritedstate = inheritedstate;
    return this;
  }

   /**
   * 1 or 0 to use when localstate is set to inherit
   * @return inheritedstate
  **/
  @javax.annotation.Nullable
  public Integer getInheritedstate() {
    return inheritedstate;
  }

  public void setInheritedstate(Integer inheritedstate) {
    this.inheritedstate = inheritedstate;
  }


  public CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner localstate(Integer localstate) {
    this.localstate = localstate;
    return this;
  }

   /**
   * Filter state: 1 for on, -1 for off, 0 if inherit
   * @return localstate
  **/
  @javax.annotation.Nullable
  public Integer getLocalstate() {
    return localstate;
  }

  public void setLocalstate(Integer localstate) {
    this.localstate = localstate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner coreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner = (CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner) o;
    return Objects.equals(this.filter, coreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.filter) &&
        Objects.equals(this.inheritedstate, coreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.inheritedstate) &&
        Objects.equals(this.localstate, coreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.localstate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, inheritedstate, localstate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    inheritedstate: ").append(toIndentedString(inheritedstate)).append("\n");
    sb.append("    localstate: ").append(toIndentedString(localstate)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("inheritedstate");
    openapiFields.add("localstate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner is not found in the empty JSON string", CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner>() {
           @Override
           public void write(JsonWriter out, CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
  * @throws IOException if the JSON string is invalid with respect to CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner
  */
  public static CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.class);
  }

 /**
  * Convert an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


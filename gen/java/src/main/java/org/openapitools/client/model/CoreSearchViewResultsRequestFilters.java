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
 * CoreSearchViewResultsRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreSearchViewResultsRequestFilters {
  public static final String SERIALIZED_NAME_AREAIDS = "areaids";
  @SerializedName(SERIALIZED_NAME_AREAIDS)
  private List<Object> areaids = new ArrayList<>();

  public static final String SERIALIZED_NAME_COURSEIDS = "courseids";
  @SerializedName(SERIALIZED_NAME_COURSEIDS)
  private List<Object> courseids = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMEEND = "timeend";
  @SerializedName(SERIALIZED_NAME_TIMEEND)
  private Integer timeend = 0;

  public static final String SERIALIZED_NAME_TIMESTART = "timestart";
  @SerializedName(SERIALIZED_NAME_TIMESTART)
  private Integer timestart = 0;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public CoreSearchViewResultsRequestFilters() {
  }

  public CoreSearchViewResultsRequestFilters areaids(List<Object> areaids) {
    this.areaids = areaids;
    return this;
  }

  public CoreSearchViewResultsRequestFilters addAreaidsItem(Object areaidsItem) {
    if (this.areaids == null) {
      this.areaids = new ArrayList<>();
    }
    this.areaids.add(areaidsItem);
    return this;
  }

   /**
   * Get areaids
   * @return areaids
  **/
  @javax.annotation.Nullable
  public List<Object> getAreaids() {
    return areaids;
  }

  public void setAreaids(List<Object> areaids) {
    this.areaids = areaids;
  }


  public CoreSearchViewResultsRequestFilters courseids(List<Object> courseids) {
    this.courseids = courseids;
    return this;
  }

  public CoreSearchViewResultsRequestFilters addCourseidsItem(Object courseidsItem) {
    if (this.courseids == null) {
      this.courseids = new ArrayList<>();
    }
    this.courseids.add(courseidsItem);
    return this;
  }

   /**
   * Get courseids
   * @return courseids
  **/
  @javax.annotation.Nullable
  public List<Object> getCourseids() {
    return courseids;
  }

  public void setCourseids(List<Object> courseids) {
    this.courseids = courseids;
  }


  public CoreSearchViewResultsRequestFilters timeend(Integer timeend) {
    this.timeend = timeend;
    return this;
  }

   /**
   * docs modified before this date
   * @return timeend
  **/
  @javax.annotation.Nullable
  public Integer getTimeend() {
    return timeend;
  }

  public void setTimeend(Integer timeend) {
    this.timeend = timeend;
  }


  public CoreSearchViewResultsRequestFilters timestart(Integer timestart) {
    this.timestart = timestart;
    return this;
  }

   /**
   * docs modified after this date
   * @return timestart
  **/
  @javax.annotation.Nullable
  public Integer getTimestart() {
    return timestart;
  }

  public void setTimestart(Integer timestart) {
    this.timestart = timestart;
  }


  public CoreSearchViewResultsRequestFilters title(String title) {
    this.title = title;
    return this;
  }

   /**
   * result title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreSearchViewResultsRequestFilters coreSearchViewResultsRequestFilters = (CoreSearchViewResultsRequestFilters) o;
    return Objects.equals(this.areaids, coreSearchViewResultsRequestFilters.areaids) &&
        Objects.equals(this.courseids, coreSearchViewResultsRequestFilters.courseids) &&
        Objects.equals(this.timeend, coreSearchViewResultsRequestFilters.timeend) &&
        Objects.equals(this.timestart, coreSearchViewResultsRequestFilters.timestart) &&
        Objects.equals(this.title, coreSearchViewResultsRequestFilters.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaids, courseids, timeend, timestart, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreSearchViewResultsRequestFilters {\n");
    sb.append("    areaids: ").append(toIndentedString(areaids)).append("\n");
    sb.append("    courseids: ").append(toIndentedString(courseids)).append("\n");
    sb.append("    timeend: ").append(toIndentedString(timeend)).append("\n");
    sb.append("    timestart: ").append(toIndentedString(timestart)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("areaids");
    openapiFields.add("courseids");
    openapiFields.add("timeend");
    openapiFields.add("timestart");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreSearchViewResultsRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreSearchViewResultsRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreSearchViewResultsRequestFilters is not found in the empty JSON string", CoreSearchViewResultsRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreSearchViewResultsRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreSearchViewResultsRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("areaids") != null && !jsonObj.get("areaids").isJsonNull() && !jsonObj.get("areaids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `areaids` to be an array in the JSON string but got `%s`", jsonObj.get("areaids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("courseids") != null && !jsonObj.get("courseids").isJsonNull() && !jsonObj.get("courseids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `courseids` to be an array in the JSON string but got `%s`", jsonObj.get("courseids").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreSearchViewResultsRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreSearchViewResultsRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreSearchViewResultsRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreSearchViewResultsRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreSearchViewResultsRequestFilters>() {
           @Override
           public void write(JsonWriter out, CoreSearchViewResultsRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreSearchViewResultsRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreSearchViewResultsRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreSearchViewResultsRequestFilters
  * @throws IOException if the JSON string is invalid with respect to CoreSearchViewResultsRequestFilters
  */
  public static CoreSearchViewResultsRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreSearchViewResultsRequestFilters.class);
  }

 /**
  * Convert an instance of CoreSearchViewResultsRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


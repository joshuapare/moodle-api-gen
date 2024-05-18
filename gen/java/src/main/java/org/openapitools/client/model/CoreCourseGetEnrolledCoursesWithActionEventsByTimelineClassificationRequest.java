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
 * CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest {
  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private String classification;

  public static final String SERIALIZED_NAME_CUSTOMFIELDNAME = "customfieldname";
  @SerializedName(SERIALIZED_NAME_CUSTOMFIELDNAME)
  private String customfieldname;

  public static final String SERIALIZED_NAME_CUSTOMFIELDVALUE = "customfieldvalue";
  @SerializedName(SERIALIZED_NAME_CUSTOMFIELDVALUE)
  private String customfieldvalue;

  public static final String SERIALIZED_NAME_EVENTSFROM = "eventsfrom";
  @SerializedName(SERIALIZED_NAME_EVENTSFROM)
  private Integer eventsfrom = null;

  public static final String SERIALIZED_NAME_EVENTSTO = "eventsto";
  @SerializedName(SERIALIZED_NAME_EVENTSTO)
  private Integer eventsto = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 0;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_SEARCHVALUE = "searchvalue";
  @SerializedName(SERIALIZED_NAME_SEARCHVALUE)
  private String searchvalue;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest() {
  }

  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest classification(String classification) {
    this.classification = classification;
    return this;
  }

   /**
   * future, inprogress, or past
   * @return classification
  **/
  @javax.annotation.Nonnull
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest customfieldname(String customfieldname) {
    this.customfieldname = customfieldname;
    return this;
  }

   /**
   * Used when classification &#x3D; customfield
   * @return customfieldname
  **/
  @javax.annotation.Nullable
  public String getCustomfieldname() {
    return customfieldname;
  }

  public void setCustomfieldname(String customfieldname) {
    this.customfieldname = customfieldname;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest customfieldvalue(String customfieldvalue) {
    this.customfieldvalue = customfieldvalue;
    return this;
  }

   /**
   * Used when classification &#x3D; customfield
   * @return customfieldvalue
  **/
  @javax.annotation.Nullable
  public String getCustomfieldvalue() {
    return customfieldvalue;
  }

  public void setCustomfieldvalue(String customfieldvalue) {
    this.customfieldvalue = customfieldvalue;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest eventsfrom(Integer eventsfrom) {
    this.eventsfrom = eventsfrom;
    return this;
  }

   /**
   * Optional starting timestamp for action events
   * @return eventsfrom
  **/
  @javax.annotation.Nullable
  public Integer getEventsfrom() {
    return eventsfrom;
  }

  public void setEventsfrom(Integer eventsfrom) {
    this.eventsfrom = eventsfrom;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest eventsto(Integer eventsto) {
    this.eventsto = eventsto;
    return this;
  }

   /**
   * Optional ending timestamp for action events
   * @return eventsto
  **/
  @javax.annotation.Nullable
  public Integer getEventsto() {
    return eventsto;
  }

  public void setEventsto(Integer eventsto) {
    this.eventsto = eventsto;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Result set limit
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Result set offset
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest searchvalue(String searchvalue) {
    this.searchvalue = searchvalue;
    return this;
  }

   /**
   * The value a user wishes to search against
   * @return searchvalue
  **/
  @javax.annotation.Nullable
  public String getSearchvalue() {
    return searchvalue;
  }

  public void setSearchvalue(String searchvalue) {
    this.searchvalue = searchvalue;
  }


  public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Sort string
   * @return sort
  **/
  @javax.annotation.Nullable
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest = (CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest) o;
    return Objects.equals(this.classification, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.classification) &&
        Objects.equals(this.customfieldname, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.customfieldname) &&
        Objects.equals(this.customfieldvalue, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.customfieldvalue) &&
        Objects.equals(this.eventsfrom, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.eventsfrom) &&
        Objects.equals(this.eventsto, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.eventsto) &&
        Objects.equals(this.limit, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.limit) &&
        Objects.equals(this.offset, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.offset) &&
        Objects.equals(this.searchvalue, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.searchvalue) &&
        Objects.equals(this.sort, coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, customfieldname, customfieldvalue, eventsfrom, eventsto, limit, offset, searchvalue, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    customfieldname: ").append(toIndentedString(customfieldname)).append("\n");
    sb.append("    customfieldvalue: ").append(toIndentedString(customfieldvalue)).append("\n");
    sb.append("    eventsfrom: ").append(toIndentedString(eventsfrom)).append("\n");
    sb.append("    eventsto: ").append(toIndentedString(eventsto)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    searchvalue: ").append(toIndentedString(searchvalue)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("classification");
    openapiFields.add("customfieldname");
    openapiFields.add("customfieldvalue");
    openapiFields.add("eventsfrom");
    openapiFields.add("eventsto");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("searchvalue");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("classification");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest is not found in the empty JSON string", CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
      if ((jsonObj.get("customfieldname") != null && !jsonObj.get("customfieldname").isJsonNull()) && !jsonObj.get("customfieldname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customfieldname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customfieldname").toString()));
      }
      if ((jsonObj.get("customfieldvalue") != null && !jsonObj.get("customfieldvalue").isJsonNull()) && !jsonObj.get("customfieldvalue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customfieldvalue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customfieldvalue").toString()));
      }
      if ((jsonObj.get("searchvalue") != null && !jsonObj.get("searchvalue").isJsonNull()) && !jsonObj.get("searchvalue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchvalue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchvalue").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest>() {
           @Override
           public void write(JsonWriter out, CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest
  * @throws IOException if the JSON string is invalid with respect to CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest
  */
  public static CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.class);
  }

 /**
  * Convert an instance of CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

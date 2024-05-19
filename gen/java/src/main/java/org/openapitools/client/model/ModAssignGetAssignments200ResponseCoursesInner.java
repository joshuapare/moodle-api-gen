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
import org.openapitools.client.model.ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner;

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
 * course information object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetAssignments200ResponseCoursesInner {
  public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
  private List<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner> assignments = new ArrayList<>();

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public ModAssignGetAssignments200ResponseCoursesInner() {
  }

  public ModAssignGetAssignments200ResponseCoursesInner assignments(List<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner> assignments) {
    this.assignments = assignments;
    return this;
  }

  public ModAssignGetAssignments200ResponseCoursesInner addAssignmentsItem(ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @javax.annotation.Nullable
  public List<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner> assignments) {
    this.assignments = assignments;
  }


  public ModAssignGetAssignments200ResponseCoursesInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * course full name
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public ModAssignGetAssignments200ResponseCoursesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * course id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModAssignGetAssignments200ResponseCoursesInner shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * course short name
   * @return shortname
  **/
  @javax.annotation.Nullable
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public ModAssignGetAssignments200ResponseCoursesInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * last time modified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetAssignments200ResponseCoursesInner modAssignGetAssignments200ResponseCoursesInner = (ModAssignGetAssignments200ResponseCoursesInner) o;
    return Objects.equals(this.assignments, modAssignGetAssignments200ResponseCoursesInner.assignments) &&
        Objects.equals(this.fullname, modAssignGetAssignments200ResponseCoursesInner.fullname) &&
        Objects.equals(this.id, modAssignGetAssignments200ResponseCoursesInner.id) &&
        Objects.equals(this.shortname, modAssignGetAssignments200ResponseCoursesInner.shortname) &&
        Objects.equals(this.timemodified, modAssignGetAssignments200ResponseCoursesInner.timemodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments, fullname, id, shortname, timemodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetAssignments200ResponseCoursesInner {\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
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
    openapiFields.add("assignments");
    openapiFields.add("fullname");
    openapiFields.add("id");
    openapiFields.add("shortname");
    openapiFields.add("timemodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetAssignments200ResponseCoursesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetAssignments200ResponseCoursesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetAssignments200ResponseCoursesInner is not found in the empty JSON string", ModAssignGetAssignments200ResponseCoursesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetAssignments200ResponseCoursesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetAssignments200ResponseCoursesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("assignments") != null && !jsonObj.get("assignments").isJsonNull()) {
        JsonArray jsonArrayassignments = jsonObj.getAsJsonArray("assignments");
        if (jsonArrayassignments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("assignments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `assignments` to be an array in the JSON string but got `%s`", jsonObj.get("assignments").toString()));
          }

          // validate the optional field `assignments` (array)
          for (int i = 0; i < jsonArrayassignments.size(); i++) {
            ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner.validateJsonElement(jsonArrayassignments.get(i));
          };
        }
      }
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetAssignments200ResponseCoursesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetAssignments200ResponseCoursesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetAssignments200ResponseCoursesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetAssignments200ResponseCoursesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetAssignments200ResponseCoursesInner>() {
           @Override
           public void write(JsonWriter out, ModAssignGetAssignments200ResponseCoursesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetAssignments200ResponseCoursesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetAssignments200ResponseCoursesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetAssignments200ResponseCoursesInner
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetAssignments200ResponseCoursesInner
  */
  public static ModAssignGetAssignments200ResponseCoursesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetAssignments200ResponseCoursesInner.class);
  }

 /**
  * Convert an instance of ModAssignGetAssignments200ResponseCoursesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


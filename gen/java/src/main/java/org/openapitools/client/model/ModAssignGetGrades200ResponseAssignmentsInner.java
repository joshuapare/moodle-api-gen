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
import org.openapitools.client.model.ModAssignGetGrades200ResponseAssignmentsInnerGradesInner;

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
 * ModAssignGetGrades200ResponseAssignmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetGrades200ResponseAssignmentsInner {
  public static final String SERIALIZED_NAME_ASSIGNMENTID = "assignmentid";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTID)
  private Integer assignmentid;

  public static final String SERIALIZED_NAME_GRADES = "grades";
  @SerializedName(SERIALIZED_NAME_GRADES)
  private List<ModAssignGetGrades200ResponseAssignmentsInnerGradesInner> grades = new ArrayList<>();

  public ModAssignGetGrades200ResponseAssignmentsInner() {
  }

  public ModAssignGetGrades200ResponseAssignmentsInner assignmentid(Integer assignmentid) {
    this.assignmentid = assignmentid;
    return this;
  }

   /**
   * assignment id
   * @return assignmentid
  **/
  @javax.annotation.Nullable
  public Integer getAssignmentid() {
    return assignmentid;
  }

  public void setAssignmentid(Integer assignmentid) {
    this.assignmentid = assignmentid;
  }


  public ModAssignGetGrades200ResponseAssignmentsInner grades(List<ModAssignGetGrades200ResponseAssignmentsInnerGradesInner> grades) {
    this.grades = grades;
    return this;
  }

  public ModAssignGetGrades200ResponseAssignmentsInner addGradesItem(ModAssignGetGrades200ResponseAssignmentsInnerGradesInner gradesItem) {
    if (this.grades == null) {
      this.grades = new ArrayList<>();
    }
    this.grades.add(gradesItem);
    return this;
  }

   /**
   * Get grades
   * @return grades
  **/
  @javax.annotation.Nullable
  public List<ModAssignGetGrades200ResponseAssignmentsInnerGradesInner> getGrades() {
    return grades;
  }

  public void setGrades(List<ModAssignGetGrades200ResponseAssignmentsInnerGradesInner> grades) {
    this.grades = grades;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetGrades200ResponseAssignmentsInner modAssignGetGrades200ResponseAssignmentsInner = (ModAssignGetGrades200ResponseAssignmentsInner) o;
    return Objects.equals(this.assignmentid, modAssignGetGrades200ResponseAssignmentsInner.assignmentid) &&
        Objects.equals(this.grades, modAssignGetGrades200ResponseAssignmentsInner.grades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentid, grades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetGrades200ResponseAssignmentsInner {\n");
    sb.append("    assignmentid: ").append(toIndentedString(assignmentid)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
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
    openapiFields.add("assignmentid");
    openapiFields.add("grades");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetGrades200ResponseAssignmentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetGrades200ResponseAssignmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetGrades200ResponseAssignmentsInner is not found in the empty JSON string", ModAssignGetGrades200ResponseAssignmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetGrades200ResponseAssignmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetGrades200ResponseAssignmentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("grades") != null && !jsonObj.get("grades").isJsonNull()) {
        JsonArray jsonArraygrades = jsonObj.getAsJsonArray("grades");
        if (jsonArraygrades != null) {
          // ensure the json data is an array
          if (!jsonObj.get("grades").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `grades` to be an array in the JSON string but got `%s`", jsonObj.get("grades").toString()));
          }

          // validate the optional field `grades` (array)
          for (int i = 0; i < jsonArraygrades.size(); i++) {
            ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.validateJsonElement(jsonArraygrades.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetGrades200ResponseAssignmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetGrades200ResponseAssignmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetGrades200ResponseAssignmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetGrades200ResponseAssignmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetGrades200ResponseAssignmentsInner>() {
           @Override
           public void write(JsonWriter out, ModAssignGetGrades200ResponseAssignmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetGrades200ResponseAssignmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetGrades200ResponseAssignmentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetGrades200ResponseAssignmentsInner
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetGrades200ResponseAssignmentsInner
  */
  public static ModAssignGetGrades200ResponseAssignmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetGrades200ResponseAssignmentsInner.class);
  }

 /**
  * Convert an instance of ModAssignGetGrades200ResponseAssignmentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


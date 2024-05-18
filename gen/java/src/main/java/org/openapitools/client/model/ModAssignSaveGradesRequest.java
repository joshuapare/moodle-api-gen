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
import org.openapitools.client.model.ModAssignSaveGradesRequestGradesInner;

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
 * ModAssignSaveGradesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignSaveGradesRequest {
  public static final String SERIALIZED_NAME_APPLYTOALL = "applytoall";
  @SerializedName(SERIALIZED_NAME_APPLYTOALL)
  private Boolean applytoall;

  public static final String SERIALIZED_NAME_ASSIGNMENTID = "assignmentid";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTID)
  private Integer assignmentid;

  public static final String SERIALIZED_NAME_GRADES = "grades";
  @SerializedName(SERIALIZED_NAME_GRADES)
  private List<ModAssignSaveGradesRequestGradesInner> grades = new ArrayList<>();

  public ModAssignSaveGradesRequest() {
  }

  public ModAssignSaveGradesRequest applytoall(Boolean applytoall) {
    this.applytoall = applytoall;
    return this;
  }

   /**
   * If true, this grade will be applied to all members of the group (for group assignments).
   * @return applytoall
  **/
  @javax.annotation.Nonnull
  public Boolean getApplytoall() {
    return applytoall;
  }

  public void setApplytoall(Boolean applytoall) {
    this.applytoall = applytoall;
  }


  public ModAssignSaveGradesRequest assignmentid(Integer assignmentid) {
    this.assignmentid = assignmentid;
    return this;
  }

   /**
   * The assignment id to operate on
   * @return assignmentid
  **/
  @javax.annotation.Nonnull
  public Integer getAssignmentid() {
    return assignmentid;
  }

  public void setAssignmentid(Integer assignmentid) {
    this.assignmentid = assignmentid;
  }


  public ModAssignSaveGradesRequest grades(List<ModAssignSaveGradesRequestGradesInner> grades) {
    this.grades = grades;
    return this;
  }

  public ModAssignSaveGradesRequest addGradesItem(ModAssignSaveGradesRequestGradesInner gradesItem) {
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
  @javax.annotation.Nonnull
  public List<ModAssignSaveGradesRequestGradesInner> getGrades() {
    return grades;
  }

  public void setGrades(List<ModAssignSaveGradesRequestGradesInner> grades) {
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
    ModAssignSaveGradesRequest modAssignSaveGradesRequest = (ModAssignSaveGradesRequest) o;
    return Objects.equals(this.applytoall, modAssignSaveGradesRequest.applytoall) &&
        Objects.equals(this.assignmentid, modAssignSaveGradesRequest.assignmentid) &&
        Objects.equals(this.grades, modAssignSaveGradesRequest.grades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applytoall, assignmentid, grades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignSaveGradesRequest {\n");
    sb.append("    applytoall: ").append(toIndentedString(applytoall)).append("\n");
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
    openapiFields.add("applytoall");
    openapiFields.add("assignmentid");
    openapiFields.add("grades");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applytoall");
    openapiRequiredFields.add("assignmentid");
    openapiRequiredFields.add("grades");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignSaveGradesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignSaveGradesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignSaveGradesRequest is not found in the empty JSON string", ModAssignSaveGradesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignSaveGradesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignSaveGradesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModAssignSaveGradesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("grades").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `grades` to be an array in the JSON string but got `%s`", jsonObj.get("grades").toString()));
      }

      JsonArray jsonArraygrades = jsonObj.getAsJsonArray("grades");
      // validate the required field `grades` (array)
      for (int i = 0; i < jsonArraygrades.size(); i++) {
        ModAssignSaveGradesRequestGradesInner.validateJsonElement(jsonArraygrades.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignSaveGradesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignSaveGradesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignSaveGradesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignSaveGradesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignSaveGradesRequest>() {
           @Override
           public void write(JsonWriter out, ModAssignSaveGradesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignSaveGradesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignSaveGradesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignSaveGradesRequest
  * @throws IOException if the JSON string is invalid with respect to ModAssignSaveGradesRequest
  */
  public static ModAssignSaveGradesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignSaveGradesRequest.class);
  }

 /**
  * Convert an instance of ModAssignSaveGradesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


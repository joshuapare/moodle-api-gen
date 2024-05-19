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
 * CoreCompetencyGradeCompetencyInPlanRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyGradeCompetencyInPlanRequest {
  public static final String SERIALIZED_NAME_COMPETENCYID = "competencyid";
  @SerializedName(SERIALIZED_NAME_COMPETENCYID)
  private Integer competencyid;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private Integer grade;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_PLANID = "planid";
  @SerializedName(SERIALIZED_NAME_PLANID)
  private Integer planid = null;

  public CoreCompetencyGradeCompetencyInPlanRequest() {
  }

  public CoreCompetencyGradeCompetencyInPlanRequest competencyid(Integer competencyid) {
    this.competencyid = competencyid;
    return this;
  }

   /**
   * Competency id
   * @return competencyid
  **/
  @javax.annotation.Nonnull
  public Integer getCompetencyid() {
    return competencyid;
  }

  public void setCompetencyid(Integer competencyid) {
    this.competencyid = competencyid;
  }


  public CoreCompetencyGradeCompetencyInPlanRequest grade(Integer grade) {
    this.grade = grade;
    return this;
  }

   /**
   * New grade
   * @return grade
  **/
  @javax.annotation.Nonnull
  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }


  public CoreCompetencyGradeCompetencyInPlanRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A note to attach to the evidence
   * @return note
  **/
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public CoreCompetencyGradeCompetencyInPlanRequest planid(Integer planid) {
    this.planid = planid;
    return this;
  }

   /**
   * Plan id
   * @return planid
  **/
  @javax.annotation.Nonnull
  public Integer getPlanid() {
    return planid;
  }

  public void setPlanid(Integer planid) {
    this.planid = planid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompetencyGradeCompetencyInPlanRequest coreCompetencyGradeCompetencyInPlanRequest = (CoreCompetencyGradeCompetencyInPlanRequest) o;
    return Objects.equals(this.competencyid, coreCompetencyGradeCompetencyInPlanRequest.competencyid) &&
        Objects.equals(this.grade, coreCompetencyGradeCompetencyInPlanRequest.grade) &&
        Objects.equals(this.note, coreCompetencyGradeCompetencyInPlanRequest.note) &&
        Objects.equals(this.planid, coreCompetencyGradeCompetencyInPlanRequest.planid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competencyid, grade, note, planid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyGradeCompetencyInPlanRequest {\n");
    sb.append("    competencyid: ").append(toIndentedString(competencyid)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    planid: ").append(toIndentedString(planid)).append("\n");
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
    openapiFields.add("competencyid");
    openapiFields.add("grade");
    openapiFields.add("note");
    openapiFields.add("planid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("competencyid");
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("planid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyGradeCompetencyInPlanRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyGradeCompetencyInPlanRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyGradeCompetencyInPlanRequest is not found in the empty JSON string", CoreCompetencyGradeCompetencyInPlanRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyGradeCompetencyInPlanRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyGradeCompetencyInPlanRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyGradeCompetencyInPlanRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyGradeCompetencyInPlanRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyGradeCompetencyInPlanRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyGradeCompetencyInPlanRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyGradeCompetencyInPlanRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyGradeCompetencyInPlanRequest>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyGradeCompetencyInPlanRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyGradeCompetencyInPlanRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyGradeCompetencyInPlanRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyGradeCompetencyInPlanRequest
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyGradeCompetencyInPlanRequest
  */
  public static CoreCompetencyGradeCompetencyInPlanRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyGradeCompetencyInPlanRequest.class);
  }

 /**
  * Convert an instance of CoreCompetencyGradeCompetencyInPlanRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


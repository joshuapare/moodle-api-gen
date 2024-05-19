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
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.ModLessonGetUserAttempt200ResponseUserstatsGradeinfo;

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
 * ModLessonGetUserAttempt200ResponseUserstats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLessonGetUserAttempt200ResponseUserstats {
  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Integer completed = null;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private BigDecimal grade = new BigDecimal("null");

  public static final String SERIALIZED_NAME_GRADEINFO = "gradeinfo";
  @SerializedName(SERIALIZED_NAME_GRADEINFO)
  private ModLessonGetUserAttempt200ResponseUserstatsGradeinfo gradeinfo;

  public static final String SERIALIZED_NAME_TIMETOTAKE = "timetotake";
  @SerializedName(SERIALIZED_NAME_TIMETOTAKE)
  private Integer timetotake = null;

  public ModLessonGetUserAttempt200ResponseUserstats() {
  }

  public ModLessonGetUserAttempt200ResponseUserstats completed(Integer completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Time completed.
   * @return completed
  **/
  @javax.annotation.Nonnull
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(Integer completed) {
    this.completed = completed;
  }


  public ModLessonGetUserAttempt200ResponseUserstats grade(BigDecimal grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Attempt final grade.
   * @return grade
  **/
  @javax.annotation.Nonnull
  public BigDecimal getGrade() {
    return grade;
  }

  public void setGrade(BigDecimal grade) {
    this.grade = grade;
  }


  public ModLessonGetUserAttempt200ResponseUserstats gradeinfo(ModLessonGetUserAttempt200ResponseUserstatsGradeinfo gradeinfo) {
    this.gradeinfo = gradeinfo;
    return this;
  }

   /**
   * Get gradeinfo
   * @return gradeinfo
  **/
  @javax.annotation.Nullable
  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo getGradeinfo() {
    return gradeinfo;
  }

  public void setGradeinfo(ModLessonGetUserAttempt200ResponseUserstatsGradeinfo gradeinfo) {
    this.gradeinfo = gradeinfo;
  }


  public ModLessonGetUserAttempt200ResponseUserstats timetotake(Integer timetotake) {
    this.timetotake = timetotake;
    return this;
  }

   /**
   * Time taken.
   * @return timetotake
  **/
  @javax.annotation.Nonnull
  public Integer getTimetotake() {
    return timetotake;
  }

  public void setTimetotake(Integer timetotake) {
    this.timetotake = timetotake;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLessonGetUserAttempt200ResponseUserstats modLessonGetUserAttempt200ResponseUserstats = (ModLessonGetUserAttempt200ResponseUserstats) o;
    return Objects.equals(this.completed, modLessonGetUserAttempt200ResponseUserstats.completed) &&
        Objects.equals(this.grade, modLessonGetUserAttempt200ResponseUserstats.grade) &&
        Objects.equals(this.gradeinfo, modLessonGetUserAttempt200ResponseUserstats.gradeinfo) &&
        Objects.equals(this.timetotake, modLessonGetUserAttempt200ResponseUserstats.timetotake);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed, grade, gradeinfo, timetotake);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLessonGetUserAttempt200ResponseUserstats {\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradeinfo: ").append(toIndentedString(gradeinfo)).append("\n");
    sb.append("    timetotake: ").append(toIndentedString(timetotake)).append("\n");
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
    openapiFields.add("completed");
    openapiFields.add("grade");
    openapiFields.add("gradeinfo");
    openapiFields.add("timetotake");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("completed");
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("timetotake");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLessonGetUserAttempt200ResponseUserstats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLessonGetUserAttempt200ResponseUserstats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLessonGetUserAttempt200ResponseUserstats is not found in the empty JSON string", ModLessonGetUserAttempt200ResponseUserstats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLessonGetUserAttempt200ResponseUserstats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLessonGetUserAttempt200ResponseUserstats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLessonGetUserAttempt200ResponseUserstats.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `gradeinfo`
      if (jsonObj.get("gradeinfo") != null && !jsonObj.get("gradeinfo").isJsonNull()) {
        ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.validateJsonElement(jsonObj.get("gradeinfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLessonGetUserAttempt200ResponseUserstats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLessonGetUserAttempt200ResponseUserstats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLessonGetUserAttempt200ResponseUserstats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLessonGetUserAttempt200ResponseUserstats.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLessonGetUserAttempt200ResponseUserstats>() {
           @Override
           public void write(JsonWriter out, ModLessonGetUserAttempt200ResponseUserstats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLessonGetUserAttempt200ResponseUserstats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLessonGetUserAttempt200ResponseUserstats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLessonGetUserAttempt200ResponseUserstats
  * @throws IOException if the JSON string is invalid with respect to ModLessonGetUserAttempt200ResponseUserstats
  */
  public static ModLessonGetUserAttempt200ResponseUserstats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLessonGetUserAttempt200ResponseUserstats.class);
  }

 /**
  * Convert an instance of ModLessonGetUserAttempt200ResponseUserstats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


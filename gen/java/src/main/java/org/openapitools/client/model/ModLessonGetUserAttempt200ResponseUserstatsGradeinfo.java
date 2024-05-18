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
 * ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLessonGetUserAttempt200ResponseUserstatsGradeinfo {
  public static final String SERIALIZED_NAME_ATTEMPTS = "attempts";
  @SerializedName(SERIALIZED_NAME_ATTEMPTS)
  private Integer attempts = null;

  public static final String SERIALIZED_NAME_EARNED = "earned";
  @SerializedName(SERIALIZED_NAME_EARNED)
  private BigDecimal earned = new BigDecimal("null");

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private BigDecimal grade = new BigDecimal("null");

  public static final String SERIALIZED_NAME_MANUALPOINTS = "manualpoints";
  @SerializedName(SERIALIZED_NAME_MANUALPOINTS)
  private BigDecimal manualpoints = new BigDecimal("null");

  public static final String SERIALIZED_NAME_NMANUAL = "nmanual";
  @SerializedName(SERIALIZED_NAME_NMANUAL)
  private Integer nmanual = null;

  public static final String SERIALIZED_NAME_NQUESTIONS = "nquestions";
  @SerializedName(SERIALIZED_NAME_NQUESTIONS)
  private Integer nquestions = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total = new BigDecimal("null");

  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo() {
  }

  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo attempts(Integer attempts) {
    this.attempts = attempts;
    return this;
  }

   /**
   * Number of question attempts
   * @return attempts
  **/
  @javax.annotation.Nonnull
  public Integer getAttempts() {
    return attempts;
  }

  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }


  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo earned(BigDecimal earned) {
    this.earned = earned;
    return this;
  }

   /**
   * Points earned by student
   * @return earned
  **/
  @javax.annotation.Nonnull
  public BigDecimal getEarned() {
    return earned;
  }

  public void setEarned(BigDecimal earned) {
    this.earned = earned;
  }


  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo grade(BigDecimal grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Calculated percentage grade
   * @return grade
  **/
  @javax.annotation.Nonnull
  public BigDecimal getGrade() {
    return grade;
  }

  public void setGrade(BigDecimal grade) {
    this.grade = grade;
  }


  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo manualpoints(BigDecimal manualpoints) {
    this.manualpoints = manualpoints;
    return this;
  }

   /**
   * Point value for manually graded questions
   * @return manualpoints
  **/
  @javax.annotation.Nonnull
  public BigDecimal getManualpoints() {
    return manualpoints;
  }

  public void setManualpoints(BigDecimal manualpoints) {
    this.manualpoints = manualpoints;
  }


  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo nmanual(Integer nmanual) {
    this.nmanual = nmanual;
    return this;
  }

   /**
   * Number of manually graded questions
   * @return nmanual
  **/
  @javax.annotation.Nonnull
  public Integer getNmanual() {
    return nmanual;
  }

  public void setNmanual(Integer nmanual) {
    this.nmanual = nmanual;
  }


  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo nquestions(Integer nquestions) {
    this.nquestions = nquestions;
    return this;
  }

   /**
   * Number of questions answered
   * @return nquestions
  **/
  @javax.annotation.Nonnull
  public Integer getNquestions() {
    return nquestions;
  }

  public void setNquestions(Integer nquestions) {
    this.nquestions = nquestions;
  }


  public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Max points possible
   * @return total
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLessonGetUserAttempt200ResponseUserstatsGradeinfo modLessonGetUserAttempt200ResponseUserstatsGradeinfo = (ModLessonGetUserAttempt200ResponseUserstatsGradeinfo) o;
    return Objects.equals(this.attempts, modLessonGetUserAttempt200ResponseUserstatsGradeinfo.attempts) &&
        Objects.equals(this.earned, modLessonGetUserAttempt200ResponseUserstatsGradeinfo.earned) &&
        Objects.equals(this.grade, modLessonGetUserAttempt200ResponseUserstatsGradeinfo.grade) &&
        Objects.equals(this.manualpoints, modLessonGetUserAttempt200ResponseUserstatsGradeinfo.manualpoints) &&
        Objects.equals(this.nmanual, modLessonGetUserAttempt200ResponseUserstatsGradeinfo.nmanual) &&
        Objects.equals(this.nquestions, modLessonGetUserAttempt200ResponseUserstatsGradeinfo.nquestions) &&
        Objects.equals(this.total, modLessonGetUserAttempt200ResponseUserstatsGradeinfo.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempts, earned, grade, manualpoints, nmanual, nquestions, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLessonGetUserAttempt200ResponseUserstatsGradeinfo {\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    earned: ").append(toIndentedString(earned)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    manualpoints: ").append(toIndentedString(manualpoints)).append("\n");
    sb.append("    nmanual: ").append(toIndentedString(nmanual)).append("\n");
    sb.append("    nquestions: ").append(toIndentedString(nquestions)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("attempts");
    openapiFields.add("earned");
    openapiFields.add("grade");
    openapiFields.add("manualpoints");
    openapiFields.add("nmanual");
    openapiFields.add("nquestions");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attempts");
    openapiRequiredFields.add("earned");
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("manualpoints");
    openapiRequiredFields.add("nmanual");
    openapiRequiredFields.add("nquestions");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLessonGetUserAttempt200ResponseUserstatsGradeinfo is not found in the empty JSON string", ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLessonGetUserAttempt200ResponseUserstatsGradeinfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLessonGetUserAttempt200ResponseUserstatsGradeinfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLessonGetUserAttempt200ResponseUserstatsGradeinfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLessonGetUserAttempt200ResponseUserstatsGradeinfo>() {
           @Override
           public void write(JsonWriter out, ModLessonGetUserAttempt200ResponseUserstatsGradeinfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLessonGetUserAttempt200ResponseUserstatsGradeinfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLessonGetUserAttempt200ResponseUserstatsGradeinfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
  * @throws IOException if the JSON string is invalid with respect to ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
  */
  public static ModLessonGetUserAttempt200ResponseUserstatsGradeinfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.class);
  }

 /**
  * Convert an instance of ModLessonGetUserAttempt200ResponseUserstatsGradeinfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


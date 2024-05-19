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
 * CoreGradesGraderGradingpanelPointFetch200ResponseGrade
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradesGraderGradingpanelPointFetch200ResponseGrade {
  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private BigDecimal grade = new BigDecimal("null");

  public static final String SERIALIZED_NAME_GRADEDBY = "gradedby";
  @SerializedName(SERIALIZED_NAME_GRADEDBY)
  private String gradedby = "null";

  public static final String SERIALIZED_NAME_MAXGRADE = "maxgrade";
  @SerializedName(SERIALIZED_NAME_MAXGRADE)
  private String maxgrade = "null";

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public static final String SERIALIZED_NAME_USERGRADE = "usergrade";
  @SerializedName(SERIALIZED_NAME_USERGRADE)
  private String usergrade = "null";

  public CoreGradesGraderGradingpanelPointFetch200ResponseGrade() {
  }

  public CoreGradesGraderGradingpanelPointFetch200ResponseGrade grade(BigDecimal grade) {
    this.grade = grade;
    return this;
  }

   /**
   * The numeric grade
   * @return grade
  **/
  @javax.annotation.Nonnull
  public BigDecimal getGrade() {
    return grade;
  }

  public void setGrade(BigDecimal grade) {
    this.grade = grade;
  }


  public CoreGradesGraderGradingpanelPointFetch200ResponseGrade gradedby(String gradedby) {
    this.gradedby = gradedby;
    return this;
  }

   /**
   * The assumed grader of this grading instance
   * @return gradedby
  **/
  @javax.annotation.Nonnull
  public String getGradedby() {
    return gradedby;
  }

  public void setGradedby(String gradedby) {
    this.gradedby = gradedby;
  }


  public CoreGradesGraderGradingpanelPointFetch200ResponseGrade maxgrade(String maxgrade) {
    this.maxgrade = maxgrade;
    return this;
  }

   /**
   * Max possible grade
   * @return maxgrade
  **/
  @javax.annotation.Nonnull
  public String getMaxgrade() {
    return maxgrade;
  }

  public void setMaxgrade(String maxgrade) {
    this.maxgrade = maxgrade;
  }


  public CoreGradesGraderGradingpanelPointFetch200ResponseGrade timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * The time that the grade was created
   * @return timecreated
  **/
  @javax.annotation.Nonnull
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public CoreGradesGraderGradingpanelPointFetch200ResponseGrade timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * The time that the grade was last updated
   * @return timemodified
  **/
  @javax.annotation.Nonnull
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public CoreGradesGraderGradingpanelPointFetch200ResponseGrade usergrade(String usergrade) {
    this.usergrade = usergrade;
    return this;
  }

   /**
   * Current user grade
   * @return usergrade
  **/
  @javax.annotation.Nonnull
  public String getUsergrade() {
    return usergrade;
  }

  public void setUsergrade(String usergrade) {
    this.usergrade = usergrade;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradesGraderGradingpanelPointFetch200ResponseGrade coreGradesGraderGradingpanelPointFetch200ResponseGrade = (CoreGradesGraderGradingpanelPointFetch200ResponseGrade) o;
    return Objects.equals(this.grade, coreGradesGraderGradingpanelPointFetch200ResponseGrade.grade) &&
        Objects.equals(this.gradedby, coreGradesGraderGradingpanelPointFetch200ResponseGrade.gradedby) &&
        Objects.equals(this.maxgrade, coreGradesGraderGradingpanelPointFetch200ResponseGrade.maxgrade) &&
        Objects.equals(this.timecreated, coreGradesGraderGradingpanelPointFetch200ResponseGrade.timecreated) &&
        Objects.equals(this.timemodified, coreGradesGraderGradingpanelPointFetch200ResponseGrade.timemodified) &&
        Objects.equals(this.usergrade, coreGradesGraderGradingpanelPointFetch200ResponseGrade.usergrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, gradedby, maxgrade, timecreated, timemodified, usergrade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradesGraderGradingpanelPointFetch200ResponseGrade {\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradedby: ").append(toIndentedString(gradedby)).append("\n");
    sb.append("    maxgrade: ").append(toIndentedString(maxgrade)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    usergrade: ").append(toIndentedString(usergrade)).append("\n");
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
    openapiFields.add("grade");
    openapiFields.add("gradedby");
    openapiFields.add("maxgrade");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("usergrade");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("gradedby");
    openapiRequiredFields.add("maxgrade");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("usergrade");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradesGraderGradingpanelPointFetch200ResponseGrade
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradesGraderGradingpanelPointFetch200ResponseGrade.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradesGraderGradingpanelPointFetch200ResponseGrade is not found in the empty JSON string", CoreGradesGraderGradingpanelPointFetch200ResponseGrade.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradesGraderGradingpanelPointFetch200ResponseGrade.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradesGraderGradingpanelPointFetch200ResponseGrade` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGradesGraderGradingpanelPointFetch200ResponseGrade.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("gradedby").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gradedby` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gradedby").toString()));
      }
      if (!jsonObj.get("maxgrade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxgrade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxgrade").toString()));
      }
      if (!jsonObj.get("usergrade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usergrade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usergrade").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradesGraderGradingpanelPointFetch200ResponseGrade.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradesGraderGradingpanelPointFetch200ResponseGrade' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradesGraderGradingpanelPointFetch200ResponseGrade> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradesGraderGradingpanelPointFetch200ResponseGrade.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradesGraderGradingpanelPointFetch200ResponseGrade>() {
           @Override
           public void write(JsonWriter out, CoreGradesGraderGradingpanelPointFetch200ResponseGrade value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradesGraderGradingpanelPointFetch200ResponseGrade read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradesGraderGradingpanelPointFetch200ResponseGrade given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradesGraderGradingpanelPointFetch200ResponseGrade
  * @throws IOException if the JSON string is invalid with respect to CoreGradesGraderGradingpanelPointFetch200ResponseGrade
  */
  public static CoreGradesGraderGradingpanelPointFetch200ResponseGrade fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradesGraderGradingpanelPointFetch200ResponseGrade.class);
  }

 /**
  * Convert an instance of CoreGradesGraderGradingpanelPointFetch200ResponseGrade to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


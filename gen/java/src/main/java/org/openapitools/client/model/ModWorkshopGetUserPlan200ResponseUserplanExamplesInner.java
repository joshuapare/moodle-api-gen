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
 * ModWorkshopGetUserPlan200ResponseUserplanExamplesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWorkshopGetUserPlan200ResponseUserplanExamplesInner {
  public static final String SERIALIZED_NAME_ASSESSMENTID = "assessmentid";
  @SerializedName(SERIALIZED_NAME_ASSESSMENTID)
  private Integer assessmentid = null;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private BigDecimal grade = new BigDecimal("null");

  public static final String SERIALIZED_NAME_GRADINGGRADE = "gradinggrade";
  @SerializedName(SERIALIZED_NAME_GRADINGGRADE)
  private BigDecimal gradinggrade = new BigDecimal("null");

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = "null";

  public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner() {
  }

  public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner assessmentid(Integer assessmentid) {
    this.assessmentid = assessmentid;
    return this;
  }

   /**
   * Example submission assessment id.
   * @return assessmentid
  **/
  @javax.annotation.Nullable
  public Integer getAssessmentid() {
    return assessmentid;
  }

  public void setAssessmentid(Integer assessmentid) {
    this.assessmentid = assessmentid;
  }


  public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner grade(BigDecimal grade) {
    this.grade = grade;
    return this;
  }

   /**
   * The submission grade.
   * @return grade
  **/
  @javax.annotation.Nullable
  public BigDecimal getGrade() {
    return grade;
  }

  public void setGrade(BigDecimal grade) {
    this.grade = grade;
  }


  public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner gradinggrade(BigDecimal gradinggrade) {
    this.gradinggrade = gradinggrade;
    return this;
  }

   /**
   * The assessment grade.
   * @return gradinggrade
  **/
  @javax.annotation.Nullable
  public BigDecimal getGradinggrade() {
    return gradinggrade;
  }

  public void setGradinggrade(BigDecimal gradinggrade) {
    this.gradinggrade = gradinggrade;
  }


  public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Example submission id.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Example submission title.
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
    ModWorkshopGetUserPlan200ResponseUserplanExamplesInner modWorkshopGetUserPlan200ResponseUserplanExamplesInner = (ModWorkshopGetUserPlan200ResponseUserplanExamplesInner) o;
    return Objects.equals(this.assessmentid, modWorkshopGetUserPlan200ResponseUserplanExamplesInner.assessmentid) &&
        Objects.equals(this.grade, modWorkshopGetUserPlan200ResponseUserplanExamplesInner.grade) &&
        Objects.equals(this.gradinggrade, modWorkshopGetUserPlan200ResponseUserplanExamplesInner.gradinggrade) &&
        Objects.equals(this.id, modWorkshopGetUserPlan200ResponseUserplanExamplesInner.id) &&
        Objects.equals(this.title, modWorkshopGetUserPlan200ResponseUserplanExamplesInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentid, grade, gradinggrade, id, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWorkshopGetUserPlan200ResponseUserplanExamplesInner {\n");
    sb.append("    assessmentid: ").append(toIndentedString(assessmentid)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradinggrade: ").append(toIndentedString(gradinggrade)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("assessmentid");
    openapiFields.add("grade");
    openapiFields.add("gradinggrade");
    openapiFields.add("id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWorkshopGetUserPlan200ResponseUserplanExamplesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWorkshopGetUserPlan200ResponseUserplanExamplesInner is not found in the empty JSON string", ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWorkshopGetUserPlan200ResponseUserplanExamplesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWorkshopGetUserPlan200ResponseUserplanExamplesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWorkshopGetUserPlan200ResponseUserplanExamplesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWorkshopGetUserPlan200ResponseUserplanExamplesInner>() {
           @Override
           public void write(JsonWriter out, ModWorkshopGetUserPlan200ResponseUserplanExamplesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWorkshopGetUserPlan200ResponseUserplanExamplesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWorkshopGetUserPlan200ResponseUserplanExamplesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWorkshopGetUserPlan200ResponseUserplanExamplesInner
  * @throws IOException if the JSON string is invalid with respect to ModWorkshopGetUserPlan200ResponseUserplanExamplesInner
  */
  public static ModWorkshopGetUserPlan200ResponseUserplanExamplesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.class);
  }

 /**
  * Convert an instance of ModWorkshopGetUserPlan200ResponseUserplanExamplesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan {
  public static final String SERIALIZED_NAME_COMPETENCYID = "competencyid";
  @SerializedName(SERIALIZED_NAME_COMPETENCYID)
  private Integer competencyid;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private Integer grade;

  public static final String SERIALIZED_NAME_GRADENAME = "gradename";
  @SerializedName(SERIALIZED_NAME_GRADENAME)
  private String gradename;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_PLANID = "planid";
  @SerializedName(SERIALIZED_NAME_PLANID)
  private Integer planid = null;

  public static final String SERIALIZED_NAME_PROFICIENCY = "proficiency";
  @SerializedName(SERIALIZED_NAME_PROFICIENCY)
  private Boolean proficiency;

  public static final String SERIALIZED_NAME_PROFICIENCYNAME = "proficiencyname";
  @SerializedName(SERIALIZED_NAME_PROFICIENCYNAME)
  private String proficiencyname;

  public static final String SERIALIZED_NAME_SORTORDER = "sortorder";
  @SerializedName(SERIALIZED_NAME_SORTORDER)
  private Integer sortorder = 0;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified = 0;

  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan() {
  }

  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan competencyid(Integer competencyid) {
    this.competencyid = competencyid;
    return this;
  }

   /**
   * competencyid
   * @return competencyid
  **/
  @javax.annotation.Nonnull
  public Integer getCompetencyid() {
    return competencyid;
  }

  public void setCompetencyid(Integer competencyid) {
    this.competencyid = competencyid;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan grade(Integer grade) {
    this.grade = grade;
    return this;
  }

   /**
   * grade
   * @return grade
  **/
  @javax.annotation.Nonnull
  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan gradename(String gradename) {
    this.gradename = gradename;
    return this;
  }

   /**
   * gradename
   * @return gradename
  **/
  @javax.annotation.Nonnull
  public String getGradename() {
    return gradename;
  }

  public void setGradename(String gradename) {
    this.gradename = gradename;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan planid(Integer planid) {
    this.planid = planid;
    return this;
  }

   /**
   * planid
   * @return planid
  **/
  @javax.annotation.Nonnull
  public Integer getPlanid() {
    return planid;
  }

  public void setPlanid(Integer planid) {
    this.planid = planid;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan proficiency(Boolean proficiency) {
    this.proficiency = proficiency;
    return this;
  }

   /**
   * proficiency
   * @return proficiency
  **/
  @javax.annotation.Nonnull
  public Boolean getProficiency() {
    return proficiency;
  }

  public void setProficiency(Boolean proficiency) {
    this.proficiency = proficiency;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan proficiencyname(String proficiencyname) {
    this.proficiencyname = proficiencyname;
    return this;
  }

   /**
   * proficiencyname
   * @return proficiencyname
  **/
  @javax.annotation.Nonnull
  public String getProficiencyname() {
    return proficiencyname;
  }

  public void setProficiencyname(String proficiencyname) {
    this.proficiencyname = proficiencyname;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan sortorder(Integer sortorder) {
    this.sortorder = sortorder;
    return this;
  }

   /**
   * sortorder
   * @return sortorder
  **/
  @javax.annotation.Nonnull
  public Integer getSortorder() {
    return sortorder;
  }

  public void setSortorder(Integer sortorder) {
    this.sortorder = sortorder;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * timecreated
   * @return timecreated
  **/
  @javax.annotation.Nonnull
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * timemodified
   * @return timemodified
  **/
  @javax.annotation.Nonnull
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * userid
   * @return userid
  **/
  @javax.annotation.Nonnull
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan usermodified(Integer usermodified) {
    this.usermodified = usermodified;
    return this;
  }

   /**
   * usermodified
   * @return usermodified
  **/
  @javax.annotation.Nonnull
  public Integer getUsermodified() {
    return usermodified;
  }

  public void setUsermodified(Integer usermodified) {
    this.usermodified = usermodified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan = (ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan) o;
    return Objects.equals(this.competencyid, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.competencyid) &&
        Objects.equals(this.grade, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.grade) &&
        Objects.equals(this.gradename, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.gradename) &&
        Objects.equals(this.id, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.id) &&
        Objects.equals(this.planid, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.planid) &&
        Objects.equals(this.proficiency, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.proficiency) &&
        Objects.equals(this.proficiencyname, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.proficiencyname) &&
        Objects.equals(this.sortorder, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.sortorder) &&
        Objects.equals(this.timecreated, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.timecreated) &&
        Objects.equals(this.timemodified, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.timemodified) &&
        Objects.equals(this.userid, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.userid) &&
        Objects.equals(this.usermodified, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.usermodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competencyid, grade, gradename, id, planid, proficiency, proficiencyname, sortorder, timecreated, timemodified, userid, usermodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan {\n");
    sb.append("    competencyid: ").append(toIndentedString(competencyid)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradename: ").append(toIndentedString(gradename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planid: ").append(toIndentedString(planid)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
    sb.append("    proficiencyname: ").append(toIndentedString(proficiencyname)).append("\n");
    sb.append("    sortorder: ").append(toIndentedString(sortorder)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    usermodified: ").append(toIndentedString(usermodified)).append("\n");
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
    openapiFields.add("gradename");
    openapiFields.add("id");
    openapiFields.add("planid");
    openapiFields.add("proficiency");
    openapiFields.add("proficiencyname");
    openapiFields.add("sortorder");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("userid");
    openapiFields.add("usermodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("competencyid");
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("gradename");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("planid");
    openapiRequiredFields.add("proficiency");
    openapiRequiredFields.add("proficiencyname");
    openapiRequiredFields.add("sortorder");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("userid");
    openapiRequiredFields.add("usermodified");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan is not found in the empty JSON string", ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("gradename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gradename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gradename").toString()));
      }
      if (!jsonObj.get("proficiencyname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proficiencyname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proficiencyname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan
  */
  public static ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.class);
  }

 /**
  * Convert an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


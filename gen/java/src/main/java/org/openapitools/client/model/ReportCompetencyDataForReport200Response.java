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
import org.openapitools.client.model.CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse;
import org.openapitools.client.model.CoreCompetencyGradeCompetency200ResponseActionuser;
import org.openapitools.client.model.ReportCompetencyDataForReport200ResponseUsercompetenciesInner;

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
 * ReportCompetencyDataForReport200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ReportCompetencyDataForReport200Response {
  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse course;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_PUSHRATINGSTOUSERPLANS = "pushratingstouserplans";
  @SerializedName(SERIALIZED_NAME_PUSHRATINGSTOUSERPLANS)
  private Boolean pushratingstouserplans = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private CoreCompetencyGradeCompetency200ResponseActionuser user;

  public static final String SERIALIZED_NAME_USERCOMPETENCIES = "usercompetencies";
  @SerializedName(SERIALIZED_NAME_USERCOMPETENCIES)
  private List<ReportCompetencyDataForReport200ResponseUsercompetenciesInner> usercompetencies = new ArrayList<>();

  public ReportCompetencyDataForReport200Response() {
  }

  public ReportCompetencyDataForReport200Response course(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse course) {
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @javax.annotation.Nonnull
  public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse getCourse() {
    return course;
  }

  public void setCourse(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse course) {
    this.course = course;
  }


  public ReportCompetencyDataForReport200Response courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Course id
   * @return courseid
  **/
  @javax.annotation.Nonnull
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public ReportCompetencyDataForReport200Response pushratingstouserplans(Boolean pushratingstouserplans) {
    this.pushratingstouserplans = pushratingstouserplans;
    return this;
  }

   /**
   * True if rating is push to user plans
   * @return pushratingstouserplans
  **/
  @javax.annotation.Nonnull
  public Boolean getPushratingstouserplans() {
    return pushratingstouserplans;
  }

  public void setPushratingstouserplans(Boolean pushratingstouserplans) {
    this.pushratingstouserplans = pushratingstouserplans;
  }


  public ReportCompetencyDataForReport200Response user(CoreCompetencyGradeCompetency200ResponseActionuser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  public CoreCompetencyGradeCompetency200ResponseActionuser getUser() {
    return user;
  }

  public void setUser(CoreCompetencyGradeCompetency200ResponseActionuser user) {
    this.user = user;
  }


  public ReportCompetencyDataForReport200Response usercompetencies(List<ReportCompetencyDataForReport200ResponseUsercompetenciesInner> usercompetencies) {
    this.usercompetencies = usercompetencies;
    return this;
  }

  public ReportCompetencyDataForReport200Response addUsercompetenciesItem(ReportCompetencyDataForReport200ResponseUsercompetenciesInner usercompetenciesItem) {
    if (this.usercompetencies == null) {
      this.usercompetencies = new ArrayList<>();
    }
    this.usercompetencies.add(usercompetenciesItem);
    return this;
  }

   /**
   * Get usercompetencies
   * @return usercompetencies
  **/
  @javax.annotation.Nonnull
  public List<ReportCompetencyDataForReport200ResponseUsercompetenciesInner> getUsercompetencies() {
    return usercompetencies;
  }

  public void setUsercompetencies(List<ReportCompetencyDataForReport200ResponseUsercompetenciesInner> usercompetencies) {
    this.usercompetencies = usercompetencies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCompetencyDataForReport200Response reportCompetencyDataForReport200Response = (ReportCompetencyDataForReport200Response) o;
    return Objects.equals(this.course, reportCompetencyDataForReport200Response.course) &&
        Objects.equals(this.courseid, reportCompetencyDataForReport200Response.courseid) &&
        Objects.equals(this.pushratingstouserplans, reportCompetencyDataForReport200Response.pushratingstouserplans) &&
        Objects.equals(this.user, reportCompetencyDataForReport200Response.user) &&
        Objects.equals(this.usercompetencies, reportCompetencyDataForReport200Response.usercompetencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, courseid, pushratingstouserplans, user, usercompetencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCompetencyDataForReport200Response {\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    pushratingstouserplans: ").append(toIndentedString(pushratingstouserplans)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    usercompetencies: ").append(toIndentedString(usercompetencies)).append("\n");
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
    openapiFields.add("course");
    openapiFields.add("courseid");
    openapiFields.add("pushratingstouserplans");
    openapiFields.add("user");
    openapiFields.add("usercompetencies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("course");
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("pushratingstouserplans");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("usercompetencies");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReportCompetencyDataForReport200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportCompetencyDataForReport200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportCompetencyDataForReport200Response is not found in the empty JSON string", ReportCompetencyDataForReport200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportCompetencyDataForReport200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportCompetencyDataForReport200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportCompetencyDataForReport200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `course`
      CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.validateJsonElement(jsonObj.get("course"));
      // validate the required field `user`
      CoreCompetencyGradeCompetency200ResponseActionuser.validateJsonElement(jsonObj.get("user"));
      // ensure the json data is an array
      if (!jsonObj.get("usercompetencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usercompetencies` to be an array in the JSON string but got `%s`", jsonObj.get("usercompetencies").toString()));
      }

      JsonArray jsonArrayusercompetencies = jsonObj.getAsJsonArray("usercompetencies");
      // validate the required field `usercompetencies` (array)
      for (int i = 0; i < jsonArrayusercompetencies.size(); i++) {
        ReportCompetencyDataForReport200ResponseUsercompetenciesInner.validateJsonElement(jsonArrayusercompetencies.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCompetencyDataForReport200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCompetencyDataForReport200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCompetencyDataForReport200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCompetencyDataForReport200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCompetencyDataForReport200Response>() {
           @Override
           public void write(JsonWriter out, ReportCompetencyDataForReport200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCompetencyDataForReport200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCompetencyDataForReport200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCompetencyDataForReport200Response
  * @throws IOException if the JSON string is invalid with respect to ReportCompetencyDataForReport200Response
  */
  public static ReportCompetencyDataForReport200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCompetencyDataForReport200Response.class);
  }

 /**
  * Convert an instance of ReportCompetencyDataForReport200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

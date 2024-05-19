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
 * CoreCompetencyUpdatePlanRequestPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyUpdatePlanRequestPlan {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = 1;

  public static final String SERIALIZED_NAME_DUEDATE = "duedate";
  @SerializedName(SERIALIZED_NAME_DUEDATE)
  private Integer duedate = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORIGTEMPLATEID = "origtemplateid";
  @SerializedName(SERIALIZED_NAME_ORIGTEMPLATEID)
  private Integer origtemplateid;

  public static final String SERIALIZED_NAME_REVIEWERID = "reviewerid";
  @SerializedName(SERIALIZED_NAME_REVIEWERID)
  private Integer reviewerid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public static final String SERIALIZED_NAME_TEMPLATEID = "templateid";
  @SerializedName(SERIALIZED_NAME_TEMPLATEID)
  private Integer templateid;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified;

  public CoreCompetencyUpdatePlanRequestPlan() {
  }

  public CoreCompetencyUpdatePlanRequestPlan description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CoreCompetencyUpdatePlanRequestPlan descriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
    return this;
  }

   /**
   * description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return descriptionformat
  **/
  @javax.annotation.Nullable
  public Integer getDescriptionformat() {
    return descriptionformat;
  }

  public void setDescriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
  }


  public CoreCompetencyUpdatePlanRequestPlan duedate(Integer duedate) {
    this.duedate = duedate;
    return this;
  }

   /**
   * duedate
   * @return duedate
  **/
  @javax.annotation.Nullable
  public Integer getDuedate() {
    return duedate;
  }

  public void setDuedate(Integer duedate) {
    this.duedate = duedate;
  }


  public CoreCompetencyUpdatePlanRequestPlan id(Integer id) {
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


  public CoreCompetencyUpdatePlanRequestPlan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreCompetencyUpdatePlanRequestPlan origtemplateid(Integer origtemplateid) {
    this.origtemplateid = origtemplateid;
    return this;
  }

   /**
   * origtemplateid
   * @return origtemplateid
  **/
  @javax.annotation.Nullable
  public Integer getOrigtemplateid() {
    return origtemplateid;
  }

  public void setOrigtemplateid(Integer origtemplateid) {
    this.origtemplateid = origtemplateid;
  }


  public CoreCompetencyUpdatePlanRequestPlan reviewerid(Integer reviewerid) {
    this.reviewerid = reviewerid;
    return this;
  }

   /**
   * reviewerid
   * @return reviewerid
  **/
  @javax.annotation.Nullable
  public Integer getReviewerid() {
    return reviewerid;
  }

  public void setReviewerid(Integer reviewerid) {
    this.reviewerid = reviewerid;
  }


  public CoreCompetencyUpdatePlanRequestPlan status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public CoreCompetencyUpdatePlanRequestPlan templateid(Integer templateid) {
    this.templateid = templateid;
    return this;
  }

   /**
   * templateid
   * @return templateid
  **/
  @javax.annotation.Nullable
  public Integer getTemplateid() {
    return templateid;
  }

  public void setTemplateid(Integer templateid) {
    this.templateid = templateid;
  }


  public CoreCompetencyUpdatePlanRequestPlan timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * timecreated
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public CoreCompetencyUpdatePlanRequestPlan timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * timemodified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public CoreCompetencyUpdatePlanRequestPlan userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * userid
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public CoreCompetencyUpdatePlanRequestPlan usermodified(Integer usermodified) {
    this.usermodified = usermodified;
    return this;
  }

   /**
   * usermodified
   * @return usermodified
  **/
  @javax.annotation.Nullable
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
    CoreCompetencyUpdatePlanRequestPlan coreCompetencyUpdatePlanRequestPlan = (CoreCompetencyUpdatePlanRequestPlan) o;
    return Objects.equals(this.description, coreCompetencyUpdatePlanRequestPlan.description) &&
        Objects.equals(this.descriptionformat, coreCompetencyUpdatePlanRequestPlan.descriptionformat) &&
        Objects.equals(this.duedate, coreCompetencyUpdatePlanRequestPlan.duedate) &&
        Objects.equals(this.id, coreCompetencyUpdatePlanRequestPlan.id) &&
        Objects.equals(this.name, coreCompetencyUpdatePlanRequestPlan.name) &&
        Objects.equals(this.origtemplateid, coreCompetencyUpdatePlanRequestPlan.origtemplateid) &&
        Objects.equals(this.reviewerid, coreCompetencyUpdatePlanRequestPlan.reviewerid) &&
        Objects.equals(this.status, coreCompetencyUpdatePlanRequestPlan.status) &&
        Objects.equals(this.templateid, coreCompetencyUpdatePlanRequestPlan.templateid) &&
        Objects.equals(this.timecreated, coreCompetencyUpdatePlanRequestPlan.timecreated) &&
        Objects.equals(this.timemodified, coreCompetencyUpdatePlanRequestPlan.timemodified) &&
        Objects.equals(this.userid, coreCompetencyUpdatePlanRequestPlan.userid) &&
        Objects.equals(this.usermodified, coreCompetencyUpdatePlanRequestPlan.usermodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionformat, duedate, id, name, origtemplateid, reviewerid, status, templateid, timecreated, timemodified, userid, usermodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyUpdatePlanRequestPlan {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origtemplateid: ").append(toIndentedString(origtemplateid)).append("\n");
    sb.append("    reviewerid: ").append(toIndentedString(reviewerid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateid: ").append(toIndentedString(templateid)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("duedate");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("origtemplateid");
    openapiFields.add("reviewerid");
    openapiFields.add("status");
    openapiFields.add("templateid");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("userid");
    openapiFields.add("usermodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyUpdatePlanRequestPlan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyUpdatePlanRequestPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyUpdatePlanRequestPlan is not found in the empty JSON string", CoreCompetencyUpdatePlanRequestPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyUpdatePlanRequestPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyUpdatePlanRequestPlan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyUpdatePlanRequestPlan.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyUpdatePlanRequestPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyUpdatePlanRequestPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyUpdatePlanRequestPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyUpdatePlanRequestPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyUpdatePlanRequestPlan>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyUpdatePlanRequestPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyUpdatePlanRequestPlan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyUpdatePlanRequestPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyUpdatePlanRequestPlan
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyUpdatePlanRequestPlan
  */
  public static CoreCompetencyUpdatePlanRequestPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyUpdatePlanRequestPlan.class);
  }

 /**
  * Convert an instance of CoreCompetencyUpdatePlanRequestPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


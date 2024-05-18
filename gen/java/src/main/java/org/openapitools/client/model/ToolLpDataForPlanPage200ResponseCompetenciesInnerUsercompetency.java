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
import org.openapitools.client.model.CoreCompetencyGradeCompetency200ResponseActionuser;

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
 * ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency {
  public static final String SERIALIZED_NAME_CANREQUESTREVIEW = "canrequestreview";
  @SerializedName(SERIALIZED_NAME_CANREQUESTREVIEW)
  private Boolean canrequestreview;

  public static final String SERIALIZED_NAME_CANREVIEW = "canreview";
  @SerializedName(SERIALIZED_NAME_CANREVIEW)
  private Boolean canreview;

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

  public static final String SERIALIZED_NAME_ISCANCELREVIEWREQUESTALLOWED = "iscancelreviewrequestallowed";
  @SerializedName(SERIALIZED_NAME_ISCANCELREVIEWREQUESTALLOWED)
  private Boolean iscancelreviewrequestallowed;

  public static final String SERIALIZED_NAME_ISREQUESTREVIEWALLOWED = "isrequestreviewallowed";
  @SerializedName(SERIALIZED_NAME_ISREQUESTREVIEWALLOWED)
  private Boolean isrequestreviewallowed;

  public static final String SERIALIZED_NAME_ISSTARTREVIEWALLOWED = "isstartreviewallowed";
  @SerializedName(SERIALIZED_NAME_ISSTARTREVIEWALLOWED)
  private Boolean isstartreviewallowed;

  public static final String SERIALIZED_NAME_ISSTATUSIDLE = "isstatusidle";
  @SerializedName(SERIALIZED_NAME_ISSTATUSIDLE)
  private Boolean isstatusidle = null;

  public static final String SERIALIZED_NAME_ISSTATUSINREVIEW = "isstatusinreview";
  @SerializedName(SERIALIZED_NAME_ISSTATUSINREVIEW)
  private Boolean isstatusinreview = null;

  public static final String SERIALIZED_NAME_ISSTATUSWAITINGFORREVIEW = "isstatuswaitingforreview";
  @SerializedName(SERIALIZED_NAME_ISSTATUSWAITINGFORREVIEW)
  private Boolean isstatuswaitingforreview = null;

  public static final String SERIALIZED_NAME_ISSTOPREVIEWALLOWED = "isstopreviewallowed";
  @SerializedName(SERIALIZED_NAME_ISSTOPREVIEWALLOWED)
  private Boolean isstopreviewallowed;

  public static final String SERIALIZED_NAME_PROFICIENCY = "proficiency";
  @SerializedName(SERIALIZED_NAME_PROFICIENCY)
  private Boolean proficiency;

  public static final String SERIALIZED_NAME_PROFICIENCYNAME = "proficiencyname";
  @SerializedName(SERIALIZED_NAME_PROFICIENCYNAME)
  private String proficiencyname;

  public static final String SERIALIZED_NAME_REVIEWER = "reviewer";
  @SerializedName(SERIALIZED_NAME_REVIEWER)
  private CoreCompetencyGradeCompetency200ResponseActionuser reviewer;

  public static final String SERIALIZED_NAME_REVIEWERID = "reviewerid";
  @SerializedName(SERIALIZED_NAME_REVIEWERID)
  private Integer reviewerid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = 0;

  public static final String SERIALIZED_NAME_STATUSNAME = "statusname";
  @SerializedName(SERIALIZED_NAME_STATUSNAME)
  private String statusname;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified = 0;

  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency() {
  }

  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency canrequestreview(Boolean canrequestreview) {
    this.canrequestreview = canrequestreview;
    return this;
  }

   /**
   * canrequestreview
   * @return canrequestreview
  **/
  @javax.annotation.Nonnull
  public Boolean getCanrequestreview() {
    return canrequestreview;
  }

  public void setCanrequestreview(Boolean canrequestreview) {
    this.canrequestreview = canrequestreview;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency canreview(Boolean canreview) {
    this.canreview = canreview;
    return this;
  }

   /**
   * canreview
   * @return canreview
  **/
  @javax.annotation.Nonnull
  public Boolean getCanreview() {
    return canreview;
  }

  public void setCanreview(Boolean canreview) {
    this.canreview = canreview;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency competencyid(Integer competencyid) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency grade(Integer grade) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency gradename(String gradename) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency id(Integer id) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency iscancelreviewrequestallowed(Boolean iscancelreviewrequestallowed) {
    this.iscancelreviewrequestallowed = iscancelreviewrequestallowed;
    return this;
  }

   /**
   * iscancelreviewrequestallowed
   * @return iscancelreviewrequestallowed
  **/
  @javax.annotation.Nonnull
  public Boolean getIscancelreviewrequestallowed() {
    return iscancelreviewrequestallowed;
  }

  public void setIscancelreviewrequestallowed(Boolean iscancelreviewrequestallowed) {
    this.iscancelreviewrequestallowed = iscancelreviewrequestallowed;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency isrequestreviewallowed(Boolean isrequestreviewallowed) {
    this.isrequestreviewallowed = isrequestreviewallowed;
    return this;
  }

   /**
   * isrequestreviewallowed
   * @return isrequestreviewallowed
  **/
  @javax.annotation.Nonnull
  public Boolean getIsrequestreviewallowed() {
    return isrequestreviewallowed;
  }

  public void setIsrequestreviewallowed(Boolean isrequestreviewallowed) {
    this.isrequestreviewallowed = isrequestreviewallowed;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency isstartreviewallowed(Boolean isstartreviewallowed) {
    this.isstartreviewallowed = isstartreviewallowed;
    return this;
  }

   /**
   * isstartreviewallowed
   * @return isstartreviewallowed
  **/
  @javax.annotation.Nonnull
  public Boolean getIsstartreviewallowed() {
    return isstartreviewallowed;
  }

  public void setIsstartreviewallowed(Boolean isstartreviewallowed) {
    this.isstartreviewallowed = isstartreviewallowed;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency isstatusidle(Boolean isstatusidle) {
    this.isstatusidle = isstatusidle;
    return this;
  }

   /**
   * isstatusidle
   * @return isstatusidle
  **/
  @javax.annotation.Nonnull
  public Boolean getIsstatusidle() {
    return isstatusidle;
  }

  public void setIsstatusidle(Boolean isstatusidle) {
    this.isstatusidle = isstatusidle;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency isstatusinreview(Boolean isstatusinreview) {
    this.isstatusinreview = isstatusinreview;
    return this;
  }

   /**
   * isstatusinreview
   * @return isstatusinreview
  **/
  @javax.annotation.Nonnull
  public Boolean getIsstatusinreview() {
    return isstatusinreview;
  }

  public void setIsstatusinreview(Boolean isstatusinreview) {
    this.isstatusinreview = isstatusinreview;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency isstatuswaitingforreview(Boolean isstatuswaitingforreview) {
    this.isstatuswaitingforreview = isstatuswaitingforreview;
    return this;
  }

   /**
   * isstatuswaitingforreview
   * @return isstatuswaitingforreview
  **/
  @javax.annotation.Nonnull
  public Boolean getIsstatuswaitingforreview() {
    return isstatuswaitingforreview;
  }

  public void setIsstatuswaitingforreview(Boolean isstatuswaitingforreview) {
    this.isstatuswaitingforreview = isstatuswaitingforreview;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency isstopreviewallowed(Boolean isstopreviewallowed) {
    this.isstopreviewallowed = isstopreviewallowed;
    return this;
  }

   /**
   * isstopreviewallowed
   * @return isstopreviewallowed
  **/
  @javax.annotation.Nonnull
  public Boolean getIsstopreviewallowed() {
    return isstopreviewallowed;
  }

  public void setIsstopreviewallowed(Boolean isstopreviewallowed) {
    this.isstopreviewallowed = isstopreviewallowed;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency proficiency(Boolean proficiency) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency proficiencyname(String proficiencyname) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency reviewer(CoreCompetencyGradeCompetency200ResponseActionuser reviewer) {
    this.reviewer = reviewer;
    return this;
  }

   /**
   * Get reviewer
   * @return reviewer
  **/
  @javax.annotation.Nullable
  public CoreCompetencyGradeCompetency200ResponseActionuser getReviewer() {
    return reviewer;
  }

  public void setReviewer(CoreCompetencyGradeCompetency200ResponseActionuser reviewer) {
    this.reviewer = reviewer;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency reviewerid(Integer reviewerid) {
    this.reviewerid = reviewerid;
    return this;
  }

   /**
   * reviewerid
   * @return reviewerid
  **/
  @javax.annotation.Nonnull
  public Integer getReviewerid() {
    return reviewerid;
  }

  public void setReviewerid(Integer reviewerid) {
    this.reviewerid = reviewerid;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @javax.annotation.Nonnull
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency statusname(String statusname) {
    this.statusname = statusname;
    return this;
  }

   /**
   * statusname
   * @return statusname
  **/
  @javax.annotation.Nonnull
  public String getStatusname() {
    return statusname;
  }

  public void setStatusname(String statusname) {
    this.statusname = statusname;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency timecreated(Integer timecreated) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency timemodified(Integer timemodified) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency userid(Integer userid) {
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


  public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency usermodified(Integer usermodified) {
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
    ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency = (ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency) o;
    return Objects.equals(this.canrequestreview, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.canrequestreview) &&
        Objects.equals(this.canreview, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.canreview) &&
        Objects.equals(this.competencyid, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.competencyid) &&
        Objects.equals(this.grade, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.grade) &&
        Objects.equals(this.gradename, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.gradename) &&
        Objects.equals(this.id, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.id) &&
        Objects.equals(this.iscancelreviewrequestallowed, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.iscancelreviewrequestallowed) &&
        Objects.equals(this.isrequestreviewallowed, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.isrequestreviewallowed) &&
        Objects.equals(this.isstartreviewallowed, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.isstartreviewallowed) &&
        Objects.equals(this.isstatusidle, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.isstatusidle) &&
        Objects.equals(this.isstatusinreview, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.isstatusinreview) &&
        Objects.equals(this.isstatuswaitingforreview, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.isstatuswaitingforreview) &&
        Objects.equals(this.isstopreviewallowed, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.isstopreviewallowed) &&
        Objects.equals(this.proficiency, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.proficiency) &&
        Objects.equals(this.proficiencyname, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.proficiencyname) &&
        Objects.equals(this.reviewer, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.reviewer) &&
        Objects.equals(this.reviewerid, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.reviewerid) &&
        Objects.equals(this.status, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.status) &&
        Objects.equals(this.statusname, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.statusname) &&
        Objects.equals(this.timecreated, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.timecreated) &&
        Objects.equals(this.timemodified, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.timemodified) &&
        Objects.equals(this.url, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.url) &&
        Objects.equals(this.userid, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.userid) &&
        Objects.equals(this.usermodified, toolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.usermodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canrequestreview, canreview, competencyid, grade, gradename, id, iscancelreviewrequestallowed, isrequestreviewallowed, isstartreviewallowed, isstatusidle, isstatusinreview, isstatuswaitingforreview, isstopreviewallowed, proficiency, proficiencyname, reviewer, reviewerid, status, statusname, timecreated, timemodified, url, userid, usermodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency {\n");
    sb.append("    canrequestreview: ").append(toIndentedString(canrequestreview)).append("\n");
    sb.append("    canreview: ").append(toIndentedString(canreview)).append("\n");
    sb.append("    competencyid: ").append(toIndentedString(competencyid)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradename: ").append(toIndentedString(gradename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iscancelreviewrequestallowed: ").append(toIndentedString(iscancelreviewrequestallowed)).append("\n");
    sb.append("    isrequestreviewallowed: ").append(toIndentedString(isrequestreviewallowed)).append("\n");
    sb.append("    isstartreviewallowed: ").append(toIndentedString(isstartreviewallowed)).append("\n");
    sb.append("    isstatusidle: ").append(toIndentedString(isstatusidle)).append("\n");
    sb.append("    isstatusinreview: ").append(toIndentedString(isstatusinreview)).append("\n");
    sb.append("    isstatuswaitingforreview: ").append(toIndentedString(isstatuswaitingforreview)).append("\n");
    sb.append("    isstopreviewallowed: ").append(toIndentedString(isstopreviewallowed)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
    sb.append("    proficiencyname: ").append(toIndentedString(proficiencyname)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    reviewerid: ").append(toIndentedString(reviewerid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusname: ").append(toIndentedString(statusname)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("canrequestreview");
    openapiFields.add("canreview");
    openapiFields.add("competencyid");
    openapiFields.add("grade");
    openapiFields.add("gradename");
    openapiFields.add("id");
    openapiFields.add("iscancelreviewrequestallowed");
    openapiFields.add("isrequestreviewallowed");
    openapiFields.add("isstartreviewallowed");
    openapiFields.add("isstatusidle");
    openapiFields.add("isstatusinreview");
    openapiFields.add("isstatuswaitingforreview");
    openapiFields.add("isstopreviewallowed");
    openapiFields.add("proficiency");
    openapiFields.add("proficiencyname");
    openapiFields.add("reviewer");
    openapiFields.add("reviewerid");
    openapiFields.add("status");
    openapiFields.add("statusname");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("url");
    openapiFields.add("userid");
    openapiFields.add("usermodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canrequestreview");
    openapiRequiredFields.add("canreview");
    openapiRequiredFields.add("competencyid");
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("gradename");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("iscancelreviewrequestallowed");
    openapiRequiredFields.add("isrequestreviewallowed");
    openapiRequiredFields.add("isstartreviewallowed");
    openapiRequiredFields.add("isstatusidle");
    openapiRequiredFields.add("isstatusinreview");
    openapiRequiredFields.add("isstatuswaitingforreview");
    openapiRequiredFields.add("isstopreviewallowed");
    openapiRequiredFields.add("proficiency");
    openapiRequiredFields.add("proficiencyname");
    openapiRequiredFields.add("reviewerid");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("statusname");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("userid");
    openapiRequiredFields.add("usermodified");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency is not found in the empty JSON string", ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.openapiRequiredFields) {
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
      // validate the optional field `reviewer`
      if (jsonObj.get("reviewer") != null && !jsonObj.get("reviewer").isJsonNull()) {
        CoreCompetencyGradeCompetency200ResponseActionuser.validateJsonElement(jsonObj.get("reviewer"));
      }
      if (!jsonObj.get("statusname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusname").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency
  */
  public static ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.class);
  }

 /**
  * Convert an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

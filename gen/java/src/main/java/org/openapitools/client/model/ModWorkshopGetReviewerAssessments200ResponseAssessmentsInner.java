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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner;

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
 * ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {
  public static final String SERIALIZED_NAME_FEEDBACKATTACHMENTFILES = "feedbackattachmentfiles";
  @SerializedName(SERIALIZED_NAME_FEEDBACKATTACHMENTFILES)
  private List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackattachmentfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEEDBACKAUTHOR = "feedbackauthor";
  @SerializedName(SERIALIZED_NAME_FEEDBACKAUTHOR)
  private String feedbackauthor;

  public static final String SERIALIZED_NAME_FEEDBACKAUTHORATTACHMENT = "feedbackauthorattachment";
  @SerializedName(SERIALIZED_NAME_FEEDBACKAUTHORATTACHMENT)
  private Integer feedbackauthorattachment = 0;

  public static final String SERIALIZED_NAME_FEEDBACKAUTHORFORMAT = "feedbackauthorformat";
  @SerializedName(SERIALIZED_NAME_FEEDBACKAUTHORFORMAT)
  private Integer feedbackauthorformat = 0;

  public static final String SERIALIZED_NAME_FEEDBACKCONTENTFILES = "feedbackcontentfiles";
  @SerializedName(SERIALIZED_NAME_FEEDBACKCONTENTFILES)
  private List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackcontentfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEEDBACKREVIEWER = "feedbackreviewer";
  @SerializedName(SERIALIZED_NAME_FEEDBACKREVIEWER)
  private String feedbackreviewer;

  public static final String SERIALIZED_NAME_FEEDBACKREVIEWERFORMAT = "feedbackreviewerformat";
  @SerializedName(SERIALIZED_NAME_FEEDBACKREVIEWERFORMAT)
  private Integer feedbackreviewerformat = 0;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private BigDecimal grade;

  public static final String SERIALIZED_NAME_GRADINGGRADE = "gradinggrade";
  @SerializedName(SERIALIZED_NAME_GRADINGGRADE)
  private BigDecimal gradinggrade;

  public static final String SERIALIZED_NAME_GRADINGGRADEOVER = "gradinggradeover";
  @SerializedName(SERIALIZED_NAME_GRADINGGRADEOVER)
  private BigDecimal gradinggradeover;

  public static final String SERIALIZED_NAME_GRADINGGRADEOVERBY = "gradinggradeoverby";
  @SerializedName(SERIALIZED_NAME_GRADINGGRADEOVERBY)
  private Integer gradinggradeoverby;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REVIEWERID = "reviewerid";
  @SerializedName(SERIALIZED_NAME_REVIEWERID)
  private Integer reviewerid;

  public static final String SERIALIZED_NAME_SUBMISSIONID = "submissionid";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONID)
  private Integer submissionid;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight = 1;

  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner() {
  }

  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner feedbackattachmentfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackattachmentfiles) {
    this.feedbackattachmentfiles = feedbackattachmentfiles;
    return this;
  }

  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner addFeedbackattachmentfilesItem(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner feedbackattachmentfilesItem) {
    if (this.feedbackattachmentfiles == null) {
      this.feedbackattachmentfiles = new ArrayList<>();
    }
    this.feedbackattachmentfiles.add(feedbackattachmentfilesItem);
    return this;
  }

   /**
   * Get feedbackattachmentfiles
   * @return feedbackattachmentfiles
  **/
  @javax.annotation.Nullable
  public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> getFeedbackattachmentfiles() {
    return feedbackattachmentfiles;
  }

  public void setFeedbackattachmentfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackattachmentfiles) {
    this.feedbackattachmentfiles = feedbackattachmentfiles;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner feedbackauthor(String feedbackauthor) {
    this.feedbackauthor = feedbackauthor;
    return this;
  }

   /**
   * The comment/feedback from the reviewer for the author.
   * @return feedbackauthor
  **/
  @javax.annotation.Nullable
  public String getFeedbackauthor() {
    return feedbackauthor;
  }

  public void setFeedbackauthor(String feedbackauthor) {
    this.feedbackauthor = feedbackauthor;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner feedbackauthorattachment(Integer feedbackauthorattachment) {
    this.feedbackauthorattachment = feedbackauthorattachment;
    return this;
  }

   /**
   * Are there some files attached to the feedbackauthor field?                     Sets to 1 by file_postupdate_standard_filemanager().
   * @return feedbackauthorattachment
  **/
  @javax.annotation.Nullable
  public Integer getFeedbackauthorattachment() {
    return feedbackauthorattachment;
  }

  public void setFeedbackauthorattachment(Integer feedbackauthorattachment) {
    this.feedbackauthorattachment = feedbackauthorattachment;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner feedbackauthorformat(Integer feedbackauthorformat) {
    this.feedbackauthorformat = feedbackauthorformat;
    return this;
  }

   /**
   * feedbackauthor format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return feedbackauthorformat
  **/
  @javax.annotation.Nullable
  public Integer getFeedbackauthorformat() {
    return feedbackauthorformat;
  }

  public void setFeedbackauthorformat(Integer feedbackauthorformat) {
    this.feedbackauthorformat = feedbackauthorformat;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner feedbackcontentfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackcontentfiles) {
    this.feedbackcontentfiles = feedbackcontentfiles;
    return this;
  }

  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner addFeedbackcontentfilesItem(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner feedbackcontentfilesItem) {
    if (this.feedbackcontentfiles == null) {
      this.feedbackcontentfiles = new ArrayList<>();
    }
    this.feedbackcontentfiles.add(feedbackcontentfilesItem);
    return this;
  }

   /**
   * Get feedbackcontentfiles
   * @return feedbackcontentfiles
  **/
  @javax.annotation.Nullable
  public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> getFeedbackcontentfiles() {
    return feedbackcontentfiles;
  }

  public void setFeedbackcontentfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> feedbackcontentfiles) {
    this.feedbackcontentfiles = feedbackcontentfiles;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner feedbackreviewer(String feedbackreviewer) {
    this.feedbackreviewer = feedbackreviewer;
    return this;
  }

   /**
   * The comment/feedback from the teacher for the reviewer.                     For example the reason why the grade for assessment was overridden
   * @return feedbackreviewer
  **/
  @javax.annotation.Nullable
  public String getFeedbackreviewer() {
    return feedbackreviewer;
  }

  public void setFeedbackreviewer(String feedbackreviewer) {
    this.feedbackreviewer = feedbackreviewer;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner feedbackreviewerformat(Integer feedbackreviewerformat) {
    this.feedbackreviewerformat = feedbackreviewerformat;
    return this;
  }

   /**
   * feedbackreviewer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return feedbackreviewerformat
  **/
  @javax.annotation.Nullable
  public Integer getFeedbackreviewerformat() {
    return feedbackreviewerformat;
  }

  public void setFeedbackreviewerformat(Integer feedbackreviewerformat) {
    this.feedbackreviewerformat = feedbackreviewerformat;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner grade(BigDecimal grade) {
    this.grade = grade;
    return this;
  }

   /**
   * The aggregated grade for submission suggested by the reviewer.                     The grade 0..100 is computed from the values assigned to the assessment dimensions fields. If NULL then it has not been aggregated yet.
   * @return grade
  **/
  @javax.annotation.Nullable
  public BigDecimal getGrade() {
    return grade;
  }

  public void setGrade(BigDecimal grade) {
    this.grade = grade;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner gradinggrade(BigDecimal gradinggrade) {
    this.gradinggrade = gradinggrade;
    return this;
  }

   /**
   * The computed grade 0..100 for this assessment. If NULL then it has not been computed yet.
   * @return gradinggrade
  **/
  @javax.annotation.Nullable
  public BigDecimal getGradinggrade() {
    return gradinggrade;
  }

  public void setGradinggrade(BigDecimal gradinggrade) {
    this.gradinggrade = gradinggrade;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner gradinggradeover(BigDecimal gradinggradeover) {
    this.gradinggradeover = gradinggradeover;
    return this;
  }

   /**
   * Grade for the assessment manually overridden by a teacher.                     Grade is always from interval 0..100. If NULL then the grade is not overriden.
   * @return gradinggradeover
  **/
  @javax.annotation.Nullable
  public BigDecimal getGradinggradeover() {
    return gradinggradeover;
  }

  public void setGradinggradeover(BigDecimal gradinggradeover) {
    this.gradinggradeover = gradinggradeover;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner gradinggradeoverby(Integer gradinggradeoverby) {
    this.gradinggradeoverby = gradinggradeoverby;
    return this;
  }

   /**
   * The id of the user who has overridden the grade for submission.
   * @return gradinggradeoverby
  **/
  @javax.annotation.Nullable
  public Integer getGradinggradeoverby() {
    return gradinggradeoverby;
  }

  public void setGradinggradeoverby(Integer gradinggradeoverby) {
    this.gradinggradeoverby = gradinggradeoverby;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The primary key of the record.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner reviewerid(Integer reviewerid) {
    this.reviewerid = reviewerid;
    return this;
  }

   /**
   * The id of the reviewer who makes this assessment
   * @return reviewerid
  **/
  @javax.annotation.Nullable
  public Integer getReviewerid() {
    return reviewerid;
  }

  public void setReviewerid(Integer reviewerid) {
    this.reviewerid = reviewerid;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner submissionid(Integer submissionid) {
    this.submissionid = submissionid;
    return this;
  }

   /**
   * The id of the assessed submission
   * @return submissionid
  **/
  @javax.annotation.Nullable
  public Integer getSubmissionid() {
    return submissionid;
  }

  public void setSubmissionid(Integer submissionid) {
    this.submissionid = submissionid;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the first time
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * If 0 then the assessment was allocated but the reviewer has not assessed yet.                     If greater than 0 then the timestamp of when the reviewer assessed for the last time
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the assessment for the purposes of aggregation
   * @return weight
  **/
  @javax.annotation.Nullable
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner modWorkshopGetReviewerAssessments200ResponseAssessmentsInner = (ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner) o;
    return Objects.equals(this.feedbackattachmentfiles, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.feedbackattachmentfiles) &&
        Objects.equals(this.feedbackauthor, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.feedbackauthor) &&
        Objects.equals(this.feedbackauthorattachment, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.feedbackauthorattachment) &&
        Objects.equals(this.feedbackauthorformat, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.feedbackauthorformat) &&
        Objects.equals(this.feedbackcontentfiles, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.feedbackcontentfiles) &&
        Objects.equals(this.feedbackreviewer, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.feedbackreviewer) &&
        Objects.equals(this.feedbackreviewerformat, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.feedbackreviewerformat) &&
        Objects.equals(this.grade, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.grade) &&
        Objects.equals(this.gradinggrade, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.gradinggrade) &&
        Objects.equals(this.gradinggradeover, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.gradinggradeover) &&
        Objects.equals(this.gradinggradeoverby, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.gradinggradeoverby) &&
        Objects.equals(this.id, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.id) &&
        Objects.equals(this.reviewerid, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.reviewerid) &&
        Objects.equals(this.submissionid, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.submissionid) &&
        Objects.equals(this.timecreated, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.timecreated) &&
        Objects.equals(this.timemodified, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.timemodified) &&
        Objects.equals(this.weight, modWorkshopGetReviewerAssessments200ResponseAssessmentsInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackattachmentfiles, feedbackauthor, feedbackauthorattachment, feedbackauthorformat, feedbackcontentfiles, feedbackreviewer, feedbackreviewerformat, grade, gradinggrade, gradinggradeover, gradinggradeoverby, id, reviewerid, submissionid, timecreated, timemodified, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner {\n");
    sb.append("    feedbackattachmentfiles: ").append(toIndentedString(feedbackattachmentfiles)).append("\n");
    sb.append("    feedbackauthor: ").append(toIndentedString(feedbackauthor)).append("\n");
    sb.append("    feedbackauthorattachment: ").append(toIndentedString(feedbackauthorattachment)).append("\n");
    sb.append("    feedbackauthorformat: ").append(toIndentedString(feedbackauthorformat)).append("\n");
    sb.append("    feedbackcontentfiles: ").append(toIndentedString(feedbackcontentfiles)).append("\n");
    sb.append("    feedbackreviewer: ").append(toIndentedString(feedbackreviewer)).append("\n");
    sb.append("    feedbackreviewerformat: ").append(toIndentedString(feedbackreviewerformat)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradinggrade: ").append(toIndentedString(gradinggrade)).append("\n");
    sb.append("    gradinggradeover: ").append(toIndentedString(gradinggradeover)).append("\n");
    sb.append("    gradinggradeoverby: ").append(toIndentedString(gradinggradeoverby)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reviewerid: ").append(toIndentedString(reviewerid)).append("\n");
    sb.append("    submissionid: ").append(toIndentedString(submissionid)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("feedbackattachmentfiles");
    openapiFields.add("feedbackauthor");
    openapiFields.add("feedbackauthorattachment");
    openapiFields.add("feedbackauthorformat");
    openapiFields.add("feedbackcontentfiles");
    openapiFields.add("feedbackreviewer");
    openapiFields.add("feedbackreviewerformat");
    openapiFields.add("grade");
    openapiFields.add("gradinggrade");
    openapiFields.add("gradinggradeover");
    openapiFields.add("gradinggradeoverby");
    openapiFields.add("id");
    openapiFields.add("reviewerid");
    openapiFields.add("submissionid");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner is not found in the empty JSON string", ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("feedbackattachmentfiles") != null && !jsonObj.get("feedbackattachmentfiles").isJsonNull()) {
        JsonArray jsonArrayfeedbackattachmentfiles = jsonObj.getAsJsonArray("feedbackattachmentfiles");
        if (jsonArrayfeedbackattachmentfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("feedbackattachmentfiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `feedbackattachmentfiles` to be an array in the JSON string but got `%s`", jsonObj.get("feedbackattachmentfiles").toString()));
          }

          // validate the optional field `feedbackattachmentfiles` (array)
          for (int i = 0; i < jsonArrayfeedbackattachmentfiles.size(); i++) {
            CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.validateJsonElement(jsonArrayfeedbackattachmentfiles.get(i));
          };
        }
      }
      if ((jsonObj.get("feedbackauthor") != null && !jsonObj.get("feedbackauthor").isJsonNull()) && !jsonObj.get("feedbackauthor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbackauthor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedbackauthor").toString()));
      }
      if (jsonObj.get("feedbackcontentfiles") != null && !jsonObj.get("feedbackcontentfiles").isJsonNull()) {
        JsonArray jsonArrayfeedbackcontentfiles = jsonObj.getAsJsonArray("feedbackcontentfiles");
        if (jsonArrayfeedbackcontentfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("feedbackcontentfiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `feedbackcontentfiles` to be an array in the JSON string but got `%s`", jsonObj.get("feedbackcontentfiles").toString()));
          }

          // validate the optional field `feedbackcontentfiles` (array)
          for (int i = 0; i < jsonArrayfeedbackcontentfiles.size(); i++) {
            CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.validateJsonElement(jsonArrayfeedbackcontentfiles.get(i));
          };
        }
      }
      if ((jsonObj.get("feedbackreviewer") != null && !jsonObj.get("feedbackreviewer").isJsonNull()) && !jsonObj.get("feedbackreviewer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbackreviewer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedbackreviewer").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner>() {
           @Override
           public void write(JsonWriter out, ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
  * @throws IOException if the JSON string is invalid with respect to ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner
  */
  public static ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.class);
  }

 /**
  * Convert an instance of ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

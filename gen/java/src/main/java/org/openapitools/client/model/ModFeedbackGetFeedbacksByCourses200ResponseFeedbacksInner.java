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
 * ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner {
  public static final String SERIALIZED_NAME_ANONYMOUS = "anonymous";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS)
  private Integer anonymous = null;

  public static final String SERIALIZED_NAME_AUTONUMBERING = "autonumbering";
  @SerializedName(SERIALIZED_NAME_AUTONUMBERING)
  private Boolean autonumbering = 1;

  public static final String SERIALIZED_NAME_COMPLETIONSUBMIT = "completionsubmit";
  @SerializedName(SERIALIZED_NAME_COMPLETIONSUBMIT)
  private Boolean completionsubmit = 0;

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Integer course = null;

  public static final String SERIALIZED_NAME_COURSEMODULE = "coursemodule";
  @SerializedName(SERIALIZED_NAME_COURSEMODULE)
  private Integer coursemodule;

  public static final String SERIALIZED_NAME_EMAIL_NOTIFICATION = "email_notification";
  @SerializedName(SERIALIZED_NAME_EMAIL_NOTIFICATION)
  private Boolean emailNotification = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_INTRO = "intro";
  @SerializedName(SERIALIZED_NAME_INTRO)
  private String intro = "";

  public static final String SERIALIZED_NAME_INTROFILES = "introfiles";
  @SerializedName(SERIALIZED_NAME_INTROFILES)
  private List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> introfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTROFORMAT = "introformat";
  @SerializedName(SERIALIZED_NAME_INTROFORMAT)
  private Integer introformat = 0;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_MULTIPLE_SUBMIT = "multiple_submit";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_SUBMIT)
  private Boolean multipleSubmit = 1;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PAGE_AFTER_SUBMIT = "page_after_submit";
  @SerializedName(SERIALIZED_NAME_PAGE_AFTER_SUBMIT)
  private String pageAfterSubmit = "null";

  public static final String SERIALIZED_NAME_PAGE_AFTER_SUBMITFORMAT = "page_after_submitformat";
  @SerializedName(SERIALIZED_NAME_PAGE_AFTER_SUBMITFORMAT)
  private Integer pageAfterSubmitformat = 0;

  public static final String SERIALIZED_NAME_PAGEAFTERSUBMITFILES = "pageaftersubmitfiles";
  @SerializedName(SERIALIZED_NAME_PAGEAFTERSUBMITFILES)
  private List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> pageaftersubmitfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_PUBLISH_STATS = "publish_stats";
  @SerializedName(SERIALIZED_NAME_PUBLISH_STATS)
  private Boolean publishStats = 0;

  public static final String SERIALIZED_NAME_SITE_AFTER_SUBMIT = "site_after_submit";
  @SerializedName(SERIALIZED_NAME_SITE_AFTER_SUBMIT)
  private String siteAfterSubmit = "null";

  public static final String SERIALIZED_NAME_TIMECLOSE = "timeclose";
  @SerializedName(SERIALIZED_NAME_TIMECLOSE)
  private Integer timeclose = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public static final String SERIALIZED_NAME_TIMEOPEN = "timeopen";
  @SerializedName(SERIALIZED_NAME_TIMEOPEN)
  private Integer timeopen = null;

  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner() {
  }

  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner anonymous(Integer anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Whether the feedback is anonymous.
   * @return anonymous
  **/
  @javax.annotation.Nullable
  public Integer getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Integer anonymous) {
    this.anonymous = anonymous;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner autonumbering(Boolean autonumbering) {
    this.autonumbering = autonumbering;
    return this;
  }

   /**
   * Whether questions should be auto-numbered.
   * @return autonumbering
  **/
  @javax.annotation.Nullable
  public Boolean getAutonumbering() {
    return autonumbering;
  }

  public void setAutonumbering(Boolean autonumbering) {
    this.autonumbering = autonumbering;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner completionsubmit(Boolean completionsubmit) {
    this.completionsubmit = completionsubmit;
    return this;
  }

   /**
   * If this field is set to 1, then the activity will be automatically marked as complete on submission.
   * @return completionsubmit
  **/
  @javax.annotation.Nullable
  public Boolean getCompletionsubmit() {
    return completionsubmit;
  }

  public void setCompletionsubmit(Boolean completionsubmit) {
    this.completionsubmit = completionsubmit;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner course(Integer course) {
    this.course = course;
    return this;
  }

   /**
   * Course id this feedback is part of.
   * @return course
  **/
  @javax.annotation.Nullable
  public Integer getCourse() {
    return course;
  }

  public void setCourse(Integer course) {
    this.course = course;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner coursemodule(Integer coursemodule) {
    this.coursemodule = coursemodule;
    return this;
  }

   /**
   * coursemodule
   * @return coursemodule
  **/
  @javax.annotation.Nullable
  public Integer getCoursemodule() {
    return coursemodule;
  }

  public void setCoursemodule(Integer coursemodule) {
    this.coursemodule = coursemodule;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner emailNotification(Boolean emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

   /**
   * Whether email notifications will be sent to teachers.
   * @return emailNotification
  **/
  @javax.annotation.Nullable
  public Boolean getEmailNotification() {
    return emailNotification;
  }

  public void setEmailNotification(Boolean emailNotification) {
    this.emailNotification = emailNotification;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner id(Integer id) {
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


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner intro(String intro) {
    this.intro = intro;
    return this;
  }

   /**
   * Feedback introduction text.
   * @return intro
  **/
  @javax.annotation.Nullable
  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner introfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> introfiles) {
    this.introfiles = introfiles;
    return this;
  }

  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner addIntrofilesItem(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner introfilesItem) {
    if (this.introfiles == null) {
      this.introfiles = new ArrayList<>();
    }
    this.introfiles.add(introfilesItem);
    return this;
  }

   /**
   * Get introfiles
   * @return introfiles
  **/
  @javax.annotation.Nullable
  public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> getIntrofiles() {
    return introfiles;
  }

  public void setIntrofiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> introfiles) {
    this.introfiles = introfiles;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner introformat(Integer introformat) {
    this.introformat = introformat;
    return this;
  }

   /**
   * intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return introformat
  **/
  @javax.annotation.Nullable
  public Integer getIntroformat() {
    return introformat;
  }

  public void setIntroformat(Integer introformat) {
    this.introformat = introformat;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Forced activity language
   * @return lang
  **/
  @javax.annotation.Nullable
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner multipleSubmit(Boolean multipleSubmit) {
    this.multipleSubmit = multipleSubmit;
    return this;
  }

   /**
   * Whether multiple submissions are allowed.
   * @return multipleSubmit
  **/
  @javax.annotation.Nullable
  public Boolean getMultipleSubmit() {
    return multipleSubmit;
  }

  public void setMultipleSubmit(Boolean multipleSubmit) {
    this.multipleSubmit = multipleSubmit;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Feedback name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner pageAfterSubmit(String pageAfterSubmit) {
    this.pageAfterSubmit = pageAfterSubmit;
    return this;
  }

   /**
   * Text to display after submission.
   * @return pageAfterSubmit
  **/
  @javax.annotation.Nullable
  public String getPageAfterSubmit() {
    return pageAfterSubmit;
  }

  public void setPageAfterSubmit(String pageAfterSubmit) {
    this.pageAfterSubmit = pageAfterSubmit;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner pageAfterSubmitformat(Integer pageAfterSubmitformat) {
    this.pageAfterSubmitformat = pageAfterSubmitformat;
    return this;
  }

   /**
   * page_after_submit format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return pageAfterSubmitformat
  **/
  @javax.annotation.Nullable
  public Integer getPageAfterSubmitformat() {
    return pageAfterSubmitformat;
  }

  public void setPageAfterSubmitformat(Integer pageAfterSubmitformat) {
    this.pageAfterSubmitformat = pageAfterSubmitformat;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner pageaftersubmitfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> pageaftersubmitfiles) {
    this.pageaftersubmitfiles = pageaftersubmitfiles;
    return this;
  }

  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner addPageaftersubmitfilesItem(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner pageaftersubmitfilesItem) {
    if (this.pageaftersubmitfiles == null) {
      this.pageaftersubmitfiles = new ArrayList<>();
    }
    this.pageaftersubmitfiles.add(pageaftersubmitfilesItem);
    return this;
  }

   /**
   * Get pageaftersubmitfiles
   * @return pageaftersubmitfiles
  **/
  @javax.annotation.Nullable
  public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> getPageaftersubmitfiles() {
    return pageaftersubmitfiles;
  }

  public void setPageaftersubmitfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> pageaftersubmitfiles) {
    this.pageaftersubmitfiles = pageaftersubmitfiles;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner publishStats(Boolean publishStats) {
    this.publishStats = publishStats;
    return this;
  }

   /**
   * Whether stats should be published.
   * @return publishStats
  **/
  @javax.annotation.Nullable
  public Boolean getPublishStats() {
    return publishStats;
  }

  public void setPublishStats(Boolean publishStats) {
    this.publishStats = publishStats;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner siteAfterSubmit(String siteAfterSubmit) {
    this.siteAfterSubmit = siteAfterSubmit;
    return this;
  }

   /**
   * Link to next page after submission.
   * @return siteAfterSubmit
  **/
  @javax.annotation.Nullable
  public String getSiteAfterSubmit() {
    return siteAfterSubmit;
  }

  public void setSiteAfterSubmit(String siteAfterSubmit) {
    this.siteAfterSubmit = siteAfterSubmit;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner timeclose(Integer timeclose) {
    this.timeclose = timeclose;
    return this;
  }

   /**
   * Allow answers until this time.
   * @return timeclose
  **/
  @javax.annotation.Nullable
  public Integer getTimeclose() {
    return timeclose;
  }

  public void setTimeclose(Integer timeclose) {
    this.timeclose = timeclose;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * The time this record was modified.
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner timeopen(Integer timeopen) {
    this.timeopen = timeopen;
    return this;
  }

   /**
   * Allow answers from this time.
   * @return timeopen
  **/
  @javax.annotation.Nullable
  public Integer getTimeopen() {
    return timeopen;
  }

  public void setTimeopen(Integer timeopen) {
    this.timeopen = timeopen;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner = (ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) o;
    return Objects.equals(this.anonymous, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.anonymous) &&
        Objects.equals(this.autonumbering, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.autonumbering) &&
        Objects.equals(this.completionsubmit, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.completionsubmit) &&
        Objects.equals(this.course, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.course) &&
        Objects.equals(this.coursemodule, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.coursemodule) &&
        Objects.equals(this.emailNotification, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.emailNotification) &&
        Objects.equals(this.id, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.id) &&
        Objects.equals(this.intro, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.intro) &&
        Objects.equals(this.introfiles, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.introfiles) &&
        Objects.equals(this.introformat, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.introformat) &&
        Objects.equals(this.lang, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.lang) &&
        Objects.equals(this.multipleSubmit, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.multipleSubmit) &&
        Objects.equals(this.name, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.name) &&
        Objects.equals(this.pageAfterSubmit, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.pageAfterSubmit) &&
        Objects.equals(this.pageAfterSubmitformat, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.pageAfterSubmitformat) &&
        Objects.equals(this.pageaftersubmitfiles, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.pageaftersubmitfiles) &&
        Objects.equals(this.publishStats, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.publishStats) &&
        Objects.equals(this.siteAfterSubmit, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.siteAfterSubmit) &&
        Objects.equals(this.timeclose, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.timeclose) &&
        Objects.equals(this.timemodified, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.timemodified) &&
        Objects.equals(this.timeopen, modFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.timeopen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous, autonumbering, completionsubmit, course, coursemodule, emailNotification, id, intro, introfiles, introformat, lang, multipleSubmit, name, pageAfterSubmit, pageAfterSubmitformat, pageaftersubmitfiles, publishStats, siteAfterSubmit, timeclose, timemodified, timeopen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner {\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    autonumbering: ").append(toIndentedString(autonumbering)).append("\n");
    sb.append("    completionsubmit: ").append(toIndentedString(completionsubmit)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    coursemodule: ").append(toIndentedString(coursemodule)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    introfiles: ").append(toIndentedString(introfiles)).append("\n");
    sb.append("    introformat: ").append(toIndentedString(introformat)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    multipleSubmit: ").append(toIndentedString(multipleSubmit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageAfterSubmit: ").append(toIndentedString(pageAfterSubmit)).append("\n");
    sb.append("    pageAfterSubmitformat: ").append(toIndentedString(pageAfterSubmitformat)).append("\n");
    sb.append("    pageaftersubmitfiles: ").append(toIndentedString(pageaftersubmitfiles)).append("\n");
    sb.append("    publishStats: ").append(toIndentedString(publishStats)).append("\n");
    sb.append("    siteAfterSubmit: ").append(toIndentedString(siteAfterSubmit)).append("\n");
    sb.append("    timeclose: ").append(toIndentedString(timeclose)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    timeopen: ").append(toIndentedString(timeopen)).append("\n");
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
    openapiFields.add("anonymous");
    openapiFields.add("autonumbering");
    openapiFields.add("completionsubmit");
    openapiFields.add("course");
    openapiFields.add("coursemodule");
    openapiFields.add("email_notification");
    openapiFields.add("id");
    openapiFields.add("intro");
    openapiFields.add("introfiles");
    openapiFields.add("introformat");
    openapiFields.add("lang");
    openapiFields.add("multiple_submit");
    openapiFields.add("name");
    openapiFields.add("page_after_submit");
    openapiFields.add("page_after_submitformat");
    openapiFields.add("pageaftersubmitfiles");
    openapiFields.add("publish_stats");
    openapiFields.add("site_after_submit");
    openapiFields.add("timeclose");
    openapiFields.add("timemodified");
    openapiFields.add("timeopen");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner is not found in the empty JSON string", ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("intro") != null && !jsonObj.get("intro").isJsonNull()) && !jsonObj.get("intro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intro").toString()));
      }
      if (jsonObj.get("introfiles") != null && !jsonObj.get("introfiles").isJsonNull()) {
        JsonArray jsonArrayintrofiles = jsonObj.getAsJsonArray("introfiles");
        if (jsonArrayintrofiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("introfiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `introfiles` to be an array in the JSON string but got `%s`", jsonObj.get("introfiles").toString()));
          }

          // validate the optional field `introfiles` (array)
          for (int i = 0; i < jsonArrayintrofiles.size(); i++) {
            CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.validateJsonElement(jsonArrayintrofiles.get(i));
          };
        }
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("page_after_submit") != null && !jsonObj.get("page_after_submit").isJsonNull()) && !jsonObj.get("page_after_submit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_after_submit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_after_submit").toString()));
      }
      if (jsonObj.get("pageaftersubmitfiles") != null && !jsonObj.get("pageaftersubmitfiles").isJsonNull()) {
        JsonArray jsonArraypageaftersubmitfiles = jsonObj.getAsJsonArray("pageaftersubmitfiles");
        if (jsonArraypageaftersubmitfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pageaftersubmitfiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pageaftersubmitfiles` to be an array in the JSON string but got `%s`", jsonObj.get("pageaftersubmitfiles").toString()));
          }

          // validate the optional field `pageaftersubmitfiles` (array)
          for (int i = 0; i < jsonArraypageaftersubmitfiles.size(); i++) {
            CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.validateJsonElement(jsonArraypageaftersubmitfiles.get(i));
          };
        }
      }
      if ((jsonObj.get("site_after_submit") != null && !jsonObj.get("site_after_submit").isJsonNull()) && !jsonObj.get("site_after_submit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `site_after_submit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("site_after_submit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner>() {
           @Override
           public void write(JsonWriter out, ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner
  * @throws IOException if the JSON string is invalid with respect to ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner
  */
  public static ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.class);
  }

 /**
  * Convert an instance of ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


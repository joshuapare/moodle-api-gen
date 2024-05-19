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
import org.openapitools.client.model.CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner;

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
 * Choices
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModChoiceGetChoicesByCourses200ResponseChoicesInner {
  public static final String SERIALIZED_NAME_ALLOWMULTIPLE = "allowmultiple";
  @SerializedName(SERIALIZED_NAME_ALLOWMULTIPLE)
  private Boolean allowmultiple = null;

  public static final String SERIALIZED_NAME_ALLOWUPDATE = "allowupdate";
  @SerializedName(SERIALIZED_NAME_ALLOWUPDATE)
  private Boolean allowupdate = null;

  public static final String SERIALIZED_NAME_COMPLETIONSUBMIT = "completionsubmit";
  @SerializedName(SERIALIZED_NAME_COMPLETIONSUBMIT)
  private Boolean completionsubmit = null;

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Integer course;

  public static final String SERIALIZED_NAME_COURSEMODULE = "coursemodule";
  @SerializedName(SERIALIZED_NAME_COURSEMODULE)
  private Integer coursemodule;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private Integer display = null;

  public static final String SERIALIZED_NAME_GROUPINGID = "groupingid";
  @SerializedName(SERIALIZED_NAME_GROUPINGID)
  private Integer groupingid;

  public static final String SERIALIZED_NAME_GROUPMODE = "groupmode";
  @SerializedName(SERIALIZED_NAME_GROUPMODE)
  private Integer groupmode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INCLUDEINACTIVE = "includeinactive";
  @SerializedName(SERIALIZED_NAME_INCLUDEINACTIVE)
  private Boolean includeinactive = null;

  public static final String SERIALIZED_NAME_INTRO = "intro";
  @SerializedName(SERIALIZED_NAME_INTRO)
  private String intro;

  public static final String SERIALIZED_NAME_INTROFILES = "introfiles";
  @SerializedName(SERIALIZED_NAME_INTROFILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTROFORMAT = "introformat";
  @SerializedName(SERIALIZED_NAME_INTROFORMAT)
  private Integer introformat;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_LIMITANSWERS = "limitanswers";
  @SerializedName(SERIALIZED_NAME_LIMITANSWERS)
  private Boolean limitanswers = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PUBLISH = "publish";
  @SerializedName(SERIALIZED_NAME_PUBLISH)
  private Boolean publish = null;

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private Integer section;

  public static final String SERIALIZED_NAME_SHOWAVAILABLE = "showavailable";
  @SerializedName(SERIALIZED_NAME_SHOWAVAILABLE)
  private Boolean showavailable = null;

  public static final String SERIALIZED_NAME_SHOWPREVIEW = "showpreview";
  @SerializedName(SERIALIZED_NAME_SHOWPREVIEW)
  private Boolean showpreview = null;

  public static final String SERIALIZED_NAME_SHOWRESULTS = "showresults";
  @SerializedName(SERIALIZED_NAME_SHOWRESULTS)
  private Integer showresults = null;

  public static final String SERIALIZED_NAME_SHOWUNANSWERED = "showunanswered";
  @SerializedName(SERIALIZED_NAME_SHOWUNANSWERED)
  private Boolean showunanswered = null;

  public static final String SERIALIZED_NAME_TIMECLOSE = "timeclose";
  @SerializedName(SERIALIZED_NAME_TIMECLOSE)
  private Integer timeclose = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_TIMEOPEN = "timeopen";
  @SerializedName(SERIALIZED_NAME_TIMEOPEN)
  private Integer timeopen = null;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public ModChoiceGetChoicesByCourses200ResponseChoicesInner() {
  }

  public ModChoiceGetChoicesByCourses200ResponseChoicesInner allowmultiple(Boolean allowmultiple) {
    this.allowmultiple = allowmultiple;
    return this;
  }

   /**
   * Allow multiple choices
   * @return allowmultiple
  **/
  @javax.annotation.Nullable
  public Boolean getAllowmultiple() {
    return allowmultiple;
  }

  public void setAllowmultiple(Boolean allowmultiple) {
    this.allowmultiple = allowmultiple;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner allowupdate(Boolean allowupdate) {
    this.allowupdate = allowupdate;
    return this;
  }

   /**
   * Allow update
   * @return allowupdate
  **/
  @javax.annotation.Nullable
  public Boolean getAllowupdate() {
    return allowupdate;
  }

  public void setAllowupdate(Boolean allowupdate) {
    this.allowupdate = allowupdate;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner completionsubmit(Boolean completionsubmit) {
    this.completionsubmit = completionsubmit;
    return this;
  }

   /**
   * Completion on user submission
   * @return completionsubmit
  **/
  @javax.annotation.Nullable
  public Boolean getCompletionsubmit() {
    return completionsubmit;
  }

  public void setCompletionsubmit(Boolean completionsubmit) {
    this.completionsubmit = completionsubmit;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner course(Integer course) {
    this.course = course;
    return this;
  }

   /**
   * Course id
   * @return course
  **/
  @javax.annotation.Nullable
  public Integer getCourse() {
    return course;
  }

  public void setCourse(Integer course) {
    this.course = course;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner coursemodule(Integer coursemodule) {
    this.coursemodule = coursemodule;
    return this;
  }

   /**
   * Course module id
   * @return coursemodule
  **/
  @javax.annotation.Nullable
  public Integer getCoursemodule() {
    return coursemodule;
  }

  public void setCoursemodule(Integer coursemodule) {
    this.coursemodule = coursemodule;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner display(Integer display) {
    this.display = display;
    return this;
  }

   /**
   * Display mode (vertical, horizontal)
   * @return display
  **/
  @javax.annotation.Nullable
  public Integer getDisplay() {
    return display;
  }

  public void setDisplay(Integer display) {
    this.display = display;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner groupingid(Integer groupingid) {
    this.groupingid = groupingid;
    return this;
  }

   /**
   * Group id
   * @return groupingid
  **/
  @javax.annotation.Nullable
  public Integer getGroupingid() {
    return groupingid;
  }

  public void setGroupingid(Integer groupingid) {
    this.groupingid = groupingid;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner groupmode(Integer groupmode) {
    this.groupmode = groupmode;
    return this;
  }

   /**
   * Group mode
   * @return groupmode
  **/
  @javax.annotation.Nullable
  public Integer getGroupmode() {
    return groupmode;
  }

  public void setGroupmode(Integer groupmode) {
    this.groupmode = groupmode;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Activity instance id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner includeinactive(Boolean includeinactive) {
    this.includeinactive = includeinactive;
    return this;
  }

   /**
   * Include inactive users
   * @return includeinactive
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeinactive() {
    return includeinactive;
  }

  public void setIncludeinactive(Boolean includeinactive) {
    this.includeinactive = includeinactive;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner intro(String intro) {
    this.intro = intro;
    return this;
  }

   /**
   * Activity introduction
   * @return intro
  **/
  @javax.annotation.Nullable
  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner introfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles) {
    this.introfiles = introfiles;
    return this;
  }

  public ModChoiceGetChoicesByCourses200ResponseChoicesInner addIntrofilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner introfilesItem) {
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
  public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> getIntrofiles() {
    return introfiles;
  }

  public void setIntrofiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles) {
    this.introfiles = introfiles;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner introformat(Integer introformat) {
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


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner lang(String lang) {
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


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner limitanswers(Boolean limitanswers) {
    this.limitanswers = limitanswers;
    return this;
  }

   /**
   * Limit unswers
   * @return limitanswers
  **/
  @javax.annotation.Nullable
  public Boolean getLimitanswers() {
    return limitanswers;
  }

  public void setLimitanswers(Boolean limitanswers) {
    this.limitanswers = limitanswers;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Activity name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner publish(Boolean publish) {
    this.publish = publish;
    return this;
  }

   /**
   * If choice is published
   * @return publish
  **/
  @javax.annotation.Nullable
  public Boolean getPublish() {
    return publish;
  }

  public void setPublish(Boolean publish) {
    this.publish = publish;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner section(Integer section) {
    this.section = section;
    return this;
  }

   /**
   * Course section id
   * @return section
  **/
  @javax.annotation.Nullable
  public Integer getSection() {
    return section;
  }

  public void setSection(Integer section) {
    this.section = section;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner showavailable(Boolean showavailable) {
    this.showavailable = showavailable;
    return this;
  }

   /**
   * Show available spaces
   * @return showavailable
  **/
  @javax.annotation.Nullable
  public Boolean getShowavailable() {
    return showavailable;
  }

  public void setShowavailable(Boolean showavailable) {
    this.showavailable = showavailable;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner showpreview(Boolean showpreview) {
    this.showpreview = showpreview;
    return this;
  }

   /**
   * Show preview before timeopen
   * @return showpreview
  **/
  @javax.annotation.Nullable
  public Boolean getShowpreview() {
    return showpreview;
  }

  public void setShowpreview(Boolean showpreview) {
    this.showpreview = showpreview;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner showresults(Integer showresults) {
    this.showresults = showresults;
    return this;
  }

   /**
   * 0 never, 1 after answer, 2 after close, 3 always
   * @return showresults
  **/
  @javax.annotation.Nullable
  public Integer getShowresults() {
    return showresults;
  }

  public void setShowresults(Integer showresults) {
    this.showresults = showresults;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner showunanswered(Boolean showunanswered) {
    this.showunanswered = showunanswered;
    return this;
  }

   /**
   * Show users who not answered yet
   * @return showunanswered
  **/
  @javax.annotation.Nullable
  public Boolean getShowunanswered() {
    return showunanswered;
  }

  public void setShowunanswered(Boolean showunanswered) {
    this.showunanswered = showunanswered;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner timeclose(Integer timeclose) {
    this.timeclose = timeclose;
    return this;
  }

   /**
   * Date of closing validity
   * @return timeclose
  **/
  @javax.annotation.Nullable
  public Integer getTimeclose() {
    return timeclose;
  }

  public void setTimeclose(Integer timeclose) {
    this.timeclose = timeclose;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * Time of last modification
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner timeopen(Integer timeopen) {
    this.timeopen = timeopen;
    return this;
  }

   /**
   * Date of opening validity
   * @return timeopen
  **/
  @javax.annotation.Nullable
  public Integer getTimeopen() {
    return timeopen;
  }

  public void setTimeopen(Integer timeopen) {
    this.timeopen = timeopen;
  }


  public ModChoiceGetChoicesByCourses200ResponseChoicesInner visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Visible
   * @return visible
  **/
  @javax.annotation.Nullable
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModChoiceGetChoicesByCourses200ResponseChoicesInner modChoiceGetChoicesByCourses200ResponseChoicesInner = (ModChoiceGetChoicesByCourses200ResponseChoicesInner) o;
    return Objects.equals(this.allowmultiple, modChoiceGetChoicesByCourses200ResponseChoicesInner.allowmultiple) &&
        Objects.equals(this.allowupdate, modChoiceGetChoicesByCourses200ResponseChoicesInner.allowupdate) &&
        Objects.equals(this.completionsubmit, modChoiceGetChoicesByCourses200ResponseChoicesInner.completionsubmit) &&
        Objects.equals(this.course, modChoiceGetChoicesByCourses200ResponseChoicesInner.course) &&
        Objects.equals(this.coursemodule, modChoiceGetChoicesByCourses200ResponseChoicesInner.coursemodule) &&
        Objects.equals(this.display, modChoiceGetChoicesByCourses200ResponseChoicesInner.display) &&
        Objects.equals(this.groupingid, modChoiceGetChoicesByCourses200ResponseChoicesInner.groupingid) &&
        Objects.equals(this.groupmode, modChoiceGetChoicesByCourses200ResponseChoicesInner.groupmode) &&
        Objects.equals(this.id, modChoiceGetChoicesByCourses200ResponseChoicesInner.id) &&
        Objects.equals(this.includeinactive, modChoiceGetChoicesByCourses200ResponseChoicesInner.includeinactive) &&
        Objects.equals(this.intro, modChoiceGetChoicesByCourses200ResponseChoicesInner.intro) &&
        Objects.equals(this.introfiles, modChoiceGetChoicesByCourses200ResponseChoicesInner.introfiles) &&
        Objects.equals(this.introformat, modChoiceGetChoicesByCourses200ResponseChoicesInner.introformat) &&
        Objects.equals(this.lang, modChoiceGetChoicesByCourses200ResponseChoicesInner.lang) &&
        Objects.equals(this.limitanswers, modChoiceGetChoicesByCourses200ResponseChoicesInner.limitanswers) &&
        Objects.equals(this.name, modChoiceGetChoicesByCourses200ResponseChoicesInner.name) &&
        Objects.equals(this.publish, modChoiceGetChoicesByCourses200ResponseChoicesInner.publish) &&
        Objects.equals(this.section, modChoiceGetChoicesByCourses200ResponseChoicesInner.section) &&
        Objects.equals(this.showavailable, modChoiceGetChoicesByCourses200ResponseChoicesInner.showavailable) &&
        Objects.equals(this.showpreview, modChoiceGetChoicesByCourses200ResponseChoicesInner.showpreview) &&
        Objects.equals(this.showresults, modChoiceGetChoicesByCourses200ResponseChoicesInner.showresults) &&
        Objects.equals(this.showunanswered, modChoiceGetChoicesByCourses200ResponseChoicesInner.showunanswered) &&
        Objects.equals(this.timeclose, modChoiceGetChoicesByCourses200ResponseChoicesInner.timeclose) &&
        Objects.equals(this.timemodified, modChoiceGetChoicesByCourses200ResponseChoicesInner.timemodified) &&
        Objects.equals(this.timeopen, modChoiceGetChoicesByCourses200ResponseChoicesInner.timeopen) &&
        Objects.equals(this.visible, modChoiceGetChoicesByCourses200ResponseChoicesInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowmultiple, allowupdate, completionsubmit, course, coursemodule, display, groupingid, groupmode, id, includeinactive, intro, introfiles, introformat, lang, limitanswers, name, publish, section, showavailable, showpreview, showresults, showunanswered, timeclose, timemodified, timeopen, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModChoiceGetChoicesByCourses200ResponseChoicesInner {\n");
    sb.append("    allowmultiple: ").append(toIndentedString(allowmultiple)).append("\n");
    sb.append("    allowupdate: ").append(toIndentedString(allowupdate)).append("\n");
    sb.append("    completionsubmit: ").append(toIndentedString(completionsubmit)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    coursemodule: ").append(toIndentedString(coursemodule)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    groupingid: ").append(toIndentedString(groupingid)).append("\n");
    sb.append("    groupmode: ").append(toIndentedString(groupmode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includeinactive: ").append(toIndentedString(includeinactive)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    introfiles: ").append(toIndentedString(introfiles)).append("\n");
    sb.append("    introformat: ").append(toIndentedString(introformat)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    limitanswers: ").append(toIndentedString(limitanswers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    showavailable: ").append(toIndentedString(showavailable)).append("\n");
    sb.append("    showpreview: ").append(toIndentedString(showpreview)).append("\n");
    sb.append("    showresults: ").append(toIndentedString(showresults)).append("\n");
    sb.append("    showunanswered: ").append(toIndentedString(showunanswered)).append("\n");
    sb.append("    timeclose: ").append(toIndentedString(timeclose)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    timeopen: ").append(toIndentedString(timeopen)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
    openapiFields.add("allowmultiple");
    openapiFields.add("allowupdate");
    openapiFields.add("completionsubmit");
    openapiFields.add("course");
    openapiFields.add("coursemodule");
    openapiFields.add("display");
    openapiFields.add("groupingid");
    openapiFields.add("groupmode");
    openapiFields.add("id");
    openapiFields.add("includeinactive");
    openapiFields.add("intro");
    openapiFields.add("introfiles");
    openapiFields.add("introformat");
    openapiFields.add("lang");
    openapiFields.add("limitanswers");
    openapiFields.add("name");
    openapiFields.add("publish");
    openapiFields.add("section");
    openapiFields.add("showavailable");
    openapiFields.add("showpreview");
    openapiFields.add("showresults");
    openapiFields.add("showunanswered");
    openapiFields.add("timeclose");
    openapiFields.add("timemodified");
    openapiFields.add("timeopen");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModChoiceGetChoicesByCourses200ResponseChoicesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModChoiceGetChoicesByCourses200ResponseChoicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModChoiceGetChoicesByCourses200ResponseChoicesInner is not found in the empty JSON string", ModChoiceGetChoicesByCourses200ResponseChoicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModChoiceGetChoicesByCourses200ResponseChoicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModChoiceGetChoicesByCourses200ResponseChoicesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArrayintrofiles.get(i));
          };
        }
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModChoiceGetChoicesByCourses200ResponseChoicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModChoiceGetChoicesByCourses200ResponseChoicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModChoiceGetChoicesByCourses200ResponseChoicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModChoiceGetChoicesByCourses200ResponseChoicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModChoiceGetChoicesByCourses200ResponseChoicesInner>() {
           @Override
           public void write(JsonWriter out, ModChoiceGetChoicesByCourses200ResponseChoicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModChoiceGetChoicesByCourses200ResponseChoicesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModChoiceGetChoicesByCourses200ResponseChoicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModChoiceGetChoicesByCourses200ResponseChoicesInner
  * @throws IOException if the JSON string is invalid with respect to ModChoiceGetChoicesByCourses200ResponseChoicesInner
  */
  public static ModChoiceGetChoicesByCourses200ResponseChoicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModChoiceGetChoicesByCourses200ResponseChoicesInner.class);
  }

 /**
  * Convert an instance of ModChoiceGetChoicesByCourses200ResponseChoicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


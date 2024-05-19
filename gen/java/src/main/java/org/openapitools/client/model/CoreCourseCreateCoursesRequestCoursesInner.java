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
import org.openapitools.client.model.CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner;
import org.openapitools.client.model.CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner;

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
 * CoreCourseCreateCoursesRequestCoursesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseCreateCoursesRequestCoursesInner {
  public static final String SERIALIZED_NAME_CATEGORYID = "categoryid";
  @SerializedName(SERIALIZED_NAME_CATEGORYID)
  private Integer categoryid = null;

  public static final String SERIALIZED_NAME_COMPLETIONNOTIFY = "completionnotify";
  @SerializedName(SERIALIZED_NAME_COMPLETIONNOTIFY)
  private Integer completionnotify = null;

  public static final String SERIALIZED_NAME_COURSEFORMATOPTIONS = "courseformatoptions";
  @SerializedName(SERIALIZED_NAME_COURSEFORMATOPTIONS)
  private List<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner> courseformatoptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUSTOMFIELDS = "customfields";
  @SerializedName(SERIALIZED_NAME_CUSTOMFIELDS)
  private List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULTGROUPINGID = "defaultgroupingid";
  @SerializedName(SERIALIZED_NAME_DEFAULTGROUPINGID)
  private Integer defaultgroupingid = 0;

  public static final String SERIALIZED_NAME_ENABLECOMPLETION = "enablecompletion";
  @SerializedName(SERIALIZED_NAME_ENABLECOMPLETION)
  private Integer enablecompletion = null;

  public static final String SERIALIZED_NAME_ENDDATE = "enddate";
  @SerializedName(SERIALIZED_NAME_ENDDATE)
  private Integer enddate = null;

  public static final String SERIALIZED_NAME_FORCETHEME = "forcetheme";
  @SerializedName(SERIALIZED_NAME_FORCETHEME)
  private String forcetheme = "null";

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = "topics";

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname = "null";

  public static final String SERIALIZED_NAME_GROUPMODE = "groupmode";
  @SerializedName(SERIALIZED_NAME_GROUPMODE)
  private Integer groupmode = 0;

  public static final String SERIALIZED_NAME_GROUPMODEFORCE = "groupmodeforce";
  @SerializedName(SERIALIZED_NAME_GROUPMODEFORCE)
  private Integer groupmodeforce = 0;

  public static final String SERIALIZED_NAME_HIDDENSECTIONS = "hiddensections";
  @SerializedName(SERIALIZED_NAME_HIDDENSECTIONS)
  private Integer hiddensections = null;

  public static final String SERIALIZED_NAME_IDNUMBER = "idnumber";
  @SerializedName(SERIALIZED_NAME_IDNUMBER)
  private String idnumber = "null";

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang = "null";

  public static final String SERIALIZED_NAME_MAXBYTES = "maxbytes";
  @SerializedName(SERIALIZED_NAME_MAXBYTES)
  private Integer maxbytes = 0;

  public static final String SERIALIZED_NAME_NEWSITEMS = "newsitems";
  @SerializedName(SERIALIZED_NAME_NEWSITEMS)
  private Integer newsitems = 5;

  public static final String SERIALIZED_NAME_NUMSECTIONS = "numsections";
  @SerializedName(SERIALIZED_NAME_NUMSECTIONS)
  private Integer numsections = null;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname = "null";

  public static final String SERIALIZED_NAME_SHOWGRADES = "showgrades";
  @SerializedName(SERIALIZED_NAME_SHOWGRADES)
  private Integer showgrades = 1;

  public static final String SERIALIZED_NAME_SHOWREPORTS = "showreports";
  @SerializedName(SERIALIZED_NAME_SHOWREPORTS)
  private Integer showreports = 0;

  public static final String SERIALIZED_NAME_STARTDATE = "startdate";
  @SerializedName(SERIALIZED_NAME_STARTDATE)
  private Integer startdate = null;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_SUMMARYFORMAT = "summaryformat";
  @SerializedName(SERIALIZED_NAME_SUMMARYFORMAT)
  private Integer summaryformat = 1;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Integer visible = null;

  public CoreCourseCreateCoursesRequestCoursesInner() {
  }

  public CoreCourseCreateCoursesRequestCoursesInner categoryid(Integer categoryid) {
    this.categoryid = categoryid;
    return this;
  }

   /**
   * category id
   * @return categoryid
  **/
  @javax.annotation.Nullable
  public Integer getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(Integer categoryid) {
    this.categoryid = categoryid;
  }


  public CoreCourseCreateCoursesRequestCoursesInner completionnotify(Integer completionnotify) {
    this.completionnotify = completionnotify;
    return this;
  }

   /**
   * 1: yes 0: no
   * @return completionnotify
  **/
  @javax.annotation.Nullable
  public Integer getCompletionnotify() {
    return completionnotify;
  }

  public void setCompletionnotify(Integer completionnotify) {
    this.completionnotify = completionnotify;
  }


  public CoreCourseCreateCoursesRequestCoursesInner courseformatoptions(List<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner> courseformatoptions) {
    this.courseformatoptions = courseformatoptions;
    return this;
  }

  public CoreCourseCreateCoursesRequestCoursesInner addCourseformatoptionsItem(CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner courseformatoptionsItem) {
    if (this.courseformatoptions == null) {
      this.courseformatoptions = new ArrayList<>();
    }
    this.courseformatoptions.add(courseformatoptionsItem);
    return this;
  }

   /**
   * Get courseformatoptions
   * @return courseformatoptions
  **/
  @javax.annotation.Nullable
  public List<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner> getCourseformatoptions() {
    return courseformatoptions;
  }

  public void setCourseformatoptions(List<CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner> courseformatoptions) {
    this.courseformatoptions = courseformatoptions;
  }


  public CoreCourseCreateCoursesRequestCoursesInner customfields(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields) {
    this.customfields = customfields;
    return this;
  }

  public CoreCourseCreateCoursesRequestCoursesInner addCustomfieldsItem(CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner customfieldsItem) {
    if (this.customfields == null) {
      this.customfields = new ArrayList<>();
    }
    this.customfields.add(customfieldsItem);
    return this;
  }

   /**
   * Get customfields
   * @return customfields
  **/
  @javax.annotation.Nullable
  public List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> getCustomfields() {
    return customfields;
  }

  public void setCustomfields(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields) {
    this.customfields = customfields;
  }


  public CoreCourseCreateCoursesRequestCoursesInner defaultgroupingid(Integer defaultgroupingid) {
    this.defaultgroupingid = defaultgroupingid;
    return this;
  }

   /**
   * default grouping id
   * @return defaultgroupingid
  **/
  @javax.annotation.Nullable
  public Integer getDefaultgroupingid() {
    return defaultgroupingid;
  }

  public void setDefaultgroupingid(Integer defaultgroupingid) {
    this.defaultgroupingid = defaultgroupingid;
  }


  public CoreCourseCreateCoursesRequestCoursesInner enablecompletion(Integer enablecompletion) {
    this.enablecompletion = enablecompletion;
    return this;
  }

   /**
   * Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings.
   * @return enablecompletion
  **/
  @javax.annotation.Nullable
  public Integer getEnablecompletion() {
    return enablecompletion;
  }

  public void setEnablecompletion(Integer enablecompletion) {
    this.enablecompletion = enablecompletion;
  }


  public CoreCourseCreateCoursesRequestCoursesInner enddate(Integer enddate) {
    this.enddate = enddate;
    return this;
  }

   /**
   * timestamp when the course end
   * @return enddate
  **/
  @javax.annotation.Nullable
  public Integer getEnddate() {
    return enddate;
  }

  public void setEnddate(Integer enddate) {
    this.enddate = enddate;
  }


  public CoreCourseCreateCoursesRequestCoursesInner forcetheme(String forcetheme) {
    this.forcetheme = forcetheme;
    return this;
  }

   /**
   * name of the force theme
   * @return forcetheme
  **/
  @javax.annotation.Nullable
  public String getForcetheme() {
    return forcetheme;
  }

  public void setForcetheme(String forcetheme) {
    this.forcetheme = forcetheme;
  }


  public CoreCourseCreateCoursesRequestCoursesInner format(String format) {
    this.format = format;
    return this;
  }

   /**
   * course format: weeks, topics, social, site,..
   * @return format
  **/
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public CoreCourseCreateCoursesRequestCoursesInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * full name
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public CoreCourseCreateCoursesRequestCoursesInner groupmode(Integer groupmode) {
    this.groupmode = groupmode;
    return this;
  }

   /**
   * no group, separate, visible
   * @return groupmode
  **/
  @javax.annotation.Nullable
  public Integer getGroupmode() {
    return groupmode;
  }

  public void setGroupmode(Integer groupmode) {
    this.groupmode = groupmode;
  }


  public CoreCourseCreateCoursesRequestCoursesInner groupmodeforce(Integer groupmodeforce) {
    this.groupmodeforce = groupmodeforce;
    return this;
  }

   /**
   * 1: yes, 0: no
   * @return groupmodeforce
  **/
  @javax.annotation.Nullable
  public Integer getGroupmodeforce() {
    return groupmodeforce;
  }

  public void setGroupmodeforce(Integer groupmodeforce) {
    this.groupmodeforce = groupmodeforce;
  }


  public CoreCourseCreateCoursesRequestCoursesInner hiddensections(Integer hiddensections) {
    this.hiddensections = hiddensections;
    return this;
  }

   /**
   * (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students
   * @return hiddensections
  **/
  @javax.annotation.Nullable
  public Integer getHiddensections() {
    return hiddensections;
  }

  public void setHiddensections(Integer hiddensections) {
    this.hiddensections = hiddensections;
  }


  public CoreCourseCreateCoursesRequestCoursesInner idnumber(String idnumber) {
    this.idnumber = idnumber;
    return this;
  }

   /**
   * id number
   * @return idnumber
  **/
  @javax.annotation.Nullable
  public String getIdnumber() {
    return idnumber;
  }

  public void setIdnumber(String idnumber) {
    this.idnumber = idnumber;
  }


  public CoreCourseCreateCoursesRequestCoursesInner lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * forced course language
   * @return lang
  **/
  @javax.annotation.Nullable
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  public CoreCourseCreateCoursesRequestCoursesInner maxbytes(Integer maxbytes) {
    this.maxbytes = maxbytes;
    return this;
  }

   /**
   * largest size of file that can be uploaded into the course
   * @return maxbytes
  **/
  @javax.annotation.Nullable
  public Integer getMaxbytes() {
    return maxbytes;
  }

  public void setMaxbytes(Integer maxbytes) {
    this.maxbytes = maxbytes;
  }


  public CoreCourseCreateCoursesRequestCoursesInner newsitems(Integer newsitems) {
    this.newsitems = newsitems;
    return this;
  }

   /**
   * number of recent items appearing on the course page
   * @return newsitems
  **/
  @javax.annotation.Nullable
  public Integer getNewsitems() {
    return newsitems;
  }

  public void setNewsitems(Integer newsitems) {
    this.newsitems = newsitems;
  }


  public CoreCourseCreateCoursesRequestCoursesInner numsections(Integer numsections) {
    this.numsections = numsections;
    return this;
  }

   /**
   * (deprecated, use courseformatoptions) number of weeks/topics
   * @return numsections
  **/
  @javax.annotation.Nullable
  public Integer getNumsections() {
    return numsections;
  }

  public void setNumsections(Integer numsections) {
    this.numsections = numsections;
  }


  public CoreCourseCreateCoursesRequestCoursesInner shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * course short name
   * @return shortname
  **/
  @javax.annotation.Nullable
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public CoreCourseCreateCoursesRequestCoursesInner showgrades(Integer showgrades) {
    this.showgrades = showgrades;
    return this;
  }

   /**
   * 1 if grades are shown, otherwise 0
   * @return showgrades
  **/
  @javax.annotation.Nullable
  public Integer getShowgrades() {
    return showgrades;
  }

  public void setShowgrades(Integer showgrades) {
    this.showgrades = showgrades;
  }


  public CoreCourseCreateCoursesRequestCoursesInner showreports(Integer showreports) {
    this.showreports = showreports;
    return this;
  }

   /**
   * are activity report shown (yes &#x3D; 1, no &#x3D;0)
   * @return showreports
  **/
  @javax.annotation.Nullable
  public Integer getShowreports() {
    return showreports;
  }

  public void setShowreports(Integer showreports) {
    this.showreports = showreports;
  }


  public CoreCourseCreateCoursesRequestCoursesInner startdate(Integer startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * timestamp when the course start
   * @return startdate
  **/
  @javax.annotation.Nullable
  public Integer getStartdate() {
    return startdate;
  }

  public void setStartdate(Integer startdate) {
    this.startdate = startdate;
  }


  public CoreCourseCreateCoursesRequestCoursesInner summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public CoreCourseCreateCoursesRequestCoursesInner summaryformat(Integer summaryformat) {
    this.summaryformat = summaryformat;
    return this;
  }

   /**
   * summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return summaryformat
  **/
  @javax.annotation.Nullable
  public Integer getSummaryformat() {
    return summaryformat;
  }

  public void setSummaryformat(Integer summaryformat) {
    this.summaryformat = summaryformat;
  }


  public CoreCourseCreateCoursesRequestCoursesInner visible(Integer visible) {
    this.visible = visible;
    return this;
  }

   /**
   * 1: available to student, 0:not available
   * @return visible
  **/
  @javax.annotation.Nullable
  public Integer getVisible() {
    return visible;
  }

  public void setVisible(Integer visible) {
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
    CoreCourseCreateCoursesRequestCoursesInner coreCourseCreateCoursesRequestCoursesInner = (CoreCourseCreateCoursesRequestCoursesInner) o;
    return Objects.equals(this.categoryid, coreCourseCreateCoursesRequestCoursesInner.categoryid) &&
        Objects.equals(this.completionnotify, coreCourseCreateCoursesRequestCoursesInner.completionnotify) &&
        Objects.equals(this.courseformatoptions, coreCourseCreateCoursesRequestCoursesInner.courseformatoptions) &&
        Objects.equals(this.customfields, coreCourseCreateCoursesRequestCoursesInner.customfields) &&
        Objects.equals(this.defaultgroupingid, coreCourseCreateCoursesRequestCoursesInner.defaultgroupingid) &&
        Objects.equals(this.enablecompletion, coreCourseCreateCoursesRequestCoursesInner.enablecompletion) &&
        Objects.equals(this.enddate, coreCourseCreateCoursesRequestCoursesInner.enddate) &&
        Objects.equals(this.forcetheme, coreCourseCreateCoursesRequestCoursesInner.forcetheme) &&
        Objects.equals(this.format, coreCourseCreateCoursesRequestCoursesInner.format) &&
        Objects.equals(this.fullname, coreCourseCreateCoursesRequestCoursesInner.fullname) &&
        Objects.equals(this.groupmode, coreCourseCreateCoursesRequestCoursesInner.groupmode) &&
        Objects.equals(this.groupmodeforce, coreCourseCreateCoursesRequestCoursesInner.groupmodeforce) &&
        Objects.equals(this.hiddensections, coreCourseCreateCoursesRequestCoursesInner.hiddensections) &&
        Objects.equals(this.idnumber, coreCourseCreateCoursesRequestCoursesInner.idnumber) &&
        Objects.equals(this.lang, coreCourseCreateCoursesRequestCoursesInner.lang) &&
        Objects.equals(this.maxbytes, coreCourseCreateCoursesRequestCoursesInner.maxbytes) &&
        Objects.equals(this.newsitems, coreCourseCreateCoursesRequestCoursesInner.newsitems) &&
        Objects.equals(this.numsections, coreCourseCreateCoursesRequestCoursesInner.numsections) &&
        Objects.equals(this.shortname, coreCourseCreateCoursesRequestCoursesInner.shortname) &&
        Objects.equals(this.showgrades, coreCourseCreateCoursesRequestCoursesInner.showgrades) &&
        Objects.equals(this.showreports, coreCourseCreateCoursesRequestCoursesInner.showreports) &&
        Objects.equals(this.startdate, coreCourseCreateCoursesRequestCoursesInner.startdate) &&
        Objects.equals(this.summary, coreCourseCreateCoursesRequestCoursesInner.summary) &&
        Objects.equals(this.summaryformat, coreCourseCreateCoursesRequestCoursesInner.summaryformat) &&
        Objects.equals(this.visible, coreCourseCreateCoursesRequestCoursesInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryid, completionnotify, courseformatoptions, customfields, defaultgroupingid, enablecompletion, enddate, forcetheme, format, fullname, groupmode, groupmodeforce, hiddensections, idnumber, lang, maxbytes, newsitems, numsections, shortname, showgrades, showreports, startdate, summary, summaryformat, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseCreateCoursesRequestCoursesInner {\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    completionnotify: ").append(toIndentedString(completionnotify)).append("\n");
    sb.append("    courseformatoptions: ").append(toIndentedString(courseformatoptions)).append("\n");
    sb.append("    customfields: ").append(toIndentedString(customfields)).append("\n");
    sb.append("    defaultgroupingid: ").append(toIndentedString(defaultgroupingid)).append("\n");
    sb.append("    enablecompletion: ").append(toIndentedString(enablecompletion)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
    sb.append("    forcetheme: ").append(toIndentedString(forcetheme)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    groupmode: ").append(toIndentedString(groupmode)).append("\n");
    sb.append("    groupmodeforce: ").append(toIndentedString(groupmodeforce)).append("\n");
    sb.append("    hiddensections: ").append(toIndentedString(hiddensections)).append("\n");
    sb.append("    idnumber: ").append(toIndentedString(idnumber)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    maxbytes: ").append(toIndentedString(maxbytes)).append("\n");
    sb.append("    newsitems: ").append(toIndentedString(newsitems)).append("\n");
    sb.append("    numsections: ").append(toIndentedString(numsections)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    showgrades: ").append(toIndentedString(showgrades)).append("\n");
    sb.append("    showreports: ").append(toIndentedString(showreports)).append("\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    summaryformat: ").append(toIndentedString(summaryformat)).append("\n");
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
    openapiFields.add("categoryid");
    openapiFields.add("completionnotify");
    openapiFields.add("courseformatoptions");
    openapiFields.add("customfields");
    openapiFields.add("defaultgroupingid");
    openapiFields.add("enablecompletion");
    openapiFields.add("enddate");
    openapiFields.add("forcetheme");
    openapiFields.add("format");
    openapiFields.add("fullname");
    openapiFields.add("groupmode");
    openapiFields.add("groupmodeforce");
    openapiFields.add("hiddensections");
    openapiFields.add("idnumber");
    openapiFields.add("lang");
    openapiFields.add("maxbytes");
    openapiFields.add("newsitems");
    openapiFields.add("numsections");
    openapiFields.add("shortname");
    openapiFields.add("showgrades");
    openapiFields.add("showreports");
    openapiFields.add("startdate");
    openapiFields.add("summary");
    openapiFields.add("summaryformat");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseCreateCoursesRequestCoursesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseCreateCoursesRequestCoursesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseCreateCoursesRequestCoursesInner is not found in the empty JSON string", CoreCourseCreateCoursesRequestCoursesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseCreateCoursesRequestCoursesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseCreateCoursesRequestCoursesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("courseformatoptions") != null && !jsonObj.get("courseformatoptions").isJsonNull()) {
        JsonArray jsonArraycourseformatoptions = jsonObj.getAsJsonArray("courseformatoptions");
        if (jsonArraycourseformatoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("courseformatoptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `courseformatoptions` to be an array in the JSON string but got `%s`", jsonObj.get("courseformatoptions").toString()));
          }

          // validate the optional field `courseformatoptions` (array)
          for (int i = 0; i < jsonArraycourseformatoptions.size(); i++) {
            CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner.validateJsonElement(jsonArraycourseformatoptions.get(i));
          };
        }
      }
      if (jsonObj.get("customfields") != null && !jsonObj.get("customfields").isJsonNull()) {
        JsonArray jsonArraycustomfields = jsonObj.getAsJsonArray("customfields");
        if (jsonArraycustomfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customfields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customfields` to be an array in the JSON string but got `%s`", jsonObj.get("customfields").toString()));
          }

          // validate the optional field `customfields` (array)
          for (int i = 0; i < jsonArraycustomfields.size(); i++) {
            CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.validateJsonElement(jsonArraycustomfields.get(i));
          };
        }
      }
      if ((jsonObj.get("forcetheme") != null && !jsonObj.get("forcetheme").isJsonNull()) && !jsonObj.get("forcetheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forcetheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forcetheme").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if ((jsonObj.get("idnumber") != null && !jsonObj.get("idnumber").isJsonNull()) && !jsonObj.get("idnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idnumber").toString()));
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseCreateCoursesRequestCoursesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseCreateCoursesRequestCoursesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseCreateCoursesRequestCoursesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseCreateCoursesRequestCoursesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseCreateCoursesRequestCoursesInner>() {
           @Override
           public void write(JsonWriter out, CoreCourseCreateCoursesRequestCoursesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseCreateCoursesRequestCoursesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseCreateCoursesRequestCoursesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseCreateCoursesRequestCoursesInner
  * @throws IOException if the JSON string is invalid with respect to CoreCourseCreateCoursesRequestCoursesInner
  */
  public static CoreCourseCreateCoursesRequestCoursesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseCreateCoursesRequestCoursesInner.class);
  }

 /**
  * Convert an instance of CoreCourseCreateCoursesRequestCoursesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


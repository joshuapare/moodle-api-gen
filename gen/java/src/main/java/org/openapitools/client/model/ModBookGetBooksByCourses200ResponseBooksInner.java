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
 * Books
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModBookGetBooksByCourses200ResponseBooksInner {
  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Integer course;

  public static final String SERIALIZED_NAME_COURSEMODULE = "coursemodule";
  @SerializedName(SERIALIZED_NAME_COURSEMODULE)
  private Integer coursemodule;

  public static final String SERIALIZED_NAME_CUSTOMTITLES = "customtitles";
  @SerializedName(SERIALIZED_NAME_CUSTOMTITLES)
  private Integer customtitles = null;

  public static final String SERIALIZED_NAME_GROUPINGID = "groupingid";
  @SerializedName(SERIALIZED_NAME_GROUPINGID)
  private Integer groupingid;

  public static final String SERIALIZED_NAME_GROUPMODE = "groupmode";
  @SerializedName(SERIALIZED_NAME_GROUPMODE)
  private Integer groupmode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAVSTYLE = "navstyle";
  @SerializedName(SERIALIZED_NAME_NAVSTYLE)
  private Integer navstyle = null;

  public static final String SERIALIZED_NAME_NUMBERING = "numbering";
  @SerializedName(SERIALIZED_NAME_NUMBERING)
  private Integer numbering = null;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision = null;

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private Integer section;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public ModBookGetBooksByCourses200ResponseBooksInner() {
  }

  public ModBookGetBooksByCourses200ResponseBooksInner course(Integer course) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner coursemodule(Integer coursemodule) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner customtitles(Integer customtitles) {
    this.customtitles = customtitles;
    return this;
  }

   /**
   * Book custom titles type
   * @return customtitles
  **/
  @javax.annotation.Nullable
  public Integer getCustomtitles() {
    return customtitles;
  }

  public void setCustomtitles(Integer customtitles) {
    this.customtitles = customtitles;
  }


  public ModBookGetBooksByCourses200ResponseBooksInner groupingid(Integer groupingid) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner groupmode(Integer groupmode) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner id(Integer id) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner intro(String intro) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner introfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles) {
    this.introfiles = introfiles;
    return this;
  }

  public ModBookGetBooksByCourses200ResponseBooksInner addIntrofilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner introfilesItem) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner introformat(Integer introformat) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner lang(String lang) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner name(String name) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner navstyle(Integer navstyle) {
    this.navstyle = navstyle;
    return this;
  }

   /**
   * Book navigation style configuration
   * @return navstyle
  **/
  @javax.annotation.Nullable
  public Integer getNavstyle() {
    return navstyle;
  }

  public void setNavstyle(Integer navstyle) {
    this.navstyle = navstyle;
  }


  public ModBookGetBooksByCourses200ResponseBooksInner numbering(Integer numbering) {
    this.numbering = numbering;
    return this;
  }

   /**
   * Book numbering configuration
   * @return numbering
  **/
  @javax.annotation.Nullable
  public Integer getNumbering() {
    return numbering;
  }

  public void setNumbering(Integer numbering) {
    this.numbering = numbering;
  }


  public ModBookGetBooksByCourses200ResponseBooksInner revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Book revision
   * @return revision
  **/
  @javax.annotation.Nullable
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public ModBookGetBooksByCourses200ResponseBooksInner section(Integer section) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * Time of creation
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModBookGetBooksByCourses200ResponseBooksInner timemodified(Integer timemodified) {
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


  public ModBookGetBooksByCourses200ResponseBooksInner visible(Boolean visible) {
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
    ModBookGetBooksByCourses200ResponseBooksInner modBookGetBooksByCourses200ResponseBooksInner = (ModBookGetBooksByCourses200ResponseBooksInner) o;
    return Objects.equals(this.course, modBookGetBooksByCourses200ResponseBooksInner.course) &&
        Objects.equals(this.coursemodule, modBookGetBooksByCourses200ResponseBooksInner.coursemodule) &&
        Objects.equals(this.customtitles, modBookGetBooksByCourses200ResponseBooksInner.customtitles) &&
        Objects.equals(this.groupingid, modBookGetBooksByCourses200ResponseBooksInner.groupingid) &&
        Objects.equals(this.groupmode, modBookGetBooksByCourses200ResponseBooksInner.groupmode) &&
        Objects.equals(this.id, modBookGetBooksByCourses200ResponseBooksInner.id) &&
        Objects.equals(this.intro, modBookGetBooksByCourses200ResponseBooksInner.intro) &&
        Objects.equals(this.introfiles, modBookGetBooksByCourses200ResponseBooksInner.introfiles) &&
        Objects.equals(this.introformat, modBookGetBooksByCourses200ResponseBooksInner.introformat) &&
        Objects.equals(this.lang, modBookGetBooksByCourses200ResponseBooksInner.lang) &&
        Objects.equals(this.name, modBookGetBooksByCourses200ResponseBooksInner.name) &&
        Objects.equals(this.navstyle, modBookGetBooksByCourses200ResponseBooksInner.navstyle) &&
        Objects.equals(this.numbering, modBookGetBooksByCourses200ResponseBooksInner.numbering) &&
        Objects.equals(this.revision, modBookGetBooksByCourses200ResponseBooksInner.revision) &&
        Objects.equals(this.section, modBookGetBooksByCourses200ResponseBooksInner.section) &&
        Objects.equals(this.timecreated, modBookGetBooksByCourses200ResponseBooksInner.timecreated) &&
        Objects.equals(this.timemodified, modBookGetBooksByCourses200ResponseBooksInner.timemodified) &&
        Objects.equals(this.visible, modBookGetBooksByCourses200ResponseBooksInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, coursemodule, customtitles, groupingid, groupmode, id, intro, introfiles, introformat, lang, name, navstyle, numbering, revision, section, timecreated, timemodified, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModBookGetBooksByCourses200ResponseBooksInner {\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    coursemodule: ").append(toIndentedString(coursemodule)).append("\n");
    sb.append("    customtitles: ").append(toIndentedString(customtitles)).append("\n");
    sb.append("    groupingid: ").append(toIndentedString(groupingid)).append("\n");
    sb.append("    groupmode: ").append(toIndentedString(groupmode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    introfiles: ").append(toIndentedString(introfiles)).append("\n");
    sb.append("    introformat: ").append(toIndentedString(introformat)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    navstyle: ").append(toIndentedString(navstyle)).append("\n");
    sb.append("    numbering: ").append(toIndentedString(numbering)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
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
    openapiFields.add("course");
    openapiFields.add("coursemodule");
    openapiFields.add("customtitles");
    openapiFields.add("groupingid");
    openapiFields.add("groupmode");
    openapiFields.add("id");
    openapiFields.add("intro");
    openapiFields.add("introfiles");
    openapiFields.add("introformat");
    openapiFields.add("lang");
    openapiFields.add("name");
    openapiFields.add("navstyle");
    openapiFields.add("numbering");
    openapiFields.add("revision");
    openapiFields.add("section");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModBookGetBooksByCourses200ResponseBooksInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModBookGetBooksByCourses200ResponseBooksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModBookGetBooksByCourses200ResponseBooksInner is not found in the empty JSON string", ModBookGetBooksByCourses200ResponseBooksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModBookGetBooksByCourses200ResponseBooksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModBookGetBooksByCourses200ResponseBooksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!ModBookGetBooksByCourses200ResponseBooksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModBookGetBooksByCourses200ResponseBooksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModBookGetBooksByCourses200ResponseBooksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModBookGetBooksByCourses200ResponseBooksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModBookGetBooksByCourses200ResponseBooksInner>() {
           @Override
           public void write(JsonWriter out, ModBookGetBooksByCourses200ResponseBooksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModBookGetBooksByCourses200ResponseBooksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModBookGetBooksByCourses200ResponseBooksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModBookGetBooksByCourses200ResponseBooksInner
  * @throws IOException if the JSON string is invalid with respect to ModBookGetBooksByCourses200ResponseBooksInner
  */
  public static ModBookGetBooksByCourses200ResponseBooksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModBookGetBooksByCourses200ResponseBooksInner.class);
  }

 /**
  * Convert an instance of ModBookGetBooksByCourses200ResponseBooksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner {
  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Integer course;

  public static final String SERIALIZED_NAME_COURSEMODULE = "coursemodule";
  @SerializedName(SERIALIZED_NAME_COURSEMODULE)
  private Integer coursemodule = null;

  public static final String SERIALIZED_NAME_GROUPINGID = "groupingid";
  @SerializedName(SERIALIZED_NAME_GROUPINGID)
  private Integer groupingid = null;

  public static final String SERIALIZED_NAME_GROUPMODE = "groupmode";
  @SerializedName(SERIALIZED_NAME_GROUPMODE)
  private Integer groupmode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_INTRO = "intro";
  @SerializedName(SERIALIZED_NAME_INTRO)
  private String intro = "null";

  public static final String SERIALIZED_NAME_INTROFILES = "introfiles";
  @SerializedName(SERIALIZED_NAME_INTROFILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTROFORMAT = "introformat";
  @SerializedName(SERIALIZED_NAME_INTROFORMAT)
  private Integer introformat;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang = "null";

  public static final String SERIALIZED_NAME_MEETINGID = "meetingid";
  @SerializedName(SERIALIZED_NAME_MEETINGID)
  private String meetingid = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private Integer section = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible = null;

  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner() {
  }

  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner course(Integer course) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner coursemodule(Integer coursemodule) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner groupingid(Integer groupingid) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner groupmode(Integer groupmode) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner id(Integer id) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner intro(String intro) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner introfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles) {
    this.introfiles = introfiles;
    return this;
  }

  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner addIntrofilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner introfilesItem) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner introformat(Integer introformat) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner lang(String lang) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner meetingid(String meetingid) {
    this.meetingid = meetingid;
    return this;
  }

   /**
   * Meeting id
   * @return meetingid
  **/
  @javax.annotation.Nullable
  public String getMeetingid() {
    return meetingid;
  }

  public void setMeetingid(String meetingid) {
    this.meetingid = meetingid;
  }


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner name(String name) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner section(Integer section) {
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


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * Last time the instance was modified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner visible(Boolean visible) {
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
    ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner = (ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner) o;
    return Objects.equals(this.course, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.course) &&
        Objects.equals(this.coursemodule, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.coursemodule) &&
        Objects.equals(this.groupingid, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.groupingid) &&
        Objects.equals(this.groupmode, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.groupmode) &&
        Objects.equals(this.id, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.id) &&
        Objects.equals(this.intro, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.intro) &&
        Objects.equals(this.introfiles, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.introfiles) &&
        Objects.equals(this.introformat, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.introformat) &&
        Objects.equals(this.lang, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.lang) &&
        Objects.equals(this.meetingid, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.meetingid) &&
        Objects.equals(this.name, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.name) &&
        Objects.equals(this.section, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.section) &&
        Objects.equals(this.timemodified, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.timemodified) &&
        Objects.equals(this.visible, modBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, coursemodule, groupingid, groupmode, id, intro, introfiles, introformat, lang, meetingid, name, section, timemodified, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner {\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    coursemodule: ").append(toIndentedString(coursemodule)).append("\n");
    sb.append("    groupingid: ").append(toIndentedString(groupingid)).append("\n");
    sb.append("    groupmode: ").append(toIndentedString(groupmode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    introfiles: ").append(toIndentedString(introfiles)).append("\n");
    sb.append("    introformat: ").append(toIndentedString(introformat)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    meetingid: ").append(toIndentedString(meetingid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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
    openapiFields.add("groupingid");
    openapiFields.add("groupmode");
    openapiFields.add("id");
    openapiFields.add("intro");
    openapiFields.add("introfiles");
    openapiFields.add("introformat");
    openapiFields.add("lang");
    openapiFields.add("meetingid");
    openapiFields.add("name");
    openapiFields.add("section");
    openapiFields.add("timemodified");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner is not found in the empty JSON string", ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("meetingid") != null && !jsonObj.get("meetingid").isJsonNull()) && !jsonObj.get("meetingid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meetingid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meetingid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner>() {
           @Override
           public void write(JsonWriter out, ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner
  * @throws IOException if the JSON string is invalid with respect to ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner
  */
  public static ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.class);
  }

 /**
  * Convert an instance of ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

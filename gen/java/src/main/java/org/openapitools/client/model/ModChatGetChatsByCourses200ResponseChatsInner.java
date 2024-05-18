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
 * Chats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModChatGetChatsByCourses200ResponseChatsInner {
  public static final String SERIALIZED_NAME_CHATMETHOD = "chatmethod";
  @SerializedName(SERIALIZED_NAME_CHATMETHOD)
  private String chatmethod = "null";

  public static final String SERIALIZED_NAME_CHATTIME = "chattime";
  @SerializedName(SERIALIZED_NAME_CHATTIME)
  private Integer chattime = null;

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Integer course;

  public static final String SERIALIZED_NAME_COURSEMODULE = "coursemodule";
  @SerializedName(SERIALIZED_NAME_COURSEMODULE)
  private Integer coursemodule;

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

  public static final String SERIALIZED_NAME_KEEPDAYS = "keepdays";
  @SerializedName(SERIALIZED_NAME_KEEPDAYS)
  private Integer keepdays = null;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private Integer schedule = null;

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private Integer section;

  public static final String SERIALIZED_NAME_STUDENTLOGS = "studentlogs";
  @SerializedName(SERIALIZED_NAME_STUDENTLOGS)
  private Integer studentlogs = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public ModChatGetChatsByCourses200ResponseChatsInner() {
  }

  public ModChatGetChatsByCourses200ResponseChatsInner chatmethod(String chatmethod) {
    this.chatmethod = chatmethod;
    return this;
  }

   /**
   * chat method (sockets, ajax, header_js)
   * @return chatmethod
  **/
  @javax.annotation.Nullable
  public String getChatmethod() {
    return chatmethod;
  }

  public void setChatmethod(String chatmethod) {
    this.chatmethod = chatmethod;
  }


  public ModChatGetChatsByCourses200ResponseChatsInner chattime(Integer chattime) {
    this.chattime = chattime;
    return this;
  }

   /**
   * chat time
   * @return chattime
  **/
  @javax.annotation.Nullable
  public Integer getChattime() {
    return chattime;
  }

  public void setChattime(Integer chattime) {
    this.chattime = chattime;
  }


  public ModChatGetChatsByCourses200ResponseChatsInner course(Integer course) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner coursemodule(Integer coursemodule) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner groupingid(Integer groupingid) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner groupmode(Integer groupmode) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner id(Integer id) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner intro(String intro) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner introfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles) {
    this.introfiles = introfiles;
    return this;
  }

  public ModChatGetChatsByCourses200ResponseChatsInner addIntrofilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner introfilesItem) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner introformat(Integer introformat) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner keepdays(Integer keepdays) {
    this.keepdays = keepdays;
    return this;
  }

   /**
   * keep days
   * @return keepdays
  **/
  @javax.annotation.Nullable
  public Integer getKeepdays() {
    return keepdays;
  }

  public void setKeepdays(Integer keepdays) {
    this.keepdays = keepdays;
  }


  public ModChatGetChatsByCourses200ResponseChatsInner lang(String lang) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner name(String name) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * schedule type
   * @return schedule
  **/
  @javax.annotation.Nullable
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }


  public ModChatGetChatsByCourses200ResponseChatsInner section(Integer section) {
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


  public ModChatGetChatsByCourses200ResponseChatsInner studentlogs(Integer studentlogs) {
    this.studentlogs = studentlogs;
    return this;
  }

   /**
   * student logs visible to everyone
   * @return studentlogs
  **/
  @javax.annotation.Nullable
  public Integer getStudentlogs() {
    return studentlogs;
  }

  public void setStudentlogs(Integer studentlogs) {
    this.studentlogs = studentlogs;
  }


  public ModChatGetChatsByCourses200ResponseChatsInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * time of last modification
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModChatGetChatsByCourses200ResponseChatsInner visible(Boolean visible) {
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
    ModChatGetChatsByCourses200ResponseChatsInner modChatGetChatsByCourses200ResponseChatsInner = (ModChatGetChatsByCourses200ResponseChatsInner) o;
    return Objects.equals(this.chatmethod, modChatGetChatsByCourses200ResponseChatsInner.chatmethod) &&
        Objects.equals(this.chattime, modChatGetChatsByCourses200ResponseChatsInner.chattime) &&
        Objects.equals(this.course, modChatGetChatsByCourses200ResponseChatsInner.course) &&
        Objects.equals(this.coursemodule, modChatGetChatsByCourses200ResponseChatsInner.coursemodule) &&
        Objects.equals(this.groupingid, modChatGetChatsByCourses200ResponseChatsInner.groupingid) &&
        Objects.equals(this.groupmode, modChatGetChatsByCourses200ResponseChatsInner.groupmode) &&
        Objects.equals(this.id, modChatGetChatsByCourses200ResponseChatsInner.id) &&
        Objects.equals(this.intro, modChatGetChatsByCourses200ResponseChatsInner.intro) &&
        Objects.equals(this.introfiles, modChatGetChatsByCourses200ResponseChatsInner.introfiles) &&
        Objects.equals(this.introformat, modChatGetChatsByCourses200ResponseChatsInner.introformat) &&
        Objects.equals(this.keepdays, modChatGetChatsByCourses200ResponseChatsInner.keepdays) &&
        Objects.equals(this.lang, modChatGetChatsByCourses200ResponseChatsInner.lang) &&
        Objects.equals(this.name, modChatGetChatsByCourses200ResponseChatsInner.name) &&
        Objects.equals(this.schedule, modChatGetChatsByCourses200ResponseChatsInner.schedule) &&
        Objects.equals(this.section, modChatGetChatsByCourses200ResponseChatsInner.section) &&
        Objects.equals(this.studentlogs, modChatGetChatsByCourses200ResponseChatsInner.studentlogs) &&
        Objects.equals(this.timemodified, modChatGetChatsByCourses200ResponseChatsInner.timemodified) &&
        Objects.equals(this.visible, modChatGetChatsByCourses200ResponseChatsInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatmethod, chattime, course, coursemodule, groupingid, groupmode, id, intro, introfiles, introformat, keepdays, lang, name, schedule, section, studentlogs, timemodified, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModChatGetChatsByCourses200ResponseChatsInner {\n");
    sb.append("    chatmethod: ").append(toIndentedString(chatmethod)).append("\n");
    sb.append("    chattime: ").append(toIndentedString(chattime)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    coursemodule: ").append(toIndentedString(coursemodule)).append("\n");
    sb.append("    groupingid: ").append(toIndentedString(groupingid)).append("\n");
    sb.append("    groupmode: ").append(toIndentedString(groupmode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    introfiles: ").append(toIndentedString(introfiles)).append("\n");
    sb.append("    introformat: ").append(toIndentedString(introformat)).append("\n");
    sb.append("    keepdays: ").append(toIndentedString(keepdays)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    studentlogs: ").append(toIndentedString(studentlogs)).append("\n");
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
    openapiFields.add("chatmethod");
    openapiFields.add("chattime");
    openapiFields.add("course");
    openapiFields.add("coursemodule");
    openapiFields.add("groupingid");
    openapiFields.add("groupmode");
    openapiFields.add("id");
    openapiFields.add("intro");
    openapiFields.add("introfiles");
    openapiFields.add("introformat");
    openapiFields.add("keepdays");
    openapiFields.add("lang");
    openapiFields.add("name");
    openapiFields.add("schedule");
    openapiFields.add("section");
    openapiFields.add("studentlogs");
    openapiFields.add("timemodified");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModChatGetChatsByCourses200ResponseChatsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModChatGetChatsByCourses200ResponseChatsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModChatGetChatsByCourses200ResponseChatsInner is not found in the empty JSON string", ModChatGetChatsByCourses200ResponseChatsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModChatGetChatsByCourses200ResponseChatsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModChatGetChatsByCourses200ResponseChatsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chatmethod") != null && !jsonObj.get("chatmethod").isJsonNull()) && !jsonObj.get("chatmethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chatmethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chatmethod").toString()));
      }
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
       if (!ModChatGetChatsByCourses200ResponseChatsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModChatGetChatsByCourses200ResponseChatsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModChatGetChatsByCourses200ResponseChatsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModChatGetChatsByCourses200ResponseChatsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModChatGetChatsByCourses200ResponseChatsInner>() {
           @Override
           public void write(JsonWriter out, ModChatGetChatsByCourses200ResponseChatsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModChatGetChatsByCourses200ResponseChatsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModChatGetChatsByCourses200ResponseChatsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModChatGetChatsByCourses200ResponseChatsInner
  * @throws IOException if the JSON string is invalid with respect to ModChatGetChatsByCourses200ResponseChatsInner
  */
  public static ModChatGetChatsByCourses200ResponseChatsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModChatGetChatsByCourses200ResponseChatsInner.class);
  }

 /**
  * Convert an instance of ModChatGetChatsByCourses200ResponseChatsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * Tool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiGetLtisByCourses200ResponseLtisInner {
  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Integer course;

  public static final String SERIALIZED_NAME_COURSEMODULE = "coursemodule";
  @SerializedName(SERIALIZED_NAME_COURSEMODULE)
  private Integer coursemodule;

  public static final String SERIALIZED_NAME_DEBUGLAUNCH = "debuglaunch";
  @SerializedName(SERIALIZED_NAME_DEBUGLAUNCH)
  private Integer debuglaunch = null;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private Integer grade = null;

  public static final String SERIALIZED_NAME_GROUPINGID = "groupingid";
  @SerializedName(SERIALIZED_NAME_GROUPINGID)
  private Integer groupingid;

  public static final String SERIALIZED_NAME_GROUPMODE = "groupmode";
  @SerializedName(SERIALIZED_NAME_GROUPMODE)
  private Integer groupmode;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INSTRUCTORCHOICEACCEPTGRADES = "instructorchoiceacceptgrades";
  @SerializedName(SERIALIZED_NAME_INSTRUCTORCHOICEACCEPTGRADES)
  private Integer instructorchoiceacceptgrades = null;

  public static final String SERIALIZED_NAME_INSTRUCTORCHOICEALLOWROSTER = "instructorchoiceallowroster";
  @SerializedName(SERIALIZED_NAME_INSTRUCTORCHOICEALLOWROSTER)
  private Integer instructorchoiceallowroster = null;

  public static final String SERIALIZED_NAME_INSTRUCTORCHOICEALLOWSETTING = "instructorchoiceallowsetting";
  @SerializedName(SERIALIZED_NAME_INSTRUCTORCHOICEALLOWSETTING)
  private Integer instructorchoiceallowsetting = null;

  public static final String SERIALIZED_NAME_INSTRUCTORCHOICESENDEMAILADDR = "instructorchoicesendemailaddr";
  @SerializedName(SERIALIZED_NAME_INSTRUCTORCHOICESENDEMAILADDR)
  private Integer instructorchoicesendemailaddr = null;

  public static final String SERIALIZED_NAME_INSTRUCTORCHOICESENDNAME = "instructorchoicesendname";
  @SerializedName(SERIALIZED_NAME_INSTRUCTORCHOICESENDNAME)
  private String instructorchoicesendname = "null";

  public static final String SERIALIZED_NAME_INSTRUCTORCUSTOMPARAMETERS = "instructorcustomparameters";
  @SerializedName(SERIALIZED_NAME_INSTRUCTORCUSTOMPARAMETERS)
  private String instructorcustomparameters = "null";

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

  public static final String SERIALIZED_NAME_LAUNCHCONTAINER = "launchcontainer";
  @SerializedName(SERIALIZED_NAME_LAUNCHCONTAINER)
  private Integer launchcontainer = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password = "null";

  public static final String SERIALIZED_NAME_RESOURCEKEY = "resourcekey";
  @SerializedName(SERIALIZED_NAME_RESOURCEKEY)
  private String resourcekey = "null";

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private Integer section;

  public static final String SERIALIZED_NAME_SECUREICON = "secureicon";
  @SerializedName(SERIALIZED_NAME_SECUREICON)
  private String secureicon = "null";

  public static final String SERIALIZED_NAME_SECURETOOLURL = "securetoolurl";
  @SerializedName(SERIALIZED_NAME_SECURETOOLURL)
  private String securetoolurl = "null";

  public static final String SERIALIZED_NAME_SERVICESALT = "servicesalt";
  @SerializedName(SERIALIZED_NAME_SERVICESALT)
  private String servicesalt = "null";

  public static final String SERIALIZED_NAME_SHOWDESCRIPTIONLAUNCH = "showdescriptionlaunch";
  @SerializedName(SERIALIZED_NAME_SHOWDESCRIPTIONLAUNCH)
  private Integer showdescriptionlaunch = null;

  public static final String SERIALIZED_NAME_SHOWTITLELAUNCH = "showtitlelaunch";
  @SerializedName(SERIALIZED_NAME_SHOWTITLELAUNCH)
  private Integer showtitlelaunch = null;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_TOOLURL = "toolurl";
  @SerializedName(SERIALIZED_NAME_TOOLURL)
  private String toolurl = "null";

  public static final String SERIALIZED_NAME_TYPEID = "typeid";
  @SerializedName(SERIALIZED_NAME_TYPEID)
  private Integer typeid = null;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public ModLtiGetLtisByCourses200ResponseLtisInner() {
  }

  public ModLtiGetLtisByCourses200ResponseLtisInner course(Integer course) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner coursemodule(Integer coursemodule) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner debuglaunch(Integer debuglaunch) {
    this.debuglaunch = debuglaunch;
    return this;
  }

   /**
   * Debug launch
   * @return debuglaunch
  **/
  @javax.annotation.Nullable
  public Integer getDebuglaunch() {
    return debuglaunch;
  }

  public void setDebuglaunch(Integer debuglaunch) {
    this.debuglaunch = debuglaunch;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner grade(Integer grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Enable grades
   * @return grade
  **/
  @javax.annotation.Nullable
  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner groupingid(Integer groupingid) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner groupmode(Integer groupmode) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Alternative icon URL
   * @return icon
  **/
  @javax.annotation.Nullable
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner id(Integer id) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner instructorchoiceacceptgrades(Integer instructorchoiceacceptgrades) {
    this.instructorchoiceacceptgrades = instructorchoiceacceptgrades;
    return this;
  }

   /**
   * instructor choice accept grades
   * @return instructorchoiceacceptgrades
  **/
  @javax.annotation.Nullable
  public Integer getInstructorchoiceacceptgrades() {
    return instructorchoiceacceptgrades;
  }

  public void setInstructorchoiceacceptgrades(Integer instructorchoiceacceptgrades) {
    this.instructorchoiceacceptgrades = instructorchoiceacceptgrades;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner instructorchoiceallowroster(Integer instructorchoiceallowroster) {
    this.instructorchoiceallowroster = instructorchoiceallowroster;
    return this;
  }

   /**
   * Instructor choice allow roster
   * @return instructorchoiceallowroster
  **/
  @javax.annotation.Nullable
  public Integer getInstructorchoiceallowroster() {
    return instructorchoiceallowroster;
  }

  public void setInstructorchoiceallowroster(Integer instructorchoiceallowroster) {
    this.instructorchoiceallowroster = instructorchoiceallowroster;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner instructorchoiceallowsetting(Integer instructorchoiceallowsetting) {
    this.instructorchoiceallowsetting = instructorchoiceallowsetting;
    return this;
  }

   /**
   * Instructor choice allow setting
   * @return instructorchoiceallowsetting
  **/
  @javax.annotation.Nullable
  public Integer getInstructorchoiceallowsetting() {
    return instructorchoiceallowsetting;
  }

  public void setInstructorchoiceallowsetting(Integer instructorchoiceallowsetting) {
    this.instructorchoiceallowsetting = instructorchoiceallowsetting;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner instructorchoicesendemailaddr(Integer instructorchoicesendemailaddr) {
    this.instructorchoicesendemailaddr = instructorchoicesendemailaddr;
    return this;
  }

   /**
   * instructor choice send mail address
   * @return instructorchoicesendemailaddr
  **/
  @javax.annotation.Nullable
  public Integer getInstructorchoicesendemailaddr() {
    return instructorchoicesendemailaddr;
  }

  public void setInstructorchoicesendemailaddr(Integer instructorchoicesendemailaddr) {
    this.instructorchoicesendemailaddr = instructorchoicesendemailaddr;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner instructorchoicesendname(String instructorchoicesendname) {
    this.instructorchoicesendname = instructorchoicesendname;
    return this;
  }

   /**
   * Instructor choice send name
   * @return instructorchoicesendname
  **/
  @javax.annotation.Nullable
  public String getInstructorchoicesendname() {
    return instructorchoicesendname;
  }

  public void setInstructorchoicesendname(String instructorchoicesendname) {
    this.instructorchoicesendname = instructorchoicesendname;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner instructorcustomparameters(String instructorcustomparameters) {
    this.instructorcustomparameters = instructorcustomparameters;
    return this;
  }

   /**
   * instructor custom parameters
   * @return instructorcustomparameters
  **/
  @javax.annotation.Nullable
  public String getInstructorcustomparameters() {
    return instructorcustomparameters;
  }

  public void setInstructorcustomparameters(String instructorcustomparameters) {
    this.instructorcustomparameters = instructorcustomparameters;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner intro(String intro) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner introfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> introfiles) {
    this.introfiles = introfiles;
    return this;
  }

  public ModLtiGetLtisByCourses200ResponseLtisInner addIntrofilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner introfilesItem) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner introformat(Integer introformat) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner lang(String lang) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner launchcontainer(Integer launchcontainer) {
    this.launchcontainer = launchcontainer;
    return this;
  }

   /**
   * Launch container mode
   * @return launchcontainer
  **/
  @javax.annotation.Nullable
  public Integer getLaunchcontainer() {
    return launchcontainer;
  }

  public void setLaunchcontainer(Integer launchcontainer) {
    this.launchcontainer = launchcontainer;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner name(String name) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Shared secret
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner resourcekey(String resourcekey) {
    this.resourcekey = resourcekey;
    return this;
  }

   /**
   * Resource key
   * @return resourcekey
  **/
  @javax.annotation.Nullable
  public String getResourcekey() {
    return resourcekey;
  }

  public void setResourcekey(String resourcekey) {
    this.resourcekey = resourcekey;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner section(Integer section) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner secureicon(String secureicon) {
    this.secureicon = secureicon;
    return this;
  }

   /**
   * Secure icon URL
   * @return secureicon
  **/
  @javax.annotation.Nullable
  public String getSecureicon() {
    return secureicon;
  }

  public void setSecureicon(String secureicon) {
    this.secureicon = secureicon;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner securetoolurl(String securetoolurl) {
    this.securetoolurl = securetoolurl;
    return this;
  }

   /**
   * Secure tool url
   * @return securetoolurl
  **/
  @javax.annotation.Nullable
  public String getSecuretoolurl() {
    return securetoolurl;
  }

  public void setSecuretoolurl(String securetoolurl) {
    this.securetoolurl = securetoolurl;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner servicesalt(String servicesalt) {
    this.servicesalt = servicesalt;
    return this;
  }

   /**
   * Service salt
   * @return servicesalt
  **/
  @javax.annotation.Nullable
  public String getServicesalt() {
    return servicesalt;
  }

  public void setServicesalt(String servicesalt) {
    this.servicesalt = servicesalt;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner showdescriptionlaunch(Integer showdescriptionlaunch) {
    this.showdescriptionlaunch = showdescriptionlaunch;
    return this;
  }

   /**
   * Show description launch
   * @return showdescriptionlaunch
  **/
  @javax.annotation.Nullable
  public Integer getShowdescriptionlaunch() {
    return showdescriptionlaunch;
  }

  public void setShowdescriptionlaunch(Integer showdescriptionlaunch) {
    this.showdescriptionlaunch = showdescriptionlaunch;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner showtitlelaunch(Integer showtitlelaunch) {
    this.showtitlelaunch = showtitlelaunch;
    return this;
  }

   /**
   * Show title launch
   * @return showtitlelaunch
  **/
  @javax.annotation.Nullable
  public Integer getShowtitlelaunch() {
    return showtitlelaunch;
  }

  public void setShowtitlelaunch(Integer showtitlelaunch) {
    this.showtitlelaunch = showtitlelaunch;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner timecreated(Integer timecreated) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner timemodified(Integer timemodified) {
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


  public ModLtiGetLtisByCourses200ResponseLtisInner toolurl(String toolurl) {
    this.toolurl = toolurl;
    return this;
  }

   /**
   * Tool url
   * @return toolurl
  **/
  @javax.annotation.Nullable
  public String getToolurl() {
    return toolurl;
  }

  public void setToolurl(String toolurl) {
    this.toolurl = toolurl;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner typeid(Integer typeid) {
    this.typeid = typeid;
    return this;
  }

   /**
   * Type id
   * @return typeid
  **/
  @javax.annotation.Nullable
  public Integer getTypeid() {
    return typeid;
  }

  public void setTypeid(Integer typeid) {
    this.typeid = typeid;
  }


  public ModLtiGetLtisByCourses200ResponseLtisInner visible(Boolean visible) {
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
    ModLtiGetLtisByCourses200ResponseLtisInner modLtiGetLtisByCourses200ResponseLtisInner = (ModLtiGetLtisByCourses200ResponseLtisInner) o;
    return Objects.equals(this.course, modLtiGetLtisByCourses200ResponseLtisInner.course) &&
        Objects.equals(this.coursemodule, modLtiGetLtisByCourses200ResponseLtisInner.coursemodule) &&
        Objects.equals(this.debuglaunch, modLtiGetLtisByCourses200ResponseLtisInner.debuglaunch) &&
        Objects.equals(this.grade, modLtiGetLtisByCourses200ResponseLtisInner.grade) &&
        Objects.equals(this.groupingid, modLtiGetLtisByCourses200ResponseLtisInner.groupingid) &&
        Objects.equals(this.groupmode, modLtiGetLtisByCourses200ResponseLtisInner.groupmode) &&
        Objects.equals(this.icon, modLtiGetLtisByCourses200ResponseLtisInner.icon) &&
        Objects.equals(this.id, modLtiGetLtisByCourses200ResponseLtisInner.id) &&
        Objects.equals(this.instructorchoiceacceptgrades, modLtiGetLtisByCourses200ResponseLtisInner.instructorchoiceacceptgrades) &&
        Objects.equals(this.instructorchoiceallowroster, modLtiGetLtisByCourses200ResponseLtisInner.instructorchoiceallowroster) &&
        Objects.equals(this.instructorchoiceallowsetting, modLtiGetLtisByCourses200ResponseLtisInner.instructorchoiceallowsetting) &&
        Objects.equals(this.instructorchoicesendemailaddr, modLtiGetLtisByCourses200ResponseLtisInner.instructorchoicesendemailaddr) &&
        Objects.equals(this.instructorchoicesendname, modLtiGetLtisByCourses200ResponseLtisInner.instructorchoicesendname) &&
        Objects.equals(this.instructorcustomparameters, modLtiGetLtisByCourses200ResponseLtisInner.instructorcustomparameters) &&
        Objects.equals(this.intro, modLtiGetLtisByCourses200ResponseLtisInner.intro) &&
        Objects.equals(this.introfiles, modLtiGetLtisByCourses200ResponseLtisInner.introfiles) &&
        Objects.equals(this.introformat, modLtiGetLtisByCourses200ResponseLtisInner.introformat) &&
        Objects.equals(this.lang, modLtiGetLtisByCourses200ResponseLtisInner.lang) &&
        Objects.equals(this.launchcontainer, modLtiGetLtisByCourses200ResponseLtisInner.launchcontainer) &&
        Objects.equals(this.name, modLtiGetLtisByCourses200ResponseLtisInner.name) &&
        Objects.equals(this.password, modLtiGetLtisByCourses200ResponseLtisInner.password) &&
        Objects.equals(this.resourcekey, modLtiGetLtisByCourses200ResponseLtisInner.resourcekey) &&
        Objects.equals(this.section, modLtiGetLtisByCourses200ResponseLtisInner.section) &&
        Objects.equals(this.secureicon, modLtiGetLtisByCourses200ResponseLtisInner.secureicon) &&
        Objects.equals(this.securetoolurl, modLtiGetLtisByCourses200ResponseLtisInner.securetoolurl) &&
        Objects.equals(this.servicesalt, modLtiGetLtisByCourses200ResponseLtisInner.servicesalt) &&
        Objects.equals(this.showdescriptionlaunch, modLtiGetLtisByCourses200ResponseLtisInner.showdescriptionlaunch) &&
        Objects.equals(this.showtitlelaunch, modLtiGetLtisByCourses200ResponseLtisInner.showtitlelaunch) &&
        Objects.equals(this.timecreated, modLtiGetLtisByCourses200ResponseLtisInner.timecreated) &&
        Objects.equals(this.timemodified, modLtiGetLtisByCourses200ResponseLtisInner.timemodified) &&
        Objects.equals(this.toolurl, modLtiGetLtisByCourses200ResponseLtisInner.toolurl) &&
        Objects.equals(this.typeid, modLtiGetLtisByCourses200ResponseLtisInner.typeid) &&
        Objects.equals(this.visible, modLtiGetLtisByCourses200ResponseLtisInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, coursemodule, debuglaunch, grade, groupingid, groupmode, icon, id, instructorchoiceacceptgrades, instructorchoiceallowroster, instructorchoiceallowsetting, instructorchoicesendemailaddr, instructorchoicesendname, instructorcustomparameters, intro, introfiles, introformat, lang, launchcontainer, name, password, resourcekey, section, secureicon, securetoolurl, servicesalt, showdescriptionlaunch, showtitlelaunch, timecreated, timemodified, toolurl, typeid, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiGetLtisByCourses200ResponseLtisInner {\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    coursemodule: ").append(toIndentedString(coursemodule)).append("\n");
    sb.append("    debuglaunch: ").append(toIndentedString(debuglaunch)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    groupingid: ").append(toIndentedString(groupingid)).append("\n");
    sb.append("    groupmode: ").append(toIndentedString(groupmode)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructorchoiceacceptgrades: ").append(toIndentedString(instructorchoiceacceptgrades)).append("\n");
    sb.append("    instructorchoiceallowroster: ").append(toIndentedString(instructorchoiceallowroster)).append("\n");
    sb.append("    instructorchoiceallowsetting: ").append(toIndentedString(instructorchoiceallowsetting)).append("\n");
    sb.append("    instructorchoicesendemailaddr: ").append(toIndentedString(instructorchoicesendemailaddr)).append("\n");
    sb.append("    instructorchoicesendname: ").append(toIndentedString(instructorchoicesendname)).append("\n");
    sb.append("    instructorcustomparameters: ").append(toIndentedString(instructorcustomparameters)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    introfiles: ").append(toIndentedString(introfiles)).append("\n");
    sb.append("    introformat: ").append(toIndentedString(introformat)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    launchcontainer: ").append(toIndentedString(launchcontainer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resourcekey: ").append(toIndentedString(resourcekey)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    secureicon: ").append(toIndentedString(secureicon)).append("\n");
    sb.append("    securetoolurl: ").append(toIndentedString(securetoolurl)).append("\n");
    sb.append("    servicesalt: ").append(toIndentedString(servicesalt)).append("\n");
    sb.append("    showdescriptionlaunch: ").append(toIndentedString(showdescriptionlaunch)).append("\n");
    sb.append("    showtitlelaunch: ").append(toIndentedString(showtitlelaunch)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    toolurl: ").append(toIndentedString(toolurl)).append("\n");
    sb.append("    typeid: ").append(toIndentedString(typeid)).append("\n");
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
    openapiFields.add("debuglaunch");
    openapiFields.add("grade");
    openapiFields.add("groupingid");
    openapiFields.add("groupmode");
    openapiFields.add("icon");
    openapiFields.add("id");
    openapiFields.add("instructorchoiceacceptgrades");
    openapiFields.add("instructorchoiceallowroster");
    openapiFields.add("instructorchoiceallowsetting");
    openapiFields.add("instructorchoicesendemailaddr");
    openapiFields.add("instructorchoicesendname");
    openapiFields.add("instructorcustomparameters");
    openapiFields.add("intro");
    openapiFields.add("introfiles");
    openapiFields.add("introformat");
    openapiFields.add("lang");
    openapiFields.add("launchcontainer");
    openapiFields.add("name");
    openapiFields.add("password");
    openapiFields.add("resourcekey");
    openapiFields.add("section");
    openapiFields.add("secureicon");
    openapiFields.add("securetoolurl");
    openapiFields.add("servicesalt");
    openapiFields.add("showdescriptionlaunch");
    openapiFields.add("showtitlelaunch");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("toolurl");
    openapiFields.add("typeid");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiGetLtisByCourses200ResponseLtisInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiGetLtisByCourses200ResponseLtisInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiGetLtisByCourses200ResponseLtisInner is not found in the empty JSON string", ModLtiGetLtisByCourses200ResponseLtisInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiGetLtisByCourses200ResponseLtisInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiGetLtisByCourses200ResponseLtisInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if ((jsonObj.get("instructorchoicesendname") != null && !jsonObj.get("instructorchoicesendname").isJsonNull()) && !jsonObj.get("instructorchoicesendname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructorchoicesendname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructorchoicesendname").toString()));
      }
      if ((jsonObj.get("instructorcustomparameters") != null && !jsonObj.get("instructorcustomparameters").isJsonNull()) && !jsonObj.get("instructorcustomparameters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructorcustomparameters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructorcustomparameters").toString()));
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
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("resourcekey") != null && !jsonObj.get("resourcekey").isJsonNull()) && !jsonObj.get("resourcekey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourcekey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourcekey").toString()));
      }
      if ((jsonObj.get("secureicon") != null && !jsonObj.get("secureicon").isJsonNull()) && !jsonObj.get("secureicon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secureicon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secureicon").toString()));
      }
      if ((jsonObj.get("securetoolurl") != null && !jsonObj.get("securetoolurl").isJsonNull()) && !jsonObj.get("securetoolurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `securetoolurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("securetoolurl").toString()));
      }
      if ((jsonObj.get("servicesalt") != null && !jsonObj.get("servicesalt").isJsonNull()) && !jsonObj.get("servicesalt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `servicesalt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("servicesalt").toString()));
      }
      if ((jsonObj.get("toolurl") != null && !jsonObj.get("toolurl").isJsonNull()) && !jsonObj.get("toolurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toolurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toolurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiGetLtisByCourses200ResponseLtisInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiGetLtisByCourses200ResponseLtisInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiGetLtisByCourses200ResponseLtisInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiGetLtisByCourses200ResponseLtisInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiGetLtisByCourses200ResponseLtisInner>() {
           @Override
           public void write(JsonWriter out, ModLtiGetLtisByCourses200ResponseLtisInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiGetLtisByCourses200ResponseLtisInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiGetLtisByCourses200ResponseLtisInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiGetLtisByCourses200ResponseLtisInner
  * @throws IOException if the JSON string is invalid with respect to ModLtiGetLtisByCourses200ResponseLtisInner
  */
  public static ModLtiGetLtisByCourses200ResponseLtisInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiGetLtisByCourses200ResponseLtisInner.class);
  }

 /**
  * Convert an instance of ModLtiGetLtisByCourses200ResponseLtisInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile;

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
 * ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {
  public static final String SERIALIZED_NAME_CONTENTHASH = "contenthash";
  @SerializedName(SERIALIZED_NAME_CONTENTHASH)
  private String contenthash = "null";

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Integer context = null;

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Integer course = null;

  public static final String SERIALIZED_NAME_COURSEMODULE = "coursemodule";
  @SerializedName(SERIALIZED_NAME_COURSEMODULE)
  private Integer coursemodule;

  public static final String SERIALIZED_NAME_DEPLOYEDFILE = "deployedfile";
  @SerializedName(SERIALIZED_NAME_DEPLOYEDFILE)
  private ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile deployedfile;

  public static final String SERIALIZED_NAME_DISPLAYOPTIONS = "displayoptions";
  @SerializedName(SERIALIZED_NAME_DISPLAYOPTIONS)
  private Integer displayoptions = 0;

  public static final String SERIALIZED_NAME_ENABLETRACKING = "enabletracking";
  @SerializedName(SERIALIZED_NAME_ENABLETRACKING)
  private Integer enabletracking = 1;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private Integer grade = 0;

  public static final String SERIALIZED_NAME_GRADEMETHOD = "grademethod";
  @SerializedName(SERIALIZED_NAME_GRADEMETHOD)
  private Integer grademethod = 1;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INTRO = "intro";
  @SerializedName(SERIALIZED_NAME_INTRO)
  private String intro = "";

  public static final String SERIALIZED_NAME_INTROFILES = "introfiles";
  @SerializedName(SERIALIZED_NAME_INTROFILES)
  private List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> introfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTROFORMAT = "introformat";
  @SerializedName(SERIALIZED_NAME_INTROFORMAT)
  private Integer introformat = 0;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> _package = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner() {
  }

  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner contenthash(String contenthash) {
    this.contenthash = contenthash;
    return this;
  }

   /**
   * Sha1 hash of file content.
   * @return contenthash
  **/
  @javax.annotation.Nullable
  public String getContenthash() {
    return contenthash;
  }

  public void setContenthash(String contenthash) {
    this.contenthash = contenthash;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner context(Integer context) {
    this.context = context;
    return this;
  }

   /**
   * context
   * @return context
  **/
  @javax.annotation.Nullable
  public Integer getContext() {
    return context;
  }

  public void setContext(Integer context) {
    this.context = context;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner course(Integer course) {
    this.course = course;
    return this;
  }

   /**
   * Course id this h5p activity is part of.
   * @return course
  **/
  @javax.annotation.Nullable
  public Integer getCourse() {
    return course;
  }

  public void setCourse(Integer course) {
    this.course = course;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner coursemodule(Integer coursemodule) {
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


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner deployedfile(ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile deployedfile) {
    this.deployedfile = deployedfile;
    return this;
  }

   /**
   * Get deployedfile
   * @return deployedfile
  **/
  @javax.annotation.Nullable
  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile getDeployedfile() {
    return deployedfile;
  }

  public void setDeployedfile(ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile deployedfile) {
    this.deployedfile = deployedfile;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner displayoptions(Integer displayoptions) {
    this.displayoptions = displayoptions;
    return this;
  }

   /**
   * H5P Button display options.
   * @return displayoptions
  **/
  @javax.annotation.Nullable
  public Integer getDisplayoptions() {
    return displayoptions;
  }

  public void setDisplayoptions(Integer displayoptions) {
    this.displayoptions = displayoptions;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner enabletracking(Integer enabletracking) {
    this.enabletracking = enabletracking;
    return this;
  }

   /**
   * Enable xAPI tracking.
   * @return enabletracking
  **/
  @javax.annotation.Nullable
  public Integer getEnabletracking() {
    return enabletracking;
  }

  public void setEnabletracking(Integer enabletracking) {
    this.enabletracking = enabletracking;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner grade(Integer grade) {
    this.grade = grade;
    return this;
  }

   /**
   * The maximum grade for submission.
   * @return grade
  **/
  @javax.annotation.Nullable
  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner grademethod(Integer grademethod) {
    this.grademethod = grademethod;
    return this;
  }

   /**
   * Which H5P attempt is used for grading.
   * @return grademethod
  **/
  @javax.annotation.Nullable
  public Integer getGrademethod() {
    return grademethod;
  }

  public void setGrademethod(Integer grademethod) {
    this.grademethod = grademethod;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner id(Integer id) {
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


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner intro(String intro) {
    this.intro = intro;
    return this;
  }

   /**
   * H5P activity description.
   * @return intro
  **/
  @javax.annotation.Nullable
  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner introfiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> introfiles) {
    this.introfiles = introfiles;
    return this;
  }

  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner addIntrofilesItem(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner introfilesItem) {
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


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner introformat(Integer introformat) {
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


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the activity module instance.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner _package(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> _package) {
    this._package = _package;
    return this;
  }

  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner addPackageItem(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner _packageItem) {
    if (this._package == null) {
      this._package = new ArrayList<>();
    }
    this._package.add(_packageItem);
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nullable
  public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> getPackage() {
    return _package;
  }

  public void setPackage(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> _package) {
    this._package = _package;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * Timestamp of when the instance was added to the course.
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * Timestamp of when the instance was last modified.
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner = (ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) o;
    return Objects.equals(this.contenthash, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.contenthash) &&
        Objects.equals(this.context, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.context) &&
        Objects.equals(this.course, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.course) &&
        Objects.equals(this.coursemodule, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.coursemodule) &&
        Objects.equals(this.deployedfile, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.deployedfile) &&
        Objects.equals(this.displayoptions, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.displayoptions) &&
        Objects.equals(this.enabletracking, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.enabletracking) &&
        Objects.equals(this.grade, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.grade) &&
        Objects.equals(this.grademethod, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.grademethod) &&
        Objects.equals(this.id, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.id) &&
        Objects.equals(this.intro, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.intro) &&
        Objects.equals(this.introfiles, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.introfiles) &&
        Objects.equals(this.introformat, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.introformat) &&
        Objects.equals(this.name, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.name) &&
        Objects.equals(this._package, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner._package) &&
        Objects.equals(this.timecreated, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.timecreated) &&
        Objects.equals(this.timemodified, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.timemodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contenthash, context, course, coursemodule, deployedfile, displayoptions, enabletracking, grade, grademethod, id, intro, introfiles, introformat, name, _package, timecreated, timemodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner {\n");
    sb.append("    contenthash: ").append(toIndentedString(contenthash)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    coursemodule: ").append(toIndentedString(coursemodule)).append("\n");
    sb.append("    deployedfile: ").append(toIndentedString(deployedfile)).append("\n");
    sb.append("    displayoptions: ").append(toIndentedString(displayoptions)).append("\n");
    sb.append("    enabletracking: ").append(toIndentedString(enabletracking)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    grademethod: ").append(toIndentedString(grademethod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    introfiles: ").append(toIndentedString(introfiles)).append("\n");
    sb.append("    introformat: ").append(toIndentedString(introformat)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
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
    openapiFields.add("contenthash");
    openapiFields.add("context");
    openapiFields.add("course");
    openapiFields.add("coursemodule");
    openapiFields.add("deployedfile");
    openapiFields.add("displayoptions");
    openapiFields.add("enabletracking");
    openapiFields.add("grade");
    openapiFields.add("grademethod");
    openapiFields.add("id");
    openapiFields.add("intro");
    openapiFields.add("introfiles");
    openapiFields.add("introformat");
    openapiFields.add("name");
    openapiFields.add("package");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner is not found in the empty JSON string", ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contenthash") != null && !jsonObj.get("contenthash").isJsonNull()) && !jsonObj.get("contenthash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contenthash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contenthash").toString()));
      }
      // validate the optional field `deployedfile`
      if (jsonObj.get("deployedfile") != null && !jsonObj.get("deployedfile").isJsonNull()) {
        ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile.validateJsonElement(jsonObj.get("deployedfile"));
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
            CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.validateJsonElement(jsonArrayintrofiles.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        JsonArray jsonArray_package = jsonObj.getAsJsonArray("package");
        if (jsonArray_package != null) {
          // ensure the json data is an array
          if (!jsonObj.get("package").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `package` to be an array in the JSON string but got `%s`", jsonObj.get("package").toString()));
          }

          // validate the optional field `package` (array)
          for (int i = 0; i < jsonArray_package.size(); i++) {
            CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.validateJsonElement(jsonArray_package.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner>() {
           @Override
           public void write(JsonWriter out, ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
  * @throws IOException if the JSON string is invalid with respect to ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner
  */
  public static ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.class);
  }

 /**
  * Convert an instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


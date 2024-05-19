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
 * The page answers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLessonGetPageData200ResponseAnswersInner {
  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private String answer = "null";

  public static final String SERIALIZED_NAME_ANSWERFILES = "answerfiles";
  @SerializedName(SERIALIZED_NAME_ANSWERFILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> answerfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_ANSWERFORMAT = "answerformat";
  @SerializedName(SERIALIZED_NAME_ANSWERFORMAT)
  private Integer answerformat = null;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private Integer flags = null;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private Integer grade = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_JUMPTO = "jumpto";
  @SerializedName(SERIALIZED_NAME_JUMPTO)
  private Integer jumpto = null;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response = "null";

  public static final String SERIALIZED_NAME_RESPONSEFILES = "responsefiles";
  @SerializedName(SERIALIZED_NAME_RESPONSEFILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> responsefiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESPONSEFORMAT = "responseformat";
  @SerializedName(SERIALIZED_NAME_RESPONSEFORMAT)
  private Integer responseformat = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score = null;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public ModLessonGetPageData200ResponseAnswersInner() {
  }

  public ModLessonGetPageData200ResponseAnswersInner answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * Possible answer text
   * @return answer
  **/
  @javax.annotation.Nullable
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public ModLessonGetPageData200ResponseAnswersInner answerfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> answerfiles) {
    this.answerfiles = answerfiles;
    return this;
  }

  public ModLessonGetPageData200ResponseAnswersInner addAnswerfilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner answerfilesItem) {
    if (this.answerfiles == null) {
      this.answerfiles = new ArrayList<>();
    }
    this.answerfiles.add(answerfilesItem);
    return this;
  }

   /**
   * Get answerfiles
   * @return answerfiles
  **/
  @javax.annotation.Nullable
  public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> getAnswerfiles() {
    return answerfiles;
  }

  public void setAnswerfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> answerfiles) {
    this.answerfiles = answerfiles;
  }


  public ModLessonGetPageData200ResponseAnswersInner answerformat(Integer answerformat) {
    this.answerformat = answerformat;
    return this;
  }

   /**
   * answer format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return answerformat
  **/
  @javax.annotation.Nullable
  public Integer getAnswerformat() {
    return answerformat;
  }

  public void setAnswerformat(Integer answerformat) {
    this.answerformat = answerformat;
  }


  public ModLessonGetPageData200ResponseAnswersInner flags(Integer flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Used to store options for the answer
   * @return flags
  **/
  @javax.annotation.Nullable
  public Integer getFlags() {
    return flags;
  }

  public void setFlags(Integer flags) {
    this.flags = flags;
  }


  public ModLessonGetPageData200ResponseAnswersInner grade(Integer grade) {
    this.grade = grade;
    return this;
  }

   /**
   * The grade this answer is worth
   * @return grade
  **/
  @javax.annotation.Nullable
  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }


  public ModLessonGetPageData200ResponseAnswersInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this answer in the database
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModLessonGetPageData200ResponseAnswersInner jumpto(Integer jumpto) {
    this.jumpto = jumpto;
    return this;
  }

   /**
   * Identifies where the user goes upon completing a page with this answer
   * @return jumpto
  **/
  @javax.annotation.Nullable
  public Integer getJumpto() {
    return jumpto;
  }

  public void setJumpto(Integer jumpto) {
    this.jumpto = jumpto;
  }


  public ModLessonGetPageData200ResponseAnswersInner response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Response text for the answer
   * @return response
  **/
  @javax.annotation.Nullable
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  public ModLessonGetPageData200ResponseAnswersInner responsefiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> responsefiles) {
    this.responsefiles = responsefiles;
    return this;
  }

  public ModLessonGetPageData200ResponseAnswersInner addResponsefilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner responsefilesItem) {
    if (this.responsefiles == null) {
      this.responsefiles = new ArrayList<>();
    }
    this.responsefiles.add(responsefilesItem);
    return this;
  }

   /**
   * Get responsefiles
   * @return responsefiles
  **/
  @javax.annotation.Nullable
  public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> getResponsefiles() {
    return responsefiles;
  }

  public void setResponsefiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> responsefiles) {
    this.responsefiles = responsefiles;
  }


  public ModLessonGetPageData200ResponseAnswersInner responseformat(Integer responseformat) {
    this.responseformat = responseformat;
    return this;
  }

   /**
   * response format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return responseformat
  **/
  @javax.annotation.Nullable
  public Integer getResponseformat() {
    return responseformat;
  }

  public void setResponseformat(Integer responseformat) {
    this.responseformat = responseformat;
  }


  public ModLessonGetPageData200ResponseAnswersInner score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * The score this answer will give
   * @return score
  **/
  @javax.annotation.Nullable
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  public ModLessonGetPageData200ResponseAnswersInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * A timestamp of when the answer was created
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModLessonGetPageData200ResponseAnswersInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * A timestamp of when the answer was modified
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
    ModLessonGetPageData200ResponseAnswersInner modLessonGetPageData200ResponseAnswersInner = (ModLessonGetPageData200ResponseAnswersInner) o;
    return Objects.equals(this.answer, modLessonGetPageData200ResponseAnswersInner.answer) &&
        Objects.equals(this.answerfiles, modLessonGetPageData200ResponseAnswersInner.answerfiles) &&
        Objects.equals(this.answerformat, modLessonGetPageData200ResponseAnswersInner.answerformat) &&
        Objects.equals(this.flags, modLessonGetPageData200ResponseAnswersInner.flags) &&
        Objects.equals(this.grade, modLessonGetPageData200ResponseAnswersInner.grade) &&
        Objects.equals(this.id, modLessonGetPageData200ResponseAnswersInner.id) &&
        Objects.equals(this.jumpto, modLessonGetPageData200ResponseAnswersInner.jumpto) &&
        Objects.equals(this.response, modLessonGetPageData200ResponseAnswersInner.response) &&
        Objects.equals(this.responsefiles, modLessonGetPageData200ResponseAnswersInner.responsefiles) &&
        Objects.equals(this.responseformat, modLessonGetPageData200ResponseAnswersInner.responseformat) &&
        Objects.equals(this.score, modLessonGetPageData200ResponseAnswersInner.score) &&
        Objects.equals(this.timecreated, modLessonGetPageData200ResponseAnswersInner.timecreated) &&
        Objects.equals(this.timemodified, modLessonGetPageData200ResponseAnswersInner.timemodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, answerfiles, answerformat, flags, grade, id, jumpto, response, responsefiles, responseformat, score, timecreated, timemodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLessonGetPageData200ResponseAnswersInner {\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    answerfiles: ").append(toIndentedString(answerfiles)).append("\n");
    sb.append("    answerformat: ").append(toIndentedString(answerformat)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jumpto: ").append(toIndentedString(jumpto)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responsefiles: ").append(toIndentedString(responsefiles)).append("\n");
    sb.append("    responseformat: ").append(toIndentedString(responseformat)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("answer");
    openapiFields.add("answerfiles");
    openapiFields.add("answerformat");
    openapiFields.add("flags");
    openapiFields.add("grade");
    openapiFields.add("id");
    openapiFields.add("jumpto");
    openapiFields.add("response");
    openapiFields.add("responsefiles");
    openapiFields.add("responseformat");
    openapiFields.add("score");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLessonGetPageData200ResponseAnswersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLessonGetPageData200ResponseAnswersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLessonGetPageData200ResponseAnswersInner is not found in the empty JSON string", ModLessonGetPageData200ResponseAnswersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLessonGetPageData200ResponseAnswersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLessonGetPageData200ResponseAnswersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("answer") != null && !jsonObj.get("answer").isJsonNull()) && !jsonObj.get("answer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer").toString()));
      }
      if (jsonObj.get("answerfiles") != null && !jsonObj.get("answerfiles").isJsonNull()) {
        JsonArray jsonArrayanswerfiles = jsonObj.getAsJsonArray("answerfiles");
        if (jsonArrayanswerfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("answerfiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `answerfiles` to be an array in the JSON string but got `%s`", jsonObj.get("answerfiles").toString()));
          }

          // validate the optional field `answerfiles` (array)
          for (int i = 0; i < jsonArrayanswerfiles.size(); i++) {
            CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArrayanswerfiles.get(i));
          };
        }
      }
      if ((jsonObj.get("response") != null && !jsonObj.get("response").isJsonNull()) && !jsonObj.get("response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
      if (jsonObj.get("responsefiles") != null && !jsonObj.get("responsefiles").isJsonNull()) {
        JsonArray jsonArrayresponsefiles = jsonObj.getAsJsonArray("responsefiles");
        if (jsonArrayresponsefiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("responsefiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `responsefiles` to be an array in the JSON string but got `%s`", jsonObj.get("responsefiles").toString()));
          }

          // validate the optional field `responsefiles` (array)
          for (int i = 0; i < jsonArrayresponsefiles.size(); i++) {
            CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArrayresponsefiles.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLessonGetPageData200ResponseAnswersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLessonGetPageData200ResponseAnswersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLessonGetPageData200ResponseAnswersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLessonGetPageData200ResponseAnswersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLessonGetPageData200ResponseAnswersInner>() {
           @Override
           public void write(JsonWriter out, ModLessonGetPageData200ResponseAnswersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLessonGetPageData200ResponseAnswersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLessonGetPageData200ResponseAnswersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLessonGetPageData200ResponseAnswersInner
  * @throws IOException if the JSON string is invalid with respect to ModLessonGetPageData200ResponseAnswersInner
  */
  public static ModLessonGetPageData200ResponseAnswersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLessonGetPageData200ResponseAnswersInner.class);
  }

 /**
  * Convert an instance of ModLessonGetPageData200ResponseAnswersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import java.util.Arrays;

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
 * ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner {
  public static final String SERIALIZED_NAME_ATTEMPT = "attempt";
  @SerializedName(SERIALIZED_NAME_ATTEMPT)
  private Integer attempt;

  public static final String SERIALIZED_NAME_COMPLETION = "completion";
  @SerializedName(SERIALIZED_NAME_COMPLETION)
  private Integer completion;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_H5PACTIVITYID = "h5pactivityid";
  @SerializedName(SERIALIZED_NAME_H5PACTIVITYID)
  private Integer h5pactivityid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MAXSCORE = "maxscore";
  @SerializedName(SERIALIZED_NAME_MAXSCORE)
  private Integer maxscore;

  public static final String SERIALIZED_NAME_RAWSCORE = "rawscore";
  @SerializedName(SERIALIZED_NAME_RAWSCORE)
  private Integer rawscore;

  public static final String SERIALIZED_NAME_SCALED = "scaled";
  @SerializedName(SERIALIZED_NAME_SCALED)
  private BigDecimal scaled;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Integer success;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner() {
  }

  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner attempt(Integer attempt) {
    this.attempt = attempt;
    return this;
  }

   /**
   * Attempt number
   * @return attempt
  **/
  @javax.annotation.Nullable
  public Integer getAttempt() {
    return attempt;
  }

  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner completion(Integer completion) {
    this.completion = completion;
    return this;
  }

   /**
   * Attempt completion
   * @return completion
  **/
  @javax.annotation.Nullable
  public Integer getCompletion() {
    return completion;
  }

  public void setCompletion(Integer completion) {
    this.completion = completion;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Attempt duration in seconds
   * @return duration
  **/
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner h5pactivityid(Integer h5pactivityid) {
    this.h5pactivityid = h5pactivityid;
    return this;
  }

   /**
   * ID of the H5P activity
   * @return h5pactivityid
  **/
  @javax.annotation.Nullable
  public Integer getH5pactivityid() {
    return h5pactivityid;
  }

  public void setH5pactivityid(Integer h5pactivityid) {
    this.h5pactivityid = h5pactivityid;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the context
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner maxscore(Integer maxscore) {
    this.maxscore = maxscore;
    return this;
  }

   /**
   * Attempt max score
   * @return maxscore
  **/
  @javax.annotation.Nullable
  public Integer getMaxscore() {
    return maxscore;
  }

  public void setMaxscore(Integer maxscore) {
    this.maxscore = maxscore;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner rawscore(Integer rawscore) {
    this.rawscore = rawscore;
    return this;
  }

   /**
   * Attempt score value
   * @return rawscore
  **/
  @javax.annotation.Nullable
  public Integer getRawscore() {
    return rawscore;
  }

  public void setRawscore(Integer rawscore) {
    this.rawscore = rawscore;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner scaled(BigDecimal scaled) {
    this.scaled = scaled;
    return this;
  }

   /**
   * Attempt scaled
   * @return scaled
  **/
  @javax.annotation.Nullable
  public BigDecimal getScaled() {
    return scaled;
  }

  public void setScaled(BigDecimal scaled) {
    this.scaled = scaled;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner success(Integer success) {
    this.success = success;
    return this;
  }

   /**
   * Attempt success
   * @return success
  **/
  @javax.annotation.Nullable
  public Integer getSuccess() {
    return success;
  }

  public void setSuccess(Integer success) {
    this.success = success;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * Attempt creation
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * Attempt modified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * ID of the user
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner = (ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner) o;
    return Objects.equals(this.attempt, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.attempt) &&
        Objects.equals(this.completion, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.completion) &&
        Objects.equals(this.duration, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.duration) &&
        Objects.equals(this.h5pactivityid, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.h5pactivityid) &&
        Objects.equals(this.id, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.id) &&
        Objects.equals(this.maxscore, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.maxscore) &&
        Objects.equals(this.rawscore, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.rawscore) &&
        Objects.equals(this.scaled, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.scaled) &&
        Objects.equals(this.success, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.success) &&
        Objects.equals(this.timecreated, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.timecreated) &&
        Objects.equals(this.timemodified, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.timemodified) &&
        Objects.equals(this.userid, modH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempt, completion, duration, h5pactivityid, id, maxscore, rawscore, scaled, success, timecreated, timemodified, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner {\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    h5pactivityid: ").append(toIndentedString(h5pactivityid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxscore: ").append(toIndentedString(maxscore)).append("\n");
    sb.append("    rawscore: ").append(toIndentedString(rawscore)).append("\n");
    sb.append("    scaled: ").append(toIndentedString(scaled)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
    openapiFields.add("attempt");
    openapiFields.add("completion");
    openapiFields.add("duration");
    openapiFields.add("h5pactivityid");
    openapiFields.add("id");
    openapiFields.add("maxscore");
    openapiFields.add("rawscore");
    openapiFields.add("scaled");
    openapiFields.add("success");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner is not found in the empty JSON string", ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner>() {
           @Override
           public void write(JsonWriter out, ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
  * @throws IOException if the JSON string is invalid with respect to ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner
  */
  public static ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.class);
  }

 /**
  * Convert an instance of ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner;

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
 * ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission {
  public static final String SERIALIZED_NAME_ASSIGNMENT = "assignment";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENT)
  private Integer assignment;

  public static final String SERIALIZED_NAME_ATTEMPTNUMBER = "attemptnumber";
  @SerializedName(SERIALIZED_NAME_ATTEMPTNUMBER)
  private Integer attemptnumber;

  public static final String SERIALIZED_NAME_GRADINGSTATUS = "gradingstatus";
  @SerializedName(SERIALIZED_NAME_GRADINGSTATUS)
  private String gradingstatus;

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LATEST = "latest";
  @SerializedName(SERIALIZED_NAME_LATEST)
  private Integer latest;

  public static final String SERIALIZED_NAME_PLUGINS = "plugins";
  @SerializedName(SERIALIZED_NAME_PLUGINS)
  private List<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner> plugins = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_TIMESTARTED = "timestarted";
  @SerializedName(SERIALIZED_NAME_TIMESTARTED)
  private Integer timestarted;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission() {
  }

  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission assignment(Integer assignment) {
    this.assignment = assignment;
    return this;
  }

   /**
   * assignment id
   * @return assignment
  **/
  @javax.annotation.Nullable
  public Integer getAssignment() {
    return assignment;
  }

  public void setAssignment(Integer assignment) {
    this.assignment = assignment;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission attemptnumber(Integer attemptnumber) {
    this.attemptnumber = attemptnumber;
    return this;
  }

   /**
   * attempt number
   * @return attemptnumber
  **/
  @javax.annotation.Nonnull
  public Integer getAttemptnumber() {
    return attemptnumber;
  }

  public void setAttemptnumber(Integer attemptnumber) {
    this.attemptnumber = attemptnumber;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission gradingstatus(String gradingstatus) {
    this.gradingstatus = gradingstatus;
    return this;
  }

   /**
   * Grading status.
   * @return gradingstatus
  **/
  @javax.annotation.Nullable
  public String getGradingstatus() {
    return gradingstatus;
  }

  public void setGradingstatus(String gradingstatus) {
    this.gradingstatus = gradingstatus;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * group id
   * @return groupid
  **/
  @javax.annotation.Nonnull
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * submission id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission latest(Integer latest) {
    this.latest = latest;
    return this;
  }

   /**
   * latest attempt
   * @return latest
  **/
  @javax.annotation.Nullable
  public Integer getLatest() {
    return latest;
  }

  public void setLatest(Integer latest) {
    this.latest = latest;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission plugins(List<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner> plugins) {
    this.plugins = plugins;
    return this;
  }

  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission addPluginsItem(ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

   /**
   * Get plugins
   * @return plugins
  **/
  @javax.annotation.Nullable
  public List<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner> plugins) {
    this.plugins = plugins;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission status(String status) {
    this.status = status;
    return this;
  }

   /**
   * submission status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * submission creation time
   * @return timecreated
  **/
  @javax.annotation.Nonnull
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * submission last modified time
   * @return timemodified
  **/
  @javax.annotation.Nonnull
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission timestarted(Integer timestarted) {
    this.timestarted = timestarted;
    return this;
  }

   /**
   * submission start time
   * @return timestarted
  **/
  @javax.annotation.Nullable
  public Integer getTimestarted() {
    return timestarted;
  }

  public void setTimestarted(Integer timestarted) {
    this.timestarted = timestarted;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * student id
   * @return userid
  **/
  @javax.annotation.Nonnull
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
    ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission = (ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission) o;
    return Objects.equals(this.assignment, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.assignment) &&
        Objects.equals(this.attemptnumber, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.attemptnumber) &&
        Objects.equals(this.gradingstatus, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.gradingstatus) &&
        Objects.equals(this.groupid, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.groupid) &&
        Objects.equals(this.id, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.id) &&
        Objects.equals(this.latest, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.latest) &&
        Objects.equals(this.plugins, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.plugins) &&
        Objects.equals(this.status, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.status) &&
        Objects.equals(this.timecreated, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.timecreated) &&
        Objects.equals(this.timemodified, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.timemodified) &&
        Objects.equals(this.timestarted, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.timestarted) &&
        Objects.equals(this.userid, modAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignment, attemptnumber, gradingstatus, groupid, id, latest, plugins, status, timecreated, timemodified, timestarted, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission {\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    attemptnumber: ").append(toIndentedString(attemptnumber)).append("\n");
    sb.append("    gradingstatus: ").append(toIndentedString(gradingstatus)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    timestarted: ").append(toIndentedString(timestarted)).append("\n");
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
    openapiFields.add("assignment");
    openapiFields.add("attemptnumber");
    openapiFields.add("gradingstatus");
    openapiFields.add("groupid");
    openapiFields.add("id");
    openapiFields.add("latest");
    openapiFields.add("plugins");
    openapiFields.add("status");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("timestarted");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attemptnumber");
    openapiRequiredFields.add("groupid");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission is not found in the empty JSON string", ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gradingstatus") != null && !jsonObj.get("gradingstatus").isJsonNull()) && !jsonObj.get("gradingstatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gradingstatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gradingstatus").toString()));
      }
      if (jsonObj.get("plugins") != null && !jsonObj.get("plugins").isJsonNull()) {
        JsonArray jsonArrayplugins = jsonObj.getAsJsonArray("plugins");
        if (jsonArrayplugins != null) {
          // ensure the json data is an array
          if (!jsonObj.get("plugins").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `plugins` to be an array in the JSON string but got `%s`", jsonObj.get("plugins").toString()));
          }

          // validate the optional field `plugins` (array)
          for (int i = 0; i < jsonArrayplugins.size(); i++) {
            ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.validateJsonElement(jsonArrayplugins.get(i));
          };
        }
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission
  */
  public static ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


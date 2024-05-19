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
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseLastattemptSubmission;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission;

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
 * ModAssignGetSubmissionStatus200ResponseLastattempt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200ResponseLastattempt {
  public static final String SERIALIZED_NAME_BLINDMARKING = "blindmarking";
  @SerializedName(SERIALIZED_NAME_BLINDMARKING)
  private Boolean blindmarking = null;

  public static final String SERIALIZED_NAME_CANEDIT = "canedit";
  @SerializedName(SERIALIZED_NAME_CANEDIT)
  private Boolean canedit = null;

  public static final String SERIALIZED_NAME_CANEDITOWNER = "caneditowner";
  @SerializedName(SERIALIZED_NAME_CANEDITOWNER)
  private Boolean caneditowner = null;

  public static final String SERIALIZED_NAME_CANSUBMIT = "cansubmit";
  @SerializedName(SERIALIZED_NAME_CANSUBMIT)
  private Boolean cansubmit = null;

  public static final String SERIALIZED_NAME_EXTENSIONDUEDATE = "extensionduedate";
  @SerializedName(SERIALIZED_NAME_EXTENSIONDUEDATE)
  private Integer extensionduedate = null;

  public static final String SERIALIZED_NAME_GRADED = "graded";
  @SerializedName(SERIALIZED_NAME_GRADED)
  private Boolean graded = null;

  public static final String SERIALIZED_NAME_GRADINGSTATUS = "gradingstatus";
  @SerializedName(SERIALIZED_NAME_GRADINGSTATUS)
  private String gradingstatus = "null";

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked = null;

  public static final String SERIALIZED_NAME_SUBMISSION = "submission";
  @SerializedName(SERIALIZED_NAME_SUBMISSION)
  private ModAssignGetSubmissionStatus200ResponseLastattemptSubmission submission;

  public static final String SERIALIZED_NAME_SUBMISSIONGROUP = "submissiongroup";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONGROUP)
  private Integer submissiongroup = null;

  public static final String SERIALIZED_NAME_SUBMISSIONGROUPMEMBERSWHONEEDTOSUBMIT = "submissiongroupmemberswhoneedtosubmit";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONGROUPMEMBERSWHONEEDTOSUBMIT)
  private List<Object> submissiongroupmemberswhoneedtosubmit = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBMISSIONSENABLED = "submissionsenabled";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONSENABLED)
  private Boolean submissionsenabled;

  public static final String SERIALIZED_NAME_TEAMSUBMISSION = "teamsubmission";
  @SerializedName(SERIALIZED_NAME_TEAMSUBMISSION)
  private ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission teamsubmission;

  public static final String SERIALIZED_NAME_TIMELIMIT = "timelimit";
  @SerializedName(SERIALIZED_NAME_TIMELIMIT)
  private Integer timelimit = null;

  public static final String SERIALIZED_NAME_USERGROUPS = "usergroups";
  @SerializedName(SERIALIZED_NAME_USERGROUPS)
  private List<Object> usergroups = new ArrayList<>();

  public ModAssignGetSubmissionStatus200ResponseLastattempt() {
  }

  public ModAssignGetSubmissionStatus200ResponseLastattempt blindmarking(Boolean blindmarking) {
    this.blindmarking = blindmarking;
    return this;
  }

   /**
   * Whether blind marking is enabled.
   * @return blindmarking
  **/
  @javax.annotation.Nonnull
  public Boolean getBlindmarking() {
    return blindmarking;
  }

  public void setBlindmarking(Boolean blindmarking) {
    this.blindmarking = blindmarking;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt canedit(Boolean canedit) {
    this.canedit = canedit;
    return this;
  }

   /**
   * Whether the user can edit the current submission.
   * @return canedit
  **/
  @javax.annotation.Nonnull
  public Boolean getCanedit() {
    return canedit;
  }

  public void setCanedit(Boolean canedit) {
    this.canedit = canedit;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt caneditowner(Boolean caneditowner) {
    this.caneditowner = caneditowner;
    return this;
  }

   /**
   * Whether the owner of the submission can edit it.
   * @return caneditowner
  **/
  @javax.annotation.Nonnull
  public Boolean getCaneditowner() {
    return caneditowner;
  }

  public void setCaneditowner(Boolean caneditowner) {
    this.caneditowner = caneditowner;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt cansubmit(Boolean cansubmit) {
    this.cansubmit = cansubmit;
    return this;
  }

   /**
   * Whether the user can submit.
   * @return cansubmit
  **/
  @javax.annotation.Nonnull
  public Boolean getCansubmit() {
    return cansubmit;
  }

  public void setCansubmit(Boolean cansubmit) {
    this.cansubmit = cansubmit;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt extensionduedate(Integer extensionduedate) {
    this.extensionduedate = extensionduedate;
    return this;
  }

   /**
   * Extension due date.
   * @return extensionduedate
  **/
  @javax.annotation.Nonnull
  public Integer getExtensionduedate() {
    return extensionduedate;
  }

  public void setExtensionduedate(Integer extensionduedate) {
    this.extensionduedate = extensionduedate;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt graded(Boolean graded) {
    this.graded = graded;
    return this;
  }

   /**
   * Whether the submission is graded.
   * @return graded
  **/
  @javax.annotation.Nonnull
  public Boolean getGraded() {
    return graded;
  }

  public void setGraded(Boolean graded) {
    this.graded = graded;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt gradingstatus(String gradingstatus) {
    this.gradingstatus = gradingstatus;
    return this;
  }

   /**
   * Grading status.
   * @return gradingstatus
  **/
  @javax.annotation.Nonnull
  public String getGradingstatus() {
    return gradingstatus;
  }

  public void setGradingstatus(String gradingstatus) {
    this.gradingstatus = gradingstatus;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether new submissions are locked.
   * @return locked
  **/
  @javax.annotation.Nonnull
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt submission(ModAssignGetSubmissionStatus200ResponseLastattemptSubmission submission) {
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @javax.annotation.Nullable
  public ModAssignGetSubmissionStatus200ResponseLastattemptSubmission getSubmission() {
    return submission;
  }

  public void setSubmission(ModAssignGetSubmissionStatus200ResponseLastattemptSubmission submission) {
    this.submission = submission;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt submissiongroup(Integer submissiongroup) {
    this.submissiongroup = submissiongroup;
    return this;
  }

   /**
   * The submission group id (for group submissions only).
   * @return submissiongroup
  **/
  @javax.annotation.Nullable
  public Integer getSubmissiongroup() {
    return submissiongroup;
  }

  public void setSubmissiongroup(Integer submissiongroup) {
    this.submissiongroup = submissiongroup;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt submissiongroupmemberswhoneedtosubmit(List<Object> submissiongroupmemberswhoneedtosubmit) {
    this.submissiongroupmemberswhoneedtosubmit = submissiongroupmemberswhoneedtosubmit;
    return this;
  }

  public ModAssignGetSubmissionStatus200ResponseLastattempt addSubmissiongroupmemberswhoneedtosubmitItem(Object submissiongroupmemberswhoneedtosubmitItem) {
    if (this.submissiongroupmemberswhoneedtosubmit == null) {
      this.submissiongroupmemberswhoneedtosubmit = new ArrayList<>();
    }
    this.submissiongroupmemberswhoneedtosubmit.add(submissiongroupmemberswhoneedtosubmitItem);
    return this;
  }

   /**
   * Get submissiongroupmemberswhoneedtosubmit
   * @return submissiongroupmemberswhoneedtosubmit
  **/
  @javax.annotation.Nullable
  public List<Object> getSubmissiongroupmemberswhoneedtosubmit() {
    return submissiongroupmemberswhoneedtosubmit;
  }

  public void setSubmissiongroupmemberswhoneedtosubmit(List<Object> submissiongroupmemberswhoneedtosubmit) {
    this.submissiongroupmemberswhoneedtosubmit = submissiongroupmemberswhoneedtosubmit;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt submissionsenabled(Boolean submissionsenabled) {
    this.submissionsenabled = submissionsenabled;
    return this;
  }

   /**
   * Whether submissions are enabled or not.
   * @return submissionsenabled
  **/
  @javax.annotation.Nonnull
  public Boolean getSubmissionsenabled() {
    return submissionsenabled;
  }

  public void setSubmissionsenabled(Boolean submissionsenabled) {
    this.submissionsenabled = submissionsenabled;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt teamsubmission(ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission teamsubmission) {
    this.teamsubmission = teamsubmission;
    return this;
  }

   /**
   * Get teamsubmission
   * @return teamsubmission
  **/
  @javax.annotation.Nullable
  public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission getTeamsubmission() {
    return teamsubmission;
  }

  public void setTeamsubmission(ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission teamsubmission) {
    this.teamsubmission = teamsubmission;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt timelimit(Integer timelimit) {
    this.timelimit = timelimit;
    return this;
  }

   /**
   * Time limit for submission.
   * @return timelimit
  **/
  @javax.annotation.Nullable
  public Integer getTimelimit() {
    return timelimit;
  }

  public void setTimelimit(Integer timelimit) {
    this.timelimit = timelimit;
  }


  public ModAssignGetSubmissionStatus200ResponseLastattempt usergroups(List<Object> usergroups) {
    this.usergroups = usergroups;
    return this;
  }

  public ModAssignGetSubmissionStatus200ResponseLastattempt addUsergroupsItem(Object usergroupsItem) {
    if (this.usergroups == null) {
      this.usergroups = new ArrayList<>();
    }
    this.usergroups.add(usergroupsItem);
    return this;
  }

   /**
   * Get usergroups
   * @return usergroups
  **/
  @javax.annotation.Nonnull
  public List<Object> getUsergroups() {
    return usergroups;
  }

  public void setUsergroups(List<Object> usergroups) {
    this.usergroups = usergroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetSubmissionStatus200ResponseLastattempt modAssignGetSubmissionStatus200ResponseLastattempt = (ModAssignGetSubmissionStatus200ResponseLastattempt) o;
    return Objects.equals(this.blindmarking, modAssignGetSubmissionStatus200ResponseLastattempt.blindmarking) &&
        Objects.equals(this.canedit, modAssignGetSubmissionStatus200ResponseLastattempt.canedit) &&
        Objects.equals(this.caneditowner, modAssignGetSubmissionStatus200ResponseLastattempt.caneditowner) &&
        Objects.equals(this.cansubmit, modAssignGetSubmissionStatus200ResponseLastattempt.cansubmit) &&
        Objects.equals(this.extensionduedate, modAssignGetSubmissionStatus200ResponseLastattempt.extensionduedate) &&
        Objects.equals(this.graded, modAssignGetSubmissionStatus200ResponseLastattempt.graded) &&
        Objects.equals(this.gradingstatus, modAssignGetSubmissionStatus200ResponseLastattempt.gradingstatus) &&
        Objects.equals(this.locked, modAssignGetSubmissionStatus200ResponseLastattempt.locked) &&
        Objects.equals(this.submission, modAssignGetSubmissionStatus200ResponseLastattempt.submission) &&
        Objects.equals(this.submissiongroup, modAssignGetSubmissionStatus200ResponseLastattempt.submissiongroup) &&
        Objects.equals(this.submissiongroupmemberswhoneedtosubmit, modAssignGetSubmissionStatus200ResponseLastattempt.submissiongroupmemberswhoneedtosubmit) &&
        Objects.equals(this.submissionsenabled, modAssignGetSubmissionStatus200ResponseLastattempt.submissionsenabled) &&
        Objects.equals(this.teamsubmission, modAssignGetSubmissionStatus200ResponseLastattempt.teamsubmission) &&
        Objects.equals(this.timelimit, modAssignGetSubmissionStatus200ResponseLastattempt.timelimit) &&
        Objects.equals(this.usergroups, modAssignGetSubmissionStatus200ResponseLastattempt.usergroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blindmarking, canedit, caneditowner, cansubmit, extensionduedate, graded, gradingstatus, locked, submission, submissiongroup, submissiongroupmemberswhoneedtosubmit, submissionsenabled, teamsubmission, timelimit, usergroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200ResponseLastattempt {\n");
    sb.append("    blindmarking: ").append(toIndentedString(blindmarking)).append("\n");
    sb.append("    canedit: ").append(toIndentedString(canedit)).append("\n");
    sb.append("    caneditowner: ").append(toIndentedString(caneditowner)).append("\n");
    sb.append("    cansubmit: ").append(toIndentedString(cansubmit)).append("\n");
    sb.append("    extensionduedate: ").append(toIndentedString(extensionduedate)).append("\n");
    sb.append("    graded: ").append(toIndentedString(graded)).append("\n");
    sb.append("    gradingstatus: ").append(toIndentedString(gradingstatus)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    submissiongroup: ").append(toIndentedString(submissiongroup)).append("\n");
    sb.append("    submissiongroupmemberswhoneedtosubmit: ").append(toIndentedString(submissiongroupmemberswhoneedtosubmit)).append("\n");
    sb.append("    submissionsenabled: ").append(toIndentedString(submissionsenabled)).append("\n");
    sb.append("    teamsubmission: ").append(toIndentedString(teamsubmission)).append("\n");
    sb.append("    timelimit: ").append(toIndentedString(timelimit)).append("\n");
    sb.append("    usergroups: ").append(toIndentedString(usergroups)).append("\n");
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
    openapiFields.add("blindmarking");
    openapiFields.add("canedit");
    openapiFields.add("caneditowner");
    openapiFields.add("cansubmit");
    openapiFields.add("extensionduedate");
    openapiFields.add("graded");
    openapiFields.add("gradingstatus");
    openapiFields.add("locked");
    openapiFields.add("submission");
    openapiFields.add("submissiongroup");
    openapiFields.add("submissiongroupmemberswhoneedtosubmit");
    openapiFields.add("submissionsenabled");
    openapiFields.add("teamsubmission");
    openapiFields.add("timelimit");
    openapiFields.add("usergroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blindmarking");
    openapiRequiredFields.add("canedit");
    openapiRequiredFields.add("caneditowner");
    openapiRequiredFields.add("cansubmit");
    openapiRequiredFields.add("extensionduedate");
    openapiRequiredFields.add("graded");
    openapiRequiredFields.add("gradingstatus");
    openapiRequiredFields.add("locked");
    openapiRequiredFields.add("submissionsenabled");
    openapiRequiredFields.add("usergroups");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200ResponseLastattempt
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200ResponseLastattempt.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200ResponseLastattempt is not found in the empty JSON string", ModAssignGetSubmissionStatus200ResponseLastattempt.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200ResponseLastattempt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200ResponseLastattempt` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModAssignGetSubmissionStatus200ResponseLastattempt.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("gradingstatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gradingstatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gradingstatus").toString()));
      }
      // validate the optional field `submission`
      if (jsonObj.get("submission") != null && !jsonObj.get("submission").isJsonNull()) {
        ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.validateJsonElement(jsonObj.get("submission"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("submissiongroupmemberswhoneedtosubmit") != null && !jsonObj.get("submissiongroupmemberswhoneedtosubmit").isJsonNull() && !jsonObj.get("submissiongroupmemberswhoneedtosubmit").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `submissiongroupmemberswhoneedtosubmit` to be an array in the JSON string but got `%s`", jsonObj.get("submissiongroupmemberswhoneedtosubmit").toString()));
      }
      // validate the optional field `teamsubmission`
      if (jsonObj.get("teamsubmission") != null && !jsonObj.get("teamsubmission").isJsonNull()) {
        ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.validateJsonElement(jsonObj.get("teamsubmission"));
      }
      // ensure the required json array is present
      if (jsonObj.get("usergroups") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("usergroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usergroups` to be an array in the JSON string but got `%s`", jsonObj.get("usergroups").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200ResponseLastattempt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200ResponseLastattempt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200ResponseLastattempt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200ResponseLastattempt.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200ResponseLastattempt>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200ResponseLastattempt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200ResponseLastattempt read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200ResponseLastattempt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200ResponseLastattempt
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200ResponseLastattempt
  */
  public static ModAssignGetSubmissionStatus200ResponseLastattempt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200ResponseLastattempt.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200ResponseLastattempt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


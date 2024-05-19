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
 * ModAssignGetSubmissionStatus200ResponseGradingsummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200ResponseGradingsummary {
  public static final String SERIALIZED_NAME_PARTICIPANTCOUNT = "participantcount";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTCOUNT)
  private Integer participantcount = null;

  public static final String SERIALIZED_NAME_SUBMISSIONDRAFTSCOUNT = "submissiondraftscount";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONDRAFTSCOUNT)
  private Integer submissiondraftscount = null;

  public static final String SERIALIZED_NAME_SUBMISSIONSENABLED = "submissionsenabled";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONSENABLED)
  private Boolean submissionsenabled = null;

  public static final String SERIALIZED_NAME_SUBMISSIONSNEEDGRADINGCOUNT = "submissionsneedgradingcount";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONSNEEDGRADINGCOUNT)
  private Integer submissionsneedgradingcount = null;

  public static final String SERIALIZED_NAME_SUBMISSIONSSUBMITTEDCOUNT = "submissionssubmittedcount";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONSSUBMITTEDCOUNT)
  private Integer submissionssubmittedcount = null;

  public static final String SERIALIZED_NAME_WARNOFUNGROUPEDUSERS = "warnofungroupedusers";
  @SerializedName(SERIALIZED_NAME_WARNOFUNGROUPEDUSERS)
  private String warnofungroupedusers = "null";

  public ModAssignGetSubmissionStatus200ResponseGradingsummary() {
  }

  public ModAssignGetSubmissionStatus200ResponseGradingsummary participantcount(Integer participantcount) {
    this.participantcount = participantcount;
    return this;
  }

   /**
   * Number of users who can submit.
   * @return participantcount
  **/
  @javax.annotation.Nonnull
  public Integer getParticipantcount() {
    return participantcount;
  }

  public void setParticipantcount(Integer participantcount) {
    this.participantcount = participantcount;
  }


  public ModAssignGetSubmissionStatus200ResponseGradingsummary submissiondraftscount(Integer submissiondraftscount) {
    this.submissiondraftscount = submissiondraftscount;
    return this;
  }

   /**
   * Number of submissions in draft status.
   * @return submissiondraftscount
  **/
  @javax.annotation.Nonnull
  public Integer getSubmissiondraftscount() {
    return submissiondraftscount;
  }

  public void setSubmissiondraftscount(Integer submissiondraftscount) {
    this.submissiondraftscount = submissiondraftscount;
  }


  public ModAssignGetSubmissionStatus200ResponseGradingsummary submissionsenabled(Boolean submissionsenabled) {
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


  public ModAssignGetSubmissionStatus200ResponseGradingsummary submissionsneedgradingcount(Integer submissionsneedgradingcount) {
    this.submissionsneedgradingcount = submissionsneedgradingcount;
    return this;
  }

   /**
   * Number of submissions that need grading.
   * @return submissionsneedgradingcount
  **/
  @javax.annotation.Nonnull
  public Integer getSubmissionsneedgradingcount() {
    return submissionsneedgradingcount;
  }

  public void setSubmissionsneedgradingcount(Integer submissionsneedgradingcount) {
    this.submissionsneedgradingcount = submissionsneedgradingcount;
  }


  public ModAssignGetSubmissionStatus200ResponseGradingsummary submissionssubmittedcount(Integer submissionssubmittedcount) {
    this.submissionssubmittedcount = submissionssubmittedcount;
    return this;
  }

   /**
   * Number of submissions in submitted status.
   * @return submissionssubmittedcount
  **/
  @javax.annotation.Nonnull
  public Integer getSubmissionssubmittedcount() {
    return submissionssubmittedcount;
  }

  public void setSubmissionssubmittedcount(Integer submissionssubmittedcount) {
    this.submissionssubmittedcount = submissionssubmittedcount;
  }


  public ModAssignGetSubmissionStatus200ResponseGradingsummary warnofungroupedusers(String warnofungroupedusers) {
    this.warnofungroupedusers = warnofungroupedusers;
    return this;
  }

   /**
   * Whether we need to warn people that there                                                                         are users without groups (&#39;warningrequired&#39;), warn                                                                         people there are users who will submit in the default                                                                         group (&#39;warningoptional&#39;) or no warning (&#39;&#39;).
   * @return warnofungroupedusers
  **/
  @javax.annotation.Nonnull
  public String getWarnofungroupedusers() {
    return warnofungroupedusers;
  }

  public void setWarnofungroupedusers(String warnofungroupedusers) {
    this.warnofungroupedusers = warnofungroupedusers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetSubmissionStatus200ResponseGradingsummary modAssignGetSubmissionStatus200ResponseGradingsummary = (ModAssignGetSubmissionStatus200ResponseGradingsummary) o;
    return Objects.equals(this.participantcount, modAssignGetSubmissionStatus200ResponseGradingsummary.participantcount) &&
        Objects.equals(this.submissiondraftscount, modAssignGetSubmissionStatus200ResponseGradingsummary.submissiondraftscount) &&
        Objects.equals(this.submissionsenabled, modAssignGetSubmissionStatus200ResponseGradingsummary.submissionsenabled) &&
        Objects.equals(this.submissionsneedgradingcount, modAssignGetSubmissionStatus200ResponseGradingsummary.submissionsneedgradingcount) &&
        Objects.equals(this.submissionssubmittedcount, modAssignGetSubmissionStatus200ResponseGradingsummary.submissionssubmittedcount) &&
        Objects.equals(this.warnofungroupedusers, modAssignGetSubmissionStatus200ResponseGradingsummary.warnofungroupedusers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantcount, submissiondraftscount, submissionsenabled, submissionsneedgradingcount, submissionssubmittedcount, warnofungroupedusers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200ResponseGradingsummary {\n");
    sb.append("    participantcount: ").append(toIndentedString(participantcount)).append("\n");
    sb.append("    submissiondraftscount: ").append(toIndentedString(submissiondraftscount)).append("\n");
    sb.append("    submissionsenabled: ").append(toIndentedString(submissionsenabled)).append("\n");
    sb.append("    submissionsneedgradingcount: ").append(toIndentedString(submissionsneedgradingcount)).append("\n");
    sb.append("    submissionssubmittedcount: ").append(toIndentedString(submissionssubmittedcount)).append("\n");
    sb.append("    warnofungroupedusers: ").append(toIndentedString(warnofungroupedusers)).append("\n");
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
    openapiFields.add("participantcount");
    openapiFields.add("submissiondraftscount");
    openapiFields.add("submissionsenabled");
    openapiFields.add("submissionsneedgradingcount");
    openapiFields.add("submissionssubmittedcount");
    openapiFields.add("warnofungroupedusers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("participantcount");
    openapiRequiredFields.add("submissiondraftscount");
    openapiRequiredFields.add("submissionsenabled");
    openapiRequiredFields.add("submissionsneedgradingcount");
    openapiRequiredFields.add("submissionssubmittedcount");
    openapiRequiredFields.add("warnofungroupedusers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200ResponseGradingsummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200ResponseGradingsummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200ResponseGradingsummary is not found in the empty JSON string", ModAssignGetSubmissionStatus200ResponseGradingsummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200ResponseGradingsummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200ResponseGradingsummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModAssignGetSubmissionStatus200ResponseGradingsummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("warnofungroupedusers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warnofungroupedusers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warnofungroupedusers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200ResponseGradingsummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200ResponseGradingsummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200ResponseGradingsummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200ResponseGradingsummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200ResponseGradingsummary>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200ResponseGradingsummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200ResponseGradingsummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200ResponseGradingsummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200ResponseGradingsummary
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200ResponseGradingsummary
  */
  public static ModAssignGetSubmissionStatus200ResponseGradingsummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200ResponseGradingsummary.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200ResponseGradingsummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * ModWorkshopEvaluateSubmissionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWorkshopEvaluateSubmissionRequest {
  public static final String SERIALIZED_NAME_FEEDBACKFORMAT = "feedbackformat";
  @SerializedName(SERIALIZED_NAME_FEEDBACKFORMAT)
  private Integer feedbackformat = 0;

  public static final String SERIALIZED_NAME_FEEDBACKTEXT = "feedbacktext";
  @SerializedName(SERIALIZED_NAME_FEEDBACKTEXT)
  private String feedbacktext = "";

  public static final String SERIALIZED_NAME_GRADEOVER = "gradeover";
  @SerializedName(SERIALIZED_NAME_GRADEOVER)
  private String gradeover = "";

  public static final String SERIALIZED_NAME_PUBLISHED = "published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED)
  private Boolean published = false;

  public static final String SERIALIZED_NAME_SUBMISSIONID = "submissionid";
  @SerializedName(SERIALIZED_NAME_SUBMISSIONID)
  private Integer submissionid = null;

  public ModWorkshopEvaluateSubmissionRequest() {
  }

  public ModWorkshopEvaluateSubmissionRequest feedbackformat(Integer feedbackformat) {
    this.feedbackformat = feedbackformat;
    return this;
  }

   /**
   * The feedback format for text.
   * @return feedbackformat
  **/
  @javax.annotation.Nullable
  public Integer getFeedbackformat() {
    return feedbackformat;
  }

  public void setFeedbackformat(Integer feedbackformat) {
    this.feedbackformat = feedbackformat;
  }


  public ModWorkshopEvaluateSubmissionRequest feedbacktext(String feedbacktext) {
    this.feedbacktext = feedbacktext;
    return this;
  }

   /**
   * The feedback for the author.
   * @return feedbacktext
  **/
  @javax.annotation.Nullable
  public String getFeedbacktext() {
    return feedbacktext;
  }

  public void setFeedbacktext(String feedbacktext) {
    this.feedbacktext = feedbacktext;
  }


  public ModWorkshopEvaluateSubmissionRequest gradeover(String gradeover) {
    this.gradeover = gradeover;
    return this;
  }

   /**
   * The new submission grade.
   * @return gradeover
  **/
  @javax.annotation.Nullable
  public String getGradeover() {
    return gradeover;
  }

  public void setGradeover(String gradeover) {
    this.gradeover = gradeover;
  }


  public ModWorkshopEvaluateSubmissionRequest published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Publish the submission for others?.
   * @return published
  **/
  @javax.annotation.Nullable
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }


  public ModWorkshopEvaluateSubmissionRequest submissionid(Integer submissionid) {
    this.submissionid = submissionid;
    return this;
  }

   /**
   * submission id.
   * @return submissionid
  **/
  @javax.annotation.Nonnull
  public Integer getSubmissionid() {
    return submissionid;
  }

  public void setSubmissionid(Integer submissionid) {
    this.submissionid = submissionid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModWorkshopEvaluateSubmissionRequest modWorkshopEvaluateSubmissionRequest = (ModWorkshopEvaluateSubmissionRequest) o;
    return Objects.equals(this.feedbackformat, modWorkshopEvaluateSubmissionRequest.feedbackformat) &&
        Objects.equals(this.feedbacktext, modWorkshopEvaluateSubmissionRequest.feedbacktext) &&
        Objects.equals(this.gradeover, modWorkshopEvaluateSubmissionRequest.gradeover) &&
        Objects.equals(this.published, modWorkshopEvaluateSubmissionRequest.published) &&
        Objects.equals(this.submissionid, modWorkshopEvaluateSubmissionRequest.submissionid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackformat, feedbacktext, gradeover, published, submissionid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWorkshopEvaluateSubmissionRequest {\n");
    sb.append("    feedbackformat: ").append(toIndentedString(feedbackformat)).append("\n");
    sb.append("    feedbacktext: ").append(toIndentedString(feedbacktext)).append("\n");
    sb.append("    gradeover: ").append(toIndentedString(gradeover)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    submissionid: ").append(toIndentedString(submissionid)).append("\n");
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
    openapiFields.add("feedbackformat");
    openapiFields.add("feedbacktext");
    openapiFields.add("gradeover");
    openapiFields.add("published");
    openapiFields.add("submissionid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("submissionid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWorkshopEvaluateSubmissionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWorkshopEvaluateSubmissionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWorkshopEvaluateSubmissionRequest is not found in the empty JSON string", ModWorkshopEvaluateSubmissionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWorkshopEvaluateSubmissionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWorkshopEvaluateSubmissionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModWorkshopEvaluateSubmissionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("feedbacktext") != null && !jsonObj.get("feedbacktext").isJsonNull()) && !jsonObj.get("feedbacktext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbacktext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedbacktext").toString()));
      }
      if ((jsonObj.get("gradeover") != null && !jsonObj.get("gradeover").isJsonNull()) && !jsonObj.get("gradeover").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gradeover` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gradeover").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModWorkshopEvaluateSubmissionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWorkshopEvaluateSubmissionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWorkshopEvaluateSubmissionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWorkshopEvaluateSubmissionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWorkshopEvaluateSubmissionRequest>() {
           @Override
           public void write(JsonWriter out, ModWorkshopEvaluateSubmissionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWorkshopEvaluateSubmissionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWorkshopEvaluateSubmissionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWorkshopEvaluateSubmissionRequest
  * @throws IOException if the JSON string is invalid with respect to ModWorkshopEvaluateSubmissionRequest
  */
  public static ModWorkshopEvaluateSubmissionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWorkshopEvaluateSubmissionRequest.class);
  }

 /**
  * Convert an instance of ModWorkshopEvaluateSubmissionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


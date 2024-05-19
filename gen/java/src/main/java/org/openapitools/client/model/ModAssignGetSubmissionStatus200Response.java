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
import org.openapitools.client.model.AuthEmailSignupUser200ResponseWarningsInner;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseAssignmentdata;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseFeedback;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseGradingsummary;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseLastattempt;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner;

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
 * ModAssignGetSubmissionStatus200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200Response {
  public static final String SERIALIZED_NAME_ASSIGNMENTDATA = "assignmentdata";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTDATA)
  private ModAssignGetSubmissionStatus200ResponseAssignmentdata assignmentdata;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private ModAssignGetSubmissionStatus200ResponseFeedback feedback;

  public static final String SERIALIZED_NAME_GRADINGSUMMARY = "gradingsummary";
  @SerializedName(SERIALIZED_NAME_GRADINGSUMMARY)
  private ModAssignGetSubmissionStatus200ResponseGradingsummary gradingsummary;

  public static final String SERIALIZED_NAME_LASTATTEMPT = "lastattempt";
  @SerializedName(SERIALIZED_NAME_LASTATTEMPT)
  private ModAssignGetSubmissionStatus200ResponseLastattempt lastattempt;

  public static final String SERIALIZED_NAME_PREVIOUSATTEMPTS = "previousattempts";
  @SerializedName(SERIALIZED_NAME_PREVIOUSATTEMPTS)
  private List<ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner> previousattempts = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModAssignGetSubmissionStatus200Response() {
  }

  public ModAssignGetSubmissionStatus200Response assignmentdata(ModAssignGetSubmissionStatus200ResponseAssignmentdata assignmentdata) {
    this.assignmentdata = assignmentdata;
    return this;
  }

   /**
   * Get assignmentdata
   * @return assignmentdata
  **/
  @javax.annotation.Nullable
  public ModAssignGetSubmissionStatus200ResponseAssignmentdata getAssignmentdata() {
    return assignmentdata;
  }

  public void setAssignmentdata(ModAssignGetSubmissionStatus200ResponseAssignmentdata assignmentdata) {
    this.assignmentdata = assignmentdata;
  }


  public ModAssignGetSubmissionStatus200Response feedback(ModAssignGetSubmissionStatus200ResponseFeedback feedback) {
    this.feedback = feedback;
    return this;
  }

   /**
   * Get feedback
   * @return feedback
  **/
  @javax.annotation.Nullable
  public ModAssignGetSubmissionStatus200ResponseFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(ModAssignGetSubmissionStatus200ResponseFeedback feedback) {
    this.feedback = feedback;
  }


  public ModAssignGetSubmissionStatus200Response gradingsummary(ModAssignGetSubmissionStatus200ResponseGradingsummary gradingsummary) {
    this.gradingsummary = gradingsummary;
    return this;
  }

   /**
   * Get gradingsummary
   * @return gradingsummary
  **/
  @javax.annotation.Nullable
  public ModAssignGetSubmissionStatus200ResponseGradingsummary getGradingsummary() {
    return gradingsummary;
  }

  public void setGradingsummary(ModAssignGetSubmissionStatus200ResponseGradingsummary gradingsummary) {
    this.gradingsummary = gradingsummary;
  }


  public ModAssignGetSubmissionStatus200Response lastattempt(ModAssignGetSubmissionStatus200ResponseLastattempt lastattempt) {
    this.lastattempt = lastattempt;
    return this;
  }

   /**
   * Get lastattempt
   * @return lastattempt
  **/
  @javax.annotation.Nullable
  public ModAssignGetSubmissionStatus200ResponseLastattempt getLastattempt() {
    return lastattempt;
  }

  public void setLastattempt(ModAssignGetSubmissionStatus200ResponseLastattempt lastattempt) {
    this.lastattempt = lastattempt;
  }


  public ModAssignGetSubmissionStatus200Response previousattempts(List<ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner> previousattempts) {
    this.previousattempts = previousattempts;
    return this;
  }

  public ModAssignGetSubmissionStatus200Response addPreviousattemptsItem(ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner previousattemptsItem) {
    if (this.previousattempts == null) {
      this.previousattempts = new ArrayList<>();
    }
    this.previousattempts.add(previousattemptsItem);
    return this;
  }

   /**
   * Get previousattempts
   * @return previousattempts
  **/
  @javax.annotation.Nullable
  public List<ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner> getPreviousattempts() {
    return previousattempts;
  }

  public void setPreviousattempts(List<ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner> previousattempts) {
    this.previousattempts = previousattempts;
  }


  public ModAssignGetSubmissionStatus200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModAssignGetSubmissionStatus200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  public List<AuthEmailSignupUser200ResponseWarningsInner> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetSubmissionStatus200Response modAssignGetSubmissionStatus200Response = (ModAssignGetSubmissionStatus200Response) o;
    return Objects.equals(this.assignmentdata, modAssignGetSubmissionStatus200Response.assignmentdata) &&
        Objects.equals(this.feedback, modAssignGetSubmissionStatus200Response.feedback) &&
        Objects.equals(this.gradingsummary, modAssignGetSubmissionStatus200Response.gradingsummary) &&
        Objects.equals(this.lastattempt, modAssignGetSubmissionStatus200Response.lastattempt) &&
        Objects.equals(this.previousattempts, modAssignGetSubmissionStatus200Response.previousattempts) &&
        Objects.equals(this.warnings, modAssignGetSubmissionStatus200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentdata, feedback, gradingsummary, lastattempt, previousattempts, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200Response {\n");
    sb.append("    assignmentdata: ").append(toIndentedString(assignmentdata)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    gradingsummary: ").append(toIndentedString(gradingsummary)).append("\n");
    sb.append("    lastattempt: ").append(toIndentedString(lastattempt)).append("\n");
    sb.append("    previousattempts: ").append(toIndentedString(previousattempts)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("assignmentdata");
    openapiFields.add("feedback");
    openapiFields.add("gradingsummary");
    openapiFields.add("lastattempt");
    openapiFields.add("previousattempts");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200Response is not found in the empty JSON string", ModAssignGetSubmissionStatus200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `assignmentdata`
      if (jsonObj.get("assignmentdata") != null && !jsonObj.get("assignmentdata").isJsonNull()) {
        ModAssignGetSubmissionStatus200ResponseAssignmentdata.validateJsonElement(jsonObj.get("assignmentdata"));
      }
      // validate the optional field `feedback`
      if (jsonObj.get("feedback") != null && !jsonObj.get("feedback").isJsonNull()) {
        ModAssignGetSubmissionStatus200ResponseFeedback.validateJsonElement(jsonObj.get("feedback"));
      }
      // validate the optional field `gradingsummary`
      if (jsonObj.get("gradingsummary") != null && !jsonObj.get("gradingsummary").isJsonNull()) {
        ModAssignGetSubmissionStatus200ResponseGradingsummary.validateJsonElement(jsonObj.get("gradingsummary"));
      }
      // validate the optional field `lastattempt`
      if (jsonObj.get("lastattempt") != null && !jsonObj.get("lastattempt").isJsonNull()) {
        ModAssignGetSubmissionStatus200ResponseLastattempt.validateJsonElement(jsonObj.get("lastattempt"));
      }
      if (jsonObj.get("previousattempts") != null && !jsonObj.get("previousattempts").isJsonNull()) {
        JsonArray jsonArraypreviousattempts = jsonObj.getAsJsonArray("previousattempts");
        if (jsonArraypreviousattempts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("previousattempts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `previousattempts` to be an array in the JSON string but got `%s`", jsonObj.get("previousattempts").toString()));
          }

          // validate the optional field `previousattempts` (array)
          for (int i = 0; i < jsonArraypreviousattempts.size(); i++) {
            ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.validateJsonElement(jsonArraypreviousattempts.get(i));
          };
        }
      }
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) {
        JsonArray jsonArraywarnings = jsonObj.getAsJsonArray("warnings");
        if (jsonArraywarnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
          }

          // validate the optional field `warnings` (array)
          for (int i = 0; i < jsonArraywarnings.size(); i++) {
            AuthEmailSignupUser200ResponseWarningsInner.validateJsonElement(jsonArraywarnings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200Response>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200Response
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200Response
  */
  public static ModAssignGetSubmissionStatus200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200Response.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


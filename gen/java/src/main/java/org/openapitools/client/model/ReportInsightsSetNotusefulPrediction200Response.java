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
 * ReportInsightsSetNotusefulPrediction200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ReportInsightsSetNotusefulPrediction200Response {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ReportInsightsSetNotusefulPrediction200Response() {
  }

  public ReportInsightsSetNotusefulPrediction200Response success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * True if the prediction was successfully flagged as not useful.
   * @return success
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ReportInsightsSetNotusefulPrediction200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ReportInsightsSetNotusefulPrediction200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ReportInsightsSetNotusefulPrediction200Response reportInsightsSetNotusefulPrediction200Response = (ReportInsightsSetNotusefulPrediction200Response) o;
    return Objects.equals(this.success, reportInsightsSetNotusefulPrediction200Response.success) &&
        Objects.equals(this.warnings, reportInsightsSetNotusefulPrediction200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInsightsSetNotusefulPrediction200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReportInsightsSetNotusefulPrediction200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportInsightsSetNotusefulPrediction200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportInsightsSetNotusefulPrediction200Response is not found in the empty JSON string", ReportInsightsSetNotusefulPrediction200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportInsightsSetNotusefulPrediction200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportInsightsSetNotusefulPrediction200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportInsightsSetNotusefulPrediction200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
       if (!ReportInsightsSetNotusefulPrediction200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportInsightsSetNotusefulPrediction200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportInsightsSetNotusefulPrediction200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportInsightsSetNotusefulPrediction200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportInsightsSetNotusefulPrediction200Response>() {
           @Override
           public void write(JsonWriter out, ReportInsightsSetNotusefulPrediction200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportInsightsSetNotusefulPrediction200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportInsightsSetNotusefulPrediction200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportInsightsSetNotusefulPrediction200Response
  * @throws IOException if the JSON string is invalid with respect to ReportInsightsSetNotusefulPrediction200Response
  */
  public static ReportInsightsSetNotusefulPrediction200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportInsightsSetNotusefulPrediction200Response.class);
  }

 /**
  * Convert an instance of ReportInsightsSetNotusefulPrediction200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


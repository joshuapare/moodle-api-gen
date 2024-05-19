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
 * ModQuizGetAttemptAccessInformation200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModQuizGetAttemptAccessInformation200Response {
  public static final String SERIALIZED_NAME_ENDTIME = "endtime";
  @SerializedName(SERIALIZED_NAME_ENDTIME)
  private Integer endtime = null;

  public static final String SERIALIZED_NAME_ISFINISHED = "isfinished";
  @SerializedName(SERIALIZED_NAME_ISFINISHED)
  private Boolean isfinished = null;

  public static final String SERIALIZED_NAME_ISPREFLIGHTCHECKREQUIRED = "ispreflightcheckrequired";
  @SerializedName(SERIALIZED_NAME_ISPREFLIGHTCHECKREQUIRED)
  private Boolean ispreflightcheckrequired = null;

  public static final String SERIALIZED_NAME_PREVENTNEWATTEMPTREASONS = "preventnewattemptreasons";
  @SerializedName(SERIALIZED_NAME_PREVENTNEWATTEMPTREASONS)
  private List<Object> preventnewattemptreasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModQuizGetAttemptAccessInformation200Response() {
  }

  public ModQuizGetAttemptAccessInformation200Response endtime(Integer endtime) {
    this.endtime = endtime;
    return this;
  }

   /**
   * When the attempt must be submitted (determined by rules).
   * @return endtime
  **/
  @javax.annotation.Nullable
  public Integer getEndtime() {
    return endtime;
  }

  public void setEndtime(Integer endtime) {
    this.endtime = endtime;
  }


  public ModQuizGetAttemptAccessInformation200Response isfinished(Boolean isfinished) {
    this.isfinished = isfinished;
    return this;
  }

   /**
   * Whether there is no way the user will ever be allowed to attempt.
   * @return isfinished
  **/
  @javax.annotation.Nonnull
  public Boolean getIsfinished() {
    return isfinished;
  }

  public void setIsfinished(Boolean isfinished) {
    this.isfinished = isfinished;
  }


  public ModQuizGetAttemptAccessInformation200Response ispreflightcheckrequired(Boolean ispreflightcheckrequired) {
    this.ispreflightcheckrequired = ispreflightcheckrequired;
    return this;
  }

   /**
   * whether a check is required before the user                                                                     starts/continues his attempt.
   * @return ispreflightcheckrequired
  **/
  @javax.annotation.Nullable
  public Boolean getIspreflightcheckrequired() {
    return ispreflightcheckrequired;
  }

  public void setIspreflightcheckrequired(Boolean ispreflightcheckrequired) {
    this.ispreflightcheckrequired = ispreflightcheckrequired;
  }


  public ModQuizGetAttemptAccessInformation200Response preventnewattemptreasons(List<Object> preventnewattemptreasons) {
    this.preventnewattemptreasons = preventnewattemptreasons;
    return this;
  }

  public ModQuizGetAttemptAccessInformation200Response addPreventnewattemptreasonsItem(Object preventnewattemptreasonsItem) {
    if (this.preventnewattemptreasons == null) {
      this.preventnewattemptreasons = new ArrayList<>();
    }
    this.preventnewattemptreasons.add(preventnewattemptreasonsItem);
    return this;
  }

   /**
   * Get preventnewattemptreasons
   * @return preventnewattemptreasons
  **/
  @javax.annotation.Nonnull
  public List<Object> getPreventnewattemptreasons() {
    return preventnewattemptreasons;
  }

  public void setPreventnewattemptreasons(List<Object> preventnewattemptreasons) {
    this.preventnewattemptreasons = preventnewattemptreasons;
  }


  public ModQuizGetAttemptAccessInformation200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModQuizGetAttemptAccessInformation200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ModQuizGetAttemptAccessInformation200Response modQuizGetAttemptAccessInformation200Response = (ModQuizGetAttemptAccessInformation200Response) o;
    return Objects.equals(this.endtime, modQuizGetAttemptAccessInformation200Response.endtime) &&
        Objects.equals(this.isfinished, modQuizGetAttemptAccessInformation200Response.isfinished) &&
        Objects.equals(this.ispreflightcheckrequired, modQuizGetAttemptAccessInformation200Response.ispreflightcheckrequired) &&
        Objects.equals(this.preventnewattemptreasons, modQuizGetAttemptAccessInformation200Response.preventnewattemptreasons) &&
        Objects.equals(this.warnings, modQuizGetAttemptAccessInformation200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endtime, isfinished, ispreflightcheckrequired, preventnewattemptreasons, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModQuizGetAttemptAccessInformation200Response {\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    isfinished: ").append(toIndentedString(isfinished)).append("\n");
    sb.append("    ispreflightcheckrequired: ").append(toIndentedString(ispreflightcheckrequired)).append("\n");
    sb.append("    preventnewattemptreasons: ").append(toIndentedString(preventnewattemptreasons)).append("\n");
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
    openapiFields.add("endtime");
    openapiFields.add("isfinished");
    openapiFields.add("ispreflightcheckrequired");
    openapiFields.add("preventnewattemptreasons");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isfinished");
    openapiRequiredFields.add("preventnewattemptreasons");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModQuizGetAttemptAccessInformation200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModQuizGetAttemptAccessInformation200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModQuizGetAttemptAccessInformation200Response is not found in the empty JSON string", ModQuizGetAttemptAccessInformation200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModQuizGetAttemptAccessInformation200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModQuizGetAttemptAccessInformation200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModQuizGetAttemptAccessInformation200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("preventnewattemptreasons") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("preventnewattemptreasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preventnewattemptreasons` to be an array in the JSON string but got `%s`", jsonObj.get("preventnewattemptreasons").toString()));
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
       if (!ModQuizGetAttemptAccessInformation200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModQuizGetAttemptAccessInformation200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModQuizGetAttemptAccessInformation200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModQuizGetAttemptAccessInformation200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModQuizGetAttemptAccessInformation200Response>() {
           @Override
           public void write(JsonWriter out, ModQuizGetAttemptAccessInformation200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModQuizGetAttemptAccessInformation200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModQuizGetAttemptAccessInformation200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModQuizGetAttemptAccessInformation200Response
  * @throws IOException if the JSON string is invalid with respect to ModQuizGetAttemptAccessInformation200Response
  */
  public static ModQuizGetAttemptAccessInformation200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModQuizGetAttemptAccessInformation200Response.class);
  }

 /**
  * Convert an instance of ModQuizGetAttemptAccessInformation200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


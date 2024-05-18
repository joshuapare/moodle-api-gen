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
import org.openapitools.client.model.ModQuizGetUserAttempts200ResponseAttemptsInner;

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
 * ModQuizGetUserAttempts200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModQuizGetUserAttempts200Response {
  public static final String SERIALIZED_NAME_ATTEMPTS = "attempts";
  @SerializedName(SERIALIZED_NAME_ATTEMPTS)
  private List<ModQuizGetUserAttempts200ResponseAttemptsInner> attempts = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModQuizGetUserAttempts200Response() {
  }

  public ModQuizGetUserAttempts200Response attempts(List<ModQuizGetUserAttempts200ResponseAttemptsInner> attempts) {
    this.attempts = attempts;
    return this;
  }

  public ModQuizGetUserAttempts200Response addAttemptsItem(ModQuizGetUserAttempts200ResponseAttemptsInner attemptsItem) {
    if (this.attempts == null) {
      this.attempts = new ArrayList<>();
    }
    this.attempts.add(attemptsItem);
    return this;
  }

   /**
   * Get attempts
   * @return attempts
  **/
  @javax.annotation.Nonnull
  public List<ModQuizGetUserAttempts200ResponseAttemptsInner> getAttempts() {
    return attempts;
  }

  public void setAttempts(List<ModQuizGetUserAttempts200ResponseAttemptsInner> attempts) {
    this.attempts = attempts;
  }


  public ModQuizGetUserAttempts200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModQuizGetUserAttempts200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ModQuizGetUserAttempts200Response modQuizGetUserAttempts200Response = (ModQuizGetUserAttempts200Response) o;
    return Objects.equals(this.attempts, modQuizGetUserAttempts200Response.attempts) &&
        Objects.equals(this.warnings, modQuizGetUserAttempts200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempts, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModQuizGetUserAttempts200Response {\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
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
    openapiFields.add("attempts");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attempts");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModQuizGetUserAttempts200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModQuizGetUserAttempts200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModQuizGetUserAttempts200Response is not found in the empty JSON string", ModQuizGetUserAttempts200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModQuizGetUserAttempts200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModQuizGetUserAttempts200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModQuizGetUserAttempts200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("attempts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attempts` to be an array in the JSON string but got `%s`", jsonObj.get("attempts").toString()));
      }

      JsonArray jsonArrayattempts = jsonObj.getAsJsonArray("attempts");
      // validate the required field `attempts` (array)
      for (int i = 0; i < jsonArrayattempts.size(); i++) {
        ModQuizGetUserAttempts200ResponseAttemptsInner.validateJsonElement(jsonArrayattempts.get(i));
      };
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
       if (!ModQuizGetUserAttempts200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModQuizGetUserAttempts200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModQuizGetUserAttempts200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModQuizGetUserAttempts200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModQuizGetUserAttempts200Response>() {
           @Override
           public void write(JsonWriter out, ModQuizGetUserAttempts200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModQuizGetUserAttempts200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModQuizGetUserAttempts200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModQuizGetUserAttempts200Response
  * @throws IOException if the JSON string is invalid with respect to ModQuizGetUserAttempts200Response
  */
  public static ModQuizGetUserAttempts200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModQuizGetUserAttempts200Response.class);
  }

 /**
  * Convert an instance of ModQuizGetUserAttempts200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


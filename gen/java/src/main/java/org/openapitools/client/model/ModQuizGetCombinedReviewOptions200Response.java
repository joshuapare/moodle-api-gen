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
import org.openapitools.client.model.ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner;
import org.openapitools.client.model.ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner;

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
 * ModQuizGetCombinedReviewOptions200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModQuizGetCombinedReviewOptions200Response {
  public static final String SERIALIZED_NAME_ALLOPTIONS = "alloptions";
  @SerializedName(SERIALIZED_NAME_ALLOPTIONS)
  private List<ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner> alloptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOMEOPTIONS = "someoptions";
  @SerializedName(SERIALIZED_NAME_SOMEOPTIONS)
  private List<ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner> someoptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModQuizGetCombinedReviewOptions200Response() {
  }

  public ModQuizGetCombinedReviewOptions200Response alloptions(List<ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner> alloptions) {
    this.alloptions = alloptions;
    return this;
  }

  public ModQuizGetCombinedReviewOptions200Response addAlloptionsItem(ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner alloptionsItem) {
    if (this.alloptions == null) {
      this.alloptions = new ArrayList<>();
    }
    this.alloptions.add(alloptionsItem);
    return this;
  }

   /**
   * Get alloptions
   * @return alloptions
  **/
  @javax.annotation.Nonnull
  public List<ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner> getAlloptions() {
    return alloptions;
  }

  public void setAlloptions(List<ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner> alloptions) {
    this.alloptions = alloptions;
  }


  public ModQuizGetCombinedReviewOptions200Response someoptions(List<ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner> someoptions) {
    this.someoptions = someoptions;
    return this;
  }

  public ModQuizGetCombinedReviewOptions200Response addSomeoptionsItem(ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner someoptionsItem) {
    if (this.someoptions == null) {
      this.someoptions = new ArrayList<>();
    }
    this.someoptions.add(someoptionsItem);
    return this;
  }

   /**
   * Get someoptions
   * @return someoptions
  **/
  @javax.annotation.Nonnull
  public List<ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner> getSomeoptions() {
    return someoptions;
  }

  public void setSomeoptions(List<ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner> someoptions) {
    this.someoptions = someoptions;
  }


  public ModQuizGetCombinedReviewOptions200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModQuizGetCombinedReviewOptions200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ModQuizGetCombinedReviewOptions200Response modQuizGetCombinedReviewOptions200Response = (ModQuizGetCombinedReviewOptions200Response) o;
    return Objects.equals(this.alloptions, modQuizGetCombinedReviewOptions200Response.alloptions) &&
        Objects.equals(this.someoptions, modQuizGetCombinedReviewOptions200Response.someoptions) &&
        Objects.equals(this.warnings, modQuizGetCombinedReviewOptions200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloptions, someoptions, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModQuizGetCombinedReviewOptions200Response {\n");
    sb.append("    alloptions: ").append(toIndentedString(alloptions)).append("\n");
    sb.append("    someoptions: ").append(toIndentedString(someoptions)).append("\n");
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
    openapiFields.add("alloptions");
    openapiFields.add("someoptions");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alloptions");
    openapiRequiredFields.add("someoptions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModQuizGetCombinedReviewOptions200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModQuizGetCombinedReviewOptions200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModQuizGetCombinedReviewOptions200Response is not found in the empty JSON string", ModQuizGetCombinedReviewOptions200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModQuizGetCombinedReviewOptions200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModQuizGetCombinedReviewOptions200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModQuizGetCombinedReviewOptions200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("alloptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `alloptions` to be an array in the JSON string but got `%s`", jsonObj.get("alloptions").toString()));
      }

      JsonArray jsonArrayalloptions = jsonObj.getAsJsonArray("alloptions");
      // validate the required field `alloptions` (array)
      for (int i = 0; i < jsonArrayalloptions.size(); i++) {
        ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner.validateJsonElement(jsonArrayalloptions.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("someoptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `someoptions` to be an array in the JSON string but got `%s`", jsonObj.get("someoptions").toString()));
      }

      JsonArray jsonArraysomeoptions = jsonObj.getAsJsonArray("someoptions");
      // validate the required field `someoptions` (array)
      for (int i = 0; i < jsonArraysomeoptions.size(); i++) {
        ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner.validateJsonElement(jsonArraysomeoptions.get(i));
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
       if (!ModQuizGetCombinedReviewOptions200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModQuizGetCombinedReviewOptions200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModQuizGetCombinedReviewOptions200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModQuizGetCombinedReviewOptions200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModQuizGetCombinedReviewOptions200Response>() {
           @Override
           public void write(JsonWriter out, ModQuizGetCombinedReviewOptions200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModQuizGetCombinedReviewOptions200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModQuizGetCombinedReviewOptions200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModQuizGetCombinedReviewOptions200Response
  * @throws IOException if the JSON string is invalid with respect to ModQuizGetCombinedReviewOptions200Response
  */
  public static ModQuizGetCombinedReviewOptions200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModQuizGetCombinedReviewOptions200Response.class);
  }

 /**
  * Convert an instance of ModQuizGetCombinedReviewOptions200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


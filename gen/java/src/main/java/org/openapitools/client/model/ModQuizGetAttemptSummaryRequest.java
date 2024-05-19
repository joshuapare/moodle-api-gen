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
import org.openapitools.client.model.ModQuizGetAttemptDataRequestPreflightdataInner;

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
 * ModQuizGetAttemptSummaryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModQuizGetAttemptSummaryRequest {
  public static final String SERIALIZED_NAME_ATTEMPTID = "attemptid";
  @SerializedName(SERIALIZED_NAME_ATTEMPTID)
  private Integer attemptid;

  public static final String SERIALIZED_NAME_PREFLIGHTDATA = "preflightdata";
  @SerializedName(SERIALIZED_NAME_PREFLIGHTDATA)
  private List<ModQuizGetAttemptDataRequestPreflightdataInner> preflightdata = new ArrayList<>();

  public ModQuizGetAttemptSummaryRequest() {
  }

  public ModQuizGetAttemptSummaryRequest attemptid(Integer attemptid) {
    this.attemptid = attemptid;
    return this;
  }

   /**
   * attempt id
   * @return attemptid
  **/
  @javax.annotation.Nonnull
  public Integer getAttemptid() {
    return attemptid;
  }

  public void setAttemptid(Integer attemptid) {
    this.attemptid = attemptid;
  }


  public ModQuizGetAttemptSummaryRequest preflightdata(List<ModQuizGetAttemptDataRequestPreflightdataInner> preflightdata) {
    this.preflightdata = preflightdata;
    return this;
  }

  public ModQuizGetAttemptSummaryRequest addPreflightdataItem(ModQuizGetAttemptDataRequestPreflightdataInner preflightdataItem) {
    if (this.preflightdata == null) {
      this.preflightdata = new ArrayList<>();
    }
    this.preflightdata.add(preflightdataItem);
    return this;
  }

   /**
   * Get preflightdata
   * @return preflightdata
  **/
  @javax.annotation.Nullable
  public List<ModQuizGetAttemptDataRequestPreflightdataInner> getPreflightdata() {
    return preflightdata;
  }

  public void setPreflightdata(List<ModQuizGetAttemptDataRequestPreflightdataInner> preflightdata) {
    this.preflightdata = preflightdata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModQuizGetAttemptSummaryRequest modQuizGetAttemptSummaryRequest = (ModQuizGetAttemptSummaryRequest) o;
    return Objects.equals(this.attemptid, modQuizGetAttemptSummaryRequest.attemptid) &&
        Objects.equals(this.preflightdata, modQuizGetAttemptSummaryRequest.preflightdata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptid, preflightdata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModQuizGetAttemptSummaryRequest {\n");
    sb.append("    attemptid: ").append(toIndentedString(attemptid)).append("\n");
    sb.append("    preflightdata: ").append(toIndentedString(preflightdata)).append("\n");
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
    openapiFields.add("attemptid");
    openapiFields.add("preflightdata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attemptid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModQuizGetAttemptSummaryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModQuizGetAttemptSummaryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModQuizGetAttemptSummaryRequest is not found in the empty JSON string", ModQuizGetAttemptSummaryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModQuizGetAttemptSummaryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModQuizGetAttemptSummaryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModQuizGetAttemptSummaryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("preflightdata") != null && !jsonObj.get("preflightdata").isJsonNull()) {
        JsonArray jsonArraypreflightdata = jsonObj.getAsJsonArray("preflightdata");
        if (jsonArraypreflightdata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preflightdata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preflightdata` to be an array in the JSON string but got `%s`", jsonObj.get("preflightdata").toString()));
          }

          // validate the optional field `preflightdata` (array)
          for (int i = 0; i < jsonArraypreflightdata.size(); i++) {
            ModQuizGetAttemptDataRequestPreflightdataInner.validateJsonElement(jsonArraypreflightdata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModQuizGetAttemptSummaryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModQuizGetAttemptSummaryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModQuizGetAttemptSummaryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModQuizGetAttemptSummaryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModQuizGetAttemptSummaryRequest>() {
           @Override
           public void write(JsonWriter out, ModQuizGetAttemptSummaryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModQuizGetAttemptSummaryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModQuizGetAttemptSummaryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModQuizGetAttemptSummaryRequest
  * @throws IOException if the JSON string is invalid with respect to ModQuizGetAttemptSummaryRequest
  */
  public static ModQuizGetAttemptSummaryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModQuizGetAttemptSummaryRequest.class);
  }

 /**
  * Convert an instance of ModQuizGetAttemptSummaryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


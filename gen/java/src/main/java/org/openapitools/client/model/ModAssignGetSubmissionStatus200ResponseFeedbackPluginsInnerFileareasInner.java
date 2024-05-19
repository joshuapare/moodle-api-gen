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
import org.openapitools.client.model.CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner;

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
 * ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner {
  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files = new ArrayList<>();

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner() {
  }

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner area(String area) {
    this.area = area;
    return this;
  }

   /**
   * file area
   * @return area
  **/
  @javax.annotation.Nullable
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner files(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files) {
    this.files = files;
    return this;
  }

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner addFilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> getFiles() {
    return files;
  }

  public void setFiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files) {
    this.files = files;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner = (ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner) o;
    return Objects.equals(this.area, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.area) &&
        Objects.equals(this.files, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("area");
    openapiFields.add("files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner is not found in the empty JSON string", ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
        if (jsonArrayfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
          }

          // validate the optional field `files` (array)
          for (int i = 0; i < jsonArrayfiles.size(); i++) {
            CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArrayfiles.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner
  */
  public static ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


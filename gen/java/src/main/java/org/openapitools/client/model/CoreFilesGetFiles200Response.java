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
import org.openapitools.client.model.CoreFilesGetFiles200ResponseFilesInner;
import org.openapitools.client.model.CoreFilesGetFiles200ResponseParentsInner;

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
 * CoreFilesGetFiles200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreFilesGetFiles200Response {
  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<CoreFilesGetFiles200ResponseFilesInner> files = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARENTS = "parents";
  @SerializedName(SERIALIZED_NAME_PARENTS)
  private List<CoreFilesGetFiles200ResponseParentsInner> parents = new ArrayList<>();

  public CoreFilesGetFiles200Response() {
  }

  public CoreFilesGetFiles200Response files(List<CoreFilesGetFiles200ResponseFilesInner> files) {
    this.files = files;
    return this;
  }

  public CoreFilesGetFiles200Response addFilesItem(CoreFilesGetFiles200ResponseFilesInner filesItem) {
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
  @javax.annotation.Nonnull
  public List<CoreFilesGetFiles200ResponseFilesInner> getFiles() {
    return files;
  }

  public void setFiles(List<CoreFilesGetFiles200ResponseFilesInner> files) {
    this.files = files;
  }


  public CoreFilesGetFiles200Response parents(List<CoreFilesGetFiles200ResponseParentsInner> parents) {
    this.parents = parents;
    return this;
  }

  public CoreFilesGetFiles200Response addParentsItem(CoreFilesGetFiles200ResponseParentsInner parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  @javax.annotation.Nonnull
  public List<CoreFilesGetFiles200ResponseParentsInner> getParents() {
    return parents;
  }

  public void setParents(List<CoreFilesGetFiles200ResponseParentsInner> parents) {
    this.parents = parents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreFilesGetFiles200Response coreFilesGetFiles200Response = (CoreFilesGetFiles200Response) o;
    return Objects.equals(this.files, coreFilesGetFiles200Response.files) &&
        Objects.equals(this.parents, coreFilesGetFiles200Response.parents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, parents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreFilesGetFiles200Response {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
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
    openapiFields.add("files");
    openapiFields.add("parents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("files");
    openapiRequiredFields.add("parents");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreFilesGetFiles200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreFilesGetFiles200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreFilesGetFiles200Response is not found in the empty JSON string", CoreFilesGetFiles200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreFilesGetFiles200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreFilesGetFiles200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreFilesGetFiles200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
      }

      JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
      // validate the required field `files` (array)
      for (int i = 0; i < jsonArrayfiles.size(); i++) {
        CoreFilesGetFiles200ResponseFilesInner.validateJsonElement(jsonArrayfiles.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("parents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parents` to be an array in the JSON string but got `%s`", jsonObj.get("parents").toString()));
      }

      JsonArray jsonArrayparents = jsonObj.getAsJsonArray("parents");
      // validate the required field `parents` (array)
      for (int i = 0; i < jsonArrayparents.size(); i++) {
        CoreFilesGetFiles200ResponseParentsInner.validateJsonElement(jsonArrayparents.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreFilesGetFiles200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreFilesGetFiles200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreFilesGetFiles200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreFilesGetFiles200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreFilesGetFiles200Response>() {
           @Override
           public void write(JsonWriter out, CoreFilesGetFiles200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreFilesGetFiles200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreFilesGetFiles200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreFilesGetFiles200Response
  * @throws IOException if the JSON string is invalid with respect to CoreFilesGetFiles200Response
  */
  public static CoreFilesGetFiles200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreFilesGetFiles200Response.class);
  }

 /**
  * Convert an instance of CoreFilesGetFiles200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * CoreH5pGetTrustedH5pFile200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreH5pGetTrustedH5pFile200Response {
  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public CoreH5pGetTrustedH5pFile200Response() {
  }

  public CoreH5pGetTrustedH5pFile200Response files(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files) {
    this.files = files;
    return this;
  }

  public CoreH5pGetTrustedH5pFile200Response addFilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner filesItem) {
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
  public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> getFiles() {
    return files;
  }

  public void setFiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files) {
    this.files = files;
  }


  public CoreH5pGetTrustedH5pFile200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CoreH5pGetTrustedH5pFile200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    CoreH5pGetTrustedH5pFile200Response coreH5pGetTrustedH5pFile200Response = (CoreH5pGetTrustedH5pFile200Response) o;
    return Objects.equals(this.files, coreH5pGetTrustedH5pFile200Response.files) &&
        Objects.equals(this.warnings, coreH5pGetTrustedH5pFile200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreH5pGetTrustedH5pFile200Response {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("files");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("files");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreH5pGetTrustedH5pFile200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreH5pGetTrustedH5pFile200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreH5pGetTrustedH5pFile200Response is not found in the empty JSON string", CoreH5pGetTrustedH5pFile200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreH5pGetTrustedH5pFile200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreH5pGetTrustedH5pFile200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreH5pGetTrustedH5pFile200Response.openapiRequiredFields) {
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
        CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArrayfiles.get(i));
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
       if (!CoreH5pGetTrustedH5pFile200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreH5pGetTrustedH5pFile200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreH5pGetTrustedH5pFile200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreH5pGetTrustedH5pFile200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreH5pGetTrustedH5pFile200Response>() {
           @Override
           public void write(JsonWriter out, CoreH5pGetTrustedH5pFile200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreH5pGetTrustedH5pFile200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreH5pGetTrustedH5pFile200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreH5pGetTrustedH5pFile200Response
  * @throws IOException if the JSON string is invalid with respect to CoreH5pGetTrustedH5pFile200Response
  */
  public static CoreH5pGetTrustedH5pFile200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreH5pGetTrustedH5pFile200Response.class);
  }

 /**
  * Convert an instance of CoreH5pGetTrustedH5pFile200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

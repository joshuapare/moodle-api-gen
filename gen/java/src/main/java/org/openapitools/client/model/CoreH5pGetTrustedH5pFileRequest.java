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
 * CoreH5pGetTrustedH5pFileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreH5pGetTrustedH5pFileRequest {
  public static final String SERIALIZED_NAME_COPYRIGHT = "copyright";
  @SerializedName(SERIALIZED_NAME_COPYRIGHT)
  private Integer copyright = 0;

  public static final String SERIALIZED_NAME_EMBED = "embed";
  @SerializedName(SERIALIZED_NAME_EMBED)
  private Integer embed = 0;

  public static final String SERIALIZED_NAME_EXPORT = "export";
  @SerializedName(SERIALIZED_NAME_EXPORT)
  private Integer export = 0;

  public static final String SERIALIZED_NAME_FRAME = "frame";
  @SerializedName(SERIALIZED_NAME_FRAME)
  private Integer frame = 0;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = "null";

  public CoreH5pGetTrustedH5pFileRequest() {
  }

  public CoreH5pGetTrustedH5pFileRequest copyright(Integer copyright) {
    this.copyright = copyright;
    return this;
  }

   /**
   * The copyright option
   * @return copyright
  **/
  @javax.annotation.Nullable
  public Integer getCopyright() {
    return copyright;
  }

  public void setCopyright(Integer copyright) {
    this.copyright = copyright;
  }


  public CoreH5pGetTrustedH5pFileRequest embed(Integer embed) {
    this.embed = embed;
    return this;
  }

   /**
   * The embed allow to copy the code to your site
   * @return embed
  **/
  @javax.annotation.Nullable
  public Integer getEmbed() {
    return embed;
  }

  public void setEmbed(Integer embed) {
    this.embed = embed;
  }


  public CoreH5pGetTrustedH5pFileRequest export(Integer export) {
    this.export = export;
    return this;
  }

   /**
   * The export allow to download the package
   * @return export
  **/
  @javax.annotation.Nullable
  public Integer getExport() {
    return export;
  }

  public void setExport(Integer export) {
    this.export = export;
  }


  public CoreH5pGetTrustedH5pFileRequest frame(Integer frame) {
    this.frame = frame;
    return this;
  }

   /**
   * The frame allow to show the bar options below the content
   * @return frame
  **/
  @javax.annotation.Nullable
  public Integer getFrame() {
    return frame;
  }

  public void setFrame(Integer frame) {
    this.frame = frame;
  }


  public CoreH5pGetTrustedH5pFileRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * H5P file url.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreH5pGetTrustedH5pFileRequest coreH5pGetTrustedH5pFileRequest = (CoreH5pGetTrustedH5pFileRequest) o;
    return Objects.equals(this.copyright, coreH5pGetTrustedH5pFileRequest.copyright) &&
        Objects.equals(this.embed, coreH5pGetTrustedH5pFileRequest.embed) &&
        Objects.equals(this.export, coreH5pGetTrustedH5pFileRequest.export) &&
        Objects.equals(this.frame, coreH5pGetTrustedH5pFileRequest.frame) &&
        Objects.equals(this.url, coreH5pGetTrustedH5pFileRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyright, embed, export, frame, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreH5pGetTrustedH5pFileRequest {\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
    sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("copyright");
    openapiFields.add("embed");
    openapiFields.add("export");
    openapiFields.add("frame");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreH5pGetTrustedH5pFileRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreH5pGetTrustedH5pFileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreH5pGetTrustedH5pFileRequest is not found in the empty JSON string", CoreH5pGetTrustedH5pFileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreH5pGetTrustedH5pFileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreH5pGetTrustedH5pFileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreH5pGetTrustedH5pFileRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreH5pGetTrustedH5pFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreH5pGetTrustedH5pFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreH5pGetTrustedH5pFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreH5pGetTrustedH5pFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreH5pGetTrustedH5pFileRequest>() {
           @Override
           public void write(JsonWriter out, CoreH5pGetTrustedH5pFileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreH5pGetTrustedH5pFileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreH5pGetTrustedH5pFileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreH5pGetTrustedH5pFileRequest
  * @throws IOException if the JSON string is invalid with respect to CoreH5pGetTrustedH5pFileRequest
  */
  public static CoreH5pGetTrustedH5pFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreH5pGetTrustedH5pFileRequest.class);
  }

 /**
  * Convert an instance of CoreH5pGetTrustedH5pFileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


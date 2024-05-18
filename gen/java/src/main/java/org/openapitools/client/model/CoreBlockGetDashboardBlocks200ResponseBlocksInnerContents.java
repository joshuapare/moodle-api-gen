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
 * CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CONTENTFORMAT = "contentformat";
  @SerializedName(SERIALIZED_NAME_CONTENTFORMAT)
  private Integer contentformat;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOOTER = "footer";
  @SerializedName(SERIALIZED_NAME_FOOTER)
  private String footer;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents() {
  }

  public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Block contents.
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents contentformat(Integer contentformat) {
    this.contentformat = contentformat;
    return this;
  }

   /**
   * content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return contentformat
  **/
  @javax.annotation.Nonnull
  public Integer getContentformat() {
    return contentformat;
  }

  public void setContentformat(Integer contentformat) {
    this.contentformat = contentformat;
  }


  public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents files(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files) {
    this.files = files;
    return this;
  }

  public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents addFilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner filesItem) {
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


  public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Block footer.
   * @return footer
  **/
  @javax.annotation.Nonnull
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }


  public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Block title.
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents coreBlockGetDashboardBlocks200ResponseBlocksInnerContents = (CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) o;
    return Objects.equals(this.content, coreBlockGetDashboardBlocks200ResponseBlocksInnerContents.content) &&
        Objects.equals(this.contentformat, coreBlockGetDashboardBlocks200ResponseBlocksInnerContents.contentformat) &&
        Objects.equals(this.files, coreBlockGetDashboardBlocks200ResponseBlocksInnerContents.files) &&
        Objects.equals(this.footer, coreBlockGetDashboardBlocks200ResponseBlocksInnerContents.footer) &&
        Objects.equals(this.title, coreBlockGetDashboardBlocks200ResponseBlocksInnerContents.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentformat, files, footer, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentformat: ").append(toIndentedString(contentformat)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("contentformat");
    openapiFields.add("files");
    openapiFields.add("footer");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("contentformat");
    openapiRequiredFields.add("files");
    openapiRequiredFields.add("footer");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents is not found in the empty JSON string", CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
      }

      JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
      // validate the required field `files` (array)
      for (int i = 0; i < jsonArrayfiles.size(); i++) {
        CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArrayfiles.get(i));
      };
      if (!jsonObj.get("footer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footer").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents>() {
           @Override
           public void write(JsonWriter out, CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
  * @throws IOException if the JSON string is invalid with respect to CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents
  */
  public static CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.class);
  }

 /**
  * Convert an instance of CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


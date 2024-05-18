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
import org.openapitools.client.model.CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner;

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
 * ModDataGetEntries200ResponseEntriesInnerContentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataGetEntries200ResponseEntriesInnerContentsInner {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = "null";

  public static final String SERIALIZED_NAME_CONTENT1 = "content1";
  @SerializedName(SERIALIZED_NAME_CONTENT1)
  private String content1;

  public static final String SERIALIZED_NAME_CONTENT2 = "content2";
  @SerializedName(SERIALIZED_NAME_CONTENT2)
  private String content2;

  public static final String SERIALIZED_NAME_CONTENT3 = "content3";
  @SerializedName(SERIALIZED_NAME_CONTENT3)
  private String content3;

  public static final String SERIALIZED_NAME_CONTENT4 = "content4";
  @SerializedName(SERIALIZED_NAME_CONTENT4)
  private String content4;

  public static final String SERIALIZED_NAME_FIELDID = "fieldid";
  @SerializedName(SERIALIZED_NAME_FIELDID)
  private Integer fieldid = 0;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> files = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_RECORDID = "recordid";
  @SerializedName(SERIALIZED_NAME_RECORDID)
  private Integer recordid = 0;

  public ModDataGetEntries200ResponseEntriesInnerContentsInner() {
  }

  public ModDataGetEntries200ResponseEntriesInnerContentsInner content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Contents.
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner content1(String content1) {
    this.content1 = content1;
    return this;
  }

   /**
   * Contents.
   * @return content1
  **/
  @javax.annotation.Nullable
  public String getContent1() {
    return content1;
  }

  public void setContent1(String content1) {
    this.content1 = content1;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner content2(String content2) {
    this.content2 = content2;
    return this;
  }

   /**
   * Contents.
   * @return content2
  **/
  @javax.annotation.Nullable
  public String getContent2() {
    return content2;
  }

  public void setContent2(String content2) {
    this.content2 = content2;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner content3(String content3) {
    this.content3 = content3;
    return this;
  }

   /**
   * Contents.
   * @return content3
  **/
  @javax.annotation.Nullable
  public String getContent3() {
    return content3;
  }

  public void setContent3(String content3) {
    this.content3 = content3;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner content4(String content4) {
    this.content4 = content4;
    return this;
  }

   /**
   * Contents.
   * @return content4
  **/
  @javax.annotation.Nullable
  public String getContent4() {
    return content4;
  }

  public void setContent4(String content4) {
    this.content4 = content4;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner fieldid(Integer fieldid) {
    this.fieldid = fieldid;
    return this;
  }

   /**
   * The field type of the content.
   * @return fieldid
  **/
  @javax.annotation.Nullable
  public Integer getFieldid() {
    return fieldid;
  }

  public void setFieldid(Integer fieldid) {
    this.fieldid = fieldid;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner files(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> files) {
    this.files = files;
    return this;
  }

  public ModDataGetEntries200ResponseEntriesInnerContentsInner addFilesItem(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner filesItem) {
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
  public List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> getFiles() {
    return files;
  }

  public void setFiles(List<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> files) {
    this.files = files;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Content id.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModDataGetEntries200ResponseEntriesInnerContentsInner recordid(Integer recordid) {
    this.recordid = recordid;
    return this;
  }

   /**
   * The record this content belongs to.
   * @return recordid
  **/
  @javax.annotation.Nullable
  public Integer getRecordid() {
    return recordid;
  }

  public void setRecordid(Integer recordid) {
    this.recordid = recordid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataGetEntries200ResponseEntriesInnerContentsInner modDataGetEntries200ResponseEntriesInnerContentsInner = (ModDataGetEntries200ResponseEntriesInnerContentsInner) o;
    return Objects.equals(this.content, modDataGetEntries200ResponseEntriesInnerContentsInner.content) &&
        Objects.equals(this.content1, modDataGetEntries200ResponseEntriesInnerContentsInner.content1) &&
        Objects.equals(this.content2, modDataGetEntries200ResponseEntriesInnerContentsInner.content2) &&
        Objects.equals(this.content3, modDataGetEntries200ResponseEntriesInnerContentsInner.content3) &&
        Objects.equals(this.content4, modDataGetEntries200ResponseEntriesInnerContentsInner.content4) &&
        Objects.equals(this.fieldid, modDataGetEntries200ResponseEntriesInnerContentsInner.fieldid) &&
        Objects.equals(this.files, modDataGetEntries200ResponseEntriesInnerContentsInner.files) &&
        Objects.equals(this.id, modDataGetEntries200ResponseEntriesInnerContentsInner.id) &&
        Objects.equals(this.recordid, modDataGetEntries200ResponseEntriesInnerContentsInner.recordid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, content1, content2, content3, content4, fieldid, files, id, recordid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataGetEntries200ResponseEntriesInnerContentsInner {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    content1: ").append(toIndentedString(content1)).append("\n");
    sb.append("    content2: ").append(toIndentedString(content2)).append("\n");
    sb.append("    content3: ").append(toIndentedString(content3)).append("\n");
    sb.append("    content4: ").append(toIndentedString(content4)).append("\n");
    sb.append("    fieldid: ").append(toIndentedString(fieldid)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordid: ").append(toIndentedString(recordid)).append("\n");
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
    openapiFields.add("content1");
    openapiFields.add("content2");
    openapiFields.add("content3");
    openapiFields.add("content4");
    openapiFields.add("fieldid");
    openapiFields.add("files");
    openapiFields.add("id");
    openapiFields.add("recordid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataGetEntries200ResponseEntriesInnerContentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataGetEntries200ResponseEntriesInnerContentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataGetEntries200ResponseEntriesInnerContentsInner is not found in the empty JSON string", ModDataGetEntries200ResponseEntriesInnerContentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataGetEntries200ResponseEntriesInnerContentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataGetEntries200ResponseEntriesInnerContentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("content1") != null && !jsonObj.get("content1").isJsonNull()) && !jsonObj.get("content1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content1").toString()));
      }
      if ((jsonObj.get("content2") != null && !jsonObj.get("content2").isJsonNull()) && !jsonObj.get("content2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content2").toString()));
      }
      if ((jsonObj.get("content3") != null && !jsonObj.get("content3").isJsonNull()) && !jsonObj.get("content3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content3").toString()));
      }
      if ((jsonObj.get("content4") != null && !jsonObj.get("content4").isJsonNull()) && !jsonObj.get("content4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content4").toString()));
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
            CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.validateJsonElement(jsonArrayfiles.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataGetEntries200ResponseEntriesInnerContentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataGetEntries200ResponseEntriesInnerContentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataGetEntries200ResponseEntriesInnerContentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataGetEntries200ResponseEntriesInnerContentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataGetEntries200ResponseEntriesInnerContentsInner>() {
           @Override
           public void write(JsonWriter out, ModDataGetEntries200ResponseEntriesInnerContentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataGetEntries200ResponseEntriesInnerContentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataGetEntries200ResponseEntriesInnerContentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataGetEntries200ResponseEntriesInnerContentsInner
  * @throws IOException if the JSON string is invalid with respect to ModDataGetEntries200ResponseEntriesInnerContentsInner
  */
  public static ModDataGetEntries200ResponseEntriesInnerContentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataGetEntries200ResponseEntriesInnerContentsInner.class);
  }

 /**
  * Convert an instance of ModDataGetEntries200ResponseEntriesInnerContentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


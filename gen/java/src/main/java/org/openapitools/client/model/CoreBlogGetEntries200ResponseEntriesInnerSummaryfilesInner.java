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
 * CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_FILEPATH = "filepath";
  @SerializedName(SERIALIZED_NAME_FILEPATH)
  private String filepath;

  public static final String SERIALIZED_NAME_FILESIZE = "filesize";
  @SerializedName(SERIALIZED_NAME_FILESIZE)
  private Integer filesize;

  public static final String SERIALIZED_NAME_FILEURL = "fileurl";
  @SerializedName(SERIALIZED_NAME_FILEURL)
  private String fileurl;

  public static final String SERIALIZED_NAME_ISEXTERNALFILE = "isexternalfile";
  @SerializedName(SERIALIZED_NAME_ISEXTERNALFILE)
  private Boolean isexternalfile;

  public static final String SERIALIZED_NAME_MIMETYPE = "mimetype";
  @SerializedName(SERIALIZED_NAME_MIMETYPE)
  private String mimetype;

  public static final String SERIALIZED_NAME_REPOSITORYTYPE = "repositorytype";
  @SerializedName(SERIALIZED_NAME_REPOSITORYTYPE)
  private String repositorytype;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner() {
  }

  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * File name.
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner filepath(String filepath) {
    this.filepath = filepath;
    return this;
  }

   /**
   * File path.
   * @return filepath
  **/
  @javax.annotation.Nullable
  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }


  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner filesize(Integer filesize) {
    this.filesize = filesize;
    return this;
  }

   /**
   * File size.
   * @return filesize
  **/
  @javax.annotation.Nullable
  public Integer getFilesize() {
    return filesize;
  }

  public void setFilesize(Integer filesize) {
    this.filesize = filesize;
  }


  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner fileurl(String fileurl) {
    this.fileurl = fileurl;
    return this;
  }

   /**
   * Downloadable file url.
   * @return fileurl
  **/
  @javax.annotation.Nullable
  public String getFileurl() {
    return fileurl;
  }

  public void setFileurl(String fileurl) {
    this.fileurl = fileurl;
  }


  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner isexternalfile(Boolean isexternalfile) {
    this.isexternalfile = isexternalfile;
    return this;
  }

   /**
   * Whether is an external file.
   * @return isexternalfile
  **/
  @javax.annotation.Nullable
  public Boolean getIsexternalfile() {
    return isexternalfile;
  }

  public void setIsexternalfile(Boolean isexternalfile) {
    this.isexternalfile = isexternalfile;
  }


  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner mimetype(String mimetype) {
    this.mimetype = mimetype;
    return this;
  }

   /**
   * File mime type.
   * @return mimetype
  **/
  @javax.annotation.Nullable
  public String getMimetype() {
    return mimetype;
  }

  public void setMimetype(String mimetype) {
    this.mimetype = mimetype;
  }


  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner repositorytype(String repositorytype) {
    this.repositorytype = repositorytype;
    return this;
  }

   /**
   * The repository type for the external files.
   * @return repositorytype
  **/
  @javax.annotation.Nullable
  public String getRepositorytype() {
    return repositorytype;
  }

  public void setRepositorytype(String repositorytype) {
    this.repositorytype = repositorytype;
  }


  public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * Time modified.
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner = (CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner) o;
    return Objects.equals(this.filename, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.filename) &&
        Objects.equals(this.filepath, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.filepath) &&
        Objects.equals(this.filesize, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.filesize) &&
        Objects.equals(this.fileurl, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.fileurl) &&
        Objects.equals(this.isexternalfile, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.isexternalfile) &&
        Objects.equals(this.mimetype, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.mimetype) &&
        Objects.equals(this.repositorytype, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.repositorytype) &&
        Objects.equals(this.timemodified, coreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.timemodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, filepath, filesize, fileurl, isexternalfile, mimetype, repositorytype, timemodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    filepath: ").append(toIndentedString(filepath)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
    sb.append("    fileurl: ").append(toIndentedString(fileurl)).append("\n");
    sb.append("    isexternalfile: ").append(toIndentedString(isexternalfile)).append("\n");
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
    sb.append("    repositorytype: ").append(toIndentedString(repositorytype)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("filepath");
    openapiFields.add("filesize");
    openapiFields.add("fileurl");
    openapiFields.add("isexternalfile");
    openapiFields.add("mimetype");
    openapiFields.add("repositorytype");
    openapiFields.add("timemodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner is not found in the empty JSON string", CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if ((jsonObj.get("filepath") != null && !jsonObj.get("filepath").isJsonNull()) && !jsonObj.get("filepath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filepath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filepath").toString()));
      }
      if ((jsonObj.get("fileurl") != null && !jsonObj.get("fileurl").isJsonNull()) && !jsonObj.get("fileurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileurl").toString()));
      }
      if ((jsonObj.get("mimetype") != null && !jsonObj.get("mimetype").isJsonNull()) && !jsonObj.get("mimetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimetype").toString()));
      }
      if ((jsonObj.get("repositorytype") != null && !jsonObj.get("repositorytype").isJsonNull()) && !jsonObj.get("repositorytype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositorytype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repositorytype").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner>() {
           @Override
           public void write(JsonWriter out, CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
  * @throws IOException if the JSON string is invalid with respect to CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
  */
  public static CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.class);
  }

 /**
  * Convert an instance of CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


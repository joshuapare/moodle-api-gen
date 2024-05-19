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
import org.openapitools.client.model.ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner;
import org.openapitools.client.model.ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner;

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
 * ToolLpDataForUserEvidencePage200ResponseUserevidence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForUserEvidencePage200ResponseUserevidence {
  public static final String SERIALIZED_NAME_CANMANAGE = "canmanage";
  @SerializedName(SERIALIZED_NAME_CANMANAGE)
  private Boolean canmanage;

  public static final String SERIALIZED_NAME_COMPETENCYCOUNT = "competencycount";
  @SerializedName(SERIALIZED_NAME_COMPETENCYCOUNT)
  private Integer competencycount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = 1;

  public static final String SERIALIZED_NAME_FILECOUNT = "filecount";
  @SerializedName(SERIALIZED_NAME_FILECOUNT)
  private Integer filecount;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> files = new ArrayList<>();

  public static final String SERIALIZED_NAME_HASURLORFILES = "hasurlorfiles";
  @SerializedName(SERIALIZED_NAME_HASURLORFILES)
  private Boolean hasurlorfiles;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = "";

  public static final String SERIALIZED_NAME_URLSHORT = "urlshort";
  @SerializedName(SERIALIZED_NAME_URLSHORT)
  private String urlshort;

  public static final String SERIALIZED_NAME_USERCOMPETENCIES = "usercompetencies";
  @SerializedName(SERIALIZED_NAME_USERCOMPETENCIES)
  private List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner> usercompetencies = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERHASPLAN = "userhasplan";
  @SerializedName(SERIALIZED_NAME_USERHASPLAN)
  private Boolean userhasplan;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified = 0;

  public ToolLpDataForUserEvidencePage200ResponseUserevidence() {
  }

  public ToolLpDataForUserEvidencePage200ResponseUserevidence canmanage(Boolean canmanage) {
    this.canmanage = canmanage;
    return this;
  }

   /**
   * canmanage
   * @return canmanage
  **/
  @javax.annotation.Nonnull
  public Boolean getCanmanage() {
    return canmanage;
  }

  public void setCanmanage(Boolean canmanage) {
    this.canmanage = canmanage;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence competencycount(Integer competencycount) {
    this.competencycount = competencycount;
    return this;
  }

   /**
   * competencycount
   * @return competencycount
  **/
  @javax.annotation.Nonnull
  public Integer getCompetencycount() {
    return competencycount;
  }

  public void setCompetencycount(Integer competencycount) {
    this.competencycount = competencycount;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence descriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
    return this;
  }

   /**
   * description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return descriptionformat
  **/
  @javax.annotation.Nullable
  public Integer getDescriptionformat() {
    return descriptionformat;
  }

  public void setDescriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence filecount(Integer filecount) {
    this.filecount = filecount;
    return this;
  }

   /**
   * filecount
   * @return filecount
  **/
  @javax.annotation.Nonnull
  public Integer getFilecount() {
    return filecount;
  }

  public void setFilecount(Integer filecount) {
    this.filecount = filecount;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence files(List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> files) {
    this.files = files;
    return this;
  }

  public ToolLpDataForUserEvidencePage200ResponseUserevidence addFilesItem(ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner filesItem) {
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
  public List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> getFiles() {
    return files;
  }

  public void setFiles(List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> files) {
    this.files = files;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence hasurlorfiles(Boolean hasurlorfiles) {
    this.hasurlorfiles = hasurlorfiles;
    return this;
  }

   /**
   * hasurlorfiles
   * @return hasurlorfiles
  **/
  @javax.annotation.Nonnull
  public Boolean getHasurlorfiles() {
    return hasurlorfiles;
  }

  public void setHasurlorfiles(Boolean hasurlorfiles) {
    this.hasurlorfiles = hasurlorfiles;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * timecreated
   * @return timecreated
  **/
  @javax.annotation.Nonnull
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * timemodified
   * @return timemodified
  **/
  @javax.annotation.Nonnull
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence urlshort(String urlshort) {
    this.urlshort = urlshort;
    return this;
  }

   /**
   * urlshort
   * @return urlshort
  **/
  @javax.annotation.Nonnull
  public String getUrlshort() {
    return urlshort;
  }

  public void setUrlshort(String urlshort) {
    this.urlshort = urlshort;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence usercompetencies(List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner> usercompetencies) {
    this.usercompetencies = usercompetencies;
    return this;
  }

  public ToolLpDataForUserEvidencePage200ResponseUserevidence addUsercompetenciesItem(ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner usercompetenciesItem) {
    if (this.usercompetencies == null) {
      this.usercompetencies = new ArrayList<>();
    }
    this.usercompetencies.add(usercompetenciesItem);
    return this;
  }

   /**
   * Get usercompetencies
   * @return usercompetencies
  **/
  @javax.annotation.Nullable
  public List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner> getUsercompetencies() {
    return usercompetencies;
  }

  public void setUsercompetencies(List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner> usercompetencies) {
    this.usercompetencies = usercompetencies;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence userhasplan(Boolean userhasplan) {
    this.userhasplan = userhasplan;
    return this;
  }

   /**
   * userhasplan
   * @return userhasplan
  **/
  @javax.annotation.Nonnull
  public Boolean getUserhasplan() {
    return userhasplan;
  }

  public void setUserhasplan(Boolean userhasplan) {
    this.userhasplan = userhasplan;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * userid
   * @return userid
  **/
  @javax.annotation.Nonnull
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public ToolLpDataForUserEvidencePage200ResponseUserevidence usermodified(Integer usermodified) {
    this.usermodified = usermodified;
    return this;
  }

   /**
   * usermodified
   * @return usermodified
  **/
  @javax.annotation.Nonnull
  public Integer getUsermodified() {
    return usermodified;
  }

  public void setUsermodified(Integer usermodified) {
    this.usermodified = usermodified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolLpDataForUserEvidencePage200ResponseUserevidence toolLpDataForUserEvidencePage200ResponseUserevidence = (ToolLpDataForUserEvidencePage200ResponseUserevidence) o;
    return Objects.equals(this.canmanage, toolLpDataForUserEvidencePage200ResponseUserevidence.canmanage) &&
        Objects.equals(this.competencycount, toolLpDataForUserEvidencePage200ResponseUserevidence.competencycount) &&
        Objects.equals(this.description, toolLpDataForUserEvidencePage200ResponseUserevidence.description) &&
        Objects.equals(this.descriptionformat, toolLpDataForUserEvidencePage200ResponseUserevidence.descriptionformat) &&
        Objects.equals(this.filecount, toolLpDataForUserEvidencePage200ResponseUserevidence.filecount) &&
        Objects.equals(this.files, toolLpDataForUserEvidencePage200ResponseUserevidence.files) &&
        Objects.equals(this.hasurlorfiles, toolLpDataForUserEvidencePage200ResponseUserevidence.hasurlorfiles) &&
        Objects.equals(this.id, toolLpDataForUserEvidencePage200ResponseUserevidence.id) &&
        Objects.equals(this.name, toolLpDataForUserEvidencePage200ResponseUserevidence.name) &&
        Objects.equals(this.timecreated, toolLpDataForUserEvidencePage200ResponseUserevidence.timecreated) &&
        Objects.equals(this.timemodified, toolLpDataForUserEvidencePage200ResponseUserevidence.timemodified) &&
        Objects.equals(this.url, toolLpDataForUserEvidencePage200ResponseUserevidence.url) &&
        Objects.equals(this.urlshort, toolLpDataForUserEvidencePage200ResponseUserevidence.urlshort) &&
        Objects.equals(this.usercompetencies, toolLpDataForUserEvidencePage200ResponseUserevidence.usercompetencies) &&
        Objects.equals(this.userhasplan, toolLpDataForUserEvidencePage200ResponseUserevidence.userhasplan) &&
        Objects.equals(this.userid, toolLpDataForUserEvidencePage200ResponseUserevidence.userid) &&
        Objects.equals(this.usermodified, toolLpDataForUserEvidencePage200ResponseUserevidence.usermodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canmanage, competencycount, description, descriptionformat, filecount, files, hasurlorfiles, id, name, timecreated, timemodified, url, urlshort, usercompetencies, userhasplan, userid, usermodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForUserEvidencePage200ResponseUserevidence {\n");
    sb.append("    canmanage: ").append(toIndentedString(canmanage)).append("\n");
    sb.append("    competencycount: ").append(toIndentedString(competencycount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    filecount: ").append(toIndentedString(filecount)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    hasurlorfiles: ").append(toIndentedString(hasurlorfiles)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlshort: ").append(toIndentedString(urlshort)).append("\n");
    sb.append("    usercompetencies: ").append(toIndentedString(usercompetencies)).append("\n");
    sb.append("    userhasplan: ").append(toIndentedString(userhasplan)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    usermodified: ").append(toIndentedString(usermodified)).append("\n");
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
    openapiFields.add("canmanage");
    openapiFields.add("competencycount");
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("filecount");
    openapiFields.add("files");
    openapiFields.add("hasurlorfiles");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("url");
    openapiFields.add("urlshort");
    openapiFields.add("usercompetencies");
    openapiFields.add("userhasplan");
    openapiFields.add("userid");
    openapiFields.add("usermodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canmanage");
    openapiRequiredFields.add("competencycount");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("filecount");
    openapiRequiredFields.add("files");
    openapiRequiredFields.add("hasurlorfiles");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("urlshort");
    openapiRequiredFields.add("userhasplan");
    openapiRequiredFields.add("userid");
    openapiRequiredFields.add("usermodified");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForUserEvidencePage200ResponseUserevidence
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForUserEvidencePage200ResponseUserevidence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForUserEvidencePage200ResponseUserevidence is not found in the empty JSON string", ToolLpDataForUserEvidencePage200ResponseUserevidence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForUserEvidencePage200ResponseUserevidence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForUserEvidencePage200ResponseUserevidence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForUserEvidencePage200ResponseUserevidence.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
      }

      JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
      // validate the required field `files` (array)
      for (int i = 0; i < jsonArrayfiles.size(); i++) {
        ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.validateJsonElement(jsonArrayfiles.get(i));
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("urlshort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlshort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlshort").toString()));
      }
      if (jsonObj.get("usercompetencies") != null && !jsonObj.get("usercompetencies").isJsonNull()) {
        JsonArray jsonArrayusercompetencies = jsonObj.getAsJsonArray("usercompetencies");
        if (jsonArrayusercompetencies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usercompetencies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usercompetencies` to be an array in the JSON string but got `%s`", jsonObj.get("usercompetencies").toString()));
          }

          // validate the optional field `usercompetencies` (array)
          for (int i = 0; i < jsonArrayusercompetencies.size(); i++) {
            ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner.validateJsonElement(jsonArrayusercompetencies.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForUserEvidencePage200ResponseUserevidence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForUserEvidencePage200ResponseUserevidence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForUserEvidencePage200ResponseUserevidence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForUserEvidencePage200ResponseUserevidence.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForUserEvidencePage200ResponseUserevidence>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForUserEvidencePage200ResponseUserevidence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForUserEvidencePage200ResponseUserevidence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForUserEvidencePage200ResponseUserevidence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForUserEvidencePage200ResponseUserevidence
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForUserEvidencePage200ResponseUserevidence
  */
  public static ToolLpDataForUserEvidencePage200ResponseUserevidence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForUserEvidencePage200ResponseUserevidence.class);
  }

 /**
  * Convert an instance of ToolLpDataForUserEvidencePage200ResponseUserevidence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


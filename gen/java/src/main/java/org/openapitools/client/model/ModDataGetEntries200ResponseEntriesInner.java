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
import org.openapitools.client.model.ModDataGetEntries200ResponseEntriesInnerContentsInner;
import org.openapitools.client.model.ModDataGetEntries200ResponseEntriesInnerTagsInner;

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
 * ModDataGetEntries200ResponseEntriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataGetEntries200ResponseEntriesInner {
  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved = 0;

  public static final String SERIALIZED_NAME_CANMANAGEENTRY = "canmanageentry";
  @SerializedName(SERIALIZED_NAME_CANMANAGEENTRY)
  private Boolean canmanageentry = null;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<ModDataGetEntries200ResponseEntriesInnerContentsInner> contents = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATAID = "dataid";
  @SerializedName(SERIALIZED_NAME_DATAID)
  private Integer dataid = 0;

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname = "null";

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid = 0;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ModDataGetEntries200ResponseEntriesInnerTagsInner> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = 0;

  public ModDataGetEntries200ResponseEntriesInner() {
  }

  public ModDataGetEntries200ResponseEntriesInner approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Whether the entry has been approved (if the database is configured in that way).
   * @return approved
  **/
  @javax.annotation.Nullable
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public ModDataGetEntries200ResponseEntriesInner canmanageentry(Boolean canmanageentry) {
    this.canmanageentry = canmanageentry;
    return this;
  }

   /**
   * Whether the current user can manage this entry
   * @return canmanageentry
  **/
  @javax.annotation.Nullable
  public Boolean getCanmanageentry() {
    return canmanageentry;
  }

  public void setCanmanageentry(Boolean canmanageentry) {
    this.canmanageentry = canmanageentry;
  }


  public ModDataGetEntries200ResponseEntriesInner contents(List<ModDataGetEntries200ResponseEntriesInnerContentsInner> contents) {
    this.contents = contents;
    return this;
  }

  public ModDataGetEntries200ResponseEntriesInner addContentsItem(ModDataGetEntries200ResponseEntriesInnerContentsInner contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  public List<ModDataGetEntries200ResponseEntriesInnerContentsInner> getContents() {
    return contents;
  }

  public void setContents(List<ModDataGetEntries200ResponseEntriesInnerContentsInner> contents) {
    this.contents = contents;
  }


  public ModDataGetEntries200ResponseEntriesInner dataid(Integer dataid) {
    this.dataid = dataid;
    return this;
  }

   /**
   * The database id this record belongs to.
   * @return dataid
  **/
  @javax.annotation.Nullable
  public Integer getDataid() {
    return dataid;
  }

  public void setDataid(Integer dataid) {
    this.dataid = dataid;
  }


  public ModDataGetEntries200ResponseEntriesInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * The user who created the entry fullname.
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public ModDataGetEntries200ResponseEntriesInner groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * The group id this record belongs to (0 for no groups).
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public ModDataGetEntries200ResponseEntriesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Record id.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModDataGetEntries200ResponseEntriesInner tags(List<ModDataGetEntries200ResponseEntriesInnerTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public ModDataGetEntries200ResponseEntriesInner addTagsItem(ModDataGetEntries200ResponseEntriesInnerTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<ModDataGetEntries200ResponseEntriesInnerTagsInner> getTags() {
    return tags;
  }

  public void setTags(List<ModDataGetEntries200ResponseEntriesInnerTagsInner> tags) {
    this.tags = tags;
  }


  public ModDataGetEntries200ResponseEntriesInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * Time the record was created.
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModDataGetEntries200ResponseEntriesInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * Last time the record was modified.
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModDataGetEntries200ResponseEntriesInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The id of the user who created the record.
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataGetEntries200ResponseEntriesInner modDataGetEntries200ResponseEntriesInner = (ModDataGetEntries200ResponseEntriesInner) o;
    return Objects.equals(this.approved, modDataGetEntries200ResponseEntriesInner.approved) &&
        Objects.equals(this.canmanageentry, modDataGetEntries200ResponseEntriesInner.canmanageentry) &&
        Objects.equals(this.contents, modDataGetEntries200ResponseEntriesInner.contents) &&
        Objects.equals(this.dataid, modDataGetEntries200ResponseEntriesInner.dataid) &&
        Objects.equals(this.fullname, modDataGetEntries200ResponseEntriesInner.fullname) &&
        Objects.equals(this.groupid, modDataGetEntries200ResponseEntriesInner.groupid) &&
        Objects.equals(this.id, modDataGetEntries200ResponseEntriesInner.id) &&
        Objects.equals(this.tags, modDataGetEntries200ResponseEntriesInner.tags) &&
        Objects.equals(this.timecreated, modDataGetEntries200ResponseEntriesInner.timecreated) &&
        Objects.equals(this.timemodified, modDataGetEntries200ResponseEntriesInner.timemodified) &&
        Objects.equals(this.userid, modDataGetEntries200ResponseEntriesInner.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approved, canmanageentry, contents, dataid, fullname, groupid, id, tags, timecreated, timemodified, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataGetEntries200ResponseEntriesInner {\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    canmanageentry: ").append(toIndentedString(canmanageentry)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    dataid: ").append(toIndentedString(dataid)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
    openapiFields.add("approved");
    openapiFields.add("canmanageentry");
    openapiFields.add("contents");
    openapiFields.add("dataid");
    openapiFields.add("fullname");
    openapiFields.add("groupid");
    openapiFields.add("id");
    openapiFields.add("tags");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataGetEntries200ResponseEntriesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataGetEntries200ResponseEntriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataGetEntries200ResponseEntriesInner is not found in the empty JSON string", ModDataGetEntries200ResponseEntriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataGetEntries200ResponseEntriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataGetEntries200ResponseEntriesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("contents") != null && !jsonObj.get("contents").isJsonNull()) {
        JsonArray jsonArraycontents = jsonObj.getAsJsonArray("contents");
        if (jsonArraycontents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contents` to be an array in the JSON string but got `%s`", jsonObj.get("contents").toString()));
          }

          // validate the optional field `contents` (array)
          for (int i = 0; i < jsonArraycontents.size(); i++) {
            ModDataGetEntries200ResponseEntriesInnerContentsInner.validateJsonElement(jsonArraycontents.get(i));
          };
        }
      }
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            ModDataGetEntries200ResponseEntriesInnerTagsInner.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataGetEntries200ResponseEntriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataGetEntries200ResponseEntriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataGetEntries200ResponseEntriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataGetEntries200ResponseEntriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataGetEntries200ResponseEntriesInner>() {
           @Override
           public void write(JsonWriter out, ModDataGetEntries200ResponseEntriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataGetEntries200ResponseEntriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataGetEntries200ResponseEntriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataGetEntries200ResponseEntriesInner
  * @throws IOException if the JSON string is invalid with respect to ModDataGetEntries200ResponseEntriesInner
  */
  public static ModDataGetEntries200ResponseEntriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataGetEntries200ResponseEntriesInner.class);
  }

 /**
  * Convert an instance of ModDataGetEntries200ResponseEntriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

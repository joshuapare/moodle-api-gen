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
import org.openapitools.client.model.ModForumAddDiscussionPost200ResponsePostTagsInnerUrls;

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
 * ModForumAddDiscussionPost200ResponsePostTagsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModForumAddDiscussionPost200ResponsePostTagsInner {
  public static final String SERIALIZED_NAME_DISPLAYNAME = "displayname";
  @SerializedName(SERIALIZED_NAME_DISPLAYNAME)
  private String displayname = "null";

  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private Boolean flag = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_ISSTANDARD = "isstandard";
  @SerializedName(SERIALIZED_NAME_ISSTANDARD)
  private Boolean isstandard = null;

  public static final String SERIALIZED_NAME_TAGID = "tagid";
  @SerializedName(SERIALIZED_NAME_TAGID)
  private Integer tagid = null;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private ModForumAddDiscussionPost200ResponsePostTagsInnerUrls urls;

  public ModForumAddDiscussionPost200ResponsePostTagsInner() {
  }

  public ModForumAddDiscussionPost200ResponsePostTagsInner displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * The display name of the tag
   * @return displayname
  **/
  @javax.annotation.Nullable
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }


  public ModForumAddDiscussionPost200ResponsePostTagsInner flag(Boolean flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Wehther this tag is flagged
   * @return flag
  **/
  @javax.annotation.Nullable
  public Boolean getFlag() {
    return flag;
  }

  public void setFlag(Boolean flag) {
    this.flag = flag;
  }


  public ModForumAddDiscussionPost200ResponsePostTagsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the Tag
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModForumAddDiscussionPost200ResponsePostTagsInner isstandard(Boolean isstandard) {
    this.isstandard = isstandard;
    return this;
  }

   /**
   * Whether this is a standard tag
   * @return isstandard
  **/
  @javax.annotation.Nullable
  public Boolean getIsstandard() {
    return isstandard;
  }

  public void setIsstandard(Boolean isstandard) {
    this.isstandard = isstandard;
  }


  public ModForumAddDiscussionPost200ResponsePostTagsInner tagid(Integer tagid) {
    this.tagid = tagid;
    return this;
  }

   /**
   * The tagid
   * @return tagid
  **/
  @javax.annotation.Nullable
  public Integer getTagid() {
    return tagid;
  }

  public void setTagid(Integer tagid) {
    this.tagid = tagid;
  }


  public ModForumAddDiscussionPost200ResponsePostTagsInner urls(ModForumAddDiscussionPost200ResponsePostTagsInnerUrls urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nullable
  public ModForumAddDiscussionPost200ResponsePostTagsInnerUrls getUrls() {
    return urls;
  }

  public void setUrls(ModForumAddDiscussionPost200ResponsePostTagsInnerUrls urls) {
    this.urls = urls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModForumAddDiscussionPost200ResponsePostTagsInner modForumAddDiscussionPost200ResponsePostTagsInner = (ModForumAddDiscussionPost200ResponsePostTagsInner) o;
    return Objects.equals(this.displayname, modForumAddDiscussionPost200ResponsePostTagsInner.displayname) &&
        Objects.equals(this.flag, modForumAddDiscussionPost200ResponsePostTagsInner.flag) &&
        Objects.equals(this.id, modForumAddDiscussionPost200ResponsePostTagsInner.id) &&
        Objects.equals(this.isstandard, modForumAddDiscussionPost200ResponsePostTagsInner.isstandard) &&
        Objects.equals(this.tagid, modForumAddDiscussionPost200ResponsePostTagsInner.tagid) &&
        Objects.equals(this.urls, modForumAddDiscussionPost200ResponsePostTagsInner.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, flag, id, isstandard, tagid, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModForumAddDiscussionPost200ResponsePostTagsInner {\n");
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isstandard: ").append(toIndentedString(isstandard)).append("\n");
    sb.append("    tagid: ").append(toIndentedString(tagid)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
    openapiFields.add("displayname");
    openapiFields.add("flag");
    openapiFields.add("id");
    openapiFields.add("isstandard");
    openapiFields.add("tagid");
    openapiFields.add("urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModForumAddDiscussionPost200ResponsePostTagsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModForumAddDiscussionPost200ResponsePostTagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModForumAddDiscussionPost200ResponsePostTagsInner is not found in the empty JSON string", ModForumAddDiscussionPost200ResponsePostTagsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModForumAddDiscussionPost200ResponsePostTagsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModForumAddDiscussionPost200ResponsePostTagsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayname") != null && !jsonObj.get("displayname").isJsonNull()) && !jsonObj.get("displayname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayname").toString()));
      }
      // validate the optional field `urls`
      if (jsonObj.get("urls") != null && !jsonObj.get("urls").isJsonNull()) {
        ModForumAddDiscussionPost200ResponsePostTagsInnerUrls.validateJsonElement(jsonObj.get("urls"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModForumAddDiscussionPost200ResponsePostTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModForumAddDiscussionPost200ResponsePostTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModForumAddDiscussionPost200ResponsePostTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModForumAddDiscussionPost200ResponsePostTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModForumAddDiscussionPost200ResponsePostTagsInner>() {
           @Override
           public void write(JsonWriter out, ModForumAddDiscussionPost200ResponsePostTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModForumAddDiscussionPost200ResponsePostTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModForumAddDiscussionPost200ResponsePostTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModForumAddDiscussionPost200ResponsePostTagsInner
  * @throws IOException if the JSON string is invalid with respect to ModForumAddDiscussionPost200ResponsePostTagsInner
  */
  public static ModForumAddDiscussionPost200ResponsePostTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModForumAddDiscussionPost200ResponsePostTagsInner.class);
  }

 /**
  * Convert an instance of ModForumAddDiscussionPost200ResponsePostTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


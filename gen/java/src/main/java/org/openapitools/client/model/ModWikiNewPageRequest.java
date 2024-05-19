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
 * ModWikiNewPageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWikiNewPageRequest {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CONTENTFORMAT = "contentformat";
  @SerializedName(SERIALIZED_NAME_CONTENTFORMAT)
  private String contentformat = "null";

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid = null;

  public static final String SERIALIZED_NAME_SUBWIKIID = "subwikiid";
  @SerializedName(SERIALIZED_NAME_SUBWIKIID)
  private Integer subwikiid;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = "null";

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public static final String SERIALIZED_NAME_WIKIID = "wikiid";
  @SerializedName(SERIALIZED_NAME_WIKIID)
  private Integer wikiid = null;

  public ModWikiNewPageRequest() {
  }

  public ModWikiNewPageRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Page contents.
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public ModWikiNewPageRequest contentformat(String contentformat) {
    this.contentformat = contentformat;
    return this;
  }

   /**
   * Page contents format. If an invalid format is provided, default                     wiki format is used.
   * @return contentformat
  **/
  @javax.annotation.Nullable
  public String getContentformat() {
    return contentformat;
  }

  public void setContentformat(String contentformat) {
    this.contentformat = contentformat;
  }


  public ModWikiNewPageRequest groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * Subwiki&#39;s group ID. Used if subwiki does not exists.
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public ModWikiNewPageRequest subwikiid(Integer subwikiid) {
    this.subwikiid = subwikiid;
    return this;
  }

   /**
   * Page&#39;s subwiki ID.
   * @return subwikiid
  **/
  @javax.annotation.Nullable
  public Integer getSubwikiid() {
    return subwikiid;
  }

  public void setSubwikiid(Integer subwikiid) {
    this.subwikiid = subwikiid;
  }


  public ModWikiNewPageRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * New page title.
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public ModWikiNewPageRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * Subwiki&#39;s user ID. Used if subwiki does not exists.
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public ModWikiNewPageRequest wikiid(Integer wikiid) {
    this.wikiid = wikiid;
    return this;
  }

   /**
   * Page&#39;s wiki ID. Used if subwiki does not exists.
   * @return wikiid
  **/
  @javax.annotation.Nullable
  public Integer getWikiid() {
    return wikiid;
  }

  public void setWikiid(Integer wikiid) {
    this.wikiid = wikiid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModWikiNewPageRequest modWikiNewPageRequest = (ModWikiNewPageRequest) o;
    return Objects.equals(this.content, modWikiNewPageRequest.content) &&
        Objects.equals(this.contentformat, modWikiNewPageRequest.contentformat) &&
        Objects.equals(this.groupid, modWikiNewPageRequest.groupid) &&
        Objects.equals(this.subwikiid, modWikiNewPageRequest.subwikiid) &&
        Objects.equals(this.title, modWikiNewPageRequest.title) &&
        Objects.equals(this.userid, modWikiNewPageRequest.userid) &&
        Objects.equals(this.wikiid, modWikiNewPageRequest.wikiid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentformat, groupid, subwikiid, title, userid, wikiid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWikiNewPageRequest {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentformat: ").append(toIndentedString(contentformat)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    subwikiid: ").append(toIndentedString(subwikiid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    wikiid: ").append(toIndentedString(wikiid)).append("\n");
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
    openapiFields.add("groupid");
    openapiFields.add("subwikiid");
    openapiFields.add("title");
    openapiFields.add("userid");
    openapiFields.add("wikiid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWikiNewPageRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWikiNewPageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWikiNewPageRequest is not found in the empty JSON string", ModWikiNewPageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWikiNewPageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWikiNewPageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModWikiNewPageRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("contentformat") != null && !jsonObj.get("contentformat").isJsonNull()) && !jsonObj.get("contentformat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentformat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentformat").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModWikiNewPageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWikiNewPageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWikiNewPageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWikiNewPageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWikiNewPageRequest>() {
           @Override
           public void write(JsonWriter out, ModWikiNewPageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWikiNewPageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWikiNewPageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWikiNewPageRequest
  * @throws IOException if the JSON string is invalid with respect to ModWikiNewPageRequest
  */
  public static ModWikiNewPageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWikiNewPageRequest.class);
  }

 /**
  * Convert an instance of ModWikiNewPageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


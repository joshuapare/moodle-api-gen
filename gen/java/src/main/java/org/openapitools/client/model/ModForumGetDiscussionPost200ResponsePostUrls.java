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
 * ModForumGetDiscussionPost200ResponsePostUrls
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModForumGetDiscussionPost200ResponsePostUrls {
  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private String delete;

  public static final String SERIALIZED_NAME_DISCUSS = "discuss";
  @SerializedName(SERIALIZED_NAME_DISCUSS)
  private String discuss;

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  private String edit;

  public static final String SERIALIZED_NAME_EXPORT = "export";
  @SerializedName(SERIALIZED_NAME_EXPORT)
  private String export;

  public static final String SERIALIZED_NAME_MARKASREAD = "markasread";
  @SerializedName(SERIALIZED_NAME_MARKASREAD)
  private String markasread;

  public static final String SERIALIZED_NAME_MARKASUNREAD = "markasunread";
  @SerializedName(SERIALIZED_NAME_MARKASUNREAD)
  private String markasunread;

  public static final String SERIALIZED_NAME_REPLY = "reply";
  @SerializedName(SERIALIZED_NAME_REPLY)
  private String reply;

  public static final String SERIALIZED_NAME_SPLIT = "split";
  @SerializedName(SERIALIZED_NAME_SPLIT)
  private String split;

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private String view;

  public static final String SERIALIZED_NAME_VIEWISOLATED = "viewisolated";
  @SerializedName(SERIALIZED_NAME_VIEWISOLATED)
  private String viewisolated;

  public static final String SERIALIZED_NAME_VIEWPARENT = "viewparent";
  @SerializedName(SERIALIZED_NAME_VIEWPARENT)
  private String viewparent;

  public ModForumGetDiscussionPost200ResponsePostUrls() {
  }

  public ModForumGetDiscussionPost200ResponsePostUrls delete(String delete) {
    this.delete = delete;
    return this;
  }

   /**
   * The URL used to delete the post
   * @return delete
  **/
  @javax.annotation.Nullable
  public String getDelete() {
    return delete;
  }

  public void setDelete(String delete) {
    this.delete = delete;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls discuss(String discuss) {
    this.discuss = discuss;
    return this;
  }

   /**
   * discuss
   * @return discuss
  **/
  @javax.annotation.Nullable
  public String getDiscuss() {
    return discuss;
  }

  public void setDiscuss(String discuss) {
    this.discuss = discuss;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls edit(String edit) {
    this.edit = edit;
    return this;
  }

   /**
   * The URL used to edit the post
   * @return edit
  **/
  @javax.annotation.Nullable
  public String getEdit() {
    return edit;
  }

  public void setEdit(String edit) {
    this.edit = edit;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls export(String export) {
    this.export = export;
    return this;
  }

   /**
   * The URL used to export the post
   * @return export
  **/
  @javax.annotation.Nullable
  public String getExport() {
    return export;
  }

  public void setExport(String export) {
    this.export = export;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls markasread(String markasread) {
    this.markasread = markasread;
    return this;
  }

   /**
   * The URL used to mark the post as read
   * @return markasread
  **/
  @javax.annotation.Nullable
  public String getMarkasread() {
    return markasread;
  }

  public void setMarkasread(String markasread) {
    this.markasread = markasread;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls markasunread(String markasunread) {
    this.markasunread = markasunread;
    return this;
  }

   /**
   * The URL used to mark the post as unread
   * @return markasunread
  **/
  @javax.annotation.Nullable
  public String getMarkasunread() {
    return markasunread;
  }

  public void setMarkasunread(String markasunread) {
    this.markasunread = markasunread;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls reply(String reply) {
    this.reply = reply;
    return this;
  }

   /**
   * The URL used to reply to the post
   * @return reply
  **/
  @javax.annotation.Nullable
  public String getReply() {
    return reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls split(String split) {
    this.split = split;
    return this;
  }

   /**
   * The URL used to split the discussion with the selected post being the first post in the new discussion
   * @return split
  **/
  @javax.annotation.Nullable
  public String getSplit() {
    return split;
  }

  public void setSplit(String split) {
    this.split = split;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls view(String view) {
    this.view = view;
    return this;
  }

   /**
   * The URL used to view the post
   * @return view
  **/
  @javax.annotation.Nullable
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls viewisolated(String viewisolated) {
    this.viewisolated = viewisolated;
    return this;
  }

   /**
   * The URL used to view the post in isolation
   * @return viewisolated
  **/
  @javax.annotation.Nullable
  public String getViewisolated() {
    return viewisolated;
  }

  public void setViewisolated(String viewisolated) {
    this.viewisolated = viewisolated;
  }


  public ModForumGetDiscussionPost200ResponsePostUrls viewparent(String viewparent) {
    this.viewparent = viewparent;
    return this;
  }

   /**
   * The URL used to view the parent of the post
   * @return viewparent
  **/
  @javax.annotation.Nullable
  public String getViewparent() {
    return viewparent;
  }

  public void setViewparent(String viewparent) {
    this.viewparent = viewparent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModForumGetDiscussionPost200ResponsePostUrls modForumGetDiscussionPost200ResponsePostUrls = (ModForumGetDiscussionPost200ResponsePostUrls) o;
    return Objects.equals(this.delete, modForumGetDiscussionPost200ResponsePostUrls.delete) &&
        Objects.equals(this.discuss, modForumGetDiscussionPost200ResponsePostUrls.discuss) &&
        Objects.equals(this.edit, modForumGetDiscussionPost200ResponsePostUrls.edit) &&
        Objects.equals(this.export, modForumGetDiscussionPost200ResponsePostUrls.export) &&
        Objects.equals(this.markasread, modForumGetDiscussionPost200ResponsePostUrls.markasread) &&
        Objects.equals(this.markasunread, modForumGetDiscussionPost200ResponsePostUrls.markasunread) &&
        Objects.equals(this.reply, modForumGetDiscussionPost200ResponsePostUrls.reply) &&
        Objects.equals(this.split, modForumGetDiscussionPost200ResponsePostUrls.split) &&
        Objects.equals(this.view, modForumGetDiscussionPost200ResponsePostUrls.view) &&
        Objects.equals(this.viewisolated, modForumGetDiscussionPost200ResponsePostUrls.viewisolated) &&
        Objects.equals(this.viewparent, modForumGetDiscussionPost200ResponsePostUrls.viewparent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delete, discuss, edit, export, markasread, markasunread, reply, split, view, viewisolated, viewparent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModForumGetDiscussionPost200ResponsePostUrls {\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    discuss: ").append(toIndentedString(discuss)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
    sb.append("    markasread: ").append(toIndentedString(markasread)).append("\n");
    sb.append("    markasunread: ").append(toIndentedString(markasunread)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewisolated: ").append(toIndentedString(viewisolated)).append("\n");
    sb.append("    viewparent: ").append(toIndentedString(viewparent)).append("\n");
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
    openapiFields.add("delete");
    openapiFields.add("discuss");
    openapiFields.add("edit");
    openapiFields.add("export");
    openapiFields.add("markasread");
    openapiFields.add("markasunread");
    openapiFields.add("reply");
    openapiFields.add("split");
    openapiFields.add("view");
    openapiFields.add("viewisolated");
    openapiFields.add("viewparent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModForumGetDiscussionPost200ResponsePostUrls
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModForumGetDiscussionPost200ResponsePostUrls.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModForumGetDiscussionPost200ResponsePostUrls is not found in the empty JSON string", ModForumGetDiscussionPost200ResponsePostUrls.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModForumGetDiscussionPost200ResponsePostUrls.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModForumGetDiscussionPost200ResponsePostUrls` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delete") != null && !jsonObj.get("delete").isJsonNull()) && !jsonObj.get("delete").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete").toString()));
      }
      if ((jsonObj.get("discuss") != null && !jsonObj.get("discuss").isJsonNull()) && !jsonObj.get("discuss").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discuss` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discuss").toString()));
      }
      if ((jsonObj.get("edit") != null && !jsonObj.get("edit").isJsonNull()) && !jsonObj.get("edit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edit").toString()));
      }
      if ((jsonObj.get("export") != null && !jsonObj.get("export").isJsonNull()) && !jsonObj.get("export").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `export` to be a primitive type in the JSON string but got `%s`", jsonObj.get("export").toString()));
      }
      if ((jsonObj.get("markasread") != null && !jsonObj.get("markasread").isJsonNull()) && !jsonObj.get("markasread").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `markasread` to be a primitive type in the JSON string but got `%s`", jsonObj.get("markasread").toString()));
      }
      if ((jsonObj.get("markasunread") != null && !jsonObj.get("markasunread").isJsonNull()) && !jsonObj.get("markasunread").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `markasunread` to be a primitive type in the JSON string but got `%s`", jsonObj.get("markasunread").toString()));
      }
      if ((jsonObj.get("reply") != null && !jsonObj.get("reply").isJsonNull()) && !jsonObj.get("reply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply").toString()));
      }
      if ((jsonObj.get("split") != null && !jsonObj.get("split").isJsonNull()) && !jsonObj.get("split").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `split` to be a primitive type in the JSON string but got `%s`", jsonObj.get("split").toString()));
      }
      if ((jsonObj.get("view") != null && !jsonObj.get("view").isJsonNull()) && !jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
      if ((jsonObj.get("viewisolated") != null && !jsonObj.get("viewisolated").isJsonNull()) && !jsonObj.get("viewisolated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewisolated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewisolated").toString()));
      }
      if ((jsonObj.get("viewparent") != null && !jsonObj.get("viewparent").isJsonNull()) && !jsonObj.get("viewparent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewparent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewparent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModForumGetDiscussionPost200ResponsePostUrls.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModForumGetDiscussionPost200ResponsePostUrls' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModForumGetDiscussionPost200ResponsePostUrls> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModForumGetDiscussionPost200ResponsePostUrls.class));

       return (TypeAdapter<T>) new TypeAdapter<ModForumGetDiscussionPost200ResponsePostUrls>() {
           @Override
           public void write(JsonWriter out, ModForumGetDiscussionPost200ResponsePostUrls value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModForumGetDiscussionPost200ResponsePostUrls read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModForumGetDiscussionPost200ResponsePostUrls given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModForumGetDiscussionPost200ResponsePostUrls
  * @throws IOException if the JSON string is invalid with respect to ModForumGetDiscussionPost200ResponsePostUrls
  */
  public static ModForumGetDiscussionPost200ResponsePostUrls fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModForumGetDiscussionPost200ResponsePostUrls.class);
  }

 /**
  * Convert an instance of ModForumGetDiscussionPost200ResponsePostUrls to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

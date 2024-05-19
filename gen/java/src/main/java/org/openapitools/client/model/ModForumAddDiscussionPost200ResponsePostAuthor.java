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
import org.openapitools.client.model.ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner;
import org.openapitools.client.model.ModForumAddDiscussionPost200ResponsePostAuthorUrls;

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
 * ModForumAddDiscussionPost200ResponsePostAuthor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModForumAddDiscussionPost200ResponsePostAuthor {
  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ISDELETED = "isdeleted";
  @SerializedName(SERIALIZED_NAME_ISDELETED)
  private Boolean isdeleted = null;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private ModForumAddDiscussionPost200ResponsePostAuthorUrls urls;

  public ModForumAddDiscussionPost200ResponsePostAuthor() {
  }

  public ModForumAddDiscussionPost200ResponsePostAuthor fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * fullname
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public ModForumAddDiscussionPost200ResponsePostAuthor groups(List<ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public ModForumAddDiscussionPost200ResponsePostAuthor addGroupsItem(ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner> getGroups() {
    return groups;
  }

  public void setGroups(List<ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner> groups) {
    this.groups = groups;
  }


  public ModForumAddDiscussionPost200ResponsePostAuthor id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModForumAddDiscussionPost200ResponsePostAuthor isdeleted(Boolean isdeleted) {
    this.isdeleted = isdeleted;
    return this;
  }

   /**
   * isdeleted
   * @return isdeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsdeleted() {
    return isdeleted;
  }

  public void setIsdeleted(Boolean isdeleted) {
    this.isdeleted = isdeleted;
  }


  public ModForumAddDiscussionPost200ResponsePostAuthor urls(ModForumAddDiscussionPost200ResponsePostAuthorUrls urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nonnull
  public ModForumAddDiscussionPost200ResponsePostAuthorUrls getUrls() {
    return urls;
  }

  public void setUrls(ModForumAddDiscussionPost200ResponsePostAuthorUrls urls) {
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
    ModForumAddDiscussionPost200ResponsePostAuthor modForumAddDiscussionPost200ResponsePostAuthor = (ModForumAddDiscussionPost200ResponsePostAuthor) o;
    return Objects.equals(this.fullname, modForumAddDiscussionPost200ResponsePostAuthor.fullname) &&
        Objects.equals(this.groups, modForumAddDiscussionPost200ResponsePostAuthor.groups) &&
        Objects.equals(this.id, modForumAddDiscussionPost200ResponsePostAuthor.id) &&
        Objects.equals(this.isdeleted, modForumAddDiscussionPost200ResponsePostAuthor.isdeleted) &&
        Objects.equals(this.urls, modForumAddDiscussionPost200ResponsePostAuthor.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullname, groups, id, isdeleted, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModForumAddDiscussionPost200ResponsePostAuthor {\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isdeleted: ").append(toIndentedString(isdeleted)).append("\n");
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
    openapiFields.add("fullname");
    openapiFields.add("groups");
    openapiFields.add("id");
    openapiFields.add("isdeleted");
    openapiFields.add("urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("urls");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModForumAddDiscussionPost200ResponsePostAuthor
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModForumAddDiscussionPost200ResponsePostAuthor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModForumAddDiscussionPost200ResponsePostAuthor is not found in the empty JSON string", ModForumAddDiscussionPost200ResponsePostAuthor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModForumAddDiscussionPost200ResponsePostAuthor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModForumAddDiscussionPost200ResponsePostAuthor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModForumAddDiscussionPost200ResponsePostAuthor.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
      // validate the required field `urls`
      ModForumAddDiscussionPost200ResponsePostAuthorUrls.validateJsonElement(jsonObj.get("urls"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModForumAddDiscussionPost200ResponsePostAuthor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModForumAddDiscussionPost200ResponsePostAuthor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModForumAddDiscussionPost200ResponsePostAuthor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModForumAddDiscussionPost200ResponsePostAuthor.class));

       return (TypeAdapter<T>) new TypeAdapter<ModForumAddDiscussionPost200ResponsePostAuthor>() {
           @Override
           public void write(JsonWriter out, ModForumAddDiscussionPost200ResponsePostAuthor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModForumAddDiscussionPost200ResponsePostAuthor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModForumAddDiscussionPost200ResponsePostAuthor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModForumAddDiscussionPost200ResponsePostAuthor
  * @throws IOException if the JSON string is invalid with respect to ModForumAddDiscussionPost200ResponsePostAuthor
  */
  public static ModForumAddDiscussionPost200ResponsePostAuthor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModForumAddDiscussionPost200ResponsePostAuthor.class);
  }

 /**
  * Convert an instance of ModForumAddDiscussionPost200ResponsePostAuthor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


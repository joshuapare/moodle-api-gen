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
import org.openapitools.client.model.ModForumGetDiscussionPosts200ResponsePostsInner;

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
 * ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts {
  public static final String SERIALIZED_NAME_PARENTPOSTS = "parentposts";
  @SerializedName(SERIALIZED_NAME_PARENTPOSTS)
  private List<ModForumGetDiscussionPosts200ResponsePostsInner> parentposts = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERPOSTS = "userposts";
  @SerializedName(SERIALIZED_NAME_USERPOSTS)
  private List<ModForumGetDiscussionPosts200ResponsePostsInner> userposts = new ArrayList<>();

  public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts() {
  }

  public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts parentposts(List<ModForumGetDiscussionPosts200ResponsePostsInner> parentposts) {
    this.parentposts = parentposts;
    return this;
  }

  public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts addParentpostsItem(ModForumGetDiscussionPosts200ResponsePostsInner parentpostsItem) {
    if (this.parentposts == null) {
      this.parentposts = new ArrayList<>();
    }
    this.parentposts.add(parentpostsItem);
    return this;
  }

   /**
   * Get parentposts
   * @return parentposts
  **/
  @javax.annotation.Nonnull
  public List<ModForumGetDiscussionPosts200ResponsePostsInner> getParentposts() {
    return parentposts;
  }

  public void setParentposts(List<ModForumGetDiscussionPosts200ResponsePostsInner> parentposts) {
    this.parentposts = parentposts;
  }


  public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts userposts(List<ModForumGetDiscussionPosts200ResponsePostsInner> userposts) {
    this.userposts = userposts;
    return this;
  }

  public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts addUserpostsItem(ModForumGetDiscussionPosts200ResponsePostsInner userpostsItem) {
    if (this.userposts == null) {
      this.userposts = new ArrayList<>();
    }
    this.userposts.add(userpostsItem);
    return this;
  }

   /**
   * Get userposts
   * @return userposts
  **/
  @javax.annotation.Nonnull
  public List<ModForumGetDiscussionPosts200ResponsePostsInner> getUserposts() {
    return userposts;
  }

  public void setUserposts(List<ModForumGetDiscussionPosts200ResponsePostsInner> userposts) {
    this.userposts = userposts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts modForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts = (ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts) o;
    return Objects.equals(this.parentposts, modForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.parentposts) &&
        Objects.equals(this.userposts, modForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.userposts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentposts, userposts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts {\n");
    sb.append("    parentposts: ").append(toIndentedString(parentposts)).append("\n");
    sb.append("    userposts: ").append(toIndentedString(userposts)).append("\n");
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
    openapiFields.add("parentposts");
    openapiFields.add("userposts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parentposts");
    openapiRequiredFields.add("userposts");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts is not found in the empty JSON string", ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("parentposts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentposts` to be an array in the JSON string but got `%s`", jsonObj.get("parentposts").toString()));
      }

      JsonArray jsonArrayparentposts = jsonObj.getAsJsonArray("parentposts");
      // validate the required field `parentposts` (array)
      for (int i = 0; i < jsonArrayparentposts.size(); i++) {
        ModForumGetDiscussionPosts200ResponsePostsInner.validateJsonElement(jsonArrayparentposts.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("userposts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userposts` to be an array in the JSON string but got `%s`", jsonObj.get("userposts").toString()));
      }

      JsonArray jsonArrayuserposts = jsonObj.getAsJsonArray("userposts");
      // validate the required field `userposts` (array)
      for (int i = 0; i < jsonArrayuserposts.size(); i++) {
        ModForumGetDiscussionPosts200ResponsePostsInner.validateJsonElement(jsonArrayuserposts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.class));

       return (TypeAdapter<T>) new TypeAdapter<ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts>() {
           @Override
           public void write(JsonWriter out, ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts
  * @throws IOException if the JSON string is invalid with respect to ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts
  */
  public static ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.class);
  }

 /**
  * Convert an instance of ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


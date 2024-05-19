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
import org.openapitools.client.model.ModForumUpdateDiscussionPostRequestOptionsInner;

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
 * ModForumUpdateDiscussionPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModForumUpdateDiscussionPostRequest {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = "";

  public static final String SERIALIZED_NAME_MESSAGEFORMAT = "messageformat";
  @SerializedName(SERIALIZED_NAME_MESSAGEFORMAT)
  private Integer messageformat = 1;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ModForumUpdateDiscussionPostRequestOptionsInner> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_POSTID = "postid";
  @SerializedName(SERIALIZED_NAME_POSTID)
  private Integer postid = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject = "";

  public ModForumUpdateDiscussionPostRequest() {
  }

  public ModForumUpdateDiscussionPostRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Updated post message (HTML assumed if messageformat is not provided)
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public ModForumUpdateDiscussionPostRequest messageformat(Integer messageformat) {
    this.messageformat = messageformat;
    return this;
  }

   /**
   * message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return messageformat
  **/
  @javax.annotation.Nullable
  public Integer getMessageformat() {
    return messageformat;
  }

  public void setMessageformat(Integer messageformat) {
    this.messageformat = messageformat;
  }


  public ModForumUpdateDiscussionPostRequest options(List<ModForumUpdateDiscussionPostRequestOptionsInner> options) {
    this.options = options;
    return this;
  }

  public ModForumUpdateDiscussionPostRequest addOptionsItem(ModForumUpdateDiscussionPostRequestOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public List<ModForumUpdateDiscussionPostRequestOptionsInner> getOptions() {
    return options;
  }

  public void setOptions(List<ModForumUpdateDiscussionPostRequestOptionsInner> options) {
    this.options = options;
  }


  public ModForumUpdateDiscussionPostRequest postid(Integer postid) {
    this.postid = postid;
    return this;
  }

   /**
   * Post to be updated. It can be a discussion topic post.
   * @return postid
  **/
  @javax.annotation.Nonnull
  public Integer getPostid() {
    return postid;
  }

  public void setPostid(Integer postid) {
    this.postid = postid;
  }


  public ModForumUpdateDiscussionPostRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Updated post subject
   * @return subject
  **/
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModForumUpdateDiscussionPostRequest modForumUpdateDiscussionPostRequest = (ModForumUpdateDiscussionPostRequest) o;
    return Objects.equals(this.message, modForumUpdateDiscussionPostRequest.message) &&
        Objects.equals(this.messageformat, modForumUpdateDiscussionPostRequest.messageformat) &&
        Objects.equals(this.options, modForumUpdateDiscussionPostRequest.options) &&
        Objects.equals(this.postid, modForumUpdateDiscussionPostRequest.postid) &&
        Objects.equals(this.subject, modForumUpdateDiscussionPostRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageformat, options, postid, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModForumUpdateDiscussionPostRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageformat: ").append(toIndentedString(messageformat)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    postid: ").append(toIndentedString(postid)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("messageformat");
    openapiFields.add("options");
    openapiFields.add("postid");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("postid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModForumUpdateDiscussionPostRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModForumUpdateDiscussionPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModForumUpdateDiscussionPostRequest is not found in the empty JSON string", ModForumUpdateDiscussionPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModForumUpdateDiscussionPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModForumUpdateDiscussionPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModForumUpdateDiscussionPostRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            ModForumUpdateDiscussionPostRequestOptionsInner.validateJsonElement(jsonArrayoptions.get(i));
          };
        }
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModForumUpdateDiscussionPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModForumUpdateDiscussionPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModForumUpdateDiscussionPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModForumUpdateDiscussionPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModForumUpdateDiscussionPostRequest>() {
           @Override
           public void write(JsonWriter out, ModForumUpdateDiscussionPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModForumUpdateDiscussionPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModForumUpdateDiscussionPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModForumUpdateDiscussionPostRequest
  * @throws IOException if the JSON string is invalid with respect to ModForumUpdateDiscussionPostRequest
  */
  public static ModForumUpdateDiscussionPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModForumUpdateDiscussionPostRequest.class);
  }

 /**
  * Convert an instance of ModForumUpdateDiscussionPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.AuthEmailSignupUser200ResponseWarningsInner;
import org.openapitools.client.model.CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner;
import org.openapitools.client.model.ModLessonGetPageData200ResponseAnswersInner;
import org.openapitools.client.model.ModLessonGetPageData200ResponseMessagesInner;
import org.openapitools.client.model.ModLessonGetPageData200ResponsePage;

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
 * ModLessonGetPageData200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLessonGetPageData200Response {
  public static final String SERIALIZED_NAME_ANSWERS = "answers";
  @SerializedName(SERIALIZED_NAME_ANSWERS)
  private List<ModLessonGetPageData200ResponseAnswersInner> answers = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTENTFILES = "contentfiles";
  @SerializedName(SERIALIZED_NAME_CONTENTFILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> contentfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISPLAYMENU = "displaymenu";
  @SerializedName(SERIALIZED_NAME_DISPLAYMENU)
  private Boolean displaymenu = null;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ModLessonGetPageData200ResponseMessagesInner> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEWPAGEID = "newpageid";
  @SerializedName(SERIALIZED_NAME_NEWPAGEID)
  private Integer newpageid = null;

  public static final String SERIALIZED_NAME_ONGOINGSCORE = "ongoingscore";
  @SerializedName(SERIALIZED_NAME_ONGOINGSCORE)
  private String ongoingscore = "null";

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private ModLessonGetPageData200ResponsePage page;

  public static final String SERIALIZED_NAME_PAGECONTENT = "pagecontent";
  @SerializedName(SERIALIZED_NAME_PAGECONTENT)
  private String pagecontent = "null";

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Integer progress = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModLessonGetPageData200Response() {
  }

  public ModLessonGetPageData200Response answers(List<ModLessonGetPageData200ResponseAnswersInner> answers) {
    this.answers = answers;
    return this;
  }

  public ModLessonGetPageData200Response addAnswersItem(ModLessonGetPageData200ResponseAnswersInner answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @javax.annotation.Nonnull
  public List<ModLessonGetPageData200ResponseAnswersInner> getAnswers() {
    return answers;
  }

  public void setAnswers(List<ModLessonGetPageData200ResponseAnswersInner> answers) {
    this.answers = answers;
  }


  public ModLessonGetPageData200Response contentfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> contentfiles) {
    this.contentfiles = contentfiles;
    return this;
  }

  public ModLessonGetPageData200Response addContentfilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner contentfilesItem) {
    if (this.contentfiles == null) {
      this.contentfiles = new ArrayList<>();
    }
    this.contentfiles.add(contentfilesItem);
    return this;
  }

   /**
   * Get contentfiles
   * @return contentfiles
  **/
  @javax.annotation.Nonnull
  public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> getContentfiles() {
    return contentfiles;
  }

  public void setContentfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> contentfiles) {
    this.contentfiles = contentfiles;
  }


  public ModLessonGetPageData200Response displaymenu(Boolean displaymenu) {
    this.displaymenu = displaymenu;
    return this;
  }

   /**
   * Whether we should display the menu or not in this page.
   * @return displaymenu
  **/
  @javax.annotation.Nonnull
  public Boolean getDisplaymenu() {
    return displaymenu;
  }

  public void setDisplaymenu(Boolean displaymenu) {
    this.displaymenu = displaymenu;
  }


  public ModLessonGetPageData200Response messages(List<ModLessonGetPageData200ResponseMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public ModLessonGetPageData200Response addMessagesItem(ModLessonGetPageData200ResponseMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nonnull
  public List<ModLessonGetPageData200ResponseMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<ModLessonGetPageData200ResponseMessagesInner> messages) {
    this.messages = messages;
  }


  public ModLessonGetPageData200Response newpageid(Integer newpageid) {
    this.newpageid = newpageid;
    return this;
  }

   /**
   * New page id (if a jump was made)
   * @return newpageid
  **/
  @javax.annotation.Nonnull
  public Integer getNewpageid() {
    return newpageid;
  }

  public void setNewpageid(Integer newpageid) {
    this.newpageid = newpageid;
  }


  public ModLessonGetPageData200Response ongoingscore(String ongoingscore) {
    this.ongoingscore = ongoingscore;
    return this;
  }

   /**
   * The ongoing score message
   * @return ongoingscore
  **/
  @javax.annotation.Nonnull
  public String getOngoingscore() {
    return ongoingscore;
  }

  public void setOngoingscore(String ongoingscore) {
    this.ongoingscore = ongoingscore;
  }


  public ModLessonGetPageData200Response page(ModLessonGetPageData200ResponsePage page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  public ModLessonGetPageData200ResponsePage getPage() {
    return page;
  }

  public void setPage(ModLessonGetPageData200ResponsePage page) {
    this.page = page;
  }


  public ModLessonGetPageData200Response pagecontent(String pagecontent) {
    this.pagecontent = pagecontent;
    return this;
  }

   /**
   * Page html content
   * @return pagecontent
  **/
  @javax.annotation.Nullable
  public String getPagecontent() {
    return pagecontent;
  }

  public void setPagecontent(String pagecontent) {
    this.pagecontent = pagecontent;
  }


  public ModLessonGetPageData200Response progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Progress percentage in the lesson
   * @return progress
  **/
  @javax.annotation.Nonnull
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public ModLessonGetPageData200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModLessonGetPageData200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  public List<AuthEmailSignupUser200ResponseWarningsInner> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLessonGetPageData200Response modLessonGetPageData200Response = (ModLessonGetPageData200Response) o;
    return Objects.equals(this.answers, modLessonGetPageData200Response.answers) &&
        Objects.equals(this.contentfiles, modLessonGetPageData200Response.contentfiles) &&
        Objects.equals(this.displaymenu, modLessonGetPageData200Response.displaymenu) &&
        Objects.equals(this.messages, modLessonGetPageData200Response.messages) &&
        Objects.equals(this.newpageid, modLessonGetPageData200Response.newpageid) &&
        Objects.equals(this.ongoingscore, modLessonGetPageData200Response.ongoingscore) &&
        Objects.equals(this.page, modLessonGetPageData200Response.page) &&
        Objects.equals(this.pagecontent, modLessonGetPageData200Response.pagecontent) &&
        Objects.equals(this.progress, modLessonGetPageData200Response.progress) &&
        Objects.equals(this.warnings, modLessonGetPageData200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers, contentfiles, displaymenu, messages, newpageid, ongoingscore, page, pagecontent, progress, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLessonGetPageData200Response {\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    contentfiles: ").append(toIndentedString(contentfiles)).append("\n");
    sb.append("    displaymenu: ").append(toIndentedString(displaymenu)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    newpageid: ").append(toIndentedString(newpageid)).append("\n");
    sb.append("    ongoingscore: ").append(toIndentedString(ongoingscore)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pagecontent: ").append(toIndentedString(pagecontent)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("answers");
    openapiFields.add("contentfiles");
    openapiFields.add("displaymenu");
    openapiFields.add("messages");
    openapiFields.add("newpageid");
    openapiFields.add("ongoingscore");
    openapiFields.add("page");
    openapiFields.add("pagecontent");
    openapiFields.add("progress");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("answers");
    openapiRequiredFields.add("contentfiles");
    openapiRequiredFields.add("displaymenu");
    openapiRequiredFields.add("messages");
    openapiRequiredFields.add("newpageid");
    openapiRequiredFields.add("ongoingscore");
    openapiRequiredFields.add("progress");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLessonGetPageData200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLessonGetPageData200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLessonGetPageData200Response is not found in the empty JSON string", ModLessonGetPageData200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLessonGetPageData200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLessonGetPageData200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLessonGetPageData200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("answers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `answers` to be an array in the JSON string but got `%s`", jsonObj.get("answers").toString()));
      }

      JsonArray jsonArrayanswers = jsonObj.getAsJsonArray("answers");
      // validate the required field `answers` (array)
      for (int i = 0; i < jsonArrayanswers.size(); i++) {
        ModLessonGetPageData200ResponseAnswersInner.validateJsonElement(jsonArrayanswers.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("contentfiles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentfiles` to be an array in the JSON string but got `%s`", jsonObj.get("contentfiles").toString()));
      }

      JsonArray jsonArraycontentfiles = jsonObj.getAsJsonArray("contentfiles");
      // validate the required field `contentfiles` (array)
      for (int i = 0; i < jsonArraycontentfiles.size(); i++) {
        CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArraycontentfiles.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        ModLessonGetPageData200ResponseMessagesInner.validateJsonElement(jsonArraymessages.get(i));
      };
      if (!jsonObj.get("ongoingscore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ongoingscore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ongoingscore").toString()));
      }
      // validate the optional field `page`
      if (jsonObj.get("page") != null && !jsonObj.get("page").isJsonNull()) {
        ModLessonGetPageData200ResponsePage.validateJsonElement(jsonObj.get("page"));
      }
      if ((jsonObj.get("pagecontent") != null && !jsonObj.get("pagecontent").isJsonNull()) && !jsonObj.get("pagecontent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pagecontent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pagecontent").toString()));
      }
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) {
        JsonArray jsonArraywarnings = jsonObj.getAsJsonArray("warnings");
        if (jsonArraywarnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
          }

          // validate the optional field `warnings` (array)
          for (int i = 0; i < jsonArraywarnings.size(); i++) {
            AuthEmailSignupUser200ResponseWarningsInner.validateJsonElement(jsonArraywarnings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLessonGetPageData200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLessonGetPageData200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLessonGetPageData200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLessonGetPageData200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLessonGetPageData200Response>() {
           @Override
           public void write(JsonWriter out, ModLessonGetPageData200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLessonGetPageData200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLessonGetPageData200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLessonGetPageData200Response
  * @throws IOException if the JSON string is invalid with respect to ModLessonGetPageData200Response
  */
  public static ModLessonGetPageData200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLessonGetPageData200Response.class);
  }

 /**
  * Convert an instance of ModLessonGetPageData200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


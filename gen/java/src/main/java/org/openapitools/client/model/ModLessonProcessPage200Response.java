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
import org.openapitools.client.model.ModLessonGetPageData200ResponseMessagesInner;

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
 * ModLessonProcessPage200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLessonProcessPage200Response {
  public static final String SERIALIZED_NAME_ATTEMPTSREMAINING = "attemptsremaining";
  @SerializedName(SERIALIZED_NAME_ATTEMPTSREMAINING)
  private Integer attemptsremaining = null;

  public static final String SERIALIZED_NAME_CORRECTANSWER = "correctanswer";
  @SerializedName(SERIALIZED_NAME_CORRECTANSWER)
  private Boolean correctanswer = null;

  public static final String SERIALIZED_NAME_DISPLAYMENU = "displaymenu";
  @SerializedName(SERIALIZED_NAME_DISPLAYMENU)
  private Boolean displaymenu;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private String feedback = "null";

  public static final String SERIALIZED_NAME_INMEDIATEJUMP = "inmediatejump";
  @SerializedName(SERIALIZED_NAME_INMEDIATEJUMP)
  private Boolean inmediatejump = null;

  public static final String SERIALIZED_NAME_ISESSAYQUESTION = "isessayquestion";
  @SerializedName(SERIALIZED_NAME_ISESSAYQUESTION)
  private Boolean isessayquestion = null;

  public static final String SERIALIZED_NAME_MAXATTEMPTSREACHED = "maxattemptsreached";
  @SerializedName(SERIALIZED_NAME_MAXATTEMPTSREACHED)
  private Boolean maxattemptsreached = null;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ModLessonGetPageData200ResponseMessagesInner> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEWPAGEID = "newpageid";
  @SerializedName(SERIALIZED_NAME_NEWPAGEID)
  private Integer newpageid = null;

  public static final String SERIALIZED_NAME_NOANSWER = "noanswer";
  @SerializedName(SERIALIZED_NAME_NOANSWER)
  private Boolean noanswer = null;

  public static final String SERIALIZED_NAME_NODEFAULTRESPONSE = "nodefaultresponse";
  @SerializedName(SERIALIZED_NAME_NODEFAULTRESPONSE)
  private Boolean nodefaultresponse = null;

  public static final String SERIALIZED_NAME_ONGOINGSCORE = "ongoingscore";
  @SerializedName(SERIALIZED_NAME_ONGOINGSCORE)
  private String ongoingscore = "null";

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Integer progress = null;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response = "null";

  public static final String SERIALIZED_NAME_REVIEWMODE = "reviewmode";
  @SerializedName(SERIALIZED_NAME_REVIEWMODE)
  private Boolean reviewmode = null;

  public static final String SERIALIZED_NAME_STUDENTANSWER = "studentanswer";
  @SerializedName(SERIALIZED_NAME_STUDENTANSWER)
  private String studentanswer = "null";

  public static final String SERIALIZED_NAME_USERRESPONSE = "userresponse";
  @SerializedName(SERIALIZED_NAME_USERRESPONSE)
  private String userresponse = "null";

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModLessonProcessPage200Response() {
  }

  public ModLessonProcessPage200Response attemptsremaining(Integer attemptsremaining) {
    this.attemptsremaining = attemptsremaining;
    return this;
  }

   /**
   * Number of attempts remaining.
   * @return attemptsremaining
  **/
  @javax.annotation.Nonnull
  public Integer getAttemptsremaining() {
    return attemptsremaining;
  }

  public void setAttemptsremaining(Integer attemptsremaining) {
    this.attemptsremaining = attemptsremaining;
  }


  public ModLessonProcessPage200Response correctanswer(Boolean correctanswer) {
    this.correctanswer = correctanswer;
    return this;
  }

   /**
   * Whether the answer is correct.
   * @return correctanswer
  **/
  @javax.annotation.Nonnull
  public Boolean getCorrectanswer() {
    return correctanswer;
  }

  public void setCorrectanswer(Boolean correctanswer) {
    this.correctanswer = correctanswer;
  }


  public ModLessonProcessPage200Response displaymenu(Boolean displaymenu) {
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


  public ModLessonProcessPage200Response feedback(String feedback) {
    this.feedback = feedback;
    return this;
  }

   /**
   * The response feedback.
   * @return feedback
  **/
  @javax.annotation.Nonnull
  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }


  public ModLessonProcessPage200Response inmediatejump(Boolean inmediatejump) {
    this.inmediatejump = inmediatejump;
    return this;
  }

   /**
   * Whether the page processing redirect directly to anoter page.
   * @return inmediatejump
  **/
  @javax.annotation.Nonnull
  public Boolean getInmediatejump() {
    return inmediatejump;
  }

  public void setInmediatejump(Boolean inmediatejump) {
    this.inmediatejump = inmediatejump;
  }


  public ModLessonProcessPage200Response isessayquestion(Boolean isessayquestion) {
    this.isessayquestion = isessayquestion;
    return this;
  }

   /**
   * Whether is a essay question.
   * @return isessayquestion
  **/
  @javax.annotation.Nonnull
  public Boolean getIsessayquestion() {
    return isessayquestion;
  }

  public void setIsessayquestion(Boolean isessayquestion) {
    this.isessayquestion = isessayquestion;
  }


  public ModLessonProcessPage200Response maxattemptsreached(Boolean maxattemptsreached) {
    this.maxattemptsreached = maxattemptsreached;
    return this;
  }

   /**
   * Whether we reachered the max number of attempts.
   * @return maxattemptsreached
  **/
  @javax.annotation.Nonnull
  public Boolean getMaxattemptsreached() {
    return maxattemptsreached;
  }

  public void setMaxattemptsreached(Boolean maxattemptsreached) {
    this.maxattemptsreached = maxattemptsreached;
  }


  public ModLessonProcessPage200Response messages(List<ModLessonGetPageData200ResponseMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public ModLessonProcessPage200Response addMessagesItem(ModLessonGetPageData200ResponseMessagesInner messagesItem) {
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


  public ModLessonProcessPage200Response newpageid(Integer newpageid) {
    this.newpageid = newpageid;
    return this;
  }

   /**
   * New page id (if a jump was made).
   * @return newpageid
  **/
  @javax.annotation.Nonnull
  public Integer getNewpageid() {
    return newpageid;
  }

  public void setNewpageid(Integer newpageid) {
    this.newpageid = newpageid;
  }


  public ModLessonProcessPage200Response noanswer(Boolean noanswer) {
    this.noanswer = noanswer;
    return this;
  }

   /**
   * Whether there aren&#39;t answers.
   * @return noanswer
  **/
  @javax.annotation.Nonnull
  public Boolean getNoanswer() {
    return noanswer;
  }

  public void setNoanswer(Boolean noanswer) {
    this.noanswer = noanswer;
  }


  public ModLessonProcessPage200Response nodefaultresponse(Boolean nodefaultresponse) {
    this.nodefaultresponse = nodefaultresponse;
    return this;
  }

   /**
   * Whether there is not a default response.
   * @return nodefaultresponse
  **/
  @javax.annotation.Nonnull
  public Boolean getNodefaultresponse() {
    return nodefaultresponse;
  }

  public void setNodefaultresponse(Boolean nodefaultresponse) {
    this.nodefaultresponse = nodefaultresponse;
  }


  public ModLessonProcessPage200Response ongoingscore(String ongoingscore) {
    this.ongoingscore = ongoingscore;
    return this;
  }

   /**
   * The ongoing message.
   * @return ongoingscore
  **/
  @javax.annotation.Nonnull
  public String getOngoingscore() {
    return ongoingscore;
  }

  public void setOngoingscore(String ongoingscore) {
    this.ongoingscore = ongoingscore;
  }


  public ModLessonProcessPage200Response progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Progress percentage in the lesson.
   * @return progress
  **/
  @javax.annotation.Nonnull
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public ModLessonProcessPage200Response response(String response) {
    this.response = response;
    return this;
  }

   /**
   * The response.
   * @return response
  **/
  @javax.annotation.Nonnull
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  public ModLessonProcessPage200Response reviewmode(Boolean reviewmode) {
    this.reviewmode = reviewmode;
    return this;
  }

   /**
   * Whether the user is reviewing.
   * @return reviewmode
  **/
  @javax.annotation.Nonnull
  public Boolean getReviewmode() {
    return reviewmode;
  }

  public void setReviewmode(Boolean reviewmode) {
    this.reviewmode = reviewmode;
  }


  public ModLessonProcessPage200Response studentanswer(String studentanswer) {
    this.studentanswer = studentanswer;
    return this;
  }

   /**
   * The student answer.
   * @return studentanswer
  **/
  @javax.annotation.Nonnull
  public String getStudentanswer() {
    return studentanswer;
  }

  public void setStudentanswer(String studentanswer) {
    this.studentanswer = studentanswer;
  }


  public ModLessonProcessPage200Response userresponse(String userresponse) {
    this.userresponse = userresponse;
    return this;
  }

   /**
   * The user response.
   * @return userresponse
  **/
  @javax.annotation.Nonnull
  public String getUserresponse() {
    return userresponse;
  }

  public void setUserresponse(String userresponse) {
    this.userresponse = userresponse;
  }


  public ModLessonProcessPage200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModLessonProcessPage200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ModLessonProcessPage200Response modLessonProcessPage200Response = (ModLessonProcessPage200Response) o;
    return Objects.equals(this.attemptsremaining, modLessonProcessPage200Response.attemptsremaining) &&
        Objects.equals(this.correctanswer, modLessonProcessPage200Response.correctanswer) &&
        Objects.equals(this.displaymenu, modLessonProcessPage200Response.displaymenu) &&
        Objects.equals(this.feedback, modLessonProcessPage200Response.feedback) &&
        Objects.equals(this.inmediatejump, modLessonProcessPage200Response.inmediatejump) &&
        Objects.equals(this.isessayquestion, modLessonProcessPage200Response.isessayquestion) &&
        Objects.equals(this.maxattemptsreached, modLessonProcessPage200Response.maxattemptsreached) &&
        Objects.equals(this.messages, modLessonProcessPage200Response.messages) &&
        Objects.equals(this.newpageid, modLessonProcessPage200Response.newpageid) &&
        Objects.equals(this.noanswer, modLessonProcessPage200Response.noanswer) &&
        Objects.equals(this.nodefaultresponse, modLessonProcessPage200Response.nodefaultresponse) &&
        Objects.equals(this.ongoingscore, modLessonProcessPage200Response.ongoingscore) &&
        Objects.equals(this.progress, modLessonProcessPage200Response.progress) &&
        Objects.equals(this.response, modLessonProcessPage200Response.response) &&
        Objects.equals(this.reviewmode, modLessonProcessPage200Response.reviewmode) &&
        Objects.equals(this.studentanswer, modLessonProcessPage200Response.studentanswer) &&
        Objects.equals(this.userresponse, modLessonProcessPage200Response.userresponse) &&
        Objects.equals(this.warnings, modLessonProcessPage200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptsremaining, correctanswer, displaymenu, feedback, inmediatejump, isessayquestion, maxattemptsreached, messages, newpageid, noanswer, nodefaultresponse, ongoingscore, progress, response, reviewmode, studentanswer, userresponse, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLessonProcessPage200Response {\n");
    sb.append("    attemptsremaining: ").append(toIndentedString(attemptsremaining)).append("\n");
    sb.append("    correctanswer: ").append(toIndentedString(correctanswer)).append("\n");
    sb.append("    displaymenu: ").append(toIndentedString(displaymenu)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    inmediatejump: ").append(toIndentedString(inmediatejump)).append("\n");
    sb.append("    isessayquestion: ").append(toIndentedString(isessayquestion)).append("\n");
    sb.append("    maxattemptsreached: ").append(toIndentedString(maxattemptsreached)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    newpageid: ").append(toIndentedString(newpageid)).append("\n");
    sb.append("    noanswer: ").append(toIndentedString(noanswer)).append("\n");
    sb.append("    nodefaultresponse: ").append(toIndentedString(nodefaultresponse)).append("\n");
    sb.append("    ongoingscore: ").append(toIndentedString(ongoingscore)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    reviewmode: ").append(toIndentedString(reviewmode)).append("\n");
    sb.append("    studentanswer: ").append(toIndentedString(studentanswer)).append("\n");
    sb.append("    userresponse: ").append(toIndentedString(userresponse)).append("\n");
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
    openapiFields.add("attemptsremaining");
    openapiFields.add("correctanswer");
    openapiFields.add("displaymenu");
    openapiFields.add("feedback");
    openapiFields.add("inmediatejump");
    openapiFields.add("isessayquestion");
    openapiFields.add("maxattemptsreached");
    openapiFields.add("messages");
    openapiFields.add("newpageid");
    openapiFields.add("noanswer");
    openapiFields.add("nodefaultresponse");
    openapiFields.add("ongoingscore");
    openapiFields.add("progress");
    openapiFields.add("response");
    openapiFields.add("reviewmode");
    openapiFields.add("studentanswer");
    openapiFields.add("userresponse");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attemptsremaining");
    openapiRequiredFields.add("correctanswer");
    openapiRequiredFields.add("displaymenu");
    openapiRequiredFields.add("feedback");
    openapiRequiredFields.add("inmediatejump");
    openapiRequiredFields.add("isessayquestion");
    openapiRequiredFields.add("maxattemptsreached");
    openapiRequiredFields.add("messages");
    openapiRequiredFields.add("newpageid");
    openapiRequiredFields.add("noanswer");
    openapiRequiredFields.add("nodefaultresponse");
    openapiRequiredFields.add("ongoingscore");
    openapiRequiredFields.add("progress");
    openapiRequiredFields.add("response");
    openapiRequiredFields.add("reviewmode");
    openapiRequiredFields.add("studentanswer");
    openapiRequiredFields.add("userresponse");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLessonProcessPage200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLessonProcessPage200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLessonProcessPage200Response is not found in the empty JSON string", ModLessonProcessPage200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLessonProcessPage200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLessonProcessPage200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLessonProcessPage200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("feedback").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedback").toString()));
      }
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
      if (!jsonObj.get("response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
      if (!jsonObj.get("studentanswer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `studentanswer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("studentanswer").toString()));
      }
      if (!jsonObj.get("userresponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userresponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userresponse").toString()));
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
       if (!ModLessonProcessPage200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLessonProcessPage200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLessonProcessPage200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLessonProcessPage200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLessonProcessPage200Response>() {
           @Override
           public void write(JsonWriter out, ModLessonProcessPage200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLessonProcessPage200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLessonProcessPage200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLessonProcessPage200Response
  * @throws IOException if the JSON string is invalid with respect to ModLessonProcessPage200Response
  */
  public static ModLessonProcessPage200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLessonProcessPage200Response.class);
  }

 /**
  * Convert an instance of ModLessonProcessPage200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * ModFeedbackGetLastCompleted200ResponseCompleted
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModFeedbackGetLastCompleted200ResponseCompleted {
  public static final String SERIALIZED_NAME_ANONYMOUS_RESPONSE = "anonymous_response";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS_RESPONSE)
  private Integer anonymousResponse;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private Integer feedback;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_RANDOM_RESPONSE = "random_response";
  @SerializedName(SERIALIZED_NAME_RANDOM_RESPONSE)
  private Integer randomResponse;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public ModFeedbackGetLastCompleted200ResponseCompleted() {
  }

  public ModFeedbackGetLastCompleted200ResponseCompleted anonymousResponse(Integer anonymousResponse) {
    this.anonymousResponse = anonymousResponse;
    return this;
  }

   /**
   * Whether is an anonymous response.
   * @return anonymousResponse
  **/
  @javax.annotation.Nonnull
  public Integer getAnonymousResponse() {
    return anonymousResponse;
  }

  public void setAnonymousResponse(Integer anonymousResponse) {
    this.anonymousResponse = anonymousResponse;
  }


  public ModFeedbackGetLastCompleted200ResponseCompleted courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * The course id where the feedback was completed.
   * @return courseid
  **/
  @javax.annotation.Nonnull
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public ModFeedbackGetLastCompleted200ResponseCompleted feedback(Integer feedback) {
    this.feedback = feedback;
    return this;
  }

   /**
   * The feedback instance id this records belongs to.
   * @return feedback
  **/
  @javax.annotation.Nonnull
  public Integer getFeedback() {
    return feedback;
  }

  public void setFeedback(Integer feedback) {
    this.feedback = feedback;
  }


  public ModFeedbackGetLastCompleted200ResponseCompleted id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The record id.
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModFeedbackGetLastCompleted200ResponseCompleted randomResponse(Integer randomResponse) {
    this.randomResponse = randomResponse;
    return this;
  }

   /**
   * The response number (used when shuffling anonymous responses).
   * @return randomResponse
  **/
  @javax.annotation.Nonnull
  public Integer getRandomResponse() {
    return randomResponse;
  }

  public void setRandomResponse(Integer randomResponse) {
    this.randomResponse = randomResponse;
  }


  public ModFeedbackGetLastCompleted200ResponseCompleted timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * The last time the feedback was completed.
   * @return timemodified
  **/
  @javax.annotation.Nonnull
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModFeedbackGetLastCompleted200ResponseCompleted userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The user who completed the feedback (0 for anonymous).
   * @return userid
  **/
  @javax.annotation.Nonnull
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
    ModFeedbackGetLastCompleted200ResponseCompleted modFeedbackGetLastCompleted200ResponseCompleted = (ModFeedbackGetLastCompleted200ResponseCompleted) o;
    return Objects.equals(this.anonymousResponse, modFeedbackGetLastCompleted200ResponseCompleted.anonymousResponse) &&
        Objects.equals(this.courseid, modFeedbackGetLastCompleted200ResponseCompleted.courseid) &&
        Objects.equals(this.feedback, modFeedbackGetLastCompleted200ResponseCompleted.feedback) &&
        Objects.equals(this.id, modFeedbackGetLastCompleted200ResponseCompleted.id) &&
        Objects.equals(this.randomResponse, modFeedbackGetLastCompleted200ResponseCompleted.randomResponse) &&
        Objects.equals(this.timemodified, modFeedbackGetLastCompleted200ResponseCompleted.timemodified) &&
        Objects.equals(this.userid, modFeedbackGetLastCompleted200ResponseCompleted.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymousResponse, courseid, feedback, id, randomResponse, timemodified, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModFeedbackGetLastCompleted200ResponseCompleted {\n");
    sb.append("    anonymousResponse: ").append(toIndentedString(anonymousResponse)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    randomResponse: ").append(toIndentedString(randomResponse)).append("\n");
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
    openapiFields.add("anonymous_response");
    openapiFields.add("courseid");
    openapiFields.add("feedback");
    openapiFields.add("id");
    openapiFields.add("random_response");
    openapiFields.add("timemodified");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("anonymous_response");
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("feedback");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("random_response");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModFeedbackGetLastCompleted200ResponseCompleted
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModFeedbackGetLastCompleted200ResponseCompleted.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModFeedbackGetLastCompleted200ResponseCompleted is not found in the empty JSON string", ModFeedbackGetLastCompleted200ResponseCompleted.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModFeedbackGetLastCompleted200ResponseCompleted.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModFeedbackGetLastCompleted200ResponseCompleted` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModFeedbackGetLastCompleted200ResponseCompleted.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModFeedbackGetLastCompleted200ResponseCompleted.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModFeedbackGetLastCompleted200ResponseCompleted' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModFeedbackGetLastCompleted200ResponseCompleted> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModFeedbackGetLastCompleted200ResponseCompleted.class));

       return (TypeAdapter<T>) new TypeAdapter<ModFeedbackGetLastCompleted200ResponseCompleted>() {
           @Override
           public void write(JsonWriter out, ModFeedbackGetLastCompleted200ResponseCompleted value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModFeedbackGetLastCompleted200ResponseCompleted read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModFeedbackGetLastCompleted200ResponseCompleted given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModFeedbackGetLastCompleted200ResponseCompleted
  * @throws IOException if the JSON string is invalid with respect to ModFeedbackGetLastCompleted200ResponseCompleted
  */
  public static ModFeedbackGetLastCompleted200ResponseCompleted fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModFeedbackGetLastCompleted200ResponseCompleted.class);
  }

 /**
  * Convert an instance of ModFeedbackGetLastCompleted200ResponseCompleted to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

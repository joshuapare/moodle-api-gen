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
 * ModFeedbackGetNonRespondents200ResponseUsersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModFeedbackGetNonRespondents200ResponseUsersInner {
  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname;

  public static final String SERIALIZED_NAME_STARTED = "started";
  @SerializedName(SERIALIZED_NAME_STARTED)
  private Boolean started = null;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public ModFeedbackGetNonRespondents200ResponseUsersInner() {
  }

  public ModFeedbackGetNonRespondents200ResponseUsersInner courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Course id
   * @return courseid
  **/
  @javax.annotation.Nullable
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public ModFeedbackGetNonRespondents200ResponseUsersInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * User full name
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public ModFeedbackGetNonRespondents200ResponseUsersInner started(Boolean started) {
    this.started = started;
    return this;
  }

   /**
   * If the user has started the attempt
   * @return started
  **/
  @javax.annotation.Nullable
  public Boolean getStarted() {
    return started;
  }

  public void setStarted(Boolean started) {
    this.started = started;
  }


  public ModFeedbackGetNonRespondents200ResponseUsersInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The user id
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
    ModFeedbackGetNonRespondents200ResponseUsersInner modFeedbackGetNonRespondents200ResponseUsersInner = (ModFeedbackGetNonRespondents200ResponseUsersInner) o;
    return Objects.equals(this.courseid, modFeedbackGetNonRespondents200ResponseUsersInner.courseid) &&
        Objects.equals(this.fullname, modFeedbackGetNonRespondents200ResponseUsersInner.fullname) &&
        Objects.equals(this.started, modFeedbackGetNonRespondents200ResponseUsersInner.started) &&
        Objects.equals(this.userid, modFeedbackGetNonRespondents200ResponseUsersInner.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseid, fullname, started, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModFeedbackGetNonRespondents200ResponseUsersInner {\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
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
    openapiFields.add("courseid");
    openapiFields.add("fullname");
    openapiFields.add("started");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModFeedbackGetNonRespondents200ResponseUsersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModFeedbackGetNonRespondents200ResponseUsersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModFeedbackGetNonRespondents200ResponseUsersInner is not found in the empty JSON string", ModFeedbackGetNonRespondents200ResponseUsersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModFeedbackGetNonRespondents200ResponseUsersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModFeedbackGetNonRespondents200ResponseUsersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModFeedbackGetNonRespondents200ResponseUsersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModFeedbackGetNonRespondents200ResponseUsersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModFeedbackGetNonRespondents200ResponseUsersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModFeedbackGetNonRespondents200ResponseUsersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModFeedbackGetNonRespondents200ResponseUsersInner>() {
           @Override
           public void write(JsonWriter out, ModFeedbackGetNonRespondents200ResponseUsersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModFeedbackGetNonRespondents200ResponseUsersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModFeedbackGetNonRespondents200ResponseUsersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModFeedbackGetNonRespondents200ResponseUsersInner
  * @throws IOException if the JSON string is invalid with respect to ModFeedbackGetNonRespondents200ResponseUsersInner
  */
  public static ModFeedbackGetNonRespondents200ResponseUsersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModFeedbackGetNonRespondents200ResponseUsersInner.class);
  }

 /**
  * Convert an instance of ModFeedbackGetNonRespondents200ResponseUsersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

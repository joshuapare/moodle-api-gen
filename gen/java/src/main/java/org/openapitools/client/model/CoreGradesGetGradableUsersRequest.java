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
 * CoreGradesGetGradableUsersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradesGetGradableUsersRequest {
  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid = 0;

  public static final String SERIALIZED_NAME_ONLYACTIVE = "onlyactive";
  @SerializedName(SERIALIZED_NAME_ONLYACTIVE)
  private Boolean onlyactive = false;

  public CoreGradesGetGradableUsersRequest() {
  }

  public CoreGradesGetGradableUsersRequest courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Course Id
   * @return courseid
  **/
  @javax.annotation.Nonnull
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public CoreGradesGetGradableUsersRequest groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * Group Id
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public CoreGradesGetGradableUsersRequest onlyactive(Boolean onlyactive) {
    this.onlyactive = onlyactive;
    return this;
  }

   /**
   * Only active enrolment
   * @return onlyactive
  **/
  @javax.annotation.Nullable
  public Boolean getOnlyactive() {
    return onlyactive;
  }

  public void setOnlyactive(Boolean onlyactive) {
    this.onlyactive = onlyactive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradesGetGradableUsersRequest coreGradesGetGradableUsersRequest = (CoreGradesGetGradableUsersRequest) o;
    return Objects.equals(this.courseid, coreGradesGetGradableUsersRequest.courseid) &&
        Objects.equals(this.groupid, coreGradesGetGradableUsersRequest.groupid) &&
        Objects.equals(this.onlyactive, coreGradesGetGradableUsersRequest.onlyactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseid, groupid, onlyactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradesGetGradableUsersRequest {\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    onlyactive: ").append(toIndentedString(onlyactive)).append("\n");
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
    openapiFields.add("groupid");
    openapiFields.add("onlyactive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("courseid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradesGetGradableUsersRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradesGetGradableUsersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradesGetGradableUsersRequest is not found in the empty JSON string", CoreGradesGetGradableUsersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradesGetGradableUsersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradesGetGradableUsersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGradesGetGradableUsersRequest.openapiRequiredFields) {
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
       if (!CoreGradesGetGradableUsersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradesGetGradableUsersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradesGetGradableUsersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradesGetGradableUsersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradesGetGradableUsersRequest>() {
           @Override
           public void write(JsonWriter out, CoreGradesGetGradableUsersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradesGetGradableUsersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradesGetGradableUsersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradesGetGradableUsersRequest
  * @throws IOException if the JSON string is invalid with respect to CoreGradesGetGradableUsersRequest
  */
  public static CoreGradesGetGradableUsersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradesGetGradableUsersRequest.class);
  }

 /**
  * Convert an instance of CoreGradesGetGradableUsersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


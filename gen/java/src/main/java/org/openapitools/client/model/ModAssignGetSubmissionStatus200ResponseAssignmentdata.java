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
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments;

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
 * ModAssignGetSubmissionStatus200ResponseAssignmentdata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200ResponseAssignmentdata {
  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private String activity = "null";

  public static final String SERIALIZED_NAME_ACTIVITYFORMAT = "activityformat";
  @SerializedName(SERIALIZED_NAME_ACTIVITYFORMAT)
  private Integer activityformat;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments attachments;

  public ModAssignGetSubmissionStatus200ResponseAssignmentdata() {
  }

  public ModAssignGetSubmissionStatus200ResponseAssignmentdata activity(String activity) {
    this.activity = activity;
    return this;
  }

   /**
   * Text of activity
   * @return activity
  **/
  @javax.annotation.Nullable
  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }


  public ModAssignGetSubmissionStatus200ResponseAssignmentdata activityformat(Integer activityformat) {
    this.activityformat = activityformat;
    return this;
  }

   /**
   * activity format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return activityformat
  **/
  @javax.annotation.Nullable
  public Integer getActivityformat() {
    return activityformat;
  }

  public void setActivityformat(Integer activityformat) {
    this.activityformat = activityformat;
  }


  public ModAssignGetSubmissionStatus200ResponseAssignmentdata attachments(ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments attachments) {
    this.attachments = attachments;
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  public ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments getAttachments() {
    return attachments;
  }

  public void setAttachments(ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments attachments) {
    this.attachments = attachments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetSubmissionStatus200ResponseAssignmentdata modAssignGetSubmissionStatus200ResponseAssignmentdata = (ModAssignGetSubmissionStatus200ResponseAssignmentdata) o;
    return Objects.equals(this.activity, modAssignGetSubmissionStatus200ResponseAssignmentdata.activity) &&
        Objects.equals(this.activityformat, modAssignGetSubmissionStatus200ResponseAssignmentdata.activityformat) &&
        Objects.equals(this.attachments, modAssignGetSubmissionStatus200ResponseAssignmentdata.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, activityformat, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200ResponseAssignmentdata {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    activityformat: ").append(toIndentedString(activityformat)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("activity");
    openapiFields.add("activityformat");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200ResponseAssignmentdata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200ResponseAssignmentdata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200ResponseAssignmentdata is not found in the empty JSON string", ModAssignGetSubmissionStatus200ResponseAssignmentdata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200ResponseAssignmentdata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200ResponseAssignmentdata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("activity") != null && !jsonObj.get("activity").isJsonNull()) && !jsonObj.get("activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity").toString()));
      }
      // validate the optional field `attachments`
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments.validateJsonElement(jsonObj.get("attachments"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200ResponseAssignmentdata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200ResponseAssignmentdata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200ResponseAssignmentdata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200ResponseAssignmentdata.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200ResponseAssignmentdata>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200ResponseAssignmentdata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200ResponseAssignmentdata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200ResponseAssignmentdata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200ResponseAssignmentdata
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200ResponseAssignmentdata
  */
  public static ModAssignGetSubmissionStatus200ResponseAssignmentdata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200ResponseAssignmentdata.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200ResponseAssignmentdata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


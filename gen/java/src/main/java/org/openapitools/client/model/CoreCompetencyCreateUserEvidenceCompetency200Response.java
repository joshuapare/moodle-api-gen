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
 * CoreCompetencyCreateUserEvidenceCompetency200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyCreateUserEvidenceCompetency200Response {
  public static final String SERIALIZED_NAME_COMPETENCYID = "competencyid";
  @SerializedName(SERIALIZED_NAME_COMPETENCYID)
  private Integer competencyid = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_USEREVIDENCEID = "userevidenceid";
  @SerializedName(SERIALIZED_NAME_USEREVIDENCEID)
  private Integer userevidenceid = null;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified = 0;

  public CoreCompetencyCreateUserEvidenceCompetency200Response() {
  }

  public CoreCompetencyCreateUserEvidenceCompetency200Response competencyid(Integer competencyid) {
    this.competencyid = competencyid;
    return this;
  }

   /**
   * competencyid
   * @return competencyid
  **/
  @javax.annotation.Nonnull
  public Integer getCompetencyid() {
    return competencyid;
  }

  public void setCompetencyid(Integer competencyid) {
    this.competencyid = competencyid;
  }


  public CoreCompetencyCreateUserEvidenceCompetency200Response id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreCompetencyCreateUserEvidenceCompetency200Response timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * timecreated
   * @return timecreated
  **/
  @javax.annotation.Nonnull
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public CoreCompetencyCreateUserEvidenceCompetency200Response timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * timemodified
   * @return timemodified
  **/
  @javax.annotation.Nonnull
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public CoreCompetencyCreateUserEvidenceCompetency200Response userevidenceid(Integer userevidenceid) {
    this.userevidenceid = userevidenceid;
    return this;
  }

   /**
   * userevidenceid
   * @return userevidenceid
  **/
  @javax.annotation.Nonnull
  public Integer getUserevidenceid() {
    return userevidenceid;
  }

  public void setUserevidenceid(Integer userevidenceid) {
    this.userevidenceid = userevidenceid;
  }


  public CoreCompetencyCreateUserEvidenceCompetency200Response usermodified(Integer usermodified) {
    this.usermodified = usermodified;
    return this;
  }

   /**
   * usermodified
   * @return usermodified
  **/
  @javax.annotation.Nonnull
  public Integer getUsermodified() {
    return usermodified;
  }

  public void setUsermodified(Integer usermodified) {
    this.usermodified = usermodified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompetencyCreateUserEvidenceCompetency200Response coreCompetencyCreateUserEvidenceCompetency200Response = (CoreCompetencyCreateUserEvidenceCompetency200Response) o;
    return Objects.equals(this.competencyid, coreCompetencyCreateUserEvidenceCompetency200Response.competencyid) &&
        Objects.equals(this.id, coreCompetencyCreateUserEvidenceCompetency200Response.id) &&
        Objects.equals(this.timecreated, coreCompetencyCreateUserEvidenceCompetency200Response.timecreated) &&
        Objects.equals(this.timemodified, coreCompetencyCreateUserEvidenceCompetency200Response.timemodified) &&
        Objects.equals(this.userevidenceid, coreCompetencyCreateUserEvidenceCompetency200Response.userevidenceid) &&
        Objects.equals(this.usermodified, coreCompetencyCreateUserEvidenceCompetency200Response.usermodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competencyid, id, timecreated, timemodified, userevidenceid, usermodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyCreateUserEvidenceCompetency200Response {\n");
    sb.append("    competencyid: ").append(toIndentedString(competencyid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    userevidenceid: ").append(toIndentedString(userevidenceid)).append("\n");
    sb.append("    usermodified: ").append(toIndentedString(usermodified)).append("\n");
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
    openapiFields.add("competencyid");
    openapiFields.add("id");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("userevidenceid");
    openapiFields.add("usermodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("competencyid");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("userevidenceid");
    openapiRequiredFields.add("usermodified");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyCreateUserEvidenceCompetency200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyCreateUserEvidenceCompetency200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyCreateUserEvidenceCompetency200Response is not found in the empty JSON string", CoreCompetencyCreateUserEvidenceCompetency200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyCreateUserEvidenceCompetency200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyCreateUserEvidenceCompetency200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyCreateUserEvidenceCompetency200Response.openapiRequiredFields) {
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
       if (!CoreCompetencyCreateUserEvidenceCompetency200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyCreateUserEvidenceCompetency200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyCreateUserEvidenceCompetency200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyCreateUserEvidenceCompetency200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyCreateUserEvidenceCompetency200Response>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyCreateUserEvidenceCompetency200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyCreateUserEvidenceCompetency200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyCreateUserEvidenceCompetency200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyCreateUserEvidenceCompetency200Response
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyCreateUserEvidenceCompetency200Response
  */
  public static CoreCompetencyCreateUserEvidenceCompetency200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyCreateUserEvidenceCompetency200Response.class);
  }

 /**
  * Convert an instance of CoreCompetencyCreateUserEvidenceCompetency200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


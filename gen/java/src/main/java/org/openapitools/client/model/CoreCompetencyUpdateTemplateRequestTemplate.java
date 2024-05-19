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
 * CoreCompetencyUpdateTemplateRequestTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyUpdateTemplateRequestTemplate {
  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid;

  public static final String SERIALIZED_NAME_CONTEXTLEVEL = "contextlevel";
  @SerializedName(SERIALIZED_NAME_CONTEXTLEVEL)
  private String contextlevel;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = 1;

  public static final String SERIALIZED_NAME_DUEDATE = "duedate";
  @SerializedName(SERIALIZED_NAME_DUEDATE)
  private Integer duedate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INSTANCEID = "instanceid";
  @SerializedName(SERIALIZED_NAME_INSTANCEID)
  private Integer instanceid;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public CoreCompetencyUpdateTemplateRequestTemplate() {
  }

  public CoreCompetencyUpdateTemplateRequestTemplate contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * The context id
   * @return contextid
  **/
  @javax.annotation.Nullable
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate contextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
    return this;
  }

   /**
   * The context level
   * @return contextlevel
  **/
  @javax.annotation.Nullable
  public String getContextlevel() {
    return contextlevel;
  }

  public void setContextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate descriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
    return this;
  }

   /**
   * description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return descriptionformat
  **/
  @javax.annotation.Nullable
  public Integer getDescriptionformat() {
    return descriptionformat;
  }

  public void setDescriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate duedate(Integer duedate) {
    this.duedate = duedate;
    return this;
  }

   /**
   * duedate
   * @return duedate
  **/
  @javax.annotation.Nullable
  public Integer getDuedate() {
    return duedate;
  }

  public void setDuedate(Integer duedate) {
    this.duedate = duedate;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate id(Integer id) {
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


  public CoreCompetencyUpdateTemplateRequestTemplate instanceid(Integer instanceid) {
    this.instanceid = instanceid;
    return this;
  }

   /**
   * The Instance id
   * @return instanceid
  **/
  @javax.annotation.Nullable
  public Integer getInstanceid() {
    return instanceid;
  }

  public void setInstanceid(Integer instanceid) {
    this.instanceid = instanceid;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * shortname
   * @return shortname
  **/
  @javax.annotation.Nullable
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * timecreated
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * timemodified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate usermodified(Integer usermodified) {
    this.usermodified = usermodified;
    return this;
  }

   /**
   * usermodified
   * @return usermodified
  **/
  @javax.annotation.Nullable
  public Integer getUsermodified() {
    return usermodified;
  }

  public void setUsermodified(Integer usermodified) {
    this.usermodified = usermodified;
  }


  public CoreCompetencyUpdateTemplateRequestTemplate visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * visible
   * @return visible
  **/
  @javax.annotation.Nullable
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompetencyUpdateTemplateRequestTemplate coreCompetencyUpdateTemplateRequestTemplate = (CoreCompetencyUpdateTemplateRequestTemplate) o;
    return Objects.equals(this.contextid, coreCompetencyUpdateTemplateRequestTemplate.contextid) &&
        Objects.equals(this.contextlevel, coreCompetencyUpdateTemplateRequestTemplate.contextlevel) &&
        Objects.equals(this.description, coreCompetencyUpdateTemplateRequestTemplate.description) &&
        Objects.equals(this.descriptionformat, coreCompetencyUpdateTemplateRequestTemplate.descriptionformat) &&
        Objects.equals(this.duedate, coreCompetencyUpdateTemplateRequestTemplate.duedate) &&
        Objects.equals(this.id, coreCompetencyUpdateTemplateRequestTemplate.id) &&
        Objects.equals(this.instanceid, coreCompetencyUpdateTemplateRequestTemplate.instanceid) &&
        Objects.equals(this.shortname, coreCompetencyUpdateTemplateRequestTemplate.shortname) &&
        Objects.equals(this.timecreated, coreCompetencyUpdateTemplateRequestTemplate.timecreated) &&
        Objects.equals(this.timemodified, coreCompetencyUpdateTemplateRequestTemplate.timemodified) &&
        Objects.equals(this.usermodified, coreCompetencyUpdateTemplateRequestTemplate.usermodified) &&
        Objects.equals(this.visible, coreCompetencyUpdateTemplateRequestTemplate.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextid, contextlevel, description, descriptionformat, duedate, id, instanceid, shortname, timecreated, timemodified, usermodified, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyUpdateTemplateRequestTemplate {\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    contextlevel: ").append(toIndentedString(contextlevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    usermodified: ").append(toIndentedString(usermodified)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
    openapiFields.add("contextid");
    openapiFields.add("contextlevel");
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("duedate");
    openapiFields.add("id");
    openapiFields.add("instanceid");
    openapiFields.add("shortname");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("usermodified");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyUpdateTemplateRequestTemplate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyUpdateTemplateRequestTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyUpdateTemplateRequestTemplate is not found in the empty JSON string", CoreCompetencyUpdateTemplateRequestTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyUpdateTemplateRequestTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyUpdateTemplateRequestTemplate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyUpdateTemplateRequestTemplate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contextlevel") != null && !jsonObj.get("contextlevel").isJsonNull()) && !jsonObj.get("contextlevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextlevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextlevel").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyUpdateTemplateRequestTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyUpdateTemplateRequestTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyUpdateTemplateRequestTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyUpdateTemplateRequestTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyUpdateTemplateRequestTemplate>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyUpdateTemplateRequestTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyUpdateTemplateRequestTemplate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyUpdateTemplateRequestTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyUpdateTemplateRequestTemplate
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyUpdateTemplateRequestTemplate
  */
  public static CoreCompetencyUpdateTemplateRequestTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyUpdateTemplateRequestTemplate.class);
  }

 /**
  * Convert an instance of CoreCompetencyUpdateTemplateRequestTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


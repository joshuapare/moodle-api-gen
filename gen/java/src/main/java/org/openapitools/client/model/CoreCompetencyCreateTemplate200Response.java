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
 * CoreCompetencyCreateTemplate200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyCreateTemplate200Response {
  public static final String SERIALIZED_NAME_CANMANAGE = "canmanage";
  @SerializedName(SERIALIZED_NAME_CANMANAGE)
  private Boolean canmanage;

  public static final String SERIALIZED_NAME_CANREAD = "canread";
  @SerializedName(SERIALIZED_NAME_CANREAD)
  private Boolean canread;

  public static final String SERIALIZED_NAME_COHORTSCOUNT = "cohortscount";
  @SerializedName(SERIALIZED_NAME_COHORTSCOUNT)
  private Integer cohortscount;

  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid;

  public static final String SERIALIZED_NAME_CONTEXTNAME = "contextname";
  @SerializedName(SERIALIZED_NAME_CONTEXTNAME)
  private String contextname;

  public static final String SERIALIZED_NAME_CONTEXTNAMENOPREFIX = "contextnamenoprefix";
  @SerializedName(SERIALIZED_NAME_CONTEXTNAMENOPREFIX)
  private String contextnamenoprefix;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = 1;

  public static final String SERIALIZED_NAME_DUEDATE = "duedate";
  @SerializedName(SERIALIZED_NAME_DUEDATE)
  private Integer duedate = 0;

  public static final String SERIALIZED_NAME_DUEDATEFORMATTED = "duedateformatted";
  @SerializedName(SERIALIZED_NAME_DUEDATEFORMATTED)
  private String duedateformatted;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_PLANSCOUNT = "planscount";
  @SerializedName(SERIALIZED_NAME_PLANSCOUNT)
  private Integer planscount;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified = 0;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible = 1;

  public CoreCompetencyCreateTemplate200Response() {
  }

  public CoreCompetencyCreateTemplate200Response canmanage(Boolean canmanage) {
    this.canmanage = canmanage;
    return this;
  }

   /**
   * canmanage
   * @return canmanage
  **/
  @javax.annotation.Nonnull
  public Boolean getCanmanage() {
    return canmanage;
  }

  public void setCanmanage(Boolean canmanage) {
    this.canmanage = canmanage;
  }


  public CoreCompetencyCreateTemplate200Response canread(Boolean canread) {
    this.canread = canread;
    return this;
  }

   /**
   * canread
   * @return canread
  **/
  @javax.annotation.Nonnull
  public Boolean getCanread() {
    return canread;
  }

  public void setCanread(Boolean canread) {
    this.canread = canread;
  }


  public CoreCompetencyCreateTemplate200Response cohortscount(Integer cohortscount) {
    this.cohortscount = cohortscount;
    return this;
  }

   /**
   * cohortscount
   * @return cohortscount
  **/
  @javax.annotation.Nonnull
  public Integer getCohortscount() {
    return cohortscount;
  }

  public void setCohortscount(Integer cohortscount) {
    this.cohortscount = cohortscount;
  }


  public CoreCompetencyCreateTemplate200Response contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * contextid
   * @return contextid
  **/
  @javax.annotation.Nonnull
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public CoreCompetencyCreateTemplate200Response contextname(String contextname) {
    this.contextname = contextname;
    return this;
  }

   /**
   * contextname
   * @return contextname
  **/
  @javax.annotation.Nonnull
  public String getContextname() {
    return contextname;
  }

  public void setContextname(String contextname) {
    this.contextname = contextname;
  }


  public CoreCompetencyCreateTemplate200Response contextnamenoprefix(String contextnamenoprefix) {
    this.contextnamenoprefix = contextnamenoprefix;
    return this;
  }

   /**
   * contextnamenoprefix
   * @return contextnamenoprefix
  **/
  @javax.annotation.Nonnull
  public String getContextnamenoprefix() {
    return contextnamenoprefix;
  }

  public void setContextnamenoprefix(String contextnamenoprefix) {
    this.contextnamenoprefix = contextnamenoprefix;
  }


  public CoreCompetencyCreateTemplate200Response description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CoreCompetencyCreateTemplate200Response descriptionformat(Integer descriptionformat) {
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


  public CoreCompetencyCreateTemplate200Response duedate(Integer duedate) {
    this.duedate = duedate;
    return this;
  }

   /**
   * duedate
   * @return duedate
  **/
  @javax.annotation.Nonnull
  public Integer getDuedate() {
    return duedate;
  }

  public void setDuedate(Integer duedate) {
    this.duedate = duedate;
  }


  public CoreCompetencyCreateTemplate200Response duedateformatted(String duedateformatted) {
    this.duedateformatted = duedateformatted;
    return this;
  }

   /**
   * duedateformatted
   * @return duedateformatted
  **/
  @javax.annotation.Nonnull
  public String getDuedateformatted() {
    return duedateformatted;
  }

  public void setDuedateformatted(String duedateformatted) {
    this.duedateformatted = duedateformatted;
  }


  public CoreCompetencyCreateTemplate200Response id(Integer id) {
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


  public CoreCompetencyCreateTemplate200Response planscount(Integer planscount) {
    this.planscount = planscount;
    return this;
  }

   /**
   * planscount
   * @return planscount
  **/
  @javax.annotation.Nonnull
  public Integer getPlanscount() {
    return planscount;
  }

  public void setPlanscount(Integer planscount) {
    this.planscount = planscount;
  }


  public CoreCompetencyCreateTemplate200Response shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * shortname
   * @return shortname
  **/
  @javax.annotation.Nonnull
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public CoreCompetencyCreateTemplate200Response timecreated(Integer timecreated) {
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


  public CoreCompetencyCreateTemplate200Response timemodified(Integer timemodified) {
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


  public CoreCompetencyCreateTemplate200Response usermodified(Integer usermodified) {
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


  public CoreCompetencyCreateTemplate200Response visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * visible
   * @return visible
  **/
  @javax.annotation.Nonnull
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
    CoreCompetencyCreateTemplate200Response coreCompetencyCreateTemplate200Response = (CoreCompetencyCreateTemplate200Response) o;
    return Objects.equals(this.canmanage, coreCompetencyCreateTemplate200Response.canmanage) &&
        Objects.equals(this.canread, coreCompetencyCreateTemplate200Response.canread) &&
        Objects.equals(this.cohortscount, coreCompetencyCreateTemplate200Response.cohortscount) &&
        Objects.equals(this.contextid, coreCompetencyCreateTemplate200Response.contextid) &&
        Objects.equals(this.contextname, coreCompetencyCreateTemplate200Response.contextname) &&
        Objects.equals(this.contextnamenoprefix, coreCompetencyCreateTemplate200Response.contextnamenoprefix) &&
        Objects.equals(this.description, coreCompetencyCreateTemplate200Response.description) &&
        Objects.equals(this.descriptionformat, coreCompetencyCreateTemplate200Response.descriptionformat) &&
        Objects.equals(this.duedate, coreCompetencyCreateTemplate200Response.duedate) &&
        Objects.equals(this.duedateformatted, coreCompetencyCreateTemplate200Response.duedateformatted) &&
        Objects.equals(this.id, coreCompetencyCreateTemplate200Response.id) &&
        Objects.equals(this.planscount, coreCompetencyCreateTemplate200Response.planscount) &&
        Objects.equals(this.shortname, coreCompetencyCreateTemplate200Response.shortname) &&
        Objects.equals(this.timecreated, coreCompetencyCreateTemplate200Response.timecreated) &&
        Objects.equals(this.timemodified, coreCompetencyCreateTemplate200Response.timemodified) &&
        Objects.equals(this.usermodified, coreCompetencyCreateTemplate200Response.usermodified) &&
        Objects.equals(this.visible, coreCompetencyCreateTemplate200Response.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canmanage, canread, cohortscount, contextid, contextname, contextnamenoprefix, description, descriptionformat, duedate, duedateformatted, id, planscount, shortname, timecreated, timemodified, usermodified, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyCreateTemplate200Response {\n");
    sb.append("    canmanage: ").append(toIndentedString(canmanage)).append("\n");
    sb.append("    canread: ").append(toIndentedString(canread)).append("\n");
    sb.append("    cohortscount: ").append(toIndentedString(cohortscount)).append("\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    contextname: ").append(toIndentedString(contextname)).append("\n");
    sb.append("    contextnamenoprefix: ").append(toIndentedString(contextnamenoprefix)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    duedateformatted: ").append(toIndentedString(duedateformatted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planscount: ").append(toIndentedString(planscount)).append("\n");
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
    openapiFields.add("canmanage");
    openapiFields.add("canread");
    openapiFields.add("cohortscount");
    openapiFields.add("contextid");
    openapiFields.add("contextname");
    openapiFields.add("contextnamenoprefix");
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("duedate");
    openapiFields.add("duedateformatted");
    openapiFields.add("id");
    openapiFields.add("planscount");
    openapiFields.add("shortname");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("usermodified");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canmanage");
    openapiRequiredFields.add("canread");
    openapiRequiredFields.add("cohortscount");
    openapiRequiredFields.add("contextid");
    openapiRequiredFields.add("contextname");
    openapiRequiredFields.add("contextnamenoprefix");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("duedate");
    openapiRequiredFields.add("duedateformatted");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("planscount");
    openapiRequiredFields.add("shortname");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("usermodified");
    openapiRequiredFields.add("visible");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyCreateTemplate200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyCreateTemplate200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyCreateTemplate200Response is not found in the empty JSON string", CoreCompetencyCreateTemplate200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyCreateTemplate200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyCreateTemplate200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyCreateTemplate200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contextname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextname").toString()));
      }
      if (!jsonObj.get("contextnamenoprefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextnamenoprefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextnamenoprefix").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("duedateformatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duedateformatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duedateformatted").toString()));
      }
      if (!jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyCreateTemplate200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyCreateTemplate200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyCreateTemplate200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyCreateTemplate200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyCreateTemplate200Response>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyCreateTemplate200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyCreateTemplate200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyCreateTemplate200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyCreateTemplate200Response
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyCreateTemplate200Response
  */
  public static CoreCompetencyCreateTemplate200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyCreateTemplate200Response.class);
  }

 /**
  * Convert an instance of CoreCompetencyCreateTemplate200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

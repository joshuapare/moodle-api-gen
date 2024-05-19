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
 * ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner {
  public static final String SERIALIZED_NAME_CANMANAGE = "canmanage";
  @SerializedName(SERIALIZED_NAME_CANMANAGE)
  private Boolean canmanage;

  public static final String SERIALIZED_NAME_COMPETENCIESCOUNT = "competenciescount";
  @SerializedName(SERIALIZED_NAME_COMPETENCIESCOUNT)
  private Integer competenciescount;

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_IDNUMBER = "idnumber";
  @SerializedName(SERIALIZED_NAME_IDNUMBER)
  private String idnumber;

  public static final String SERIALIZED_NAME_SCALECONFIGURATION = "scaleconfiguration";
  @SerializedName(SERIALIZED_NAME_SCALECONFIGURATION)
  private String scaleconfiguration;

  public static final String SERIALIZED_NAME_SCALEID = "scaleid";
  @SerializedName(SERIALIZED_NAME_SCALEID)
  private Integer scaleid;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_TAXONOMIES = "taxonomies";
  @SerializedName(SERIALIZED_NAME_TAXONOMIES)
  private String taxonomies = "";

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

  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner() {
  }

  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner canmanage(Boolean canmanage) {
    this.canmanage = canmanage;
    return this;
  }

   /**
   * canmanage
   * @return canmanage
  **/
  @javax.annotation.Nullable
  public Boolean getCanmanage() {
    return canmanage;
  }

  public void setCanmanage(Boolean canmanage) {
    this.canmanage = canmanage;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner competenciescount(Integer competenciescount) {
    this.competenciescount = competenciescount;
    return this;
  }

   /**
   * competenciescount
   * @return competenciescount
  **/
  @javax.annotation.Nullable
  public Integer getCompetenciescount() {
    return competenciescount;
  }

  public void setCompetenciescount(Integer competenciescount) {
    this.competenciescount = competenciescount;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * contextid
   * @return contextid
  **/
  @javax.annotation.Nullable
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner contextname(String contextname) {
    this.contextname = contextname;
    return this;
  }

   /**
   * contextname
   * @return contextname
  **/
  @javax.annotation.Nullable
  public String getContextname() {
    return contextname;
  }

  public void setContextname(String contextname) {
    this.contextname = contextname;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner contextnamenoprefix(String contextnamenoprefix) {
    this.contextnamenoprefix = contextnamenoprefix;
    return this;
  }

   /**
   * contextnamenoprefix
   * @return contextnamenoprefix
  **/
  @javax.annotation.Nullable
  public String getContextnamenoprefix() {
    return contextnamenoprefix;
  }

  public void setContextnamenoprefix(String contextnamenoprefix) {
    this.contextnamenoprefix = contextnamenoprefix;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner description(String description) {
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


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner descriptionformat(Integer descriptionformat) {
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


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner idnumber(String idnumber) {
    this.idnumber = idnumber;
    return this;
  }

   /**
   * idnumber
   * @return idnumber
  **/
  @javax.annotation.Nullable
  public String getIdnumber() {
    return idnumber;
  }

  public void setIdnumber(String idnumber) {
    this.idnumber = idnumber;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner scaleconfiguration(String scaleconfiguration) {
    this.scaleconfiguration = scaleconfiguration;
    return this;
  }

   /**
   * scaleconfiguration
   * @return scaleconfiguration
  **/
  @javax.annotation.Nullable
  public String getScaleconfiguration() {
    return scaleconfiguration;
  }

  public void setScaleconfiguration(String scaleconfiguration) {
    this.scaleconfiguration = scaleconfiguration;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner scaleid(Integer scaleid) {
    this.scaleid = scaleid;
    return this;
  }

   /**
   * scaleid
   * @return scaleid
  **/
  @javax.annotation.Nullable
  public Integer getScaleid() {
    return scaleid;
  }

  public void setScaleid(Integer scaleid) {
    this.scaleid = scaleid;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner shortname(String shortname) {
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


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner taxonomies(String taxonomies) {
    this.taxonomies = taxonomies;
    return this;
  }

   /**
   * taxonomies
   * @return taxonomies
  **/
  @javax.annotation.Nullable
  public String getTaxonomies() {
    return taxonomies;
  }

  public void setTaxonomies(String taxonomies) {
    this.taxonomies = taxonomies;
  }


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner timecreated(Integer timecreated) {
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


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner timemodified(Integer timemodified) {
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


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner usermodified(Integer usermodified) {
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


  public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner visible(Boolean visible) {
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
    ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner = (ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner) o;
    return Objects.equals(this.canmanage, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.canmanage) &&
        Objects.equals(this.competenciescount, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.competenciescount) &&
        Objects.equals(this.contextid, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.contextid) &&
        Objects.equals(this.contextname, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.contextname) &&
        Objects.equals(this.contextnamenoprefix, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.contextnamenoprefix) &&
        Objects.equals(this.description, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.description) &&
        Objects.equals(this.descriptionformat, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.descriptionformat) &&
        Objects.equals(this.id, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.id) &&
        Objects.equals(this.idnumber, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.idnumber) &&
        Objects.equals(this.scaleconfiguration, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.scaleconfiguration) &&
        Objects.equals(this.scaleid, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.scaleid) &&
        Objects.equals(this.shortname, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.shortname) &&
        Objects.equals(this.taxonomies, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.taxonomies) &&
        Objects.equals(this.timecreated, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.timecreated) &&
        Objects.equals(this.timemodified, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.timemodified) &&
        Objects.equals(this.usermodified, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.usermodified) &&
        Objects.equals(this.visible, toolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canmanage, competenciescount, contextid, contextname, contextnamenoprefix, description, descriptionformat, id, idnumber, scaleconfiguration, scaleid, shortname, taxonomies, timecreated, timemodified, usermodified, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner {\n");
    sb.append("    canmanage: ").append(toIndentedString(canmanage)).append("\n");
    sb.append("    competenciescount: ").append(toIndentedString(competenciescount)).append("\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    contextname: ").append(toIndentedString(contextname)).append("\n");
    sb.append("    contextnamenoprefix: ").append(toIndentedString(contextnamenoprefix)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idnumber: ").append(toIndentedString(idnumber)).append("\n");
    sb.append("    scaleconfiguration: ").append(toIndentedString(scaleconfiguration)).append("\n");
    sb.append("    scaleid: ").append(toIndentedString(scaleid)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    taxonomies: ").append(toIndentedString(taxonomies)).append("\n");
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
    openapiFields.add("competenciescount");
    openapiFields.add("contextid");
    openapiFields.add("contextname");
    openapiFields.add("contextnamenoprefix");
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("id");
    openapiFields.add("idnumber");
    openapiFields.add("scaleconfiguration");
    openapiFields.add("scaleid");
    openapiFields.add("shortname");
    openapiFields.add("taxonomies");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("usermodified");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner is not found in the empty JSON string", ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contextname") != null && !jsonObj.get("contextname").isJsonNull()) && !jsonObj.get("contextname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextname").toString()));
      }
      if ((jsonObj.get("contextnamenoprefix") != null && !jsonObj.get("contextnamenoprefix").isJsonNull()) && !jsonObj.get("contextnamenoprefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextnamenoprefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextnamenoprefix").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("idnumber") != null && !jsonObj.get("idnumber").isJsonNull()) && !jsonObj.get("idnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idnumber").toString()));
      }
      if ((jsonObj.get("scaleconfiguration") != null && !jsonObj.get("scaleconfiguration").isJsonNull()) && !jsonObj.get("scaleconfiguration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scaleconfiguration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scaleconfiguration").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
      if ((jsonObj.get("taxonomies") != null && !jsonObj.get("taxonomies").isJsonNull()) && !jsonObj.get("taxonomies").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxonomies` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxonomies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner
  */
  public static ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.class);
  }

 /**
  * Convert an instance of ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


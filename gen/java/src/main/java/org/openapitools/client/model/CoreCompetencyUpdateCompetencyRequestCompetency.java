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
 * CoreCompetencyUpdateCompetencyRequestCompetency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyUpdateCompetencyRequestCompetency {
  public static final String SERIALIZED_NAME_COMPETENCYFRAMEWORKID = "competencyframeworkid";
  @SerializedName(SERIALIZED_NAME_COMPETENCYFRAMEWORKID)
  private Integer competencyframeworkid = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = 1;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IDNUMBER = "idnumber";
  @SerializedName(SERIALIZED_NAME_IDNUMBER)
  private String idnumber;

  public static final String SERIALIZED_NAME_PARENTID = "parentid";
  @SerializedName(SERIALIZED_NAME_PARENTID)
  private Integer parentid = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = "null";

  public static final String SERIALIZED_NAME_RULECONFIG = "ruleconfig";
  @SerializedName(SERIALIZED_NAME_RULECONFIG)
  private String ruleconfig;

  public static final String SERIALIZED_NAME_RULEOUTCOME = "ruleoutcome";
  @SerializedName(SERIALIZED_NAME_RULEOUTCOME)
  private Integer ruleoutcome = null;

  public static final String SERIALIZED_NAME_RULETYPE = "ruletype";
  @SerializedName(SERIALIZED_NAME_RULETYPE)
  private String ruletype;

  public static final String SERIALIZED_NAME_SCALECONFIGURATION = "scaleconfiguration";
  @SerializedName(SERIALIZED_NAME_SCALECONFIGURATION)
  private String scaleconfiguration;

  public static final String SERIALIZED_NAME_SCALEID = "scaleid";
  @SerializedName(SERIALIZED_NAME_SCALEID)
  private Integer scaleid;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_SORTORDER = "sortorder";
  @SerializedName(SERIALIZED_NAME_SORTORDER)
  private Integer sortorder = null;

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified = null;

  public CoreCompetencyUpdateCompetencyRequestCompetency() {
  }

  public CoreCompetencyUpdateCompetencyRequestCompetency competencyframeworkid(Integer competencyframeworkid) {
    this.competencyframeworkid = competencyframeworkid;
    return this;
  }

   /**
   * competencyframeworkid
   * @return competencyframeworkid
  **/
  @javax.annotation.Nullable
  public Integer getCompetencyframeworkid() {
    return competencyframeworkid;
  }

  public void setCompetencyframeworkid(Integer competencyframeworkid) {
    this.competencyframeworkid = competencyframeworkid;
  }


  public CoreCompetencyUpdateCompetencyRequestCompetency description(String description) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency descriptionformat(Integer descriptionformat) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency id(Integer id) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency idnumber(String idnumber) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency parentid(Integer parentid) {
    this.parentid = parentid;
    return this;
  }

   /**
   * parentid
   * @return parentid
  **/
  @javax.annotation.Nullable
  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }


  public CoreCompetencyUpdateCompetencyRequestCompetency path(String path) {
    this.path = path;
    return this;
  }

   /**
   * path
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public CoreCompetencyUpdateCompetencyRequestCompetency ruleconfig(String ruleconfig) {
    this.ruleconfig = ruleconfig;
    return this;
  }

   /**
   * ruleconfig
   * @return ruleconfig
  **/
  @javax.annotation.Nullable
  public String getRuleconfig() {
    return ruleconfig;
  }

  public void setRuleconfig(String ruleconfig) {
    this.ruleconfig = ruleconfig;
  }


  public CoreCompetencyUpdateCompetencyRequestCompetency ruleoutcome(Integer ruleoutcome) {
    this.ruleoutcome = ruleoutcome;
    return this;
  }

   /**
   * ruleoutcome
   * @return ruleoutcome
  **/
  @javax.annotation.Nullable
  public Integer getRuleoutcome() {
    return ruleoutcome;
  }

  public void setRuleoutcome(Integer ruleoutcome) {
    this.ruleoutcome = ruleoutcome;
  }


  public CoreCompetencyUpdateCompetencyRequestCompetency ruletype(String ruletype) {
    this.ruletype = ruletype;
    return this;
  }

   /**
   * ruletype
   * @return ruletype
  **/
  @javax.annotation.Nullable
  public String getRuletype() {
    return ruletype;
  }

  public void setRuletype(String ruletype) {
    this.ruletype = ruletype;
  }


  public CoreCompetencyUpdateCompetencyRequestCompetency scaleconfiguration(String scaleconfiguration) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency scaleid(Integer scaleid) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency shortname(String shortname) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency sortorder(Integer sortorder) {
    this.sortorder = sortorder;
    return this;
  }

   /**
   * sortorder
   * @return sortorder
  **/
  @javax.annotation.Nullable
  public Integer getSortorder() {
    return sortorder;
  }

  public void setSortorder(Integer sortorder) {
    this.sortorder = sortorder;
  }


  public CoreCompetencyUpdateCompetencyRequestCompetency timecreated(Integer timecreated) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency timemodified(Integer timemodified) {
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


  public CoreCompetencyUpdateCompetencyRequestCompetency usermodified(Integer usermodified) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompetencyUpdateCompetencyRequestCompetency coreCompetencyUpdateCompetencyRequestCompetency = (CoreCompetencyUpdateCompetencyRequestCompetency) o;
    return Objects.equals(this.competencyframeworkid, coreCompetencyUpdateCompetencyRequestCompetency.competencyframeworkid) &&
        Objects.equals(this.description, coreCompetencyUpdateCompetencyRequestCompetency.description) &&
        Objects.equals(this.descriptionformat, coreCompetencyUpdateCompetencyRequestCompetency.descriptionformat) &&
        Objects.equals(this.id, coreCompetencyUpdateCompetencyRequestCompetency.id) &&
        Objects.equals(this.idnumber, coreCompetencyUpdateCompetencyRequestCompetency.idnumber) &&
        Objects.equals(this.parentid, coreCompetencyUpdateCompetencyRequestCompetency.parentid) &&
        Objects.equals(this.path, coreCompetencyUpdateCompetencyRequestCompetency.path) &&
        Objects.equals(this.ruleconfig, coreCompetencyUpdateCompetencyRequestCompetency.ruleconfig) &&
        Objects.equals(this.ruleoutcome, coreCompetencyUpdateCompetencyRequestCompetency.ruleoutcome) &&
        Objects.equals(this.ruletype, coreCompetencyUpdateCompetencyRequestCompetency.ruletype) &&
        Objects.equals(this.scaleconfiguration, coreCompetencyUpdateCompetencyRequestCompetency.scaleconfiguration) &&
        Objects.equals(this.scaleid, coreCompetencyUpdateCompetencyRequestCompetency.scaleid) &&
        Objects.equals(this.shortname, coreCompetencyUpdateCompetencyRequestCompetency.shortname) &&
        Objects.equals(this.sortorder, coreCompetencyUpdateCompetencyRequestCompetency.sortorder) &&
        Objects.equals(this.timecreated, coreCompetencyUpdateCompetencyRequestCompetency.timecreated) &&
        Objects.equals(this.timemodified, coreCompetencyUpdateCompetencyRequestCompetency.timemodified) &&
        Objects.equals(this.usermodified, coreCompetencyUpdateCompetencyRequestCompetency.usermodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competencyframeworkid, description, descriptionformat, id, idnumber, parentid, path, ruleconfig, ruleoutcome, ruletype, scaleconfiguration, scaleid, shortname, sortorder, timecreated, timemodified, usermodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyUpdateCompetencyRequestCompetency {\n");
    sb.append("    competencyframeworkid: ").append(toIndentedString(competencyframeworkid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idnumber: ").append(toIndentedString(idnumber)).append("\n");
    sb.append("    parentid: ").append(toIndentedString(parentid)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    ruleconfig: ").append(toIndentedString(ruleconfig)).append("\n");
    sb.append("    ruleoutcome: ").append(toIndentedString(ruleoutcome)).append("\n");
    sb.append("    ruletype: ").append(toIndentedString(ruletype)).append("\n");
    sb.append("    scaleconfiguration: ").append(toIndentedString(scaleconfiguration)).append("\n");
    sb.append("    scaleid: ").append(toIndentedString(scaleid)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    sortorder: ").append(toIndentedString(sortorder)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
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
    openapiFields.add("competencyframeworkid");
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("id");
    openapiFields.add("idnumber");
    openapiFields.add("parentid");
    openapiFields.add("path");
    openapiFields.add("ruleconfig");
    openapiFields.add("ruleoutcome");
    openapiFields.add("ruletype");
    openapiFields.add("scaleconfiguration");
    openapiFields.add("scaleid");
    openapiFields.add("shortname");
    openapiFields.add("sortorder");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("usermodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyUpdateCompetencyRequestCompetency
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyUpdateCompetencyRequestCompetency.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyUpdateCompetencyRequestCompetency is not found in the empty JSON string", CoreCompetencyUpdateCompetencyRequestCompetency.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyUpdateCompetencyRequestCompetency.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyUpdateCompetencyRequestCompetency` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyUpdateCompetencyRequestCompetency.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("idnumber") != null && !jsonObj.get("idnumber").isJsonNull()) && !jsonObj.get("idnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idnumber").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("ruleconfig") != null && !jsonObj.get("ruleconfig").isJsonNull()) && !jsonObj.get("ruleconfig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleconfig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleconfig").toString()));
      }
      if ((jsonObj.get("ruletype") != null && !jsonObj.get("ruletype").isJsonNull()) && !jsonObj.get("ruletype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruletype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruletype").toString()));
      }
      if ((jsonObj.get("scaleconfiguration") != null && !jsonObj.get("scaleconfiguration").isJsonNull()) && !jsonObj.get("scaleconfiguration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scaleconfiguration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scaleconfiguration").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyUpdateCompetencyRequestCompetency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyUpdateCompetencyRequestCompetency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyUpdateCompetencyRequestCompetency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyUpdateCompetencyRequestCompetency.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyUpdateCompetencyRequestCompetency>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyUpdateCompetencyRequestCompetency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyUpdateCompetencyRequestCompetency read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyUpdateCompetencyRequestCompetency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyUpdateCompetencyRequestCompetency
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyUpdateCompetencyRequestCompetency
  */
  public static CoreCompetencyUpdateCompetencyRequestCompetency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyUpdateCompetencyRequestCompetency.class);
  }

 /**
  * Convert an instance of CoreCompetencyUpdateCompetencyRequestCompetency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


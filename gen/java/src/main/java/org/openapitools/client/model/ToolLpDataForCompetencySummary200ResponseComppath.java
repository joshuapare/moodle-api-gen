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
import org.openapitools.client.model.ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework;
import org.openapitools.client.model.ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner;

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
 * ToolLpDataForCompetencySummary200ResponseComppath
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForCompetencySummary200ResponseComppath {
  public static final String SERIALIZED_NAME_ANCESTORS = "ancestors";
  @SerializedName(SERIALIZED_NAME_ANCESTORS)
  private List<ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner> ancestors = new ArrayList<>();

  public static final String SERIALIZED_NAME_FRAMEWORK = "framework";
  @SerializedName(SERIALIZED_NAME_FRAMEWORK)
  private ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework framework;

  public static final String SERIALIZED_NAME_PAGECONTEXTID = "pagecontextid";
  @SerializedName(SERIALIZED_NAME_PAGECONTEXTID)
  private Integer pagecontextid;

  public static final String SERIALIZED_NAME_PLUGINBASEURL = "pluginbaseurl";
  @SerializedName(SERIALIZED_NAME_PLUGINBASEURL)
  private String pluginbaseurl;

  public static final String SERIALIZED_NAME_SHOWLINKS = "showlinks";
  @SerializedName(SERIALIZED_NAME_SHOWLINKS)
  private Boolean showlinks;

  public ToolLpDataForCompetencySummary200ResponseComppath() {
  }

  public ToolLpDataForCompetencySummary200ResponseComppath ancestors(List<ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  public ToolLpDataForCompetencySummary200ResponseComppath addAncestorsItem(ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner ancestorsItem) {
    if (this.ancestors == null) {
      this.ancestors = new ArrayList<>();
    }
    this.ancestors.add(ancestorsItem);
    return this;
  }

   /**
   * Get ancestors
   * @return ancestors
  **/
  @javax.annotation.Nonnull
  public List<ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner> getAncestors() {
    return ancestors;
  }

  public void setAncestors(List<ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner> ancestors) {
    this.ancestors = ancestors;
  }


  public ToolLpDataForCompetencySummary200ResponseComppath framework(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework framework) {
    this.framework = framework;
    return this;
  }

   /**
   * Get framework
   * @return framework
  **/
  @javax.annotation.Nonnull
  public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework getFramework() {
    return framework;
  }

  public void setFramework(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework framework) {
    this.framework = framework;
  }


  public ToolLpDataForCompetencySummary200ResponseComppath pagecontextid(Integer pagecontextid) {
    this.pagecontextid = pagecontextid;
    return this;
  }

   /**
   * pagecontextid
   * @return pagecontextid
  **/
  @javax.annotation.Nonnull
  public Integer getPagecontextid() {
    return pagecontextid;
  }

  public void setPagecontextid(Integer pagecontextid) {
    this.pagecontextid = pagecontextid;
  }


  public ToolLpDataForCompetencySummary200ResponseComppath pluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
    return this;
  }

   /**
   * pluginbaseurl
   * @return pluginbaseurl
  **/
  @javax.annotation.Nonnull
  public String getPluginbaseurl() {
    return pluginbaseurl;
  }

  public void setPluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
  }


  public ToolLpDataForCompetencySummary200ResponseComppath showlinks(Boolean showlinks) {
    this.showlinks = showlinks;
    return this;
  }

   /**
   * showlinks
   * @return showlinks
  **/
  @javax.annotation.Nonnull
  public Boolean getShowlinks() {
    return showlinks;
  }

  public void setShowlinks(Boolean showlinks) {
    this.showlinks = showlinks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolLpDataForCompetencySummary200ResponseComppath toolLpDataForCompetencySummary200ResponseComppath = (ToolLpDataForCompetencySummary200ResponseComppath) o;
    return Objects.equals(this.ancestors, toolLpDataForCompetencySummary200ResponseComppath.ancestors) &&
        Objects.equals(this.framework, toolLpDataForCompetencySummary200ResponseComppath.framework) &&
        Objects.equals(this.pagecontextid, toolLpDataForCompetencySummary200ResponseComppath.pagecontextid) &&
        Objects.equals(this.pluginbaseurl, toolLpDataForCompetencySummary200ResponseComppath.pluginbaseurl) &&
        Objects.equals(this.showlinks, toolLpDataForCompetencySummary200ResponseComppath.showlinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestors, framework, pagecontextid, pluginbaseurl, showlinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForCompetencySummary200ResponseComppath {\n");
    sb.append("    ancestors: ").append(toIndentedString(ancestors)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    pagecontextid: ").append(toIndentedString(pagecontextid)).append("\n");
    sb.append("    pluginbaseurl: ").append(toIndentedString(pluginbaseurl)).append("\n");
    sb.append("    showlinks: ").append(toIndentedString(showlinks)).append("\n");
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
    openapiFields.add("ancestors");
    openapiFields.add("framework");
    openapiFields.add("pagecontextid");
    openapiFields.add("pluginbaseurl");
    openapiFields.add("showlinks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ancestors");
    openapiRequiredFields.add("framework");
    openapiRequiredFields.add("pagecontextid");
    openapiRequiredFields.add("pluginbaseurl");
    openapiRequiredFields.add("showlinks");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForCompetencySummary200ResponseComppath
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForCompetencySummary200ResponseComppath.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForCompetencySummary200ResponseComppath is not found in the empty JSON string", ToolLpDataForCompetencySummary200ResponseComppath.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForCompetencySummary200ResponseComppath.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForCompetencySummary200ResponseComppath` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForCompetencySummary200ResponseComppath.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("ancestors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ancestors` to be an array in the JSON string but got `%s`", jsonObj.get("ancestors").toString()));
      }

      JsonArray jsonArrayancestors = jsonObj.getAsJsonArray("ancestors");
      // validate the required field `ancestors` (array)
      for (int i = 0; i < jsonArrayancestors.size(); i++) {
        ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner.validateJsonElement(jsonArrayancestors.get(i));
      };
      // validate the required field `framework`
      ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.validateJsonElement(jsonObj.get("framework"));
      if (!jsonObj.get("pluginbaseurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginbaseurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluginbaseurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForCompetencySummary200ResponseComppath.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForCompetencySummary200ResponseComppath' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForCompetencySummary200ResponseComppath> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForCompetencySummary200ResponseComppath.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForCompetencySummary200ResponseComppath>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForCompetencySummary200ResponseComppath value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForCompetencySummary200ResponseComppath read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForCompetencySummary200ResponseComppath given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForCompetencySummary200ResponseComppath
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForCompetencySummary200ResponseComppath
  */
  public static ToolLpDataForCompetencySummary200ResponseComppath fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForCompetencySummary200ResponseComppath.class);
  }

 /**
  * Convert an instance of ToolLpDataForCompetencySummary200ResponseComppath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


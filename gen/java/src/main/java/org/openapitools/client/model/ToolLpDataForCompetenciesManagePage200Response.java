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
import org.openapitools.client.model.CoreCompetencyDuplicateCompetencyFramework200Response;

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
 * ToolLpDataForCompetenciesManagePage200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForCompetenciesManagePage200Response {
  public static final String SERIALIZED_NAME_CANMANAGE = "canmanage";
  @SerializedName(SERIALIZED_NAME_CANMANAGE)
  private Boolean canmanage = null;

  public static final String SERIALIZED_NAME_FRAMEWORK = "framework";
  @SerializedName(SERIALIZED_NAME_FRAMEWORK)
  private CoreCompetencyDuplicateCompetencyFramework200Response framework;

  public static final String SERIALIZED_NAME_PAGECONTEXTID = "pagecontextid";
  @SerializedName(SERIALIZED_NAME_PAGECONTEXTID)
  private Integer pagecontextid = null;

  public static final String SERIALIZED_NAME_PLUGINBASEURL = "pluginbaseurl";
  @SerializedName(SERIALIZED_NAME_PLUGINBASEURL)
  private String pluginbaseurl = "null";

  public static final String SERIALIZED_NAME_RULESMODULES = "rulesmodules";
  @SerializedName(SERIALIZED_NAME_RULESMODULES)
  private String rulesmodules = "null";

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private String search = "null";

  public ToolLpDataForCompetenciesManagePage200Response() {
  }

  public ToolLpDataForCompetenciesManagePage200Response canmanage(Boolean canmanage) {
    this.canmanage = canmanage;
    return this;
  }

   /**
   * True if this user has permission to manage competency frameworks
   * @return canmanage
  **/
  @javax.annotation.Nonnull
  public Boolean getCanmanage() {
    return canmanage;
  }

  public void setCanmanage(Boolean canmanage) {
    this.canmanage = canmanage;
  }


  public ToolLpDataForCompetenciesManagePage200Response framework(CoreCompetencyDuplicateCompetencyFramework200Response framework) {
    this.framework = framework;
    return this;
  }

   /**
   * Get framework
   * @return framework
  **/
  @javax.annotation.Nonnull
  public CoreCompetencyDuplicateCompetencyFramework200Response getFramework() {
    return framework;
  }

  public void setFramework(CoreCompetencyDuplicateCompetencyFramework200Response framework) {
    this.framework = framework;
  }


  public ToolLpDataForCompetenciesManagePage200Response pagecontextid(Integer pagecontextid) {
    this.pagecontextid = pagecontextid;
    return this;
  }

   /**
   * Context id for the framework
   * @return pagecontextid
  **/
  @javax.annotation.Nonnull
  public Integer getPagecontextid() {
    return pagecontextid;
  }

  public void setPagecontextid(Integer pagecontextid) {
    this.pagecontextid = pagecontextid;
  }


  public ToolLpDataForCompetenciesManagePage200Response pluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
    return this;
  }

   /**
   * Plugin base url
   * @return pluginbaseurl
  **/
  @javax.annotation.Nonnull
  public String getPluginbaseurl() {
    return pluginbaseurl;
  }

  public void setPluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
  }


  public ToolLpDataForCompetenciesManagePage200Response rulesmodules(String rulesmodules) {
    this.rulesmodules = rulesmodules;
    return this;
  }

   /**
   * JSON encoded data for rules
   * @return rulesmodules
  **/
  @javax.annotation.Nonnull
  public String getRulesmodules() {
    return rulesmodules;
  }

  public void setRulesmodules(String rulesmodules) {
    this.rulesmodules = rulesmodules;
  }


  public ToolLpDataForCompetenciesManagePage200Response search(String search) {
    this.search = search;
    return this;
  }

   /**
   * Current search string
   * @return search
  **/
  @javax.annotation.Nonnull
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolLpDataForCompetenciesManagePage200Response toolLpDataForCompetenciesManagePage200Response = (ToolLpDataForCompetenciesManagePage200Response) o;
    return Objects.equals(this.canmanage, toolLpDataForCompetenciesManagePage200Response.canmanage) &&
        Objects.equals(this.framework, toolLpDataForCompetenciesManagePage200Response.framework) &&
        Objects.equals(this.pagecontextid, toolLpDataForCompetenciesManagePage200Response.pagecontextid) &&
        Objects.equals(this.pluginbaseurl, toolLpDataForCompetenciesManagePage200Response.pluginbaseurl) &&
        Objects.equals(this.rulesmodules, toolLpDataForCompetenciesManagePage200Response.rulesmodules) &&
        Objects.equals(this.search, toolLpDataForCompetenciesManagePage200Response.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canmanage, framework, pagecontextid, pluginbaseurl, rulesmodules, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForCompetenciesManagePage200Response {\n");
    sb.append("    canmanage: ").append(toIndentedString(canmanage)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    pagecontextid: ").append(toIndentedString(pagecontextid)).append("\n");
    sb.append("    pluginbaseurl: ").append(toIndentedString(pluginbaseurl)).append("\n");
    sb.append("    rulesmodules: ").append(toIndentedString(rulesmodules)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
    openapiFields.add("framework");
    openapiFields.add("pagecontextid");
    openapiFields.add("pluginbaseurl");
    openapiFields.add("rulesmodules");
    openapiFields.add("search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canmanage");
    openapiRequiredFields.add("framework");
    openapiRequiredFields.add("pagecontextid");
    openapiRequiredFields.add("pluginbaseurl");
    openapiRequiredFields.add("rulesmodules");
    openapiRequiredFields.add("search");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForCompetenciesManagePage200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForCompetenciesManagePage200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForCompetenciesManagePage200Response is not found in the empty JSON string", ToolLpDataForCompetenciesManagePage200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForCompetenciesManagePage200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForCompetenciesManagePage200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForCompetenciesManagePage200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `framework`
      CoreCompetencyDuplicateCompetencyFramework200Response.validateJsonElement(jsonObj.get("framework"));
      if (!jsonObj.get("pluginbaseurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginbaseurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluginbaseurl").toString()));
      }
      if (!jsonObj.get("rulesmodules").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rulesmodules` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rulesmodules").toString()));
      }
      if (!jsonObj.get("search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForCompetenciesManagePage200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForCompetenciesManagePage200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForCompetenciesManagePage200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForCompetenciesManagePage200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForCompetenciesManagePage200Response>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForCompetenciesManagePage200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForCompetenciesManagePage200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForCompetenciesManagePage200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForCompetenciesManagePage200Response
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForCompetenciesManagePage200Response
  */
  public static ToolLpDataForCompetenciesManagePage200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForCompetenciesManagePage200Response.class);
  }

 /**
  * Convert an instance of ToolLpDataForCompetenciesManagePage200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


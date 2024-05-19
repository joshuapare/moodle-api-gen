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
import org.openapitools.client.model.ToolLpDataForTemplatesManagePage200ResponseTemplatesInner;

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
 * ToolLpDataForTemplatesManagePage200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForTemplatesManagePage200Response {
  public static final String SERIALIZED_NAME_CANMANAGE = "canmanage";
  @SerializedName(SERIALIZED_NAME_CANMANAGE)
  private Boolean canmanage = null;

  public static final String SERIALIZED_NAME_NAVIGATION = "navigation";
  @SerializedName(SERIALIZED_NAME_NAVIGATION)
  private List<Object> navigation = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGECONTEXTID = "pagecontextid";
  @SerializedName(SERIALIZED_NAME_PAGECONTEXTID)
  private Integer pagecontextid;

  public static final String SERIALIZED_NAME_PLUGINBASEURL = "pluginbaseurl";
  @SerializedName(SERIALIZED_NAME_PLUGINBASEURL)
  private String pluginbaseurl;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<ToolLpDataForTemplatesManagePage200ResponseTemplatesInner> templates = new ArrayList<>();

  public ToolLpDataForTemplatesManagePage200Response() {
  }

  public ToolLpDataForTemplatesManagePage200Response canmanage(Boolean canmanage) {
    this.canmanage = canmanage;
    return this;
  }

   /**
   * Whether the user manage the templates
   * @return canmanage
  **/
  @javax.annotation.Nonnull
  public Boolean getCanmanage() {
    return canmanage;
  }

  public void setCanmanage(Boolean canmanage) {
    this.canmanage = canmanage;
  }


  public ToolLpDataForTemplatesManagePage200Response navigation(List<Object> navigation) {
    this.navigation = navigation;
    return this;
  }

  public ToolLpDataForTemplatesManagePage200Response addNavigationItem(Object navigationItem) {
    if (this.navigation == null) {
      this.navigation = new ArrayList<>();
    }
    this.navigation.add(navigationItem);
    return this;
  }

   /**
   * Get navigation
   * @return navigation
  **/
  @javax.annotation.Nonnull
  public List<Object> getNavigation() {
    return navigation;
  }

  public void setNavigation(List<Object> navigation) {
    this.navigation = navigation;
  }


  public ToolLpDataForTemplatesManagePage200Response pagecontextid(Integer pagecontextid) {
    this.pagecontextid = pagecontextid;
    return this;
  }

   /**
   * The page context id
   * @return pagecontextid
  **/
  @javax.annotation.Nonnull
  public Integer getPagecontextid() {
    return pagecontextid;
  }

  public void setPagecontextid(Integer pagecontextid) {
    this.pagecontextid = pagecontextid;
  }


  public ToolLpDataForTemplatesManagePage200Response pluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
    return this;
  }

   /**
   * Url to the tool_lp plugin folder on this Moodle site
   * @return pluginbaseurl
  **/
  @javax.annotation.Nonnull
  public String getPluginbaseurl() {
    return pluginbaseurl;
  }

  public void setPluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
  }


  public ToolLpDataForTemplatesManagePage200Response templates(List<ToolLpDataForTemplatesManagePage200ResponseTemplatesInner> templates) {
    this.templates = templates;
    return this;
  }

  public ToolLpDataForTemplatesManagePage200Response addTemplatesItem(ToolLpDataForTemplatesManagePage200ResponseTemplatesInner templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nonnull
  public List<ToolLpDataForTemplatesManagePage200ResponseTemplatesInner> getTemplates() {
    return templates;
  }

  public void setTemplates(List<ToolLpDataForTemplatesManagePage200ResponseTemplatesInner> templates) {
    this.templates = templates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolLpDataForTemplatesManagePage200Response toolLpDataForTemplatesManagePage200Response = (ToolLpDataForTemplatesManagePage200Response) o;
    return Objects.equals(this.canmanage, toolLpDataForTemplatesManagePage200Response.canmanage) &&
        Objects.equals(this.navigation, toolLpDataForTemplatesManagePage200Response.navigation) &&
        Objects.equals(this.pagecontextid, toolLpDataForTemplatesManagePage200Response.pagecontextid) &&
        Objects.equals(this.pluginbaseurl, toolLpDataForTemplatesManagePage200Response.pluginbaseurl) &&
        Objects.equals(this.templates, toolLpDataForTemplatesManagePage200Response.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canmanage, navigation, pagecontextid, pluginbaseurl, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForTemplatesManagePage200Response {\n");
    sb.append("    canmanage: ").append(toIndentedString(canmanage)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
    sb.append("    pagecontextid: ").append(toIndentedString(pagecontextid)).append("\n");
    sb.append("    pluginbaseurl: ").append(toIndentedString(pluginbaseurl)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
    openapiFields.add("navigation");
    openapiFields.add("pagecontextid");
    openapiFields.add("pluginbaseurl");
    openapiFields.add("templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canmanage");
    openapiRequiredFields.add("navigation");
    openapiRequiredFields.add("pagecontextid");
    openapiRequiredFields.add("pluginbaseurl");
    openapiRequiredFields.add("templates");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForTemplatesManagePage200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForTemplatesManagePage200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForTemplatesManagePage200Response is not found in the empty JSON string", ToolLpDataForTemplatesManagePage200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForTemplatesManagePage200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForTemplatesManagePage200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForTemplatesManagePage200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("navigation") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("navigation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `navigation` to be an array in the JSON string but got `%s`", jsonObj.get("navigation").toString()));
      }
      if (!jsonObj.get("pluginbaseurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginbaseurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluginbaseurl").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("templates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `templates` to be an array in the JSON string but got `%s`", jsonObj.get("templates").toString()));
      }

      JsonArray jsonArraytemplates = jsonObj.getAsJsonArray("templates");
      // validate the required field `templates` (array)
      for (int i = 0; i < jsonArraytemplates.size(); i++) {
        ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.validateJsonElement(jsonArraytemplates.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForTemplatesManagePage200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForTemplatesManagePage200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForTemplatesManagePage200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForTemplatesManagePage200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForTemplatesManagePage200Response>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForTemplatesManagePage200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForTemplatesManagePage200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForTemplatesManagePage200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForTemplatesManagePage200Response
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForTemplatesManagePage200Response
  */
  public static ToolLpDataForTemplatesManagePage200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForTemplatesManagePage200Response.class);
  }

 /**
  * Convert an instance of ToolLpDataForTemplatesManagePage200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner;

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
 * CoreReportbuilderColumnsDelete200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreReportbuilderColumnsDelete200Response {
  public static final String SERIALIZED_NAME_HASSORTABLECOLUMNS = "hassortablecolumns";
  @SerializedName(SERIALIZED_NAME_HASSORTABLECOLUMNS)
  private Boolean hassortablecolumns;

  public static final String SERIALIZED_NAME_HELPICON = "helpicon";
  @SerializedName(SERIALIZED_NAME_HELPICON)
  private String helpicon;

  public static final String SERIALIZED_NAME_SORTABLECOLUMNS = "sortablecolumns";
  @SerializedName(SERIALIZED_NAME_SORTABLECOLUMNS)
  private List<CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner> sortablecolumns = new ArrayList<>();

  public CoreReportbuilderColumnsDelete200Response() {
  }

  public CoreReportbuilderColumnsDelete200Response hassortablecolumns(Boolean hassortablecolumns) {
    this.hassortablecolumns = hassortablecolumns;
    return this;
  }

   /**
   * hassortablecolumns
   * @return hassortablecolumns
  **/
  @javax.annotation.Nonnull
  public Boolean getHassortablecolumns() {
    return hassortablecolumns;
  }

  public void setHassortablecolumns(Boolean hassortablecolumns) {
    this.hassortablecolumns = hassortablecolumns;
  }


  public CoreReportbuilderColumnsDelete200Response helpicon(String helpicon) {
    this.helpicon = helpicon;
    return this;
  }

   /**
   * helpicon
   * @return helpicon
  **/
  @javax.annotation.Nonnull
  public String getHelpicon() {
    return helpicon;
  }

  public void setHelpicon(String helpicon) {
    this.helpicon = helpicon;
  }


  public CoreReportbuilderColumnsDelete200Response sortablecolumns(List<CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner> sortablecolumns) {
    this.sortablecolumns = sortablecolumns;
    return this;
  }

  public CoreReportbuilderColumnsDelete200Response addSortablecolumnsItem(CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner sortablecolumnsItem) {
    if (this.sortablecolumns == null) {
      this.sortablecolumns = new ArrayList<>();
    }
    this.sortablecolumns.add(sortablecolumnsItem);
    return this;
  }

   /**
   * Get sortablecolumns
   * @return sortablecolumns
  **/
  @javax.annotation.Nonnull
  public List<CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner> getSortablecolumns() {
    return sortablecolumns;
  }

  public void setSortablecolumns(List<CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner> sortablecolumns) {
    this.sortablecolumns = sortablecolumns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreReportbuilderColumnsDelete200Response coreReportbuilderColumnsDelete200Response = (CoreReportbuilderColumnsDelete200Response) o;
    return Objects.equals(this.hassortablecolumns, coreReportbuilderColumnsDelete200Response.hassortablecolumns) &&
        Objects.equals(this.helpicon, coreReportbuilderColumnsDelete200Response.helpicon) &&
        Objects.equals(this.sortablecolumns, coreReportbuilderColumnsDelete200Response.sortablecolumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hassortablecolumns, helpicon, sortablecolumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreReportbuilderColumnsDelete200Response {\n");
    sb.append("    hassortablecolumns: ").append(toIndentedString(hassortablecolumns)).append("\n");
    sb.append("    helpicon: ").append(toIndentedString(helpicon)).append("\n");
    sb.append("    sortablecolumns: ").append(toIndentedString(sortablecolumns)).append("\n");
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
    openapiFields.add("hassortablecolumns");
    openapiFields.add("helpicon");
    openapiFields.add("sortablecolumns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hassortablecolumns");
    openapiRequiredFields.add("helpicon");
    openapiRequiredFields.add("sortablecolumns");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreReportbuilderColumnsDelete200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreReportbuilderColumnsDelete200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreReportbuilderColumnsDelete200Response is not found in the empty JSON string", CoreReportbuilderColumnsDelete200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreReportbuilderColumnsDelete200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreReportbuilderColumnsDelete200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreReportbuilderColumnsDelete200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("helpicon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `helpicon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("helpicon").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sortablecolumns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortablecolumns` to be an array in the JSON string but got `%s`", jsonObj.get("sortablecolumns").toString()));
      }

      JsonArray jsonArraysortablecolumns = jsonObj.getAsJsonArray("sortablecolumns");
      // validate the required field `sortablecolumns` (array)
      for (int i = 0; i < jsonArraysortablecolumns.size(); i++) {
        CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner.validateJsonElement(jsonArraysortablecolumns.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreReportbuilderColumnsDelete200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreReportbuilderColumnsDelete200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreReportbuilderColumnsDelete200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreReportbuilderColumnsDelete200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreReportbuilderColumnsDelete200Response>() {
           @Override
           public void write(JsonWriter out, CoreReportbuilderColumnsDelete200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreReportbuilderColumnsDelete200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreReportbuilderColumnsDelete200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreReportbuilderColumnsDelete200Response
  * @throws IOException if the JSON string is invalid with respect to CoreReportbuilderColumnsDelete200Response
  */
  public static CoreReportbuilderColumnsDelete200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreReportbuilderColumnsDelete200Response.class);
  }

 /**
  * Convert an instance of CoreReportbuilderColumnsDelete200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

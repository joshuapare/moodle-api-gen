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
 * CoreReportbuilderListReportsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreReportbuilderListReportsRequest {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = 0;

  public static final String SERIALIZED_NAME_PERPAGE = "perpage";
  @SerializedName(SERIALIZED_NAME_PERPAGE)
  private Integer perpage = 10;

  public CoreReportbuilderListReportsRequest() {
  }

  public CoreReportbuilderListReportsRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public CoreReportbuilderListReportsRequest perpage(Integer perpage) {
    this.perpage = perpage;
    return this;
  }

   /**
   * Reports per page
   * @return perpage
  **/
  @javax.annotation.Nullable
  public Integer getPerpage() {
    return perpage;
  }

  public void setPerpage(Integer perpage) {
    this.perpage = perpage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreReportbuilderListReportsRequest coreReportbuilderListReportsRequest = (CoreReportbuilderListReportsRequest) o;
    return Objects.equals(this.page, coreReportbuilderListReportsRequest.page) &&
        Objects.equals(this.perpage, coreReportbuilderListReportsRequest.perpage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, perpage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreReportbuilderListReportsRequest {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("perpage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreReportbuilderListReportsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreReportbuilderListReportsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreReportbuilderListReportsRequest is not found in the empty JSON string", CoreReportbuilderListReportsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreReportbuilderListReportsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreReportbuilderListReportsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreReportbuilderListReportsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreReportbuilderListReportsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreReportbuilderListReportsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreReportbuilderListReportsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreReportbuilderListReportsRequest>() {
           @Override
           public void write(JsonWriter out, CoreReportbuilderListReportsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreReportbuilderListReportsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreReportbuilderListReportsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreReportbuilderListReportsRequest
  * @throws IOException if the JSON string is invalid with respect to CoreReportbuilderListReportsRequest
  */
  public static CoreReportbuilderListReportsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreReportbuilderListReportsRequest.class);
  }

 /**
  * Convert an instance of CoreReportbuilderListReportsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


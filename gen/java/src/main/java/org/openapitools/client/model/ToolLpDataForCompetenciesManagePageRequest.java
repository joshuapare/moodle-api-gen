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
 * ToolLpDataForCompetenciesManagePageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForCompetenciesManagePageRequest {
  public static final String SERIALIZED_NAME_COMPETENCYFRAMEWORKID = "competencyframeworkid";
  @SerializedName(SERIALIZED_NAME_COMPETENCYFRAMEWORKID)
  private Integer competencyframeworkid;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private String search = "";

  public ToolLpDataForCompetenciesManagePageRequest() {
  }

  public ToolLpDataForCompetenciesManagePageRequest competencyframeworkid(Integer competencyframeworkid) {
    this.competencyframeworkid = competencyframeworkid;
    return this;
  }

   /**
   * The competency framework id
   * @return competencyframeworkid
  **/
  @javax.annotation.Nonnull
  public Integer getCompetencyframeworkid() {
    return competencyframeworkid;
  }

  public void setCompetencyframeworkid(Integer competencyframeworkid) {
    this.competencyframeworkid = competencyframeworkid;
  }


  public ToolLpDataForCompetenciesManagePageRequest search(String search) {
    this.search = search;
    return this;
  }

   /**
   * A search string
   * @return search
  **/
  @javax.annotation.Nullable
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
    ToolLpDataForCompetenciesManagePageRequest toolLpDataForCompetenciesManagePageRequest = (ToolLpDataForCompetenciesManagePageRequest) o;
    return Objects.equals(this.competencyframeworkid, toolLpDataForCompetenciesManagePageRequest.competencyframeworkid) &&
        Objects.equals(this.search, toolLpDataForCompetenciesManagePageRequest.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competencyframeworkid, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForCompetenciesManagePageRequest {\n");
    sb.append("    competencyframeworkid: ").append(toIndentedString(competencyframeworkid)).append("\n");
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
    openapiFields.add("competencyframeworkid");
    openapiFields.add("search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("competencyframeworkid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForCompetenciesManagePageRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForCompetenciesManagePageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForCompetenciesManagePageRequest is not found in the empty JSON string", ToolLpDataForCompetenciesManagePageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForCompetenciesManagePageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForCompetenciesManagePageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForCompetenciesManagePageRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("search") != null && !jsonObj.get("search").isJsonNull()) && !jsonObj.get("search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForCompetenciesManagePageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForCompetenciesManagePageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForCompetenciesManagePageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForCompetenciesManagePageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForCompetenciesManagePageRequest>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForCompetenciesManagePageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForCompetenciesManagePageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForCompetenciesManagePageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForCompetenciesManagePageRequest
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForCompetenciesManagePageRequest
  */
  public static ToolLpDataForCompetenciesManagePageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForCompetenciesManagePageRequest.class);
  }

 /**
  * Convert an instance of ToolLpDataForCompetenciesManagePageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreCohortSearchCohortsRequestContext;

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
 * CoreCohortSearchCohortsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCohortSearchCohortsRequest {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private CoreCohortSearchCohortsRequestContext context;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private String includes = "parents";

  public static final String SERIALIZED_NAME_LIMITFROM = "limitfrom";
  @SerializedName(SERIALIZED_NAME_LIMITFROM)
  private Integer limitfrom = 0;

  public static final String SERIALIZED_NAME_LIMITNUM = "limitnum";
  @SerializedName(SERIALIZED_NAME_LIMITNUM)
  private Integer limitnum = 25;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query = "null";

  public CoreCohortSearchCohortsRequest() {
  }

  public CoreCohortSearchCohortsRequest context(CoreCohortSearchCohortsRequestContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nonnull
  public CoreCohortSearchCohortsRequestContext getContext() {
    return context;
  }

  public void setContext(CoreCohortSearchCohortsRequestContext context) {
    this.context = context;
  }


  public CoreCohortSearchCohortsRequest includes(String includes) {
    this.includes = includes;
    return this;
  }

   /**
   * What other contexts to fetch the frameworks from. (all, parents, self)
   * @return includes
  **/
  @javax.annotation.Nullable
  public String getIncludes() {
    return includes;
  }

  public void setIncludes(String includes) {
    this.includes = includes;
  }


  public CoreCohortSearchCohortsRequest limitfrom(Integer limitfrom) {
    this.limitfrom = limitfrom;
    return this;
  }

   /**
   * limitfrom we are fetching the records from
   * @return limitfrom
  **/
  @javax.annotation.Nullable
  public Integer getLimitfrom() {
    return limitfrom;
  }

  public void setLimitfrom(Integer limitfrom) {
    this.limitfrom = limitfrom;
  }


  public CoreCohortSearchCohortsRequest limitnum(Integer limitnum) {
    this.limitnum = limitnum;
    return this;
  }

   /**
   * Number of records to fetch
   * @return limitnum
  **/
  @javax.annotation.Nullable
  public Integer getLimitnum() {
    return limitnum;
  }

  public void setLimitnum(Integer limitnum) {
    this.limitnum = limitnum;
  }


  public CoreCohortSearchCohortsRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Query string
   * @return query
  **/
  @javax.annotation.Nonnull
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCohortSearchCohortsRequest coreCohortSearchCohortsRequest = (CoreCohortSearchCohortsRequest) o;
    return Objects.equals(this.context, coreCohortSearchCohortsRequest.context) &&
        Objects.equals(this.includes, coreCohortSearchCohortsRequest.includes) &&
        Objects.equals(this.limitfrom, coreCohortSearchCohortsRequest.limitfrom) &&
        Objects.equals(this.limitnum, coreCohortSearchCohortsRequest.limitnum) &&
        Objects.equals(this.query, coreCohortSearchCohortsRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, includes, limitfrom, limitnum, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCohortSearchCohortsRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    limitfrom: ").append(toIndentedString(limitfrom)).append("\n");
    sb.append("    limitnum: ").append(toIndentedString(limitnum)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("includes");
    openapiFields.add("limitfrom");
    openapiFields.add("limitnum");
    openapiFields.add("query");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("context");
    openapiRequiredFields.add("query");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCohortSearchCohortsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCohortSearchCohortsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCohortSearchCohortsRequest is not found in the empty JSON string", CoreCohortSearchCohortsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCohortSearchCohortsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCohortSearchCohortsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCohortSearchCohortsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `context`
      CoreCohortSearchCohortsRequestContext.validateJsonElement(jsonObj.get("context"));
      if ((jsonObj.get("includes") != null && !jsonObj.get("includes").isJsonNull()) && !jsonObj.get("includes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includes").toString()));
      }
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCohortSearchCohortsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCohortSearchCohortsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCohortSearchCohortsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCohortSearchCohortsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCohortSearchCohortsRequest>() {
           @Override
           public void write(JsonWriter out, CoreCohortSearchCohortsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCohortSearchCohortsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCohortSearchCohortsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCohortSearchCohortsRequest
  * @throws IOException if the JSON string is invalid with respect to CoreCohortSearchCohortsRequest
  */
  public static CoreCohortSearchCohortsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCohortSearchCohortsRequest.class);
  }

 /**
  * Convert an instance of CoreCohortSearchCohortsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreSearchGetResults200ResponseResultsInner;

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
 * CoreSearchGetResults200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreSearchGetResults200Response {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<CoreSearchGetResults200ResponseResultsInner> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTALCOUNT = "totalcount";
  @SerializedName(SERIALIZED_NAME_TOTALCOUNT)
  private Integer totalcount = null;

  public CoreSearchGetResults200Response() {
  }

  public CoreSearchGetResults200Response results(List<CoreSearchGetResults200ResponseResultsInner> results) {
    this.results = results;
    return this;
  }

  public CoreSearchGetResults200Response addResultsItem(CoreSearchGetResults200ResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  public List<CoreSearchGetResults200ResponseResultsInner> getResults() {
    return results;
  }

  public void setResults(List<CoreSearchGetResults200ResponseResultsInner> results) {
    this.results = results;
  }


  public CoreSearchGetResults200Response totalcount(Integer totalcount) {
    this.totalcount = totalcount;
    return this;
  }

   /**
   * Total number of results
   * @return totalcount
  **/
  @javax.annotation.Nonnull
  public Integer getTotalcount() {
    return totalcount;
  }

  public void setTotalcount(Integer totalcount) {
    this.totalcount = totalcount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreSearchGetResults200Response coreSearchGetResults200Response = (CoreSearchGetResults200Response) o;
    return Objects.equals(this.results, coreSearchGetResults200Response.results) &&
        Objects.equals(this.totalcount, coreSearchGetResults200Response.totalcount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalcount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreSearchGetResults200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalcount: ").append(toIndentedString(totalcount)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("totalcount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
    openapiRequiredFields.add("totalcount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreSearchGetResults200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreSearchGetResults200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreSearchGetResults200Response is not found in the empty JSON string", CoreSearchGetResults200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreSearchGetResults200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreSearchGetResults200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreSearchGetResults200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        CoreSearchGetResults200ResponseResultsInner.validateJsonElement(jsonArrayresults.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreSearchGetResults200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreSearchGetResults200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreSearchGetResults200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreSearchGetResults200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreSearchGetResults200Response>() {
           @Override
           public void write(JsonWriter out, CoreSearchGetResults200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreSearchGetResults200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreSearchGetResults200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreSearchGetResults200Response
  * @throws IOException if the JSON string is invalid with respect to CoreSearchGetResults200Response
  */
  public static CoreSearchGetResults200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreSearchGetResults200Response.class);
  }

 /**
  * Convert an instance of CoreSearchGetResults200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


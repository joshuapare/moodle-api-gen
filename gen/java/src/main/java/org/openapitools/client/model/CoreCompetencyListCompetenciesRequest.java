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
import org.openapitools.client.model.CoreCompetencyListCompetenciesRequestFiltersInner;

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
 * CoreCompetencyListCompetenciesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyListCompetenciesRequest {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<CoreCompetencyListCompetenciesRequestFiltersInner> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 0;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order = "";

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Integer skip = 0;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort = "";

  public CoreCompetencyListCompetenciesRequest() {
  }

  public CoreCompetencyListCompetenciesRequest filters(List<CoreCompetencyListCompetenciesRequestFiltersInner> filters) {
    this.filters = filters;
    return this;
  }

  public CoreCompetencyListCompetenciesRequest addFiltersItem(CoreCompetencyListCompetenciesRequestFiltersInner filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nonnull
  public List<CoreCompetencyListCompetenciesRequestFiltersInner> getFilters() {
    return filters;
  }

  public void setFilters(List<CoreCompetencyListCompetenciesRequestFiltersInner> filters) {
    this.filters = filters;
  }


  public CoreCompetencyListCompetenciesRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Return this number of records at most.
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public CoreCompetencyListCompetenciesRequest order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Sort direction. Should be either ASC or DESC
   * @return order
  **/
  @javax.annotation.Nullable
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }


  public CoreCompetencyListCompetenciesRequest skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Skip this number of records before returning results
   * @return skip
  **/
  @javax.annotation.Nullable
  public Integer getSkip() {
    return skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public CoreCompetencyListCompetenciesRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Column to sort by.
   * @return sort
  **/
  @javax.annotation.Nullable
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompetencyListCompetenciesRequest coreCompetencyListCompetenciesRequest = (CoreCompetencyListCompetenciesRequest) o;
    return Objects.equals(this.filters, coreCompetencyListCompetenciesRequest.filters) &&
        Objects.equals(this.limit, coreCompetencyListCompetenciesRequest.limit) &&
        Objects.equals(this.order, coreCompetencyListCompetenciesRequest.order) &&
        Objects.equals(this.skip, coreCompetencyListCompetenciesRequest.skip) &&
        Objects.equals(this.sort, coreCompetencyListCompetenciesRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, limit, order, skip, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyListCompetenciesRequest {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("limit");
    openapiFields.add("order");
    openapiFields.add("skip");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filters");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyListCompetenciesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyListCompetenciesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyListCompetenciesRequest is not found in the empty JSON string", CoreCompetencyListCompetenciesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyListCompetenciesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyListCompetenciesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyListCompetenciesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("filters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
      }

      JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
      // validate the required field `filters` (array)
      for (int i = 0; i < jsonArrayfilters.size(); i++) {
        CoreCompetencyListCompetenciesRequestFiltersInner.validateJsonElement(jsonArrayfilters.get(i));
      };
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      if ((jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) && !jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyListCompetenciesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyListCompetenciesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyListCompetenciesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyListCompetenciesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyListCompetenciesRequest>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyListCompetenciesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyListCompetenciesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyListCompetenciesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyListCompetenciesRequest
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyListCompetenciesRequest
  */
  public static CoreCompetencyListCompetenciesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyListCompetenciesRequest.class);
  }

 /**
  * Convert an instance of CoreCompetencyListCompetenciesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


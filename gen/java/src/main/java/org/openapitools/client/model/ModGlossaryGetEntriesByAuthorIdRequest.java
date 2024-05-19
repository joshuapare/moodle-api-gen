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
import org.openapitools.client.model.ModGlossaryGetEntriesByAuthorRequestOptions;

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
 * ModGlossaryGetEntriesByAuthorIdRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModGlossaryGetEntriesByAuthorIdRequest {
  public static final String SERIALIZED_NAME_AUTHORID = "authorid";
  @SerializedName(SERIALIZED_NAME_AUTHORID)
  private Integer authorid = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Integer from = 0;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 20;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ModGlossaryGetEntriesByAuthorRequestOptions options;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order = "CONCEPT";

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort = "ASC";

  public ModGlossaryGetEntriesByAuthorIdRequest() {
  }

  public ModGlossaryGetEntriesByAuthorIdRequest authorid(Integer authorid) {
    this.authorid = authorid;
    return this;
  }

   /**
   * The author ID
   * @return authorid
  **/
  @javax.annotation.Nonnull
  public Integer getAuthorid() {
    return authorid;
  }

  public void setAuthorid(Integer authorid) {
    this.authorid = authorid;
  }


  public ModGlossaryGetEntriesByAuthorIdRequest from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Start returning records from here
   * @return from
  **/
  @javax.annotation.Nullable
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }


  public ModGlossaryGetEntriesByAuthorIdRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Glossary entry ID
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModGlossaryGetEntriesByAuthorIdRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Number of records to return
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ModGlossaryGetEntriesByAuthorIdRequest options(ModGlossaryGetEntriesByAuthorRequestOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public ModGlossaryGetEntriesByAuthorRequestOptions getOptions() {
    return options;
  }

  public void setOptions(ModGlossaryGetEntriesByAuthorRequestOptions options) {
    this.options = options;
  }


  public ModGlossaryGetEntriesByAuthorIdRequest order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39;
   * @return order
  **/
  @javax.annotation.Nullable
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }


  public ModGlossaryGetEntriesByAuthorIdRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * The direction of the order: &#39;ASC&#39; or &#39;DESC&#39;
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
    ModGlossaryGetEntriesByAuthorIdRequest modGlossaryGetEntriesByAuthorIdRequest = (ModGlossaryGetEntriesByAuthorIdRequest) o;
    return Objects.equals(this.authorid, modGlossaryGetEntriesByAuthorIdRequest.authorid) &&
        Objects.equals(this.from, modGlossaryGetEntriesByAuthorIdRequest.from) &&
        Objects.equals(this.id, modGlossaryGetEntriesByAuthorIdRequest.id) &&
        Objects.equals(this.limit, modGlossaryGetEntriesByAuthorIdRequest.limit) &&
        Objects.equals(this.options, modGlossaryGetEntriesByAuthorIdRequest.options) &&
        Objects.equals(this.order, modGlossaryGetEntriesByAuthorIdRequest.order) &&
        Objects.equals(this.sort, modGlossaryGetEntriesByAuthorIdRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorid, from, id, limit, options, order, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModGlossaryGetEntriesByAuthorIdRequest {\n");
    sb.append("    authorid: ").append(toIndentedString(authorid)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("authorid");
    openapiFields.add("from");
    openapiFields.add("id");
    openapiFields.add("limit");
    openapiFields.add("options");
    openapiFields.add("order");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authorid");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModGlossaryGetEntriesByAuthorIdRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModGlossaryGetEntriesByAuthorIdRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModGlossaryGetEntriesByAuthorIdRequest is not found in the empty JSON string", ModGlossaryGetEntriesByAuthorIdRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModGlossaryGetEntriesByAuthorIdRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModGlossaryGetEntriesByAuthorIdRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModGlossaryGetEntriesByAuthorIdRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        ModGlossaryGetEntriesByAuthorRequestOptions.validateJsonElement(jsonObj.get("options"));
      }
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
       if (!ModGlossaryGetEntriesByAuthorIdRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModGlossaryGetEntriesByAuthorIdRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModGlossaryGetEntriesByAuthorIdRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModGlossaryGetEntriesByAuthorIdRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModGlossaryGetEntriesByAuthorIdRequest>() {
           @Override
           public void write(JsonWriter out, ModGlossaryGetEntriesByAuthorIdRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModGlossaryGetEntriesByAuthorIdRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModGlossaryGetEntriesByAuthorIdRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModGlossaryGetEntriesByAuthorIdRequest
  * @throws IOException if the JSON string is invalid with respect to ModGlossaryGetEntriesByAuthorIdRequest
  */
  public static ModGlossaryGetEntriesByAuthorIdRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModGlossaryGetEntriesByAuthorIdRequest.class);
  }

 /**
  * Convert an instance of ModGlossaryGetEntriesByAuthorIdRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * ModGlossaryGetEntriesToApproveRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModGlossaryGetEntriesToApproveRequest {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Integer from = 0;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LETTER = "letter";
  @SerializedName(SERIALIZED_NAME_LETTER)
  private String letter;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 20;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Object options;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order = "CONCEPT";

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort = "ASC";

  public ModGlossaryGetEntriesToApproveRequest() {
  }

  public ModGlossaryGetEntriesToApproveRequest from(Integer from) {
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


  public ModGlossaryGetEntriesToApproveRequest id(Integer id) {
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


  public ModGlossaryGetEntriesToApproveRequest letter(String letter) {
    this.letter = letter;
    return this;
  }

   /**
   * A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;.
   * @return letter
  **/
  @javax.annotation.Nonnull
  public String getLetter() {
    return letter;
  }

  public void setLetter(String letter) {
    this.letter = letter;
  }


  public ModGlossaryGetEntriesToApproveRequest limit(Integer limit) {
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


  public ModGlossaryGetEntriesToApproveRequest options(Object options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }


  public ModGlossaryGetEntriesToApproveRequest order(String order) {
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


  public ModGlossaryGetEntriesToApproveRequest sort(String sort) {
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
    ModGlossaryGetEntriesToApproveRequest modGlossaryGetEntriesToApproveRequest = (ModGlossaryGetEntriesToApproveRequest) o;
    return Objects.equals(this.from, modGlossaryGetEntriesToApproveRequest.from) &&
        Objects.equals(this.id, modGlossaryGetEntriesToApproveRequest.id) &&
        Objects.equals(this.letter, modGlossaryGetEntriesToApproveRequest.letter) &&
        Objects.equals(this.limit, modGlossaryGetEntriesToApproveRequest.limit) &&
        Objects.equals(this.options, modGlossaryGetEntriesToApproveRequest.options) &&
        Objects.equals(this.order, modGlossaryGetEntriesToApproveRequest.order) &&
        Objects.equals(this.sort, modGlossaryGetEntriesToApproveRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, id, letter, limit, options, order, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModGlossaryGetEntriesToApproveRequest {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    letter: ").append(toIndentedString(letter)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("id");
    openapiFields.add("letter");
    openapiFields.add("limit");
    openapiFields.add("options");
    openapiFields.add("order");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("letter");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModGlossaryGetEntriesToApproveRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModGlossaryGetEntriesToApproveRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModGlossaryGetEntriesToApproveRequest is not found in the empty JSON string", ModGlossaryGetEntriesToApproveRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModGlossaryGetEntriesToApproveRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModGlossaryGetEntriesToApproveRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModGlossaryGetEntriesToApproveRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("letter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `letter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("letter").toString()));
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
       if (!ModGlossaryGetEntriesToApproveRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModGlossaryGetEntriesToApproveRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModGlossaryGetEntriesToApproveRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModGlossaryGetEntriesToApproveRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModGlossaryGetEntriesToApproveRequest>() {
           @Override
           public void write(JsonWriter out, ModGlossaryGetEntriesToApproveRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModGlossaryGetEntriesToApproveRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModGlossaryGetEntriesToApproveRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModGlossaryGetEntriesToApproveRequest
  * @throws IOException if the JSON string is invalid with respect to ModGlossaryGetEntriesToApproveRequest
  */
  public static ModGlossaryGetEntriesToApproveRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModGlossaryGetEntriesToApproveRequest.class);
  }

 /**
  * Convert an instance of ModGlossaryGetEntriesToApproveRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

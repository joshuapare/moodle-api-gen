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
 * QbankColumnsortorderSetHiddenColumnsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class QbankColumnsortorderSetHiddenColumnsRequest {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<Object> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_GLOBAL = "global";
  @SerializedName(SERIALIZED_NAME_GLOBAL)
  private Boolean global = false;

  public QbankColumnsortorderSetHiddenColumnsRequest() {
  }

  public QbankColumnsortorderSetHiddenColumnsRequest columns(List<Object> columns) {
    this.columns = columns;
    return this;
  }

  public QbankColumnsortorderSetHiddenColumnsRequest addColumnsItem(Object columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  public List<Object> getColumns() {
    return columns;
  }

  public void setColumns(List<Object> columns) {
    this.columns = columns;
  }


  public QbankColumnsortorderSetHiddenColumnsRequest global(Boolean global) {
    this.global = global;
    return this;
  }

   /**
   * Set global config setting, rather than user preference
   * @return global
  **/
  @javax.annotation.Nullable
  public Boolean getGlobal() {
    return global;
  }

  public void setGlobal(Boolean global) {
    this.global = global;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest = (QbankColumnsortorderSetHiddenColumnsRequest) o;
    return Objects.equals(this.columns, qbankColumnsortorderSetHiddenColumnsRequest.columns) &&
        Objects.equals(this.global, qbankColumnsortorderSetHiddenColumnsRequest.global);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, global);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QbankColumnsortorderSetHiddenColumnsRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
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
    openapiFields.add("columns");
    openapiFields.add("global");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QbankColumnsortorderSetHiddenColumnsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QbankColumnsortorderSetHiddenColumnsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QbankColumnsortorderSetHiddenColumnsRequest is not found in the empty JSON string", QbankColumnsortorderSetHiddenColumnsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QbankColumnsortorderSetHiddenColumnsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QbankColumnsortorderSetHiddenColumnsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull() && !jsonObj.get("columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QbankColumnsortorderSetHiddenColumnsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QbankColumnsortorderSetHiddenColumnsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QbankColumnsortorderSetHiddenColumnsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QbankColumnsortorderSetHiddenColumnsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QbankColumnsortorderSetHiddenColumnsRequest>() {
           @Override
           public void write(JsonWriter out, QbankColumnsortorderSetHiddenColumnsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QbankColumnsortorderSetHiddenColumnsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QbankColumnsortorderSetHiddenColumnsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QbankColumnsortorderSetHiddenColumnsRequest
  * @throws IOException if the JSON string is invalid with respect to QbankColumnsortorderSetHiddenColumnsRequest
  */
  public static QbankColumnsortorderSetHiddenColumnsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QbankColumnsortorderSetHiddenColumnsRequest.class);
  }

 /**
  * Convert an instance of QbankColumnsortorderSetHiddenColumnsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

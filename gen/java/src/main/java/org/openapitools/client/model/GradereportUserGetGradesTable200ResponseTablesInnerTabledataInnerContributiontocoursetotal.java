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
 * GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private String headers;

  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal() {
  }

  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * class
   * @return propertyClass
  **/
  @javax.annotation.Nonnull
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal content(String content) {
    this.content = content;
    return this;
  }

   /**
   * cell content
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal headers(String headers) {
    this.headers = headers;
    return this;
  }

   /**
   * headers
   * @return headers
  **/
  @javax.annotation.Nonnull
  public String getHeaders() {
    return headers;
  }

  public void setHeaders(String headers) {
    this.headers = headers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal = (GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal) o;
    return Objects.equals(this.propertyClass, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.propertyClass) &&
        Objects.equals(this.content, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.content) &&
        Objects.equals(this.headers, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, content, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
    openapiFields.add("class");
    openapiFields.add("content");
    openapiFields.add("headers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("class");
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("headers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal is not found in the empty JSON string", GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class").toString()));
      }
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (!jsonObj.get("headers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.class));

       return (TypeAdapter<T>) new TypeAdapter<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal>() {
           @Override
           public void write(JsonWriter out, GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
  * @throws IOException if the JSON string is invalid with respect to GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
  */
  public static GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.class);
  }

 /**
  * Convert an instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


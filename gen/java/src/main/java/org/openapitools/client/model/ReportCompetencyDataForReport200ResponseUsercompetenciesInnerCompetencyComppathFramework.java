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
 * ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework {
  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Boolean first;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Boolean last;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework() {
  }

  public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework first(Boolean first) {
    this.first = first;
    return this;
  }

   /**
   * first
   * @return first
  **/
  @javax.annotation.Nonnull
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }


  public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework last(Boolean last) {
    this.last = last;
    return this;
  }

   /**
   * last
   * @return last
  **/
  @javax.annotation.Nonnull
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }


  public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * position
   * @return position
  **/
  @javax.annotation.Nonnull
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework = (ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework) o;
    return Objects.equals(this.first, reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.first) &&
        Objects.equals(this.id, reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.id) &&
        Objects.equals(this.last, reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.last) &&
        Objects.equals(this.name, reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.name) &&
        Objects.equals(this.position, reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, id, last, name, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
    openapiFields.add("first");
    openapiFields.add("id");
    openapiFields.add("last");
    openapiFields.add("name");
    openapiFields.add("position");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("first");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("last");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("position");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework is not found in the empty JSON string", ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework>() {
           @Override
           public void write(JsonWriter out, ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
  * @throws IOException if the JSON string is invalid with respect to ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework
  */
  public static ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.class);
  }

 /**
  * Convert an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


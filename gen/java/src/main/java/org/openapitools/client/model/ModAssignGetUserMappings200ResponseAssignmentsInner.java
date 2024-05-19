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
import org.openapitools.client.model.ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner;

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
 * ModAssignGetUserMappings200ResponseAssignmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetUserMappings200ResponseAssignmentsInner {
  public static final String SERIALIZED_NAME_ASSIGNMENTID = "assignmentid";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTID)
  private Integer assignmentid;

  public static final String SERIALIZED_NAME_MAPPINGS = "mappings";
  @SerializedName(SERIALIZED_NAME_MAPPINGS)
  private List<ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner> mappings = new ArrayList<>();

  public ModAssignGetUserMappings200ResponseAssignmentsInner() {
  }

  public ModAssignGetUserMappings200ResponseAssignmentsInner assignmentid(Integer assignmentid) {
    this.assignmentid = assignmentid;
    return this;
  }

   /**
   * assignment id
   * @return assignmentid
  **/
  @javax.annotation.Nullable
  public Integer getAssignmentid() {
    return assignmentid;
  }

  public void setAssignmentid(Integer assignmentid) {
    this.assignmentid = assignmentid;
  }


  public ModAssignGetUserMappings200ResponseAssignmentsInner mappings(List<ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner> mappings) {
    this.mappings = mappings;
    return this;
  }

  public ModAssignGetUserMappings200ResponseAssignmentsInner addMappingsItem(ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Get mappings
   * @return mappings
  **/
  @javax.annotation.Nullable
  public List<ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner> getMappings() {
    return mappings;
  }

  public void setMappings(List<ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner> mappings) {
    this.mappings = mappings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetUserMappings200ResponseAssignmentsInner modAssignGetUserMappings200ResponseAssignmentsInner = (ModAssignGetUserMappings200ResponseAssignmentsInner) o;
    return Objects.equals(this.assignmentid, modAssignGetUserMappings200ResponseAssignmentsInner.assignmentid) &&
        Objects.equals(this.mappings, modAssignGetUserMappings200ResponseAssignmentsInner.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentid, mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetUserMappings200ResponseAssignmentsInner {\n");
    sb.append("    assignmentid: ").append(toIndentedString(assignmentid)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
    openapiFields.add("assignmentid");
    openapiFields.add("mappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetUserMappings200ResponseAssignmentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetUserMappings200ResponseAssignmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetUserMappings200ResponseAssignmentsInner is not found in the empty JSON string", ModAssignGetUserMappings200ResponseAssignmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetUserMappings200ResponseAssignmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetUserMappings200ResponseAssignmentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("mappings") != null && !jsonObj.get("mappings").isJsonNull()) {
        JsonArray jsonArraymappings = jsonObj.getAsJsonArray("mappings");
        if (jsonArraymappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mappings` to be an array in the JSON string but got `%s`", jsonObj.get("mappings").toString()));
          }

          // validate the optional field `mappings` (array)
          for (int i = 0; i < jsonArraymappings.size(); i++) {
            ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner.validateJsonElement(jsonArraymappings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetUserMappings200ResponseAssignmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetUserMappings200ResponseAssignmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetUserMappings200ResponseAssignmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetUserMappings200ResponseAssignmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetUserMappings200ResponseAssignmentsInner>() {
           @Override
           public void write(JsonWriter out, ModAssignGetUserMappings200ResponseAssignmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetUserMappings200ResponseAssignmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetUserMappings200ResponseAssignmentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetUserMappings200ResponseAssignmentsInner
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetUserMappings200ResponseAssignmentsInner
  */
  public static ModAssignGetUserMappings200ResponseAssignmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetUserMappings200ResponseAssignmentsInner.class);
  }

 /**
  * Convert an instance of ModAssignGetUserMappings200ResponseAssignmentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * ModLtiGetToolTypesAndProxiesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiGetToolTypesAndProxiesRequest {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 60;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_ORPHANEDONLY = "orphanedonly";
  @SerializedName(SERIALIZED_NAME_ORPHANEDONLY)
  private Boolean orphanedonly = 0;

  public static final String SERIALIZED_NAME_TOOLPROXYID = "toolproxyid";
  @SerializedName(SERIALIZED_NAME_TOOLPROXYID)
  private Integer toolproxyid = 0;

  public ModLtiGetToolTypesAndProxiesRequest() {
  }

  public ModLtiGetToolTypesAndProxiesRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * How many tool types displayed per page
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ModLtiGetToolTypesAndProxiesRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Current offset of tool elements
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public ModLtiGetToolTypesAndProxiesRequest orphanedonly(Boolean orphanedonly) {
    this.orphanedonly = orphanedonly;
    return this;
  }

   /**
   * Orphaned tool types only
   * @return orphanedonly
  **/
  @javax.annotation.Nullable
  public Boolean getOrphanedonly() {
    return orphanedonly;
  }

  public void setOrphanedonly(Boolean orphanedonly) {
    this.orphanedonly = orphanedonly;
  }


  public ModLtiGetToolTypesAndProxiesRequest toolproxyid(Integer toolproxyid) {
    this.toolproxyid = toolproxyid;
    return this;
  }

   /**
   * Tool proxy id
   * @return toolproxyid
  **/
  @javax.annotation.Nullable
  public Integer getToolproxyid() {
    return toolproxyid;
  }

  public void setToolproxyid(Integer toolproxyid) {
    this.toolproxyid = toolproxyid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLtiGetToolTypesAndProxiesRequest modLtiGetToolTypesAndProxiesRequest = (ModLtiGetToolTypesAndProxiesRequest) o;
    return Objects.equals(this.limit, modLtiGetToolTypesAndProxiesRequest.limit) &&
        Objects.equals(this.offset, modLtiGetToolTypesAndProxiesRequest.offset) &&
        Objects.equals(this.orphanedonly, modLtiGetToolTypesAndProxiesRequest.orphanedonly) &&
        Objects.equals(this.toolproxyid, modLtiGetToolTypesAndProxiesRequest.toolproxyid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, orphanedonly, toolproxyid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiGetToolTypesAndProxiesRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orphanedonly: ").append(toIndentedString(orphanedonly)).append("\n");
    sb.append("    toolproxyid: ").append(toIndentedString(toolproxyid)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("orphanedonly");
    openapiFields.add("toolproxyid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiGetToolTypesAndProxiesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiGetToolTypesAndProxiesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiGetToolTypesAndProxiesRequest is not found in the empty JSON string", ModLtiGetToolTypesAndProxiesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiGetToolTypesAndProxiesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiGetToolTypesAndProxiesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiGetToolTypesAndProxiesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiGetToolTypesAndProxiesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiGetToolTypesAndProxiesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiGetToolTypesAndProxiesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiGetToolTypesAndProxiesRequest>() {
           @Override
           public void write(JsonWriter out, ModLtiGetToolTypesAndProxiesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiGetToolTypesAndProxiesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiGetToolTypesAndProxiesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiGetToolTypesAndProxiesRequest
  * @throws IOException if the JSON string is invalid with respect to ModLtiGetToolTypesAndProxiesRequest
  */
  public static ModLtiGetToolTypesAndProxiesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiGetToolTypesAndProxiesRequest.class);
  }

 /**
  * Convert an instance of ModLtiGetToolTypesAndProxiesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * ModBigbluebuttonbnGetRecordingsToImportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModBigbluebuttonbnGetRecordingsToImportRequest {
  public static final String SERIALIZED_NAME_DESTINATIONINSTANCEID = "destinationinstanceid";
  @SerializedName(SERIALIZED_NAME_DESTINATIONINSTANCEID)
  private Integer destinationinstanceid = null;

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid;

  public static final String SERIALIZED_NAME_SOURCEBIGBLUEBUTTONBNID = "sourcebigbluebuttonbnid";
  @SerializedName(SERIALIZED_NAME_SOURCEBIGBLUEBUTTONBNID)
  private Integer sourcebigbluebuttonbnid = 0;

  public static final String SERIALIZED_NAME_SOURCECOURSEID = "sourcecourseid";
  @SerializedName(SERIALIZED_NAME_SOURCECOURSEID)
  private Integer sourcecourseid = 0;

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private String tools = "protect,unprotect,publish,unpublish,delete";

  public ModBigbluebuttonbnGetRecordingsToImportRequest() {
  }

  public ModBigbluebuttonbnGetRecordingsToImportRequest destinationinstanceid(Integer destinationinstanceid) {
    this.destinationinstanceid = destinationinstanceid;
    return this;
  }

   /**
   * Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings.
   * @return destinationinstanceid
  **/
  @javax.annotation.Nonnull
  public Integer getDestinationinstanceid() {
    return destinationinstanceid;
  }

  public void setDestinationinstanceid(Integer destinationinstanceid) {
    this.destinationinstanceid = destinationinstanceid;
  }


  public ModBigbluebuttonbnGetRecordingsToImportRequest groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * Group ID
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public ModBigbluebuttonbnGetRecordingsToImportRequest sourcebigbluebuttonbnid(Integer sourcebigbluebuttonbnid) {
    this.sourcebigbluebuttonbnid = sourcebigbluebuttonbnid;
    return this;
  }

   /**
   * bigbluebuttonbn instance id
   * @return sourcebigbluebuttonbnid
  **/
  @javax.annotation.Nullable
  public Integer getSourcebigbluebuttonbnid() {
    return sourcebigbluebuttonbnid;
  }

  public void setSourcebigbluebuttonbnid(Integer sourcebigbluebuttonbnid) {
    this.sourcebigbluebuttonbnid = sourcebigbluebuttonbnid;
  }


  public ModBigbluebuttonbnGetRecordingsToImportRequest sourcecourseid(Integer sourcecourseid) {
    this.sourcecourseid = sourcecourseid;
    return this;
  }

   /**
   * source courseid to filter by
   * @return sourcecourseid
  **/
  @javax.annotation.Nullable
  public Integer getSourcecourseid() {
    return sourcecourseid;
  }

  public void setSourcecourseid(Integer sourcecourseid) {
    this.sourcecourseid = sourcecourseid;
  }


  public ModBigbluebuttonbnGetRecordingsToImportRequest tools(String tools) {
    this.tools = tools;
    return this;
  }

   /**
   * a set of enabled tools
   * @return tools
  **/
  @javax.annotation.Nullable
  public String getTools() {
    return tools;
  }

  public void setTools(String tools) {
    this.tools = tools;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModBigbluebuttonbnGetRecordingsToImportRequest modBigbluebuttonbnGetRecordingsToImportRequest = (ModBigbluebuttonbnGetRecordingsToImportRequest) o;
    return Objects.equals(this.destinationinstanceid, modBigbluebuttonbnGetRecordingsToImportRequest.destinationinstanceid) &&
        Objects.equals(this.groupid, modBigbluebuttonbnGetRecordingsToImportRequest.groupid) &&
        Objects.equals(this.sourcebigbluebuttonbnid, modBigbluebuttonbnGetRecordingsToImportRequest.sourcebigbluebuttonbnid) &&
        Objects.equals(this.sourcecourseid, modBigbluebuttonbnGetRecordingsToImportRequest.sourcecourseid) &&
        Objects.equals(this.tools, modBigbluebuttonbnGetRecordingsToImportRequest.tools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationinstanceid, groupid, sourcebigbluebuttonbnid, sourcecourseid, tools);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModBigbluebuttonbnGetRecordingsToImportRequest {\n");
    sb.append("    destinationinstanceid: ").append(toIndentedString(destinationinstanceid)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    sourcebigbluebuttonbnid: ").append(toIndentedString(sourcebigbluebuttonbnid)).append("\n");
    sb.append("    sourcecourseid: ").append(toIndentedString(sourcecourseid)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
    openapiFields.add("destinationinstanceid");
    openapiFields.add("groupid");
    openapiFields.add("sourcebigbluebuttonbnid");
    openapiFields.add("sourcecourseid");
    openapiFields.add("tools");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destinationinstanceid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModBigbluebuttonbnGetRecordingsToImportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModBigbluebuttonbnGetRecordingsToImportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModBigbluebuttonbnGetRecordingsToImportRequest is not found in the empty JSON string", ModBigbluebuttonbnGetRecordingsToImportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModBigbluebuttonbnGetRecordingsToImportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModBigbluebuttonbnGetRecordingsToImportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModBigbluebuttonbnGetRecordingsToImportRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tools") != null && !jsonObj.get("tools").isJsonNull()) && !jsonObj.get("tools").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tools` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tools").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModBigbluebuttonbnGetRecordingsToImportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModBigbluebuttonbnGetRecordingsToImportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModBigbluebuttonbnGetRecordingsToImportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModBigbluebuttonbnGetRecordingsToImportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModBigbluebuttonbnGetRecordingsToImportRequest>() {
           @Override
           public void write(JsonWriter out, ModBigbluebuttonbnGetRecordingsToImportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModBigbluebuttonbnGetRecordingsToImportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModBigbluebuttonbnGetRecordingsToImportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModBigbluebuttonbnGetRecordingsToImportRequest
  * @throws IOException if the JSON string is invalid with respect to ModBigbluebuttonbnGetRecordingsToImportRequest
  */
  public static ModBigbluebuttonbnGetRecordingsToImportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModBigbluebuttonbnGetRecordingsToImportRequest.class);
  }

 /**
  * Convert an instance of ModBigbluebuttonbnGetRecordingsToImportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * CoreGradingGetDefinitionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradingGetDefinitionsRequest {
  public static final String SERIALIZED_NAME_ACTIVEONLY = "activeonly";
  @SerializedName(SERIALIZED_NAME_ACTIVEONLY)
  private Boolean activeonly = 0;

  public static final String SERIALIZED_NAME_AREANAME = "areaname";
  @SerializedName(SERIALIZED_NAME_AREANAME)
  private String areaname = "null";

  public static final String SERIALIZED_NAME_CMIDS = "cmids";
  @SerializedName(SERIALIZED_NAME_CMIDS)
  private List<Object> cmids = new ArrayList<>();

  public CoreGradingGetDefinitionsRequest() {
  }

  public CoreGradingGetDefinitionsRequest activeonly(Boolean activeonly) {
    this.activeonly = activeonly;
    return this;
  }

   /**
   * Only the active method
   * @return activeonly
  **/
  @javax.annotation.Nullable
  public Boolean getActiveonly() {
    return activeonly;
  }

  public void setActiveonly(Boolean activeonly) {
    this.activeonly = activeonly;
  }


  public CoreGradingGetDefinitionsRequest areaname(String areaname) {
    this.areaname = areaname;
    return this;
  }

   /**
   * area name
   * @return areaname
  **/
  @javax.annotation.Nonnull
  public String getAreaname() {
    return areaname;
  }

  public void setAreaname(String areaname) {
    this.areaname = areaname;
  }


  public CoreGradingGetDefinitionsRequest cmids(List<Object> cmids) {
    this.cmids = cmids;
    return this;
  }

  public CoreGradingGetDefinitionsRequest addCmidsItem(Object cmidsItem) {
    if (this.cmids == null) {
      this.cmids = new ArrayList<>();
    }
    this.cmids.add(cmidsItem);
    return this;
  }

   /**
   * Get cmids
   * @return cmids
  **/
  @javax.annotation.Nonnull
  public List<Object> getCmids() {
    return cmids;
  }

  public void setCmids(List<Object> cmids) {
    this.cmids = cmids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradingGetDefinitionsRequest coreGradingGetDefinitionsRequest = (CoreGradingGetDefinitionsRequest) o;
    return Objects.equals(this.activeonly, coreGradingGetDefinitionsRequest.activeonly) &&
        Objects.equals(this.areaname, coreGradingGetDefinitionsRequest.areaname) &&
        Objects.equals(this.cmids, coreGradingGetDefinitionsRequest.cmids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeonly, areaname, cmids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradingGetDefinitionsRequest {\n");
    sb.append("    activeonly: ").append(toIndentedString(activeonly)).append("\n");
    sb.append("    areaname: ").append(toIndentedString(areaname)).append("\n");
    sb.append("    cmids: ").append(toIndentedString(cmids)).append("\n");
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
    openapiFields.add("activeonly");
    openapiFields.add("areaname");
    openapiFields.add("cmids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("areaname");
    openapiRequiredFields.add("cmids");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradingGetDefinitionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradingGetDefinitionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradingGetDefinitionsRequest is not found in the empty JSON string", CoreGradingGetDefinitionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradingGetDefinitionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradingGetDefinitionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGradingGetDefinitionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("areaname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `areaname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("areaname").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("cmids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("cmids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmids` to be an array in the JSON string but got `%s`", jsonObj.get("cmids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradingGetDefinitionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradingGetDefinitionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradingGetDefinitionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradingGetDefinitionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradingGetDefinitionsRequest>() {
           @Override
           public void write(JsonWriter out, CoreGradingGetDefinitionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradingGetDefinitionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradingGetDefinitionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradingGetDefinitionsRequest
  * @throws IOException if the JSON string is invalid with respect to CoreGradingGetDefinitionsRequest
  */
  public static CoreGradingGetDefinitionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradingGetDefinitionsRequest.class);
  }

 /**
  * Convert an instance of CoreGradingGetDefinitionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


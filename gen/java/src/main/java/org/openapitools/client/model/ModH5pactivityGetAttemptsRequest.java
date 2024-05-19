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
 * ModH5pactivityGetAttemptsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModH5pactivityGetAttemptsRequest {
  public static final String SERIALIZED_NAME_H5PACTIVITYID = "h5pactivityid";
  @SerializedName(SERIALIZED_NAME_H5PACTIVITYID)
  private Integer h5pactivityid = null;

  public static final String SERIALIZED_NAME_USERIDS = "userids";
  @SerializedName(SERIALIZED_NAME_USERIDS)
  private List<Object> userids = new ArrayList<>();

  public ModH5pactivityGetAttemptsRequest() {
  }

  public ModH5pactivityGetAttemptsRequest h5pactivityid(Integer h5pactivityid) {
    this.h5pactivityid = h5pactivityid;
    return this;
  }

   /**
   * h5p activity instance id
   * @return h5pactivityid
  **/
  @javax.annotation.Nonnull
  public Integer getH5pactivityid() {
    return h5pactivityid;
  }

  public void setH5pactivityid(Integer h5pactivityid) {
    this.h5pactivityid = h5pactivityid;
  }


  public ModH5pactivityGetAttemptsRequest userids(List<Object> userids) {
    this.userids = userids;
    return this;
  }

  public ModH5pactivityGetAttemptsRequest addUseridsItem(Object useridsItem) {
    if (this.userids == null) {
      this.userids = new ArrayList<>();
    }
    this.userids.add(useridsItem);
    return this;
  }

   /**
   * Get userids
   * @return userids
  **/
  @javax.annotation.Nullable
  public List<Object> getUserids() {
    return userids;
  }

  public void setUserids(List<Object> userids) {
    this.userids = userids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModH5pactivityGetAttemptsRequest modH5pactivityGetAttemptsRequest = (ModH5pactivityGetAttemptsRequest) o;
    return Objects.equals(this.h5pactivityid, modH5pactivityGetAttemptsRequest.h5pactivityid) &&
        Objects.equals(this.userids, modH5pactivityGetAttemptsRequest.userids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(h5pactivityid, userids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModH5pactivityGetAttemptsRequest {\n");
    sb.append("    h5pactivityid: ").append(toIndentedString(h5pactivityid)).append("\n");
    sb.append("    userids: ").append(toIndentedString(userids)).append("\n");
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
    openapiFields.add("h5pactivityid");
    openapiFields.add("userids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("h5pactivityid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModH5pactivityGetAttemptsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModH5pactivityGetAttemptsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModH5pactivityGetAttemptsRequest is not found in the empty JSON string", ModH5pactivityGetAttemptsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModH5pactivityGetAttemptsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModH5pactivityGetAttemptsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModH5pactivityGetAttemptsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("userids") != null && !jsonObj.get("userids").isJsonNull() && !jsonObj.get("userids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userids` to be an array in the JSON string but got `%s`", jsonObj.get("userids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModH5pactivityGetAttemptsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModH5pactivityGetAttemptsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModH5pactivityGetAttemptsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModH5pactivityGetAttemptsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModH5pactivityGetAttemptsRequest>() {
           @Override
           public void write(JsonWriter out, ModH5pactivityGetAttemptsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModH5pactivityGetAttemptsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModH5pactivityGetAttemptsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModH5pactivityGetAttemptsRequest
  * @throws IOException if the JSON string is invalid with respect to ModH5pactivityGetAttemptsRequest
  */
  public static ModH5pactivityGetAttemptsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModH5pactivityGetAttemptsRequest.class);
  }

 /**
  * Convert an instance of ModH5pactivityGetAttemptsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


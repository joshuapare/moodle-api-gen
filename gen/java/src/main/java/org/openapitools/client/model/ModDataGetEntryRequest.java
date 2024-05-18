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
 * ModDataGetEntryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataGetEntryRequest {
  public static final String SERIALIZED_NAME_ENTRYID = "entryid";
  @SerializedName(SERIALIZED_NAME_ENTRYID)
  private Integer entryid = null;

  public static final String SERIALIZED_NAME_RETURNCONTENTS = "returncontents";
  @SerializedName(SERIALIZED_NAME_RETURNCONTENTS)
  private Boolean returncontents = false;

  public ModDataGetEntryRequest() {
  }

  public ModDataGetEntryRequest entryid(Integer entryid) {
    this.entryid = entryid;
    return this;
  }

   /**
   * record entry id
   * @return entryid
  **/
  @javax.annotation.Nonnull
  public Integer getEntryid() {
    return entryid;
  }

  public void setEntryid(Integer entryid) {
    this.entryid = entryid;
  }


  public ModDataGetEntryRequest returncontents(Boolean returncontents) {
    this.returncontents = returncontents;
    return this;
  }

   /**
   * Whether to return contents or not.
   * @return returncontents
  **/
  @javax.annotation.Nullable
  public Boolean getReturncontents() {
    return returncontents;
  }

  public void setReturncontents(Boolean returncontents) {
    this.returncontents = returncontents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataGetEntryRequest modDataGetEntryRequest = (ModDataGetEntryRequest) o;
    return Objects.equals(this.entryid, modDataGetEntryRequest.entryid) &&
        Objects.equals(this.returncontents, modDataGetEntryRequest.returncontents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryid, returncontents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataGetEntryRequest {\n");
    sb.append("    entryid: ").append(toIndentedString(entryid)).append("\n");
    sb.append("    returncontents: ").append(toIndentedString(returncontents)).append("\n");
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
    openapiFields.add("entryid");
    openapiFields.add("returncontents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entryid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataGetEntryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataGetEntryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataGetEntryRequest is not found in the empty JSON string", ModDataGetEntryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataGetEntryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataGetEntryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModDataGetEntryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataGetEntryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataGetEntryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataGetEntryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataGetEntryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataGetEntryRequest>() {
           @Override
           public void write(JsonWriter out, ModDataGetEntryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataGetEntryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataGetEntryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataGetEntryRequest
  * @throws IOException if the JSON string is invalid with respect to ModDataGetEntryRequest
  */
  public static ModDataGetEntryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataGetEntryRequest.class);
  }

 /**
  * Convert an instance of ModDataGetEntryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

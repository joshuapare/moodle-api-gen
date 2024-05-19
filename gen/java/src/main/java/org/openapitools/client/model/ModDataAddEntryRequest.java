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
import org.openapitools.client.model.ModDataAddEntryRequestDataInner;

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
 * ModDataAddEntryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataAddEntryRequest {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ModDataAddEntryRequestDataInner> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATABASEID = "databaseid";
  @SerializedName(SERIALIZED_NAME_DATABASEID)
  private Integer databaseid = null;

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid = 0;

  public ModDataAddEntryRequest() {
  }

  public ModDataAddEntryRequest data(List<ModDataAddEntryRequestDataInner> data) {
    this.data = data;
    return this;
  }

  public ModDataAddEntryRequest addDataItem(ModDataAddEntryRequestDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<ModDataAddEntryRequestDataInner> getData() {
    return data;
  }

  public void setData(List<ModDataAddEntryRequestDataInner> data) {
    this.data = data;
  }


  public ModDataAddEntryRequest databaseid(Integer databaseid) {
    this.databaseid = databaseid;
    return this;
  }

   /**
   * data instance id
   * @return databaseid
  **/
  @javax.annotation.Nonnull
  public Integer getDatabaseid() {
    return databaseid;
  }

  public void setDatabaseid(Integer databaseid) {
    this.databaseid = databaseid;
  }


  public ModDataAddEntryRequest groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * Group id, 0 means that the function will determine the user group
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataAddEntryRequest modDataAddEntryRequest = (ModDataAddEntryRequest) o;
    return Objects.equals(this.data, modDataAddEntryRequest.data) &&
        Objects.equals(this.databaseid, modDataAddEntryRequest.databaseid) &&
        Objects.equals(this.groupid, modDataAddEntryRequest.groupid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, databaseid, groupid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataAddEntryRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    databaseid: ").append(toIndentedString(databaseid)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("databaseid");
    openapiFields.add("groupid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("databaseid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataAddEntryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataAddEntryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataAddEntryRequest is not found in the empty JSON string", ModDataAddEntryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataAddEntryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataAddEntryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModDataAddEntryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        ModDataAddEntryRequestDataInner.validateJsonElement(jsonArraydata.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataAddEntryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataAddEntryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataAddEntryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataAddEntryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataAddEntryRequest>() {
           @Override
           public void write(JsonWriter out, ModDataAddEntryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataAddEntryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataAddEntryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataAddEntryRequest
  * @throws IOException if the JSON string is invalid with respect to ModDataAddEntryRequest
  */
  public static ModDataAddEntryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataAddEntryRequest.class);
  }

 /**
  * Convert an instance of ModDataAddEntryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


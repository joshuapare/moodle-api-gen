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
 * ModDataAddEntryRequestDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataAddEntryRequestDataInner {
  public static final String SERIALIZED_NAME_FIELDID = "fieldid";
  @SerializedName(SERIALIZED_NAME_FIELDID)
  private Integer fieldid = null;

  public static final String SERIALIZED_NAME_SUBFIELD = "subfield";
  @SerializedName(SERIALIZED_NAME_SUBFIELD)
  private String subfield = "";

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = "null";

  public ModDataAddEntryRequestDataInner() {
  }

  public ModDataAddEntryRequestDataInner fieldid(Integer fieldid) {
    this.fieldid = fieldid;
    return this;
  }

   /**
   * The field id.
   * @return fieldid
  **/
  @javax.annotation.Nullable
  public Integer getFieldid() {
    return fieldid;
  }

  public void setFieldid(Integer fieldid) {
    this.fieldid = fieldid;
  }


  public ModDataAddEntryRequestDataInner subfield(String subfield) {
    this.subfield = subfield;
    return this;
  }

   /**
   * The subfield name (if required).
   * @return subfield
  **/
  @javax.annotation.Nullable
  public String getSubfield() {
    return subfield;
  }

  public void setSubfield(String subfield) {
    this.subfield = subfield;
  }


  public ModDataAddEntryRequestDataInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The contents for the field always JSON encoded.
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataAddEntryRequestDataInner modDataAddEntryRequestDataInner = (ModDataAddEntryRequestDataInner) o;
    return Objects.equals(this.fieldid, modDataAddEntryRequestDataInner.fieldid) &&
        Objects.equals(this.subfield, modDataAddEntryRequestDataInner.subfield) &&
        Objects.equals(this.value, modDataAddEntryRequestDataInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldid, subfield, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataAddEntryRequestDataInner {\n");
    sb.append("    fieldid: ").append(toIndentedString(fieldid)).append("\n");
    sb.append("    subfield: ").append(toIndentedString(subfield)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("fieldid");
    openapiFields.add("subfield");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataAddEntryRequestDataInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataAddEntryRequestDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataAddEntryRequestDataInner is not found in the empty JSON string", ModDataAddEntryRequestDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataAddEntryRequestDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataAddEntryRequestDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subfield") != null && !jsonObj.get("subfield").isJsonNull()) && !jsonObj.get("subfield").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subfield` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subfield").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataAddEntryRequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataAddEntryRequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataAddEntryRequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataAddEntryRequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataAddEntryRequestDataInner>() {
           @Override
           public void write(JsonWriter out, ModDataAddEntryRequestDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataAddEntryRequestDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataAddEntryRequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataAddEntryRequestDataInner
  * @throws IOException if the JSON string is invalid with respect to ModDataAddEntryRequestDataInner
  */
  public static ModDataAddEntryRequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataAddEntryRequestDataInner.class);
  }

 /**
  * Convert an instance of ModDataAddEntryRequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

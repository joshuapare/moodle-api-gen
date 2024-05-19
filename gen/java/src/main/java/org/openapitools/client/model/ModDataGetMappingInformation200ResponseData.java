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
 * ModDataGetMappingInformation200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataGetMappingInformation200ResponseData {
  public static final String SERIALIZED_NAME_FIELDSTOCREATE = "fieldstocreate";
  @SerializedName(SERIALIZED_NAME_FIELDSTOCREATE)
  private String fieldstocreate = "null";

  public static final String SERIALIZED_NAME_FIELDSTOREMOVE = "fieldstoremove";
  @SerializedName(SERIALIZED_NAME_FIELDSTOREMOVE)
  private String fieldstoremove = "null";

  public static final String SERIALIZED_NAME_NEEDSMAPPING = "needsmapping";
  @SerializedName(SERIALIZED_NAME_NEEDSMAPPING)
  private Boolean needsmapping = null;

  public static final String SERIALIZED_NAME_PRESETNAME = "presetname";
  @SerializedName(SERIALIZED_NAME_PRESETNAME)
  private String presetname = "null";

  public ModDataGetMappingInformation200ResponseData() {
  }

  public ModDataGetMappingInformation200ResponseData fieldstocreate(String fieldstocreate) {
    this.fieldstocreate = fieldstocreate;
    return this;
  }

   /**
   * List of field names to create
   * @return fieldstocreate
  **/
  @javax.annotation.Nonnull
  public String getFieldstocreate() {
    return fieldstocreate;
  }

  public void setFieldstocreate(String fieldstocreate) {
    this.fieldstocreate = fieldstocreate;
  }


  public ModDataGetMappingInformation200ResponseData fieldstoremove(String fieldstoremove) {
    this.fieldstoremove = fieldstoremove;
    return this;
  }

   /**
   * List of field names to remove
   * @return fieldstoremove
  **/
  @javax.annotation.Nonnull
  public String getFieldstoremove() {
    return fieldstoremove;
  }

  public void setFieldstoremove(String fieldstoremove) {
    this.fieldstoremove = fieldstoremove;
  }


  public ModDataGetMappingInformation200ResponseData needsmapping(Boolean needsmapping) {
    this.needsmapping = needsmapping;
    return this;
  }

   /**
   * Whether the importing needs mapping or not
   * @return needsmapping
  **/
  @javax.annotation.Nonnull
  public Boolean getNeedsmapping() {
    return needsmapping;
  }

  public void setNeedsmapping(Boolean needsmapping) {
    this.needsmapping = needsmapping;
  }


  public ModDataGetMappingInformation200ResponseData presetname(String presetname) {
    this.presetname = presetname;
    return this;
  }

   /**
   * Name of the applied preset
   * @return presetname
  **/
  @javax.annotation.Nonnull
  public String getPresetname() {
    return presetname;
  }

  public void setPresetname(String presetname) {
    this.presetname = presetname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataGetMappingInformation200ResponseData modDataGetMappingInformation200ResponseData = (ModDataGetMappingInformation200ResponseData) o;
    return Objects.equals(this.fieldstocreate, modDataGetMappingInformation200ResponseData.fieldstocreate) &&
        Objects.equals(this.fieldstoremove, modDataGetMappingInformation200ResponseData.fieldstoremove) &&
        Objects.equals(this.needsmapping, modDataGetMappingInformation200ResponseData.needsmapping) &&
        Objects.equals(this.presetname, modDataGetMappingInformation200ResponseData.presetname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldstocreate, fieldstoremove, needsmapping, presetname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataGetMappingInformation200ResponseData {\n");
    sb.append("    fieldstocreate: ").append(toIndentedString(fieldstocreate)).append("\n");
    sb.append("    fieldstoremove: ").append(toIndentedString(fieldstoremove)).append("\n");
    sb.append("    needsmapping: ").append(toIndentedString(needsmapping)).append("\n");
    sb.append("    presetname: ").append(toIndentedString(presetname)).append("\n");
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
    openapiFields.add("fieldstocreate");
    openapiFields.add("fieldstoremove");
    openapiFields.add("needsmapping");
    openapiFields.add("presetname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldstocreate");
    openapiRequiredFields.add("fieldstoremove");
    openapiRequiredFields.add("needsmapping");
    openapiRequiredFields.add("presetname");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataGetMappingInformation200ResponseData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataGetMappingInformation200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataGetMappingInformation200ResponseData is not found in the empty JSON string", ModDataGetMappingInformation200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataGetMappingInformation200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataGetMappingInformation200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModDataGetMappingInformation200ResponseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fieldstocreate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldstocreate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldstocreate").toString()));
      }
      if (!jsonObj.get("fieldstoremove").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldstoremove` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldstoremove").toString()));
      }
      if (!jsonObj.get("presetname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `presetname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("presetname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataGetMappingInformation200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataGetMappingInformation200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataGetMappingInformation200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataGetMappingInformation200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataGetMappingInformation200ResponseData>() {
           @Override
           public void write(JsonWriter out, ModDataGetMappingInformation200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataGetMappingInformation200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataGetMappingInformation200ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataGetMappingInformation200ResponseData
  * @throws IOException if the JSON string is invalid with respect to ModDataGetMappingInformation200ResponseData
  */
  public static ModDataGetMappingInformation200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataGetMappingInformation200ResponseData.class);
  }

 /**
  * Convert an instance of ModDataGetMappingInformation200ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


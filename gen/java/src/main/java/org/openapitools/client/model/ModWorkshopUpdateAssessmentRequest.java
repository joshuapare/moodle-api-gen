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
import org.openapitools.client.model.ModWorkshopUpdateAssessmentRequestDataInner;

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
 * ModWorkshopUpdateAssessmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWorkshopUpdateAssessmentRequest {
  public static final String SERIALIZED_NAME_ASSESSMENTID = "assessmentid";
  @SerializedName(SERIALIZED_NAME_ASSESSMENTID)
  private Integer assessmentid;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ModWorkshopUpdateAssessmentRequestDataInner> data = new ArrayList<>();

  public ModWorkshopUpdateAssessmentRequest() {
  }

  public ModWorkshopUpdateAssessmentRequest assessmentid(Integer assessmentid) {
    this.assessmentid = assessmentid;
    return this;
  }

   /**
   * Assessment id.
   * @return assessmentid
  **/
  @javax.annotation.Nonnull
  public Integer getAssessmentid() {
    return assessmentid;
  }

  public void setAssessmentid(Integer assessmentid) {
    this.assessmentid = assessmentid;
  }


  public ModWorkshopUpdateAssessmentRequest data(List<ModWorkshopUpdateAssessmentRequestDataInner> data) {
    this.data = data;
    return this;
  }

  public ModWorkshopUpdateAssessmentRequest addDataItem(ModWorkshopUpdateAssessmentRequestDataInner dataItem) {
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
  public List<ModWorkshopUpdateAssessmentRequestDataInner> getData() {
    return data;
  }

  public void setData(List<ModWorkshopUpdateAssessmentRequestDataInner> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModWorkshopUpdateAssessmentRequest modWorkshopUpdateAssessmentRequest = (ModWorkshopUpdateAssessmentRequest) o;
    return Objects.equals(this.assessmentid, modWorkshopUpdateAssessmentRequest.assessmentid) &&
        Objects.equals(this.data, modWorkshopUpdateAssessmentRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentid, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWorkshopUpdateAssessmentRequest {\n");
    sb.append("    assessmentid: ").append(toIndentedString(assessmentid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("assessmentid");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assessmentid");
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWorkshopUpdateAssessmentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWorkshopUpdateAssessmentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWorkshopUpdateAssessmentRequest is not found in the empty JSON string", ModWorkshopUpdateAssessmentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWorkshopUpdateAssessmentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWorkshopUpdateAssessmentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModWorkshopUpdateAssessmentRequest.openapiRequiredFields) {
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
        ModWorkshopUpdateAssessmentRequestDataInner.validateJsonElement(jsonArraydata.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModWorkshopUpdateAssessmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWorkshopUpdateAssessmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWorkshopUpdateAssessmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWorkshopUpdateAssessmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWorkshopUpdateAssessmentRequest>() {
           @Override
           public void write(JsonWriter out, ModWorkshopUpdateAssessmentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWorkshopUpdateAssessmentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWorkshopUpdateAssessmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWorkshopUpdateAssessmentRequest
  * @throws IOException if the JSON string is invalid with respect to ModWorkshopUpdateAssessmentRequest
  */
  public static ModWorkshopUpdateAssessmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWorkshopUpdateAssessmentRequest.class);
  }

 /**
  * Convert an instance of ModWorkshopUpdateAssessmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


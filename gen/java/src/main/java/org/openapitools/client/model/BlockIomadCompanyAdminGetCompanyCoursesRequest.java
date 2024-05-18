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
import org.openapitools.client.model.BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner;

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
 * BlockIomadCompanyAdminGetCompanyCoursesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminGetCompanyCoursesRequest {
  public static final String SERIALIZED_NAME_CRITERIA = "criteria";
  @SerializedName(SERIALIZED_NAME_CRITERIA)
  private List<BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner> criteria = new ArrayList<>();

  public BlockIomadCompanyAdminGetCompanyCoursesRequest() {
  }

  public BlockIomadCompanyAdminGetCompanyCoursesRequest criteria(List<BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner> criteria) {
    this.criteria = criteria;
    return this;
  }

  public BlockIomadCompanyAdminGetCompanyCoursesRequest addCriteriaItem(BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @javax.annotation.Nonnull
  public List<BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner> criteria) {
    this.criteria = criteria;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminGetCompanyCoursesRequest blockIomadCompanyAdminGetCompanyCoursesRequest = (BlockIomadCompanyAdminGetCompanyCoursesRequest) o;
    return Objects.equals(this.criteria, blockIomadCompanyAdminGetCompanyCoursesRequest.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminGetCompanyCoursesRequest {\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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
    openapiFields.add("criteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("criteria");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminGetCompanyCoursesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminGetCompanyCoursesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminGetCompanyCoursesRequest is not found in the empty JSON string", BlockIomadCompanyAdminGetCompanyCoursesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminGetCompanyCoursesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminGetCompanyCoursesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlockIomadCompanyAdminGetCompanyCoursesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("criteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `criteria` to be an array in the JSON string but got `%s`", jsonObj.get("criteria").toString()));
      }

      JsonArray jsonArraycriteria = jsonObj.getAsJsonArray("criteria");
      // validate the required field `criteria` (array)
      for (int i = 0; i < jsonArraycriteria.size(); i++) {
        BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner.validateJsonElement(jsonArraycriteria.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminGetCompanyCoursesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminGetCompanyCoursesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminGetCompanyCoursesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminGetCompanyCoursesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminGetCompanyCoursesRequest>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminGetCompanyCoursesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminGetCompanyCoursesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminGetCompanyCoursesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminGetCompanyCoursesRequest
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminGetCompanyCoursesRequest
  */
  public static BlockIomadCompanyAdminGetCompanyCoursesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminGetCompanyCoursesRequest.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminGetCompanyCoursesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

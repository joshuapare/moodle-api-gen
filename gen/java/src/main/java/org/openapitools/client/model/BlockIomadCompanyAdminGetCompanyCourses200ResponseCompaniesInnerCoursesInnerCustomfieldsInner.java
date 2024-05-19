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
 * BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = "null";

  public BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner() {
  }

  public BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Custom field id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Custom field name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Custom field data value
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
    BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner blockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner = (BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner) o;
    return Objects.equals(this.id, blockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.id) &&
        Objects.equals(this.name, blockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.name) &&
        Objects.equals(this.value, blockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner is not found in the empty JSON string", BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner
  */
  public static BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


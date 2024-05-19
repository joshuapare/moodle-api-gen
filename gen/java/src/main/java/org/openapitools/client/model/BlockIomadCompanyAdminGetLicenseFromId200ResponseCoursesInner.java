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
 * BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner {
  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner() {
  }

  public BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * Course full name
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Course ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner blockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner = (BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner) o;
    return Objects.equals(this.fullname, blockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.fullname) &&
        Objects.equals(this.id, blockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullname, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner {\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("fullname");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner is not found in the empty JSON string", BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner
  */
  public static BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


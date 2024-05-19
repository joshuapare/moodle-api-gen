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
 * BlockIomadCompanyAdminAssignCoursesRequestCoursesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminAssignCoursesRequestCoursesInner {
  public static final String SERIALIZED_NAME_COMPANYID = "companyid";
  @SerializedName(SERIALIZED_NAME_COMPANYID)
  private Integer companyid = 0;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid = 0;

  public static final String SERIALIZED_NAME_DEPARTMENTID = "departmentid";
  @SerializedName(SERIALIZED_NAME_DEPARTMENTID)
  private Integer departmentid = 0;

  public static final String SERIALIZED_NAME_LICENSED = "licensed";
  @SerializedName(SERIALIZED_NAME_LICENSED)
  private Boolean licensed = false;

  public static final String SERIALIZED_NAME_OWNED = "owned";
  @SerializedName(SERIALIZED_NAME_OWNED)
  private Boolean owned = false;

  public BlockIomadCompanyAdminAssignCoursesRequestCoursesInner() {
  }

  public BlockIomadCompanyAdminAssignCoursesRequestCoursesInner companyid(Integer companyid) {
    this.companyid = companyid;
    return this;
  }

   /**
   * Course company ID
   * @return companyid
  **/
  @javax.annotation.Nullable
  public Integer getCompanyid() {
    return companyid;
  }

  public void setCompanyid(Integer companyid) {
    this.companyid = companyid;
  }


  public BlockIomadCompanyAdminAssignCoursesRequestCoursesInner courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Course ID
   * @return courseid
  **/
  @javax.annotation.Nullable
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public BlockIomadCompanyAdminAssignCoursesRequestCoursesInner departmentid(Integer departmentid) {
    this.departmentid = departmentid;
    return this;
  }

   /**
   * Course department ID
   * @return departmentid
  **/
  @javax.annotation.Nullable
  public Integer getDepartmentid() {
    return departmentid;
  }

  public void setDepartmentid(Integer departmentid) {
    this.departmentid = departmentid;
  }


  public BlockIomadCompanyAdminAssignCoursesRequestCoursesInner licensed(Boolean licensed) {
    this.licensed = licensed;
    return this;
  }

   /**
   * Is the course licensed
   * @return licensed
  **/
  @javax.annotation.Nullable
  public Boolean getLicensed() {
    return licensed;
  }

  public void setLicensed(Boolean licensed) {
    this.licensed = licensed;
  }


  public BlockIomadCompanyAdminAssignCoursesRequestCoursesInner owned(Boolean owned) {
    this.owned = owned;
    return this;
  }

   /**
   * Does the company own the course
   * @return owned
  **/
  @javax.annotation.Nullable
  public Boolean getOwned() {
    return owned;
  }

  public void setOwned(Boolean owned) {
    this.owned = owned;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminAssignCoursesRequestCoursesInner blockIomadCompanyAdminAssignCoursesRequestCoursesInner = (BlockIomadCompanyAdminAssignCoursesRequestCoursesInner) o;
    return Objects.equals(this.companyid, blockIomadCompanyAdminAssignCoursesRequestCoursesInner.companyid) &&
        Objects.equals(this.courseid, blockIomadCompanyAdminAssignCoursesRequestCoursesInner.courseid) &&
        Objects.equals(this.departmentid, blockIomadCompanyAdminAssignCoursesRequestCoursesInner.departmentid) &&
        Objects.equals(this.licensed, blockIomadCompanyAdminAssignCoursesRequestCoursesInner.licensed) &&
        Objects.equals(this.owned, blockIomadCompanyAdminAssignCoursesRequestCoursesInner.owned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyid, courseid, departmentid, licensed, owned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminAssignCoursesRequestCoursesInner {\n");
    sb.append("    companyid: ").append(toIndentedString(companyid)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    departmentid: ").append(toIndentedString(departmentid)).append("\n");
    sb.append("    licensed: ").append(toIndentedString(licensed)).append("\n");
    sb.append("    owned: ").append(toIndentedString(owned)).append("\n");
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
    openapiFields.add("companyid");
    openapiFields.add("courseid");
    openapiFields.add("departmentid");
    openapiFields.add("licensed");
    openapiFields.add("owned");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminAssignCoursesRequestCoursesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminAssignCoursesRequestCoursesInner is not found in the empty JSON string", BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminAssignCoursesRequestCoursesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminAssignCoursesRequestCoursesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminAssignCoursesRequestCoursesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminAssignCoursesRequestCoursesInner>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminAssignCoursesRequestCoursesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminAssignCoursesRequestCoursesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminAssignCoursesRequestCoursesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminAssignCoursesRequestCoursesInner
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminAssignCoursesRequestCoursesInner
  */
  public static BlockIomadCompanyAdminAssignCoursesRequestCoursesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminAssignCoursesRequestCoursesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


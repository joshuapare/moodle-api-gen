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
 * BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner {
  public static final String SERIALIZED_NAME_ALLOCATION = "allocation";
  @SerializedName(SERIALIZED_NAME_ALLOCATION)
  private Integer allocation;

  public static final String SERIALIZED_NAME_COMPANYID = "companyid";
  @SerializedName(SERIALIZED_NAME_COMPANYID)
  private Integer companyid;

  public static final String SERIALIZED_NAME_EXPIRYDATE = "expirydate";
  @SerializedName(SERIALIZED_NAME_EXPIRYDATE)
  private Integer expirydate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENTID = "parentid";
  @SerializedName(SERIALIZED_NAME_PARENTID)
  private Integer parentid;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Integer used;

  public static final String SERIALIZED_NAME_VALIDLENGTH = "validlength";
  @SerializedName(SERIALIZED_NAME_VALIDLENGTH)
  private Integer validlength;

  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner() {
  }

  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner allocation(Integer allocation) {
    this.allocation = allocation;
    return this;
  }

   /**
   * Number of license slots
   * @return allocation
  **/
  @javax.annotation.Nullable
  public Integer getAllocation() {
    return allocation;
  }

  public void setAllocation(Integer allocation) {
    this.allocation = allocation;
  }


  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner companyid(Integer companyid) {
    this.companyid = companyid;
    return this;
  }

   /**
   * Company id
   * @return companyid
  **/
  @javax.annotation.Nullable
  public Integer getCompanyid() {
    return companyid;
  }

  public void setCompanyid(Integer companyid) {
    this.companyid = companyid;
  }


  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner expirydate(Integer expirydate) {
    this.expirydate = expirydate;
    return this;
  }

   /**
   * License expiry date
   * @return expirydate
  **/
  @javax.annotation.Nullable
  public Integer getExpirydate() {
    return expirydate;
  }

  public void setExpirydate(Integer expirydate) {
    this.expirydate = expirydate;
  }


  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * license ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * License name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner parentid(Integer parentid) {
    this.parentid = parentid;
    return this;
  }

   /**
   * Parent license id
   * @return parentid
  **/
  @javax.annotation.Nullable
  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }


  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner used(Integer used) {
    this.used = used;
    return this;
  }

   /**
   * Number allocated
   * @return used
  **/
  @javax.annotation.Nullable
  public Integer getUsed() {
    return used;
  }

  public void setUsed(Integer used) {
    this.used = used;
  }


  public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner validlength(Integer validlength) {
    this.validlength = validlength;
    return this;
  }

   /**
   * Course access length (days)
   * @return validlength
  **/
  @javax.annotation.Nullable
  public Integer getValidlength() {
    return validlength;
  }

  public void setValidlength(Integer validlength) {
    this.validlength = validlength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner = (BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner) o;
    return Objects.equals(this.allocation, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.allocation) &&
        Objects.equals(this.companyid, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.companyid) &&
        Objects.equals(this.expirydate, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.expirydate) &&
        Objects.equals(this.id, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.id) &&
        Objects.equals(this.name, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.name) &&
        Objects.equals(this.parentid, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.parentid) &&
        Objects.equals(this.used, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.used) &&
        Objects.equals(this.validlength, blockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.validlength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocation, companyid, expirydate, id, name, parentid, used, validlength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner {\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
    sb.append("    companyid: ").append(toIndentedString(companyid)).append("\n");
    sb.append("    expirydate: ").append(toIndentedString(expirydate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentid: ").append(toIndentedString(parentid)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    validlength: ").append(toIndentedString(validlength)).append("\n");
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
    openapiFields.add("allocation");
    openapiFields.add("companyid");
    openapiFields.add("expirydate");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("parentid");
    openapiFields.add("used");
    openapiFields.add("validlength");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner is not found in the empty JSON string", BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner
  */
  public static BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


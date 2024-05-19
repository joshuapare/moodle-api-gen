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
 * BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminAssignUsers200ResponseUsersInner {
  public static final String SERIALIZED_NAME_COMPANYID = "companyid";
  @SerializedName(SERIALIZED_NAME_COMPANYID)
  private Integer companyid = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = "null";

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Boolean result = null;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public BlockIomadCompanyAdminAssignUsers200ResponseUsersInner() {
  }

  public BlockIomadCompanyAdminAssignUsers200ResponseUsersInner companyid(Integer companyid) {
    this.companyid = companyid;
    return this;
  }

   /**
   * Company ID
   * @return companyid
  **/
  @javax.annotation.Nullable
  public Integer getCompanyid() {
    return companyid;
  }

  public void setCompanyid(Integer companyid) {
    this.companyid = companyid;
  }


  public BlockIomadCompanyAdminAssignUsers200ResponseUsersInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Failure message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public BlockIomadCompanyAdminAssignUsers200ResponseUsersInner result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Success or failure
   * @return result
  **/
  @javax.annotation.Nullable
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }


  public BlockIomadCompanyAdminAssignUsers200ResponseUsersInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * Department ID
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminAssignUsers200ResponseUsersInner blockIomadCompanyAdminAssignUsers200ResponseUsersInner = (BlockIomadCompanyAdminAssignUsers200ResponseUsersInner) o;
    return Objects.equals(this.companyid, blockIomadCompanyAdminAssignUsers200ResponseUsersInner.companyid) &&
        Objects.equals(this.message, blockIomadCompanyAdminAssignUsers200ResponseUsersInner.message) &&
        Objects.equals(this.result, blockIomadCompanyAdminAssignUsers200ResponseUsersInner.result) &&
        Objects.equals(this.userid, blockIomadCompanyAdminAssignUsers200ResponseUsersInner.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyid, message, result, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminAssignUsers200ResponseUsersInner {\n");
    sb.append("    companyid: ").append(toIndentedString(companyid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("result");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminAssignUsers200ResponseUsersInner is not found in the empty JSON string", BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminAssignUsers200ResponseUsersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminAssignUsers200ResponseUsersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminAssignUsers200ResponseUsersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminAssignUsers200ResponseUsersInner>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminAssignUsers200ResponseUsersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminAssignUsers200ResponseUsersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminAssignUsers200ResponseUsersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminAssignUsers200ResponseUsersInner
  */
  public static BlockIomadCompanyAdminAssignUsers200ResponseUsersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminAssignUsers200ResponseUsersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


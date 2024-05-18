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
 * CoreBlockGetDashboardBlocksRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreBlockGetDashboardBlocksRequest {
  public static final String SERIALIZED_NAME_MYPAGE = "mypage";
  @SerializedName(SERIALIZED_NAME_MYPAGE)
  private String mypage = "__default";

  public static final String SERIALIZED_NAME_RETURNCONTENTS = "returncontents";
  @SerializedName(SERIALIZED_NAME_RETURNCONTENTS)
  private Boolean returncontents = false;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = 0;

  public CoreBlockGetDashboardBlocksRequest() {
  }

  public CoreBlockGetDashboardBlocksRequest mypage(String mypage) {
    this.mypage = mypage;
    return this;
  }

   /**
   * What my page to return blocks of
   * @return mypage
  **/
  @javax.annotation.Nullable
  public String getMypage() {
    return mypage;
  }

  public void setMypage(String mypage) {
    this.mypage = mypage;
  }


  public CoreBlockGetDashboardBlocksRequest returncontents(Boolean returncontents) {
    this.returncontents = returncontents;
    return this;
  }

   /**
   * Whether to return the block contents.
   * @return returncontents
  **/
  @javax.annotation.Nullable
  public Boolean getReturncontents() {
    return returncontents;
  }

  public void setReturncontents(Boolean returncontents) {
    this.returncontents = returncontents;
  }


  public CoreBlockGetDashboardBlocksRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * User id (optional), default is current user.
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
    CoreBlockGetDashboardBlocksRequest coreBlockGetDashboardBlocksRequest = (CoreBlockGetDashboardBlocksRequest) o;
    return Objects.equals(this.mypage, coreBlockGetDashboardBlocksRequest.mypage) &&
        Objects.equals(this.returncontents, coreBlockGetDashboardBlocksRequest.returncontents) &&
        Objects.equals(this.userid, coreBlockGetDashboardBlocksRequest.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mypage, returncontents, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreBlockGetDashboardBlocksRequest {\n");
    sb.append("    mypage: ").append(toIndentedString(mypage)).append("\n");
    sb.append("    returncontents: ").append(toIndentedString(returncontents)).append("\n");
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
    openapiFields.add("mypage");
    openapiFields.add("returncontents");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreBlockGetDashboardBlocksRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreBlockGetDashboardBlocksRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreBlockGetDashboardBlocksRequest is not found in the empty JSON string", CoreBlockGetDashboardBlocksRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreBlockGetDashboardBlocksRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreBlockGetDashboardBlocksRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mypage") != null && !jsonObj.get("mypage").isJsonNull()) && !jsonObj.get("mypage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mypage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mypage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreBlockGetDashboardBlocksRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreBlockGetDashboardBlocksRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreBlockGetDashboardBlocksRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreBlockGetDashboardBlocksRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreBlockGetDashboardBlocksRequest>() {
           @Override
           public void write(JsonWriter out, CoreBlockGetDashboardBlocksRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreBlockGetDashboardBlocksRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreBlockGetDashboardBlocksRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreBlockGetDashboardBlocksRequest
  * @throws IOException if the JSON string is invalid with respect to CoreBlockGetDashboardBlocksRequest
  */
  public static CoreBlockGetDashboardBlocksRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreBlockGetDashboardBlocksRequest.class);
  }

 /**
  * Convert an instance of CoreBlockGetDashboardBlocksRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

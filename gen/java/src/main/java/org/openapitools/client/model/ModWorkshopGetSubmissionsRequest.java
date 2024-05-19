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
 * ModWorkshopGetSubmissionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWorkshopGetSubmissionsRequest {
  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid = 0;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = 0;

  public static final String SERIALIZED_NAME_PERPAGE = "perpage";
  @SerializedName(SERIALIZED_NAME_PERPAGE)
  private Integer perpage = 0;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = 0;

  public static final String SERIALIZED_NAME_WORKSHOPID = "workshopid";
  @SerializedName(SERIALIZED_NAME_WORKSHOPID)
  private Integer workshopid;

  public ModWorkshopGetSubmissionsRequest() {
  }

  public ModWorkshopGetSubmissionsRequest groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * Group id, 0 means that the function will determine the user group.                                                    It will return submissions done by users in the given group.
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public ModWorkshopGetSubmissionsRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * The page of records to return.
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public ModWorkshopGetSubmissionsRequest perpage(Integer perpage) {
    this.perpage = perpage;
    return this;
  }

   /**
   * The number of records to return per page.
   * @return perpage
  **/
  @javax.annotation.Nullable
  public Integer getPerpage() {
    return perpage;
  }

  public void setPerpage(Integer perpage) {
    this.perpage = perpage;
  }


  public ModWorkshopGetSubmissionsRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * Get submissions done by this user. Use 0 or empty for the current user
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public ModWorkshopGetSubmissionsRequest workshopid(Integer workshopid) {
    this.workshopid = workshopid;
    return this;
  }

   /**
   * Workshop instance id.
   * @return workshopid
  **/
  @javax.annotation.Nonnull
  public Integer getWorkshopid() {
    return workshopid;
  }

  public void setWorkshopid(Integer workshopid) {
    this.workshopid = workshopid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModWorkshopGetSubmissionsRequest modWorkshopGetSubmissionsRequest = (ModWorkshopGetSubmissionsRequest) o;
    return Objects.equals(this.groupid, modWorkshopGetSubmissionsRequest.groupid) &&
        Objects.equals(this.page, modWorkshopGetSubmissionsRequest.page) &&
        Objects.equals(this.perpage, modWorkshopGetSubmissionsRequest.perpage) &&
        Objects.equals(this.userid, modWorkshopGetSubmissionsRequest.userid) &&
        Objects.equals(this.workshopid, modWorkshopGetSubmissionsRequest.workshopid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupid, page, perpage, userid, workshopid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWorkshopGetSubmissionsRequest {\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    workshopid: ").append(toIndentedString(workshopid)).append("\n");
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
    openapiFields.add("groupid");
    openapiFields.add("page");
    openapiFields.add("perpage");
    openapiFields.add("userid");
    openapiFields.add("workshopid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workshopid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWorkshopGetSubmissionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWorkshopGetSubmissionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWorkshopGetSubmissionsRequest is not found in the empty JSON string", ModWorkshopGetSubmissionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWorkshopGetSubmissionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWorkshopGetSubmissionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModWorkshopGetSubmissionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModWorkshopGetSubmissionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWorkshopGetSubmissionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWorkshopGetSubmissionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWorkshopGetSubmissionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWorkshopGetSubmissionsRequest>() {
           @Override
           public void write(JsonWriter out, ModWorkshopGetSubmissionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWorkshopGetSubmissionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWorkshopGetSubmissionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWorkshopGetSubmissionsRequest
  * @throws IOException if the JSON string is invalid with respect to ModWorkshopGetSubmissionsRequest
  */
  public static ModWorkshopGetSubmissionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWorkshopGetSubmissionsRequest.class);
  }

 /**
  * Convert an instance of ModWorkshopGetSubmissionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


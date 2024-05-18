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
 * CoreBadgesGetUserBadgesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreBadgesGetUserBadgesRequest {
  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid = 0;

  public static final String SERIALIZED_NAME_ONLYPUBLIC = "onlypublic";
  @SerializedName(SERIALIZED_NAME_ONLYPUBLIC)
  private Boolean onlypublic = false;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = 0;

  public static final String SERIALIZED_NAME_PERPAGE = "perpage";
  @SerializedName(SERIALIZED_NAME_PERPAGE)
  private Integer perpage = 0;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private String search = "";

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = 0;

  public CoreBadgesGetUserBadgesRequest() {
  }

  public CoreBadgesGetUserBadgesRequest courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Filter badges by course id, empty all the courses
   * @return courseid
  **/
  @javax.annotation.Nullable
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public CoreBadgesGetUserBadgesRequest onlypublic(Boolean onlypublic) {
    this.onlypublic = onlypublic;
    return this;
  }

   /**
   * Whether to return only public badges
   * @return onlypublic
  **/
  @javax.annotation.Nullable
  public Boolean getOnlypublic() {
    return onlypublic;
  }

  public void setOnlypublic(Boolean onlypublic) {
    this.onlypublic = onlypublic;
  }


  public CoreBadgesGetUserBadgesRequest page(Integer page) {
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


  public CoreBadgesGetUserBadgesRequest perpage(Integer perpage) {
    this.perpage = perpage;
    return this;
  }

   /**
   * The number of records to return per page
   * @return perpage
  **/
  @javax.annotation.Nullable
  public Integer getPerpage() {
    return perpage;
  }

  public void setPerpage(Integer perpage) {
    this.perpage = perpage;
  }


  public CoreBadgesGetUserBadgesRequest search(String search) {
    this.search = search;
    return this;
  }

   /**
   * A simple string to search for
   * @return search
  **/
  @javax.annotation.Nullable
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }


  public CoreBadgesGetUserBadgesRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * Badges only for this user id, empty for current user
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
    CoreBadgesGetUserBadgesRequest coreBadgesGetUserBadgesRequest = (CoreBadgesGetUserBadgesRequest) o;
    return Objects.equals(this.courseid, coreBadgesGetUserBadgesRequest.courseid) &&
        Objects.equals(this.onlypublic, coreBadgesGetUserBadgesRequest.onlypublic) &&
        Objects.equals(this.page, coreBadgesGetUserBadgesRequest.page) &&
        Objects.equals(this.perpage, coreBadgesGetUserBadgesRequest.perpage) &&
        Objects.equals(this.search, coreBadgesGetUserBadgesRequest.search) &&
        Objects.equals(this.userid, coreBadgesGetUserBadgesRequest.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseid, onlypublic, page, perpage, search, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreBadgesGetUserBadgesRequest {\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    onlypublic: ").append(toIndentedString(onlypublic)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
    openapiFields.add("courseid");
    openapiFields.add("onlypublic");
    openapiFields.add("page");
    openapiFields.add("perpage");
    openapiFields.add("search");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreBadgesGetUserBadgesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreBadgesGetUserBadgesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreBadgesGetUserBadgesRequest is not found in the empty JSON string", CoreBadgesGetUserBadgesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreBadgesGetUserBadgesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreBadgesGetUserBadgesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("search") != null && !jsonObj.get("search").isJsonNull()) && !jsonObj.get("search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreBadgesGetUserBadgesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreBadgesGetUserBadgesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreBadgesGetUserBadgesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreBadgesGetUserBadgesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreBadgesGetUserBadgesRequest>() {
           @Override
           public void write(JsonWriter out, CoreBadgesGetUserBadgesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreBadgesGetUserBadgesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreBadgesGetUserBadgesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreBadgesGetUserBadgesRequest
  * @throws IOException if the JSON string is invalid with respect to CoreBadgesGetUserBadgesRequest
  */
  public static CoreBadgesGetUserBadgesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreBadgesGetUserBadgesRequest.class);
  }

 /**
  * Convert an instance of CoreBadgesGetUserBadgesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * ModDataGetEntriesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataGetEntriesRequest {
  public static final String SERIALIZED_NAME_DATABASEID = "databaseid";
  @SerializedName(SERIALIZED_NAME_DATABASEID)
  private Integer databaseid;

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid = 0;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order = "null";

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = 0;

  public static final String SERIALIZED_NAME_PERPAGE = "perpage";
  @SerializedName(SERIALIZED_NAME_PERPAGE)
  private Integer perpage = 0;

  public static final String SERIALIZED_NAME_RETURNCONTENTS = "returncontents";
  @SerializedName(SERIALIZED_NAME_RETURNCONTENTS)
  private Boolean returncontents = false;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Integer sort = null;

  public ModDataGetEntriesRequest() {
  }

  public ModDataGetEntriesRequest databaseid(Integer databaseid) {
    this.databaseid = databaseid;
    return this;
  }

   /**
   * data instance id
   * @return databaseid
  **/
  @javax.annotation.Nonnull
  public Integer getDatabaseid() {
    return databaseid;
  }

  public void setDatabaseid(Integer databaseid) {
    this.databaseid = databaseid;
  }


  public ModDataGetEntriesRequest groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * Group id, 0 means that the function will determine the user group
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public ModDataGetEntriesRequest order(String order) {
    this.order = order;
    return this;
  }

   /**
   * The direction of the sorting: &#39;ASC&#39; or &#39;DESC&#39;.                                                 Empty for using the default database setting.
   * @return order
  **/
  @javax.annotation.Nullable
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }


  public ModDataGetEntriesRequest page(Integer page) {
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


  public ModDataGetEntriesRequest perpage(Integer perpage) {
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


  public ModDataGetEntriesRequest returncontents(Boolean returncontents) {
    this.returncontents = returncontents;
    return this;
  }

   /**
   * Whether to return contents or not. This will return each entry                                                         raw contents and the complete list view (using the template).
   * @return returncontents
  **/
  @javax.annotation.Nullable
  public Boolean getReturncontents() {
    return returncontents;
  }

  public void setReturncontents(Boolean returncontents) {
    this.returncontents = returncontents;
  }


  public ModDataGetEntriesRequest sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Sort the records by this field id, reserved ids are:                                                 0: timeadded                                                 -1: firstname                                                 -2: lastname                                                 -3: approved                                                 -4: timemodified.                                                 Empty for using the default database setting.
   * @return sort
  **/
  @javax.annotation.Nullable
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataGetEntriesRequest modDataGetEntriesRequest = (ModDataGetEntriesRequest) o;
    return Objects.equals(this.databaseid, modDataGetEntriesRequest.databaseid) &&
        Objects.equals(this.groupid, modDataGetEntriesRequest.groupid) &&
        Objects.equals(this.order, modDataGetEntriesRequest.order) &&
        Objects.equals(this.page, modDataGetEntriesRequest.page) &&
        Objects.equals(this.perpage, modDataGetEntriesRequest.perpage) &&
        Objects.equals(this.returncontents, modDataGetEntriesRequest.returncontents) &&
        Objects.equals(this.sort, modDataGetEntriesRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseid, groupid, order, page, perpage, returncontents, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataGetEntriesRequest {\n");
    sb.append("    databaseid: ").append(toIndentedString(databaseid)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
    sb.append("    returncontents: ").append(toIndentedString(returncontents)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("databaseid");
    openapiFields.add("groupid");
    openapiFields.add("order");
    openapiFields.add("page");
    openapiFields.add("perpage");
    openapiFields.add("returncontents");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("databaseid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataGetEntriesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataGetEntriesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataGetEntriesRequest is not found in the empty JSON string", ModDataGetEntriesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataGetEntriesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataGetEntriesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModDataGetEntriesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataGetEntriesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataGetEntriesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataGetEntriesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataGetEntriesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataGetEntriesRequest>() {
           @Override
           public void write(JsonWriter out, ModDataGetEntriesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataGetEntriesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataGetEntriesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataGetEntriesRequest
  * @throws IOException if the JSON string is invalid with respect to ModDataGetEntriesRequest
  */
  public static ModDataGetEntriesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataGetEntriesRequest.class);
  }

 /**
  * Convert an instance of ModDataGetEntriesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

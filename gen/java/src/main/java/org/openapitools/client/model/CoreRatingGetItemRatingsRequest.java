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
 * CoreRatingGetItemRatingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreRatingGetItemRatingsRequest {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_CONTEXTLEVEL = "contextlevel";
  @SerializedName(SERIALIZED_NAME_CONTEXTLEVEL)
  private String contextlevel;

  public static final String SERIALIZED_NAME_INSTANCEID = "instanceid";
  @SerializedName(SERIALIZED_NAME_INSTANCEID)
  private Integer instanceid;

  public static final String SERIALIZED_NAME_ITEMID = "itemid";
  @SerializedName(SERIALIZED_NAME_ITEMID)
  private Integer itemid;

  public static final String SERIALIZED_NAME_RATINGAREA = "ratingarea";
  @SerializedName(SERIALIZED_NAME_RATINGAREA)
  private String ratingarea;

  public static final String SERIALIZED_NAME_SCALEID = "scaleid";
  @SerializedName(SERIALIZED_NAME_SCALEID)
  private Integer scaleid;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort = "null";

  public CoreRatingGetItemRatingsRequest() {
  }

  public CoreRatingGetItemRatingsRequest component(String component) {
    this.component = component;
    return this;
  }

   /**
   * component
   * @return component
  **/
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreRatingGetItemRatingsRequest contextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
    return this;
  }

   /**
   * context level: course, module, user, etc...
   * @return contextlevel
  **/
  @javax.annotation.Nonnull
  public String getContextlevel() {
    return contextlevel;
  }

  public void setContextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
  }


  public CoreRatingGetItemRatingsRequest instanceid(Integer instanceid) {
    this.instanceid = instanceid;
    return this;
  }

   /**
   * the instance id of item associated with the context level
   * @return instanceid
  **/
  @javax.annotation.Nonnull
  public Integer getInstanceid() {
    return instanceid;
  }

  public void setInstanceid(Integer instanceid) {
    this.instanceid = instanceid;
  }


  public CoreRatingGetItemRatingsRequest itemid(Integer itemid) {
    this.itemid = itemid;
    return this;
  }

   /**
   * associated id
   * @return itemid
  **/
  @javax.annotation.Nonnull
  public Integer getItemid() {
    return itemid;
  }

  public void setItemid(Integer itemid) {
    this.itemid = itemid;
  }


  public CoreRatingGetItemRatingsRequest ratingarea(String ratingarea) {
    this.ratingarea = ratingarea;
    return this;
  }

   /**
   * rating area
   * @return ratingarea
  **/
  @javax.annotation.Nonnull
  public String getRatingarea() {
    return ratingarea;
  }

  public void setRatingarea(String ratingarea) {
    this.ratingarea = ratingarea;
  }


  public CoreRatingGetItemRatingsRequest scaleid(Integer scaleid) {
    this.scaleid = scaleid;
    return this;
  }

   /**
   * scale id
   * @return scaleid
  **/
  @javax.annotation.Nonnull
  public Integer getScaleid() {
    return scaleid;
  }

  public void setScaleid(Integer scaleid) {
    this.scaleid = scaleid;
  }


  public CoreRatingGetItemRatingsRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * sort order (firstname, rating or timemodified)
   * @return sort
  **/
  @javax.annotation.Nonnull
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
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
    CoreRatingGetItemRatingsRequest coreRatingGetItemRatingsRequest = (CoreRatingGetItemRatingsRequest) o;
    return Objects.equals(this.component, coreRatingGetItemRatingsRequest.component) &&
        Objects.equals(this.contextlevel, coreRatingGetItemRatingsRequest.contextlevel) &&
        Objects.equals(this.instanceid, coreRatingGetItemRatingsRequest.instanceid) &&
        Objects.equals(this.itemid, coreRatingGetItemRatingsRequest.itemid) &&
        Objects.equals(this.ratingarea, coreRatingGetItemRatingsRequest.ratingarea) &&
        Objects.equals(this.scaleid, coreRatingGetItemRatingsRequest.scaleid) &&
        Objects.equals(this.sort, coreRatingGetItemRatingsRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, contextlevel, instanceid, itemid, ratingarea, scaleid, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreRatingGetItemRatingsRequest {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    contextlevel: ").append(toIndentedString(contextlevel)).append("\n");
    sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
    sb.append("    itemid: ").append(toIndentedString(itemid)).append("\n");
    sb.append("    ratingarea: ").append(toIndentedString(ratingarea)).append("\n");
    sb.append("    scaleid: ").append(toIndentedString(scaleid)).append("\n");
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
    openapiFields.add("component");
    openapiFields.add("contextlevel");
    openapiFields.add("instanceid");
    openapiFields.add("itemid");
    openapiFields.add("ratingarea");
    openapiFields.add("scaleid");
    openapiFields.add("sort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("contextlevel");
    openapiRequiredFields.add("instanceid");
    openapiRequiredFields.add("itemid");
    openapiRequiredFields.add("ratingarea");
    openapiRequiredFields.add("scaleid");
    openapiRequiredFields.add("sort");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreRatingGetItemRatingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreRatingGetItemRatingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreRatingGetItemRatingsRequest is not found in the empty JSON string", CoreRatingGetItemRatingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreRatingGetItemRatingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreRatingGetItemRatingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreRatingGetItemRatingsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("contextlevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextlevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextlevel").toString()));
      }
      if (!jsonObj.get("ratingarea").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratingarea` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratingarea").toString()));
      }
      if (!jsonObj.get("sort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreRatingGetItemRatingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreRatingGetItemRatingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreRatingGetItemRatingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreRatingGetItemRatingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreRatingGetItemRatingsRequest>() {
           @Override
           public void write(JsonWriter out, CoreRatingGetItemRatingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreRatingGetItemRatingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreRatingGetItemRatingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreRatingGetItemRatingsRequest
  * @throws IOException if the JSON string is invalid with respect to CoreRatingGetItemRatingsRequest
  */
  public static CoreRatingGetItemRatingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreRatingGetItemRatingsRequest.class);
  }

 /**
  * Convert an instance of CoreRatingGetItemRatingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

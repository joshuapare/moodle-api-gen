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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner {
  public static final String SERIALIZED_NAME_ITEMIDS = "itemids";
  @SerializedName(SERIALIZED_NAME_ITEMIDS)
  private List<Object> itemids = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIMEUPDATED = "timeupdated";
  @SerializedName(SERIALIZED_NAME_TIMEUPDATED)
  private Integer timeupdated;

  public CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner() {
  }

  public CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner itemids(List<Object> itemids) {
    this.itemids = itemids;
    return this;
  }

  public CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner addItemidsItem(Object itemidsItem) {
    if (this.itemids == null) {
      this.itemids = new ArrayList<>();
    }
    this.itemids.add(itemidsItem);
    return this;
  }

   /**
   * Get itemids
   * @return itemids
  **/
  @javax.annotation.Nullable
  public List<Object> getItemids() {
    return itemids;
  }

  public void setItemids(List<Object> itemids) {
    this.itemids = itemids;
  }


  public CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the area updated.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner timeupdated(Integer timeupdated) {
    this.timeupdated = timeupdated;
    return this;
  }

   /**
   * Last time was updated
   * @return timeupdated
  **/
  @javax.annotation.Nullable
  public Integer getTimeupdated() {
    return timeupdated;
  }

  public void setTimeupdated(Integer timeupdated) {
    this.timeupdated = timeupdated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner coreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner = (CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner) o;
    return Objects.equals(this.itemids, coreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.itemids) &&
        Objects.equals(this.name, coreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.name) &&
        Objects.equals(this.timeupdated, coreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.timeupdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemids, name, timeupdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner {\n");
    sb.append("    itemids: ").append(toIndentedString(itemids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeupdated: ").append(toIndentedString(timeupdated)).append("\n");
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
    openapiFields.add("itemids");
    openapiFields.add("name");
    openapiFields.add("timeupdated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner is not found in the empty JSON string", CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("itemids") != null && !jsonObj.get("itemids").isJsonNull() && !jsonObj.get("itemids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemids` to be an array in the JSON string but got `%s`", jsonObj.get("itemids").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner>() {
           @Override
           public void write(JsonWriter out, CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
  * @throws IOException if the JSON string is invalid with respect to CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner
  */
  public static CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.class);
  }

 /**
  * Convert an instance of CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * CoreCourseCheckUpdatesRequestTocheckInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseCheckUpdatesRequestTocheckInner {
  public static final String SERIALIZED_NAME_CONTEXTLEVEL = "contextlevel";
  @SerializedName(SERIALIZED_NAME_CONTEXTLEVEL)
  private String contextlevel = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private Integer since = null;

  public CoreCourseCheckUpdatesRequestTocheckInner() {
  }

  public CoreCourseCheckUpdatesRequestTocheckInner contextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
    return this;
  }

   /**
   * The context level for the file location.                                                                                 Only module supported right now.
   * @return contextlevel
  **/
  @javax.annotation.Nullable
  public String getContextlevel() {
    return contextlevel;
  }

  public void setContextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
  }


  public CoreCourseCheckUpdatesRequestTocheckInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Context instance id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreCourseCheckUpdatesRequestTocheckInner since(Integer since) {
    this.since = since;
    return this;
  }

   /**
   * Check updates since this time stamp
   * @return since
  **/
  @javax.annotation.Nullable
  public Integer getSince() {
    return since;
  }

  public void setSince(Integer since) {
    this.since = since;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseCheckUpdatesRequestTocheckInner coreCourseCheckUpdatesRequestTocheckInner = (CoreCourseCheckUpdatesRequestTocheckInner) o;
    return Objects.equals(this.contextlevel, coreCourseCheckUpdatesRequestTocheckInner.contextlevel) &&
        Objects.equals(this.id, coreCourseCheckUpdatesRequestTocheckInner.id) &&
        Objects.equals(this.since, coreCourseCheckUpdatesRequestTocheckInner.since);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextlevel, id, since);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseCheckUpdatesRequestTocheckInner {\n");
    sb.append("    contextlevel: ").append(toIndentedString(contextlevel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
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
    openapiFields.add("contextlevel");
    openapiFields.add("id");
    openapiFields.add("since");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseCheckUpdatesRequestTocheckInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseCheckUpdatesRequestTocheckInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseCheckUpdatesRequestTocheckInner is not found in the empty JSON string", CoreCourseCheckUpdatesRequestTocheckInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseCheckUpdatesRequestTocheckInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseCheckUpdatesRequestTocheckInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contextlevel") != null && !jsonObj.get("contextlevel").isJsonNull()) && !jsonObj.get("contextlevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextlevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextlevel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseCheckUpdatesRequestTocheckInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseCheckUpdatesRequestTocheckInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseCheckUpdatesRequestTocheckInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseCheckUpdatesRequestTocheckInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseCheckUpdatesRequestTocheckInner>() {
           @Override
           public void write(JsonWriter out, CoreCourseCheckUpdatesRequestTocheckInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseCheckUpdatesRequestTocheckInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseCheckUpdatesRequestTocheckInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseCheckUpdatesRequestTocheckInner
  * @throws IOException if the JSON string is invalid with respect to CoreCourseCheckUpdatesRequestTocheckInner
  */
  public static CoreCourseCheckUpdatesRequestTocheckInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseCheckUpdatesRequestTocheckInner.class);
  }

 /**
  * Convert an instance of CoreCourseCheckUpdatesRequestTocheckInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner {
  public static final String SERIALIZED_NAME_DISPLAYVALUE = "displayvalue";
  @SerializedName(SERIALIZED_NAME_DISPLAYVALUE)
  private String displayvalue = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = "null";

  public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner() {
  }

  public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner displayvalue(String displayvalue) {
    this.displayvalue = displayvalue;
    return this;
  }

   /**
   * The value of the custom field for display
   * @return displayvalue
  **/
  @javax.annotation.Nullable
  public String getDisplayvalue() {
    return displayvalue;
  }

  public void setDisplayvalue(String displayvalue) {
    this.displayvalue = displayvalue;
  }


  public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * The shortname of the custom field - to be able to build the field class in the code
   * @return shortname
  **/
  @javax.annotation.Nullable
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the custom field - text field, checkbox...
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field (as stored in the database)
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner coreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner = (CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner) o;
    return Objects.equals(this.displayvalue, coreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.displayvalue) &&
        Objects.equals(this.name, coreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.name) &&
        Objects.equals(this.shortname, coreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.shortname) &&
        Objects.equals(this.type, coreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.type) &&
        Objects.equals(this.value, coreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayvalue, name, shortname, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner {\n");
    sb.append("    displayvalue: ").append(toIndentedString(displayvalue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("displayvalue");
    openapiFields.add("name");
    openapiFields.add("shortname");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner is not found in the empty JSON string", CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayvalue") != null && !jsonObj.get("displayvalue").isJsonNull()) && !jsonObj.get("displayvalue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayvalue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayvalue").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner>() {
           @Override
           public void write(JsonWriter out, CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner
  * @throws IOException if the JSON string is invalid with respect to CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner
  */
  public static CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.class);
  }

 /**
  * Convert an instance of CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


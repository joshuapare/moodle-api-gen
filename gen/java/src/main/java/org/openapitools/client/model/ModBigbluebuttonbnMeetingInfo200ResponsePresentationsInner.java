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
 * ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner {
  public static final String SERIALIZED_NAME_ICONDESC = "icondesc";
  @SerializedName(SERIALIZED_NAME_ICONDESC)
  private String icondesc = "null";

  public static final String SERIALIZED_NAME_ICONNAME = "iconname";
  @SerializedName(SERIALIZED_NAME_ICONNAME)
  private String iconname = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = "null";

  public ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner() {
  }

  public ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner icondesc(String icondesc) {
    this.icondesc = icondesc;
    return this;
  }

   /**
   * icon text
   * @return icondesc
  **/
  @javax.annotation.Nullable
  public String getIcondesc() {
    return icondesc;
  }

  public void setIcondesc(String icondesc) {
    this.icondesc = icondesc;
  }


  public ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner iconname(String iconname) {
    this.iconname = iconname;
    return this;
  }

   /**
   * icon name
   * @return iconname
  **/
  @javax.annotation.Nullable
  public String getIconname() {
    return iconname;
  }

  public void setIconname(String iconname) {
    this.iconname = iconname;
  }


  public ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * presentation name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner url(String url) {
    this.url = url;
    return this;
  }

   /**
   * presentation URL
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner modBigbluebuttonbnMeetingInfo200ResponsePresentationsInner = (ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner) o;
    return Objects.equals(this.icondesc, modBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.icondesc) &&
        Objects.equals(this.iconname, modBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.iconname) &&
        Objects.equals(this.name, modBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.name) &&
        Objects.equals(this.url, modBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icondesc, iconname, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner {\n");
    sb.append("    icondesc: ").append(toIndentedString(icondesc)).append("\n");
    sb.append("    iconname: ").append(toIndentedString(iconname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("icondesc");
    openapiFields.add("iconname");
    openapiFields.add("name");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner is not found in the empty JSON string", ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("icondesc") != null && !jsonObj.get("icondesc").isJsonNull()) && !jsonObj.get("icondesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icondesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icondesc").toString()));
      }
      if ((jsonObj.get("iconname") != null && !jsonObj.get("iconname").isJsonNull()) && !jsonObj.get("iconname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconname").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner>() {
           @Override
           public void write(JsonWriter out, ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner
  * @throws IOException if the JSON string is invalid with respect to ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner
  */
  public static ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.class);
  }

 /**
  * Convert an instance of ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


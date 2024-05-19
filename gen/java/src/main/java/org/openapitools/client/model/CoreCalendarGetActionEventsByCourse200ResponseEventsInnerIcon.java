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
 * CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon {
  public static final String SERIALIZED_NAME_ALTTEXT = "alttext";
  @SerializedName(SERIALIZED_NAME_ALTTEXT)
  private String alttext = "null";

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "null";

  public static final String SERIALIZED_NAME_ICONCLASS = "iconclass";
  @SerializedName(SERIALIZED_NAME_ICONCLASS)
  private String iconclass = "null";

  public static final String SERIALIZED_NAME_ICONURL = "iconurl";
  @SerializedName(SERIALIZED_NAME_ICONURL)
  private String iconurl = "null";

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = "null";

  public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon() {
  }

  public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon alttext(String alttext) {
    this.alttext = alttext;
    return this;
  }

   /**
   * alttext
   * @return alttext
  **/
  @javax.annotation.Nonnull
  public String getAlttext() {
    return alttext;
  }

  public void setAlttext(String alttext) {
    this.alttext = alttext;
  }


  public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon component(String component) {
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


  public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon iconclass(String iconclass) {
    this.iconclass = iconclass;
    return this;
  }

   /**
   * iconclass
   * @return iconclass
  **/
  @javax.annotation.Nonnull
  public String getIconclass() {
    return iconclass;
  }

  public void setIconclass(String iconclass) {
    this.iconclass = iconclass;
  }


  public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon iconurl(String iconurl) {
    this.iconurl = iconurl;
    return this;
  }

   /**
   * iconurl
   * @return iconurl
  **/
  @javax.annotation.Nonnull
  public String getIconurl() {
    return iconurl;
  }

  public void setIconurl(String iconurl) {
    this.iconurl = iconurl;
  }


  public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon key(String key) {
    this.key = key;
    return this;
  }

   /**
   * key
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon coreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon = (CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon) o;
    return Objects.equals(this.alttext, coreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.alttext) &&
        Objects.equals(this.component, coreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.component) &&
        Objects.equals(this.iconclass, coreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.iconclass) &&
        Objects.equals(this.iconurl, coreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.iconurl) &&
        Objects.equals(this.key, coreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alttext, component, iconclass, iconurl, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon {\n");
    sb.append("    alttext: ").append(toIndentedString(alttext)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    iconclass: ").append(toIndentedString(iconclass)).append("\n");
    sb.append("    iconurl: ").append(toIndentedString(iconurl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("alttext");
    openapiFields.add("component");
    openapiFields.add("iconclass");
    openapiFields.add("iconurl");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alttext");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("iconclass");
    openapiRequiredFields.add("iconurl");
    openapiRequiredFields.add("key");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon is not found in the empty JSON string", CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("alttext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alttext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alttext").toString()));
      }
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("iconclass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconclass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconclass").toString()));
      }
      if (!jsonObj.get("iconurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconurl").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon>() {
           @Override
           public void write(JsonWriter out, CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
  * @throws IOException if the JSON string is invalid with respect to CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon
  */
  public static CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.class);
  }

 /**
  * Convert an instance of CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


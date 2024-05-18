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
 * CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff {
  public static final String SERIALIZED_NAME_CHECKED = "checked";
  @SerializedName(SERIALIZED_NAME_CHECKED)
  private Boolean checked;

  public static final String SERIALIZED_NAME_DISPLAYNAME = "displayname";
  @SerializedName(SERIALIZED_NAME_DISPLAYNAME)
  private String displayname;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff() {
  }

  public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Is checked?
   * @return checked
  **/
  @javax.annotation.Nonnull
  public Boolean getChecked() {
    return checked;
  }

  public void setChecked(Boolean checked) {
    this.checked = checked;
  }


  public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Display name
   * @return displayname
  **/
  @javax.annotation.Nonnull
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }


  public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff coreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff = (CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff) o;
    return Objects.equals(this.checked, coreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.checked) &&
        Objects.equals(this.displayname, coreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.displayname) &&
        Objects.equals(this.name, coreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checked, displayname, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff {\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("checked");
    openapiFields.add("displayname");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("checked");
    openapiRequiredFields.add("displayname");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff is not found in the empty JSON string", CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("displayname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayname").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff
  */
  public static CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.class);
  }

 /**
  * Convert an instance of CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


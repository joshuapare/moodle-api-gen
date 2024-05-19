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
 * ModForumSetPinState200ResponseUrls
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModForumSetPinState200ResponseUrls {
  public static final String SERIALIZED_NAME_MARKASREAD = "markasread";
  @SerializedName(SERIALIZED_NAME_MARKASREAD)
  private String markasread = "null";

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private String pin = "null";

  public static final String SERIALIZED_NAME_SUBSCRIBE = "subscribe";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE)
  private String subscribe = "null";

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private String view;

  public static final String SERIALIZED_NAME_VIEWFIRSTUNREAD = "viewfirstunread";
  @SerializedName(SERIALIZED_NAME_VIEWFIRSTUNREAD)
  private String viewfirstunread = "null";

  public static final String SERIALIZED_NAME_VIEWLATEST = "viewlatest";
  @SerializedName(SERIALIZED_NAME_VIEWLATEST)
  private String viewlatest = "null";

  public ModForumSetPinState200ResponseUrls() {
  }

  public ModForumSetPinState200ResponseUrls markasread(String markasread) {
    this.markasread = markasread;
    return this;
  }

   /**
   * markasread
   * @return markasread
  **/
  @javax.annotation.Nonnull
  public String getMarkasread() {
    return markasread;
  }

  public void setMarkasread(String markasread) {
    this.markasread = markasread;
  }


  public ModForumSetPinState200ResponseUrls pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * pin
   * @return pin
  **/
  @javax.annotation.Nullable
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }


  public ModForumSetPinState200ResponseUrls subscribe(String subscribe) {
    this.subscribe = subscribe;
    return this;
  }

   /**
   * subscribe
   * @return subscribe
  **/
  @javax.annotation.Nonnull
  public String getSubscribe() {
    return subscribe;
  }

  public void setSubscribe(String subscribe) {
    this.subscribe = subscribe;
  }


  public ModForumSetPinState200ResponseUrls view(String view) {
    this.view = view;
    return this;
  }

   /**
   * view
   * @return view
  **/
  @javax.annotation.Nonnull
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }


  public ModForumSetPinState200ResponseUrls viewfirstunread(String viewfirstunread) {
    this.viewfirstunread = viewfirstunread;
    return this;
  }

   /**
   * viewfirstunread
   * @return viewfirstunread
  **/
  @javax.annotation.Nullable
  public String getViewfirstunread() {
    return viewfirstunread;
  }

  public void setViewfirstunread(String viewfirstunread) {
    this.viewfirstunread = viewfirstunread;
  }


  public ModForumSetPinState200ResponseUrls viewlatest(String viewlatest) {
    this.viewlatest = viewlatest;
    return this;
  }

   /**
   * viewlatest
   * @return viewlatest
  **/
  @javax.annotation.Nullable
  public String getViewlatest() {
    return viewlatest;
  }

  public void setViewlatest(String viewlatest) {
    this.viewlatest = viewlatest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModForumSetPinState200ResponseUrls modForumSetPinState200ResponseUrls = (ModForumSetPinState200ResponseUrls) o;
    return Objects.equals(this.markasread, modForumSetPinState200ResponseUrls.markasread) &&
        Objects.equals(this.pin, modForumSetPinState200ResponseUrls.pin) &&
        Objects.equals(this.subscribe, modForumSetPinState200ResponseUrls.subscribe) &&
        Objects.equals(this.view, modForumSetPinState200ResponseUrls.view) &&
        Objects.equals(this.viewfirstunread, modForumSetPinState200ResponseUrls.viewfirstunread) &&
        Objects.equals(this.viewlatest, modForumSetPinState200ResponseUrls.viewlatest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markasread, pin, subscribe, view, viewfirstunread, viewlatest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModForumSetPinState200ResponseUrls {\n");
    sb.append("    markasread: ").append(toIndentedString(markasread)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    subscribe: ").append(toIndentedString(subscribe)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewfirstunread: ").append(toIndentedString(viewfirstunread)).append("\n");
    sb.append("    viewlatest: ").append(toIndentedString(viewlatest)).append("\n");
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
    openapiFields.add("markasread");
    openapiFields.add("pin");
    openapiFields.add("subscribe");
    openapiFields.add("view");
    openapiFields.add("viewfirstunread");
    openapiFields.add("viewlatest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("markasread");
    openapiRequiredFields.add("subscribe");
    openapiRequiredFields.add("view");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModForumSetPinState200ResponseUrls
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModForumSetPinState200ResponseUrls.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModForumSetPinState200ResponseUrls is not found in the empty JSON string", ModForumSetPinState200ResponseUrls.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModForumSetPinState200ResponseUrls.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModForumSetPinState200ResponseUrls` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModForumSetPinState200ResponseUrls.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("markasread").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `markasread` to be a primitive type in the JSON string but got `%s`", jsonObj.get("markasread").toString()));
      }
      if ((jsonObj.get("pin") != null && !jsonObj.get("pin").isJsonNull()) && !jsonObj.get("pin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin").toString()));
      }
      if (!jsonObj.get("subscribe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe").toString()));
      }
      if (!jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
      if ((jsonObj.get("viewfirstunread") != null && !jsonObj.get("viewfirstunread").isJsonNull()) && !jsonObj.get("viewfirstunread").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewfirstunread` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewfirstunread").toString()));
      }
      if ((jsonObj.get("viewlatest") != null && !jsonObj.get("viewlatest").isJsonNull()) && !jsonObj.get("viewlatest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewlatest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewlatest").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModForumSetPinState200ResponseUrls.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModForumSetPinState200ResponseUrls' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModForumSetPinState200ResponseUrls> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModForumSetPinState200ResponseUrls.class));

       return (TypeAdapter<T>) new TypeAdapter<ModForumSetPinState200ResponseUrls>() {
           @Override
           public void write(JsonWriter out, ModForumSetPinState200ResponseUrls value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModForumSetPinState200ResponseUrls read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModForumSetPinState200ResponseUrls given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModForumSetPinState200ResponseUrls
  * @throws IOException if the JSON string is invalid with respect to ModForumSetPinState200ResponseUrls
  */
  public static ModForumSetPinState200ResponseUrls fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModForumSetPinState200ResponseUrls.class);
  }

 /**
  * Convert an instance of ModForumSetPinState200ResponseUrls to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


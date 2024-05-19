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
 * CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action = "null";

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = false;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner() {
  }

  public CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner action(String action) {
    this.action = action;
    return this;
  }

   /**
   * action
   * @return action
  **/
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner coreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner = (CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner) o;
    return Objects.equals(this.action, coreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.action) &&
        Objects.equals(this.disabled, coreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.disabled) &&
        Objects.equals(this.identifier, coreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.identifier) &&
        Objects.equals(this.name, coreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.name) &&
        Objects.equals(this.title, coreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, disabled, identifier, name, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("disabled");
    openapiFields.add("identifier");
    openapiFields.add("name");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner is not found in the empty JSON string", CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner>() {
           @Override
           public void write(JsonWriter out, CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
  * @throws IOException if the JSON string is invalid with respect to CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner
  */
  public static CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.class);
  }

 /**
  * Convert an instance of CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


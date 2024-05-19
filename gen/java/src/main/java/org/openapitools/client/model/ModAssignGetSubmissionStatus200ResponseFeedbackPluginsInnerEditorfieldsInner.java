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
 * ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "null";

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private Integer format;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = "null";

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner() {
  }

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * field description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner format(Integer format) {
    this.format = format;
    return this;
  }

   /**
   * text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return format
  **/
  @javax.annotation.Nullable
  public Integer getFormat() {
    return format;
  }

  public void setFormat(Integer format) {
    this.format = format;
  }


  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * field name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * field value
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner = (ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner) o;
    return Objects.equals(this.description, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.description) &&
        Objects.equals(this.format, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.format) &&
        Objects.equals(this.name, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.name) &&
        Objects.equals(this.text, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, format, name, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("format");
    openapiFields.add("name");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner is not found in the empty JSON string", ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner
  */
  public static ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


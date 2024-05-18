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
 * CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon {
  public static final String SERIALIZED_NAME_ALTTEXT = "alttext";
  @SerializedName(SERIALIZED_NAME_ALTTEXT)
  private String alttext;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon() {
  }

  public CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon alttext(String alttext) {
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


  public CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon component(String component) {
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


  public CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon key(String key) {
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
    CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon coreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon = (CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon) o;
    return Objects.equals(this.alttext, coreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.alttext) &&
        Objects.equals(this.component, coreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.component) &&
        Objects.equals(this.key, coreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alttext, component, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon {\n");
    sb.append("    alttext: ").append(toIndentedString(alttext)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alttext");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("key");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon is not found in the empty JSON string", CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.openapiRequiredFields) {
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
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon>() {
           @Override
           public void write(JsonWriter out, CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon
  * @throws IOException if the JSON string is invalid with respect to CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon
  */
  public static CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.class);
  }

 /**
  * Convert an instance of CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


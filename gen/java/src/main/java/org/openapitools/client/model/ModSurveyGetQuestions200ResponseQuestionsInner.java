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
 * Questions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModSurveyGetQuestions200ResponseQuestionsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_INTRO = "intro";
  @SerializedName(SERIALIZED_NAME_INTRO)
  private String intro = "null";

  public static final String SERIALIZED_NAME_MULTI = "multi";
  @SerializedName(SERIALIZED_NAME_MULTI)
  private String multi = "null";

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private String options = "null";

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private Integer parent = null;

  public static final String SERIALIZED_NAME_SHORTTEXT = "shorttext";
  @SerializedName(SERIALIZED_NAME_SHORTTEXT)
  private String shorttext = "null";

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = "null";

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type = null;

  public ModSurveyGetQuestions200ResponseQuestionsInner() {
  }

  public ModSurveyGetQuestions200ResponseQuestionsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Question id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModSurveyGetQuestions200ResponseQuestionsInner intro(String intro) {
    this.intro = intro;
    return this;
  }

   /**
   * The question intro
   * @return intro
  **/
  @javax.annotation.Nullable
  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }


  public ModSurveyGetQuestions200ResponseQuestionsInner multi(String multi) {
    this.multi = multi;
    return this;
  }

   /**
   * Subquestions ids
   * @return multi
  **/
  @javax.annotation.Nullable
  public String getMulti() {
    return multi;
  }

  public void setMulti(String multi) {
    this.multi = multi;
  }


  public ModSurveyGetQuestions200ResponseQuestionsInner options(String options) {
    this.options = options;
    return this;
  }

   /**
   * Question options
   * @return options
  **/
  @javax.annotation.Nullable
  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
  }


  public ModSurveyGetQuestions200ResponseQuestionsInner parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Parent question (for subquestions)
   * @return parent
  **/
  @javax.annotation.Nullable
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }


  public ModSurveyGetQuestions200ResponseQuestionsInner shorttext(String shorttext) {
    this.shorttext = shorttext;
    return this;
  }

   /**
   * Question short text
   * @return shorttext
  **/
  @javax.annotation.Nullable
  public String getShorttext() {
    return shorttext;
  }

  public void setShorttext(String shorttext) {
    this.shorttext = shorttext;
  }


  public ModSurveyGetQuestions200ResponseQuestionsInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Question text
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public ModSurveyGetQuestions200ResponseQuestionsInner type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Question type
   * @return type
  **/
  @javax.annotation.Nullable
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModSurveyGetQuestions200ResponseQuestionsInner modSurveyGetQuestions200ResponseQuestionsInner = (ModSurveyGetQuestions200ResponseQuestionsInner) o;
    return Objects.equals(this.id, modSurveyGetQuestions200ResponseQuestionsInner.id) &&
        Objects.equals(this.intro, modSurveyGetQuestions200ResponseQuestionsInner.intro) &&
        Objects.equals(this.multi, modSurveyGetQuestions200ResponseQuestionsInner.multi) &&
        Objects.equals(this.options, modSurveyGetQuestions200ResponseQuestionsInner.options) &&
        Objects.equals(this.parent, modSurveyGetQuestions200ResponseQuestionsInner.parent) &&
        Objects.equals(this.shorttext, modSurveyGetQuestions200ResponseQuestionsInner.shorttext) &&
        Objects.equals(this.text, modSurveyGetQuestions200ResponseQuestionsInner.text) &&
        Objects.equals(this.type, modSurveyGetQuestions200ResponseQuestionsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, intro, multi, options, parent, shorttext, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModSurveyGetQuestions200ResponseQuestionsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    shorttext: ").append(toIndentedString(shorttext)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("intro");
    openapiFields.add("multi");
    openapiFields.add("options");
    openapiFields.add("parent");
    openapiFields.add("shorttext");
    openapiFields.add("text");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModSurveyGetQuestions200ResponseQuestionsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModSurveyGetQuestions200ResponseQuestionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModSurveyGetQuestions200ResponseQuestionsInner is not found in the empty JSON string", ModSurveyGetQuestions200ResponseQuestionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModSurveyGetQuestions200ResponseQuestionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModSurveyGetQuestions200ResponseQuestionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("intro") != null && !jsonObj.get("intro").isJsonNull()) && !jsonObj.get("intro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intro").toString()));
      }
      if ((jsonObj.get("multi") != null && !jsonObj.get("multi").isJsonNull()) && !jsonObj.get("multi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `multi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("multi").toString()));
      }
      if ((jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) && !jsonObj.get("options").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be a primitive type in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
      if ((jsonObj.get("shorttext") != null && !jsonObj.get("shorttext").isJsonNull()) && !jsonObj.get("shorttext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shorttext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shorttext").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModSurveyGetQuestions200ResponseQuestionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModSurveyGetQuestions200ResponseQuestionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModSurveyGetQuestions200ResponseQuestionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModSurveyGetQuestions200ResponseQuestionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModSurveyGetQuestions200ResponseQuestionsInner>() {
           @Override
           public void write(JsonWriter out, ModSurveyGetQuestions200ResponseQuestionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModSurveyGetQuestions200ResponseQuestionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModSurveyGetQuestions200ResponseQuestionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModSurveyGetQuestions200ResponseQuestionsInner
  * @throws IOException if the JSON string is invalid with respect to ModSurveyGetQuestions200ResponseQuestionsInner
  */
  public static ModSurveyGetQuestions200ResponseQuestionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModSurveyGetQuestions200ResponseQuestionsInner.class);
  }

 /**
  * Convert an instance of ModSurveyGetQuestions200ResponseQuestionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

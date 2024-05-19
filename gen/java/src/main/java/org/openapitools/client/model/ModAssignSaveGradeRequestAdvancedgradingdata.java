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
import org.openapitools.client.model.ModAssignSaveGradeRequestAdvancedgradingdataGuide;
import org.openapitools.client.model.ModAssignSaveGradeRequestAdvancedgradingdataRubric;

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
 * ModAssignSaveGradeRequestAdvancedgradingdata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignSaveGradeRequestAdvancedgradingdata {
  public static final String SERIALIZED_NAME_GUIDE = "guide";
  @SerializedName(SERIALIZED_NAME_GUIDE)
  private ModAssignSaveGradeRequestAdvancedgradingdataGuide guide;

  public static final String SERIALIZED_NAME_RUBRIC = "rubric";
  @SerializedName(SERIALIZED_NAME_RUBRIC)
  private ModAssignSaveGradeRequestAdvancedgradingdataRubric rubric;

  public ModAssignSaveGradeRequestAdvancedgradingdata() {
  }

  public ModAssignSaveGradeRequestAdvancedgradingdata guide(ModAssignSaveGradeRequestAdvancedgradingdataGuide guide) {
    this.guide = guide;
    return this;
  }

   /**
   * Get guide
   * @return guide
  **/
  @javax.annotation.Nullable
  public ModAssignSaveGradeRequestAdvancedgradingdataGuide getGuide() {
    return guide;
  }

  public void setGuide(ModAssignSaveGradeRequestAdvancedgradingdataGuide guide) {
    this.guide = guide;
  }


  public ModAssignSaveGradeRequestAdvancedgradingdata rubric(ModAssignSaveGradeRequestAdvancedgradingdataRubric rubric) {
    this.rubric = rubric;
    return this;
  }

   /**
   * Get rubric
   * @return rubric
  **/
  @javax.annotation.Nullable
  public ModAssignSaveGradeRequestAdvancedgradingdataRubric getRubric() {
    return rubric;
  }

  public void setRubric(ModAssignSaveGradeRequestAdvancedgradingdataRubric rubric) {
    this.rubric = rubric;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignSaveGradeRequestAdvancedgradingdata modAssignSaveGradeRequestAdvancedgradingdata = (ModAssignSaveGradeRequestAdvancedgradingdata) o;
    return Objects.equals(this.guide, modAssignSaveGradeRequestAdvancedgradingdata.guide) &&
        Objects.equals(this.rubric, modAssignSaveGradeRequestAdvancedgradingdata.rubric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guide, rubric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignSaveGradeRequestAdvancedgradingdata {\n");
    sb.append("    guide: ").append(toIndentedString(guide)).append("\n");
    sb.append("    rubric: ").append(toIndentedString(rubric)).append("\n");
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
    openapiFields.add("guide");
    openapiFields.add("rubric");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignSaveGradeRequestAdvancedgradingdata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignSaveGradeRequestAdvancedgradingdata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignSaveGradeRequestAdvancedgradingdata is not found in the empty JSON string", ModAssignSaveGradeRequestAdvancedgradingdata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignSaveGradeRequestAdvancedgradingdata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignSaveGradeRequestAdvancedgradingdata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `guide`
      if (jsonObj.get("guide") != null && !jsonObj.get("guide").isJsonNull()) {
        ModAssignSaveGradeRequestAdvancedgradingdataGuide.validateJsonElement(jsonObj.get("guide"));
      }
      // validate the optional field `rubric`
      if (jsonObj.get("rubric") != null && !jsonObj.get("rubric").isJsonNull()) {
        ModAssignSaveGradeRequestAdvancedgradingdataRubric.validateJsonElement(jsonObj.get("rubric"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignSaveGradeRequestAdvancedgradingdata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignSaveGradeRequestAdvancedgradingdata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignSaveGradeRequestAdvancedgradingdata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignSaveGradeRequestAdvancedgradingdata.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignSaveGradeRequestAdvancedgradingdata>() {
           @Override
           public void write(JsonWriter out, ModAssignSaveGradeRequestAdvancedgradingdata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignSaveGradeRequestAdvancedgradingdata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignSaveGradeRequestAdvancedgradingdata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignSaveGradeRequestAdvancedgradingdata
  * @throws IOException if the JSON string is invalid with respect to ModAssignSaveGradeRequestAdvancedgradingdata
  */
  public static ModAssignSaveGradeRequestAdvancedgradingdata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignSaveGradeRequestAdvancedgradingdata.class);
  }

 /**
  * Convert an instance of ModAssignSaveGradeRequestAdvancedgradingdata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


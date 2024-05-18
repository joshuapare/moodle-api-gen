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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner;

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
 * CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric {
  public static final String SERIALIZED_NAME_RUBRIC_CRITERIA = "rubric_criteria";
  @SerializedName(SERIALIZED_NAME_RUBRIC_CRITERIA)
  private List<CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner> rubricCriteria = new ArrayList<>();

  public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric() {
  }

  public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric rubricCriteria(List<CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner> rubricCriteria) {
    this.rubricCriteria = rubricCriteria;
    return this;
  }

  public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric addRubricCriteriaItem(CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner rubricCriteriaItem) {
    if (this.rubricCriteria == null) {
      this.rubricCriteria = new ArrayList<>();
    }
    this.rubricCriteria.add(rubricCriteriaItem);
    return this;
  }

   /**
   * Get rubricCriteria
   * @return rubricCriteria
  **/
  @javax.annotation.Nullable
  public List<CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner> getRubricCriteria() {
    return rubricCriteria;
  }

  public void setRubricCriteria(List<CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner> rubricCriteria) {
    this.rubricCriteria = rubricCriteria;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric coreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric = (CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric) o;
    return Objects.equals(this.rubricCriteria, coreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.rubricCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rubricCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric {\n");
    sb.append("    rubricCriteria: ").append(toIndentedString(rubricCriteria)).append("\n");
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
    openapiFields.add("rubric_criteria");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric is not found in the empty JSON string", CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rubric_criteria") != null && !jsonObj.get("rubric_criteria").isJsonNull()) {
        JsonArray jsonArrayrubricCriteria = jsonObj.getAsJsonArray("rubric_criteria");
        if (jsonArrayrubricCriteria != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rubric_criteria").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rubric_criteria` to be an array in the JSON string but got `%s`", jsonObj.get("rubric_criteria").toString()));
          }

          // validate the optional field `rubric_criteria` (array)
          for (int i = 0; i < jsonArrayrubricCriteria.size(); i++) {
            CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner.validateJsonElement(jsonArrayrubricCriteria.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric>() {
           @Override
           public void write(JsonWriter out, CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric
  * @throws IOException if the JSON string is invalid with respect to CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric
  */
  public static CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.class);
  }

 /**
  * Convert an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

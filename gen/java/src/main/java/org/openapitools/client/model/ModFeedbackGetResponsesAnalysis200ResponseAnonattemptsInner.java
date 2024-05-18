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
import org.openapitools.client.model.ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner;

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
 * ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner {
  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number = null;

  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner> responses = new ArrayList<>();

  public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner() {
  }

  public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Course id
   * @return courseid
  **/
  @javax.annotation.Nullable
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Completed id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Response number
   * @return number
  **/
  @javax.annotation.Nullable
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner responses(List<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner> responses) {
    this.responses = responses;
    return this;
  }

  public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner addResponsesItem(ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  @javax.annotation.Nullable
  public List<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner> getResponses() {
    return responses;
  }

  public void setResponses(List<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner> responses) {
    this.responses = responses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner modFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner = (ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner) o;
    return Objects.equals(this.courseid, modFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.courseid) &&
        Objects.equals(this.id, modFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.id) &&
        Objects.equals(this.number, modFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.number) &&
        Objects.equals(this.responses, modFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseid, id, number, responses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner {\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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
    openapiFields.add("courseid");
    openapiFields.add("id");
    openapiFields.add("number");
    openapiFields.add("responses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner is not found in the empty JSON string", ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("responses") != null && !jsonObj.get("responses").isJsonNull()) {
        JsonArray jsonArrayresponses = jsonObj.getAsJsonArray("responses");
        if (jsonArrayresponses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("responses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `responses` to be an array in the JSON string but got `%s`", jsonObj.get("responses").toString()));
          }

          // validate the optional field `responses` (array)
          for (int i = 0; i < jsonArrayresponses.size(); i++) {
            ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner.validateJsonElement(jsonArrayresponses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner>() {
           @Override
           public void write(JsonWriter out, ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner
  * @throws IOException if the JSON string is invalid with respect to ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner
  */
  public static ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.class);
  }

 /**
  * Convert an instance of ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


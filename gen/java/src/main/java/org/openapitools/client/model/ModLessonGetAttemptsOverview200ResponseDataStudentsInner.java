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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner;

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
 * ModLessonGetAttemptsOverview200ResponseDataStudentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLessonGetAttemptsOverview200ResponseDataStudentsInner {
  public static final String SERIALIZED_NAME_ATTEMPTS = "attempts";
  @SerializedName(SERIALIZED_NAME_ATTEMPTS)
  private List<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner> attempts = new ArrayList<>();

  public static final String SERIALIZED_NAME_BESTGRADE = "bestgrade";
  @SerializedName(SERIALIZED_NAME_BESTGRADE)
  private BigDecimal bestgrade = new BigDecimal("null");

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public ModLessonGetAttemptsOverview200ResponseDataStudentsInner() {
  }

  public ModLessonGetAttemptsOverview200ResponseDataStudentsInner attempts(List<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner> attempts) {
    this.attempts = attempts;
    return this;
  }

  public ModLessonGetAttemptsOverview200ResponseDataStudentsInner addAttemptsItem(ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner attemptsItem) {
    if (this.attempts == null) {
      this.attempts = new ArrayList<>();
    }
    this.attempts.add(attemptsItem);
    return this;
  }

   /**
   * Get attempts
   * @return attempts
  **/
  @javax.annotation.Nullable
  public List<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner> getAttempts() {
    return attempts;
  }

  public void setAttempts(List<ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner> attempts) {
    this.attempts = attempts;
  }


  public ModLessonGetAttemptsOverview200ResponseDataStudentsInner bestgrade(BigDecimal bestgrade) {
    this.bestgrade = bestgrade;
    return this;
  }

   /**
   * Best grade.
   * @return bestgrade
  **/
  @javax.annotation.Nullable
  public BigDecimal getBestgrade() {
    return bestgrade;
  }

  public void setBestgrade(BigDecimal bestgrade) {
    this.bestgrade = bestgrade;
  }


  public ModLessonGetAttemptsOverview200ResponseDataStudentsInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * User full name.
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public ModLessonGetAttemptsOverview200ResponseDataStudentsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * User id.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLessonGetAttemptsOverview200ResponseDataStudentsInner modLessonGetAttemptsOverview200ResponseDataStudentsInner = (ModLessonGetAttemptsOverview200ResponseDataStudentsInner) o;
    return Objects.equals(this.attempts, modLessonGetAttemptsOverview200ResponseDataStudentsInner.attempts) &&
        Objects.equals(this.bestgrade, modLessonGetAttemptsOverview200ResponseDataStudentsInner.bestgrade) &&
        Objects.equals(this.fullname, modLessonGetAttemptsOverview200ResponseDataStudentsInner.fullname) &&
        Objects.equals(this.id, modLessonGetAttemptsOverview200ResponseDataStudentsInner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempts, bestgrade, fullname, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLessonGetAttemptsOverview200ResponseDataStudentsInner {\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    bestgrade: ").append(toIndentedString(bestgrade)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("attempts");
    openapiFields.add("bestgrade");
    openapiFields.add("fullname");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLessonGetAttemptsOverview200ResponseDataStudentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLessonGetAttemptsOverview200ResponseDataStudentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLessonGetAttemptsOverview200ResponseDataStudentsInner is not found in the empty JSON string", ModLessonGetAttemptsOverview200ResponseDataStudentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLessonGetAttemptsOverview200ResponseDataStudentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLessonGetAttemptsOverview200ResponseDataStudentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("attempts") != null && !jsonObj.get("attempts").isJsonNull()) {
        JsonArray jsonArrayattempts = jsonObj.getAsJsonArray("attempts");
        if (jsonArrayattempts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attempts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attempts` to be an array in the JSON string but got `%s`", jsonObj.get("attempts").toString()));
          }

          // validate the optional field `attempts` (array)
          for (int i = 0; i < jsonArrayattempts.size(); i++) {
            ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.validateJsonElement(jsonArrayattempts.get(i));
          };
        }
      }
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLessonGetAttemptsOverview200ResponseDataStudentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLessonGetAttemptsOverview200ResponseDataStudentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLessonGetAttemptsOverview200ResponseDataStudentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLessonGetAttemptsOverview200ResponseDataStudentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLessonGetAttemptsOverview200ResponseDataStudentsInner>() {
           @Override
           public void write(JsonWriter out, ModLessonGetAttemptsOverview200ResponseDataStudentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLessonGetAttemptsOverview200ResponseDataStudentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLessonGetAttemptsOverview200ResponseDataStudentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLessonGetAttemptsOverview200ResponseDataStudentsInner
  * @throws IOException if the JSON string is invalid with respect to ModLessonGetAttemptsOverview200ResponseDataStudentsInner
  */
  public static ModLessonGetAttemptsOverview200ResponseDataStudentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLessonGetAttemptsOverview200ResponseDataStudentsInner.class);
  }

 /**
  * Convert an instance of ModLessonGetAttemptsOverview200ResponseDataStudentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


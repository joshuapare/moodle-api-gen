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
 * ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings {
  public static final String SERIALIZED_NAME_ENABLESAVESTATE = "enablesavestate";
  @SerializedName(SERIALIZED_NAME_ENABLESAVESTATE)
  private Boolean enablesavestate = null;

  public static final String SERIALIZED_NAME_SAVESTATEFREQ = "savestatefreq";
  @SerializedName(SERIALIZED_NAME_SAVESTATEFREQ)
  private Integer savestatefreq = null;

  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings() {
  }

  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings enablesavestate(Boolean enablesavestate) {
    this.enablesavestate = enablesavestate;
    return this;
  }

   /**
   * Whether saving state is enabled.
   * @return enablesavestate
  **/
  @javax.annotation.Nonnull
  public Boolean getEnablesavestate() {
    return enablesavestate;
  }

  public void setEnablesavestate(Boolean enablesavestate) {
    this.enablesavestate = enablesavestate;
  }


  public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings savestatefreq(Integer savestatefreq) {
    this.savestatefreq = savestatefreq;
    return this;
  }

   /**
   * How often (in seconds) state is saved.
   * @return savestatefreq
  **/
  @javax.annotation.Nullable
  public Integer getSavestatefreq() {
    return savestatefreq;
  }

  public void setSavestatefreq(Integer savestatefreq) {
    this.savestatefreq = savestatefreq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings modH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings = (ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings) o;
    return Objects.equals(this.enablesavestate, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.enablesavestate) &&
        Objects.equals(this.savestatefreq, modH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.savestatefreq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablesavestate, savestatefreq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings {\n");
    sb.append("    enablesavestate: ").append(toIndentedString(enablesavestate)).append("\n");
    sb.append("    savestatefreq: ").append(toIndentedString(savestatefreq)).append("\n");
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
    openapiFields.add("enablesavestate");
    openapiFields.add("savestatefreq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enablesavestate");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings is not found in the empty JSON string", ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings>() {
           @Override
           public void write(JsonWriter out, ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings
  * @throws IOException if the JSON string is invalid with respect to ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings
  */
  public static ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.class);
  }

 /**
  * Convert an instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


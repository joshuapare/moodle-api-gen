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
import org.openapitools.client.model.AuthEmailSignupUser200ResponseWarningsInner;
import org.openapitools.client.model.ModImscpGetImscpsByCourses200ResponseImscpsInner;

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
 * ModImscpGetImscpsByCourses200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModImscpGetImscpsByCourses200Response {
  public static final String SERIALIZED_NAME_IMSCPS = "imscps";
  @SerializedName(SERIALIZED_NAME_IMSCPS)
  private List<ModImscpGetImscpsByCourses200ResponseImscpsInner> imscps = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModImscpGetImscpsByCourses200Response() {
  }

  public ModImscpGetImscpsByCourses200Response imscps(List<ModImscpGetImscpsByCourses200ResponseImscpsInner> imscps) {
    this.imscps = imscps;
    return this;
  }

  public ModImscpGetImscpsByCourses200Response addImscpsItem(ModImscpGetImscpsByCourses200ResponseImscpsInner imscpsItem) {
    if (this.imscps == null) {
      this.imscps = new ArrayList<>();
    }
    this.imscps.add(imscpsItem);
    return this;
  }

   /**
   * Get imscps
   * @return imscps
  **/
  @javax.annotation.Nonnull
  public List<ModImscpGetImscpsByCourses200ResponseImscpsInner> getImscps() {
    return imscps;
  }

  public void setImscps(List<ModImscpGetImscpsByCourses200ResponseImscpsInner> imscps) {
    this.imscps = imscps;
  }


  public ModImscpGetImscpsByCourses200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModImscpGetImscpsByCourses200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  public List<AuthEmailSignupUser200ResponseWarningsInner> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModImscpGetImscpsByCourses200Response modImscpGetImscpsByCourses200Response = (ModImscpGetImscpsByCourses200Response) o;
    return Objects.equals(this.imscps, modImscpGetImscpsByCourses200Response.imscps) &&
        Objects.equals(this.warnings, modImscpGetImscpsByCourses200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imscps, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModImscpGetImscpsByCourses200Response {\n");
    sb.append("    imscps: ").append(toIndentedString(imscps)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("imscps");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("imscps");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModImscpGetImscpsByCourses200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModImscpGetImscpsByCourses200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModImscpGetImscpsByCourses200Response is not found in the empty JSON string", ModImscpGetImscpsByCourses200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModImscpGetImscpsByCourses200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModImscpGetImscpsByCourses200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModImscpGetImscpsByCourses200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("imscps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imscps` to be an array in the JSON string but got `%s`", jsonObj.get("imscps").toString()));
      }

      JsonArray jsonArrayimscps = jsonObj.getAsJsonArray("imscps");
      // validate the required field `imscps` (array)
      for (int i = 0; i < jsonArrayimscps.size(); i++) {
        ModImscpGetImscpsByCourses200ResponseImscpsInner.validateJsonElement(jsonArrayimscps.get(i));
      };
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) {
        JsonArray jsonArraywarnings = jsonObj.getAsJsonArray("warnings");
        if (jsonArraywarnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
          }

          // validate the optional field `warnings` (array)
          for (int i = 0; i < jsonArraywarnings.size(); i++) {
            AuthEmailSignupUser200ResponseWarningsInner.validateJsonElement(jsonArraywarnings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModImscpGetImscpsByCourses200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModImscpGetImscpsByCourses200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModImscpGetImscpsByCourses200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModImscpGetImscpsByCourses200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModImscpGetImscpsByCourses200Response>() {
           @Override
           public void write(JsonWriter out, ModImscpGetImscpsByCourses200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModImscpGetImscpsByCourses200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModImscpGetImscpsByCourses200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModImscpGetImscpsByCourses200Response
  * @throws IOException if the JSON string is invalid with respect to ModImscpGetImscpsByCourses200Response
  */
  public static ModImscpGetImscpsByCourses200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModImscpGetImscpsByCourses200Response.class);
  }

 /**
  * Convert an instance of ModImscpGetImscpsByCourses200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


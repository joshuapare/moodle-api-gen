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
import org.openapitools.client.model.ModDataUpdateEntry200ResponseFieldnotificationsInner;

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
 * ModDataUpdateEntry200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataUpdateEntry200Response {
  public static final String SERIALIZED_NAME_FIELDNOTIFICATIONS = "fieldnotifications";
  @SerializedName(SERIALIZED_NAME_FIELDNOTIFICATIONS)
  private List<ModDataUpdateEntry200ResponseFieldnotificationsInner> fieldnotifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_GENERALNOTIFICATIONS = "generalnotifications";
  @SerializedName(SERIALIZED_NAME_GENERALNOTIFICATIONS)
  private List<Object> generalnotifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Boolean updated = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModDataUpdateEntry200Response() {
  }

  public ModDataUpdateEntry200Response fieldnotifications(List<ModDataUpdateEntry200ResponseFieldnotificationsInner> fieldnotifications) {
    this.fieldnotifications = fieldnotifications;
    return this;
  }

  public ModDataUpdateEntry200Response addFieldnotificationsItem(ModDataUpdateEntry200ResponseFieldnotificationsInner fieldnotificationsItem) {
    if (this.fieldnotifications == null) {
      this.fieldnotifications = new ArrayList<>();
    }
    this.fieldnotifications.add(fieldnotificationsItem);
    return this;
  }

   /**
   * Get fieldnotifications
   * @return fieldnotifications
  **/
  @javax.annotation.Nonnull
  public List<ModDataUpdateEntry200ResponseFieldnotificationsInner> getFieldnotifications() {
    return fieldnotifications;
  }

  public void setFieldnotifications(List<ModDataUpdateEntry200ResponseFieldnotificationsInner> fieldnotifications) {
    this.fieldnotifications = fieldnotifications;
  }


  public ModDataUpdateEntry200Response generalnotifications(List<Object> generalnotifications) {
    this.generalnotifications = generalnotifications;
    return this;
  }

  public ModDataUpdateEntry200Response addGeneralnotificationsItem(Object generalnotificationsItem) {
    if (this.generalnotifications == null) {
      this.generalnotifications = new ArrayList<>();
    }
    this.generalnotifications.add(generalnotificationsItem);
    return this;
  }

   /**
   * Get generalnotifications
   * @return generalnotifications
  **/
  @javax.annotation.Nonnull
  public List<Object> getGeneralnotifications() {
    return generalnotifications;
  }

  public void setGeneralnotifications(List<Object> generalnotifications) {
    this.generalnotifications = generalnotifications;
  }


  public ModDataUpdateEntry200Response updated(Boolean updated) {
    this.updated = updated;
    return this;
  }

   /**
   * True if the entry was successfully updated, false other wise.
   * @return updated
  **/
  @javax.annotation.Nonnull
  public Boolean getUpdated() {
    return updated;
  }

  public void setUpdated(Boolean updated) {
    this.updated = updated;
  }


  public ModDataUpdateEntry200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModDataUpdateEntry200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ModDataUpdateEntry200Response modDataUpdateEntry200Response = (ModDataUpdateEntry200Response) o;
    return Objects.equals(this.fieldnotifications, modDataUpdateEntry200Response.fieldnotifications) &&
        Objects.equals(this.generalnotifications, modDataUpdateEntry200Response.generalnotifications) &&
        Objects.equals(this.updated, modDataUpdateEntry200Response.updated) &&
        Objects.equals(this.warnings, modDataUpdateEntry200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldnotifications, generalnotifications, updated, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataUpdateEntry200Response {\n");
    sb.append("    fieldnotifications: ").append(toIndentedString(fieldnotifications)).append("\n");
    sb.append("    generalnotifications: ").append(toIndentedString(generalnotifications)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("fieldnotifications");
    openapiFields.add("generalnotifications");
    openapiFields.add("updated");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldnotifications");
    openapiRequiredFields.add("generalnotifications");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataUpdateEntry200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataUpdateEntry200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataUpdateEntry200Response is not found in the empty JSON string", ModDataUpdateEntry200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataUpdateEntry200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataUpdateEntry200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModDataUpdateEntry200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("fieldnotifications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldnotifications` to be an array in the JSON string but got `%s`", jsonObj.get("fieldnotifications").toString()));
      }

      JsonArray jsonArrayfieldnotifications = jsonObj.getAsJsonArray("fieldnotifications");
      // validate the required field `fieldnotifications` (array)
      for (int i = 0; i < jsonArrayfieldnotifications.size(); i++) {
        ModDataUpdateEntry200ResponseFieldnotificationsInner.validateJsonElement(jsonArrayfieldnotifications.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("generalnotifications") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("generalnotifications").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `generalnotifications` to be an array in the JSON string but got `%s`", jsonObj.get("generalnotifications").toString()));
      }
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
       if (!ModDataUpdateEntry200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataUpdateEntry200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataUpdateEntry200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataUpdateEntry200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataUpdateEntry200Response>() {
           @Override
           public void write(JsonWriter out, ModDataUpdateEntry200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataUpdateEntry200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataUpdateEntry200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataUpdateEntry200Response
  * @throws IOException if the JSON string is invalid with respect to ModDataUpdateEntry200Response
  */
  public static ModDataUpdateEntry200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataUpdateEntry200Response.class);
  }

 /**
  * Convert an instance of ModDataUpdateEntry200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


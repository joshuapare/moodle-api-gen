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
import org.openapitools.client.model.CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner;
import org.openapitools.client.model.ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner;
import org.openapitools.client.model.ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner;
import org.openapitools.client.model.ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner;
import org.openapitools.client.model.ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner;

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
 * ModWorkshopGetAssessmentFormDefinition200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWorkshopGetAssessmentFormDefinition200Response {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private List<ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner> current = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTIONFILES = "descriptionfiles";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFILES)
  private List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> descriptionfiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIMENSIONSINFO = "dimensionsinfo";
  @SerializedName(SERIALIZED_NAME_DIMENSIONSINFO)
  private List<ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner> dimensionsinfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIMENSSIONSCOUNT = "dimenssionscount";
  @SerializedName(SERIALIZED_NAME_DIMENSSIONSCOUNT)
  private Integer dimenssionscount = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModWorkshopGetAssessmentFormDefinition200Response() {
  }

  public ModWorkshopGetAssessmentFormDefinition200Response current(List<ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner> current) {
    this.current = current;
    return this;
  }

  public ModWorkshopGetAssessmentFormDefinition200Response addCurrentItem(ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner currentItem) {
    if (this.current == null) {
      this.current = new ArrayList<>();
    }
    this.current.add(currentItem);
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nonnull
  public List<ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner> getCurrent() {
    return current;
  }

  public void setCurrent(List<ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner> current) {
    this.current = current;
  }


  public ModWorkshopGetAssessmentFormDefinition200Response descriptionfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> descriptionfiles) {
    this.descriptionfiles = descriptionfiles;
    return this;
  }

  public ModWorkshopGetAssessmentFormDefinition200Response addDescriptionfilesItem(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner descriptionfilesItem) {
    if (this.descriptionfiles == null) {
      this.descriptionfiles = new ArrayList<>();
    }
    this.descriptionfiles.add(descriptionfilesItem);
    return this;
  }

   /**
   * Get descriptionfiles
   * @return descriptionfiles
  **/
  @javax.annotation.Nonnull
  public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> getDescriptionfiles() {
    return descriptionfiles;
  }

  public void setDescriptionfiles(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> descriptionfiles) {
    this.descriptionfiles = descriptionfiles;
  }


  public ModWorkshopGetAssessmentFormDefinition200Response dimensionsinfo(List<ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner> dimensionsinfo) {
    this.dimensionsinfo = dimensionsinfo;
    return this;
  }

  public ModWorkshopGetAssessmentFormDefinition200Response addDimensionsinfoItem(ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner dimensionsinfoItem) {
    if (this.dimensionsinfo == null) {
      this.dimensionsinfo = new ArrayList<>();
    }
    this.dimensionsinfo.add(dimensionsinfoItem);
    return this;
  }

   /**
   * Get dimensionsinfo
   * @return dimensionsinfo
  **/
  @javax.annotation.Nonnull
  public List<ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner> getDimensionsinfo() {
    return dimensionsinfo;
  }

  public void setDimensionsinfo(List<ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner> dimensionsinfo) {
    this.dimensionsinfo = dimensionsinfo;
  }


  public ModWorkshopGetAssessmentFormDefinition200Response dimenssionscount(Integer dimenssionscount) {
    this.dimenssionscount = dimenssionscount;
    return this;
  }

   /**
   * The number of dimenssions used by the form.
   * @return dimenssionscount
  **/
  @javax.annotation.Nonnull
  public Integer getDimenssionscount() {
    return dimenssionscount;
  }

  public void setDimenssionscount(Integer dimenssionscount) {
    this.dimenssionscount = dimenssionscount;
  }


  public ModWorkshopGetAssessmentFormDefinition200Response fields(List<ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner> fields) {
    this.fields = fields;
    return this;
  }

  public ModWorkshopGetAssessmentFormDefinition200Response addFieldsItem(ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nonnull
  public List<ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner> getFields() {
    return fields;
  }

  public void setFields(List<ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner> fields) {
    this.fields = fields;
  }


  public ModWorkshopGetAssessmentFormDefinition200Response options(List<ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner> options) {
    this.options = options;
    return this;
  }

  public ModWorkshopGetAssessmentFormDefinition200Response addOptionsItem(ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nonnull
  public List<ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner> getOptions() {
    return options;
  }

  public void setOptions(List<ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner> options) {
    this.options = options;
  }


  public ModWorkshopGetAssessmentFormDefinition200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModWorkshopGetAssessmentFormDefinition200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ModWorkshopGetAssessmentFormDefinition200Response modWorkshopGetAssessmentFormDefinition200Response = (ModWorkshopGetAssessmentFormDefinition200Response) o;
    return Objects.equals(this.current, modWorkshopGetAssessmentFormDefinition200Response.current) &&
        Objects.equals(this.descriptionfiles, modWorkshopGetAssessmentFormDefinition200Response.descriptionfiles) &&
        Objects.equals(this.dimensionsinfo, modWorkshopGetAssessmentFormDefinition200Response.dimensionsinfo) &&
        Objects.equals(this.dimenssionscount, modWorkshopGetAssessmentFormDefinition200Response.dimenssionscount) &&
        Objects.equals(this.fields, modWorkshopGetAssessmentFormDefinition200Response.fields) &&
        Objects.equals(this.options, modWorkshopGetAssessmentFormDefinition200Response.options) &&
        Objects.equals(this.warnings, modWorkshopGetAssessmentFormDefinition200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, descriptionfiles, dimensionsinfo, dimenssionscount, fields, options, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWorkshopGetAssessmentFormDefinition200Response {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    descriptionfiles: ").append(toIndentedString(descriptionfiles)).append("\n");
    sb.append("    dimensionsinfo: ").append(toIndentedString(dimensionsinfo)).append("\n");
    sb.append("    dimenssionscount: ").append(toIndentedString(dimenssionscount)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("current");
    openapiFields.add("descriptionfiles");
    openapiFields.add("dimensionsinfo");
    openapiFields.add("dimenssionscount");
    openapiFields.add("fields");
    openapiFields.add("options");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("current");
    openapiRequiredFields.add("descriptionfiles");
    openapiRequiredFields.add("dimensionsinfo");
    openapiRequiredFields.add("dimenssionscount");
    openapiRequiredFields.add("fields");
    openapiRequiredFields.add("options");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWorkshopGetAssessmentFormDefinition200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWorkshopGetAssessmentFormDefinition200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWorkshopGetAssessmentFormDefinition200Response is not found in the empty JSON string", ModWorkshopGetAssessmentFormDefinition200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWorkshopGetAssessmentFormDefinition200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWorkshopGetAssessmentFormDefinition200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModWorkshopGetAssessmentFormDefinition200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("current").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `current` to be an array in the JSON string but got `%s`", jsonObj.get("current").toString()));
      }

      JsonArray jsonArraycurrent = jsonObj.getAsJsonArray("current");
      // validate the required field `current` (array)
      for (int i = 0; i < jsonArraycurrent.size(); i++) {
        ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner.validateJsonElement(jsonArraycurrent.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("descriptionfiles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionfiles` to be an array in the JSON string but got `%s`", jsonObj.get("descriptionfiles").toString()));
      }

      JsonArray jsonArraydescriptionfiles = jsonObj.getAsJsonArray("descriptionfiles");
      // validate the required field `descriptionfiles` (array)
      for (int i = 0; i < jsonArraydescriptionfiles.size(); i++) {
        CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.validateJsonElement(jsonArraydescriptionfiles.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("dimensionsinfo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensionsinfo` to be an array in the JSON string but got `%s`", jsonObj.get("dimensionsinfo").toString()));
      }

      JsonArray jsonArraydimensionsinfo = jsonObj.getAsJsonArray("dimensionsinfo");
      // validate the required field `dimensionsinfo` (array)
      for (int i = 0; i < jsonArraydimensionsinfo.size(); i++) {
        ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.validateJsonElement(jsonArraydimensionsinfo.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }

      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      // validate the required field `fields` (array)
      for (int i = 0; i < jsonArrayfields.size(); i++) {
        ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner.validateJsonElement(jsonArrayfields.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }

      JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
      // validate the required field `options` (array)
      for (int i = 0; i < jsonArrayoptions.size(); i++) {
        ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner.validateJsonElement(jsonArrayoptions.get(i));
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
       if (!ModWorkshopGetAssessmentFormDefinition200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWorkshopGetAssessmentFormDefinition200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWorkshopGetAssessmentFormDefinition200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWorkshopGetAssessmentFormDefinition200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWorkshopGetAssessmentFormDefinition200Response>() {
           @Override
           public void write(JsonWriter out, ModWorkshopGetAssessmentFormDefinition200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWorkshopGetAssessmentFormDefinition200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWorkshopGetAssessmentFormDefinition200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWorkshopGetAssessmentFormDefinition200Response
  * @throws IOException if the JSON string is invalid with respect to ModWorkshopGetAssessmentFormDefinition200Response
  */
  public static ModWorkshopGetAssessmentFormDefinition200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWorkshopGetAssessmentFormDefinition200Response.class);
  }

 /**
  * Convert an instance of ModWorkshopGetAssessmentFormDefinition200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner;

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
 * ToolDataprivacyCreatePurposeForm200ResponsePurpose
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolDataprivacyCreatePurposeForm200ResponsePurpose {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = 1;

  public static final String SERIALIZED_NAME_FORMATTEDLAWFULBASES = "formattedlawfulbases";
  @SerializedName(SERIALIZED_NAME_FORMATTEDLAWFULBASES)
  private List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> formattedlawfulbases = new ArrayList<>();

  public static final String SERIALIZED_NAME_FORMATTEDRETENTIONPERIOD = "formattedretentionperiod";
  @SerializedName(SERIALIZED_NAME_FORMATTEDRETENTIONPERIOD)
  private String formattedretentionperiod = "null";

  public static final String SERIALIZED_NAME_FORMATTEDSENSITIVEDATAREASONS = "formattedsensitivedatareasons";
  @SerializedName(SERIALIZED_NAME_FORMATTEDSENSITIVEDATAREASONS)
  private List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> formattedsensitivedatareasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_LAWFULBASES = "lawfulbases";
  @SerializedName(SERIALIZED_NAME_LAWFULBASES)
  private String lawfulbases = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Integer _protected = 0;

  public static final String SERIALIZED_NAME_RETENTIONPERIOD = "retentionperiod";
  @SerializedName(SERIALIZED_NAME_RETENTIONPERIOD)
  private String retentionperiod = "";

  public static final String SERIALIZED_NAME_ROLEOVERRIDES = "roleoverrides";
  @SerializedName(SERIALIZED_NAME_ROLEOVERRIDES)
  private String roleoverrides = "null";

  public static final String SERIALIZED_NAME_SENSITIVEDATAREASONS = "sensitivedatareasons";
  @SerializedName(SERIALIZED_NAME_SENSITIVEDATAREASONS)
  private String sensitivedatareasons = "";

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated = 0;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = 0;

  public static final String SERIALIZED_NAME_USERMODIFIED = "usermodified";
  @SerializedName(SERIALIZED_NAME_USERMODIFIED)
  private Integer usermodified = 0;

  public ToolDataprivacyCreatePurposeForm200ResponsePurpose() {
  }

  public ToolDataprivacyCreatePurposeForm200ResponsePurpose description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The purpose description.
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose descriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
    return this;
  }

   /**
   * description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return descriptionformat
  **/
  @javax.annotation.Nullable
  public Integer getDescriptionformat() {
    return descriptionformat;
  }

  public void setDescriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose formattedlawfulbases(List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> formattedlawfulbases) {
    this.formattedlawfulbases = formattedlawfulbases;
    return this;
  }

  public ToolDataprivacyCreatePurposeForm200ResponsePurpose addFormattedlawfulbasesItem(ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner formattedlawfulbasesItem) {
    if (this.formattedlawfulbases == null) {
      this.formattedlawfulbases = new ArrayList<>();
    }
    this.formattedlawfulbases.add(formattedlawfulbasesItem);
    return this;
  }

   /**
   * Get formattedlawfulbases
   * @return formattedlawfulbases
  **/
  @javax.annotation.Nonnull
  public List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> getFormattedlawfulbases() {
    return formattedlawfulbases;
  }

  public void setFormattedlawfulbases(List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> formattedlawfulbases) {
    this.formattedlawfulbases = formattedlawfulbases;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose formattedretentionperiod(String formattedretentionperiod) {
    this.formattedretentionperiod = formattedretentionperiod;
    return this;
  }

   /**
   * formattedretentionperiod
   * @return formattedretentionperiod
  **/
  @javax.annotation.Nonnull
  public String getFormattedretentionperiod() {
    return formattedretentionperiod;
  }

  public void setFormattedretentionperiod(String formattedretentionperiod) {
    this.formattedretentionperiod = formattedretentionperiod;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose formattedsensitivedatareasons(List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> formattedsensitivedatareasons) {
    this.formattedsensitivedatareasons = formattedsensitivedatareasons;
    return this;
  }

  public ToolDataprivacyCreatePurposeForm200ResponsePurpose addFormattedsensitivedatareasonsItem(ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner formattedsensitivedatareasonsItem) {
    if (this.formattedsensitivedatareasons == null) {
      this.formattedsensitivedatareasons = new ArrayList<>();
    }
    this.formattedsensitivedatareasons.add(formattedsensitivedatareasonsItem);
    return this;
  }

   /**
   * Get formattedsensitivedatareasons
   * @return formattedsensitivedatareasons
  **/
  @javax.annotation.Nullable
  public List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> getFormattedsensitivedatareasons() {
    return formattedsensitivedatareasons;
  }

  public void setFormattedsensitivedatareasons(List<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner> formattedsensitivedatareasons) {
    this.formattedsensitivedatareasons = formattedsensitivedatareasons;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose lawfulbases(String lawfulbases) {
    this.lawfulbases = lawfulbases;
    return this;
  }

   /**
   * Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis.
   * @return lawfulbases
  **/
  @javax.annotation.Nonnull
  public String getLawfulbases() {
    return lawfulbases;
  }

  public void setLawfulbases(String lawfulbases) {
    this.lawfulbases = lawfulbases;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The purpose name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose _protected(Integer _protected) {
    this._protected = _protected;
    return this;
  }

   /**
   * Data retention with higher precedent over user&#39;s request to be forgotten.
   * @return _protected
  **/
  @javax.annotation.Nonnull
  public Integer getProtected() {
    return _protected;
  }

  public void setProtected(Integer _protected) {
    this._protected = _protected;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose retentionperiod(String retentionperiod) {
    this.retentionperiod = retentionperiod;
    return this;
  }

   /**
   * Retention period. ISO_8601 durations format (as in DateInterval format).
   * @return retentionperiod
  **/
  @javax.annotation.Nonnull
  public String getRetentionperiod() {
    return retentionperiod;
  }

  public void setRetentionperiod(String retentionperiod) {
    this.retentionperiod = retentionperiod;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose roleoverrides(String roleoverrides) {
    this.roleoverrides = roleoverrides;
    return this;
  }

   /**
   * roleoverrides
   * @return roleoverrides
  **/
  @javax.annotation.Nonnull
  public String getRoleoverrides() {
    return roleoverrides;
  }

  public void setRoleoverrides(String roleoverrides) {
    this.roleoverrides = roleoverrides;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose sensitivedatareasons(String sensitivedatareasons) {
    this.sensitivedatareasons = sensitivedatareasons;
    return this;
  }

   /**
   * Comma-separated IDs matching records in tool_dataprivacy_sensitive
   * @return sensitivedatareasons
  **/
  @javax.annotation.Nonnull
  public String getSensitivedatareasons() {
    return sensitivedatareasons;
  }

  public void setSensitivedatareasons(String sensitivedatareasons) {
    this.sensitivedatareasons = sensitivedatareasons;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * timecreated
   * @return timecreated
  **/
  @javax.annotation.Nonnull
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * timemodified
   * @return timemodified
  **/
  @javax.annotation.Nonnull
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ToolDataprivacyCreatePurposeForm200ResponsePurpose usermodified(Integer usermodified) {
    this.usermodified = usermodified;
    return this;
  }

   /**
   * usermodified
   * @return usermodified
  **/
  @javax.annotation.Nonnull
  public Integer getUsermodified() {
    return usermodified;
  }

  public void setUsermodified(Integer usermodified) {
    this.usermodified = usermodified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolDataprivacyCreatePurposeForm200ResponsePurpose toolDataprivacyCreatePurposeForm200ResponsePurpose = (ToolDataprivacyCreatePurposeForm200ResponsePurpose) o;
    return Objects.equals(this.description, toolDataprivacyCreatePurposeForm200ResponsePurpose.description) &&
        Objects.equals(this.descriptionformat, toolDataprivacyCreatePurposeForm200ResponsePurpose.descriptionformat) &&
        Objects.equals(this.formattedlawfulbases, toolDataprivacyCreatePurposeForm200ResponsePurpose.formattedlawfulbases) &&
        Objects.equals(this.formattedretentionperiod, toolDataprivacyCreatePurposeForm200ResponsePurpose.formattedretentionperiod) &&
        Objects.equals(this.formattedsensitivedatareasons, toolDataprivacyCreatePurposeForm200ResponsePurpose.formattedsensitivedatareasons) &&
        Objects.equals(this.id, toolDataprivacyCreatePurposeForm200ResponsePurpose.id) &&
        Objects.equals(this.lawfulbases, toolDataprivacyCreatePurposeForm200ResponsePurpose.lawfulbases) &&
        Objects.equals(this.name, toolDataprivacyCreatePurposeForm200ResponsePurpose.name) &&
        Objects.equals(this._protected, toolDataprivacyCreatePurposeForm200ResponsePurpose._protected) &&
        Objects.equals(this.retentionperiod, toolDataprivacyCreatePurposeForm200ResponsePurpose.retentionperiod) &&
        Objects.equals(this.roleoverrides, toolDataprivacyCreatePurposeForm200ResponsePurpose.roleoverrides) &&
        Objects.equals(this.sensitivedatareasons, toolDataprivacyCreatePurposeForm200ResponsePurpose.sensitivedatareasons) &&
        Objects.equals(this.timecreated, toolDataprivacyCreatePurposeForm200ResponsePurpose.timecreated) &&
        Objects.equals(this.timemodified, toolDataprivacyCreatePurposeForm200ResponsePurpose.timemodified) &&
        Objects.equals(this.usermodified, toolDataprivacyCreatePurposeForm200ResponsePurpose.usermodified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionformat, formattedlawfulbases, formattedretentionperiod, formattedsensitivedatareasons, id, lawfulbases, name, _protected, retentionperiod, roleoverrides, sensitivedatareasons, timecreated, timemodified, usermodified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolDataprivacyCreatePurposeForm200ResponsePurpose {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    formattedlawfulbases: ").append(toIndentedString(formattedlawfulbases)).append("\n");
    sb.append("    formattedretentionperiod: ").append(toIndentedString(formattedretentionperiod)).append("\n");
    sb.append("    formattedsensitivedatareasons: ").append(toIndentedString(formattedsensitivedatareasons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lawfulbases: ").append(toIndentedString(lawfulbases)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    retentionperiod: ").append(toIndentedString(retentionperiod)).append("\n");
    sb.append("    roleoverrides: ").append(toIndentedString(roleoverrides)).append("\n");
    sb.append("    sensitivedatareasons: ").append(toIndentedString(sensitivedatareasons)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    usermodified: ").append(toIndentedString(usermodified)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("formattedlawfulbases");
    openapiFields.add("formattedretentionperiod");
    openapiFields.add("formattedsensitivedatareasons");
    openapiFields.add("id");
    openapiFields.add("lawfulbases");
    openapiFields.add("name");
    openapiFields.add("protected");
    openapiFields.add("retentionperiod");
    openapiFields.add("roleoverrides");
    openapiFields.add("sensitivedatareasons");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("usermodified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("formattedlawfulbases");
    openapiRequiredFields.add("formattedretentionperiod");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("lawfulbases");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("protected");
    openapiRequiredFields.add("retentionperiod");
    openapiRequiredFields.add("roleoverrides");
    openapiRequiredFields.add("sensitivedatareasons");
    openapiRequiredFields.add("timecreated");
    openapiRequiredFields.add("timemodified");
    openapiRequiredFields.add("usermodified");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolDataprivacyCreatePurposeForm200ResponsePurpose
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolDataprivacyCreatePurposeForm200ResponsePurpose.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolDataprivacyCreatePurposeForm200ResponsePurpose is not found in the empty JSON string", ToolDataprivacyCreatePurposeForm200ResponsePurpose.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolDataprivacyCreatePurposeForm200ResponsePurpose.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolDataprivacyCreatePurposeForm200ResponsePurpose` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolDataprivacyCreatePurposeForm200ResponsePurpose.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("formattedlawfulbases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `formattedlawfulbases` to be an array in the JSON string but got `%s`", jsonObj.get("formattedlawfulbases").toString()));
      }

      JsonArray jsonArrayformattedlawfulbases = jsonObj.getAsJsonArray("formattedlawfulbases");
      // validate the required field `formattedlawfulbases` (array)
      for (int i = 0; i < jsonArrayformattedlawfulbases.size(); i++) {
        ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.validateJsonElement(jsonArrayformattedlawfulbases.get(i));
      };
      if (!jsonObj.get("formattedretentionperiod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formattedretentionperiod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formattedretentionperiod").toString()));
      }
      if (jsonObj.get("formattedsensitivedatareasons") != null && !jsonObj.get("formattedsensitivedatareasons").isJsonNull()) {
        JsonArray jsonArrayformattedsensitivedatareasons = jsonObj.getAsJsonArray("formattedsensitivedatareasons");
        if (jsonArrayformattedsensitivedatareasons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("formattedsensitivedatareasons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `formattedsensitivedatareasons` to be an array in the JSON string but got `%s`", jsonObj.get("formattedsensitivedatareasons").toString()));
          }

          // validate the optional field `formattedsensitivedatareasons` (array)
          for (int i = 0; i < jsonArrayformattedsensitivedatareasons.size(); i++) {
            ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.validateJsonElement(jsonArrayformattedsensitivedatareasons.get(i));
          };
        }
      }
      if (!jsonObj.get("lawfulbases").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lawfulbases` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lawfulbases").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("retentionperiod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retentionperiod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retentionperiod").toString()));
      }
      if (!jsonObj.get("roleoverrides").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleoverrides` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleoverrides").toString()));
      }
      if (!jsonObj.get("sensitivedatareasons").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitivedatareasons` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sensitivedatareasons").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolDataprivacyCreatePurposeForm200ResponsePurpose.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolDataprivacyCreatePurposeForm200ResponsePurpose' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolDataprivacyCreatePurposeForm200ResponsePurpose> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolDataprivacyCreatePurposeForm200ResponsePurpose.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolDataprivacyCreatePurposeForm200ResponsePurpose>() {
           @Override
           public void write(JsonWriter out, ToolDataprivacyCreatePurposeForm200ResponsePurpose value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolDataprivacyCreatePurposeForm200ResponsePurpose read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolDataprivacyCreatePurposeForm200ResponsePurpose given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolDataprivacyCreatePurposeForm200ResponsePurpose
  * @throws IOException if the JSON string is invalid with respect to ToolDataprivacyCreatePurposeForm200ResponsePurpose
  */
  public static ToolDataprivacyCreatePurposeForm200ResponsePurpose fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolDataprivacyCreatePurposeForm200ResponsePurpose.class);
  }

 /**
  * Convert an instance of ToolDataprivacyCreatePurposeForm200ResponsePurpose to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

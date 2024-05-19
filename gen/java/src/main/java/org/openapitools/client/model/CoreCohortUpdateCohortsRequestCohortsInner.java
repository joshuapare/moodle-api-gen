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
import org.openapitools.client.model.CoreCohortUpdateCohortsRequestCohortsInnerCategorytype;
import org.openapitools.client.model.CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner;

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
 * CoreCohortUpdateCohortsRequestCohortsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCohortUpdateCohortsRequestCohortsInner {
  public static final String SERIALIZED_NAME_CATEGORYTYPE = "categorytype";
  @SerializedName(SERIALIZED_NAME_CATEGORYTYPE)
  private CoreCohortUpdateCohortsRequestCohortsInnerCategorytype categorytype;

  public static final String SERIALIZED_NAME_CUSTOMFIELDS = "customfields";
  @SerializedName(SERIALIZED_NAME_CUSTOMFIELDS)
  private List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = 1;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IDNUMBER = "idnumber";
  @SerializedName(SERIALIZED_NAME_IDNUMBER)
  private String idnumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private String theme;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public CoreCohortUpdateCohortsRequestCohortsInner() {
  }

  public CoreCohortUpdateCohortsRequestCohortsInner categorytype(CoreCohortUpdateCohortsRequestCohortsInnerCategorytype categorytype) {
    this.categorytype = categorytype;
    return this;
  }

   /**
   * Get categorytype
   * @return categorytype
  **/
  @javax.annotation.Nullable
  public CoreCohortUpdateCohortsRequestCohortsInnerCategorytype getCategorytype() {
    return categorytype;
  }

  public void setCategorytype(CoreCohortUpdateCohortsRequestCohortsInnerCategorytype categorytype) {
    this.categorytype = categorytype;
  }


  public CoreCohortUpdateCohortsRequestCohortsInner customfields(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields) {
    this.customfields = customfields;
    return this;
  }

  public CoreCohortUpdateCohortsRequestCohortsInner addCustomfieldsItem(CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner customfieldsItem) {
    if (this.customfields == null) {
      this.customfields = new ArrayList<>();
    }
    this.customfields.add(customfieldsItem);
    return this;
  }

   /**
   * Get customfields
   * @return customfields
  **/
  @javax.annotation.Nullable
  public List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> getCustomfields() {
    return customfields;
  }

  public void setCustomfields(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields) {
    this.customfields = customfields;
  }


  public CoreCohortUpdateCohortsRequestCohortsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * cohort description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CoreCohortUpdateCohortsRequestCohortsInner descriptionformat(Integer descriptionformat) {
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


  public CoreCohortUpdateCohortsRequestCohortsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the cohort
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreCohortUpdateCohortsRequestCohortsInner idnumber(String idnumber) {
    this.idnumber = idnumber;
    return this;
  }

   /**
   * cohort idnumber
   * @return idnumber
  **/
  @javax.annotation.Nullable
  public String getIdnumber() {
    return idnumber;
  }

  public void setIdnumber(String idnumber) {
    this.idnumber = idnumber;
  }


  public CoreCohortUpdateCohortsRequestCohortsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * cohort name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreCohortUpdateCohortsRequestCohortsInner theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * the cohort theme. The allowcohortthemes setting must be enabled on Moodle
   * @return theme
  **/
  @javax.annotation.Nullable
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  public CoreCohortUpdateCohortsRequestCohortsInner visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * cohort visible
   * @return visible
  **/
  @javax.annotation.Nullable
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCohortUpdateCohortsRequestCohortsInner coreCohortUpdateCohortsRequestCohortsInner = (CoreCohortUpdateCohortsRequestCohortsInner) o;
    return Objects.equals(this.categorytype, coreCohortUpdateCohortsRequestCohortsInner.categorytype) &&
        Objects.equals(this.customfields, coreCohortUpdateCohortsRequestCohortsInner.customfields) &&
        Objects.equals(this.description, coreCohortUpdateCohortsRequestCohortsInner.description) &&
        Objects.equals(this.descriptionformat, coreCohortUpdateCohortsRequestCohortsInner.descriptionformat) &&
        Objects.equals(this.id, coreCohortUpdateCohortsRequestCohortsInner.id) &&
        Objects.equals(this.idnumber, coreCohortUpdateCohortsRequestCohortsInner.idnumber) &&
        Objects.equals(this.name, coreCohortUpdateCohortsRequestCohortsInner.name) &&
        Objects.equals(this.theme, coreCohortUpdateCohortsRequestCohortsInner.theme) &&
        Objects.equals(this.visible, coreCohortUpdateCohortsRequestCohortsInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorytype, customfields, description, descriptionformat, id, idnumber, name, theme, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCohortUpdateCohortsRequestCohortsInner {\n");
    sb.append("    categorytype: ").append(toIndentedString(categorytype)).append("\n");
    sb.append("    customfields: ").append(toIndentedString(customfields)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idnumber: ").append(toIndentedString(idnumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
    openapiFields.add("categorytype");
    openapiFields.add("customfields");
    openapiFields.add("description");
    openapiFields.add("descriptionformat");
    openapiFields.add("id");
    openapiFields.add("idnumber");
    openapiFields.add("name");
    openapiFields.add("theme");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCohortUpdateCohortsRequestCohortsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCohortUpdateCohortsRequestCohortsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCohortUpdateCohortsRequestCohortsInner is not found in the empty JSON string", CoreCohortUpdateCohortsRequestCohortsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCohortUpdateCohortsRequestCohortsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCohortUpdateCohortsRequestCohortsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `categorytype`
      if (jsonObj.get("categorytype") != null && !jsonObj.get("categorytype").isJsonNull()) {
        CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.validateJsonElement(jsonObj.get("categorytype"));
      }
      if (jsonObj.get("customfields") != null && !jsonObj.get("customfields").isJsonNull()) {
        JsonArray jsonArraycustomfields = jsonObj.getAsJsonArray("customfields");
        if (jsonArraycustomfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customfields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customfields` to be an array in the JSON string but got `%s`", jsonObj.get("customfields").toString()));
          }

          // validate the optional field `customfields` (array)
          for (int i = 0; i < jsonArraycustomfields.size(); i++) {
            CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.validateJsonElement(jsonArraycustomfields.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("idnumber") != null && !jsonObj.get("idnumber").isJsonNull()) && !jsonObj.get("idnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idnumber").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull()) && !jsonObj.get("theme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `theme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("theme").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCohortUpdateCohortsRequestCohortsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCohortUpdateCohortsRequestCohortsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCohortUpdateCohortsRequestCohortsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCohortUpdateCohortsRequestCohortsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCohortUpdateCohortsRequestCohortsInner>() {
           @Override
           public void write(JsonWriter out, CoreCohortUpdateCohortsRequestCohortsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCohortUpdateCohortsRequestCohortsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCohortUpdateCohortsRequestCohortsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCohortUpdateCohortsRequestCohortsInner
  * @throws IOException if the JSON string is invalid with respect to CoreCohortUpdateCohortsRequestCohortsInner
  */
  public static CoreCohortUpdateCohortsRequestCohortsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCohortUpdateCohortsRequestCohortsInner.class);
  }

 /**
  * Convert an instance of CoreCohortUpdateCohortsRequestCohortsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


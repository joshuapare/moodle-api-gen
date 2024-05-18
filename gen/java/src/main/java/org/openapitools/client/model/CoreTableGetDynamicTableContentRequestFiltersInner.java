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
import org.openapitools.client.model.CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner;

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
 * CoreTableGetDynamicTableContentRequestFiltersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreTableGetDynamicTableContentRequestFiltersInner {
  public static final String SERIALIZED_NAME_FILTEROPTIONS = "filteroptions";
  @SerializedName(SERIALIZED_NAME_FILTEROPTIONS)
  private List<CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner> filteroptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_JOINTYPE = "jointype";
  @SerializedName(SERIALIZED_NAME_JOINTYPE)
  private Integer jointype = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Object> values = new ArrayList<>();

  public CoreTableGetDynamicTableContentRequestFiltersInner() {
  }

  public CoreTableGetDynamicTableContentRequestFiltersInner filteroptions(List<CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner> filteroptions) {
    this.filteroptions = filteroptions;
    return this;
  }

  public CoreTableGetDynamicTableContentRequestFiltersInner addFilteroptionsItem(CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner filteroptionsItem) {
    if (this.filteroptions == null) {
      this.filteroptions = new ArrayList<>();
    }
    this.filteroptions.add(filteroptionsItem);
    return this;
  }

   /**
   * Get filteroptions
   * @return filteroptions
  **/
  @javax.annotation.Nullable
  public List<CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner> getFilteroptions() {
    return filteroptions;
  }

  public void setFilteroptions(List<CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner> filteroptions) {
    this.filteroptions = filteroptions;
  }


  public CoreTableGetDynamicTableContentRequestFiltersInner jointype(Integer jointype) {
    this.jointype = jointype;
    return this;
  }

   /**
   * Type of join for filter values
   * @return jointype
  **/
  @javax.annotation.Nullable
  public Integer getJointype() {
    return jointype;
  }

  public void setJointype(Integer jointype) {
    this.jointype = jointype;
  }


  public CoreTableGetDynamicTableContentRequestFiltersInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the filter
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreTableGetDynamicTableContentRequestFiltersInner values(List<Object> values) {
    this.values = values;
    return this;
  }

  public CoreTableGetDynamicTableContentRequestFiltersInner addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  public List<Object> getValues() {
    return values;
  }

  public void setValues(List<Object> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreTableGetDynamicTableContentRequestFiltersInner coreTableGetDynamicTableContentRequestFiltersInner = (CoreTableGetDynamicTableContentRequestFiltersInner) o;
    return Objects.equals(this.filteroptions, coreTableGetDynamicTableContentRequestFiltersInner.filteroptions) &&
        Objects.equals(this.jointype, coreTableGetDynamicTableContentRequestFiltersInner.jointype) &&
        Objects.equals(this.name, coreTableGetDynamicTableContentRequestFiltersInner.name) &&
        Objects.equals(this.values, coreTableGetDynamicTableContentRequestFiltersInner.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filteroptions, jointype, name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreTableGetDynamicTableContentRequestFiltersInner {\n");
    sb.append("    filteroptions: ").append(toIndentedString(filteroptions)).append("\n");
    sb.append("    jointype: ").append(toIndentedString(jointype)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("filteroptions");
    openapiFields.add("jointype");
    openapiFields.add("name");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreTableGetDynamicTableContentRequestFiltersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreTableGetDynamicTableContentRequestFiltersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreTableGetDynamicTableContentRequestFiltersInner is not found in the empty JSON string", CoreTableGetDynamicTableContentRequestFiltersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreTableGetDynamicTableContentRequestFiltersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreTableGetDynamicTableContentRequestFiltersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("filteroptions") != null && !jsonObj.get("filteroptions").isJsonNull()) {
        JsonArray jsonArrayfilteroptions = jsonObj.getAsJsonArray("filteroptions");
        if (jsonArrayfilteroptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filteroptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filteroptions` to be an array in the JSON string but got `%s`", jsonObj.get("filteroptions").toString()));
          }

          // validate the optional field `filteroptions` (array)
          for (int i = 0; i < jsonArrayfilteroptions.size(); i++) {
            CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner.validateJsonElement(jsonArrayfilteroptions.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreTableGetDynamicTableContentRequestFiltersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreTableGetDynamicTableContentRequestFiltersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreTableGetDynamicTableContentRequestFiltersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreTableGetDynamicTableContentRequestFiltersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreTableGetDynamicTableContentRequestFiltersInner>() {
           @Override
           public void write(JsonWriter out, CoreTableGetDynamicTableContentRequestFiltersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreTableGetDynamicTableContentRequestFiltersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreTableGetDynamicTableContentRequestFiltersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreTableGetDynamicTableContentRequestFiltersInner
  * @throws IOException if the JSON string is invalid with respect to CoreTableGetDynamicTableContentRequestFiltersInner
  */
  public static CoreTableGetDynamicTableContentRequestFiltersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreTableGetDynamicTableContentRequestFiltersInner.class);
  }

 /**
  * Convert an instance of CoreTableGetDynamicTableContentRequestFiltersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


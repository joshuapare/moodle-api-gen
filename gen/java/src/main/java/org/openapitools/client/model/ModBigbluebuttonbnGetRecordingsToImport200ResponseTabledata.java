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
import org.openapitools.client.model.ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner;

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
 * ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata {
  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private String activity;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_PING_INTERVAL = "ping_interval";
  @SerializedName(SERIALIZED_NAME_PING_INTERVAL)
  private Integer pingInterval;

  public static final String SERIALIZED_NAME_PROFILE_FEATURES = "profile_features";
  @SerializedName(SERIALIZED_NAME_PROFILE_FEATURES)
  private List<Object> profileFeatures = new ArrayList<>();

  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata() {
  }

  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata activity(String activity) {
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @javax.annotation.Nonnull
  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }


  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata columns(List<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner> columns) {
    this.columns = columns;
    return this;
  }

  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata addColumnsItem(ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nonnull
  public List<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner> getColumns() {
    return columns;
  }

  public void setColumns(List<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner> columns) {
    this.columns = columns;
  }


  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nonnull
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata pingInterval(Integer pingInterval) {
    this.pingInterval = pingInterval;
    return this;
  }

   /**
   * Get pingInterval
   * @return pingInterval
  **/
  @javax.annotation.Nonnull
  public Integer getPingInterval() {
    return pingInterval;
  }

  public void setPingInterval(Integer pingInterval) {
    this.pingInterval = pingInterval;
  }


  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata profileFeatures(List<Object> profileFeatures) {
    this.profileFeatures = profileFeatures;
    return this;
  }

  public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata addProfileFeaturesItem(Object profileFeaturesItem) {
    if (this.profileFeatures == null) {
      this.profileFeatures = new ArrayList<>();
    }
    this.profileFeatures.add(profileFeaturesItem);
    return this;
  }

   /**
   * Get profileFeatures
   * @return profileFeatures
  **/
  @javax.annotation.Nonnull
  public List<Object> getProfileFeatures() {
    return profileFeatures;
  }

  public void setProfileFeatures(List<Object> profileFeatures) {
    this.profileFeatures = profileFeatures;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata = (ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata) o;
    return Objects.equals(this.activity, modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.activity) &&
        Objects.equals(this.columns, modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.columns) &&
        Objects.equals(this.data, modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.data) &&
        Objects.equals(this.locale, modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.locale) &&
        Objects.equals(this.pingInterval, modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.pingInterval) &&
        Objects.equals(this.profileFeatures, modBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.profileFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, columns, data, locale, pingInterval, profileFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    pingInterval: ").append(toIndentedString(pingInterval)).append("\n");
    sb.append("    profileFeatures: ").append(toIndentedString(profileFeatures)).append("\n");
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
    openapiFields.add("activity");
    openapiFields.add("columns");
    openapiFields.add("data");
    openapiFields.add("locale");
    openapiFields.add("ping_interval");
    openapiFields.add("profile_features");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activity");
    openapiRequiredFields.add("columns");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("locale");
    openapiRequiredFields.add("ping_interval");
    openapiRequiredFields.add("profile_features");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata is not found in the empty JSON string", ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
      }

      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      // validate the required field `columns` (array)
      for (int i = 0; i < jsonArraycolumns.size(); i++) {
        ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner.validateJsonElement(jsonArraycolumns.get(i));
      };
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if (!jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("profile_features") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("profile_features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_features` to be an array in the JSON string but got `%s`", jsonObj.get("profile_features").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.class));

       return (TypeAdapter<T>) new TypeAdapter<ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata>() {
           @Override
           public void write(JsonWriter out, ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
  * @throws IOException if the JSON string is invalid with respect to ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
  */
  public static ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.class);
  }

 /**
  * Convert an instance of ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.ModDataSearchEntries200ResponseEntriesInner;

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
 * ModDataSearchEntries200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataSearchEntries200Response {
  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<ModDataSearchEntries200ResponseEntriesInner> entries = new ArrayList<>();

  public static final String SERIALIZED_NAME_LISTVIEWCONTENTS = "listviewcontents";
  @SerializedName(SERIALIZED_NAME_LISTVIEWCONTENTS)
  private String listviewcontents;

  public static final String SERIALIZED_NAME_MAXCOUNT = "maxcount";
  @SerializedName(SERIALIZED_NAME_MAXCOUNT)
  private Integer maxcount = null;

  public static final String SERIALIZED_NAME_TOTALCOUNT = "totalcount";
  @SerializedName(SERIALIZED_NAME_TOTALCOUNT)
  private Integer totalcount = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModDataSearchEntries200Response() {
  }

  public ModDataSearchEntries200Response entries(List<ModDataSearchEntries200ResponseEntriesInner> entries) {
    this.entries = entries;
    return this;
  }

  public ModDataSearchEntries200Response addEntriesItem(ModDataSearchEntries200ResponseEntriesInner entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nonnull
  public List<ModDataSearchEntries200ResponseEntriesInner> getEntries() {
    return entries;
  }

  public void setEntries(List<ModDataSearchEntries200ResponseEntriesInner> entries) {
    this.entries = entries;
  }


  public ModDataSearchEntries200Response listviewcontents(String listviewcontents) {
    this.listviewcontents = listviewcontents;
    return this;
  }

   /**
   * The list view contents as is rendered in the site.
   * @return listviewcontents
  **/
  @javax.annotation.Nullable
  public String getListviewcontents() {
    return listviewcontents;
  }

  public void setListviewcontents(String listviewcontents) {
    this.listviewcontents = listviewcontents;
  }


  public ModDataSearchEntries200Response maxcount(Integer maxcount) {
    this.maxcount = maxcount;
    return this;
  }

   /**
   * Total count of records that the user could see in the database                     (if all the search criterias were removed).
   * @return maxcount
  **/
  @javax.annotation.Nullable
  public Integer getMaxcount() {
    return maxcount;
  }

  public void setMaxcount(Integer maxcount) {
    this.maxcount = maxcount;
  }


  public ModDataSearchEntries200Response totalcount(Integer totalcount) {
    this.totalcount = totalcount;
    return this;
  }

   /**
   * Total count of records returned by the search.
   * @return totalcount
  **/
  @javax.annotation.Nonnull
  public Integer getTotalcount() {
    return totalcount;
  }

  public void setTotalcount(Integer totalcount) {
    this.totalcount = totalcount;
  }


  public ModDataSearchEntries200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModDataSearchEntries200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    ModDataSearchEntries200Response modDataSearchEntries200Response = (ModDataSearchEntries200Response) o;
    return Objects.equals(this.entries, modDataSearchEntries200Response.entries) &&
        Objects.equals(this.listviewcontents, modDataSearchEntries200Response.listviewcontents) &&
        Objects.equals(this.maxcount, modDataSearchEntries200Response.maxcount) &&
        Objects.equals(this.totalcount, modDataSearchEntries200Response.totalcount) &&
        Objects.equals(this.warnings, modDataSearchEntries200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, listviewcontents, maxcount, totalcount, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataSearchEntries200Response {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    listviewcontents: ").append(toIndentedString(listviewcontents)).append("\n");
    sb.append("    maxcount: ").append(toIndentedString(maxcount)).append("\n");
    sb.append("    totalcount: ").append(toIndentedString(totalcount)).append("\n");
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
    openapiFields.add("entries");
    openapiFields.add("listviewcontents");
    openapiFields.add("maxcount");
    openapiFields.add("totalcount");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entries");
    openapiRequiredFields.add("totalcount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataSearchEntries200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataSearchEntries200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataSearchEntries200Response is not found in the empty JSON string", ModDataSearchEntries200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataSearchEntries200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataSearchEntries200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModDataSearchEntries200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("entries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
      }

      JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
      // validate the required field `entries` (array)
      for (int i = 0; i < jsonArrayentries.size(); i++) {
        ModDataSearchEntries200ResponseEntriesInner.validateJsonElement(jsonArrayentries.get(i));
      };
      if ((jsonObj.get("listviewcontents") != null && !jsonObj.get("listviewcontents").isJsonNull()) && !jsonObj.get("listviewcontents").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listviewcontents` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listviewcontents").toString()));
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
       if (!ModDataSearchEntries200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataSearchEntries200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataSearchEntries200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataSearchEntries200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataSearchEntries200Response>() {
           @Override
           public void write(JsonWriter out, ModDataSearchEntries200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataSearchEntries200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataSearchEntries200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataSearchEntries200Response
  * @throws IOException if the JSON string is invalid with respect to ModDataSearchEntries200Response
  */
  public static ModDataSearchEntries200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataSearchEntries200Response.class);
  }

 /**
  * Convert an instance of ModDataSearchEntries200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * ModGlossaryGetEntriesByAuthorRequestOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModGlossaryGetEntriesByAuthorRequestOptions {
  public static final String SERIALIZED_NAME_INCLUDENOTAPPROVED = "includenotapproved";
  @SerializedName(SERIALIZED_NAME_INCLUDENOTAPPROVED)
  private Boolean includenotapproved = 0;

  public ModGlossaryGetEntriesByAuthorRequestOptions() {
  }

  public ModGlossaryGetEntriesByAuthorRequestOptions includenotapproved(Boolean includenotapproved) {
    this.includenotapproved = includenotapproved;
    return this;
  }

   /**
   * When false, includes the non-approved entries created by the user. When true, also includes the ones that the user has the permission to approve.
   * @return includenotapproved
  **/
  @javax.annotation.Nullable
  public Boolean getIncludenotapproved() {
    return includenotapproved;
  }

  public void setIncludenotapproved(Boolean includenotapproved) {
    this.includenotapproved = includenotapproved;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModGlossaryGetEntriesByAuthorRequestOptions modGlossaryGetEntriesByAuthorRequestOptions = (ModGlossaryGetEntriesByAuthorRequestOptions) o;
    return Objects.equals(this.includenotapproved, modGlossaryGetEntriesByAuthorRequestOptions.includenotapproved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includenotapproved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModGlossaryGetEntriesByAuthorRequestOptions {\n");
    sb.append("    includenotapproved: ").append(toIndentedString(includenotapproved)).append("\n");
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
    openapiFields.add("includenotapproved");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModGlossaryGetEntriesByAuthorRequestOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModGlossaryGetEntriesByAuthorRequestOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModGlossaryGetEntriesByAuthorRequestOptions is not found in the empty JSON string", ModGlossaryGetEntriesByAuthorRequestOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModGlossaryGetEntriesByAuthorRequestOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModGlossaryGetEntriesByAuthorRequestOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModGlossaryGetEntriesByAuthorRequestOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModGlossaryGetEntriesByAuthorRequestOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModGlossaryGetEntriesByAuthorRequestOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModGlossaryGetEntriesByAuthorRequestOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ModGlossaryGetEntriesByAuthorRequestOptions>() {
           @Override
           public void write(JsonWriter out, ModGlossaryGetEntriesByAuthorRequestOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModGlossaryGetEntriesByAuthorRequestOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModGlossaryGetEntriesByAuthorRequestOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModGlossaryGetEntriesByAuthorRequestOptions
  * @throws IOException if the JSON string is invalid with respect to ModGlossaryGetEntriesByAuthorRequestOptions
  */
  public static ModGlossaryGetEntriesByAuthorRequestOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModGlossaryGetEntriesByAuthorRequestOptions.class);
  }

 /**
  * Convert an instance of ModGlossaryGetEntriesByAuthorRequestOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


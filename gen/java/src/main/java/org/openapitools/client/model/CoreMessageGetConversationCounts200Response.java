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
import org.openapitools.client.model.CoreMessageGetConversationCounts200ResponseTypes;

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
 * CoreMessageGetConversationCounts200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetConversationCounts200Response {
  public static final String SERIALIZED_NAME_FAVOURITES = "favourites";
  @SerializedName(SERIALIZED_NAME_FAVOURITES)
  private Integer favourites = null;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private CoreMessageGetConversationCounts200ResponseTypes types;

  public CoreMessageGetConversationCounts200Response() {
  }

  public CoreMessageGetConversationCounts200Response favourites(Integer favourites) {
    this.favourites = favourites;
    return this;
  }

   /**
   * Total number of favourite conversations
   * @return favourites
  **/
  @javax.annotation.Nonnull
  public Integer getFavourites() {
    return favourites;
  }

  public void setFavourites(Integer favourites) {
    this.favourites = favourites;
  }


  public CoreMessageGetConversationCounts200Response types(CoreMessageGetConversationCounts200ResponseTypes types) {
    this.types = types;
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nonnull
  public CoreMessageGetConversationCounts200ResponseTypes getTypes() {
    return types;
  }

  public void setTypes(CoreMessageGetConversationCounts200ResponseTypes types) {
    this.types = types;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetConversationCounts200Response coreMessageGetConversationCounts200Response = (CoreMessageGetConversationCounts200Response) o;
    return Objects.equals(this.favourites, coreMessageGetConversationCounts200Response.favourites) &&
        Objects.equals(this.types, coreMessageGetConversationCounts200Response.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favourites, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetConversationCounts200Response {\n");
    sb.append("    favourites: ").append(toIndentedString(favourites)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
    openapiFields.add("favourites");
    openapiFields.add("types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("favourites");
    openapiRequiredFields.add("types");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetConversationCounts200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetConversationCounts200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetConversationCounts200Response is not found in the empty JSON string", CoreMessageGetConversationCounts200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetConversationCounts200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetConversationCounts200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageGetConversationCounts200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `types`
      CoreMessageGetConversationCounts200ResponseTypes.validateJsonElement(jsonObj.get("types"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetConversationCounts200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetConversationCounts200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetConversationCounts200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetConversationCounts200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetConversationCounts200Response>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetConversationCounts200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetConversationCounts200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetConversationCounts200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetConversationCounts200Response
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetConversationCounts200Response
  */
  public static CoreMessageGetConversationCounts200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetConversationCounts200Response.class);
  }

 /**
  * Convert an instance of CoreMessageGetConversationCounts200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.ModScormGetScormUserData200ResponseDataInnerDefaultdataInner;

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
 * ModScormInsertScormTracksRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModScormInsertScormTracksRequest {
  public static final String SERIALIZED_NAME_ATTEMPT = "attempt";
  @SerializedName(SERIALIZED_NAME_ATTEMPT)
  private Integer attempt;

  public static final String SERIALIZED_NAME_SCOID = "scoid";
  @SerializedName(SERIALIZED_NAME_SCOID)
  private Integer scoid = null;

  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> tracks = new ArrayList<>();

  public ModScormInsertScormTracksRequest() {
  }

  public ModScormInsertScormTracksRequest attempt(Integer attempt) {
    this.attempt = attempt;
    return this;
  }

   /**
   * attempt number
   * @return attempt
  **/
  @javax.annotation.Nonnull
  public Integer getAttempt() {
    return attempt;
  }

  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }


  public ModScormInsertScormTracksRequest scoid(Integer scoid) {
    this.scoid = scoid;
    return this;
  }

   /**
   * SCO id
   * @return scoid
  **/
  @javax.annotation.Nonnull
  public Integer getScoid() {
    return scoid;
  }

  public void setScoid(Integer scoid) {
    this.scoid = scoid;
  }


  public ModScormInsertScormTracksRequest tracks(List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> tracks) {
    this.tracks = tracks;
    return this;
  }

  public ModScormInsertScormTracksRequest addTracksItem(ModScormGetScormUserData200ResponseDataInnerDefaultdataInner tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * Get tracks
   * @return tracks
  **/
  @javax.annotation.Nonnull
  public List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> getTracks() {
    return tracks;
  }

  public void setTracks(List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> tracks) {
    this.tracks = tracks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModScormInsertScormTracksRequest modScormInsertScormTracksRequest = (ModScormInsertScormTracksRequest) o;
    return Objects.equals(this.attempt, modScormInsertScormTracksRequest.attempt) &&
        Objects.equals(this.scoid, modScormInsertScormTracksRequest.scoid) &&
        Objects.equals(this.tracks, modScormInsertScormTracksRequest.tracks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempt, scoid, tracks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModScormInsertScormTracksRequest {\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    scoid: ").append(toIndentedString(scoid)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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
    openapiFields.add("attempt");
    openapiFields.add("scoid");
    openapiFields.add("tracks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attempt");
    openapiRequiredFields.add("scoid");
    openapiRequiredFields.add("tracks");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModScormInsertScormTracksRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModScormInsertScormTracksRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModScormInsertScormTracksRequest is not found in the empty JSON string", ModScormInsertScormTracksRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModScormInsertScormTracksRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModScormInsertScormTracksRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModScormInsertScormTracksRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("tracks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracks` to be an array in the JSON string but got `%s`", jsonObj.get("tracks").toString()));
      }

      JsonArray jsonArraytracks = jsonObj.getAsJsonArray("tracks");
      // validate the required field `tracks` (array)
      for (int i = 0; i < jsonArraytracks.size(); i++) {
        ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.validateJsonElement(jsonArraytracks.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModScormInsertScormTracksRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModScormInsertScormTracksRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModScormInsertScormTracksRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModScormInsertScormTracksRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModScormInsertScormTracksRequest>() {
           @Override
           public void write(JsonWriter out, ModScormInsertScormTracksRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModScormInsertScormTracksRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModScormInsertScormTracksRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModScormInsertScormTracksRequest
  * @throws IOException if the JSON string is invalid with respect to ModScormInsertScormTracksRequest
  */
  public static ModScormInsertScormTracksRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModScormInsertScormTracksRequest.class);
  }

 /**
  * Convert an instance of ModScormInsertScormTracksRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner;

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
 * ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {
  public static final String SERIALIZED_NAME_EDITORFIELDS = "editorfields";
  @SerializedName(SERIALIZED_NAME_EDITORFIELDS)
  private List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner> editorfields = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILEAREAS = "fileareas";
  @SerializedName(SERIALIZED_NAME_FILEAREAS)
  private List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner> fileareas = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "null";

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner() {
  }

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner editorfields(List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner> editorfields) {
    this.editorfields = editorfields;
    return this;
  }

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner addEditorfieldsItem(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner editorfieldsItem) {
    if (this.editorfields == null) {
      this.editorfields = new ArrayList<>();
    }
    this.editorfields.add(editorfieldsItem);
    return this;
  }

   /**
   * Get editorfields
   * @return editorfields
  **/
  @javax.annotation.Nullable
  public List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner> getEditorfields() {
    return editorfields;
  }

  public void setEditorfields(List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner> editorfields) {
    this.editorfields = editorfields;
  }


  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner fileareas(List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner> fileareas) {
    this.fileareas = fileareas;
    return this;
  }

  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner addFileareasItem(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner fileareasItem) {
    if (this.fileareas == null) {
      this.fileareas = new ArrayList<>();
    }
    this.fileareas.add(fileareasItem);
    return this;
  }

   /**
   * Get fileareas
   * @return fileareas
  **/
  @javax.annotation.Nullable
  public List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner> getFileareas() {
    return fileareas;
  }

  public void setFileareas(List<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner> fileareas) {
    this.fileareas = fileareas;
  }


  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * submission plugin name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * submission plugin type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner modAssignGetSubmissionStatus200ResponseFeedbackPluginsInner = (ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner) o;
    return Objects.equals(this.editorfields, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.editorfields) &&
        Objects.equals(this.fileareas, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.fileareas) &&
        Objects.equals(this.name, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.name) &&
        Objects.equals(this.type, modAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editorfields, fileareas, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner {\n");
    sb.append("    editorfields: ").append(toIndentedString(editorfields)).append("\n");
    sb.append("    fileareas: ").append(toIndentedString(fileareas)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("editorfields");
    openapiFields.add("fileareas");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner is not found in the empty JSON string", ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("editorfields") != null && !jsonObj.get("editorfields").isJsonNull()) {
        JsonArray jsonArrayeditorfields = jsonObj.getAsJsonArray("editorfields");
        if (jsonArrayeditorfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("editorfields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `editorfields` to be an array in the JSON string but got `%s`", jsonObj.get("editorfields").toString()));
          }

          // validate the optional field `editorfields` (array)
          for (int i = 0; i < jsonArrayeditorfields.size(); i++) {
            ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.validateJsonElement(jsonArrayeditorfields.get(i));
          };
        }
      }
      if (jsonObj.get("fileareas") != null && !jsonObj.get("fileareas").isJsonNull()) {
        JsonArray jsonArrayfileareas = jsonObj.getAsJsonArray("fileareas");
        if (jsonArrayfileareas != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fileareas").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fileareas` to be an array in the JSON string but got `%s`", jsonObj.get("fileareas").toString()));
          }

          // validate the optional field `fileareas` (array)
          for (int i = 0; i < jsonArrayfileareas.size(); i++) {
            ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.validateJsonElement(jsonArrayfileareas.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner>() {
           @Override
           public void write(JsonWriter out, ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
  * @throws IOException if the JSON string is invalid with respect to ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner
  */
  public static ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.class);
  }

 /**
  * Convert an instance of ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


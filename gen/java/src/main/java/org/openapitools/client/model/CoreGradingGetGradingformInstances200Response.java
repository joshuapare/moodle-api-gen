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
import org.openapitools.client.model.CoreGradingGetGradingformInstances200ResponseInstancesInner;

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
 * CoreGradingGetGradingformInstances200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradingGetGradingformInstances200Response {
  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<CoreGradingGetGradingformInstances200ResponseInstancesInner> instances = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public CoreGradingGetGradingformInstances200Response() {
  }

  public CoreGradingGetGradingformInstances200Response instances(List<CoreGradingGetGradingformInstances200ResponseInstancesInner> instances) {
    this.instances = instances;
    return this;
  }

  public CoreGradingGetGradingformInstances200Response addInstancesItem(CoreGradingGetGradingformInstances200ResponseInstancesInner instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nonnull
  public List<CoreGradingGetGradingformInstances200ResponseInstancesInner> getInstances() {
    return instances;
  }

  public void setInstances(List<CoreGradingGetGradingformInstances200ResponseInstancesInner> instances) {
    this.instances = instances;
  }


  public CoreGradingGetGradingformInstances200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CoreGradingGetGradingformInstances200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    CoreGradingGetGradingformInstances200Response coreGradingGetGradingformInstances200Response = (CoreGradingGetGradingformInstances200Response) o;
    return Objects.equals(this.instances, coreGradingGetGradingformInstances200Response.instances) &&
        Objects.equals(this.warnings, coreGradingGetGradingformInstances200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradingGetGradingformInstances200Response {\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
    openapiFields.add("instances");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instances");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradingGetGradingformInstances200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradingGetGradingformInstances200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradingGetGradingformInstances200Response is not found in the empty JSON string", CoreGradingGetGradingformInstances200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradingGetGradingformInstances200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradingGetGradingformInstances200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGradingGetGradingformInstances200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("instances").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `instances` to be an array in the JSON string but got `%s`", jsonObj.get("instances").toString()));
      }

      JsonArray jsonArrayinstances = jsonObj.getAsJsonArray("instances");
      // validate the required field `instances` (array)
      for (int i = 0; i < jsonArrayinstances.size(); i++) {
        CoreGradingGetGradingformInstances200ResponseInstancesInner.validateJsonElement(jsonArrayinstances.get(i));
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
       if (!CoreGradingGetGradingformInstances200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradingGetGradingformInstances200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradingGetGradingformInstances200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradingGetGradingformInstances200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradingGetGradingformInstances200Response>() {
           @Override
           public void write(JsonWriter out, CoreGradingGetGradingformInstances200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradingGetGradingformInstances200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradingGetGradingformInstances200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradingGetGradingformInstances200Response
  * @throws IOException if the JSON string is invalid with respect to CoreGradingGetGradingformInstances200Response
  */
  public static CoreGradingGetGradingformInstances200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradingGetGradingformInstances200Response.class);
  }

 /**
  * Convert an instance of CoreGradingGetGradingformInstances200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


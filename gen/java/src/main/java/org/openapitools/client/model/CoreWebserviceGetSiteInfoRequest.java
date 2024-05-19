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
 * CoreWebserviceGetSiteInfoRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreWebserviceGetSiteInfoRequest {
  public static final String SERIALIZED_NAME_SERVICESHORTNAMES = "serviceshortnames";
  @SerializedName(SERIALIZED_NAME_SERVICESHORTNAMES)
  private List<Object> serviceshortnames = new ArrayList<>();

  public CoreWebserviceGetSiteInfoRequest() {
  }

  public CoreWebserviceGetSiteInfoRequest serviceshortnames(List<Object> serviceshortnames) {
    this.serviceshortnames = serviceshortnames;
    return this;
  }

  public CoreWebserviceGetSiteInfoRequest addServiceshortnamesItem(Object serviceshortnamesItem) {
    if (this.serviceshortnames == null) {
      this.serviceshortnames = new ArrayList<>();
    }
    this.serviceshortnames.add(serviceshortnamesItem);
    return this;
  }

   /**
   * Get serviceshortnames
   * @return serviceshortnames
  **/
  @javax.annotation.Nullable
  public List<Object> getServiceshortnames() {
    return serviceshortnames;
  }

  public void setServiceshortnames(List<Object> serviceshortnames) {
    this.serviceshortnames = serviceshortnames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreWebserviceGetSiteInfoRequest coreWebserviceGetSiteInfoRequest = (CoreWebserviceGetSiteInfoRequest) o;
    return Objects.equals(this.serviceshortnames, coreWebserviceGetSiteInfoRequest.serviceshortnames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceshortnames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreWebserviceGetSiteInfoRequest {\n");
    sb.append("    serviceshortnames: ").append(toIndentedString(serviceshortnames)).append("\n");
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
    openapiFields.add("serviceshortnames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreWebserviceGetSiteInfoRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreWebserviceGetSiteInfoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreWebserviceGetSiteInfoRequest is not found in the empty JSON string", CoreWebserviceGetSiteInfoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreWebserviceGetSiteInfoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreWebserviceGetSiteInfoRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("serviceshortnames") != null && !jsonObj.get("serviceshortnames").isJsonNull() && !jsonObj.get("serviceshortnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceshortnames` to be an array in the JSON string but got `%s`", jsonObj.get("serviceshortnames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreWebserviceGetSiteInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreWebserviceGetSiteInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreWebserviceGetSiteInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreWebserviceGetSiteInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreWebserviceGetSiteInfoRequest>() {
           @Override
           public void write(JsonWriter out, CoreWebserviceGetSiteInfoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreWebserviceGetSiteInfoRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreWebserviceGetSiteInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreWebserviceGetSiteInfoRequest
  * @throws IOException if the JSON string is invalid with respect to CoreWebserviceGetSiteInfoRequest
  */
  public static CoreWebserviceGetSiteInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreWebserviceGetSiteInfoRequest.class);
  }

 /**
  * Convert an instance of CoreWebserviceGetSiteInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


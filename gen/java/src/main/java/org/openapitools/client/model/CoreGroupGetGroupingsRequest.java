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
 * CoreGroupGetGroupingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGroupGetGroupingsRequest {
  public static final String SERIALIZED_NAME_GROUPINGIDS = "groupingids";
  @SerializedName(SERIALIZED_NAME_GROUPINGIDS)
  private List<Object> groupingids = new ArrayList<>();

  public static final String SERIALIZED_NAME_RETURNGROUPS = "returngroups";
  @SerializedName(SERIALIZED_NAME_RETURNGROUPS)
  private Boolean returngroups = 0;

  public CoreGroupGetGroupingsRequest() {
  }

  public CoreGroupGetGroupingsRequest groupingids(List<Object> groupingids) {
    this.groupingids = groupingids;
    return this;
  }

  public CoreGroupGetGroupingsRequest addGroupingidsItem(Object groupingidsItem) {
    if (this.groupingids == null) {
      this.groupingids = new ArrayList<>();
    }
    this.groupingids.add(groupingidsItem);
    return this;
  }

   /**
   * Get groupingids
   * @return groupingids
  **/
  @javax.annotation.Nonnull
  public List<Object> getGroupingids() {
    return groupingids;
  }

  public void setGroupingids(List<Object> groupingids) {
    this.groupingids = groupingids;
  }


  public CoreGroupGetGroupingsRequest returngroups(Boolean returngroups) {
    this.returngroups = returngroups;
    return this;
  }

   /**
   * return associated groups
   * @return returngroups
  **/
  @javax.annotation.Nullable
  public Boolean getReturngroups() {
    return returngroups;
  }

  public void setReturngroups(Boolean returngroups) {
    this.returngroups = returngroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGroupGetGroupingsRequest coreGroupGetGroupingsRequest = (CoreGroupGetGroupingsRequest) o;
    return Objects.equals(this.groupingids, coreGroupGetGroupingsRequest.groupingids) &&
        Objects.equals(this.returngroups, coreGroupGetGroupingsRequest.returngroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupingids, returngroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGroupGetGroupingsRequest {\n");
    sb.append("    groupingids: ").append(toIndentedString(groupingids)).append("\n");
    sb.append("    returngroups: ").append(toIndentedString(returngroups)).append("\n");
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
    openapiFields.add("groupingids");
    openapiFields.add("returngroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groupingids");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGroupGetGroupingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGroupGetGroupingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGroupGetGroupingsRequest is not found in the empty JSON string", CoreGroupGetGroupingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGroupGetGroupingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGroupGetGroupingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGroupGetGroupingsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("groupingids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("groupingids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupingids` to be an array in the JSON string but got `%s`", jsonObj.get("groupingids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGroupGetGroupingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGroupGetGroupingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGroupGetGroupingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGroupGetGroupingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGroupGetGroupingsRequest>() {
           @Override
           public void write(JsonWriter out, CoreGroupGetGroupingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGroupGetGroupingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGroupGetGroupingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGroupGetGroupingsRequest
  * @throws IOException if the JSON string is invalid with respect to CoreGroupGetGroupingsRequest
  */
  public static CoreGroupGetGroupingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGroupGetGroupingsRequest.class);
  }

 /**
  * Convert an instance of CoreGroupGetGroupingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


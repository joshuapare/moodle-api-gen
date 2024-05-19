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
import org.openapitools.client.model.CoreCohortDeleteCohortMembersRequestMembersInner;

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
 * CoreCohortDeleteCohortMembersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCohortDeleteCohortMembersRequest {
  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<CoreCohortDeleteCohortMembersRequestMembersInner> members = new ArrayList<>();

  public CoreCohortDeleteCohortMembersRequest() {
  }

  public CoreCohortDeleteCohortMembersRequest members(List<CoreCohortDeleteCohortMembersRequestMembersInner> members) {
    this.members = members;
    return this;
  }

  public CoreCohortDeleteCohortMembersRequest addMembersItem(CoreCohortDeleteCohortMembersRequestMembersInner membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nonnull
  public List<CoreCohortDeleteCohortMembersRequestMembersInner> getMembers() {
    return members;
  }

  public void setMembers(List<CoreCohortDeleteCohortMembersRequestMembersInner> members) {
    this.members = members;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCohortDeleteCohortMembersRequest coreCohortDeleteCohortMembersRequest = (CoreCohortDeleteCohortMembersRequest) o;
    return Objects.equals(this.members, coreCohortDeleteCohortMembersRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCohortDeleteCohortMembersRequest {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    openapiFields.add("members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("members");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCohortDeleteCohortMembersRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCohortDeleteCohortMembersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCohortDeleteCohortMembersRequest is not found in the empty JSON string", CoreCohortDeleteCohortMembersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCohortDeleteCohortMembersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCohortDeleteCohortMembersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCohortDeleteCohortMembersRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
      }

      JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
      // validate the required field `members` (array)
      for (int i = 0; i < jsonArraymembers.size(); i++) {
        CoreCohortDeleteCohortMembersRequestMembersInner.validateJsonElement(jsonArraymembers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCohortDeleteCohortMembersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCohortDeleteCohortMembersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCohortDeleteCohortMembersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCohortDeleteCohortMembersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCohortDeleteCohortMembersRequest>() {
           @Override
           public void write(JsonWriter out, CoreCohortDeleteCohortMembersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCohortDeleteCohortMembersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCohortDeleteCohortMembersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCohortDeleteCohortMembersRequest
  * @throws IOException if the JSON string is invalid with respect to CoreCohortDeleteCohortMembersRequest
  */
  public static CoreCohortDeleteCohortMembersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCohortDeleteCohortMembersRequest.class);
  }

 /**
  * Convert an instance of CoreCohortDeleteCohortMembersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


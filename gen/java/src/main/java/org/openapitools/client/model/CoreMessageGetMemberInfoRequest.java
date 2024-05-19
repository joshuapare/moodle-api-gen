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
 * CoreMessageGetMemberInfoRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetMemberInfoRequest {
  public static final String SERIALIZED_NAME_INCLUDECONTACTREQUESTS = "includecontactrequests";
  @SerializedName(SERIALIZED_NAME_INCLUDECONTACTREQUESTS)
  private Boolean includecontactrequests = false;

  public static final String SERIALIZED_NAME_INCLUDEPRIVACYINFO = "includeprivacyinfo";
  @SerializedName(SERIALIZED_NAME_INCLUDEPRIVACYINFO)
  private Boolean includeprivacyinfo = false;

  public static final String SERIALIZED_NAME_REFERENCEUSERID = "referenceuserid";
  @SerializedName(SERIALIZED_NAME_REFERENCEUSERID)
  private Integer referenceuserid = null;

  public static final String SERIALIZED_NAME_USERIDS = "userids";
  @SerializedName(SERIALIZED_NAME_USERIDS)
  private List<Object> userids = new ArrayList<>();

  public CoreMessageGetMemberInfoRequest() {
  }

  public CoreMessageGetMemberInfoRequest includecontactrequests(Boolean includecontactrequests) {
    this.includecontactrequests = includecontactrequests;
    return this;
  }

   /**
   * include contact requests in response
   * @return includecontactrequests
  **/
  @javax.annotation.Nullable
  public Boolean getIncludecontactrequests() {
    return includecontactrequests;
  }

  public void setIncludecontactrequests(Boolean includecontactrequests) {
    this.includecontactrequests = includecontactrequests;
  }


  public CoreMessageGetMemberInfoRequest includeprivacyinfo(Boolean includeprivacyinfo) {
    this.includeprivacyinfo = includeprivacyinfo;
    return this;
  }

   /**
   * include privacy info in response
   * @return includeprivacyinfo
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeprivacyinfo() {
    return includeprivacyinfo;
  }

  public void setIncludeprivacyinfo(Boolean includeprivacyinfo) {
    this.includeprivacyinfo = includeprivacyinfo;
  }


  public CoreMessageGetMemberInfoRequest referenceuserid(Integer referenceuserid) {
    this.referenceuserid = referenceuserid;
    return this;
  }

   /**
   * id of the user
   * @return referenceuserid
  **/
  @javax.annotation.Nonnull
  public Integer getReferenceuserid() {
    return referenceuserid;
  }

  public void setReferenceuserid(Integer referenceuserid) {
    this.referenceuserid = referenceuserid;
  }


  public CoreMessageGetMemberInfoRequest userids(List<Object> userids) {
    this.userids = userids;
    return this;
  }

  public CoreMessageGetMemberInfoRequest addUseridsItem(Object useridsItem) {
    if (this.userids == null) {
      this.userids = new ArrayList<>();
    }
    this.userids.add(useridsItem);
    return this;
  }

   /**
   * Get userids
   * @return userids
  **/
  @javax.annotation.Nonnull
  public List<Object> getUserids() {
    return userids;
  }

  public void setUserids(List<Object> userids) {
    this.userids = userids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetMemberInfoRequest coreMessageGetMemberInfoRequest = (CoreMessageGetMemberInfoRequest) o;
    return Objects.equals(this.includecontactrequests, coreMessageGetMemberInfoRequest.includecontactrequests) &&
        Objects.equals(this.includeprivacyinfo, coreMessageGetMemberInfoRequest.includeprivacyinfo) &&
        Objects.equals(this.referenceuserid, coreMessageGetMemberInfoRequest.referenceuserid) &&
        Objects.equals(this.userids, coreMessageGetMemberInfoRequest.userids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includecontactrequests, includeprivacyinfo, referenceuserid, userids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetMemberInfoRequest {\n");
    sb.append("    includecontactrequests: ").append(toIndentedString(includecontactrequests)).append("\n");
    sb.append("    includeprivacyinfo: ").append(toIndentedString(includeprivacyinfo)).append("\n");
    sb.append("    referenceuserid: ").append(toIndentedString(referenceuserid)).append("\n");
    sb.append("    userids: ").append(toIndentedString(userids)).append("\n");
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
    openapiFields.add("includecontactrequests");
    openapiFields.add("includeprivacyinfo");
    openapiFields.add("referenceuserid");
    openapiFields.add("userids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("referenceuserid");
    openapiRequiredFields.add("userids");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetMemberInfoRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetMemberInfoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetMemberInfoRequest is not found in the empty JSON string", CoreMessageGetMemberInfoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetMemberInfoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetMemberInfoRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageGetMemberInfoRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("userids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("userids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userids` to be an array in the JSON string but got `%s`", jsonObj.get("userids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetMemberInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetMemberInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetMemberInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetMemberInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetMemberInfoRequest>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetMemberInfoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetMemberInfoRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetMemberInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetMemberInfoRequest
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetMemberInfoRequest
  */
  public static CoreMessageGetMemberInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetMemberInfoRequest.class);
  }

 /**
  * Convert an instance of CoreMessageGetMemberInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


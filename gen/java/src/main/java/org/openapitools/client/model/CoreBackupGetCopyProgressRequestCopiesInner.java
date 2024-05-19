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
 * Copy data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreBackupGetCopyProgressRequestCopiesInner {
  public static final String SERIALIZED_NAME_BACKUPID = "backupid";
  @SerializedName(SERIALIZED_NAME_BACKUPID)
  private String backupid = "null";

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation = "null";

  public static final String SERIALIZED_NAME_RESTOREID = "restoreid";
  @SerializedName(SERIALIZED_NAME_RESTOREID)
  private String restoreid = "null";

  public CoreBackupGetCopyProgressRequestCopiesInner() {
  }

  public CoreBackupGetCopyProgressRequestCopiesInner backupid(String backupid) {
    this.backupid = backupid;
    return this;
  }

   /**
   * Backup id
   * @return backupid
  **/
  @javax.annotation.Nullable
  public String getBackupid() {
    return backupid;
  }

  public void setBackupid(String backupid) {
    this.backupid = backupid;
  }


  public CoreBackupGetCopyProgressRequestCopiesInner operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Operation type
   * @return operation
  **/
  @javax.annotation.Nullable
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  public CoreBackupGetCopyProgressRequestCopiesInner restoreid(String restoreid) {
    this.restoreid = restoreid;
    return this;
  }

   /**
   * Restore id
   * @return restoreid
  **/
  @javax.annotation.Nullable
  public String getRestoreid() {
    return restoreid;
  }

  public void setRestoreid(String restoreid) {
    this.restoreid = restoreid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreBackupGetCopyProgressRequestCopiesInner coreBackupGetCopyProgressRequestCopiesInner = (CoreBackupGetCopyProgressRequestCopiesInner) o;
    return Objects.equals(this.backupid, coreBackupGetCopyProgressRequestCopiesInner.backupid) &&
        Objects.equals(this.operation, coreBackupGetCopyProgressRequestCopiesInner.operation) &&
        Objects.equals(this.restoreid, coreBackupGetCopyProgressRequestCopiesInner.restoreid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupid, operation, restoreid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreBackupGetCopyProgressRequestCopiesInner {\n");
    sb.append("    backupid: ").append(toIndentedString(backupid)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    restoreid: ").append(toIndentedString(restoreid)).append("\n");
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
    openapiFields.add("backupid");
    openapiFields.add("operation");
    openapiFields.add("restoreid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreBackupGetCopyProgressRequestCopiesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreBackupGetCopyProgressRequestCopiesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreBackupGetCopyProgressRequestCopiesInner is not found in the empty JSON string", CoreBackupGetCopyProgressRequestCopiesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreBackupGetCopyProgressRequestCopiesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreBackupGetCopyProgressRequestCopiesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("backupid") != null && !jsonObj.get("backupid").isJsonNull()) && !jsonObj.get("backupid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupid").toString()));
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("restoreid") != null && !jsonObj.get("restoreid").isJsonNull()) && !jsonObj.get("restoreid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restoreid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restoreid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreBackupGetCopyProgressRequestCopiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreBackupGetCopyProgressRequestCopiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreBackupGetCopyProgressRequestCopiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreBackupGetCopyProgressRequestCopiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreBackupGetCopyProgressRequestCopiesInner>() {
           @Override
           public void write(JsonWriter out, CoreBackupGetCopyProgressRequestCopiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreBackupGetCopyProgressRequestCopiesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreBackupGetCopyProgressRequestCopiesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreBackupGetCopyProgressRequestCopiesInner
  * @throws IOException if the JSON string is invalid with respect to CoreBackupGetCopyProgressRequestCopiesInner
  */
  public static CoreBackupGetCopyProgressRequestCopiesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreBackupGetCopyProgressRequestCopiesInner.class);
  }

 /**
  * Convert an instance of CoreBackupGetCopyProgressRequestCopiesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


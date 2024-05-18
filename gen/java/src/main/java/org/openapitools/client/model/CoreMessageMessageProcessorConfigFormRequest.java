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
import org.openapitools.client.model.CoreMessageMessageProcessorConfigFormRequestFormvaluesInner;

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
 * CoreMessageMessageProcessorConfigFormRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageMessageProcessorConfigFormRequest {
  public static final String SERIALIZED_NAME_FORMVALUES = "formvalues";
  @SerializedName(SERIALIZED_NAME_FORMVALUES)
  private List<CoreMessageMessageProcessorConfigFormRequestFormvaluesInner> formvalues = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public CoreMessageMessageProcessorConfigFormRequest() {
  }

  public CoreMessageMessageProcessorConfigFormRequest formvalues(List<CoreMessageMessageProcessorConfigFormRequestFormvaluesInner> formvalues) {
    this.formvalues = formvalues;
    return this;
  }

  public CoreMessageMessageProcessorConfigFormRequest addFormvaluesItem(CoreMessageMessageProcessorConfigFormRequestFormvaluesInner formvaluesItem) {
    if (this.formvalues == null) {
      this.formvalues = new ArrayList<>();
    }
    this.formvalues.add(formvaluesItem);
    return this;
  }

   /**
   * Get formvalues
   * @return formvalues
  **/
  @javax.annotation.Nonnull
  public List<CoreMessageMessageProcessorConfigFormRequestFormvaluesInner> getFormvalues() {
    return formvalues;
  }

  public void setFormvalues(List<CoreMessageMessageProcessorConfigFormRequestFormvaluesInner> formvalues) {
    this.formvalues = formvalues;
  }


  public CoreMessageMessageProcessorConfigFormRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the message processor
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreMessageMessageProcessorConfigFormRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * id of the user, 0 for current user
   * @return userid
  **/
  @javax.annotation.Nonnull
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageMessageProcessorConfigFormRequest coreMessageMessageProcessorConfigFormRequest = (CoreMessageMessageProcessorConfigFormRequest) o;
    return Objects.equals(this.formvalues, coreMessageMessageProcessorConfigFormRequest.formvalues) &&
        Objects.equals(this.name, coreMessageMessageProcessorConfigFormRequest.name) &&
        Objects.equals(this.userid, coreMessageMessageProcessorConfigFormRequest.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formvalues, name, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageMessageProcessorConfigFormRequest {\n");
    sb.append("    formvalues: ").append(toIndentedString(formvalues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
    openapiFields.add("formvalues");
    openapiFields.add("name");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("formvalues");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageMessageProcessorConfigFormRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageMessageProcessorConfigFormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageMessageProcessorConfigFormRequest is not found in the empty JSON string", CoreMessageMessageProcessorConfigFormRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageMessageProcessorConfigFormRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageMessageProcessorConfigFormRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageMessageProcessorConfigFormRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("formvalues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `formvalues` to be an array in the JSON string but got `%s`", jsonObj.get("formvalues").toString()));
      }

      JsonArray jsonArrayformvalues = jsonObj.getAsJsonArray("formvalues");
      // validate the required field `formvalues` (array)
      for (int i = 0; i < jsonArrayformvalues.size(); i++) {
        CoreMessageMessageProcessorConfigFormRequestFormvaluesInner.validateJsonElement(jsonArrayformvalues.get(i));
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageMessageProcessorConfigFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageMessageProcessorConfigFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageMessageProcessorConfigFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageMessageProcessorConfigFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageMessageProcessorConfigFormRequest>() {
           @Override
           public void write(JsonWriter out, CoreMessageMessageProcessorConfigFormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageMessageProcessorConfigFormRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageMessageProcessorConfigFormRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageMessageProcessorConfigFormRequest
  * @throws IOException if the JSON string is invalid with respect to CoreMessageMessageProcessorConfigFormRequest
  */
  public static CoreMessageMessageProcessorConfigFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageMessageProcessorConfigFormRequest.class);
  }

 /**
  * Convert an instance of CoreMessageMessageProcessorConfigFormRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

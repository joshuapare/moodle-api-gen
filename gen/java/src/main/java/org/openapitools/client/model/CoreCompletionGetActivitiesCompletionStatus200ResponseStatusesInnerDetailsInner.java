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
import org.openapitools.client.model.CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue;

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
 * CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner {
  public static final String SERIALIZED_NAME_RULENAME = "rulename";
  @SerializedName(SERIALIZED_NAME_RULENAME)
  private String rulename = "null";

  public static final String SERIALIZED_NAME_RULEVALUE = "rulevalue";
  @SerializedName(SERIALIZED_NAME_RULEVALUE)
  private CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue rulevalue;

  public CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner() {
  }

  public CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner rulename(String rulename) {
    this.rulename = rulename;
    return this;
  }

   /**
   * Rule name
   * @return rulename
  **/
  @javax.annotation.Nullable
  public String getRulename() {
    return rulename;
  }

  public void setRulename(String rulename) {
    this.rulename = rulename;
  }


  public CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner rulevalue(CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue rulevalue) {
    this.rulevalue = rulevalue;
    return this;
  }

   /**
   * Get rulevalue
   * @return rulevalue
  **/
  @javax.annotation.Nullable
  public CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue getRulevalue() {
    return rulevalue;
  }

  public void setRulevalue(CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue rulevalue) {
    this.rulevalue = rulevalue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner coreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner = (CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner) o;
    return Objects.equals(this.rulename, coreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.rulename) &&
        Objects.equals(this.rulevalue, coreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.rulevalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rulename, rulevalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner {\n");
    sb.append("    rulename: ").append(toIndentedString(rulename)).append("\n");
    sb.append("    rulevalue: ").append(toIndentedString(rulevalue)).append("\n");
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
    openapiFields.add("rulename");
    openapiFields.add("rulevalue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner is not found in the empty JSON string", CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("rulename") != null && !jsonObj.get("rulename").isJsonNull()) && !jsonObj.get("rulename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rulename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rulename").toString()));
      }
      // validate the optional field `rulevalue`
      if (jsonObj.get("rulevalue") != null && !jsonObj.get("rulevalue").isJsonNull()) {
        CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue.validateJsonElement(jsonObj.get("rulevalue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner>() {
           @Override
           public void write(JsonWriter out, CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
  * @throws IOException if the JSON string is invalid with respect to CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
  */
  public static CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.class);
  }

 /**
  * Convert an instance of CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


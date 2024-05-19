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
 * CoreGradesGraderGradingpanelScaleStoreRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradesGraderGradingpanelScaleStoreRequest {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid;

  public static final String SERIALIZED_NAME_FORMDATA = "formdata";
  @SerializedName(SERIALIZED_NAME_FORMDATA)
  private String formdata;

  public static final String SERIALIZED_NAME_GRADEDUSERID = "gradeduserid";
  @SerializedName(SERIALIZED_NAME_GRADEDUSERID)
  private Integer gradeduserid;

  public static final String SERIALIZED_NAME_ITEMNAME = "itemname";
  @SerializedName(SERIALIZED_NAME_ITEMNAME)
  private String itemname;

  public static final String SERIALIZED_NAME_NOTIFYUSER = "notifyuser";
  @SerializedName(SERIALIZED_NAME_NOTIFYUSER)
  private Boolean notifyuser = false;

  public CoreGradesGraderGradingpanelScaleStoreRequest() {
  }

  public CoreGradesGraderGradingpanelScaleStoreRequest component(String component) {
    this.component = component;
    return this;
  }

   /**
   * The name of the component
   * @return component
  **/
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreGradesGraderGradingpanelScaleStoreRequest contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * The ID of the context being graded
   * @return contextid
  **/
  @javax.annotation.Nonnull
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public CoreGradesGraderGradingpanelScaleStoreRequest formdata(String formdata) {
    this.formdata = formdata;
    return this;
  }

   /**
   * The serialised form data representing the grade
   * @return formdata
  **/
  @javax.annotation.Nonnull
  public String getFormdata() {
    return formdata;
  }

  public void setFormdata(String formdata) {
    this.formdata = formdata;
  }


  public CoreGradesGraderGradingpanelScaleStoreRequest gradeduserid(Integer gradeduserid) {
    this.gradeduserid = gradeduserid;
    return this;
  }

   /**
   * The ID of the user show
   * @return gradeduserid
  **/
  @javax.annotation.Nonnull
  public Integer getGradeduserid() {
    return gradeduserid;
  }

  public void setGradeduserid(Integer gradeduserid) {
    this.gradeduserid = gradeduserid;
  }


  public CoreGradesGraderGradingpanelScaleStoreRequest itemname(String itemname) {
    this.itemname = itemname;
    return this;
  }

   /**
   * The grade item itemname being graded
   * @return itemname
  **/
  @javax.annotation.Nonnull
  public String getItemname() {
    return itemname;
  }

  public void setItemname(String itemname) {
    this.itemname = itemname;
  }


  public CoreGradesGraderGradingpanelScaleStoreRequest notifyuser(Boolean notifyuser) {
    this.notifyuser = notifyuser;
    return this;
  }

   /**
   * Wheteher to notify the user or not
   * @return notifyuser
  **/
  @javax.annotation.Nullable
  public Boolean getNotifyuser() {
    return notifyuser;
  }

  public void setNotifyuser(Boolean notifyuser) {
    this.notifyuser = notifyuser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest = (CoreGradesGraderGradingpanelScaleStoreRequest) o;
    return Objects.equals(this.component, coreGradesGraderGradingpanelScaleStoreRequest.component) &&
        Objects.equals(this.contextid, coreGradesGraderGradingpanelScaleStoreRequest.contextid) &&
        Objects.equals(this.formdata, coreGradesGraderGradingpanelScaleStoreRequest.formdata) &&
        Objects.equals(this.gradeduserid, coreGradesGraderGradingpanelScaleStoreRequest.gradeduserid) &&
        Objects.equals(this.itemname, coreGradesGraderGradingpanelScaleStoreRequest.itemname) &&
        Objects.equals(this.notifyuser, coreGradesGraderGradingpanelScaleStoreRequest.notifyuser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, contextid, formdata, gradeduserid, itemname, notifyuser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradesGraderGradingpanelScaleStoreRequest {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    formdata: ").append(toIndentedString(formdata)).append("\n");
    sb.append("    gradeduserid: ").append(toIndentedString(gradeduserid)).append("\n");
    sb.append("    itemname: ").append(toIndentedString(itemname)).append("\n");
    sb.append("    notifyuser: ").append(toIndentedString(notifyuser)).append("\n");
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
    openapiFields.add("component");
    openapiFields.add("contextid");
    openapiFields.add("formdata");
    openapiFields.add("gradeduserid");
    openapiFields.add("itemname");
    openapiFields.add("notifyuser");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("contextid");
    openapiRequiredFields.add("formdata");
    openapiRequiredFields.add("gradeduserid");
    openapiRequiredFields.add("itemname");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradesGraderGradingpanelScaleStoreRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradesGraderGradingpanelScaleStoreRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradesGraderGradingpanelScaleStoreRequest is not found in the empty JSON string", CoreGradesGraderGradingpanelScaleStoreRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradesGraderGradingpanelScaleStoreRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradesGraderGradingpanelScaleStoreRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGradesGraderGradingpanelScaleStoreRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("formdata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formdata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formdata").toString()));
      }
      if (!jsonObj.get("itemname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradesGraderGradingpanelScaleStoreRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradesGraderGradingpanelScaleStoreRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradesGraderGradingpanelScaleStoreRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradesGraderGradingpanelScaleStoreRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradesGraderGradingpanelScaleStoreRequest>() {
           @Override
           public void write(JsonWriter out, CoreGradesGraderGradingpanelScaleStoreRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradesGraderGradingpanelScaleStoreRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradesGraderGradingpanelScaleStoreRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradesGraderGradingpanelScaleStoreRequest
  * @throws IOException if the JSON string is invalid with respect to CoreGradesGraderGradingpanelScaleStoreRequest
  */
  public static CoreGradesGraderGradingpanelScaleStoreRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradesGraderGradingpanelScaleStoreRequest.class);
  }

 /**
  * Convert an instance of CoreGradesGraderGradingpanelScaleStoreRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


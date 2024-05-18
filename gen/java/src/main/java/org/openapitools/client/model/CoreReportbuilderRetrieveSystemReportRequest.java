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
import org.openapitools.client.model.CoreCohortSearchCohortsRequestContext;
import org.openapitools.client.model.CoreReportbuilderCanViewSystemReportRequestParametersInner;

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
 * CoreReportbuilderRetrieveSystemReportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreReportbuilderRetrieveSystemReportRequest {
  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area = "";

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "";

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private CoreCohortSearchCohortsRequestContext context;

  public static final String SERIALIZED_NAME_ITEMID = "itemid";
  @SerializedName(SERIALIZED_NAME_ITEMID)
  private Integer itemid = 0;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = 0;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<CoreReportbuilderCanViewSystemReportRequestParametersInner> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERPAGE = "perpage";
  @SerializedName(SERIALIZED_NAME_PERPAGE)
  private Integer perpage = 10;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public CoreReportbuilderRetrieveSystemReportRequest() {
  }

  public CoreReportbuilderRetrieveSystemReportRequest area(String area) {
    this.area = area;
    return this;
  }

   /**
   * Report area
   * @return area
  **/
  @javax.annotation.Nullable
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public CoreReportbuilderRetrieveSystemReportRequest component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Report component
   * @return component
  **/
  @javax.annotation.Nullable
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreReportbuilderRetrieveSystemReportRequest context(CoreCohortSearchCohortsRequestContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nonnull
  public CoreCohortSearchCohortsRequestContext getContext() {
    return context;
  }

  public void setContext(CoreCohortSearchCohortsRequestContext context) {
    this.context = context;
  }


  public CoreReportbuilderRetrieveSystemReportRequest itemid(Integer itemid) {
    this.itemid = itemid;
    return this;
  }

   /**
   * Report item ID
   * @return itemid
  **/
  @javax.annotation.Nullable
  public Integer getItemid() {
    return itemid;
  }

  public void setItemid(Integer itemid) {
    this.itemid = itemid;
  }


  public CoreReportbuilderRetrieveSystemReportRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public CoreReportbuilderRetrieveSystemReportRequest parameters(List<CoreReportbuilderCanViewSystemReportRequestParametersInner> parameters) {
    this.parameters = parameters;
    return this;
  }

  public CoreReportbuilderRetrieveSystemReportRequest addParametersItem(CoreReportbuilderCanViewSystemReportRequestParametersInner parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<CoreReportbuilderCanViewSystemReportRequestParametersInner> getParameters() {
    return parameters;
  }

  public void setParameters(List<CoreReportbuilderCanViewSystemReportRequestParametersInner> parameters) {
    this.parameters = parameters;
  }


  public CoreReportbuilderRetrieveSystemReportRequest perpage(Integer perpage) {
    this.perpage = perpage;
    return this;
  }

   /**
   * Reports per page
   * @return perpage
  **/
  @javax.annotation.Nullable
  public Integer getPerpage() {
    return perpage;
  }

  public void setPerpage(Integer perpage) {
    this.perpage = perpage;
  }


  public CoreReportbuilderRetrieveSystemReportRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Report class path
   * @return source
  **/
  @javax.annotation.Nonnull
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreReportbuilderRetrieveSystemReportRequest coreReportbuilderRetrieveSystemReportRequest = (CoreReportbuilderRetrieveSystemReportRequest) o;
    return Objects.equals(this.area, coreReportbuilderRetrieveSystemReportRequest.area) &&
        Objects.equals(this.component, coreReportbuilderRetrieveSystemReportRequest.component) &&
        Objects.equals(this.context, coreReportbuilderRetrieveSystemReportRequest.context) &&
        Objects.equals(this.itemid, coreReportbuilderRetrieveSystemReportRequest.itemid) &&
        Objects.equals(this.page, coreReportbuilderRetrieveSystemReportRequest.page) &&
        Objects.equals(this.parameters, coreReportbuilderRetrieveSystemReportRequest.parameters) &&
        Objects.equals(this.perpage, coreReportbuilderRetrieveSystemReportRequest.perpage) &&
        Objects.equals(this.source, coreReportbuilderRetrieveSystemReportRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, component, context, itemid, page, parameters, perpage, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreReportbuilderRetrieveSystemReportRequest {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    itemid: ").append(toIndentedString(itemid)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("area");
    openapiFields.add("component");
    openapiFields.add("context");
    openapiFields.add("itemid");
    openapiFields.add("page");
    openapiFields.add("parameters");
    openapiFields.add("perpage");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("context");
    openapiRequiredFields.add("source");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreReportbuilderRetrieveSystemReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreReportbuilderRetrieveSystemReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreReportbuilderRetrieveSystemReportRequest is not found in the empty JSON string", CoreReportbuilderRetrieveSystemReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreReportbuilderRetrieveSystemReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreReportbuilderRetrieveSystemReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreReportbuilderRetrieveSystemReportRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      // validate the required field `context`
      CoreCohortSearchCohortsRequestContext.validateJsonElement(jsonObj.get("context"));
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            CoreReportbuilderCanViewSystemReportRequestParametersInner.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreReportbuilderRetrieveSystemReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreReportbuilderRetrieveSystemReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreReportbuilderRetrieveSystemReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreReportbuilderRetrieveSystemReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreReportbuilderRetrieveSystemReportRequest>() {
           @Override
           public void write(JsonWriter out, CoreReportbuilderRetrieveSystemReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreReportbuilderRetrieveSystemReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreReportbuilderRetrieveSystemReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreReportbuilderRetrieveSystemReportRequest
  * @throws IOException if the JSON string is invalid with respect to CoreReportbuilderRetrieveSystemReportRequest
  */
  public static CoreReportbuilderRetrieveSystemReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreReportbuilderRetrieveSystemReportRequest.class);
  }

 /**
  * Convert an instance of CoreReportbuilderRetrieveSystemReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

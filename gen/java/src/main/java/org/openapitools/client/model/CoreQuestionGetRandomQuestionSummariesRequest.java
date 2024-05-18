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
 * CoreQuestionGetRandomQuestionSummariesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreQuestionGetRandomQuestionSummariesRequest {
  public static final String SERIALIZED_NAME_CATEGORYID = "categoryid";
  @SerializedName(SERIALIZED_NAME_CATEGORYID)
  private Integer categoryid = null;

  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid = null;

  public static final String SERIALIZED_NAME_INCLUDESUBCATEGORIES = "includesubcategories";
  @SerializedName(SERIALIZED_NAME_INCLUDESUBCATEGORIES)
  private Boolean includesubcategories = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 0;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_TAGIDS = "tagids";
  @SerializedName(SERIALIZED_NAME_TAGIDS)
  private List<Object> tagids = new ArrayList<>();

  public CoreQuestionGetRandomQuestionSummariesRequest() {
  }

  public CoreQuestionGetRandomQuestionSummariesRequest categoryid(Integer categoryid) {
    this.categoryid = categoryid;
    return this;
  }

   /**
   * Category id to find random questions
   * @return categoryid
  **/
  @javax.annotation.Nonnull
  public Integer getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(Integer categoryid) {
    this.categoryid = categoryid;
  }


  public CoreQuestionGetRandomQuestionSummariesRequest contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * Context id that the questions will be rendered in (used for exporting)
   * @return contextid
  **/
  @javax.annotation.Nonnull
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public CoreQuestionGetRandomQuestionSummariesRequest includesubcategories(Boolean includesubcategories) {
    this.includesubcategories = includesubcategories;
    return this;
  }

   /**
   * Include the subcategories in the search
   * @return includesubcategories
  **/
  @javax.annotation.Nonnull
  public Boolean getIncludesubcategories() {
    return includesubcategories;
  }

  public void setIncludesubcategories(Boolean includesubcategories) {
    this.includesubcategories = includesubcategories;
  }


  public CoreQuestionGetRandomQuestionSummariesRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Maximum number of results to return
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public CoreQuestionGetRandomQuestionSummariesRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Number of items to skip from the begging of the result set
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public CoreQuestionGetRandomQuestionSummariesRequest tagids(List<Object> tagids) {
    this.tagids = tagids;
    return this;
  }

  public CoreQuestionGetRandomQuestionSummariesRequest addTagidsItem(Object tagidsItem) {
    if (this.tagids == null) {
      this.tagids = new ArrayList<>();
    }
    this.tagids.add(tagidsItem);
    return this;
  }

   /**
   * Get tagids
   * @return tagids
  **/
  @javax.annotation.Nonnull
  public List<Object> getTagids() {
    return tagids;
  }

  public void setTagids(List<Object> tagids) {
    this.tagids = tagids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreQuestionGetRandomQuestionSummariesRequest coreQuestionGetRandomQuestionSummariesRequest = (CoreQuestionGetRandomQuestionSummariesRequest) o;
    return Objects.equals(this.categoryid, coreQuestionGetRandomQuestionSummariesRequest.categoryid) &&
        Objects.equals(this.contextid, coreQuestionGetRandomQuestionSummariesRequest.contextid) &&
        Objects.equals(this.includesubcategories, coreQuestionGetRandomQuestionSummariesRequest.includesubcategories) &&
        Objects.equals(this.limit, coreQuestionGetRandomQuestionSummariesRequest.limit) &&
        Objects.equals(this.offset, coreQuestionGetRandomQuestionSummariesRequest.offset) &&
        Objects.equals(this.tagids, coreQuestionGetRandomQuestionSummariesRequest.tagids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryid, contextid, includesubcategories, limit, offset, tagids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreQuestionGetRandomQuestionSummariesRequest {\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    includesubcategories: ").append(toIndentedString(includesubcategories)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    tagids: ").append(toIndentedString(tagids)).append("\n");
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
    openapiFields.add("categoryid");
    openapiFields.add("contextid");
    openapiFields.add("includesubcategories");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("tagids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("categoryid");
    openapiRequiredFields.add("contextid");
    openapiRequiredFields.add("includesubcategories");
    openapiRequiredFields.add("tagids");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreQuestionGetRandomQuestionSummariesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreQuestionGetRandomQuestionSummariesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreQuestionGetRandomQuestionSummariesRequest is not found in the empty JSON string", CoreQuestionGetRandomQuestionSummariesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreQuestionGetRandomQuestionSummariesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreQuestionGetRandomQuestionSummariesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreQuestionGetRandomQuestionSummariesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("tagids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tagids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagids` to be an array in the JSON string but got `%s`", jsonObj.get("tagids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreQuestionGetRandomQuestionSummariesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreQuestionGetRandomQuestionSummariesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreQuestionGetRandomQuestionSummariesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreQuestionGetRandomQuestionSummariesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreQuestionGetRandomQuestionSummariesRequest>() {
           @Override
           public void write(JsonWriter out, CoreQuestionGetRandomQuestionSummariesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreQuestionGetRandomQuestionSummariesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreQuestionGetRandomQuestionSummariesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreQuestionGetRandomQuestionSummariesRequest
  * @throws IOException if the JSON string is invalid with respect to CoreQuestionGetRandomQuestionSummariesRequest
  */
  public static CoreQuestionGetRandomQuestionSummariesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreQuestionGetRandomQuestionSummariesRequest.class);
  }

 /**
  * Convert an instance of CoreQuestionGetRandomQuestionSummariesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

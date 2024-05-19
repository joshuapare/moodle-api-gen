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
import org.openapitools.client.model.AuthEmailSignupUser200ResponseWarningsInner;
import org.openapitools.client.model.CoreTagGetTagCloud200ResponseTagsInner;

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
 * CoreTagGetTagCloud200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreTagGetTagCloud200Response {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<CoreTagGetTagCloud200ResponseTagsInner> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGSCOUNT = "tagscount";
  @SerializedName(SERIALIZED_NAME_TAGSCOUNT)
  private Integer tagscount = null;

  public static final String SERIALIZED_NAME_TOTALCOUNT = "totalcount";
  @SerializedName(SERIALIZED_NAME_TOTALCOUNT)
  private Integer totalcount = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public CoreTagGetTagCloud200Response() {
  }

  public CoreTagGetTagCloud200Response tags(List<CoreTagGetTagCloud200ResponseTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public CoreTagGetTagCloud200Response addTagsItem(CoreTagGetTagCloud200ResponseTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  public List<CoreTagGetTagCloud200ResponseTagsInner> getTags() {
    return tags;
  }

  public void setTags(List<CoreTagGetTagCloud200ResponseTagsInner> tags) {
    this.tags = tags;
  }


  public CoreTagGetTagCloud200Response tagscount(Integer tagscount) {
    this.tagscount = tagscount;
    return this;
  }

   /**
   * Number of tags returned.
   * @return tagscount
  **/
  @javax.annotation.Nonnull
  public Integer getTagscount() {
    return tagscount;
  }

  public void setTagscount(Integer tagscount) {
    this.tagscount = tagscount;
  }


  public CoreTagGetTagCloud200Response totalcount(Integer totalcount) {
    this.totalcount = totalcount;
    return this;
  }

   /**
   * Total count of tags.
   * @return totalcount
  **/
  @javax.annotation.Nonnull
  public Integer getTotalcount() {
    return totalcount;
  }

  public void setTotalcount(Integer totalcount) {
    this.totalcount = totalcount;
  }


  public CoreTagGetTagCloud200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CoreTagGetTagCloud200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  public List<AuthEmailSignupUser200ResponseWarningsInner> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreTagGetTagCloud200Response coreTagGetTagCloud200Response = (CoreTagGetTagCloud200Response) o;
    return Objects.equals(this.tags, coreTagGetTagCloud200Response.tags) &&
        Objects.equals(this.tagscount, coreTagGetTagCloud200Response.tagscount) &&
        Objects.equals(this.totalcount, coreTagGetTagCloud200Response.totalcount) &&
        Objects.equals(this.warnings, coreTagGetTagCloud200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, tagscount, totalcount, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreTagGetTagCloud200Response {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tagscount: ").append(toIndentedString(tagscount)).append("\n");
    sb.append("    totalcount: ").append(toIndentedString(totalcount)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("tagscount");
    openapiFields.add("totalcount");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("tagscount");
    openapiRequiredFields.add("totalcount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreTagGetTagCloud200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreTagGetTagCloud200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreTagGetTagCloud200Response is not found in the empty JSON string", CoreTagGetTagCloud200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreTagGetTagCloud200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreTagGetTagCloud200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreTagGetTagCloud200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }

      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      // validate the required field `tags` (array)
      for (int i = 0; i < jsonArraytags.size(); i++) {
        CoreTagGetTagCloud200ResponseTagsInner.validateJsonElement(jsonArraytags.get(i));
      };
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) {
        JsonArray jsonArraywarnings = jsonObj.getAsJsonArray("warnings");
        if (jsonArraywarnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
          }

          // validate the optional field `warnings` (array)
          for (int i = 0; i < jsonArraywarnings.size(); i++) {
            AuthEmailSignupUser200ResponseWarningsInner.validateJsonElement(jsonArraywarnings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreTagGetTagCloud200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreTagGetTagCloud200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreTagGetTagCloud200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreTagGetTagCloud200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreTagGetTagCloud200Response>() {
           @Override
           public void write(JsonWriter out, CoreTagGetTagCloud200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreTagGetTagCloud200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreTagGetTagCloud200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreTagGetTagCloud200Response
  * @throws IOException if the JSON string is invalid with respect to CoreTagGetTagCloud200Response
  */
  public static CoreTagGetTagCloud200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreTagGetTagCloud200Response.class);
  }

 /**
  * Convert an instance of CoreTagGetTagCloud200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreCourseDuplicateCourseRequestOptionsInner;

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
 * CoreCourseDuplicateCourseRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseDuplicateCourseRequest {
  public static final String SERIALIZED_NAME_CATEGORYID = "categoryid";
  @SerializedName(SERIALIZED_NAME_CATEGORYID)
  private Integer categoryid = null;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid = null;

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname = "null";

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<CoreCourseDuplicateCourseRequestOptionsInner> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname = "null";

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Integer visible = 1;

  public CoreCourseDuplicateCourseRequest() {
  }

  public CoreCourseDuplicateCourseRequest categoryid(Integer categoryid) {
    this.categoryid = categoryid;
    return this;
  }

   /**
   * duplicated course category parent
   * @return categoryid
  **/
  @javax.annotation.Nonnull
  public Integer getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(Integer categoryid) {
    this.categoryid = categoryid;
  }


  public CoreCourseDuplicateCourseRequest courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * course to duplicate id
   * @return courseid
  **/
  @javax.annotation.Nonnull
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public CoreCourseDuplicateCourseRequest fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * duplicated course full name
   * @return fullname
  **/
  @javax.annotation.Nonnull
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public CoreCourseDuplicateCourseRequest options(List<CoreCourseDuplicateCourseRequestOptionsInner> options) {
    this.options = options;
    return this;
  }

  public CoreCourseDuplicateCourseRequest addOptionsItem(CoreCourseDuplicateCourseRequestOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public List<CoreCourseDuplicateCourseRequestOptionsInner> getOptions() {
    return options;
  }

  public void setOptions(List<CoreCourseDuplicateCourseRequestOptionsInner> options) {
    this.options = options;
  }


  public CoreCourseDuplicateCourseRequest shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * duplicated course short name
   * @return shortname
  **/
  @javax.annotation.Nonnull
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public CoreCourseDuplicateCourseRequest visible(Integer visible) {
    this.visible = visible;
    return this;
  }

   /**
   * duplicated course visible, default to yes
   * @return visible
  **/
  @javax.annotation.Nullable
  public Integer getVisible() {
    return visible;
  }

  public void setVisible(Integer visible) {
    this.visible = visible;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseDuplicateCourseRequest coreCourseDuplicateCourseRequest = (CoreCourseDuplicateCourseRequest) o;
    return Objects.equals(this.categoryid, coreCourseDuplicateCourseRequest.categoryid) &&
        Objects.equals(this.courseid, coreCourseDuplicateCourseRequest.courseid) &&
        Objects.equals(this.fullname, coreCourseDuplicateCourseRequest.fullname) &&
        Objects.equals(this.options, coreCourseDuplicateCourseRequest.options) &&
        Objects.equals(this.shortname, coreCourseDuplicateCourseRequest.shortname) &&
        Objects.equals(this.visible, coreCourseDuplicateCourseRequest.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryid, courseid, fullname, options, shortname, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseDuplicateCourseRequest {\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
    openapiFields.add("courseid");
    openapiFields.add("fullname");
    openapiFields.add("options");
    openapiFields.add("shortname");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("categoryid");
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("fullname");
    openapiRequiredFields.add("shortname");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseDuplicateCourseRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseDuplicateCourseRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseDuplicateCourseRequest is not found in the empty JSON string", CoreCourseDuplicateCourseRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseDuplicateCourseRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseDuplicateCourseRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCourseDuplicateCourseRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            CoreCourseDuplicateCourseRequestOptionsInner.validateJsonElement(jsonArrayoptions.get(i));
          };
        }
      }
      if (!jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseDuplicateCourseRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseDuplicateCourseRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseDuplicateCourseRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseDuplicateCourseRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseDuplicateCourseRequest>() {
           @Override
           public void write(JsonWriter out, CoreCourseDuplicateCourseRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseDuplicateCourseRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseDuplicateCourseRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseDuplicateCourseRequest
  * @throws IOException if the JSON string is invalid with respect to CoreCourseDuplicateCourseRequest
  */
  public static CoreCourseDuplicateCourseRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseDuplicateCourseRequest.class);
  }

 /**
  * Convert an instance of CoreCourseDuplicateCourseRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreGradesUpdateGradesRequestGradesInner;
import org.openapitools.client.model.CoreGradesUpdateGradesRequestItemdetails;

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
 * CoreGradesUpdateGradesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradesUpdateGradesRequest {
  public static final String SERIALIZED_NAME_ACTIVITYID = "activityid";
  @SerializedName(SERIALIZED_NAME_ACTIVITYID)
  private Integer activityid = null;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "null";

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_GRADES = "grades";
  @SerializedName(SERIALIZED_NAME_GRADES)
  private List<CoreGradesUpdateGradesRequestGradesInner> grades = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEMDETAILS = "itemdetails";
  @SerializedName(SERIALIZED_NAME_ITEMDETAILS)
  private CoreGradesUpdateGradesRequestItemdetails itemdetails;

  public static final String SERIALIZED_NAME_ITEMNUMBER = "itemnumber";
  @SerializedName(SERIALIZED_NAME_ITEMNUMBER)
  private Integer itemnumber = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = "null";

  public CoreGradesUpdateGradesRequest() {
  }

  public CoreGradesUpdateGradesRequest activityid(Integer activityid) {
    this.activityid = activityid;
    return this;
  }

   /**
   * The activity ID
   * @return activityid
  **/
  @javax.annotation.Nonnull
  public Integer getActivityid() {
    return activityid;
  }

  public void setActivityid(Integer activityid) {
    this.activityid = activityid;
  }


  public CoreGradesUpdateGradesRequest component(String component) {
    this.component = component;
    return this;
  }

   /**
   * A component, for example mod_forum or mod_quiz
   * @return component
  **/
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreGradesUpdateGradesRequest courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * id of course
   * @return courseid
  **/
  @javax.annotation.Nonnull
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public CoreGradesUpdateGradesRequest grades(List<CoreGradesUpdateGradesRequestGradesInner> grades) {
    this.grades = grades;
    return this;
  }

  public CoreGradesUpdateGradesRequest addGradesItem(CoreGradesUpdateGradesRequestGradesInner gradesItem) {
    if (this.grades == null) {
      this.grades = new ArrayList<>();
    }
    this.grades.add(gradesItem);
    return this;
  }

   /**
   * Get grades
   * @return grades
  **/
  @javax.annotation.Nullable
  public List<CoreGradesUpdateGradesRequestGradesInner> getGrades() {
    return grades;
  }

  public void setGrades(List<CoreGradesUpdateGradesRequestGradesInner> grades) {
    this.grades = grades;
  }


  public CoreGradesUpdateGradesRequest itemdetails(CoreGradesUpdateGradesRequestItemdetails itemdetails) {
    this.itemdetails = itemdetails;
    return this;
  }

   /**
   * Get itemdetails
   * @return itemdetails
  **/
  @javax.annotation.Nullable
  public CoreGradesUpdateGradesRequestItemdetails getItemdetails() {
    return itemdetails;
  }

  public void setItemdetails(CoreGradesUpdateGradesRequestItemdetails itemdetails) {
    this.itemdetails = itemdetails;
  }


  public CoreGradesUpdateGradesRequest itemnumber(Integer itemnumber) {
    this.itemnumber = itemnumber;
    return this;
  }

   /**
   * grade item ID number for modules that have multiple grades. Typically this is 0.
   * @return itemnumber
  **/
  @javax.annotation.Nonnull
  public Integer getItemnumber() {
    return itemnumber;
  }

  public void setItemnumber(Integer itemnumber) {
    this.itemnumber = itemnumber;
  }


  public CoreGradesUpdateGradesRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the grade update
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
    CoreGradesUpdateGradesRequest coreGradesUpdateGradesRequest = (CoreGradesUpdateGradesRequest) o;
    return Objects.equals(this.activityid, coreGradesUpdateGradesRequest.activityid) &&
        Objects.equals(this.component, coreGradesUpdateGradesRequest.component) &&
        Objects.equals(this.courseid, coreGradesUpdateGradesRequest.courseid) &&
        Objects.equals(this.grades, coreGradesUpdateGradesRequest.grades) &&
        Objects.equals(this.itemdetails, coreGradesUpdateGradesRequest.itemdetails) &&
        Objects.equals(this.itemnumber, coreGradesUpdateGradesRequest.itemnumber) &&
        Objects.equals(this.source, coreGradesUpdateGradesRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityid, component, courseid, grades, itemdetails, itemnumber, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradesUpdateGradesRequest {\n");
    sb.append("    activityid: ").append(toIndentedString(activityid)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
    sb.append("    itemdetails: ").append(toIndentedString(itemdetails)).append("\n");
    sb.append("    itemnumber: ").append(toIndentedString(itemnumber)).append("\n");
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
    openapiFields.add("activityid");
    openapiFields.add("component");
    openapiFields.add("courseid");
    openapiFields.add("grades");
    openapiFields.add("itemdetails");
    openapiFields.add("itemnumber");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activityid");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("itemnumber");
    openapiRequiredFields.add("source");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradesUpdateGradesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradesUpdateGradesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradesUpdateGradesRequest is not found in the empty JSON string", CoreGradesUpdateGradesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradesUpdateGradesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradesUpdateGradesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreGradesUpdateGradesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (jsonObj.get("grades") != null && !jsonObj.get("grades").isJsonNull()) {
        JsonArray jsonArraygrades = jsonObj.getAsJsonArray("grades");
        if (jsonArraygrades != null) {
          // ensure the json data is an array
          if (!jsonObj.get("grades").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `grades` to be an array in the JSON string but got `%s`", jsonObj.get("grades").toString()));
          }

          // validate the optional field `grades` (array)
          for (int i = 0; i < jsonArraygrades.size(); i++) {
            CoreGradesUpdateGradesRequestGradesInner.validateJsonElement(jsonArraygrades.get(i));
          };
        }
      }
      // validate the optional field `itemdetails`
      if (jsonObj.get("itemdetails") != null && !jsonObj.get("itemdetails").isJsonNull()) {
        CoreGradesUpdateGradesRequestItemdetails.validateJsonElement(jsonObj.get("itemdetails"));
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradesUpdateGradesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradesUpdateGradesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradesUpdateGradesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradesUpdateGradesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradesUpdateGradesRequest>() {
           @Override
           public void write(JsonWriter out, CoreGradesUpdateGradesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradesUpdateGradesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradesUpdateGradesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradesUpdateGradesRequest
  * @throws IOException if the JSON string is invalid with respect to CoreGradesUpdateGradesRequest
  */
  public static CoreGradesUpdateGradesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradesUpdateGradesRequest.class);
  }

 /**
  * Convert an instance of CoreGradesUpdateGradesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


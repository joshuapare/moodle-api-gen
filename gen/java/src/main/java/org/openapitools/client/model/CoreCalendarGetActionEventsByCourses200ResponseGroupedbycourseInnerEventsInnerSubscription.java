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
 * CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription {
  public static final String SERIALIZED_NAME_DISPLAYEVENTSOURCE = "displayeventsource";
  @SerializedName(SERIALIZED_NAME_DISPLAYEVENTSOURCE)
  private Boolean displayeventsource;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONNAME = "subscriptionname";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONNAME)
  private String subscriptionname;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONURL = "subscriptionurl";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONURL)
  private String subscriptionurl;

  public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription() {
  }

  public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription displayeventsource(Boolean displayeventsource) {
    this.displayeventsource = displayeventsource;
    return this;
  }

   /**
   * displayeventsource
   * @return displayeventsource
  **/
  @javax.annotation.Nonnull
  public Boolean getDisplayeventsource() {
    return displayeventsource;
  }

  public void setDisplayeventsource(Boolean displayeventsource) {
    this.displayeventsource = displayeventsource;
  }


  public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription subscriptionname(String subscriptionname) {
    this.subscriptionname = subscriptionname;
    return this;
  }

   /**
   * subscriptionname
   * @return subscriptionname
  **/
  @javax.annotation.Nullable
  public String getSubscriptionname() {
    return subscriptionname;
  }

  public void setSubscriptionname(String subscriptionname) {
    this.subscriptionname = subscriptionname;
  }


  public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription subscriptionurl(String subscriptionurl) {
    this.subscriptionurl = subscriptionurl;
    return this;
  }

   /**
   * subscriptionurl
   * @return subscriptionurl
  **/
  @javax.annotation.Nullable
  public String getSubscriptionurl() {
    return subscriptionurl;
  }

  public void setSubscriptionurl(String subscriptionurl) {
    this.subscriptionurl = subscriptionurl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription = (CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription) o;
    return Objects.equals(this.displayeventsource, coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.displayeventsource) &&
        Objects.equals(this.subscriptionname, coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.subscriptionname) &&
        Objects.equals(this.subscriptionurl, coreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.subscriptionurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayeventsource, subscriptionname, subscriptionurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription {\n");
    sb.append("    displayeventsource: ").append(toIndentedString(displayeventsource)).append("\n");
    sb.append("    subscriptionname: ").append(toIndentedString(subscriptionname)).append("\n");
    sb.append("    subscriptionurl: ").append(toIndentedString(subscriptionurl)).append("\n");
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
    openapiFields.add("displayeventsource");
    openapiFields.add("subscriptionname");
    openapiFields.add("subscriptionurl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("displayeventsource");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription is not found in the empty JSON string", CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subscriptionname") != null && !jsonObj.get("subscriptionname").isJsonNull()) && !jsonObj.get("subscriptionname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionname").toString()));
      }
      if ((jsonObj.get("subscriptionurl") != null && !jsonObj.get("subscriptionurl").isJsonNull()) && !jsonObj.get("subscriptionurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription>() {
           @Override
           public void write(JsonWriter out, CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription
  * @throws IOException if the JSON string is invalid with respect to CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription
  */
  public static CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.class);
  }

 /**
  * Convert an instance of CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

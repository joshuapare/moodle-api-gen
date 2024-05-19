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
import org.openapitools.client.model.CoreCalendarGetCalendarDayView200ResponseNextperiod;
import org.openapitools.client.model.CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner;

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
 * CoreCalendarGetCalendarUpcomingView200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCalendarGetCalendarUpcomingView200Response {
  public static final String SERIALIZED_NAME_CATEGORYID = "categoryid";
  @SerializedName(SERIALIZED_NAME_CATEGORYID)
  private Integer categoryid = 0;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private CoreCalendarGetCalendarDayView200ResponseNextperiod date;

  public static final String SERIALIZED_NAME_DEFAULTEVENTCONTEXT = "defaulteventcontext";
  @SerializedName(SERIALIZED_NAME_DEFAULTEVENTCONTEXT)
  private Integer defaulteventcontext = 0;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTER_SELECTOR = "filter_selector";
  @SerializedName(SERIALIZED_NAME_FILTER_SELECTOR)
  private String filterSelector;

  public static final String SERIALIZED_NAME_ISLOGGEDIN = "isloggedin";
  @SerializedName(SERIALIZED_NAME_ISLOGGEDIN)
  private Boolean isloggedin = null;

  public CoreCalendarGetCalendarUpcomingView200Response() {
  }

  public CoreCalendarGetCalendarUpcomingView200Response categoryid(Integer categoryid) {
    this.categoryid = categoryid;
    return this;
  }

   /**
   * categoryid
   * @return categoryid
  **/
  @javax.annotation.Nullable
  public Integer getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(Integer categoryid) {
    this.categoryid = categoryid;
  }


  public CoreCalendarGetCalendarUpcomingView200Response courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * courseid
   * @return courseid
  **/
  @javax.annotation.Nonnull
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public CoreCalendarGetCalendarUpcomingView200Response date(CoreCalendarGetCalendarDayView200ResponseNextperiod date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  public CoreCalendarGetCalendarDayView200ResponseNextperiod getDate() {
    return date;
  }

  public void setDate(CoreCalendarGetCalendarDayView200ResponseNextperiod date) {
    this.date = date;
  }


  public CoreCalendarGetCalendarUpcomingView200Response defaulteventcontext(Integer defaulteventcontext) {
    this.defaulteventcontext = defaulteventcontext;
    return this;
  }

   /**
   * defaulteventcontext
   * @return defaulteventcontext
  **/
  @javax.annotation.Nonnull
  public Integer getDefaulteventcontext() {
    return defaulteventcontext;
  }

  public void setDefaulteventcontext(Integer defaulteventcontext) {
    this.defaulteventcontext = defaulteventcontext;
  }


  public CoreCalendarGetCalendarUpcomingView200Response events(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> events) {
    this.events = events;
    return this;
  }

  public CoreCalendarGetCalendarUpcomingView200Response addEventsItem(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull
  public List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> getEvents() {
    return events;
  }

  public void setEvents(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> events) {
    this.events = events;
  }


  public CoreCalendarGetCalendarUpcomingView200Response filterSelector(String filterSelector) {
    this.filterSelector = filterSelector;
    return this;
  }

   /**
   * filter_selector
   * @return filterSelector
  **/
  @javax.annotation.Nonnull
  public String getFilterSelector() {
    return filterSelector;
  }

  public void setFilterSelector(String filterSelector) {
    this.filterSelector = filterSelector;
  }


  public CoreCalendarGetCalendarUpcomingView200Response isloggedin(Boolean isloggedin) {
    this.isloggedin = isloggedin;
    return this;
  }

   /**
   * isloggedin
   * @return isloggedin
  **/
  @javax.annotation.Nonnull
  public Boolean getIsloggedin() {
    return isloggedin;
  }

  public void setIsloggedin(Boolean isloggedin) {
    this.isloggedin = isloggedin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCalendarGetCalendarUpcomingView200Response coreCalendarGetCalendarUpcomingView200Response = (CoreCalendarGetCalendarUpcomingView200Response) o;
    return Objects.equals(this.categoryid, coreCalendarGetCalendarUpcomingView200Response.categoryid) &&
        Objects.equals(this.courseid, coreCalendarGetCalendarUpcomingView200Response.courseid) &&
        Objects.equals(this.date, coreCalendarGetCalendarUpcomingView200Response.date) &&
        Objects.equals(this.defaulteventcontext, coreCalendarGetCalendarUpcomingView200Response.defaulteventcontext) &&
        Objects.equals(this.events, coreCalendarGetCalendarUpcomingView200Response.events) &&
        Objects.equals(this.filterSelector, coreCalendarGetCalendarUpcomingView200Response.filterSelector) &&
        Objects.equals(this.isloggedin, coreCalendarGetCalendarUpcomingView200Response.isloggedin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryid, courseid, date, defaulteventcontext, events, filterSelector, isloggedin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCalendarGetCalendarUpcomingView200Response {\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    defaulteventcontext: ").append(toIndentedString(defaulteventcontext)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filterSelector: ").append(toIndentedString(filterSelector)).append("\n");
    sb.append("    isloggedin: ").append(toIndentedString(isloggedin)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("defaulteventcontext");
    openapiFields.add("events");
    openapiFields.add("filter_selector");
    openapiFields.add("isloggedin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("defaulteventcontext");
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("filter_selector");
    openapiRequiredFields.add("isloggedin");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCalendarGetCalendarUpcomingView200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCalendarGetCalendarUpcomingView200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCalendarGetCalendarUpcomingView200Response is not found in the empty JSON string", CoreCalendarGetCalendarUpcomingView200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCalendarGetCalendarUpcomingView200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCalendarGetCalendarUpcomingView200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCalendarGetCalendarUpcomingView200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `date`
      CoreCalendarGetCalendarDayView200ResponseNextperiod.validateJsonElement(jsonObj.get("date"));
      // ensure the json data is an array
      if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }

      JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
      // validate the required field `events` (array)
      for (int i = 0; i < jsonArrayevents.size(); i++) {
        CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.validateJsonElement(jsonArrayevents.get(i));
      };
      if (!jsonObj.get("filter_selector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_selector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_selector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCalendarGetCalendarUpcomingView200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCalendarGetCalendarUpcomingView200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCalendarGetCalendarUpcomingView200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCalendarGetCalendarUpcomingView200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCalendarGetCalendarUpcomingView200Response>() {
           @Override
           public void write(JsonWriter out, CoreCalendarGetCalendarUpcomingView200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCalendarGetCalendarUpcomingView200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCalendarGetCalendarUpcomingView200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCalendarGetCalendarUpcomingView200Response
  * @throws IOException if the JSON string is invalid with respect to CoreCalendarGetCalendarUpcomingView200Response
  */
  public static CoreCalendarGetCalendarUpcomingView200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCalendarGetCalendarUpcomingView200Response.class);
  }

 /**
  * Convert an instance of CoreCalendarGetCalendarUpcomingView200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


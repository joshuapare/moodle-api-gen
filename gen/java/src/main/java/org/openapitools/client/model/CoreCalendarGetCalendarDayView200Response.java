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
import org.openapitools.client.model.CoreCalendarGetCalendarDayView200ResponseDate;
import org.openapitools.client.model.CoreCalendarGetCalendarDayView200ResponseEventsInner;
import org.openapitools.client.model.CoreCalendarGetCalendarDayView200ResponseNextperiod;

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
 * CoreCalendarGetCalendarDayView200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCalendarGetCalendarDayView200Response {
  public static final String SERIALIZED_NAME_CATEGORYID = "categoryid";
  @SerializedName(SERIALIZED_NAME_CATEGORYID)
  private Integer categoryid = 0;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private CoreCalendarGetCalendarDayView200ResponseDate date;

  public static final String SERIALIZED_NAME_DEFAULTEVENTCONTEXT = "defaulteventcontext";
  @SerializedName(SERIALIZED_NAME_DEFAULTEVENTCONTEXT)
  private Integer defaulteventcontext = 0;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<CoreCalendarGetCalendarDayView200ResponseEventsInner> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTER_SELECTOR = "filter_selector";
  @SerializedName(SERIALIZED_NAME_FILTER_SELECTOR)
  private String filterSelector = "null";

  public static final String SERIALIZED_NAME_LARROW = "larrow";
  @SerializedName(SERIALIZED_NAME_LARROW)
  private String larrow = "null";

  public static final String SERIALIZED_NAME_NEWEVENTTIMESTAMP = "neweventtimestamp";
  @SerializedName(SERIALIZED_NAME_NEWEVENTTIMESTAMP)
  private Integer neweventtimestamp = null;

  public static final String SERIALIZED_NAME_NEXTPERIOD = "nextperiod";
  @SerializedName(SERIALIZED_NAME_NEXTPERIOD)
  private CoreCalendarGetCalendarDayView200ResponseNextperiod nextperiod;

  public static final String SERIALIZED_NAME_NEXTPERIODLINK = "nextperiodlink";
  @SerializedName(SERIALIZED_NAME_NEXTPERIODLINK)
  private String nextperiodlink = "null";

  public static final String SERIALIZED_NAME_NEXTPERIODNAME = "nextperiodname";
  @SerializedName(SERIALIZED_NAME_NEXTPERIODNAME)
  private String nextperiodname = "null";

  public static final String SERIALIZED_NAME_PERIODNAME = "periodname";
  @SerializedName(SERIALIZED_NAME_PERIODNAME)
  private String periodname = "null";

  public static final String SERIALIZED_NAME_PREVIOUSPERIOD = "previousperiod";
  @SerializedName(SERIALIZED_NAME_PREVIOUSPERIOD)
  private CoreCalendarGetCalendarDayView200ResponseNextperiod previousperiod;

  public static final String SERIALIZED_NAME_PREVIOUSPERIODLINK = "previousperiodlink";
  @SerializedName(SERIALIZED_NAME_PREVIOUSPERIODLINK)
  private String previousperiodlink = "null";

  public static final String SERIALIZED_NAME_PREVIOUSPERIODNAME = "previousperiodname";
  @SerializedName(SERIALIZED_NAME_PREVIOUSPERIODNAME)
  private String previousperiodname = "null";

  public static final String SERIALIZED_NAME_RARROW = "rarrow";
  @SerializedName(SERIALIZED_NAME_RARROW)
  private String rarrow = "null";

  public CoreCalendarGetCalendarDayView200Response() {
  }

  public CoreCalendarGetCalendarDayView200Response categoryid(Integer categoryid) {
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


  public CoreCalendarGetCalendarDayView200Response courseid(Integer courseid) {
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


  public CoreCalendarGetCalendarDayView200Response date(CoreCalendarGetCalendarDayView200ResponseDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  public CoreCalendarGetCalendarDayView200ResponseDate getDate() {
    return date;
  }

  public void setDate(CoreCalendarGetCalendarDayView200ResponseDate date) {
    this.date = date;
  }


  public CoreCalendarGetCalendarDayView200Response defaulteventcontext(Integer defaulteventcontext) {
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


  public CoreCalendarGetCalendarDayView200Response events(List<CoreCalendarGetCalendarDayView200ResponseEventsInner> events) {
    this.events = events;
    return this;
  }

  public CoreCalendarGetCalendarDayView200Response addEventsItem(CoreCalendarGetCalendarDayView200ResponseEventsInner eventsItem) {
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
  public List<CoreCalendarGetCalendarDayView200ResponseEventsInner> getEvents() {
    return events;
  }

  public void setEvents(List<CoreCalendarGetCalendarDayView200ResponseEventsInner> events) {
    this.events = events;
  }


  public CoreCalendarGetCalendarDayView200Response filterSelector(String filterSelector) {
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


  public CoreCalendarGetCalendarDayView200Response larrow(String larrow) {
    this.larrow = larrow;
    return this;
  }

   /**
   * larrow
   * @return larrow
  **/
  @javax.annotation.Nonnull
  public String getLarrow() {
    return larrow;
  }

  public void setLarrow(String larrow) {
    this.larrow = larrow;
  }


  public CoreCalendarGetCalendarDayView200Response neweventtimestamp(Integer neweventtimestamp) {
    this.neweventtimestamp = neweventtimestamp;
    return this;
  }

   /**
   * neweventtimestamp
   * @return neweventtimestamp
  **/
  @javax.annotation.Nonnull
  public Integer getNeweventtimestamp() {
    return neweventtimestamp;
  }

  public void setNeweventtimestamp(Integer neweventtimestamp) {
    this.neweventtimestamp = neweventtimestamp;
  }


  public CoreCalendarGetCalendarDayView200Response nextperiod(CoreCalendarGetCalendarDayView200ResponseNextperiod nextperiod) {
    this.nextperiod = nextperiod;
    return this;
  }

   /**
   * Get nextperiod
   * @return nextperiod
  **/
  @javax.annotation.Nonnull
  public CoreCalendarGetCalendarDayView200ResponseNextperiod getNextperiod() {
    return nextperiod;
  }

  public void setNextperiod(CoreCalendarGetCalendarDayView200ResponseNextperiod nextperiod) {
    this.nextperiod = nextperiod;
  }


  public CoreCalendarGetCalendarDayView200Response nextperiodlink(String nextperiodlink) {
    this.nextperiodlink = nextperiodlink;
    return this;
  }

   /**
   * nextperiodlink
   * @return nextperiodlink
  **/
  @javax.annotation.Nonnull
  public String getNextperiodlink() {
    return nextperiodlink;
  }

  public void setNextperiodlink(String nextperiodlink) {
    this.nextperiodlink = nextperiodlink;
  }


  public CoreCalendarGetCalendarDayView200Response nextperiodname(String nextperiodname) {
    this.nextperiodname = nextperiodname;
    return this;
  }

   /**
   * nextperiodname
   * @return nextperiodname
  **/
  @javax.annotation.Nonnull
  public String getNextperiodname() {
    return nextperiodname;
  }

  public void setNextperiodname(String nextperiodname) {
    this.nextperiodname = nextperiodname;
  }


  public CoreCalendarGetCalendarDayView200Response periodname(String periodname) {
    this.periodname = periodname;
    return this;
  }

   /**
   * periodname
   * @return periodname
  **/
  @javax.annotation.Nonnull
  public String getPeriodname() {
    return periodname;
  }

  public void setPeriodname(String periodname) {
    this.periodname = periodname;
  }


  public CoreCalendarGetCalendarDayView200Response previousperiod(CoreCalendarGetCalendarDayView200ResponseNextperiod previousperiod) {
    this.previousperiod = previousperiod;
    return this;
  }

   /**
   * Get previousperiod
   * @return previousperiod
  **/
  @javax.annotation.Nonnull
  public CoreCalendarGetCalendarDayView200ResponseNextperiod getPreviousperiod() {
    return previousperiod;
  }

  public void setPreviousperiod(CoreCalendarGetCalendarDayView200ResponseNextperiod previousperiod) {
    this.previousperiod = previousperiod;
  }


  public CoreCalendarGetCalendarDayView200Response previousperiodlink(String previousperiodlink) {
    this.previousperiodlink = previousperiodlink;
    return this;
  }

   /**
   * previousperiodlink
   * @return previousperiodlink
  **/
  @javax.annotation.Nonnull
  public String getPreviousperiodlink() {
    return previousperiodlink;
  }

  public void setPreviousperiodlink(String previousperiodlink) {
    this.previousperiodlink = previousperiodlink;
  }


  public CoreCalendarGetCalendarDayView200Response previousperiodname(String previousperiodname) {
    this.previousperiodname = previousperiodname;
    return this;
  }

   /**
   * previousperiodname
   * @return previousperiodname
  **/
  @javax.annotation.Nonnull
  public String getPreviousperiodname() {
    return previousperiodname;
  }

  public void setPreviousperiodname(String previousperiodname) {
    this.previousperiodname = previousperiodname;
  }


  public CoreCalendarGetCalendarDayView200Response rarrow(String rarrow) {
    this.rarrow = rarrow;
    return this;
  }

   /**
   * rarrow
   * @return rarrow
  **/
  @javax.annotation.Nonnull
  public String getRarrow() {
    return rarrow;
  }

  public void setRarrow(String rarrow) {
    this.rarrow = rarrow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCalendarGetCalendarDayView200Response coreCalendarGetCalendarDayView200Response = (CoreCalendarGetCalendarDayView200Response) o;
    return Objects.equals(this.categoryid, coreCalendarGetCalendarDayView200Response.categoryid) &&
        Objects.equals(this.courseid, coreCalendarGetCalendarDayView200Response.courseid) &&
        Objects.equals(this.date, coreCalendarGetCalendarDayView200Response.date) &&
        Objects.equals(this.defaulteventcontext, coreCalendarGetCalendarDayView200Response.defaulteventcontext) &&
        Objects.equals(this.events, coreCalendarGetCalendarDayView200Response.events) &&
        Objects.equals(this.filterSelector, coreCalendarGetCalendarDayView200Response.filterSelector) &&
        Objects.equals(this.larrow, coreCalendarGetCalendarDayView200Response.larrow) &&
        Objects.equals(this.neweventtimestamp, coreCalendarGetCalendarDayView200Response.neweventtimestamp) &&
        Objects.equals(this.nextperiod, coreCalendarGetCalendarDayView200Response.nextperiod) &&
        Objects.equals(this.nextperiodlink, coreCalendarGetCalendarDayView200Response.nextperiodlink) &&
        Objects.equals(this.nextperiodname, coreCalendarGetCalendarDayView200Response.nextperiodname) &&
        Objects.equals(this.periodname, coreCalendarGetCalendarDayView200Response.periodname) &&
        Objects.equals(this.previousperiod, coreCalendarGetCalendarDayView200Response.previousperiod) &&
        Objects.equals(this.previousperiodlink, coreCalendarGetCalendarDayView200Response.previousperiodlink) &&
        Objects.equals(this.previousperiodname, coreCalendarGetCalendarDayView200Response.previousperiodname) &&
        Objects.equals(this.rarrow, coreCalendarGetCalendarDayView200Response.rarrow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryid, courseid, date, defaulteventcontext, events, filterSelector, larrow, neweventtimestamp, nextperiod, nextperiodlink, nextperiodname, periodname, previousperiod, previousperiodlink, previousperiodname, rarrow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCalendarGetCalendarDayView200Response {\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    defaulteventcontext: ").append(toIndentedString(defaulteventcontext)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filterSelector: ").append(toIndentedString(filterSelector)).append("\n");
    sb.append("    larrow: ").append(toIndentedString(larrow)).append("\n");
    sb.append("    neweventtimestamp: ").append(toIndentedString(neweventtimestamp)).append("\n");
    sb.append("    nextperiod: ").append(toIndentedString(nextperiod)).append("\n");
    sb.append("    nextperiodlink: ").append(toIndentedString(nextperiodlink)).append("\n");
    sb.append("    nextperiodname: ").append(toIndentedString(nextperiodname)).append("\n");
    sb.append("    periodname: ").append(toIndentedString(periodname)).append("\n");
    sb.append("    previousperiod: ").append(toIndentedString(previousperiod)).append("\n");
    sb.append("    previousperiodlink: ").append(toIndentedString(previousperiodlink)).append("\n");
    sb.append("    previousperiodname: ").append(toIndentedString(previousperiodname)).append("\n");
    sb.append("    rarrow: ").append(toIndentedString(rarrow)).append("\n");
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
    openapiFields.add("larrow");
    openapiFields.add("neweventtimestamp");
    openapiFields.add("nextperiod");
    openapiFields.add("nextperiodlink");
    openapiFields.add("nextperiodname");
    openapiFields.add("periodname");
    openapiFields.add("previousperiod");
    openapiFields.add("previousperiodlink");
    openapiFields.add("previousperiodname");
    openapiFields.add("rarrow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("defaulteventcontext");
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("filter_selector");
    openapiRequiredFields.add("larrow");
    openapiRequiredFields.add("neweventtimestamp");
    openapiRequiredFields.add("nextperiod");
    openapiRequiredFields.add("nextperiodlink");
    openapiRequiredFields.add("nextperiodname");
    openapiRequiredFields.add("periodname");
    openapiRequiredFields.add("previousperiod");
    openapiRequiredFields.add("previousperiodlink");
    openapiRequiredFields.add("previousperiodname");
    openapiRequiredFields.add("rarrow");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCalendarGetCalendarDayView200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCalendarGetCalendarDayView200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCalendarGetCalendarDayView200Response is not found in the empty JSON string", CoreCalendarGetCalendarDayView200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCalendarGetCalendarDayView200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCalendarGetCalendarDayView200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCalendarGetCalendarDayView200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `date`
      CoreCalendarGetCalendarDayView200ResponseDate.validateJsonElement(jsonObj.get("date"));
      // ensure the json data is an array
      if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }

      JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
      // validate the required field `events` (array)
      for (int i = 0; i < jsonArrayevents.size(); i++) {
        CoreCalendarGetCalendarDayView200ResponseEventsInner.validateJsonElement(jsonArrayevents.get(i));
      };
      if (!jsonObj.get("filter_selector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_selector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_selector").toString()));
      }
      if (!jsonObj.get("larrow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `larrow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("larrow").toString()));
      }
      // validate the required field `nextperiod`
      CoreCalendarGetCalendarDayView200ResponseNextperiod.validateJsonElement(jsonObj.get("nextperiod"));
      if (!jsonObj.get("nextperiodlink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextperiodlink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextperiodlink").toString()));
      }
      if (!jsonObj.get("nextperiodname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextperiodname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextperiodname").toString()));
      }
      if (!jsonObj.get("periodname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `periodname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("periodname").toString()));
      }
      // validate the required field `previousperiod`
      CoreCalendarGetCalendarDayView200ResponseNextperiod.validateJsonElement(jsonObj.get("previousperiod"));
      if (!jsonObj.get("previousperiodlink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousperiodlink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousperiodlink").toString()));
      }
      if (!jsonObj.get("previousperiodname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousperiodname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousperiodname").toString()));
      }
      if (!jsonObj.get("rarrow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rarrow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rarrow").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCalendarGetCalendarDayView200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCalendarGetCalendarDayView200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCalendarGetCalendarDayView200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCalendarGetCalendarDayView200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCalendarGetCalendarDayView200Response>() {
           @Override
           public void write(JsonWriter out, CoreCalendarGetCalendarDayView200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCalendarGetCalendarDayView200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCalendarGetCalendarDayView200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCalendarGetCalendarDayView200Response
  * @throws IOException if the JSON string is invalid with respect to CoreCalendarGetCalendarDayView200Response
  */
  public static CoreCalendarGetCalendarDayView200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCalendarGetCalendarDayView200Response.class);
  }

 /**
  * Convert an instance of CoreCalendarGetCalendarDayView200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner {
  public static final String SERIALIZED_NAME_CALENDAREVENTTYPES = "calendareventtypes";
  @SerializedName(SERIALIZED_NAME_CALENDAREVENTTYPES)
  private List<Object> calendareventtypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DAYTITLE = "daytitle";
  @SerializedName(SERIALIZED_NAME_DAYTITLE)
  private String daytitle = "null";

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_HASEVENTS = "hasevents";
  @SerializedName(SERIALIZED_NAME_HASEVENTS)
  private Boolean hasevents = false;

  public static final String SERIALIZED_NAME_HASLASTDAYOFEVENT = "haslastdayofevent";
  @SerializedName(SERIALIZED_NAME_HASLASTDAYOFEVENT)
  private Boolean haslastdayofevent = false;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Integer hours;

  public static final String SERIALIZED_NAME_ISTODAY = "istoday";
  @SerializedName(SERIALIZED_NAME_ISTODAY)
  private Boolean istoday = false;

  public static final String SERIALIZED_NAME_ISWEEKEND = "isweekend";
  @SerializedName(SERIALIZED_NAME_ISWEEKEND)
  private Boolean isweekend = false;

  public static final String SERIALIZED_NAME_MDAY = "mday";
  @SerializedName(SERIALIZED_NAME_MDAY)
  private Integer mday;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Integer minutes;

  public static final String SERIALIZED_NAME_NEWEVENTTIMESTAMP = "neweventtimestamp";
  @SerializedName(SERIALIZED_NAME_NEWEVENTTIMESTAMP)
  private Integer neweventtimestamp;

  public static final String SERIALIZED_NAME_NEXTPERIOD = "nextperiod";
  @SerializedName(SERIALIZED_NAME_NEXTPERIOD)
  private Integer nextperiod = null;

  public static final String SERIALIZED_NAME_POPOVERTITLE = "popovertitle";
  @SerializedName(SERIALIZED_NAME_POPOVERTITLE)
  private String popovertitle = "";

  public static final String SERIALIZED_NAME_PREVIOUSPERIOD = "previousperiod";
  @SerializedName(SERIALIZED_NAME_PREVIOUSPERIOD)
  private Integer previousperiod = null;

  public static final String SERIALIZED_NAME_SECONDS = "seconds";
  @SerializedName(SERIALIZED_NAME_SECONDS)
  private Integer seconds;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_VIEWDAYLINK = "viewdaylink";
  @SerializedName(SERIALIZED_NAME_VIEWDAYLINK)
  private String viewdaylink = "null";

  public static final String SERIALIZED_NAME_VIEWDAYLINKTITLE = "viewdaylinktitle";
  @SerializedName(SERIALIZED_NAME_VIEWDAYLINKTITLE)
  private String viewdaylinktitle = "null";

  public static final String SERIALIZED_NAME_WDAY = "wday";
  @SerializedName(SERIALIZED_NAME_WDAY)
  private Integer wday;

  public static final String SERIALIZED_NAME_YDAY = "yday";
  @SerializedName(SERIALIZED_NAME_YDAY)
  private Integer yday;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner() {
  }

  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner calendareventtypes(List<Object> calendareventtypes) {
    this.calendareventtypes = calendareventtypes;
    return this;
  }

  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner addCalendareventtypesItem(Object calendareventtypesItem) {
    if (this.calendareventtypes == null) {
      this.calendareventtypes = new ArrayList<>();
    }
    this.calendareventtypes.add(calendareventtypesItem);
    return this;
  }

   /**
   * Get calendareventtypes
   * @return calendareventtypes
  **/
  @javax.annotation.Nullable
  public List<Object> getCalendareventtypes() {
    return calendareventtypes;
  }

  public void setCalendareventtypes(List<Object> calendareventtypes) {
    this.calendareventtypes = calendareventtypes;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner daytitle(String daytitle) {
    this.daytitle = daytitle;
    return this;
  }

   /**
   * daytitle
   * @return daytitle
  **/
  @javax.annotation.Nullable
  public String getDaytitle() {
    return daytitle;
  }

  public void setDaytitle(String daytitle) {
    this.daytitle = daytitle;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner events(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> events) {
    this.events = events;
    return this;
  }

  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner addEventsItem(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner eventsItem) {
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
  @javax.annotation.Nullable
  public List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> getEvents() {
    return events;
  }

  public void setEvents(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner> events) {
    this.events = events;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner hasevents(Boolean hasevents) {
    this.hasevents = hasevents;
    return this;
  }

   /**
   * hasevents
   * @return hasevents
  **/
  @javax.annotation.Nullable
  public Boolean getHasevents() {
    return hasevents;
  }

  public void setHasevents(Boolean hasevents) {
    this.hasevents = hasevents;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner haslastdayofevent(Boolean haslastdayofevent) {
    this.haslastdayofevent = haslastdayofevent;
    return this;
  }

   /**
   * haslastdayofevent
   * @return haslastdayofevent
  **/
  @javax.annotation.Nullable
  public Boolean getHaslastdayofevent() {
    return haslastdayofevent;
  }

  public void setHaslastdayofevent(Boolean haslastdayofevent) {
    this.haslastdayofevent = haslastdayofevent;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner hours(Integer hours) {
    this.hours = hours;
    return this;
  }

   /**
   * hours
   * @return hours
  **/
  @javax.annotation.Nullable
  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner istoday(Boolean istoday) {
    this.istoday = istoday;
    return this;
  }

   /**
   * istoday
   * @return istoday
  **/
  @javax.annotation.Nullable
  public Boolean getIstoday() {
    return istoday;
  }

  public void setIstoday(Boolean istoday) {
    this.istoday = istoday;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner isweekend(Boolean isweekend) {
    this.isweekend = isweekend;
    return this;
  }

   /**
   * isweekend
   * @return isweekend
  **/
  @javax.annotation.Nullable
  public Boolean getIsweekend() {
    return isweekend;
  }

  public void setIsweekend(Boolean isweekend) {
    this.isweekend = isweekend;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner mday(Integer mday) {
    this.mday = mday;
    return this;
  }

   /**
   * mday
   * @return mday
  **/
  @javax.annotation.Nullable
  public Integer getMday() {
    return mday;
  }

  public void setMday(Integer mday) {
    this.mday = mday;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

   /**
   * minutes
   * @return minutes
  **/
  @javax.annotation.Nullable
  public Integer getMinutes() {
    return minutes;
  }

  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner neweventtimestamp(Integer neweventtimestamp) {
    this.neweventtimestamp = neweventtimestamp;
    return this;
  }

   /**
   * neweventtimestamp
   * @return neweventtimestamp
  **/
  @javax.annotation.Nullable
  public Integer getNeweventtimestamp() {
    return neweventtimestamp;
  }

  public void setNeweventtimestamp(Integer neweventtimestamp) {
    this.neweventtimestamp = neweventtimestamp;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner nextperiod(Integer nextperiod) {
    this.nextperiod = nextperiod;
    return this;
  }

   /**
   * nextperiod
   * @return nextperiod
  **/
  @javax.annotation.Nullable
  public Integer getNextperiod() {
    return nextperiod;
  }

  public void setNextperiod(Integer nextperiod) {
    this.nextperiod = nextperiod;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner popovertitle(String popovertitle) {
    this.popovertitle = popovertitle;
    return this;
  }

   /**
   * popovertitle
   * @return popovertitle
  **/
  @javax.annotation.Nullable
  public String getPopovertitle() {
    return popovertitle;
  }

  public void setPopovertitle(String popovertitle) {
    this.popovertitle = popovertitle;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner previousperiod(Integer previousperiod) {
    this.previousperiod = previousperiod;
    return this;
  }

   /**
   * previousperiod
   * @return previousperiod
  **/
  @javax.annotation.Nullable
  public Integer getPreviousperiod() {
    return previousperiod;
  }

  public void setPreviousperiod(Integer previousperiod) {
    this.previousperiod = previousperiod;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * seconds
   * @return seconds
  **/
  @javax.annotation.Nullable
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner viewdaylink(String viewdaylink) {
    this.viewdaylink = viewdaylink;
    return this;
  }

   /**
   * viewdaylink
   * @return viewdaylink
  **/
  @javax.annotation.Nullable
  public String getViewdaylink() {
    return viewdaylink;
  }

  public void setViewdaylink(String viewdaylink) {
    this.viewdaylink = viewdaylink;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner viewdaylinktitle(String viewdaylinktitle) {
    this.viewdaylinktitle = viewdaylinktitle;
    return this;
  }

   /**
   * viewdaylinktitle
   * @return viewdaylinktitle
  **/
  @javax.annotation.Nullable
  public String getViewdaylinktitle() {
    return viewdaylinktitle;
  }

  public void setViewdaylinktitle(String viewdaylinktitle) {
    this.viewdaylinktitle = viewdaylinktitle;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner wday(Integer wday) {
    this.wday = wday;
    return this;
  }

   /**
   * wday
   * @return wday
  **/
  @javax.annotation.Nullable
  public Integer getWday() {
    return wday;
  }

  public void setWday(Integer wday) {
    this.wday = wday;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner yday(Integer yday) {
    this.yday = yday;
    return this;
  }

   /**
   * yday
   * @return yday
  **/
  @javax.annotation.Nullable
  public Integer getYday() {
    return yday;
  }

  public void setYday(Integer yday) {
    this.yday = yday;
  }


  public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * year
   * @return year
  **/
  @javax.annotation.Nullable
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner = (CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner) o;
    return Objects.equals(this.calendareventtypes, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.calendareventtypes) &&
        Objects.equals(this.daytitle, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.daytitle) &&
        Objects.equals(this.events, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.events) &&
        Objects.equals(this.hasevents, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.hasevents) &&
        Objects.equals(this.haslastdayofevent, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.haslastdayofevent) &&
        Objects.equals(this.hours, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.hours) &&
        Objects.equals(this.istoday, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.istoday) &&
        Objects.equals(this.isweekend, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.isweekend) &&
        Objects.equals(this.mday, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.mday) &&
        Objects.equals(this.minutes, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.minutes) &&
        Objects.equals(this.neweventtimestamp, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.neweventtimestamp) &&
        Objects.equals(this.nextperiod, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.nextperiod) &&
        Objects.equals(this.popovertitle, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.popovertitle) &&
        Objects.equals(this.previousperiod, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.previousperiod) &&
        Objects.equals(this.seconds, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.seconds) &&
        Objects.equals(this.timestamp, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.timestamp) &&
        Objects.equals(this.viewdaylink, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.viewdaylink) &&
        Objects.equals(this.viewdaylinktitle, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.viewdaylinktitle) &&
        Objects.equals(this.wday, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.wday) &&
        Objects.equals(this.yday, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.yday) &&
        Objects.equals(this.year, coreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendareventtypes, daytitle, events, hasevents, haslastdayofevent, hours, istoday, isweekend, mday, minutes, neweventtimestamp, nextperiod, popovertitle, previousperiod, seconds, timestamp, viewdaylink, viewdaylinktitle, wday, yday, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner {\n");
    sb.append("    calendareventtypes: ").append(toIndentedString(calendareventtypes)).append("\n");
    sb.append("    daytitle: ").append(toIndentedString(daytitle)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    hasevents: ").append(toIndentedString(hasevents)).append("\n");
    sb.append("    haslastdayofevent: ").append(toIndentedString(haslastdayofevent)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    istoday: ").append(toIndentedString(istoday)).append("\n");
    sb.append("    isweekend: ").append(toIndentedString(isweekend)).append("\n");
    sb.append("    mday: ").append(toIndentedString(mday)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    neweventtimestamp: ").append(toIndentedString(neweventtimestamp)).append("\n");
    sb.append("    nextperiod: ").append(toIndentedString(nextperiod)).append("\n");
    sb.append("    popovertitle: ").append(toIndentedString(popovertitle)).append("\n");
    sb.append("    previousperiod: ").append(toIndentedString(previousperiod)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    viewdaylink: ").append(toIndentedString(viewdaylink)).append("\n");
    sb.append("    viewdaylinktitle: ").append(toIndentedString(viewdaylinktitle)).append("\n");
    sb.append("    wday: ").append(toIndentedString(wday)).append("\n");
    sb.append("    yday: ").append(toIndentedString(yday)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("calendareventtypes");
    openapiFields.add("daytitle");
    openapiFields.add("events");
    openapiFields.add("hasevents");
    openapiFields.add("haslastdayofevent");
    openapiFields.add("hours");
    openapiFields.add("istoday");
    openapiFields.add("isweekend");
    openapiFields.add("mday");
    openapiFields.add("minutes");
    openapiFields.add("neweventtimestamp");
    openapiFields.add("nextperiod");
    openapiFields.add("popovertitle");
    openapiFields.add("previousperiod");
    openapiFields.add("seconds");
    openapiFields.add("timestamp");
    openapiFields.add("viewdaylink");
    openapiFields.add("viewdaylinktitle");
    openapiFields.add("wday");
    openapiFields.add("yday");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner is not found in the empty JSON string", CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("calendareventtypes") != null && !jsonObj.get("calendareventtypes").isJsonNull() && !jsonObj.get("calendareventtypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `calendareventtypes` to be an array in the JSON string but got `%s`", jsonObj.get("calendareventtypes").toString()));
      }
      if ((jsonObj.get("daytitle") != null && !jsonObj.get("daytitle").isJsonNull()) && !jsonObj.get("daytitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daytitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daytitle").toString()));
      }
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull()) {
        JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
        if (jsonArrayevents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
          }

          // validate the optional field `events` (array)
          for (int i = 0; i < jsonArrayevents.size(); i++) {
            CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.validateJsonElement(jsonArrayevents.get(i));
          };
        }
      }
      if ((jsonObj.get("popovertitle") != null && !jsonObj.get("popovertitle").isJsonNull()) && !jsonObj.get("popovertitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `popovertitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("popovertitle").toString()));
      }
      if ((jsonObj.get("viewdaylink") != null && !jsonObj.get("viewdaylink").isJsonNull()) && !jsonObj.get("viewdaylink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewdaylink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewdaylink").toString()));
      }
      if ((jsonObj.get("viewdaylinktitle") != null && !jsonObj.get("viewdaylinktitle").isJsonNull()) && !jsonObj.get("viewdaylinktitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewdaylinktitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewdaylinktitle").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner>() {
           @Override
           public void write(JsonWriter out, CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner
  * @throws IOException if the JSON string is invalid with respect to CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner
  */
  public static CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.class);
  }

 /**
  * Convert an instance of CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


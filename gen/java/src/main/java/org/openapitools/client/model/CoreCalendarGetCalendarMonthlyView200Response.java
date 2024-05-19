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
import org.openapitools.client.model.CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner;
import org.openapitools.client.model.CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner;

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
 * CoreCalendarGetCalendarMonthlyView200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCalendarGetCalendarMonthlyView200Response {
  public static final String SERIALIZED_NAME_CALENDARINSTANCEID = "calendarinstanceid";
  @SerializedName(SERIALIZED_NAME_CALENDARINSTANCEID)
  private Integer calendarinstanceid = 0;

  public static final String SERIALIZED_NAME_CATEGORYID = "categoryid";
  @SerializedName(SERIALIZED_NAME_CATEGORYID)
  private Integer categoryid = 0;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private CoreCalendarGetCalendarDayView200ResponseNextperiod date;

  public static final String SERIALIZED_NAME_DAYNAMES = "daynames";
  @SerializedName(SERIALIZED_NAME_DAYNAMES)
  private List<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner> daynames = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULTEVENTCONTEXT = "defaulteventcontext";
  @SerializedName(SERIALIZED_NAME_DEFAULTEVENTCONTEXT)
  private Integer defaulteventcontext = 0;

  public static final String SERIALIZED_NAME_FILTER_SELECTOR = "filter_selector";
  @SerializedName(SERIALIZED_NAME_FILTER_SELECTOR)
  private String filterSelector;

  public static final String SERIALIZED_NAME_INCLUDENAVIGATION = "includenavigation";
  @SerializedName(SERIALIZED_NAME_INCLUDENAVIGATION)
  private Boolean includenavigation = true;

  public static final String SERIALIZED_NAME_INITIALEVENTSLOADED = "initialeventsloaded";
  @SerializedName(SERIALIZED_NAME_INITIALEVENTSLOADED)
  private Boolean initialeventsloaded = true;

  public static final String SERIALIZED_NAME_LARROW = "larrow";
  @SerializedName(SERIALIZED_NAME_LARROW)
  private String larrow;

  public static final String SERIALIZED_NAME_NEXTPERIOD = "nextperiod";
  @SerializedName(SERIALIZED_NAME_NEXTPERIOD)
  private CoreCalendarGetCalendarDayView200ResponseNextperiod nextperiod;

  public static final String SERIALIZED_NAME_NEXTPERIODLINK = "nextperiodlink";
  @SerializedName(SERIALIZED_NAME_NEXTPERIODLINK)
  private String nextperiodlink;

  public static final String SERIALIZED_NAME_NEXTPERIODNAME = "nextperiodname";
  @SerializedName(SERIALIZED_NAME_NEXTPERIODNAME)
  private String nextperiodname;

  public static final String SERIALIZED_NAME_PERIODNAME = "periodname";
  @SerializedName(SERIALIZED_NAME_PERIODNAME)
  private String periodname;

  public static final String SERIALIZED_NAME_PREVIOUSPERIOD = "previousperiod";
  @SerializedName(SERIALIZED_NAME_PREVIOUSPERIOD)
  private CoreCalendarGetCalendarDayView200ResponseNextperiod previousperiod;

  public static final String SERIALIZED_NAME_PREVIOUSPERIODLINK = "previousperiodlink";
  @SerializedName(SERIALIZED_NAME_PREVIOUSPERIODLINK)
  private String previousperiodlink;

  public static final String SERIALIZED_NAME_PREVIOUSPERIODNAME = "previousperiodname";
  @SerializedName(SERIALIZED_NAME_PREVIOUSPERIODNAME)
  private String previousperiodname;

  public static final String SERIALIZED_NAME_RARROW = "rarrow";
  @SerializedName(SERIALIZED_NAME_RARROW)
  private String rarrow;

  public static final String SERIALIZED_NAME_SHOWVIEWSELECTOR = "showviewselector";
  @SerializedName(SERIALIZED_NAME_SHOWVIEWSELECTOR)
  private Boolean showviewselector = true;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private String view = "null";

  public static final String SERIALIZED_NAME_VIEWINGINBLOCK = "viewinginblock";
  @SerializedName(SERIALIZED_NAME_VIEWINGINBLOCK)
  private Boolean viewinginblock = false;

  public static final String SERIALIZED_NAME_VIEWINGMONTH = "viewingmonth";
  @SerializedName(SERIALIZED_NAME_VIEWINGMONTH)
  private Boolean viewingmonth = true;

  public static final String SERIALIZED_NAME_WEEKS = "weeks";
  @SerializedName(SERIALIZED_NAME_WEEKS)
  private List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner> weeks = new ArrayList<>();

  public CoreCalendarGetCalendarMonthlyView200Response() {
  }

  public CoreCalendarGetCalendarMonthlyView200Response calendarinstanceid(Integer calendarinstanceid) {
    this.calendarinstanceid = calendarinstanceid;
    return this;
  }

   /**
   * calendarinstanceid
   * @return calendarinstanceid
  **/
  @javax.annotation.Nonnull
  public Integer getCalendarinstanceid() {
    return calendarinstanceid;
  }

  public void setCalendarinstanceid(Integer calendarinstanceid) {
    this.calendarinstanceid = calendarinstanceid;
  }


  public CoreCalendarGetCalendarMonthlyView200Response categoryid(Integer categoryid) {
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


  public CoreCalendarGetCalendarMonthlyView200Response courseid(Integer courseid) {
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


  public CoreCalendarGetCalendarMonthlyView200Response date(CoreCalendarGetCalendarDayView200ResponseNextperiod date) {
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


  public CoreCalendarGetCalendarMonthlyView200Response daynames(List<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner> daynames) {
    this.daynames = daynames;
    return this;
  }

  public CoreCalendarGetCalendarMonthlyView200Response addDaynamesItem(CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner daynamesItem) {
    if (this.daynames == null) {
      this.daynames = new ArrayList<>();
    }
    this.daynames.add(daynamesItem);
    return this;
  }

   /**
   * Get daynames
   * @return daynames
  **/
  @javax.annotation.Nonnull
  public List<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner> getDaynames() {
    return daynames;
  }

  public void setDaynames(List<CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner> daynames) {
    this.daynames = daynames;
  }


  public CoreCalendarGetCalendarMonthlyView200Response defaulteventcontext(Integer defaulteventcontext) {
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


  public CoreCalendarGetCalendarMonthlyView200Response filterSelector(String filterSelector) {
    this.filterSelector = filterSelector;
    return this;
  }

   /**
   * filter_selector
   * @return filterSelector
  **/
  @javax.annotation.Nullable
  public String getFilterSelector() {
    return filterSelector;
  }

  public void setFilterSelector(String filterSelector) {
    this.filterSelector = filterSelector;
  }


  public CoreCalendarGetCalendarMonthlyView200Response includenavigation(Boolean includenavigation) {
    this.includenavigation = includenavigation;
    return this;
  }

   /**
   * includenavigation
   * @return includenavigation
  **/
  @javax.annotation.Nonnull
  public Boolean getIncludenavigation() {
    return includenavigation;
  }

  public void setIncludenavigation(Boolean includenavigation) {
    this.includenavigation = includenavigation;
  }


  public CoreCalendarGetCalendarMonthlyView200Response initialeventsloaded(Boolean initialeventsloaded) {
    this.initialeventsloaded = initialeventsloaded;
    return this;
  }

   /**
   * initialeventsloaded
   * @return initialeventsloaded
  **/
  @javax.annotation.Nonnull
  public Boolean getInitialeventsloaded() {
    return initialeventsloaded;
  }

  public void setInitialeventsloaded(Boolean initialeventsloaded) {
    this.initialeventsloaded = initialeventsloaded;
  }


  public CoreCalendarGetCalendarMonthlyView200Response larrow(String larrow) {
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


  public CoreCalendarGetCalendarMonthlyView200Response nextperiod(CoreCalendarGetCalendarDayView200ResponseNextperiod nextperiod) {
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


  public CoreCalendarGetCalendarMonthlyView200Response nextperiodlink(String nextperiodlink) {
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


  public CoreCalendarGetCalendarMonthlyView200Response nextperiodname(String nextperiodname) {
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


  public CoreCalendarGetCalendarMonthlyView200Response periodname(String periodname) {
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


  public CoreCalendarGetCalendarMonthlyView200Response previousperiod(CoreCalendarGetCalendarDayView200ResponseNextperiod previousperiod) {
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


  public CoreCalendarGetCalendarMonthlyView200Response previousperiodlink(String previousperiodlink) {
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


  public CoreCalendarGetCalendarMonthlyView200Response previousperiodname(String previousperiodname) {
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


  public CoreCalendarGetCalendarMonthlyView200Response rarrow(String rarrow) {
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


  public CoreCalendarGetCalendarMonthlyView200Response showviewselector(Boolean showviewselector) {
    this.showviewselector = showviewselector;
    return this;
  }

   /**
   * showviewselector
   * @return showviewselector
  **/
  @javax.annotation.Nonnull
  public Boolean getShowviewselector() {
    return showviewselector;
  }

  public void setShowviewselector(Boolean showviewselector) {
    this.showviewselector = showviewselector;
  }


  public CoreCalendarGetCalendarMonthlyView200Response url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public CoreCalendarGetCalendarMonthlyView200Response view(String view) {
    this.view = view;
    return this;
  }

   /**
   * view
   * @return view
  **/
  @javax.annotation.Nonnull
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }


  public CoreCalendarGetCalendarMonthlyView200Response viewinginblock(Boolean viewinginblock) {
    this.viewinginblock = viewinginblock;
    return this;
  }

   /**
   * viewinginblock
   * @return viewinginblock
  **/
  @javax.annotation.Nonnull
  public Boolean getViewinginblock() {
    return viewinginblock;
  }

  public void setViewinginblock(Boolean viewinginblock) {
    this.viewinginblock = viewinginblock;
  }


  public CoreCalendarGetCalendarMonthlyView200Response viewingmonth(Boolean viewingmonth) {
    this.viewingmonth = viewingmonth;
    return this;
  }

   /**
   * viewingmonth
   * @return viewingmonth
  **/
  @javax.annotation.Nonnull
  public Boolean getViewingmonth() {
    return viewingmonth;
  }

  public void setViewingmonth(Boolean viewingmonth) {
    this.viewingmonth = viewingmonth;
  }


  public CoreCalendarGetCalendarMonthlyView200Response weeks(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner> weeks) {
    this.weeks = weeks;
    return this;
  }

  public CoreCalendarGetCalendarMonthlyView200Response addWeeksItem(CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner weeksItem) {
    if (this.weeks == null) {
      this.weeks = new ArrayList<>();
    }
    this.weeks.add(weeksItem);
    return this;
  }

   /**
   * Get weeks
   * @return weeks
  **/
  @javax.annotation.Nonnull
  public List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner> getWeeks() {
    return weeks;
  }

  public void setWeeks(List<CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner> weeks) {
    this.weeks = weeks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCalendarGetCalendarMonthlyView200Response coreCalendarGetCalendarMonthlyView200Response = (CoreCalendarGetCalendarMonthlyView200Response) o;
    return Objects.equals(this.calendarinstanceid, coreCalendarGetCalendarMonthlyView200Response.calendarinstanceid) &&
        Objects.equals(this.categoryid, coreCalendarGetCalendarMonthlyView200Response.categoryid) &&
        Objects.equals(this.courseid, coreCalendarGetCalendarMonthlyView200Response.courseid) &&
        Objects.equals(this.date, coreCalendarGetCalendarMonthlyView200Response.date) &&
        Objects.equals(this.daynames, coreCalendarGetCalendarMonthlyView200Response.daynames) &&
        Objects.equals(this.defaulteventcontext, coreCalendarGetCalendarMonthlyView200Response.defaulteventcontext) &&
        Objects.equals(this.filterSelector, coreCalendarGetCalendarMonthlyView200Response.filterSelector) &&
        Objects.equals(this.includenavigation, coreCalendarGetCalendarMonthlyView200Response.includenavigation) &&
        Objects.equals(this.initialeventsloaded, coreCalendarGetCalendarMonthlyView200Response.initialeventsloaded) &&
        Objects.equals(this.larrow, coreCalendarGetCalendarMonthlyView200Response.larrow) &&
        Objects.equals(this.nextperiod, coreCalendarGetCalendarMonthlyView200Response.nextperiod) &&
        Objects.equals(this.nextperiodlink, coreCalendarGetCalendarMonthlyView200Response.nextperiodlink) &&
        Objects.equals(this.nextperiodname, coreCalendarGetCalendarMonthlyView200Response.nextperiodname) &&
        Objects.equals(this.periodname, coreCalendarGetCalendarMonthlyView200Response.periodname) &&
        Objects.equals(this.previousperiod, coreCalendarGetCalendarMonthlyView200Response.previousperiod) &&
        Objects.equals(this.previousperiodlink, coreCalendarGetCalendarMonthlyView200Response.previousperiodlink) &&
        Objects.equals(this.previousperiodname, coreCalendarGetCalendarMonthlyView200Response.previousperiodname) &&
        Objects.equals(this.rarrow, coreCalendarGetCalendarMonthlyView200Response.rarrow) &&
        Objects.equals(this.showviewselector, coreCalendarGetCalendarMonthlyView200Response.showviewselector) &&
        Objects.equals(this.url, coreCalendarGetCalendarMonthlyView200Response.url) &&
        Objects.equals(this.view, coreCalendarGetCalendarMonthlyView200Response.view) &&
        Objects.equals(this.viewinginblock, coreCalendarGetCalendarMonthlyView200Response.viewinginblock) &&
        Objects.equals(this.viewingmonth, coreCalendarGetCalendarMonthlyView200Response.viewingmonth) &&
        Objects.equals(this.weeks, coreCalendarGetCalendarMonthlyView200Response.weeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarinstanceid, categoryid, courseid, date, daynames, defaulteventcontext, filterSelector, includenavigation, initialeventsloaded, larrow, nextperiod, nextperiodlink, nextperiodname, periodname, previousperiod, previousperiodlink, previousperiodname, rarrow, showviewselector, url, view, viewinginblock, viewingmonth, weeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCalendarGetCalendarMonthlyView200Response {\n");
    sb.append("    calendarinstanceid: ").append(toIndentedString(calendarinstanceid)).append("\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    daynames: ").append(toIndentedString(daynames)).append("\n");
    sb.append("    defaulteventcontext: ").append(toIndentedString(defaulteventcontext)).append("\n");
    sb.append("    filterSelector: ").append(toIndentedString(filterSelector)).append("\n");
    sb.append("    includenavigation: ").append(toIndentedString(includenavigation)).append("\n");
    sb.append("    initialeventsloaded: ").append(toIndentedString(initialeventsloaded)).append("\n");
    sb.append("    larrow: ").append(toIndentedString(larrow)).append("\n");
    sb.append("    nextperiod: ").append(toIndentedString(nextperiod)).append("\n");
    sb.append("    nextperiodlink: ").append(toIndentedString(nextperiodlink)).append("\n");
    sb.append("    nextperiodname: ").append(toIndentedString(nextperiodname)).append("\n");
    sb.append("    periodname: ").append(toIndentedString(periodname)).append("\n");
    sb.append("    previousperiod: ").append(toIndentedString(previousperiod)).append("\n");
    sb.append("    previousperiodlink: ").append(toIndentedString(previousperiodlink)).append("\n");
    sb.append("    previousperiodname: ").append(toIndentedString(previousperiodname)).append("\n");
    sb.append("    rarrow: ").append(toIndentedString(rarrow)).append("\n");
    sb.append("    showviewselector: ").append(toIndentedString(showviewselector)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewinginblock: ").append(toIndentedString(viewinginblock)).append("\n");
    sb.append("    viewingmonth: ").append(toIndentedString(viewingmonth)).append("\n");
    sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
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
    openapiFields.add("calendarinstanceid");
    openapiFields.add("categoryid");
    openapiFields.add("courseid");
    openapiFields.add("date");
    openapiFields.add("daynames");
    openapiFields.add("defaulteventcontext");
    openapiFields.add("filter_selector");
    openapiFields.add("includenavigation");
    openapiFields.add("initialeventsloaded");
    openapiFields.add("larrow");
    openapiFields.add("nextperiod");
    openapiFields.add("nextperiodlink");
    openapiFields.add("nextperiodname");
    openapiFields.add("periodname");
    openapiFields.add("previousperiod");
    openapiFields.add("previousperiodlink");
    openapiFields.add("previousperiodname");
    openapiFields.add("rarrow");
    openapiFields.add("showviewselector");
    openapiFields.add("url");
    openapiFields.add("view");
    openapiFields.add("viewinginblock");
    openapiFields.add("viewingmonth");
    openapiFields.add("weeks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("calendarinstanceid");
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("daynames");
    openapiRequiredFields.add("defaulteventcontext");
    openapiRequiredFields.add("includenavigation");
    openapiRequiredFields.add("initialeventsloaded");
    openapiRequiredFields.add("larrow");
    openapiRequiredFields.add("nextperiod");
    openapiRequiredFields.add("nextperiodlink");
    openapiRequiredFields.add("nextperiodname");
    openapiRequiredFields.add("periodname");
    openapiRequiredFields.add("previousperiod");
    openapiRequiredFields.add("previousperiodlink");
    openapiRequiredFields.add("previousperiodname");
    openapiRequiredFields.add("rarrow");
    openapiRequiredFields.add("showviewselector");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("view");
    openapiRequiredFields.add("viewinginblock");
    openapiRequiredFields.add("viewingmonth");
    openapiRequiredFields.add("weeks");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCalendarGetCalendarMonthlyView200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCalendarGetCalendarMonthlyView200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCalendarGetCalendarMonthlyView200Response is not found in the empty JSON string", CoreCalendarGetCalendarMonthlyView200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCalendarGetCalendarMonthlyView200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCalendarGetCalendarMonthlyView200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCalendarGetCalendarMonthlyView200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `date`
      CoreCalendarGetCalendarDayView200ResponseNextperiod.validateJsonElement(jsonObj.get("date"));
      // ensure the json data is an array
      if (!jsonObj.get("daynames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `daynames` to be an array in the JSON string but got `%s`", jsonObj.get("daynames").toString()));
      }

      JsonArray jsonArraydaynames = jsonObj.getAsJsonArray("daynames");
      // validate the required field `daynames` (array)
      for (int i = 0; i < jsonArraydaynames.size(); i++) {
        CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner.validateJsonElement(jsonArraydaynames.get(i));
      };
      if ((jsonObj.get("filter_selector") != null && !jsonObj.get("filter_selector").isJsonNull()) && !jsonObj.get("filter_selector").isJsonPrimitive()) {
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
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("weeks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `weeks` to be an array in the JSON string but got `%s`", jsonObj.get("weeks").toString()));
      }

      JsonArray jsonArrayweeks = jsonObj.getAsJsonArray("weeks");
      // validate the required field `weeks` (array)
      for (int i = 0; i < jsonArrayweeks.size(); i++) {
        CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.validateJsonElement(jsonArrayweeks.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCalendarGetCalendarMonthlyView200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCalendarGetCalendarMonthlyView200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCalendarGetCalendarMonthlyView200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCalendarGetCalendarMonthlyView200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCalendarGetCalendarMonthlyView200Response>() {
           @Override
           public void write(JsonWriter out, CoreCalendarGetCalendarMonthlyView200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCalendarGetCalendarMonthlyView200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCalendarGetCalendarMonthlyView200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCalendarGetCalendarMonthlyView200Response
  * @throws IOException if the JSON string is invalid with respect to CoreCalendarGetCalendarMonthlyView200Response
  */
  public static CoreCalendarGetCalendarMonthlyView200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCalendarGetCalendarMonthlyView200Response.class);
  }

 /**
  * Convert an instance of CoreCalendarGetCalendarMonthlyView200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


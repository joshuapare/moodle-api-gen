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
 * event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCalendarCreateCalendarEvents200ResponseEventsInner {
  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EVENTTYPE = "eventtype";
  @SerializedName(SERIALIZED_NAME_EVENTTYPE)
  private String eventtype = "null";

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private Integer format;

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private Integer groupid = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private Integer instance = null;

  public static final String SERIALIZED_NAME_MODULENAME = "modulename";
  @SerializedName(SERIALIZED_NAME_MODULENAME)
  private String modulename = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_REPEATID = "repeatid";
  @SerializedName(SERIALIZED_NAME_REPEATID)
  private Integer repeatid = null;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence = null;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONID = "subscriptionid";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONID)
  private Integer subscriptionid = null;

  public static final String SERIALIZED_NAME_TIMEDURATION = "timeduration";
  @SerializedName(SERIALIZED_NAME_TIMEDURATION)
  private Integer timeduration = null;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public static final String SERIALIZED_NAME_TIMESTART = "timestart";
  @SerializedName(SERIALIZED_NAME_TIMESTART)
  private Integer timestart = null;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid = "";

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Integer visible = null;

  public CoreCalendarCreateCalendarEvents200ResponseEventsInner() {
  }

  public CoreCalendarCreateCalendarEvents200ResponseEventsInner courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * course id
   * @return courseid
  **/
  @javax.annotation.Nullable
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner eventtype(String eventtype) {
    this.eventtype = eventtype;
    return this;
  }

   /**
   * Event type
   * @return eventtype
  **/
  @javax.annotation.Nullable
  public String getEventtype() {
    return eventtype;
  }

  public void setEventtype(String eventtype) {
    this.eventtype = eventtype;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner format(Integer format) {
    this.format = format;
    return this;
  }

   /**
   * description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return format
  **/
  @javax.annotation.Nullable
  public Integer getFormat() {
    return format;
  }

  public void setFormat(Integer format) {
    this.format = format;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * group id
   * @return groupid
  **/
  @javax.annotation.Nullable
  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * event id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner instance(Integer instance) {
    this.instance = instance;
    return this;
  }

   /**
   * instance id
   * @return instance
  **/
  @javax.annotation.Nullable
  public Integer getInstance() {
    return instance;
  }

  public void setInstance(Integer instance) {
    this.instance = instance;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner modulename(String modulename) {
    this.modulename = modulename;
    return this;
  }

   /**
   * module name
   * @return modulename
  **/
  @javax.annotation.Nullable
  public String getModulename() {
    return modulename;
  }

  public void setModulename(String modulename) {
    this.modulename = modulename;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * event name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner repeatid(Integer repeatid) {
    this.repeatid = repeatid;
    return this;
  }

   /**
   * repeat id
   * @return repeatid
  **/
  @javax.annotation.Nullable
  public Integer getRepeatid() {
    return repeatid;
  }

  public void setRepeatid(Integer repeatid) {
    this.repeatid = repeatid;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * sequence
   * @return sequence
  **/
  @javax.annotation.Nullable
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner subscriptionid(Integer subscriptionid) {
    this.subscriptionid = subscriptionid;
    return this;
  }

   /**
   * Subscription id
   * @return subscriptionid
  **/
  @javax.annotation.Nullable
  public Integer getSubscriptionid() {
    return subscriptionid;
  }

  public void setSubscriptionid(Integer subscriptionid) {
    this.subscriptionid = subscriptionid;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner timeduration(Integer timeduration) {
    this.timeduration = timeduration;
    return this;
  }

   /**
   * time duration
   * @return timeduration
  **/
  @javax.annotation.Nullable
  public Integer getTimeduration() {
    return timeduration;
  }

  public void setTimeduration(Integer timeduration) {
    this.timeduration = timeduration;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * time modified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner timestart(Integer timestart) {
    this.timestart = timestart;
    return this;
  }

   /**
   * timestart
   * @return timestart
  **/
  @javax.annotation.Nullable
  public Integer getTimestart() {
    return timestart;
  }

  public void setTimestart(Integer timestart) {
    this.timestart = timestart;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * user id
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * unique id of ical events
   * @return uuid
  **/
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public CoreCalendarCreateCalendarEvents200ResponseEventsInner visible(Integer visible) {
    this.visible = visible;
    return this;
  }

   /**
   * visible
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
    CoreCalendarCreateCalendarEvents200ResponseEventsInner coreCalendarCreateCalendarEvents200ResponseEventsInner = (CoreCalendarCreateCalendarEvents200ResponseEventsInner) o;
    return Objects.equals(this.courseid, coreCalendarCreateCalendarEvents200ResponseEventsInner.courseid) &&
        Objects.equals(this.description, coreCalendarCreateCalendarEvents200ResponseEventsInner.description) &&
        Objects.equals(this.eventtype, coreCalendarCreateCalendarEvents200ResponseEventsInner.eventtype) &&
        Objects.equals(this.format, coreCalendarCreateCalendarEvents200ResponseEventsInner.format) &&
        Objects.equals(this.groupid, coreCalendarCreateCalendarEvents200ResponseEventsInner.groupid) &&
        Objects.equals(this.id, coreCalendarCreateCalendarEvents200ResponseEventsInner.id) &&
        Objects.equals(this.instance, coreCalendarCreateCalendarEvents200ResponseEventsInner.instance) &&
        Objects.equals(this.modulename, coreCalendarCreateCalendarEvents200ResponseEventsInner.modulename) &&
        Objects.equals(this.name, coreCalendarCreateCalendarEvents200ResponseEventsInner.name) &&
        Objects.equals(this.repeatid, coreCalendarCreateCalendarEvents200ResponseEventsInner.repeatid) &&
        Objects.equals(this.sequence, coreCalendarCreateCalendarEvents200ResponseEventsInner.sequence) &&
        Objects.equals(this.subscriptionid, coreCalendarCreateCalendarEvents200ResponseEventsInner.subscriptionid) &&
        Objects.equals(this.timeduration, coreCalendarCreateCalendarEvents200ResponseEventsInner.timeduration) &&
        Objects.equals(this.timemodified, coreCalendarCreateCalendarEvents200ResponseEventsInner.timemodified) &&
        Objects.equals(this.timestart, coreCalendarCreateCalendarEvents200ResponseEventsInner.timestart) &&
        Objects.equals(this.userid, coreCalendarCreateCalendarEvents200ResponseEventsInner.userid) &&
        Objects.equals(this.uuid, coreCalendarCreateCalendarEvents200ResponseEventsInner.uuid) &&
        Objects.equals(this.visible, coreCalendarCreateCalendarEvents200ResponseEventsInner.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseid, description, eventtype, format, groupid, id, instance, modulename, name, repeatid, sequence, subscriptionid, timeduration, timemodified, timestart, userid, uuid, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCalendarCreateCalendarEvents200ResponseEventsInner {\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventtype: ").append(toIndentedString(eventtype)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    modulename: ").append(toIndentedString(modulename)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repeatid: ").append(toIndentedString(repeatid)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    subscriptionid: ").append(toIndentedString(subscriptionid)).append("\n");
    sb.append("    timeduration: ").append(toIndentedString(timeduration)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    timestart: ").append(toIndentedString(timestart)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
    openapiFields.add("courseid");
    openapiFields.add("description");
    openapiFields.add("eventtype");
    openapiFields.add("format");
    openapiFields.add("groupid");
    openapiFields.add("id");
    openapiFields.add("instance");
    openapiFields.add("modulename");
    openapiFields.add("name");
    openapiFields.add("repeatid");
    openapiFields.add("sequence");
    openapiFields.add("subscriptionid");
    openapiFields.add("timeduration");
    openapiFields.add("timemodified");
    openapiFields.add("timestart");
    openapiFields.add("userid");
    openapiFields.add("uuid");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCalendarCreateCalendarEvents200ResponseEventsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCalendarCreateCalendarEvents200ResponseEventsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCalendarCreateCalendarEvents200ResponseEventsInner is not found in the empty JSON string", CoreCalendarCreateCalendarEvents200ResponseEventsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCalendarCreateCalendarEvents200ResponseEventsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCalendarCreateCalendarEvents200ResponseEventsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("eventtype") != null && !jsonObj.get("eventtype").isJsonNull()) && !jsonObj.get("eventtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventtype").toString()));
      }
      if ((jsonObj.get("modulename") != null && !jsonObj.get("modulename").isJsonNull()) && !jsonObj.get("modulename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modulename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modulename").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCalendarCreateCalendarEvents200ResponseEventsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCalendarCreateCalendarEvents200ResponseEventsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCalendarCreateCalendarEvents200ResponseEventsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCalendarCreateCalendarEvents200ResponseEventsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCalendarCreateCalendarEvents200ResponseEventsInner>() {
           @Override
           public void write(JsonWriter out, CoreCalendarCreateCalendarEvents200ResponseEventsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCalendarCreateCalendarEvents200ResponseEventsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCalendarCreateCalendarEvents200ResponseEventsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCalendarCreateCalendarEvents200ResponseEventsInner
  * @throws IOException if the JSON string is invalid with respect to CoreCalendarCreateCalendarEvents200ResponseEventsInner
  */
  public static CoreCalendarCreateCalendarEvents200ResponseEventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCalendarCreateCalendarEvents200ResponseEventsInner.class);
  }

 /**
  * Convert an instance of CoreCalendarCreateCalendarEvents200ResponseEventsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * message
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetMessages200ResponseMessagesInner {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "null";

  public static final String SERIALIZED_NAME_CONTEXTURL = "contexturl";
  @SerializedName(SERIALIZED_NAME_CONTEXTURL)
  private String contexturl = "null";

  public static final String SERIALIZED_NAME_CONTEXTURLNAME = "contexturlname";
  @SerializedName(SERIALIZED_NAME_CONTEXTURLNAME)
  private String contexturlname = "null";

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private String customdata = "null";

  public static final String SERIALIZED_NAME_EVENTTYPE = "eventtype";
  @SerializedName(SERIALIZED_NAME_EVENTTYPE)
  private String eventtype = "null";

  public static final String SERIALIZED_NAME_FULLMESSAGE = "fullmessage";
  @SerializedName(SERIALIZED_NAME_FULLMESSAGE)
  private String fullmessage = "null";

  public static final String SERIALIZED_NAME_FULLMESSAGEFORMAT = "fullmessageformat";
  @SerializedName(SERIALIZED_NAME_FULLMESSAGEFORMAT)
  private Integer fullmessageformat = null;

  public static final String SERIALIZED_NAME_FULLMESSAGEHTML = "fullmessagehtml";
  @SerializedName(SERIALIZED_NAME_FULLMESSAGEHTML)
  private String fullmessagehtml = "null";

  public static final String SERIALIZED_NAME_ICONURL = "iconurl";
  @SerializedName(SERIALIZED_NAME_ICONURL)
  private String iconurl = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private Integer notification = null;

  public static final String SERIALIZED_NAME_SMALLMESSAGE = "smallmessage";
  @SerializedName(SERIALIZED_NAME_SMALLMESSAGE)
  private String smallmessage = "null";

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject = "null";

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = "null";

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEREAD = "timeread";
  @SerializedName(SERIALIZED_NAME_TIMEREAD)
  private Integer timeread = null;

  public static final String SERIALIZED_NAME_USERFROMFULLNAME = "userfromfullname";
  @SerializedName(SERIALIZED_NAME_USERFROMFULLNAME)
  private String userfromfullname = "null";

  public static final String SERIALIZED_NAME_USERIDFROM = "useridfrom";
  @SerializedName(SERIALIZED_NAME_USERIDFROM)
  private Integer useridfrom;

  public static final String SERIALIZED_NAME_USERIDTO = "useridto";
  @SerializedName(SERIALIZED_NAME_USERIDTO)
  private Integer useridto;

  public static final String SERIALIZED_NAME_USERTOFULLNAME = "usertofullname";
  @SerializedName(SERIALIZED_NAME_USERTOFULLNAME)
  private String usertofullname = "null";

  public CoreMessageGetMessages200ResponseMessagesInner() {
  }

  public CoreMessageGetMessages200ResponseMessagesInner component(String component) {
    this.component = component;
    return this;
  }

   /**
   * The component that generated the notification
   * @return component
  **/
  @javax.annotation.Nullable
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreMessageGetMessages200ResponseMessagesInner contexturl(String contexturl) {
    this.contexturl = contexturl;
    return this;
  }

   /**
   * Context URL
   * @return contexturl
  **/
  @javax.annotation.Nullable
  public String getContexturl() {
    return contexturl;
  }

  public void setContexturl(String contexturl) {
    this.contexturl = contexturl;
  }


  public CoreMessageGetMessages200ResponseMessagesInner contexturlname(String contexturlname) {
    this.contexturlname = contexturlname;
    return this;
  }

   /**
   * Context URL link name
   * @return contexturlname
  **/
  @javax.annotation.Nullable
  public String getContexturlname() {
    return contexturlname;
  }

  public void setContexturlname(String contexturlname) {
    this.contexturlname = contexturlname;
  }


  public CoreMessageGetMessages200ResponseMessagesInner customdata(String customdata) {
    this.customdata = customdata;
    return this;
  }

   /**
   * Custom data to be passed to the message processor.                                 The data here is serialised using json_encode().
   * @return customdata
  **/
  @javax.annotation.Nullable
  public String getCustomdata() {
    return customdata;
  }

  public void setCustomdata(String customdata) {
    this.customdata = customdata;
  }


  public CoreMessageGetMessages200ResponseMessagesInner eventtype(String eventtype) {
    this.eventtype = eventtype;
    return this;
  }

   /**
   * The type of notification
   * @return eventtype
  **/
  @javax.annotation.Nullable
  public String getEventtype() {
    return eventtype;
  }

  public void setEventtype(String eventtype) {
    this.eventtype = eventtype;
  }


  public CoreMessageGetMessages200ResponseMessagesInner fullmessage(String fullmessage) {
    this.fullmessage = fullmessage;
    return this;
  }

   /**
   * The message
   * @return fullmessage
  **/
  @javax.annotation.Nullable
  public String getFullmessage() {
    return fullmessage;
  }

  public void setFullmessage(String fullmessage) {
    this.fullmessage = fullmessage;
  }


  public CoreMessageGetMessages200ResponseMessagesInner fullmessageformat(Integer fullmessageformat) {
    this.fullmessageformat = fullmessageformat;
    return this;
  }

   /**
   * fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return fullmessageformat
  **/
  @javax.annotation.Nullable
  public Integer getFullmessageformat() {
    return fullmessageformat;
  }

  public void setFullmessageformat(Integer fullmessageformat) {
    this.fullmessageformat = fullmessageformat;
  }


  public CoreMessageGetMessages200ResponseMessagesInner fullmessagehtml(String fullmessagehtml) {
    this.fullmessagehtml = fullmessagehtml;
    return this;
  }

   /**
   * The message in html
   * @return fullmessagehtml
  **/
  @javax.annotation.Nullable
  public String getFullmessagehtml() {
    return fullmessagehtml;
  }

  public void setFullmessagehtml(String fullmessagehtml) {
    this.fullmessagehtml = fullmessagehtml;
  }


  public CoreMessageGetMessages200ResponseMessagesInner iconurl(String iconurl) {
    this.iconurl = iconurl;
    return this;
  }

   /**
   * URL for icon, only for notifications.
   * @return iconurl
  **/
  @javax.annotation.Nullable
  public String getIconurl() {
    return iconurl;
  }

  public void setIconurl(String iconurl) {
    this.iconurl = iconurl;
  }


  public CoreMessageGetMessages200ResponseMessagesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Message id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreMessageGetMessages200ResponseMessagesInner notification(Integer notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Is a notification?
   * @return notification
  **/
  @javax.annotation.Nullable
  public Integer getNotification() {
    return notification;
  }

  public void setNotification(Integer notification) {
    this.notification = notification;
  }


  public CoreMessageGetMessages200ResponseMessagesInner smallmessage(String smallmessage) {
    this.smallmessage = smallmessage;
    return this;
  }

   /**
   * The shorten message
   * @return smallmessage
  **/
  @javax.annotation.Nullable
  public String getSmallmessage() {
    return smallmessage;
  }

  public void setSmallmessage(String smallmessage) {
    this.smallmessage = smallmessage;
  }


  public CoreMessageGetMessages200ResponseMessagesInner subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The message subject
   * @return subject
  **/
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public CoreMessageGetMessages200ResponseMessagesInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The message text formated
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public CoreMessageGetMessages200ResponseMessagesInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * Time created
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public CoreMessageGetMessages200ResponseMessagesInner timeread(Integer timeread) {
    this.timeread = timeread;
    return this;
  }

   /**
   * Time read
   * @return timeread
  **/
  @javax.annotation.Nullable
  public Integer getTimeread() {
    return timeread;
  }

  public void setTimeread(Integer timeread) {
    this.timeread = timeread;
  }


  public CoreMessageGetMessages200ResponseMessagesInner userfromfullname(String userfromfullname) {
    this.userfromfullname = userfromfullname;
    return this;
  }

   /**
   * User from full name
   * @return userfromfullname
  **/
  @javax.annotation.Nullable
  public String getUserfromfullname() {
    return userfromfullname;
  }

  public void setUserfromfullname(String userfromfullname) {
    this.userfromfullname = userfromfullname;
  }


  public CoreMessageGetMessages200ResponseMessagesInner useridfrom(Integer useridfrom) {
    this.useridfrom = useridfrom;
    return this;
  }

   /**
   * User from id
   * @return useridfrom
  **/
  @javax.annotation.Nullable
  public Integer getUseridfrom() {
    return useridfrom;
  }

  public void setUseridfrom(Integer useridfrom) {
    this.useridfrom = useridfrom;
  }


  public CoreMessageGetMessages200ResponseMessagesInner useridto(Integer useridto) {
    this.useridto = useridto;
    return this;
  }

   /**
   * User to id
   * @return useridto
  **/
  @javax.annotation.Nullable
  public Integer getUseridto() {
    return useridto;
  }

  public void setUseridto(Integer useridto) {
    this.useridto = useridto;
  }


  public CoreMessageGetMessages200ResponseMessagesInner usertofullname(String usertofullname) {
    this.usertofullname = usertofullname;
    return this;
  }

   /**
   * User to full name
   * @return usertofullname
  **/
  @javax.annotation.Nullable
  public String getUsertofullname() {
    return usertofullname;
  }

  public void setUsertofullname(String usertofullname) {
    this.usertofullname = usertofullname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetMessages200ResponseMessagesInner coreMessageGetMessages200ResponseMessagesInner = (CoreMessageGetMessages200ResponseMessagesInner) o;
    return Objects.equals(this.component, coreMessageGetMessages200ResponseMessagesInner.component) &&
        Objects.equals(this.contexturl, coreMessageGetMessages200ResponseMessagesInner.contexturl) &&
        Objects.equals(this.contexturlname, coreMessageGetMessages200ResponseMessagesInner.contexturlname) &&
        Objects.equals(this.customdata, coreMessageGetMessages200ResponseMessagesInner.customdata) &&
        Objects.equals(this.eventtype, coreMessageGetMessages200ResponseMessagesInner.eventtype) &&
        Objects.equals(this.fullmessage, coreMessageGetMessages200ResponseMessagesInner.fullmessage) &&
        Objects.equals(this.fullmessageformat, coreMessageGetMessages200ResponseMessagesInner.fullmessageformat) &&
        Objects.equals(this.fullmessagehtml, coreMessageGetMessages200ResponseMessagesInner.fullmessagehtml) &&
        Objects.equals(this.iconurl, coreMessageGetMessages200ResponseMessagesInner.iconurl) &&
        Objects.equals(this.id, coreMessageGetMessages200ResponseMessagesInner.id) &&
        Objects.equals(this.notification, coreMessageGetMessages200ResponseMessagesInner.notification) &&
        Objects.equals(this.smallmessage, coreMessageGetMessages200ResponseMessagesInner.smallmessage) &&
        Objects.equals(this.subject, coreMessageGetMessages200ResponseMessagesInner.subject) &&
        Objects.equals(this.text, coreMessageGetMessages200ResponseMessagesInner.text) &&
        Objects.equals(this.timecreated, coreMessageGetMessages200ResponseMessagesInner.timecreated) &&
        Objects.equals(this.timeread, coreMessageGetMessages200ResponseMessagesInner.timeread) &&
        Objects.equals(this.userfromfullname, coreMessageGetMessages200ResponseMessagesInner.userfromfullname) &&
        Objects.equals(this.useridfrom, coreMessageGetMessages200ResponseMessagesInner.useridfrom) &&
        Objects.equals(this.useridto, coreMessageGetMessages200ResponseMessagesInner.useridto) &&
        Objects.equals(this.usertofullname, coreMessageGetMessages200ResponseMessagesInner.usertofullname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, contexturl, contexturlname, customdata, eventtype, fullmessage, fullmessageformat, fullmessagehtml, iconurl, id, notification, smallmessage, subject, text, timecreated, timeread, userfromfullname, useridfrom, useridto, usertofullname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetMessages200ResponseMessagesInner {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    contexturl: ").append(toIndentedString(contexturl)).append("\n");
    sb.append("    contexturlname: ").append(toIndentedString(contexturlname)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    eventtype: ").append(toIndentedString(eventtype)).append("\n");
    sb.append("    fullmessage: ").append(toIndentedString(fullmessage)).append("\n");
    sb.append("    fullmessageformat: ").append(toIndentedString(fullmessageformat)).append("\n");
    sb.append("    fullmessagehtml: ").append(toIndentedString(fullmessagehtml)).append("\n");
    sb.append("    iconurl: ").append(toIndentedString(iconurl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    smallmessage: ").append(toIndentedString(smallmessage)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timeread: ").append(toIndentedString(timeread)).append("\n");
    sb.append("    userfromfullname: ").append(toIndentedString(userfromfullname)).append("\n");
    sb.append("    useridfrom: ").append(toIndentedString(useridfrom)).append("\n");
    sb.append("    useridto: ").append(toIndentedString(useridto)).append("\n");
    sb.append("    usertofullname: ").append(toIndentedString(usertofullname)).append("\n");
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
    openapiFields.add("component");
    openapiFields.add("contexturl");
    openapiFields.add("contexturlname");
    openapiFields.add("customdata");
    openapiFields.add("eventtype");
    openapiFields.add("fullmessage");
    openapiFields.add("fullmessageformat");
    openapiFields.add("fullmessagehtml");
    openapiFields.add("iconurl");
    openapiFields.add("id");
    openapiFields.add("notification");
    openapiFields.add("smallmessage");
    openapiFields.add("subject");
    openapiFields.add("text");
    openapiFields.add("timecreated");
    openapiFields.add("timeread");
    openapiFields.add("userfromfullname");
    openapiFields.add("useridfrom");
    openapiFields.add("useridto");
    openapiFields.add("usertofullname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetMessages200ResponseMessagesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetMessages200ResponseMessagesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetMessages200ResponseMessagesInner is not found in the empty JSON string", CoreMessageGetMessages200ResponseMessagesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetMessages200ResponseMessagesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetMessages200ResponseMessagesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if ((jsonObj.get("contexturl") != null && !jsonObj.get("contexturl").isJsonNull()) && !jsonObj.get("contexturl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contexturl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contexturl").toString()));
      }
      if ((jsonObj.get("contexturlname") != null && !jsonObj.get("contexturlname").isJsonNull()) && !jsonObj.get("contexturlname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contexturlname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contexturlname").toString()));
      }
      if ((jsonObj.get("customdata") != null && !jsonObj.get("customdata").isJsonNull()) && !jsonObj.get("customdata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customdata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customdata").toString()));
      }
      if ((jsonObj.get("eventtype") != null && !jsonObj.get("eventtype").isJsonNull()) && !jsonObj.get("eventtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventtype").toString()));
      }
      if ((jsonObj.get("fullmessage") != null && !jsonObj.get("fullmessage").isJsonNull()) && !jsonObj.get("fullmessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullmessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullmessage").toString()));
      }
      if ((jsonObj.get("fullmessagehtml") != null && !jsonObj.get("fullmessagehtml").isJsonNull()) && !jsonObj.get("fullmessagehtml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullmessagehtml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullmessagehtml").toString()));
      }
      if ((jsonObj.get("iconurl") != null && !jsonObj.get("iconurl").isJsonNull()) && !jsonObj.get("iconurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconurl").toString()));
      }
      if ((jsonObj.get("smallmessage") != null && !jsonObj.get("smallmessage").isJsonNull()) && !jsonObj.get("smallmessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smallmessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smallmessage").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("userfromfullname") != null && !jsonObj.get("userfromfullname").isJsonNull()) && !jsonObj.get("userfromfullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userfromfullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userfromfullname").toString()));
      }
      if ((jsonObj.get("usertofullname") != null && !jsonObj.get("usertofullname").isJsonNull()) && !jsonObj.get("usertofullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usertofullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usertofullname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetMessages200ResponseMessagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetMessages200ResponseMessagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetMessages200ResponseMessagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetMessages200ResponseMessagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetMessages200ResponseMessagesInner>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetMessages200ResponseMessagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetMessages200ResponseMessagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetMessages200ResponseMessagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetMessages200ResponseMessagesInner
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetMessages200ResponseMessagesInner
  */
  public static CoreMessageGetMessages200ResponseMessagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetMessages200ResponseMessagesInner.class);
  }

 /**
  * Convert an instance of CoreMessageGetMessages200ResponseMessagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

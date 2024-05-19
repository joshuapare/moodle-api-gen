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
 * CoreCompetencyCreatePlan200ResponseCommentarea
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyCreatePlan200ResponseCommentarea {
  public static final String SERIALIZED_NAME_AUTOSTART = "autostart";
  @SerializedName(SERIALIZED_NAME_AUTOSTART)
  private Boolean autostart = null;

  public static final String SERIALIZED_NAME_CANPOST = "canpost";
  @SerializedName(SERIALIZED_NAME_CANPOST)
  private Boolean canpost = null;

  public static final String SERIALIZED_NAME_CANPOSTORHASCOMMENTS = "canpostorhascomments";
  @SerializedName(SERIALIZED_NAME_CANPOSTORHASCOMMENTS)
  private Boolean canpostorhascomments = null;

  public static final String SERIALIZED_NAME_CANVIEW = "canview";
  @SerializedName(SERIALIZED_NAME_CANVIEW)
  private Boolean canview = null;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid = "null";

  public static final String SERIALIZED_NAME_COLLAPSEDICONKEY = "collapsediconkey";
  @SerializedName(SERIALIZED_NAME_COLLAPSEDICONKEY)
  private String collapsediconkey = "null";

  public static final String SERIALIZED_NAME_COMMENTAREA = "commentarea";
  @SerializedName(SERIALIZED_NAME_COMMENTAREA)
  private String commentarea = "null";

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = null;

  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_DISPLAYCANCEL = "displaycancel";
  @SerializedName(SERIALIZED_NAME_DISPLAYCANCEL)
  private Boolean displaycancel = null;

  public static final String SERIALIZED_NAME_DISPLAYTOTALCOUNT = "displaytotalcount";
  @SerializedName(SERIALIZED_NAME_DISPLAYTOTALCOUNT)
  private Boolean displaytotalcount = null;

  public static final String SERIALIZED_NAME_FULLWIDTH = "fullwidth";
  @SerializedName(SERIALIZED_NAME_FULLWIDTH)
  private Boolean fullwidth = null;

  public static final String SERIALIZED_NAME_ITEMID = "itemid";
  @SerializedName(SERIALIZED_NAME_ITEMID)
  private Integer itemid = null;

  public static final String SERIALIZED_NAME_LINKTEXT = "linktext";
  @SerializedName(SERIALIZED_NAME_LINKTEXT)
  private String linktext = "null";

  public static final String SERIALIZED_NAME_NOTOGGLE = "notoggle";
  @SerializedName(SERIALIZED_NAME_NOTOGGLE)
  private Boolean notoggle = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template = "null";

  public CoreCompetencyCreatePlan200ResponseCommentarea() {
  }

  public CoreCompetencyCreatePlan200ResponseCommentarea autostart(Boolean autostart) {
    this.autostart = autostart;
    return this;
  }

   /**
   * autostart
   * @return autostart
  **/
  @javax.annotation.Nonnull
  public Boolean getAutostart() {
    return autostart;
  }

  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea canpost(Boolean canpost) {
    this.canpost = canpost;
    return this;
  }

   /**
   * canpost
   * @return canpost
  **/
  @javax.annotation.Nonnull
  public Boolean getCanpost() {
    return canpost;
  }

  public void setCanpost(Boolean canpost) {
    this.canpost = canpost;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea canpostorhascomments(Boolean canpostorhascomments) {
    this.canpostorhascomments = canpostorhascomments;
    return this;
  }

   /**
   * canpostorhascomments
   * @return canpostorhascomments
  **/
  @javax.annotation.Nonnull
  public Boolean getCanpostorhascomments() {
    return canpostorhascomments;
  }

  public void setCanpostorhascomments(Boolean canpostorhascomments) {
    this.canpostorhascomments = canpostorhascomments;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea canview(Boolean canview) {
    this.canview = canview;
    return this;
  }

   /**
   * canview
   * @return canview
  **/
  @javax.annotation.Nonnull
  public Boolean getCanview() {
    return canview;
  }

  public void setCanview(Boolean canview) {
    this.canview = canview;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea cid(String cid) {
    this.cid = cid;
    return this;
  }

   /**
   * cid
   * @return cid
  **/
  @javax.annotation.Nonnull
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea collapsediconkey(String collapsediconkey) {
    this.collapsediconkey = collapsediconkey;
    return this;
  }

   /**
   * collapsediconkey
   * @return collapsediconkey
  **/
  @javax.annotation.Nonnull
  public String getCollapsediconkey() {
    return collapsediconkey;
  }

  public void setCollapsediconkey(String collapsediconkey) {
    this.collapsediconkey = collapsediconkey;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea commentarea(String commentarea) {
    this.commentarea = commentarea;
    return this;
  }

   /**
   * commentarea
   * @return commentarea
  **/
  @javax.annotation.Nonnull
  public String getCommentarea() {
    return commentarea;
  }

  public void setCommentarea(String commentarea) {
    this.commentarea = commentarea;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea component(String component) {
    this.component = component;
    return this;
  }

   /**
   * component
   * @return component
  **/
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * contextid
   * @return contextid
  **/
  @javax.annotation.Nonnull
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * count
   * @return count
  **/
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea courseid(Integer courseid) {
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


  public CoreCompetencyCreatePlan200ResponseCommentarea displaycancel(Boolean displaycancel) {
    this.displaycancel = displaycancel;
    return this;
  }

   /**
   * displaycancel
   * @return displaycancel
  **/
  @javax.annotation.Nonnull
  public Boolean getDisplaycancel() {
    return displaycancel;
  }

  public void setDisplaycancel(Boolean displaycancel) {
    this.displaycancel = displaycancel;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea displaytotalcount(Boolean displaytotalcount) {
    this.displaytotalcount = displaytotalcount;
    return this;
  }

   /**
   * displaytotalcount
   * @return displaytotalcount
  **/
  @javax.annotation.Nonnull
  public Boolean getDisplaytotalcount() {
    return displaytotalcount;
  }

  public void setDisplaytotalcount(Boolean displaytotalcount) {
    this.displaytotalcount = displaytotalcount;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea fullwidth(Boolean fullwidth) {
    this.fullwidth = fullwidth;
    return this;
  }

   /**
   * fullwidth
   * @return fullwidth
  **/
  @javax.annotation.Nonnull
  public Boolean getFullwidth() {
    return fullwidth;
  }

  public void setFullwidth(Boolean fullwidth) {
    this.fullwidth = fullwidth;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea itemid(Integer itemid) {
    this.itemid = itemid;
    return this;
  }

   /**
   * itemid
   * @return itemid
  **/
  @javax.annotation.Nonnull
  public Integer getItemid() {
    return itemid;
  }

  public void setItemid(Integer itemid) {
    this.itemid = itemid;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea linktext(String linktext) {
    this.linktext = linktext;
    return this;
  }

   /**
   * linktext
   * @return linktext
  **/
  @javax.annotation.Nonnull
  public String getLinktext() {
    return linktext;
  }

  public void setLinktext(String linktext) {
    this.linktext = linktext;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea notoggle(Boolean notoggle) {
    this.notoggle = notoggle;
    return this;
  }

   /**
   * notoggle
   * @return notoggle
  **/
  @javax.annotation.Nonnull
  public Boolean getNotoggle() {
    return notoggle;
  }

  public void setNotoggle(Boolean notoggle) {
    this.notoggle = notoggle;
  }


  public CoreCompetencyCreatePlan200ResponseCommentarea template(String template) {
    this.template = template;
    return this;
  }

   /**
   * template
   * @return template
  **/
  @javax.annotation.Nonnull
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompetencyCreatePlan200ResponseCommentarea coreCompetencyCreatePlan200ResponseCommentarea = (CoreCompetencyCreatePlan200ResponseCommentarea) o;
    return Objects.equals(this.autostart, coreCompetencyCreatePlan200ResponseCommentarea.autostart) &&
        Objects.equals(this.canpost, coreCompetencyCreatePlan200ResponseCommentarea.canpost) &&
        Objects.equals(this.canpostorhascomments, coreCompetencyCreatePlan200ResponseCommentarea.canpostorhascomments) &&
        Objects.equals(this.canview, coreCompetencyCreatePlan200ResponseCommentarea.canview) &&
        Objects.equals(this.cid, coreCompetencyCreatePlan200ResponseCommentarea.cid) &&
        Objects.equals(this.collapsediconkey, coreCompetencyCreatePlan200ResponseCommentarea.collapsediconkey) &&
        Objects.equals(this.commentarea, coreCompetencyCreatePlan200ResponseCommentarea.commentarea) &&
        Objects.equals(this.component, coreCompetencyCreatePlan200ResponseCommentarea.component) &&
        Objects.equals(this.contextid, coreCompetencyCreatePlan200ResponseCommentarea.contextid) &&
        Objects.equals(this.count, coreCompetencyCreatePlan200ResponseCommentarea.count) &&
        Objects.equals(this.courseid, coreCompetencyCreatePlan200ResponseCommentarea.courseid) &&
        Objects.equals(this.displaycancel, coreCompetencyCreatePlan200ResponseCommentarea.displaycancel) &&
        Objects.equals(this.displaytotalcount, coreCompetencyCreatePlan200ResponseCommentarea.displaytotalcount) &&
        Objects.equals(this.fullwidth, coreCompetencyCreatePlan200ResponseCommentarea.fullwidth) &&
        Objects.equals(this.itemid, coreCompetencyCreatePlan200ResponseCommentarea.itemid) &&
        Objects.equals(this.linktext, coreCompetencyCreatePlan200ResponseCommentarea.linktext) &&
        Objects.equals(this.notoggle, coreCompetencyCreatePlan200ResponseCommentarea.notoggle) &&
        Objects.equals(this.template, coreCompetencyCreatePlan200ResponseCommentarea.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autostart, canpost, canpostorhascomments, canview, cid, collapsediconkey, commentarea, component, contextid, count, courseid, displaycancel, displaytotalcount, fullwidth, itemid, linktext, notoggle, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyCreatePlan200ResponseCommentarea {\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
    sb.append("    canpost: ").append(toIndentedString(canpost)).append("\n");
    sb.append("    canpostorhascomments: ").append(toIndentedString(canpostorhascomments)).append("\n");
    sb.append("    canview: ").append(toIndentedString(canview)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    collapsediconkey: ").append(toIndentedString(collapsediconkey)).append("\n");
    sb.append("    commentarea: ").append(toIndentedString(commentarea)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    displaycancel: ").append(toIndentedString(displaycancel)).append("\n");
    sb.append("    displaytotalcount: ").append(toIndentedString(displaytotalcount)).append("\n");
    sb.append("    fullwidth: ").append(toIndentedString(fullwidth)).append("\n");
    sb.append("    itemid: ").append(toIndentedString(itemid)).append("\n");
    sb.append("    linktext: ").append(toIndentedString(linktext)).append("\n");
    sb.append("    notoggle: ").append(toIndentedString(notoggle)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("autostart");
    openapiFields.add("canpost");
    openapiFields.add("canpostorhascomments");
    openapiFields.add("canview");
    openapiFields.add("cid");
    openapiFields.add("collapsediconkey");
    openapiFields.add("commentarea");
    openapiFields.add("component");
    openapiFields.add("contextid");
    openapiFields.add("count");
    openapiFields.add("courseid");
    openapiFields.add("displaycancel");
    openapiFields.add("displaytotalcount");
    openapiFields.add("fullwidth");
    openapiFields.add("itemid");
    openapiFields.add("linktext");
    openapiFields.add("notoggle");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("autostart");
    openapiRequiredFields.add("canpost");
    openapiRequiredFields.add("canpostorhascomments");
    openapiRequiredFields.add("canview");
    openapiRequiredFields.add("cid");
    openapiRequiredFields.add("collapsediconkey");
    openapiRequiredFields.add("commentarea");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("contextid");
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("courseid");
    openapiRequiredFields.add("displaycancel");
    openapiRequiredFields.add("displaytotalcount");
    openapiRequiredFields.add("fullwidth");
    openapiRequiredFields.add("itemid");
    openapiRequiredFields.add("linktext");
    openapiRequiredFields.add("notoggle");
    openapiRequiredFields.add("template");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyCreatePlan200ResponseCommentarea
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyCreatePlan200ResponseCommentarea.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyCreatePlan200ResponseCommentarea is not found in the empty JSON string", CoreCompetencyCreatePlan200ResponseCommentarea.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyCreatePlan200ResponseCommentarea.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyCreatePlan200ResponseCommentarea` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyCreatePlan200ResponseCommentarea.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
      if (!jsonObj.get("collapsediconkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collapsediconkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collapsediconkey").toString()));
      }
      if (!jsonObj.get("commentarea").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentarea` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentarea").toString()));
      }
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("linktext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linktext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linktext").toString()));
      }
      if (!jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyCreatePlan200ResponseCommentarea.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyCreatePlan200ResponseCommentarea' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyCreatePlan200ResponseCommentarea> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyCreatePlan200ResponseCommentarea.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyCreatePlan200ResponseCommentarea>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyCreatePlan200ResponseCommentarea value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyCreatePlan200ResponseCommentarea read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyCreatePlan200ResponseCommentarea given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyCreatePlan200ResponseCommentarea
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyCreatePlan200ResponseCommentarea
  */
  public static CoreCompetencyCreatePlan200ResponseCommentarea fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyCreatePlan200ResponseCommentarea.class);
  }

 /**
  * Convert an instance of CoreCompetencyCreatePlan200ResponseCommentarea to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


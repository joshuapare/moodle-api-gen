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
 * CoreCommentAddCommentsRequestCommentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCommentAddCommentsRequestCommentsInner {
  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area = "";

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CONTEXTLEVEL = "contextlevel";
  @SerializedName(SERIALIZED_NAME_CONTEXTLEVEL)
  private String contextlevel = "null";

  public static final String SERIALIZED_NAME_INSTANCEID = "instanceid";
  @SerializedName(SERIALIZED_NAME_INSTANCEID)
  private Integer instanceid = null;

  public static final String SERIALIZED_NAME_ITEMID = "itemid";
  @SerializedName(SERIALIZED_NAME_ITEMID)
  private Integer itemid = null;

  public CoreCommentAddCommentsRequestCommentsInner() {
  }

  public CoreCommentAddCommentsRequestCommentsInner area(String area) {
    this.area = area;
    return this;
  }

   /**
   * string comment area
   * @return area
  **/
  @javax.annotation.Nullable
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public CoreCommentAddCommentsRequestCommentsInner component(String component) {
    this.component = component;
    return this;
  }

   /**
   * component
   * @return component
  **/
  @javax.annotation.Nullable
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreCommentAddCommentsRequestCommentsInner content(String content) {
    this.content = content;
    return this;
  }

   /**
   * component
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public CoreCommentAddCommentsRequestCommentsInner contextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
    return this;
  }

   /**
   * contextlevel system, course, user...
   * @return contextlevel
  **/
  @javax.annotation.Nullable
  public String getContextlevel() {
    return contextlevel;
  }

  public void setContextlevel(String contextlevel) {
    this.contextlevel = contextlevel;
  }


  public CoreCommentAddCommentsRequestCommentsInner instanceid(Integer instanceid) {
    this.instanceid = instanceid;
    return this;
  }

   /**
   * the id of item associated with the contextlevel
   * @return instanceid
  **/
  @javax.annotation.Nullable
  public Integer getInstanceid() {
    return instanceid;
  }

  public void setInstanceid(Integer instanceid) {
    this.instanceid = instanceid;
  }


  public CoreCommentAddCommentsRequestCommentsInner itemid(Integer itemid) {
    this.itemid = itemid;
    return this;
  }

   /**
   * associated id
   * @return itemid
  **/
  @javax.annotation.Nullable
  public Integer getItemid() {
    return itemid;
  }

  public void setItemid(Integer itemid) {
    this.itemid = itemid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCommentAddCommentsRequestCommentsInner coreCommentAddCommentsRequestCommentsInner = (CoreCommentAddCommentsRequestCommentsInner) o;
    return Objects.equals(this.area, coreCommentAddCommentsRequestCommentsInner.area) &&
        Objects.equals(this.component, coreCommentAddCommentsRequestCommentsInner.component) &&
        Objects.equals(this.content, coreCommentAddCommentsRequestCommentsInner.content) &&
        Objects.equals(this.contextlevel, coreCommentAddCommentsRequestCommentsInner.contextlevel) &&
        Objects.equals(this.instanceid, coreCommentAddCommentsRequestCommentsInner.instanceid) &&
        Objects.equals(this.itemid, coreCommentAddCommentsRequestCommentsInner.itemid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, component, content, contextlevel, instanceid, itemid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCommentAddCommentsRequestCommentsInner {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contextlevel: ").append(toIndentedString(contextlevel)).append("\n");
    sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
    sb.append("    itemid: ").append(toIndentedString(itemid)).append("\n");
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
    openapiFields.add("area");
    openapiFields.add("component");
    openapiFields.add("content");
    openapiFields.add("contextlevel");
    openapiFields.add("instanceid");
    openapiFields.add("itemid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCommentAddCommentsRequestCommentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCommentAddCommentsRequestCommentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCommentAddCommentsRequestCommentsInner is not found in the empty JSON string", CoreCommentAddCommentsRequestCommentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCommentAddCommentsRequestCommentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCommentAddCommentsRequestCommentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("contextlevel") != null && !jsonObj.get("contextlevel").isJsonNull()) && !jsonObj.get("contextlevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextlevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextlevel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCommentAddCommentsRequestCommentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCommentAddCommentsRequestCommentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCommentAddCommentsRequestCommentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCommentAddCommentsRequestCommentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCommentAddCommentsRequestCommentsInner>() {
           @Override
           public void write(JsonWriter out, CoreCommentAddCommentsRequestCommentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCommentAddCommentsRequestCommentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCommentAddCommentsRequestCommentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCommentAddCommentsRequestCommentsInner
  * @throws IOException if the JSON string is invalid with respect to CoreCommentAddCommentsRequestCommentsInner
  */
  public static CoreCommentAddCommentsRequestCommentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCommentAddCommentsRequestCommentsInner.class);
  }

 /**
  * Convert an instance of CoreCommentAddCommentsRequestCommentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


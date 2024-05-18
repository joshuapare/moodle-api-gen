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
 * CoreTagGetTagAreas200ResponseAreasInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreTagGetTagAreas200ResponseAreasInner {
  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private String callback = "null";

  public static final String SERIALIZED_NAME_CALLBACKFILE = "callbackfile";
  @SerializedName(SERIALIZED_NAME_CALLBACKFILE)
  private String callbackfile = "null";

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "null";

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_ITEMTYPE = "itemtype";
  @SerializedName(SERIALIZED_NAME_ITEMTYPE)
  private String itemtype = "null";

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked = false;

  public static final String SERIALIZED_NAME_MULTIPLECONTEXTS = "multiplecontexts";
  @SerializedName(SERIALIZED_NAME_MULTIPLECONTEXTS)
  private Boolean multiplecontexts = false;

  public static final String SERIALIZED_NAME_SHOWSTANDARD = "showstandard";
  @SerializedName(SERIALIZED_NAME_SHOWSTANDARD)
  private Integer showstandard = 0;

  public static final String SERIALIZED_NAME_TAGCOLLID = "tagcollid";
  @SerializedName(SERIALIZED_NAME_TAGCOLLID)
  private Integer tagcollid = null;

  public CoreTagGetTagAreas200ResponseAreasInner() {
  }

  public CoreTagGetTagAreas200ResponseAreasInner callback(String callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Component callback for processing tags.
   * @return callback
  **/
  @javax.annotation.Nullable
  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }


  public CoreTagGetTagAreas200ResponseAreasInner callbackfile(String callbackfile) {
    this.callbackfile = callbackfile;
    return this;
  }

   /**
   * Component callback file.
   * @return callbackfile
  **/
  @javax.annotation.Nullable
  public String getCallbackfile() {
    return callbackfile;
  }

  public void setCallbackfile(String callbackfile) {
    this.callbackfile = callbackfile;
  }


  public CoreTagGetTagAreas200ResponseAreasInner component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Component the area is related to.
   * @return component
  **/
  @javax.annotation.Nullable
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public CoreTagGetTagAreas200ResponseAreasInner enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether this area is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CoreTagGetTagAreas200ResponseAreasInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Area id.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreTagGetTagAreas200ResponseAreasInner itemtype(String itemtype) {
    this.itemtype = itemtype;
    return this;
  }

   /**
   * Type of item in the component.
   * @return itemtype
  **/
  @javax.annotation.Nullable
  public String getItemtype() {
    return itemtype;
  }

  public void setItemtype(String itemtype) {
    this.itemtype = itemtype;
  }


  public CoreTagGetTagAreas200ResponseAreasInner locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether the area is locked.
   * @return locked
  **/
  @javax.annotation.Nullable
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public CoreTagGetTagAreas200ResponseAreasInner multiplecontexts(Boolean multiplecontexts) {
    this.multiplecontexts = multiplecontexts;
    return this;
  }

   /**
   * Whether the tag area allows tag instances to be created in multiple contexts. 
   * @return multiplecontexts
  **/
  @javax.annotation.Nullable
  public Boolean getMultiplecontexts() {
    return multiplecontexts;
  }

  public void setMultiplecontexts(Boolean multiplecontexts) {
    this.multiplecontexts = multiplecontexts;
  }


  public CoreTagGetTagAreas200ResponseAreasInner showstandard(Integer showstandard) {
    this.showstandard = showstandard;
    return this;
  }

   /**
   * Return whether to display only standard, only non-standard or both tags.
   * @return showstandard
  **/
  @javax.annotation.Nullable
  public Integer getShowstandard() {
    return showstandard;
  }

  public void setShowstandard(Integer showstandard) {
    this.showstandard = showstandard;
  }


  public CoreTagGetTagAreas200ResponseAreasInner tagcollid(Integer tagcollid) {
    this.tagcollid = tagcollid;
    return this;
  }

   /**
   * The tag collection this are belongs to.
   * @return tagcollid
  **/
  @javax.annotation.Nullable
  public Integer getTagcollid() {
    return tagcollid;
  }

  public void setTagcollid(Integer tagcollid) {
    this.tagcollid = tagcollid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreTagGetTagAreas200ResponseAreasInner coreTagGetTagAreas200ResponseAreasInner = (CoreTagGetTagAreas200ResponseAreasInner) o;
    return Objects.equals(this.callback, coreTagGetTagAreas200ResponseAreasInner.callback) &&
        Objects.equals(this.callbackfile, coreTagGetTagAreas200ResponseAreasInner.callbackfile) &&
        Objects.equals(this.component, coreTagGetTagAreas200ResponseAreasInner.component) &&
        Objects.equals(this.enabled, coreTagGetTagAreas200ResponseAreasInner.enabled) &&
        Objects.equals(this.id, coreTagGetTagAreas200ResponseAreasInner.id) &&
        Objects.equals(this.itemtype, coreTagGetTagAreas200ResponseAreasInner.itemtype) &&
        Objects.equals(this.locked, coreTagGetTagAreas200ResponseAreasInner.locked) &&
        Objects.equals(this.multiplecontexts, coreTagGetTagAreas200ResponseAreasInner.multiplecontexts) &&
        Objects.equals(this.showstandard, coreTagGetTagAreas200ResponseAreasInner.showstandard) &&
        Objects.equals(this.tagcollid, coreTagGetTagAreas200ResponseAreasInner.tagcollid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, callbackfile, component, enabled, id, itemtype, locked, multiplecontexts, showstandard, tagcollid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreTagGetTagAreas200ResponseAreasInner {\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    callbackfile: ").append(toIndentedString(callbackfile)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemtype: ").append(toIndentedString(itemtype)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    multiplecontexts: ").append(toIndentedString(multiplecontexts)).append("\n");
    sb.append("    showstandard: ").append(toIndentedString(showstandard)).append("\n");
    sb.append("    tagcollid: ").append(toIndentedString(tagcollid)).append("\n");
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
    openapiFields.add("callback");
    openapiFields.add("callbackfile");
    openapiFields.add("component");
    openapiFields.add("enabled");
    openapiFields.add("id");
    openapiFields.add("itemtype");
    openapiFields.add("locked");
    openapiFields.add("multiplecontexts");
    openapiFields.add("showstandard");
    openapiFields.add("tagcollid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreTagGetTagAreas200ResponseAreasInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreTagGetTagAreas200ResponseAreasInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreTagGetTagAreas200ResponseAreasInner is not found in the empty JSON string", CoreTagGetTagAreas200ResponseAreasInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreTagGetTagAreas200ResponseAreasInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreTagGetTagAreas200ResponseAreasInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("callback") != null && !jsonObj.get("callback").isJsonNull()) && !jsonObj.get("callback").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callback` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callback").toString()));
      }
      if ((jsonObj.get("callbackfile") != null && !jsonObj.get("callbackfile").isJsonNull()) && !jsonObj.get("callbackfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackfile").toString()));
      }
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if ((jsonObj.get("itemtype") != null && !jsonObj.get("itemtype").isJsonNull()) && !jsonObj.get("itemtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemtype").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreTagGetTagAreas200ResponseAreasInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreTagGetTagAreas200ResponseAreasInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreTagGetTagAreas200ResponseAreasInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreTagGetTagAreas200ResponseAreasInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreTagGetTagAreas200ResponseAreasInner>() {
           @Override
           public void write(JsonWriter out, CoreTagGetTagAreas200ResponseAreasInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreTagGetTagAreas200ResponseAreasInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreTagGetTagAreas200ResponseAreasInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreTagGetTagAreas200ResponseAreasInner
  * @throws IOException if the JSON string is invalid with respect to CoreTagGetTagAreas200ResponseAreasInner
  */
  public static CoreTagGetTagAreas200ResponseAreasInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreTagGetTagAreas200ResponseAreasInner.class);
  }

 /**
  * Convert an instance of CoreTagGetTagAreas200ResponseAreasInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

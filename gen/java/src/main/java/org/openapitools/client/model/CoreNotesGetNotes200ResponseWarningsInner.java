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
 * warning
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreNotesGetNotes200ResponseWarningsInner {
  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private String item = "null";

  public static final String SERIALIZED_NAME_ITEMID = "itemid";
  @SerializedName(SERIALIZED_NAME_ITEMID)
  private Integer itemid = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_WARNINGCODE = "warningcode";
  @SerializedName(SERIALIZED_NAME_WARNINGCODE)
  private String warningcode = "null";

  public CoreNotesGetNotes200ResponseWarningsInner() {
  }

  public CoreNotesGetNotes200ResponseWarningsInner item(String item) {
    this.item = item;
    return this;
  }

   /**
   * item is always &#39;note&#39;
   * @return item
  **/
  @javax.annotation.Nullable
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }


  public CoreNotesGetNotes200ResponseWarningsInner itemid(Integer itemid) {
    this.itemid = itemid;
    return this;
  }

   /**
   * When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist
   * @return itemid
  **/
  @javax.annotation.Nullable
  public Integer getItemid() {
    return itemid;
  }

  public void setItemid(Integer itemid) {
    this.itemid = itemid;
  }


  public CoreNotesGetNotes200ResponseWarningsInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * untranslated english message to explain the warning
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public CoreNotesGetNotes200ResponseWarningsInner warningcode(String warningcode) {
    this.warningcode = warningcode;
    return this;
  }

   /**
   * errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist)
   * @return warningcode
  **/
  @javax.annotation.Nullable
  public String getWarningcode() {
    return warningcode;
  }

  public void setWarningcode(String warningcode) {
    this.warningcode = warningcode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreNotesGetNotes200ResponseWarningsInner coreNotesGetNotes200ResponseWarningsInner = (CoreNotesGetNotes200ResponseWarningsInner) o;
    return Objects.equals(this.item, coreNotesGetNotes200ResponseWarningsInner.item) &&
        Objects.equals(this.itemid, coreNotesGetNotes200ResponseWarningsInner.itemid) &&
        Objects.equals(this.message, coreNotesGetNotes200ResponseWarningsInner.message) &&
        Objects.equals(this.warningcode, coreNotesGetNotes200ResponseWarningsInner.warningcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, itemid, message, warningcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreNotesGetNotes200ResponseWarningsInner {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemid: ").append(toIndentedString(itemid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    warningcode: ").append(toIndentedString(warningcode)).append("\n");
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
    openapiFields.add("item");
    openapiFields.add("itemid");
    openapiFields.add("message");
    openapiFields.add("warningcode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreNotesGetNotes200ResponseWarningsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreNotesGetNotes200ResponseWarningsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreNotesGetNotes200ResponseWarningsInner is not found in the empty JSON string", CoreNotesGetNotes200ResponseWarningsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreNotesGetNotes200ResponseWarningsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreNotesGetNotes200ResponseWarningsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("item") != null && !jsonObj.get("item").isJsonNull()) && !jsonObj.get("item").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("warningcode") != null && !jsonObj.get("warningcode").isJsonNull()) && !jsonObj.get("warningcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warningcode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreNotesGetNotes200ResponseWarningsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreNotesGetNotes200ResponseWarningsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreNotesGetNotes200ResponseWarningsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreNotesGetNotes200ResponseWarningsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreNotesGetNotes200ResponseWarningsInner>() {
           @Override
           public void write(JsonWriter out, CoreNotesGetNotes200ResponseWarningsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreNotesGetNotes200ResponseWarningsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreNotesGetNotes200ResponseWarningsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreNotesGetNotes200ResponseWarningsInner
  * @throws IOException if the JSON string is invalid with respect to CoreNotesGetNotes200ResponseWarningsInner
  */
  public static CoreNotesGetNotes200ResponseWarningsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreNotesGetNotes200ResponseWarningsInner.class);
  }

 /**
  * Convert an instance of CoreNotesGetNotes200ResponseWarningsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner;

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
 * CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner {
  public static final String SERIALIZED_NAME_DISPLAYNAME = "displayname";
  @SerializedName(SERIALIZED_NAME_DISPLAYNAME)
  private String displayname;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner> notifications = new ArrayList<>();

  public CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner() {
  }

  public CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Display name
   * @return displayname
  **/
  @javax.annotation.Nullable
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }


  public CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner notifications(List<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner> notifications) {
    this.notifications = notifications;
    return this;
  }

  public CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner addNotificationsItem(CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  public List<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner> notifications) {
    this.notifications = notifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner coreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner = (CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner) o;
    return Objects.equals(this.displayname, coreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.displayname) &&
        Objects.equals(this.notifications, coreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner {\n");
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
    openapiFields.add("displayname");
    openapiFields.add("notifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner is not found in the empty JSON string", CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayname") != null && !jsonObj.get("displayname").isJsonNull()) && !jsonObj.get("displayname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayname").toString()));
      }
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        JsonArray jsonArraynotifications = jsonObj.getAsJsonArray("notifications");
        if (jsonArraynotifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
          }

          // validate the optional field `notifications` (array)
          for (int i = 0; i < jsonArraynotifications.size(); i++) {
            CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner.validateJsonElement(jsonArraynotifications.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner
  */
  public static CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.class);
  }

 /**
  * Convert an instance of CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreMessageGetConversationBetweenUsers200ResponseMembersInner;
import org.openapitools.client.model.CoreMessageGetConversationBetweenUsers200ResponseMessagesInner;

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
 * CoreMessageGetConversationMessages200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetConversationMessages200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<CoreMessageGetConversationBetweenUsers200ResponseMembersInner> members = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<CoreMessageGetConversationBetweenUsers200ResponseMessagesInner> messages = new ArrayList<>();

  public CoreMessageGetConversationMessages200Response() {
  }

  public CoreMessageGetConversationMessages200Response id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The conversation id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreMessageGetConversationMessages200Response members(List<CoreMessageGetConversationBetweenUsers200ResponseMembersInner> members) {
    this.members = members;
    return this;
  }

  public CoreMessageGetConversationMessages200Response addMembersItem(CoreMessageGetConversationBetweenUsers200ResponseMembersInner membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nonnull
  public List<CoreMessageGetConversationBetweenUsers200ResponseMembersInner> getMembers() {
    return members;
  }

  public void setMembers(List<CoreMessageGetConversationBetweenUsers200ResponseMembersInner> members) {
    this.members = members;
  }


  public CoreMessageGetConversationMessages200Response messages(List<CoreMessageGetConversationBetweenUsers200ResponseMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public CoreMessageGetConversationMessages200Response addMessagesItem(CoreMessageGetConversationBetweenUsers200ResponseMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nonnull
  public List<CoreMessageGetConversationBetweenUsers200ResponseMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<CoreMessageGetConversationBetweenUsers200ResponseMessagesInner> messages) {
    this.messages = messages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetConversationMessages200Response coreMessageGetConversationMessages200Response = (CoreMessageGetConversationMessages200Response) o;
    return Objects.equals(this.id, coreMessageGetConversationMessages200Response.id) &&
        Objects.equals(this.members, coreMessageGetConversationMessages200Response.members) &&
        Objects.equals(this.messages, coreMessageGetConversationMessages200Response.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, members, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetConversationMessages200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("members");
    openapiFields.add("messages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("members");
    openapiRequiredFields.add("messages");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetConversationMessages200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetConversationMessages200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetConversationMessages200Response is not found in the empty JSON string", CoreMessageGetConversationMessages200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetConversationMessages200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetConversationMessages200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageGetConversationMessages200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
      }

      JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
      // validate the required field `members` (array)
      for (int i = 0; i < jsonArraymembers.size(); i++) {
        CoreMessageGetConversationBetweenUsers200ResponseMembersInner.validateJsonElement(jsonArraymembers.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.validateJsonElement(jsonArraymessages.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetConversationMessages200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetConversationMessages200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetConversationMessages200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetConversationMessages200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetConversationMessages200Response>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetConversationMessages200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetConversationMessages200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetConversationMessages200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetConversationMessages200Response
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetConversationMessages200Response
  */
  public static CoreMessageGetConversationMessages200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetConversationMessages200Response.class);
  }

 /**
  * Convert an instance of CoreMessageGetConversationMessages200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


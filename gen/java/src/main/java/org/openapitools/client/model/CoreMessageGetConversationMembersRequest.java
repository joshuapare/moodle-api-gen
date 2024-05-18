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
 * CoreMessageGetConversationMembersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMessageGetConversationMembersRequest {
  public static final String SERIALIZED_NAME_CONVERSATIONID = "conversationid";
  @SerializedName(SERIALIZED_NAME_CONVERSATIONID)
  private Integer conversationid;

  public static final String SERIALIZED_NAME_INCLUDECONTACTREQUESTS = "includecontactrequests";
  @SerializedName(SERIALIZED_NAME_INCLUDECONTACTREQUESTS)
  private Boolean includecontactrequests = false;

  public static final String SERIALIZED_NAME_INCLUDEPRIVACYINFO = "includeprivacyinfo";
  @SerializedName(SERIALIZED_NAME_INCLUDEPRIVACYINFO)
  private Boolean includeprivacyinfo = false;

  public static final String SERIALIZED_NAME_LIMITFROM = "limitfrom";
  @SerializedName(SERIALIZED_NAME_LIMITFROM)
  private Integer limitfrom = 0;

  public static final String SERIALIZED_NAME_LIMITNUM = "limitnum";
  @SerializedName(SERIALIZED_NAME_LIMITNUM)
  private Integer limitnum = 0;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public CoreMessageGetConversationMembersRequest() {
  }

  public CoreMessageGetConversationMembersRequest conversationid(Integer conversationid) {
    this.conversationid = conversationid;
    return this;
  }

   /**
   * The id of the conversation
   * @return conversationid
  **/
  @javax.annotation.Nonnull
  public Integer getConversationid() {
    return conversationid;
  }

  public void setConversationid(Integer conversationid) {
    this.conversationid = conversationid;
  }


  public CoreMessageGetConversationMembersRequest includecontactrequests(Boolean includecontactrequests) {
    this.includecontactrequests = includecontactrequests;
    return this;
  }

   /**
   * Do we want to include contact requests?
   * @return includecontactrequests
  **/
  @javax.annotation.Nullable
  public Boolean getIncludecontactrequests() {
    return includecontactrequests;
  }

  public void setIncludecontactrequests(Boolean includecontactrequests) {
    this.includecontactrequests = includecontactrequests;
  }


  public CoreMessageGetConversationMembersRequest includeprivacyinfo(Boolean includeprivacyinfo) {
    this.includeprivacyinfo = includeprivacyinfo;
    return this;
  }

   /**
   * Do we want to include privacy info?
   * @return includeprivacyinfo
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeprivacyinfo() {
    return includeprivacyinfo;
  }

  public void setIncludeprivacyinfo(Boolean includeprivacyinfo) {
    this.includeprivacyinfo = includeprivacyinfo;
  }


  public CoreMessageGetConversationMembersRequest limitfrom(Integer limitfrom) {
    this.limitfrom = limitfrom;
    return this;
  }

   /**
   * Limit from
   * @return limitfrom
  **/
  @javax.annotation.Nullable
  public Integer getLimitfrom() {
    return limitfrom;
  }

  public void setLimitfrom(Integer limitfrom) {
    this.limitfrom = limitfrom;
  }


  public CoreMessageGetConversationMembersRequest limitnum(Integer limitnum) {
    this.limitnum = limitnum;
    return this;
  }

   /**
   * Limit number
   * @return limitnum
  **/
  @javax.annotation.Nullable
  public Integer getLimitnum() {
    return limitnum;
  }

  public void setLimitnum(Integer limitnum) {
    this.limitnum = limitnum;
  }


  public CoreMessageGetConversationMembersRequest userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The id of the user we are performing this action on behalf of
   * @return userid
  **/
  @javax.annotation.Nonnull
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreMessageGetConversationMembersRequest coreMessageGetConversationMembersRequest = (CoreMessageGetConversationMembersRequest) o;
    return Objects.equals(this.conversationid, coreMessageGetConversationMembersRequest.conversationid) &&
        Objects.equals(this.includecontactrequests, coreMessageGetConversationMembersRequest.includecontactrequests) &&
        Objects.equals(this.includeprivacyinfo, coreMessageGetConversationMembersRequest.includeprivacyinfo) &&
        Objects.equals(this.limitfrom, coreMessageGetConversationMembersRequest.limitfrom) &&
        Objects.equals(this.limitnum, coreMessageGetConversationMembersRequest.limitnum) &&
        Objects.equals(this.userid, coreMessageGetConversationMembersRequest.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationid, includecontactrequests, includeprivacyinfo, limitfrom, limitnum, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMessageGetConversationMembersRequest {\n");
    sb.append("    conversationid: ").append(toIndentedString(conversationid)).append("\n");
    sb.append("    includecontactrequests: ").append(toIndentedString(includecontactrequests)).append("\n");
    sb.append("    includeprivacyinfo: ").append(toIndentedString(includeprivacyinfo)).append("\n");
    sb.append("    limitfrom: ").append(toIndentedString(limitfrom)).append("\n");
    sb.append("    limitnum: ").append(toIndentedString(limitnum)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
    openapiFields.add("conversationid");
    openapiFields.add("includecontactrequests");
    openapiFields.add("includeprivacyinfo");
    openapiFields.add("limitfrom");
    openapiFields.add("limitnum");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("conversationid");
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMessageGetConversationMembersRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMessageGetConversationMembersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMessageGetConversationMembersRequest is not found in the empty JSON string", CoreMessageGetConversationMembersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMessageGetConversationMembersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMessageGetConversationMembersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMessageGetConversationMembersRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreMessageGetConversationMembersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMessageGetConversationMembersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMessageGetConversationMembersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMessageGetConversationMembersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMessageGetConversationMembersRequest>() {
           @Override
           public void write(JsonWriter out, CoreMessageGetConversationMembersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMessageGetConversationMembersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMessageGetConversationMembersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMessageGetConversationMembersRequest
  * @throws IOException if the JSON string is invalid with respect to CoreMessageGetConversationMembersRequest
  */
  public static CoreMessageGetConversationMembersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMessageGetConversationMembersRequest.class);
  }

 /**
  * Convert an instance of CoreMessageGetConversationMembersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

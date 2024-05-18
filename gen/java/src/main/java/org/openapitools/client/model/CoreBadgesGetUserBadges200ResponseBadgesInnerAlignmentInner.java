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
 * CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {
  public static final String SERIALIZED_NAME_BADGEID = "badgeid";
  @SerializedName(SERIALIZED_NAME_BADGEID)
  private Integer badgeid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TARGET_CODE = "targetCode";
  @SerializedName(SERIALIZED_NAME_TARGET_CODE)
  private String targetCode;

  public static final String SERIALIZED_NAME_TARGET_DESCRIPTION = "targetDescription";
  @SerializedName(SERIALIZED_NAME_TARGET_DESCRIPTION)
  private String targetDescription;

  public static final String SERIALIZED_NAME_TARGET_FRAMEWORK = "targetFramework";
  @SerializedName(SERIALIZED_NAME_TARGET_FRAMEWORK)
  private String targetFramework;

  public static final String SERIALIZED_NAME_TARGET_NAME = "targetName";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TARGET_URL = "targetUrl";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl;

  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner() {
  }

  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner badgeid(Integer badgeid) {
    this.badgeid = badgeid;
    return this;
  }

   /**
   * Badge id
   * @return badgeid
  **/
  @javax.annotation.Nullable
  public Integer getBadgeid() {
    return badgeid;
  }

  public void setBadgeid(Integer badgeid) {
    this.badgeid = badgeid;
  }


  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Alignment id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner targetCode(String targetCode) {
    this.targetCode = targetCode;
    return this;
  }

   /**
   * Target code
   * @return targetCode
  **/
  @javax.annotation.Nullable
  public String getTargetCode() {
    return targetCode;
  }

  public void setTargetCode(String targetCode) {
    this.targetCode = targetCode;
  }


  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner targetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
  }

   /**
   * Target description
   * @return targetDescription
  **/
  @javax.annotation.Nullable
  public String getTargetDescription() {
    return targetDescription;
  }

  public void setTargetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
  }


  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner targetFramework(String targetFramework) {
    this.targetFramework = targetFramework;
    return this;
  }

   /**
   * Target framework
   * @return targetFramework
  **/
  @javax.annotation.Nullable
  public String getTargetFramework() {
    return targetFramework;
  }

  public void setTargetFramework(String targetFramework) {
    this.targetFramework = targetFramework;
  }


  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Target URL
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner = (CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner) o;
    return Objects.equals(this.badgeid, coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.badgeid) &&
        Objects.equals(this.id, coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.id) &&
        Objects.equals(this.targetCode, coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.targetCode) &&
        Objects.equals(this.targetDescription, coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.targetDescription) &&
        Objects.equals(this.targetFramework, coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.targetFramework) &&
        Objects.equals(this.targetName, coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.targetName) &&
        Objects.equals(this.targetUrl, coreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.targetUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeid, id, targetCode, targetDescription, targetFramework, targetName, targetUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner {\n");
    sb.append("    badgeid: ").append(toIndentedString(badgeid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetCode: ").append(toIndentedString(targetCode)).append("\n");
    sb.append("    targetDescription: ").append(toIndentedString(targetDescription)).append("\n");
    sb.append("    targetFramework: ").append(toIndentedString(targetFramework)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
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
    openapiFields.add("badgeid");
    openapiFields.add("id");
    openapiFields.add("targetCode");
    openapiFields.add("targetDescription");
    openapiFields.add("targetFramework");
    openapiFields.add("targetName");
    openapiFields.add("targetUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner is not found in the empty JSON string", CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("targetCode") != null && !jsonObj.get("targetCode").isJsonNull()) && !jsonObj.get("targetCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetCode").toString()));
      }
      if ((jsonObj.get("targetDescription") != null && !jsonObj.get("targetDescription").isJsonNull()) && !jsonObj.get("targetDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetDescription").toString()));
      }
      if ((jsonObj.get("targetFramework") != null && !jsonObj.get("targetFramework").isJsonNull()) && !jsonObj.get("targetFramework").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetFramework` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetFramework").toString()));
      }
      if ((jsonObj.get("targetName") != null && !jsonObj.get("targetName").isJsonNull()) && !jsonObj.get("targetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetName").toString()));
      }
      if ((jsonObj.get("targetUrl") != null && !jsonObj.get("targetUrl").isJsonNull()) && !jsonObj.get("targetUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner>() {
           @Override
           public void write(JsonWriter out, CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
  * @throws IOException if the JSON string is invalid with respect to CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner
  */
  public static CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.class);
  }

 /**
  * Convert an instance of CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

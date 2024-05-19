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
 * ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls {
  public static final String SERIALIZED_NAME_ACCESSTOKEN = "accesstoken";
  @SerializedName(SERIALIZED_NAME_ACCESSTOKEN)
  private String accesstoken;

  public static final String SERIALIZED_NAME_AUTHREQUEST = "authrequest";
  @SerializedName(SERIALIZED_NAME_AUTHREQUEST)
  private String authrequest;

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private String course;

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  private String edit;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_PUBLICKEYSET = "publickeyset";
  @SerializedName(SERIALIZED_NAME_PUBLICKEYSET)
  private String publickeyset;

  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls() {
  }

  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls accesstoken(String accesstoken) {
    this.accesstoken = accesstoken;
    return this;
  }

   /**
   * Access Token URL
   * @return accesstoken
  **/
  @javax.annotation.Nonnull
  public String getAccesstoken() {
    return accesstoken;
  }

  public void setAccesstoken(String accesstoken) {
    this.accesstoken = accesstoken;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls authrequest(String authrequest) {
    this.authrequest = authrequest;
    return this;
  }

   /**
   * Authorisation Request URL
   * @return authrequest
  **/
  @javax.annotation.Nonnull
  public String getAuthrequest() {
    return authrequest;
  }

  public void setAuthrequest(String authrequest) {
    this.authrequest = authrequest;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls course(String course) {
    this.course = course;
    return this;
  }

   /**
   * Tool type edit URL
   * @return course
  **/
  @javax.annotation.Nullable
  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls edit(String edit) {
    this.edit = edit;
    return this;
  }

   /**
   * Tool type edit URL
   * @return edit
  **/
  @javax.annotation.Nonnull
  public String getEdit() {
    return edit;
  }

  public void setEdit(String edit) {
    this.edit = edit;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Tool type icon URL
   * @return icon
  **/
  @javax.annotation.Nonnull
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls publickeyset(String publickeyset) {
    this.publickeyset = publickeyset;
    return this;
  }

   /**
   * Public Keyset URL
   * @return publickeyset
  **/
  @javax.annotation.Nonnull
  public String getPublickeyset() {
    return publickeyset;
  }

  public void setPublickeyset(String publickeyset) {
    this.publickeyset = publickeyset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls modLtiGetToolTypesAndProxies200ResponseTypesInnerUrls = (ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls) o;
    return Objects.equals(this.accesstoken, modLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.accesstoken) &&
        Objects.equals(this.authrequest, modLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.authrequest) &&
        Objects.equals(this.course, modLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.course) &&
        Objects.equals(this.edit, modLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.edit) &&
        Objects.equals(this.icon, modLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.icon) &&
        Objects.equals(this.publickeyset, modLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.publickeyset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesstoken, authrequest, course, edit, icon, publickeyset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls {\n");
    sb.append("    accesstoken: ").append(toIndentedString(accesstoken)).append("\n");
    sb.append("    authrequest: ").append(toIndentedString(authrequest)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    publickeyset: ").append(toIndentedString(publickeyset)).append("\n");
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
    openapiFields.add("accesstoken");
    openapiFields.add("authrequest");
    openapiFields.add("course");
    openapiFields.add("edit");
    openapiFields.add("icon");
    openapiFields.add("publickeyset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accesstoken");
    openapiRequiredFields.add("authrequest");
    openapiRequiredFields.add("edit");
    openapiRequiredFields.add("icon");
    openapiRequiredFields.add("publickeyset");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls is not found in the empty JSON string", ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accesstoken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accesstoken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accesstoken").toString()));
      }
      if (!jsonObj.get("authrequest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authrequest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authrequest").toString()));
      }
      if ((jsonObj.get("course") != null && !jsonObj.get("course").isJsonNull()) && !jsonObj.get("course").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `course` to be a primitive type in the JSON string but got `%s`", jsonObj.get("course").toString()));
      }
      if (!jsonObj.get("edit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edit").toString()));
      }
      if (!jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (!jsonObj.get("publickeyset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publickeyset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publickeyset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.class));

       return (TypeAdapter<T>) new TypeAdapter<ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls>() {
           @Override
           public void write(JsonWriter out, ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls
  * @throws IOException if the JSON string is invalid with respect to ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls
  */
  public static ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.class);
  }

 /**
  * Convert an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


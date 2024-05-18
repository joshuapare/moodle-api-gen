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
 * CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner {
  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_PROFILEIMAGE = "profileimage";
  @SerializedName(SERIALIZED_NAME_PROFILEIMAGE)
  private String profileimage = "null";

  public CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner() {
  }

  public CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * The first name(s) of the user
   * @return firstname
  **/
  @javax.annotation.Nullable
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * The full name of the user
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the user
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * The family name of the user
   * @return lastname
  **/
  @javax.annotation.Nullable
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner profileimage(String profileimage) {
    this.profileimage = profileimage;
    return this;
  }

   /**
   * The location of the users larger image
   * @return profileimage
  **/
  @javax.annotation.Nullable
  public String getProfileimage() {
    return profileimage;
  }

  public void setProfileimage(String profileimage) {
    this.profileimage = profileimage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner coreCourseGetEnrolledUsersByCmid200ResponseUsersInner = (CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner) o;
    return Objects.equals(this.firstname, coreCourseGetEnrolledUsersByCmid200ResponseUsersInner.firstname) &&
        Objects.equals(this.fullname, coreCourseGetEnrolledUsersByCmid200ResponseUsersInner.fullname) &&
        Objects.equals(this.id, coreCourseGetEnrolledUsersByCmid200ResponseUsersInner.id) &&
        Objects.equals(this.lastname, coreCourseGetEnrolledUsersByCmid200ResponseUsersInner.lastname) &&
        Objects.equals(this.profileimage, coreCourseGetEnrolledUsersByCmid200ResponseUsersInner.profileimage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, fullname, id, lastname, profileimage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner {\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    profileimage: ").append(toIndentedString(profileimage)).append("\n");
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
    openapiFields.add("firstname");
    openapiFields.add("fullname");
    openapiFields.add("id");
    openapiFields.add("lastname");
    openapiFields.add("profileimage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner is not found in the empty JSON string", CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("firstname") != null && !jsonObj.get("firstname").isJsonNull()) && !jsonObj.get("firstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstname").toString()));
      }
      if ((jsonObj.get("fullname") != null && !jsonObj.get("fullname").isJsonNull()) && !jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if ((jsonObj.get("lastname") != null && !jsonObj.get("lastname").isJsonNull()) && !jsonObj.get("lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
      if ((jsonObj.get("profileimage") != null && !jsonObj.get("profileimage").isJsonNull()) && !jsonObj.get("profileimage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileimage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileimage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner>() {
           @Override
           public void write(JsonWriter out, CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner
  * @throws IOException if the JSON string is invalid with respect to CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner
  */
  public static CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.class);
  }

 /**
  * Convert an instance of CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

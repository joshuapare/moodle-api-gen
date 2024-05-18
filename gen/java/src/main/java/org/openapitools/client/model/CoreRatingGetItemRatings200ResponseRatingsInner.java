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
 * Rating
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreRatingGetItemRatings200ResponseRatingsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private String rating = "null";

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified = null;

  public static final String SERIALIZED_NAME_USERFULLNAME = "userfullname";
  @SerializedName(SERIALIZED_NAME_USERFULLNAME)
  private String userfullname = "null";

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_USERPICTUREURL = "userpictureurl";
  @SerializedName(SERIALIZED_NAME_USERPICTUREURL)
  private String userpictureurl = "null";

  public CoreRatingGetItemRatings200ResponseRatingsInner() {
  }

  public CoreRatingGetItemRatings200ResponseRatingsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * rating id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreRatingGetItemRatings200ResponseRatingsInner rating(String rating) {
    this.rating = rating;
    return this;
  }

   /**
   * rating on scale
   * @return rating
  **/
  @javax.annotation.Nullable
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }


  public CoreRatingGetItemRatings200ResponseRatingsInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * time modified (timestamp)
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public CoreRatingGetItemRatings200ResponseRatingsInner userfullname(String userfullname) {
    this.userfullname = userfullname;
    return this;
  }

   /**
   * user fullname
   * @return userfullname
  **/
  @javax.annotation.Nullable
  public String getUserfullname() {
    return userfullname;
  }

  public void setUserfullname(String userfullname) {
    this.userfullname = userfullname;
  }


  public CoreRatingGetItemRatings200ResponseRatingsInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * user id
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public CoreRatingGetItemRatings200ResponseRatingsInner userpictureurl(String userpictureurl) {
    this.userpictureurl = userpictureurl;
    return this;
  }

   /**
   * URL user picture
   * @return userpictureurl
  **/
  @javax.annotation.Nullable
  public String getUserpictureurl() {
    return userpictureurl;
  }

  public void setUserpictureurl(String userpictureurl) {
    this.userpictureurl = userpictureurl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreRatingGetItemRatings200ResponseRatingsInner coreRatingGetItemRatings200ResponseRatingsInner = (CoreRatingGetItemRatings200ResponseRatingsInner) o;
    return Objects.equals(this.id, coreRatingGetItemRatings200ResponseRatingsInner.id) &&
        Objects.equals(this.rating, coreRatingGetItemRatings200ResponseRatingsInner.rating) &&
        Objects.equals(this.timemodified, coreRatingGetItemRatings200ResponseRatingsInner.timemodified) &&
        Objects.equals(this.userfullname, coreRatingGetItemRatings200ResponseRatingsInner.userfullname) &&
        Objects.equals(this.userid, coreRatingGetItemRatings200ResponseRatingsInner.userid) &&
        Objects.equals(this.userpictureurl, coreRatingGetItemRatings200ResponseRatingsInner.userpictureurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rating, timemodified, userfullname, userid, userpictureurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreRatingGetItemRatings200ResponseRatingsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    userfullname: ").append(toIndentedString(userfullname)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    userpictureurl: ").append(toIndentedString(userpictureurl)).append("\n");
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
    openapiFields.add("rating");
    openapiFields.add("timemodified");
    openapiFields.add("userfullname");
    openapiFields.add("userid");
    openapiFields.add("userpictureurl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreRatingGetItemRatings200ResponseRatingsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreRatingGetItemRatings200ResponseRatingsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreRatingGetItemRatings200ResponseRatingsInner is not found in the empty JSON string", CoreRatingGetItemRatings200ResponseRatingsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreRatingGetItemRatings200ResponseRatingsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreRatingGetItemRatings200ResponseRatingsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("rating") != null && !jsonObj.get("rating").isJsonNull()) && !jsonObj.get("rating").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rating` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rating").toString()));
      }
      if ((jsonObj.get("userfullname") != null && !jsonObj.get("userfullname").isJsonNull()) && !jsonObj.get("userfullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userfullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userfullname").toString()));
      }
      if ((jsonObj.get("userpictureurl") != null && !jsonObj.get("userpictureurl").isJsonNull()) && !jsonObj.get("userpictureurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userpictureurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userpictureurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreRatingGetItemRatings200ResponseRatingsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreRatingGetItemRatings200ResponseRatingsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreRatingGetItemRatings200ResponseRatingsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreRatingGetItemRatings200ResponseRatingsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreRatingGetItemRatings200ResponseRatingsInner>() {
           @Override
           public void write(JsonWriter out, CoreRatingGetItemRatings200ResponseRatingsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreRatingGetItemRatings200ResponseRatingsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreRatingGetItemRatings200ResponseRatingsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreRatingGetItemRatings200ResponseRatingsInner
  * @throws IOException if the JSON string is invalid with respect to CoreRatingGetItemRatings200ResponseRatingsInner
  */
  public static CoreRatingGetItemRatings200ResponseRatingsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreRatingGetItemRatings200ResponseRatingsInner.class);
  }

 /**
  * Convert an instance of CoreRatingGetItemRatings200ResponseRatingsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

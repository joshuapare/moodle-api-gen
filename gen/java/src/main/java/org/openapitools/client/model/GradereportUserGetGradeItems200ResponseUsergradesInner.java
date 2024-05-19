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
import org.openapitools.client.model.GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner;

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
 * GradereportUserGetGradeItems200ResponseUsergradesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class GradereportUserGetGradeItems200ResponseUsergradesInner {
  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_COURSEIDNUMBER = "courseidnumber";
  @SerializedName(SERIALIZED_NAME_COURSEIDNUMBER)
  private String courseidnumber = "null";

  public static final String SERIALIZED_NAME_GRADEITEMS = "gradeitems";
  @SerializedName(SERIALIZED_NAME_GRADEITEMS)
  private List<GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner> gradeitems = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAXDEPTH = "maxdepth";
  @SerializedName(SERIALIZED_NAME_MAXDEPTH)
  private Integer maxdepth = null;

  public static final String SERIALIZED_NAME_USERFULLNAME = "userfullname";
  @SerializedName(SERIALIZED_NAME_USERFULLNAME)
  private String userfullname;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_USERIDNUMBER = "useridnumber";
  @SerializedName(SERIALIZED_NAME_USERIDNUMBER)
  private String useridnumber = "null";

  public GradereportUserGetGradeItems200ResponseUsergradesInner() {
  }

  public GradereportUserGetGradeItems200ResponseUsergradesInner courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * course id
   * @return courseid
  **/
  @javax.annotation.Nullable
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }


  public GradereportUserGetGradeItems200ResponseUsergradesInner courseidnumber(String courseidnumber) {
    this.courseidnumber = courseidnumber;
    return this;
  }

   /**
   * course idnumber
   * @return courseidnumber
  **/
  @javax.annotation.Nullable
  public String getCourseidnumber() {
    return courseidnumber;
  }

  public void setCourseidnumber(String courseidnumber) {
    this.courseidnumber = courseidnumber;
  }


  public GradereportUserGetGradeItems200ResponseUsergradesInner gradeitems(List<GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner> gradeitems) {
    this.gradeitems = gradeitems;
    return this;
  }

  public GradereportUserGetGradeItems200ResponseUsergradesInner addGradeitemsItem(GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner gradeitemsItem) {
    if (this.gradeitems == null) {
      this.gradeitems = new ArrayList<>();
    }
    this.gradeitems.add(gradeitemsItem);
    return this;
  }

   /**
   * Get gradeitems
   * @return gradeitems
  **/
  @javax.annotation.Nullable
  public List<GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner> getGradeitems() {
    return gradeitems;
  }

  public void setGradeitems(List<GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner> gradeitems) {
    this.gradeitems = gradeitems;
  }


  public GradereportUserGetGradeItems200ResponseUsergradesInner maxdepth(Integer maxdepth) {
    this.maxdepth = maxdepth;
    return this;
  }

   /**
   * table max depth (needed for printing it)
   * @return maxdepth
  **/
  @javax.annotation.Nullable
  public Integer getMaxdepth() {
    return maxdepth;
  }

  public void setMaxdepth(Integer maxdepth) {
    this.maxdepth = maxdepth;
  }


  public GradereportUserGetGradeItems200ResponseUsergradesInner userfullname(String userfullname) {
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


  public GradereportUserGetGradeItems200ResponseUsergradesInner userid(Integer userid) {
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


  public GradereportUserGetGradeItems200ResponseUsergradesInner useridnumber(String useridnumber) {
    this.useridnumber = useridnumber;
    return this;
  }

   /**
   * user idnumber
   * @return useridnumber
  **/
  @javax.annotation.Nullable
  public String getUseridnumber() {
    return useridnumber;
  }

  public void setUseridnumber(String useridnumber) {
    this.useridnumber = useridnumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradereportUserGetGradeItems200ResponseUsergradesInner gradereportUserGetGradeItems200ResponseUsergradesInner = (GradereportUserGetGradeItems200ResponseUsergradesInner) o;
    return Objects.equals(this.courseid, gradereportUserGetGradeItems200ResponseUsergradesInner.courseid) &&
        Objects.equals(this.courseidnumber, gradereportUserGetGradeItems200ResponseUsergradesInner.courseidnumber) &&
        Objects.equals(this.gradeitems, gradereportUserGetGradeItems200ResponseUsergradesInner.gradeitems) &&
        Objects.equals(this.maxdepth, gradereportUserGetGradeItems200ResponseUsergradesInner.maxdepth) &&
        Objects.equals(this.userfullname, gradereportUserGetGradeItems200ResponseUsergradesInner.userfullname) &&
        Objects.equals(this.userid, gradereportUserGetGradeItems200ResponseUsergradesInner.userid) &&
        Objects.equals(this.useridnumber, gradereportUserGetGradeItems200ResponseUsergradesInner.useridnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseid, courseidnumber, gradeitems, maxdepth, userfullname, userid, useridnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradereportUserGetGradeItems200ResponseUsergradesInner {\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    courseidnumber: ").append(toIndentedString(courseidnumber)).append("\n");
    sb.append("    gradeitems: ").append(toIndentedString(gradeitems)).append("\n");
    sb.append("    maxdepth: ").append(toIndentedString(maxdepth)).append("\n");
    sb.append("    userfullname: ").append(toIndentedString(userfullname)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    useridnumber: ").append(toIndentedString(useridnumber)).append("\n");
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
    openapiFields.add("courseid");
    openapiFields.add("courseidnumber");
    openapiFields.add("gradeitems");
    openapiFields.add("maxdepth");
    openapiFields.add("userfullname");
    openapiFields.add("userid");
    openapiFields.add("useridnumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GradereportUserGetGradeItems200ResponseUsergradesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GradereportUserGetGradeItems200ResponseUsergradesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GradereportUserGetGradeItems200ResponseUsergradesInner is not found in the empty JSON string", GradereportUserGetGradeItems200ResponseUsergradesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GradereportUserGetGradeItems200ResponseUsergradesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GradereportUserGetGradeItems200ResponseUsergradesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("courseidnumber") != null && !jsonObj.get("courseidnumber").isJsonNull()) && !jsonObj.get("courseidnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `courseidnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("courseidnumber").toString()));
      }
      if (jsonObj.get("gradeitems") != null && !jsonObj.get("gradeitems").isJsonNull()) {
        JsonArray jsonArraygradeitems = jsonObj.getAsJsonArray("gradeitems");
        if (jsonArraygradeitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("gradeitems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `gradeitems` to be an array in the JSON string but got `%s`", jsonObj.get("gradeitems").toString()));
          }

          // validate the optional field `gradeitems` (array)
          for (int i = 0; i < jsonArraygradeitems.size(); i++) {
            GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.validateJsonElement(jsonArraygradeitems.get(i));
          };
        }
      }
      if ((jsonObj.get("userfullname") != null && !jsonObj.get("userfullname").isJsonNull()) && !jsonObj.get("userfullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userfullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userfullname").toString()));
      }
      if ((jsonObj.get("useridnumber") != null && !jsonObj.get("useridnumber").isJsonNull()) && !jsonObj.get("useridnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `useridnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("useridnumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GradereportUserGetGradeItems200ResponseUsergradesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GradereportUserGetGradeItems200ResponseUsergradesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GradereportUserGetGradeItems200ResponseUsergradesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GradereportUserGetGradeItems200ResponseUsergradesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GradereportUserGetGradeItems200ResponseUsergradesInner>() {
           @Override
           public void write(JsonWriter out, GradereportUserGetGradeItems200ResponseUsergradesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GradereportUserGetGradeItems200ResponseUsergradesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GradereportUserGetGradeItems200ResponseUsergradesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GradereportUserGetGradeItems200ResponseUsergradesInner
  * @throws IOException if the JSON string is invalid with respect to GradereportUserGetGradeItems200ResponseUsergradesInner
  */
  public static GradereportUserGetGradeItems200ResponseUsergradesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GradereportUserGetGradeItems200ResponseUsergradesInner.class);
  }

 /**
  * Convert an instance of GradereportUserGetGradeItems200ResponseUsergradesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


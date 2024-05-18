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
import org.openapitools.client.model.GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner;

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
 * GradereportUserGetGradesTable200ResponseTablesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class GradereportUserGetGradesTable200ResponseTablesInner {
  public static final String SERIALIZED_NAME_COURSEID = "courseid";
  @SerializedName(SERIALIZED_NAME_COURSEID)
  private Integer courseid;

  public static final String SERIALIZED_NAME_MAXDEPTH = "maxdepth";
  @SerializedName(SERIALIZED_NAME_MAXDEPTH)
  private Integer maxdepth;

  public static final String SERIALIZED_NAME_TABLEDATA = "tabledata";
  @SerializedName(SERIALIZED_NAME_TABLEDATA)
  private List<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner> tabledata = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERFULLNAME = "userfullname";
  @SerializedName(SERIALIZED_NAME_USERFULLNAME)
  private String userfullname;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public GradereportUserGetGradesTable200ResponseTablesInner() {
  }

  public GradereportUserGetGradesTable200ResponseTablesInner courseid(Integer courseid) {
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


  public GradereportUserGetGradesTable200ResponseTablesInner maxdepth(Integer maxdepth) {
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


  public GradereportUserGetGradesTable200ResponseTablesInner tabledata(List<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner> tabledata) {
    this.tabledata = tabledata;
    return this;
  }

  public GradereportUserGetGradesTable200ResponseTablesInner addTabledataItem(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner tabledataItem) {
    if (this.tabledata == null) {
      this.tabledata = new ArrayList<>();
    }
    this.tabledata.add(tabledataItem);
    return this;
  }

   /**
   * Get tabledata
   * @return tabledata
  **/
  @javax.annotation.Nullable
  public List<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner> getTabledata() {
    return tabledata;
  }

  public void setTabledata(List<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner> tabledata) {
    this.tabledata = tabledata;
  }


  public GradereportUserGetGradesTable200ResponseTablesInner userfullname(String userfullname) {
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


  public GradereportUserGetGradesTable200ResponseTablesInner userid(Integer userid) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradereportUserGetGradesTable200ResponseTablesInner gradereportUserGetGradesTable200ResponseTablesInner = (GradereportUserGetGradesTable200ResponseTablesInner) o;
    return Objects.equals(this.courseid, gradereportUserGetGradesTable200ResponseTablesInner.courseid) &&
        Objects.equals(this.maxdepth, gradereportUserGetGradesTable200ResponseTablesInner.maxdepth) &&
        Objects.equals(this.tabledata, gradereportUserGetGradesTable200ResponseTablesInner.tabledata) &&
        Objects.equals(this.userfullname, gradereportUserGetGradesTable200ResponseTablesInner.userfullname) &&
        Objects.equals(this.userid, gradereportUserGetGradesTable200ResponseTablesInner.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseid, maxdepth, tabledata, userfullname, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradereportUserGetGradesTable200ResponseTablesInner {\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    maxdepth: ").append(toIndentedString(maxdepth)).append("\n");
    sb.append("    tabledata: ").append(toIndentedString(tabledata)).append("\n");
    sb.append("    userfullname: ").append(toIndentedString(userfullname)).append("\n");
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
    openapiFields.add("courseid");
    openapiFields.add("maxdepth");
    openapiFields.add("tabledata");
    openapiFields.add("userfullname");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GradereportUserGetGradesTable200ResponseTablesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GradereportUserGetGradesTable200ResponseTablesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GradereportUserGetGradesTable200ResponseTablesInner is not found in the empty JSON string", GradereportUserGetGradesTable200ResponseTablesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GradereportUserGetGradesTable200ResponseTablesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GradereportUserGetGradesTable200ResponseTablesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("tabledata") != null && !jsonObj.get("tabledata").isJsonNull()) {
        JsonArray jsonArraytabledata = jsonObj.getAsJsonArray("tabledata");
        if (jsonArraytabledata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tabledata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tabledata` to be an array in the JSON string but got `%s`", jsonObj.get("tabledata").toString()));
          }

          // validate the optional field `tabledata` (array)
          for (int i = 0; i < jsonArraytabledata.size(); i++) {
            GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.validateJsonElement(jsonArraytabledata.get(i));
          };
        }
      }
      if ((jsonObj.get("userfullname") != null && !jsonObj.get("userfullname").isJsonNull()) && !jsonObj.get("userfullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userfullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userfullname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GradereportUserGetGradesTable200ResponseTablesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GradereportUserGetGradesTable200ResponseTablesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GradereportUserGetGradesTable200ResponseTablesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GradereportUserGetGradesTable200ResponseTablesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GradereportUserGetGradesTable200ResponseTablesInner>() {
           @Override
           public void write(JsonWriter out, GradereportUserGetGradesTable200ResponseTablesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GradereportUserGetGradesTable200ResponseTablesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GradereportUserGetGradesTable200ResponseTablesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GradereportUserGetGradesTable200ResponseTablesInner
  * @throws IOException if the JSON string is invalid with respect to GradereportUserGetGradesTable200ResponseTablesInner
  */
  public static GradereportUserGetGradesTable200ResponseTablesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GradereportUserGetGradesTable200ResponseTablesInner.class);
  }

 /**
  * Convert an instance of GradereportUserGetGradesTable200ResponseTablesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


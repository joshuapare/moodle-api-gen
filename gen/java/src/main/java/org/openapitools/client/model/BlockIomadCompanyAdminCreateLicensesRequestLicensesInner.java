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
import org.openapitools.client.model.BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner;

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
 * one or many licenses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminCreateLicensesRequestLicensesInner {
  public static final String SERIALIZED_NAME_ALLOCATION = "allocation";
  @SerializedName(SERIALIZED_NAME_ALLOCATION)
  private Integer allocation = null;

  public static final String SERIALIZED_NAME_CLEARONEXPIRE = "clearonexpire";
  @SerializedName(SERIALIZED_NAME_CLEARONEXPIRE)
  private Integer clearonexpire = null;

  public static final String SERIALIZED_NAME_COMPANYID = "companyid";
  @SerializedName(SERIALIZED_NAME_COMPANYID)
  private Integer companyid = null;

  public static final String SERIALIZED_NAME_COURSES = "courses";
  @SerializedName(SERIALIZED_NAME_COURSES)
  private List<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner> courses = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUTOFFDATE = "cutoffdate";
  @SerializedName(SERIALIZED_NAME_CUTOFFDATE)
  private Integer cutoffdate = null;

  public static final String SERIALIZED_NAME_EXPIRYDATE = "expirydate";
  @SerializedName(SERIALIZED_NAME_EXPIRYDATE)
  private Integer expirydate = null;

  public static final String SERIALIZED_NAME_INSTANT = "instant";
  @SerializedName(SERIALIZED_NAME_INSTANT)
  private Integer instant = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PARENTID = "parentid";
  @SerializedName(SERIALIZED_NAME_PARENTID)
  private Integer parentid = null;

  public static final String SERIALIZED_NAME_PROGRAM = "program";
  @SerializedName(SERIALIZED_NAME_PROGRAM)
  private Integer program = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference = "null";

  public static final String SERIALIZED_NAME_STARTDATE = "startdate";
  @SerializedName(SERIALIZED_NAME_STARTDATE)
  private Integer startdate = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type = null;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Integer used = null;

  public static final String SERIALIZED_NAME_VALIDLENGTH = "validlength";
  @SerializedName(SERIALIZED_NAME_VALIDLENGTH)
  private Integer validlength = null;

  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner() {
  }

  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner allocation(Integer allocation) {
    this.allocation = allocation;
    return this;
  }

   /**
   * Number of license slots
   * @return allocation
  **/
  @javax.annotation.Nullable
  public Integer getAllocation() {
    return allocation;
  }

  public void setAllocation(Integer allocation) {
    this.allocation = allocation;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner clearonexpire(Integer clearonexpire) {
    this.clearonexpire = clearonexpire;
    return this;
  }

   /**
   * Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes
   * @return clearonexpire
  **/
  @javax.annotation.Nullable
  public Integer getClearonexpire() {
    return clearonexpire;
  }

  public void setClearonexpire(Integer clearonexpire) {
    this.clearonexpire = clearonexpire;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner companyid(Integer companyid) {
    this.companyid = companyid;
    return this;
  }

   /**
   * Company id
   * @return companyid
  **/
  @javax.annotation.Nullable
  public Integer getCompanyid() {
    return companyid;
  }

  public void setCompanyid(Integer companyid) {
    this.companyid = companyid;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner courses(List<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner> courses) {
    this.courses = courses;
    return this;
  }

  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner addCoursesItem(BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner coursesItem) {
    if (this.courses == null) {
      this.courses = new ArrayList<>();
    }
    this.courses.add(coursesItem);
    return this;
  }

   /**
   * Get courses
   * @return courses
  **/
  @javax.annotation.Nullable
  public List<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner> getCourses() {
    return courses;
  }

  public void setCourses(List<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner> courses) {
    this.courses = courses;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner cutoffdate(Integer cutoffdate) {
    this.cutoffdate = cutoffdate;
    return this;
  }

   /**
   * License cut off date (int &#x3D; timestamp)
   * @return cutoffdate
  **/
  @javax.annotation.Nullable
  public Integer getCutoffdate() {
    return cutoffdate;
  }

  public void setCutoffdate(Integer cutoffdate) {
    this.cutoffdate = cutoffdate;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner expirydate(Integer expirydate) {
    this.expirydate = expirydate;
    return this;
  }

   /**
   * License expiry date (int &#x3D; timestamp)
   * @return expirydate
  **/
  @javax.annotation.Nullable
  public Integer getExpirydate() {
    return expirydate;
  }

  public void setExpirydate(Integer expirydate) {
    this.expirydate = expirydate;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner instant(Integer instant) {
    this.instant = instant;
    return this;
  }

   /**
   * Instant access - 0 &#x3D; no, 1 &#x3D; yes
   * @return instant
  **/
  @javax.annotation.Nullable
  public Integer getInstant() {
    return instant;
  }

  public void setInstant(Integer instant) {
    this.instant = instant;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * License name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner parentid(Integer parentid) {
    this.parentid = parentid;
    return this;
  }

   /**
   * Parent license id
   * @return parentid
  **/
  @javax.annotation.Nullable
  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner program(Integer program) {
    this.program = program;
    return this;
  }

   /**
   * Program pf courses 0 &#x3D; no, 1 &#x3D; yes
   * @return program
  **/
  @javax.annotation.Nullable
  public Integer getProgram() {
    return program;
  }

  public void setProgram(Integer program) {
    this.program = program;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * License reference
   * @return reference
  **/
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner startdate(Integer startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Date from which the liucense is available (int &#x3D; timestamp) 
   * @return startdate
  **/
  @javax.annotation.Nullable
  public Integer getStartdate() {
    return startdate;
  }

  public void setStartdate(Integer startdate) {
    this.startdate = startdate;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator
   * @return type
  **/
  @javax.annotation.Nullable
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner used(Integer used) {
    this.used = used;
    return this;
  }

   /**
   * Number how often the lic can be allocated
   * @return used
  **/
  @javax.annotation.Nullable
  public Integer getUsed() {
    return used;
  }

  public void setUsed(Integer used) {
    this.used = used;
  }


  public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner validlength(Integer validlength) {
    this.validlength = validlength;
    return this;
  }

   /**
   * Course access length (days)
   * @return validlength
  **/
  @javax.annotation.Nullable
  public Integer getValidlength() {
    return validlength;
  }

  public void setValidlength(Integer validlength) {
    this.validlength = validlength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminCreateLicensesRequestLicensesInner blockIomadCompanyAdminCreateLicensesRequestLicensesInner = (BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) o;
    return Objects.equals(this.allocation, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.allocation) &&
        Objects.equals(this.clearonexpire, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.clearonexpire) &&
        Objects.equals(this.companyid, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.companyid) &&
        Objects.equals(this.courses, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.courses) &&
        Objects.equals(this.cutoffdate, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.cutoffdate) &&
        Objects.equals(this.expirydate, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.expirydate) &&
        Objects.equals(this.instant, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.instant) &&
        Objects.equals(this.name, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.name) &&
        Objects.equals(this.parentid, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.parentid) &&
        Objects.equals(this.program, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.program) &&
        Objects.equals(this.reference, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.reference) &&
        Objects.equals(this.startdate, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.startdate) &&
        Objects.equals(this.type, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.type) &&
        Objects.equals(this.used, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.used) &&
        Objects.equals(this.validlength, blockIomadCompanyAdminCreateLicensesRequestLicensesInner.validlength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocation, clearonexpire, companyid, courses, cutoffdate, expirydate, instant, name, parentid, program, reference, startdate, type, used, validlength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminCreateLicensesRequestLicensesInner {\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
    sb.append("    clearonexpire: ").append(toIndentedString(clearonexpire)).append("\n");
    sb.append("    companyid: ").append(toIndentedString(companyid)).append("\n");
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
    sb.append("    cutoffdate: ").append(toIndentedString(cutoffdate)).append("\n");
    sb.append("    expirydate: ").append(toIndentedString(expirydate)).append("\n");
    sb.append("    instant: ").append(toIndentedString(instant)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentid: ").append(toIndentedString(parentid)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    validlength: ").append(toIndentedString(validlength)).append("\n");
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
    openapiFields.add("allocation");
    openapiFields.add("clearonexpire");
    openapiFields.add("companyid");
    openapiFields.add("courses");
    openapiFields.add("cutoffdate");
    openapiFields.add("expirydate");
    openapiFields.add("instant");
    openapiFields.add("name");
    openapiFields.add("parentid");
    openapiFields.add("program");
    openapiFields.add("reference");
    openapiFields.add("startdate");
    openapiFields.add("type");
    openapiFields.add("used");
    openapiFields.add("validlength");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminCreateLicensesRequestLicensesInner is not found in the empty JSON string", BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminCreateLicensesRequestLicensesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("courses") != null && !jsonObj.get("courses").isJsonNull()) {
        JsonArray jsonArraycourses = jsonObj.getAsJsonArray("courses");
        if (jsonArraycourses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("courses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `courses` to be an array in the JSON string but got `%s`", jsonObj.get("courses").toString()));
          }

          // validate the optional field `courses` (array)
          for (int i = 0; i < jsonArraycourses.size(); i++) {
            BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.validateJsonElement(jsonArraycourses.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminCreateLicensesRequestLicensesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminCreateLicensesRequestLicensesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminCreateLicensesRequestLicensesInner>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminCreateLicensesRequestLicensesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminCreateLicensesRequestLicensesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
  */
  public static BlockIomadCompanyAdminCreateLicensesRequestLicensesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminCreateLicensesRequestLicensesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

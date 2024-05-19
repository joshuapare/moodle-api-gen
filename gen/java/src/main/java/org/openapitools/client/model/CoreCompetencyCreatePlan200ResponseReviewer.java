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
 * CoreCompetencyCreatePlan200ResponseReviewer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCompetencyCreatePlan200ResponseReviewer {
  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private String department = "";

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = "";

  public static final String SERIALIZED_NAME_FULLNAME = "fullname";
  @SerializedName(SERIALIZED_NAME_FULLNAME)
  private String fullname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity = "null";

  public static final String SERIALIZED_NAME_IDNUMBER = "idnumber";
  @SerializedName(SERIALIZED_NAME_IDNUMBER)
  private String idnumber = "";

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution = "";

  public static final String SERIALIZED_NAME_PHONE1 = "phone1";
  @SerializedName(SERIALIZED_NAME_PHONE1)
  private String phone1 = "";

  public static final String SERIALIZED_NAME_PHONE2 = "phone2";
  @SerializedName(SERIALIZED_NAME_PHONE2)
  private String phone2 = "";

  public static final String SERIALIZED_NAME_PROFILEIMAGEURL = "profileimageurl";
  @SerializedName(SERIALIZED_NAME_PROFILEIMAGEURL)
  private String profileimageurl = "null";

  public static final String SERIALIZED_NAME_PROFILEIMAGEURLSMALL = "profileimageurlsmall";
  @SerializedName(SERIALIZED_NAME_PROFILEIMAGEURLSMALL)
  private String profileimageurlsmall = "null";

  public static final String SERIALIZED_NAME_PROFILEURL = "profileurl";
  @SerializedName(SERIALIZED_NAME_PROFILEURL)
  private String profileurl = "null";

  public CoreCompetencyCreatePlan200ResponseReviewer() {
  }

  public CoreCompetencyCreatePlan200ResponseReviewer department(String department) {
    this.department = department;
    return this;
  }

   /**
   * department
   * @return department
  **/
  @javax.annotation.Nonnull
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * email
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * fullname
   * @return fullname
  **/
  @javax.annotation.Nonnull
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * identity
   * @return identity
  **/
  @javax.annotation.Nonnull
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer idnumber(String idnumber) {
    this.idnumber = idnumber;
    return this;
  }

   /**
   * idnumber
   * @return idnumber
  **/
  @javax.annotation.Nonnull
  public String getIdnumber() {
    return idnumber;
  }

  public void setIdnumber(String idnumber) {
    this.idnumber = idnumber;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer institution(String institution) {
    this.institution = institution;
    return this;
  }

   /**
   * institution
   * @return institution
  **/
  @javax.annotation.Nonnull
  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer phone1(String phone1) {
    this.phone1 = phone1;
    return this;
  }

   /**
   * phone1
   * @return phone1
  **/
  @javax.annotation.Nonnull
  public String getPhone1() {
    return phone1;
  }

  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer phone2(String phone2) {
    this.phone2 = phone2;
    return this;
  }

   /**
   * phone2
   * @return phone2
  **/
  @javax.annotation.Nonnull
  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer profileimageurl(String profileimageurl) {
    this.profileimageurl = profileimageurl;
    return this;
  }

   /**
   * profileimageurl
   * @return profileimageurl
  **/
  @javax.annotation.Nonnull
  public String getProfileimageurl() {
    return profileimageurl;
  }

  public void setProfileimageurl(String profileimageurl) {
    this.profileimageurl = profileimageurl;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer profileimageurlsmall(String profileimageurlsmall) {
    this.profileimageurlsmall = profileimageurlsmall;
    return this;
  }

   /**
   * profileimageurlsmall
   * @return profileimageurlsmall
  **/
  @javax.annotation.Nonnull
  public String getProfileimageurlsmall() {
    return profileimageurlsmall;
  }

  public void setProfileimageurlsmall(String profileimageurlsmall) {
    this.profileimageurlsmall = profileimageurlsmall;
  }


  public CoreCompetencyCreatePlan200ResponseReviewer profileurl(String profileurl) {
    this.profileurl = profileurl;
    return this;
  }

   /**
   * profileurl
   * @return profileurl
  **/
  @javax.annotation.Nonnull
  public String getProfileurl() {
    return profileurl;
  }

  public void setProfileurl(String profileurl) {
    this.profileurl = profileurl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCompetencyCreatePlan200ResponseReviewer coreCompetencyCreatePlan200ResponseReviewer = (CoreCompetencyCreatePlan200ResponseReviewer) o;
    return Objects.equals(this.department, coreCompetencyCreatePlan200ResponseReviewer.department) &&
        Objects.equals(this.email, coreCompetencyCreatePlan200ResponseReviewer.email) &&
        Objects.equals(this.fullname, coreCompetencyCreatePlan200ResponseReviewer.fullname) &&
        Objects.equals(this.id, coreCompetencyCreatePlan200ResponseReviewer.id) &&
        Objects.equals(this.identity, coreCompetencyCreatePlan200ResponseReviewer.identity) &&
        Objects.equals(this.idnumber, coreCompetencyCreatePlan200ResponseReviewer.idnumber) &&
        Objects.equals(this.institution, coreCompetencyCreatePlan200ResponseReviewer.institution) &&
        Objects.equals(this.phone1, coreCompetencyCreatePlan200ResponseReviewer.phone1) &&
        Objects.equals(this.phone2, coreCompetencyCreatePlan200ResponseReviewer.phone2) &&
        Objects.equals(this.profileimageurl, coreCompetencyCreatePlan200ResponseReviewer.profileimageurl) &&
        Objects.equals(this.profileimageurlsmall, coreCompetencyCreatePlan200ResponseReviewer.profileimageurlsmall) &&
        Objects.equals(this.profileurl, coreCompetencyCreatePlan200ResponseReviewer.profileurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(department, email, fullname, id, identity, idnumber, institution, phone1, phone2, profileimageurl, profileimageurlsmall, profileurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCompetencyCreatePlan200ResponseReviewer {\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    idnumber: ").append(toIndentedString(idnumber)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    profileimageurl: ").append(toIndentedString(profileimageurl)).append("\n");
    sb.append("    profileimageurlsmall: ").append(toIndentedString(profileimageurlsmall)).append("\n");
    sb.append("    profileurl: ").append(toIndentedString(profileurl)).append("\n");
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
    openapiFields.add("department");
    openapiFields.add("email");
    openapiFields.add("fullname");
    openapiFields.add("id");
    openapiFields.add("identity");
    openapiFields.add("idnumber");
    openapiFields.add("institution");
    openapiFields.add("phone1");
    openapiFields.add("phone2");
    openapiFields.add("profileimageurl");
    openapiFields.add("profileimageurlsmall");
    openapiFields.add("profileurl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("department");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("fullname");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("identity");
    openapiRequiredFields.add("idnumber");
    openapiRequiredFields.add("institution");
    openapiRequiredFields.add("phone1");
    openapiRequiredFields.add("phone2");
    openapiRequiredFields.add("profileimageurl");
    openapiRequiredFields.add("profileimageurlsmall");
    openapiRequiredFields.add("profileurl");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCompetencyCreatePlan200ResponseReviewer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCompetencyCreatePlan200ResponseReviewer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCompetencyCreatePlan200ResponseReviewer is not found in the empty JSON string", CoreCompetencyCreatePlan200ResponseReviewer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCompetencyCreatePlan200ResponseReviewer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCompetencyCreatePlan200ResponseReviewer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCompetencyCreatePlan200ResponseReviewer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("fullname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullname").toString()));
      }
      if (!jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if (!jsonObj.get("idnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idnumber").toString()));
      }
      if (!jsonObj.get("institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution").toString()));
      }
      if (!jsonObj.get("phone1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone1").toString()));
      }
      if (!jsonObj.get("phone2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone2").toString()));
      }
      if (!jsonObj.get("profileimageurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileimageurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileimageurl").toString()));
      }
      if (!jsonObj.get("profileimageurlsmall").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileimageurlsmall` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileimageurlsmall").toString()));
      }
      if (!jsonObj.get("profileurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCompetencyCreatePlan200ResponseReviewer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCompetencyCreatePlan200ResponseReviewer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCompetencyCreatePlan200ResponseReviewer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCompetencyCreatePlan200ResponseReviewer.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCompetencyCreatePlan200ResponseReviewer>() {
           @Override
           public void write(JsonWriter out, CoreCompetencyCreatePlan200ResponseReviewer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCompetencyCreatePlan200ResponseReviewer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCompetencyCreatePlan200ResponseReviewer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCompetencyCreatePlan200ResponseReviewer
  * @throws IOException if the JSON string is invalid with respect to CoreCompetencyCreatePlan200ResponseReviewer
  */
  public static CoreCompetencyCreatePlan200ResponseReviewer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCompetencyCreatePlan200ResponseReviewer.class);
  }

 /**
  * Convert an instance of CoreCompetencyCreatePlan200ResponseReviewer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


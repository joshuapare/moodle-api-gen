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
import org.openapitools.client.model.CoreUserCreateUsersRequestUsersInnerCustomfieldsInner;
import org.openapitools.client.model.CoreUserCreateUsersRequestUsersInnerPreferencesInner;

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
 * CoreUserCreateUsersRequestUsersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreUserCreateUsersRequestUsersInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ALTERNATENAME = "alternatename";
  @SerializedName(SERIALIZED_NAME_ALTERNATENAME)
  private String alternatename = "null";

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private String auth = "manual";

  public static final String SERIALIZED_NAME_CALENDARTYPE = "calendartype";
  @SerializedName(SERIALIZED_NAME_CALENDARTYPE)
  private String calendartype = "gregorian";

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CREATEPASSWORD = "createpassword";
  @SerializedName(SERIALIZED_NAME_CREATEPASSWORD)
  private Boolean createpassword = null;

  public static final String SERIALIZED_NAME_CUSTOMFIELDS = "customfields";
  @SerializedName(SERIALIZED_NAME_CUSTOMFIELDS)
  private List<CoreUserCreateUsersRequestUsersInnerCustomfieldsInner> customfields = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private String department;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "null";

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_FIRSTNAMEPHONETIC = "firstnamephonetic";
  @SerializedName(SERIALIZED_NAME_FIRSTNAMEPHONETIC)
  private String firstnamephonetic = "null";

  public static final String SERIALIZED_NAME_IDNUMBER = "idnumber";
  @SerializedName(SERIALIZED_NAME_IDNUMBER)
  private String idnumber = "";

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution;

  public static final String SERIALIZED_NAME_INTERESTS = "interests";
  @SerializedName(SERIALIZED_NAME_INTERESTS)
  private String interests = "null";

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang = "en";

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_LASTNAMEPHONETIC = "lastnamephonetic";
  @SerializedName(SERIALIZED_NAME_LASTNAMEPHONETIC)
  private String lastnamephonetic = "null";

  public static final String SERIALIZED_NAME_MAILDISPLAY = "maildisplay";
  @SerializedName(SERIALIZED_NAME_MAILDISPLAY)
  private Integer maildisplay = null;

  public static final String SERIALIZED_NAME_MAILFORMAT = "mailformat";
  @SerializedName(SERIALIZED_NAME_MAILFORMAT)
  private Integer mailformat;

  public static final String SERIALIZED_NAME_MIDDLENAME = "middlename";
  @SerializedName(SERIALIZED_NAME_MIDDLENAME)
  private String middlename = "null";

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password = "null";

  public static final String SERIALIZED_NAME_PHONE1 = "phone1";
  @SerializedName(SERIALIZED_NAME_PHONE1)
  private String phone1;

  public static final String SERIALIZED_NAME_PHONE2 = "phone2";
  @SerializedName(SERIALIZED_NAME_PHONE2)
  private String phone2;

  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private List<CoreUserCreateUsersRequestUsersInnerPreferencesInner> preferences = new ArrayList<>();

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private String theme;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username = "null";

  public CoreUserCreateUsersRequestUsersInner() {
  }

  public CoreUserCreateUsersRequestUsersInner address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Postal address
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public CoreUserCreateUsersRequestUsersInner alternatename(String alternatename) {
    this.alternatename = alternatename;
    return this;
  }

   /**
   * The alternate name of the user
   * @return alternatename
  **/
  @javax.annotation.Nullable
  public String getAlternatename() {
    return alternatename;
  }

  public void setAlternatename(String alternatename) {
    this.alternatename = alternatename;
  }


  public CoreUserCreateUsersRequestUsersInner auth(String auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Auth plugins include manual, ldap, etc
   * @return auth
  **/
  @javax.annotation.Nullable
  public String getAuth() {
    return auth;
  }

  public void setAuth(String auth) {
    this.auth = auth;
  }


  public CoreUserCreateUsersRequestUsersInner calendartype(String calendartype) {
    this.calendartype = calendartype;
    return this;
  }

   /**
   * Calendar type such as \&quot;gregorian\&quot;, must exist on server
   * @return calendartype
  **/
  @javax.annotation.Nullable
  public String getCalendartype() {
    return calendartype;
  }

  public void setCalendartype(String calendartype) {
    this.calendartype = calendartype;
  }


  public CoreUserCreateUsersRequestUsersInner city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Home city of the user
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public CoreUserCreateUsersRequestUsersInner country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Home country code of the user, such as AU or CZ
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public CoreUserCreateUsersRequestUsersInner createpassword(Boolean createpassword) {
    this.createpassword = createpassword;
    return this;
  }

   /**
   * True if password should be created and mailed to user.
   * @return createpassword
  **/
  @javax.annotation.Nullable
  public Boolean getCreatepassword() {
    return createpassword;
  }

  public void setCreatepassword(Boolean createpassword) {
    this.createpassword = createpassword;
  }


  public CoreUserCreateUsersRequestUsersInner customfields(List<CoreUserCreateUsersRequestUsersInnerCustomfieldsInner> customfields) {
    this.customfields = customfields;
    return this;
  }

  public CoreUserCreateUsersRequestUsersInner addCustomfieldsItem(CoreUserCreateUsersRequestUsersInnerCustomfieldsInner customfieldsItem) {
    if (this.customfields == null) {
      this.customfields = new ArrayList<>();
    }
    this.customfields.add(customfieldsItem);
    return this;
  }

   /**
   * Get customfields
   * @return customfields
  **/
  @javax.annotation.Nullable
  public List<CoreUserCreateUsersRequestUsersInnerCustomfieldsInner> getCustomfields() {
    return customfields;
  }

  public void setCustomfields(List<CoreUserCreateUsersRequestUsersInnerCustomfieldsInner> customfields) {
    this.customfields = customfields;
  }


  public CoreUserCreateUsersRequestUsersInner department(String department) {
    this.department = department;
    return this;
  }

   /**
   * department
   * @return department
  **/
  @javax.annotation.Nullable
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public CoreUserCreateUsersRequestUsersInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User profile description, no HTML
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CoreUserCreateUsersRequestUsersInner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * A valid and unique email address
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public CoreUserCreateUsersRequestUsersInner firstname(String firstname) {
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


  public CoreUserCreateUsersRequestUsersInner firstnamephonetic(String firstnamephonetic) {
    this.firstnamephonetic = firstnamephonetic;
    return this;
  }

   /**
   * The first name(s) phonetically of the user
   * @return firstnamephonetic
  **/
  @javax.annotation.Nullable
  public String getFirstnamephonetic() {
    return firstnamephonetic;
  }

  public void setFirstnamephonetic(String firstnamephonetic) {
    this.firstnamephonetic = firstnamephonetic;
  }


  public CoreUserCreateUsersRequestUsersInner idnumber(String idnumber) {
    this.idnumber = idnumber;
    return this;
  }

   /**
   * An arbitrary ID code number perhaps from the institution
   * @return idnumber
  **/
  @javax.annotation.Nullable
  public String getIdnumber() {
    return idnumber;
  }

  public void setIdnumber(String idnumber) {
    this.idnumber = idnumber;
  }


  public CoreUserCreateUsersRequestUsersInner institution(String institution) {
    this.institution = institution;
    return this;
  }

   /**
   * institution
   * @return institution
  **/
  @javax.annotation.Nullable
  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }


  public CoreUserCreateUsersRequestUsersInner interests(String interests) {
    this.interests = interests;
    return this;
  }

   /**
   * User interests (separated by commas)
   * @return interests
  **/
  @javax.annotation.Nullable
  public String getInterests() {
    return interests;
  }

  public void setInterests(String interests) {
    this.interests = interests;
  }


  public CoreUserCreateUsersRequestUsersInner lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Language code such as \&quot;en\&quot;, must exist on server
   * @return lang
  **/
  @javax.annotation.Nullable
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  public CoreUserCreateUsersRequestUsersInner lastname(String lastname) {
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


  public CoreUserCreateUsersRequestUsersInner lastnamephonetic(String lastnamephonetic) {
    this.lastnamephonetic = lastnamephonetic;
    return this;
  }

   /**
   * The family name phonetically of the user
   * @return lastnamephonetic
  **/
  @javax.annotation.Nullable
  public String getLastnamephonetic() {
    return lastnamephonetic;
  }

  public void setLastnamephonetic(String lastnamephonetic) {
    this.lastnamephonetic = lastnamephonetic;
  }


  public CoreUserCreateUsersRequestUsersInner maildisplay(Integer maildisplay) {
    this.maildisplay = maildisplay;
    return this;
  }

   /**
   * Email visibility
   * @return maildisplay
  **/
  @javax.annotation.Nullable
  public Integer getMaildisplay() {
    return maildisplay;
  }

  public void setMaildisplay(Integer maildisplay) {
    this.maildisplay = maildisplay;
  }


  public CoreUserCreateUsersRequestUsersInner mailformat(Integer mailformat) {
    this.mailformat = mailformat;
    return this;
  }

   /**
   * Mail format code is 0 for plain text, 1 for HTML etc
   * @return mailformat
  **/
  @javax.annotation.Nullable
  public Integer getMailformat() {
    return mailformat;
  }

  public void setMailformat(Integer mailformat) {
    this.mailformat = mailformat;
  }


  public CoreUserCreateUsersRequestUsersInner middlename(String middlename) {
    this.middlename = middlename;
    return this;
  }

   /**
   * The middle name of the user
   * @return middlename
  **/
  @javax.annotation.Nullable
  public String getMiddlename() {
    return middlename;
  }

  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }


  public CoreUserCreateUsersRequestUsersInner password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Plain text password consisting of any characters
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public CoreUserCreateUsersRequestUsersInner phone1(String phone1) {
    this.phone1 = phone1;
    return this;
  }

   /**
   * Phone 1
   * @return phone1
  **/
  @javax.annotation.Nullable
  public String getPhone1() {
    return phone1;
  }

  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }


  public CoreUserCreateUsersRequestUsersInner phone2(String phone2) {
    this.phone2 = phone2;
    return this;
  }

   /**
   * Phone 2
   * @return phone2
  **/
  @javax.annotation.Nullable
  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }


  public CoreUserCreateUsersRequestUsersInner preferences(List<CoreUserCreateUsersRequestUsersInnerPreferencesInner> preferences) {
    this.preferences = preferences;
    return this;
  }

  public CoreUserCreateUsersRequestUsersInner addPreferencesItem(CoreUserCreateUsersRequestUsersInnerPreferencesInner preferencesItem) {
    if (this.preferences == null) {
      this.preferences = new ArrayList<>();
    }
    this.preferences.add(preferencesItem);
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  public List<CoreUserCreateUsersRequestUsersInnerPreferencesInner> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<CoreUserCreateUsersRequestUsersInnerPreferencesInner> preferences) {
    this.preferences = preferences;
  }


  public CoreUserCreateUsersRequestUsersInner theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Theme name such as \&quot;standard\&quot;, must exist on server
   * @return theme
  **/
  @javax.annotation.Nullable
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  public CoreUserCreateUsersRequestUsersInner timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone code such as Australia/Perth, or 99 for default
   * @return timezone
  **/
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public CoreUserCreateUsersRequestUsersInner username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username policy is defined in Moodle security config.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreUserCreateUsersRequestUsersInner coreUserCreateUsersRequestUsersInner = (CoreUserCreateUsersRequestUsersInner) o;
    return Objects.equals(this.address, coreUserCreateUsersRequestUsersInner.address) &&
        Objects.equals(this.alternatename, coreUserCreateUsersRequestUsersInner.alternatename) &&
        Objects.equals(this.auth, coreUserCreateUsersRequestUsersInner.auth) &&
        Objects.equals(this.calendartype, coreUserCreateUsersRequestUsersInner.calendartype) &&
        Objects.equals(this.city, coreUserCreateUsersRequestUsersInner.city) &&
        Objects.equals(this.country, coreUserCreateUsersRequestUsersInner.country) &&
        Objects.equals(this.createpassword, coreUserCreateUsersRequestUsersInner.createpassword) &&
        Objects.equals(this.customfields, coreUserCreateUsersRequestUsersInner.customfields) &&
        Objects.equals(this.department, coreUserCreateUsersRequestUsersInner.department) &&
        Objects.equals(this.description, coreUserCreateUsersRequestUsersInner.description) &&
        Objects.equals(this.email, coreUserCreateUsersRequestUsersInner.email) &&
        Objects.equals(this.firstname, coreUserCreateUsersRequestUsersInner.firstname) &&
        Objects.equals(this.firstnamephonetic, coreUserCreateUsersRequestUsersInner.firstnamephonetic) &&
        Objects.equals(this.idnumber, coreUserCreateUsersRequestUsersInner.idnumber) &&
        Objects.equals(this.institution, coreUserCreateUsersRequestUsersInner.institution) &&
        Objects.equals(this.interests, coreUserCreateUsersRequestUsersInner.interests) &&
        Objects.equals(this.lang, coreUserCreateUsersRequestUsersInner.lang) &&
        Objects.equals(this.lastname, coreUserCreateUsersRequestUsersInner.lastname) &&
        Objects.equals(this.lastnamephonetic, coreUserCreateUsersRequestUsersInner.lastnamephonetic) &&
        Objects.equals(this.maildisplay, coreUserCreateUsersRequestUsersInner.maildisplay) &&
        Objects.equals(this.mailformat, coreUserCreateUsersRequestUsersInner.mailformat) &&
        Objects.equals(this.middlename, coreUserCreateUsersRequestUsersInner.middlename) &&
        Objects.equals(this.password, coreUserCreateUsersRequestUsersInner.password) &&
        Objects.equals(this.phone1, coreUserCreateUsersRequestUsersInner.phone1) &&
        Objects.equals(this.phone2, coreUserCreateUsersRequestUsersInner.phone2) &&
        Objects.equals(this.preferences, coreUserCreateUsersRequestUsersInner.preferences) &&
        Objects.equals(this.theme, coreUserCreateUsersRequestUsersInner.theme) &&
        Objects.equals(this.timezone, coreUserCreateUsersRequestUsersInner.timezone) &&
        Objects.equals(this.username, coreUserCreateUsersRequestUsersInner.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, alternatename, auth, calendartype, city, country, createpassword, customfields, department, description, email, firstname, firstnamephonetic, idnumber, institution, interests, lang, lastname, lastnamephonetic, maildisplay, mailformat, middlename, password, phone1, phone2, preferences, theme, timezone, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreUserCreateUsersRequestUsersInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    alternatename: ").append(toIndentedString(alternatename)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    calendartype: ").append(toIndentedString(calendartype)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createpassword: ").append(toIndentedString(createpassword)).append("\n");
    sb.append("    customfields: ").append(toIndentedString(customfields)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    firstnamephonetic: ").append(toIndentedString(firstnamephonetic)).append("\n");
    sb.append("    idnumber: ").append(toIndentedString(idnumber)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    lastnamephonetic: ").append(toIndentedString(lastnamephonetic)).append("\n");
    sb.append("    maildisplay: ").append(toIndentedString(maildisplay)).append("\n");
    sb.append("    mailformat: ").append(toIndentedString(mailformat)).append("\n");
    sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("alternatename");
    openapiFields.add("auth");
    openapiFields.add("calendartype");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("createpassword");
    openapiFields.add("customfields");
    openapiFields.add("department");
    openapiFields.add("description");
    openapiFields.add("email");
    openapiFields.add("firstname");
    openapiFields.add("firstnamephonetic");
    openapiFields.add("idnumber");
    openapiFields.add("institution");
    openapiFields.add("interests");
    openapiFields.add("lang");
    openapiFields.add("lastname");
    openapiFields.add("lastnamephonetic");
    openapiFields.add("maildisplay");
    openapiFields.add("mailformat");
    openapiFields.add("middlename");
    openapiFields.add("password");
    openapiFields.add("phone1");
    openapiFields.add("phone2");
    openapiFields.add("preferences");
    openapiFields.add("theme");
    openapiFields.add("timezone");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreUserCreateUsersRequestUsersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreUserCreateUsersRequestUsersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreUserCreateUsersRequestUsersInner is not found in the empty JSON string", CoreUserCreateUsersRequestUsersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreUserCreateUsersRequestUsersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreUserCreateUsersRequestUsersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("alternatename") != null && !jsonObj.get("alternatename").isJsonNull()) && !jsonObj.get("alternatename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternatename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alternatename").toString()));
      }
      if ((jsonObj.get("auth") != null && !jsonObj.get("auth").isJsonNull()) && !jsonObj.get("auth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth").toString()));
      }
      if ((jsonObj.get("calendartype") != null && !jsonObj.get("calendartype").isJsonNull()) && !jsonObj.get("calendartype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calendartype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calendartype").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("customfields") != null && !jsonObj.get("customfields").isJsonNull()) {
        JsonArray jsonArraycustomfields = jsonObj.getAsJsonArray("customfields");
        if (jsonArraycustomfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customfields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customfields` to be an array in the JSON string but got `%s`", jsonObj.get("customfields").toString()));
          }

          // validate the optional field `customfields` (array)
          for (int i = 0; i < jsonArraycustomfields.size(); i++) {
            CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.validateJsonElement(jsonArraycustomfields.get(i));
          };
        }
      }
      if ((jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) && !jsonObj.get("department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("department").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("firstname") != null && !jsonObj.get("firstname").isJsonNull()) && !jsonObj.get("firstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstname").toString()));
      }
      if ((jsonObj.get("firstnamephonetic") != null && !jsonObj.get("firstnamephonetic").isJsonNull()) && !jsonObj.get("firstnamephonetic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstnamephonetic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstnamephonetic").toString()));
      }
      if ((jsonObj.get("idnumber") != null && !jsonObj.get("idnumber").isJsonNull()) && !jsonObj.get("idnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idnumber").toString()));
      }
      if ((jsonObj.get("institution") != null && !jsonObj.get("institution").isJsonNull()) && !jsonObj.get("institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution").toString()));
      }
      if ((jsonObj.get("interests") != null && !jsonObj.get("interests").isJsonNull()) && !jsonObj.get("interests").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interests` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interests").toString()));
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      if ((jsonObj.get("lastname") != null && !jsonObj.get("lastname").isJsonNull()) && !jsonObj.get("lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
      if ((jsonObj.get("lastnamephonetic") != null && !jsonObj.get("lastnamephonetic").isJsonNull()) && !jsonObj.get("lastnamephonetic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastnamephonetic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastnamephonetic").toString()));
      }
      if ((jsonObj.get("middlename") != null && !jsonObj.get("middlename").isJsonNull()) && !jsonObj.get("middlename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middlename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middlename").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("phone1") != null && !jsonObj.get("phone1").isJsonNull()) && !jsonObj.get("phone1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone1").toString()));
      }
      if ((jsonObj.get("phone2") != null && !jsonObj.get("phone2").isJsonNull()) && !jsonObj.get("phone2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone2").toString()));
      }
      if (jsonObj.get("preferences") != null && !jsonObj.get("preferences").isJsonNull()) {
        JsonArray jsonArraypreferences = jsonObj.getAsJsonArray("preferences");
        if (jsonArraypreferences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preferences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preferences` to be an array in the JSON string but got `%s`", jsonObj.get("preferences").toString()));
          }

          // validate the optional field `preferences` (array)
          for (int i = 0; i < jsonArraypreferences.size(); i++) {
            CoreUserCreateUsersRequestUsersInnerPreferencesInner.validateJsonElement(jsonArraypreferences.get(i));
          };
        }
      }
      if ((jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull()) && !jsonObj.get("theme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `theme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("theme").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreUserCreateUsersRequestUsersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreUserCreateUsersRequestUsersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreUserCreateUsersRequestUsersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreUserCreateUsersRequestUsersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreUserCreateUsersRequestUsersInner>() {
           @Override
           public void write(JsonWriter out, CoreUserCreateUsersRequestUsersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreUserCreateUsersRequestUsersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreUserCreateUsersRequestUsersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreUserCreateUsersRequestUsersInner
  * @throws IOException if the JSON string is invalid with respect to CoreUserCreateUsersRequestUsersInner
  */
  public static CoreUserCreateUsersRequestUsersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreUserCreateUsersRequestUsersInner.class);
  }

 /**
  * Convert an instance of CoreUserCreateUsersRequestUsersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AUTOSUBSCRIBE = "autosubscribe";
  @SerializedName(SERIALIZED_NAME_AUTOSUBSCRIBE)
  private Integer autosubscribe;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_COMPANYTERMINATED = "companyterminated";
  @SerializedName(SERIALIZED_NAME_COMPANYTERMINATED)
  private Integer companyterminated = 0;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CUSTOM1 = "custom1";
  @SerializedName(SERIALIZED_NAME_CUSTOM1)
  private String custom1;

  public static final String SERIALIZED_NAME_CUSTOM2 = "custom2";
  @SerializedName(SERIALIZED_NAME_CUSTOM2)
  private String custom2;

  public static final String SERIALIZED_NAME_CUSTOM3 = "custom3";
  @SerializedName(SERIALIZED_NAME_CUSTOM3)
  private String custom3;

  public static final String SERIALIZED_NAME_CUSTOMCSS = "customcss";
  @SerializedName(SERIALIZED_NAME_CUSTOMCSS)
  private String customcss = "";

  public static final String SERIALIZED_NAME_ECOMMERCE = "ecommerce";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE)
  private Integer ecommerce = 0;

  public static final String SERIALIZED_NAME_HEADINGCOLOR = "headingcolor";
  @SerializedName(SERIALIZED_NAME_HEADINGCOLOR)
  private String headingcolor = "";

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname = "";

  public static final String SERIALIZED_NAME_HTMLEDITOR = "htmleditor";
  @SerializedName(SERIALIZED_NAME_HTMLEDITOR)
  private Integer htmleditor;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private String lang;

  public static final String SERIALIZED_NAME_LINKCOLOR = "linkcolor";
  @SerializedName(SERIALIZED_NAME_LINKCOLOR)
  private String linkcolor = "";

  public static final String SERIALIZED_NAME_MAILDIGEST = "maildigest";
  @SerializedName(SERIALIZED_NAME_MAILDIGEST)
  private Integer maildigest;

  public static final String SERIALIZED_NAME_MAILDISPLAY = "maildisplay";
  @SerializedName(SERIALIZED_NAME_MAILDISPLAY)
  private Integer maildisplay;

  public static final String SERIALIZED_NAME_MAILFORMAT = "mailformat";
  @SerializedName(SERIALIZED_NAME_MAILFORMAT)
  private Integer mailformat;

  public static final String SERIALIZED_NAME_MAINCOLOR = "maincolor";
  @SerializedName(SERIALIZED_NAME_MAINCOLOR)
  private String maincolor = "";

  public static final String SERIALIZED_NAME_MAXUSERS = "maxusers";
  @SerializedName(SERIALIZED_NAME_MAXUSERS)
  private Integer maxusers = 0;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENTID = "parentid";
  @SerializedName(SERIALIZED_NAME_PARENTID)
  private Integer parentid = 0;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SCREENREADER = "screenreader";
  @SerializedName(SERIALIZED_NAME_SCREENREADER)
  private Integer screenreader;

  public static final String SERIALIZED_NAME_SHORTNAME = "shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_SUSPENDAFTER = "suspendafter";
  @SerializedName(SERIALIZED_NAME_SUSPENDAFTER)
  private Integer suspendafter = 0;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Integer suspended;

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private String theme = "";

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TRACKFORUMS = "trackforums";
  @SerializedName(SERIALIZED_NAME_TRACKFORUMS)
  private Integer trackforums;

  public static final String SERIALIZED_NAME_VALIDTO = "validto";
  @SerializedName(SERIALIZED_NAME_VALIDTO)
  private Integer validto;

  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner() {
  }

  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Company location address
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner autosubscribe(Integer autosubscribe) {
    this.autosubscribe = autosubscribe;
    return this;
  }

   /**
   * User default forum auto-subscribe
   * @return autosubscribe
  **/
  @javax.annotation.Nullable
  public Integer getAutosubscribe() {
    return autosubscribe;
  }

  public void setAutosubscribe(Integer autosubscribe) {
    this.autosubscribe = autosubscribe;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Company location city
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Compay code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner companyterminated(Integer companyterminated) {
    this.companyterminated = companyterminated;
    return this;
  }

   /**
   * Company contract is terminated when &lt;&gt; 0
   * @return companyterminated
  **/
  @javax.annotation.Nullable
  public Integer getCompanyterminated() {
    return companyterminated;
  }

  public void setCompanyterminated(Integer companyterminated) {
    this.companyterminated = companyterminated;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Company location country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner custom1(String custom1) {
    this.custom1 = custom1;
    return this;
  }

   /**
   * Company custom 1
   * @return custom1
  **/
  @javax.annotation.Nullable
  public String getCustom1() {
    return custom1;
  }

  public void setCustom1(String custom1) {
    this.custom1 = custom1;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner custom2(String custom2) {
    this.custom2 = custom2;
    return this;
  }

   /**
   * Company custom 2
   * @return custom2
  **/
  @javax.annotation.Nullable
  public String getCustom2() {
    return custom2;
  }

  public void setCustom2(String custom2) {
    this.custom2 = custom2;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner custom3(String custom3) {
    this.custom3 = custom3;
    return this;
  }

   /**
   * Company custom 3
   * @return custom3
  **/
  @javax.annotation.Nullable
  public String getCustom3() {
    return custom3;
  }

  public void setCustom3(String custom3) {
    this.custom3 = custom3;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner customcss(String customcss) {
    this.customcss = customcss;
    return this;
  }

   /**
   * Company custom css
   * @return customcss
  **/
  @javax.annotation.Nullable
  public String getCustomcss() {
    return customcss;
  }

  public void setCustomcss(String customcss) {
    this.customcss = customcss;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner ecommerce(Integer ecommerce) {
    this.ecommerce = ecommerce;
    return this;
  }

   /**
   * Ecommerce is disabled when &#x3D; 0
   * @return ecommerce
  **/
  @javax.annotation.Nullable
  public Integer getEcommerce() {
    return ecommerce;
  }

  public void setEcommerce(Integer ecommerce) {
    this.ecommerce = ecommerce;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner headingcolor(String headingcolor) {
    this.headingcolor = headingcolor;
    return this;
  }

   /**
   * Company heading color
   * @return headingcolor
  **/
  @javax.annotation.Nullable
  public String getHeadingcolor() {
    return headingcolor;
  }

  public void setHeadingcolor(String headingcolor) {
    this.headingcolor = headingcolor;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Company hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner htmleditor(Integer htmleditor) {
    this.htmleditor = htmleditor;
    return this;
  }

   /**
   * User default text editor
   * @return htmleditor
  **/
  @javax.annotation.Nullable
  public Integer getHtmleditor() {
    return htmleditor;
  }

  public void setHtmleditor(Integer htmleditor) {
    this.htmleditor = htmleditor;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Companid ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * User default language
   * @return lang
  **/
  @javax.annotation.Nullable
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner linkcolor(String linkcolor) {
    this.linkcolor = linkcolor;
    return this;
  }

   /**
   * Company ink color
   * @return linkcolor
  **/
  @javax.annotation.Nullable
  public String getLinkcolor() {
    return linkcolor;
  }

  public void setLinkcolor(String linkcolor) {
    this.linkcolor = linkcolor;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner maildigest(Integer maildigest) {
    this.maildigest = maildigest;
    return this;
  }

   /**
   * User default digest type
   * @return maildigest
  **/
  @javax.annotation.Nullable
  public Integer getMaildigest() {
    return maildigest;
  }

  public void setMaildigest(Integer maildigest) {
    this.maildigest = maildigest;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner maildisplay(Integer maildisplay) {
    this.maildisplay = maildisplay;
    return this;
  }

   /**
   * User default email display
   * @return maildisplay
  **/
  @javax.annotation.Nullable
  public Integer getMaildisplay() {
    return maildisplay;
  }

  public void setMaildisplay(Integer maildisplay) {
    this.maildisplay = maildisplay;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner mailformat(Integer mailformat) {
    this.mailformat = mailformat;
    return this;
  }

   /**
   * User default email format
   * @return mailformat
  **/
  @javax.annotation.Nullable
  public Integer getMailformat() {
    return mailformat;
  }

  public void setMailformat(Integer mailformat) {
    this.mailformat = mailformat;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner maincolor(String maincolor) {
    this.maincolor = maincolor;
    return this;
  }

   /**
   * Company main color
   * @return maincolor
  **/
  @javax.annotation.Nullable
  public String getMaincolor() {
    return maincolor;
  }

  public void setMaincolor(String maincolor) {
    this.maincolor = maincolor;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner maxusers(Integer maxusers) {
    this.maxusers = maxusers;
    return this;
  }

   /**
   * Company maximum number of users
   * @return maxusers
  **/
  @javax.annotation.Nullable
  public Integer getMaxusers() {
    return maxusers;
  }

  public void setMaxusers(Integer maxusers) {
    this.maxusers = maxusers;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Company long name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner parentid(Integer parentid) {
    this.parentid = parentid;
    return this;
  }

   /**
   * ID of parent company
   * @return parentid
  **/
  @javax.annotation.Nullable
  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Company location region
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner screenreader(Integer screenreader) {
    this.screenreader = screenreader;
    return this;
  }

   /**
   * User default screen reader
   * @return screenreader
  **/
  @javax.annotation.Nullable
  public Integer getScreenreader() {
    return screenreader;
  }

  public void setScreenreader(Integer screenreader) {
    this.screenreader = screenreader;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * Compay short name
   * @return shortname
  **/
  @javax.annotation.Nullable
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner suspendafter(Integer suspendafter) {
    this.suspendafter = suspendafter;
    return this;
  }

   /**
   * Number of seconds after termination date to suspend the company
   * @return suspendafter
  **/
  @javax.annotation.Nullable
  public Integer getSuspendafter() {
    return suspendafter;
  }

  public void setSuspendafter(Integer suspendafter) {
    this.suspendafter = suspendafter;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner suspended(Integer suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Company is suspended when &lt;&gt; 0
   * @return suspended
  **/
  @javax.annotation.Nullable
  public Integer getSuspended() {
    return suspended;
  }

  public void setSuspended(Integer suspended) {
    this.suspended = suspended;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Company theme
   * @return theme
  **/
  @javax.annotation.Nullable
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * User default timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner trackforums(Integer trackforums) {
    this.trackforums = trackforums;
    return this;
  }

   /**
   * User default forum tracking
   * @return trackforums
  **/
  @javax.annotation.Nullable
  public Integer getTrackforums() {
    return trackforums;
  }

  public void setTrackforums(Integer trackforums) {
    this.trackforums = trackforums;
  }


  public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner validto(Integer validto) {
    this.validto = validto;
    return this;
  }

   /**
   * Contract termination date in unix timestamp
   * @return validto
  **/
  @javax.annotation.Nullable
  public Integer getValidto() {
    return validto;
  }

  public void setValidto(Integer validto) {
    this.validto = validto;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner = (BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner) o;
    return Objects.equals(this.address, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.address) &&
        Objects.equals(this.autosubscribe, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.autosubscribe) &&
        Objects.equals(this.city, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.city) &&
        Objects.equals(this.code, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.code) &&
        Objects.equals(this.companyterminated, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.companyterminated) &&
        Objects.equals(this.country, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.country) &&
        Objects.equals(this.custom1, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.custom1) &&
        Objects.equals(this.custom2, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.custom2) &&
        Objects.equals(this.custom3, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.custom3) &&
        Objects.equals(this.customcss, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.customcss) &&
        Objects.equals(this.ecommerce, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.ecommerce) &&
        Objects.equals(this.headingcolor, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.headingcolor) &&
        Objects.equals(this.hostname, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.hostname) &&
        Objects.equals(this.htmleditor, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.htmleditor) &&
        Objects.equals(this.id, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.id) &&
        Objects.equals(this.lang, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.lang) &&
        Objects.equals(this.linkcolor, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.linkcolor) &&
        Objects.equals(this.maildigest, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.maildigest) &&
        Objects.equals(this.maildisplay, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.maildisplay) &&
        Objects.equals(this.mailformat, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.mailformat) &&
        Objects.equals(this.maincolor, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.maincolor) &&
        Objects.equals(this.maxusers, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.maxusers) &&
        Objects.equals(this.name, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.name) &&
        Objects.equals(this.parentid, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.parentid) &&
        Objects.equals(this.region, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.region) &&
        Objects.equals(this.screenreader, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.screenreader) &&
        Objects.equals(this.shortname, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.shortname) &&
        Objects.equals(this.suspendafter, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.suspendafter) &&
        Objects.equals(this.suspended, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.suspended) &&
        Objects.equals(this.theme, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.theme) &&
        Objects.equals(this.timezone, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.timezone) &&
        Objects.equals(this.trackforums, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.trackforums) &&
        Objects.equals(this.validto, blockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.validto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, autosubscribe, city, code, companyterminated, country, custom1, custom2, custom3, customcss, ecommerce, headingcolor, hostname, htmleditor, id, lang, linkcolor, maildigest, maildisplay, mailformat, maincolor, maxusers, name, parentid, region, screenreader, shortname, suspendafter, suspended, theme, timezone, trackforums, validto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    autosubscribe: ").append(toIndentedString(autosubscribe)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    companyterminated: ").append(toIndentedString(companyterminated)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    custom1: ").append(toIndentedString(custom1)).append("\n");
    sb.append("    custom2: ").append(toIndentedString(custom2)).append("\n");
    sb.append("    custom3: ").append(toIndentedString(custom3)).append("\n");
    sb.append("    customcss: ").append(toIndentedString(customcss)).append("\n");
    sb.append("    ecommerce: ").append(toIndentedString(ecommerce)).append("\n");
    sb.append("    headingcolor: ").append(toIndentedString(headingcolor)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    htmleditor: ").append(toIndentedString(htmleditor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    linkcolor: ").append(toIndentedString(linkcolor)).append("\n");
    sb.append("    maildigest: ").append(toIndentedString(maildigest)).append("\n");
    sb.append("    maildisplay: ").append(toIndentedString(maildisplay)).append("\n");
    sb.append("    mailformat: ").append(toIndentedString(mailformat)).append("\n");
    sb.append("    maincolor: ").append(toIndentedString(maincolor)).append("\n");
    sb.append("    maxusers: ").append(toIndentedString(maxusers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentid: ").append(toIndentedString(parentid)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    screenreader: ").append(toIndentedString(screenreader)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    suspendafter: ").append(toIndentedString(suspendafter)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    trackforums: ").append(toIndentedString(trackforums)).append("\n");
    sb.append("    validto: ").append(toIndentedString(validto)).append("\n");
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
    openapiFields.add("autosubscribe");
    openapiFields.add("city");
    openapiFields.add("code");
    openapiFields.add("companyterminated");
    openapiFields.add("country");
    openapiFields.add("custom1");
    openapiFields.add("custom2");
    openapiFields.add("custom3");
    openapiFields.add("customcss");
    openapiFields.add("ecommerce");
    openapiFields.add("headingcolor");
    openapiFields.add("hostname");
    openapiFields.add("htmleditor");
    openapiFields.add("id");
    openapiFields.add("lang");
    openapiFields.add("linkcolor");
    openapiFields.add("maildigest");
    openapiFields.add("maildisplay");
    openapiFields.add("mailformat");
    openapiFields.add("maincolor");
    openapiFields.add("maxusers");
    openapiFields.add("name");
    openapiFields.add("parentid");
    openapiFields.add("region");
    openapiFields.add("screenreader");
    openapiFields.add("shortname");
    openapiFields.add("suspendafter");
    openapiFields.add("suspended");
    openapiFields.add("theme");
    openapiFields.add("timezone");
    openapiFields.add("trackforums");
    openapiFields.add("validto");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner is not found in the empty JSON string", BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("custom1") != null && !jsonObj.get("custom1").isJsonNull()) && !jsonObj.get("custom1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom1").toString()));
      }
      if ((jsonObj.get("custom2") != null && !jsonObj.get("custom2").isJsonNull()) && !jsonObj.get("custom2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom2").toString()));
      }
      if ((jsonObj.get("custom3") != null && !jsonObj.get("custom3").isJsonNull()) && !jsonObj.get("custom3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom3").toString()));
      }
      if ((jsonObj.get("customcss") != null && !jsonObj.get("customcss").isJsonNull()) && !jsonObj.get("customcss").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customcss` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customcss").toString()));
      }
      if ((jsonObj.get("headingcolor") != null && !jsonObj.get("headingcolor").isJsonNull()) && !jsonObj.get("headingcolor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headingcolor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headingcolor").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
      if ((jsonObj.get("linkcolor") != null && !jsonObj.get("linkcolor").isJsonNull()) && !jsonObj.get("linkcolor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkcolor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkcolor").toString()));
      }
      if ((jsonObj.get("maincolor") != null && !jsonObj.get("maincolor").isJsonNull()) && !jsonObj.get("maincolor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maincolor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maincolor").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("shortname") != null && !jsonObj.get("shortname").isJsonNull()) && !jsonObj.get("shortname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortname").toString()));
      }
      if ((jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull()) && !jsonObj.get("theme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `theme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("theme").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner>() {
           @Override
           public void write(JsonWriter out, BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
  * @throws IOException if the JSON string is invalid with respect to BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner
  */
  public static BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.class);
  }

 /**
  * Convert an instance of BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

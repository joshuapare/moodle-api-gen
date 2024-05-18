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
 * Subwikis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModWikiGetSubwikis200ResponseSubwikisInner {
  public static final String SERIALIZED_NAME_CANEDIT = "canedit";
  @SerializedName(SERIALIZED_NAME_CANEDIT)
  private Boolean canedit = null;

  public static final String SERIALIZED_NAME_GROUPID = "groupid";
  @SerializedName(SERIALIZED_NAME_GROUPID)
  private String groupid = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public static final String SERIALIZED_NAME_WIKIID = "wikiid";
  @SerializedName(SERIALIZED_NAME_WIKIID)
  private Integer wikiid = null;

  public ModWikiGetSubwikis200ResponseSubwikisInner() {
  }

  public ModWikiGetSubwikis200ResponseSubwikisInner canedit(Boolean canedit) {
    this.canedit = canedit;
    return this;
  }

   /**
   * True if user can edit the subwiki.
   * @return canedit
  **/
  @javax.annotation.Nullable
  public Boolean getCanedit() {
    return canedit;
  }

  public void setCanedit(Boolean canedit) {
    this.canedit = canedit;
  }


  public ModWikiGetSubwikis200ResponseSubwikisInner groupid(String groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * Group ID.
   * @return groupid
  **/
  @javax.annotation.Nullable
  public String getGroupid() {
    return groupid;
  }

  public void setGroupid(String groupid) {
    this.groupid = groupid;
  }


  public ModWikiGetSubwikis200ResponseSubwikisInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Subwiki ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModWikiGetSubwikis200ResponseSubwikisInner userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * User ID.
   * @return userid
  **/
  @javax.annotation.Nullable
  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public ModWikiGetSubwikis200ResponseSubwikisInner wikiid(Integer wikiid) {
    this.wikiid = wikiid;
    return this;
  }

   /**
   * Wiki ID.
   * @return wikiid
  **/
  @javax.annotation.Nullable
  public Integer getWikiid() {
    return wikiid;
  }

  public void setWikiid(Integer wikiid) {
    this.wikiid = wikiid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModWikiGetSubwikis200ResponseSubwikisInner modWikiGetSubwikis200ResponseSubwikisInner = (ModWikiGetSubwikis200ResponseSubwikisInner) o;
    return Objects.equals(this.canedit, modWikiGetSubwikis200ResponseSubwikisInner.canedit) &&
        Objects.equals(this.groupid, modWikiGetSubwikis200ResponseSubwikisInner.groupid) &&
        Objects.equals(this.id, modWikiGetSubwikis200ResponseSubwikisInner.id) &&
        Objects.equals(this.userid, modWikiGetSubwikis200ResponseSubwikisInner.userid) &&
        Objects.equals(this.wikiid, modWikiGetSubwikis200ResponseSubwikisInner.wikiid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canedit, groupid, id, userid, wikiid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModWikiGetSubwikis200ResponseSubwikisInner {\n");
    sb.append("    canedit: ").append(toIndentedString(canedit)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    wikiid: ").append(toIndentedString(wikiid)).append("\n");
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
    openapiFields.add("canedit");
    openapiFields.add("groupid");
    openapiFields.add("id");
    openapiFields.add("userid");
    openapiFields.add("wikiid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModWikiGetSubwikis200ResponseSubwikisInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModWikiGetSubwikis200ResponseSubwikisInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModWikiGetSubwikis200ResponseSubwikisInner is not found in the empty JSON string", ModWikiGetSubwikis200ResponseSubwikisInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModWikiGetSubwikis200ResponseSubwikisInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModWikiGetSubwikis200ResponseSubwikisInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("groupid") != null && !jsonObj.get("groupid").isJsonNull()) && !jsonObj.get("groupid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModWikiGetSubwikis200ResponseSubwikisInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModWikiGetSubwikis200ResponseSubwikisInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModWikiGetSubwikis200ResponseSubwikisInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModWikiGetSubwikis200ResponseSubwikisInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModWikiGetSubwikis200ResponseSubwikisInner>() {
           @Override
           public void write(JsonWriter out, ModWikiGetSubwikis200ResponseSubwikisInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModWikiGetSubwikis200ResponseSubwikisInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModWikiGetSubwikis200ResponseSubwikisInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModWikiGetSubwikis200ResponseSubwikisInner
  * @throws IOException if the JSON string is invalid with respect to ModWikiGetSubwikis200ResponseSubwikisInner
  */
  public static ModWikiGetSubwikis200ResponseSubwikisInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModWikiGetSubwikis200ResponseSubwikisInner.class);
  }

 /**
  * Convert an instance of ModWikiGetSubwikis200ResponseSubwikisInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


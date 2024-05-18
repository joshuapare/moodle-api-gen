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
import org.openapitools.client.model.ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner;

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
 * ToolLpDataForUserEvidenceListPage200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForUserEvidenceListPage200Response {
  public static final String SERIALIZED_NAME_CANMANAGE = "canmanage";
  @SerializedName(SERIALIZED_NAME_CANMANAGE)
  private Boolean canmanage = null;

  public static final String SERIALIZED_NAME_EVIDENCE = "evidence";
  @SerializedName(SERIALIZED_NAME_EVIDENCE)
  private List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner> evidence = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAVIGATION = "navigation";
  @SerializedName(SERIALIZED_NAME_NAVIGATION)
  private List<Object> navigation = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLUGINBASEURL = "pluginbaseurl";
  @SerializedName(SERIALIZED_NAME_PLUGINBASEURL)
  private String pluginbaseurl;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public ToolLpDataForUserEvidenceListPage200Response() {
  }

  public ToolLpDataForUserEvidenceListPage200Response canmanage(Boolean canmanage) {
    this.canmanage = canmanage;
    return this;
  }

   /**
   * Can the current user manage the user&#39;s evidence
   * @return canmanage
  **/
  @javax.annotation.Nonnull
  public Boolean getCanmanage() {
    return canmanage;
  }

  public void setCanmanage(Boolean canmanage) {
    this.canmanage = canmanage;
  }


  public ToolLpDataForUserEvidenceListPage200Response evidence(List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner> evidence) {
    this.evidence = evidence;
    return this;
  }

  public ToolLpDataForUserEvidenceListPage200Response addEvidenceItem(ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner evidenceItem) {
    if (this.evidence == null) {
      this.evidence = new ArrayList<>();
    }
    this.evidence.add(evidenceItem);
    return this;
  }

   /**
   * Get evidence
   * @return evidence
  **/
  @javax.annotation.Nonnull
  public List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner> getEvidence() {
    return evidence;
  }

  public void setEvidence(List<ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner> evidence) {
    this.evidence = evidence;
  }


  public ToolLpDataForUserEvidenceListPage200Response navigation(List<Object> navigation) {
    this.navigation = navigation;
    return this;
  }

  public ToolLpDataForUserEvidenceListPage200Response addNavigationItem(Object navigationItem) {
    if (this.navigation == null) {
      this.navigation = new ArrayList<>();
    }
    this.navigation.add(navigationItem);
    return this;
  }

   /**
   * Get navigation
   * @return navigation
  **/
  @javax.annotation.Nonnull
  public List<Object> getNavigation() {
    return navigation;
  }

  public void setNavigation(List<Object> navigation) {
    this.navigation = navigation;
  }


  public ToolLpDataForUserEvidenceListPage200Response pluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
    return this;
  }

   /**
   * Url to the tool_lp plugin folder on this Moodle site
   * @return pluginbaseurl
  **/
  @javax.annotation.Nonnull
  public String getPluginbaseurl() {
    return pluginbaseurl;
  }

  public void setPluginbaseurl(String pluginbaseurl) {
    this.pluginbaseurl = pluginbaseurl;
  }


  public ToolLpDataForUserEvidenceListPage200Response userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The user ID
   * @return userid
  **/
  @javax.annotation.Nonnull
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
    ToolLpDataForUserEvidenceListPage200Response toolLpDataForUserEvidenceListPage200Response = (ToolLpDataForUserEvidenceListPage200Response) o;
    return Objects.equals(this.canmanage, toolLpDataForUserEvidenceListPage200Response.canmanage) &&
        Objects.equals(this.evidence, toolLpDataForUserEvidenceListPage200Response.evidence) &&
        Objects.equals(this.navigation, toolLpDataForUserEvidenceListPage200Response.navigation) &&
        Objects.equals(this.pluginbaseurl, toolLpDataForUserEvidenceListPage200Response.pluginbaseurl) &&
        Objects.equals(this.userid, toolLpDataForUserEvidenceListPage200Response.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canmanage, evidence, navigation, pluginbaseurl, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForUserEvidenceListPage200Response {\n");
    sb.append("    canmanage: ").append(toIndentedString(canmanage)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
    sb.append("    pluginbaseurl: ").append(toIndentedString(pluginbaseurl)).append("\n");
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
    openapiFields.add("canmanage");
    openapiFields.add("evidence");
    openapiFields.add("navigation");
    openapiFields.add("pluginbaseurl");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canmanage");
    openapiRequiredFields.add("evidence");
    openapiRequiredFields.add("navigation");
    openapiRequiredFields.add("pluginbaseurl");
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForUserEvidenceListPage200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForUserEvidenceListPage200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForUserEvidenceListPage200Response is not found in the empty JSON string", ToolLpDataForUserEvidenceListPage200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForUserEvidenceListPage200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForUserEvidenceListPage200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForUserEvidenceListPage200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("evidence").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `evidence` to be an array in the JSON string but got `%s`", jsonObj.get("evidence").toString()));
      }

      JsonArray jsonArrayevidence = jsonObj.getAsJsonArray("evidence");
      // validate the required field `evidence` (array)
      for (int i = 0; i < jsonArrayevidence.size(); i++) {
        ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.validateJsonElement(jsonArrayevidence.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("navigation") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("navigation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `navigation` to be an array in the JSON string but got `%s`", jsonObj.get("navigation").toString()));
      }
      if (!jsonObj.get("pluginbaseurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginbaseurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluginbaseurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForUserEvidenceListPage200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForUserEvidenceListPage200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForUserEvidenceListPage200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForUserEvidenceListPage200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForUserEvidenceListPage200Response>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForUserEvidenceListPage200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForUserEvidenceListPage200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForUserEvidenceListPage200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForUserEvidenceListPage200Response
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForUserEvidenceListPage200Response
  */
  public static ToolLpDataForUserEvidenceListPage200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForUserEvidenceListPage200Response.class);
  }

 /**
  * Convert an instance of ToolLpDataForUserEvidenceListPage200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


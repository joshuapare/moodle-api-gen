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
import org.openapitools.client.model.ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner;

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
 * ToolLpDataForPlansPage200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolLpDataForPlansPage200Response {
  public static final String SERIALIZED_NAME_CANMANAGEUSERPLANS = "canmanageuserplans";
  @SerializedName(SERIALIZED_NAME_CANMANAGEUSERPLANS)
  private Boolean canmanageuserplans = null;

  public static final String SERIALIZED_NAME_CANREADUSEREVIDENCE = "canreaduserevidence";
  @SerializedName(SERIALIZED_NAME_CANREADUSEREVIDENCE)
  private Boolean canreaduserevidence = null;

  public static final String SERIALIZED_NAME_NAVIGATION = "navigation";
  @SerializedName(SERIALIZED_NAME_NAVIGATION)
  private List<Object> navigation = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLANS = "plans";
  @SerializedName(SERIALIZED_NAME_PLANS)
  private List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner> plans = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLUGINBASEURL = "pluginbaseurl";
  @SerializedName(SERIALIZED_NAME_PLUGINBASEURL)
  private String pluginbaseurl;

  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid = null;

  public ToolLpDataForPlansPage200Response() {
  }

  public ToolLpDataForPlansPage200Response canmanageuserplans(Boolean canmanageuserplans) {
    this.canmanageuserplans = canmanageuserplans;
    return this;
  }

   /**
   * Can the current user manage the user&#39;s plans
   * @return canmanageuserplans
  **/
  @javax.annotation.Nonnull
  public Boolean getCanmanageuserplans() {
    return canmanageuserplans;
  }

  public void setCanmanageuserplans(Boolean canmanageuserplans) {
    this.canmanageuserplans = canmanageuserplans;
  }


  public ToolLpDataForPlansPage200Response canreaduserevidence(Boolean canreaduserevidence) {
    this.canreaduserevidence = canreaduserevidence;
    return this;
  }

   /**
   * Can the current user view the user&#39;s evidence
   * @return canreaduserevidence
  **/
  @javax.annotation.Nonnull
  public Boolean getCanreaduserevidence() {
    return canreaduserevidence;
  }

  public void setCanreaduserevidence(Boolean canreaduserevidence) {
    this.canreaduserevidence = canreaduserevidence;
  }


  public ToolLpDataForPlansPage200Response navigation(List<Object> navigation) {
    this.navigation = navigation;
    return this;
  }

  public ToolLpDataForPlansPage200Response addNavigationItem(Object navigationItem) {
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


  public ToolLpDataForPlansPage200Response plans(List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner> plans) {
    this.plans = plans;
    return this;
  }

  public ToolLpDataForPlansPage200Response addPlansItem(ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @javax.annotation.Nonnull
  public List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner> getPlans() {
    return plans;
  }

  public void setPlans(List<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner> plans) {
    this.plans = plans;
  }


  public ToolLpDataForPlansPage200Response pluginbaseurl(String pluginbaseurl) {
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


  public ToolLpDataForPlansPage200Response userid(Integer userid) {
    this.userid = userid;
    return this;
  }

   /**
   * The learning plan user id
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
    ToolLpDataForPlansPage200Response toolLpDataForPlansPage200Response = (ToolLpDataForPlansPage200Response) o;
    return Objects.equals(this.canmanageuserplans, toolLpDataForPlansPage200Response.canmanageuserplans) &&
        Objects.equals(this.canreaduserevidence, toolLpDataForPlansPage200Response.canreaduserevidence) &&
        Objects.equals(this.navigation, toolLpDataForPlansPage200Response.navigation) &&
        Objects.equals(this.plans, toolLpDataForPlansPage200Response.plans) &&
        Objects.equals(this.pluginbaseurl, toolLpDataForPlansPage200Response.pluginbaseurl) &&
        Objects.equals(this.userid, toolLpDataForPlansPage200Response.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canmanageuserplans, canreaduserevidence, navigation, plans, pluginbaseurl, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolLpDataForPlansPage200Response {\n");
    sb.append("    canmanageuserplans: ").append(toIndentedString(canmanageuserplans)).append("\n");
    sb.append("    canreaduserevidence: ").append(toIndentedString(canreaduserevidence)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
    openapiFields.add("canmanageuserplans");
    openapiFields.add("canreaduserevidence");
    openapiFields.add("navigation");
    openapiFields.add("plans");
    openapiFields.add("pluginbaseurl");
    openapiFields.add("userid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canmanageuserplans");
    openapiRequiredFields.add("canreaduserevidence");
    openapiRequiredFields.add("navigation");
    openapiRequiredFields.add("plans");
    openapiRequiredFields.add("pluginbaseurl");
    openapiRequiredFields.add("userid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolLpDataForPlansPage200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolLpDataForPlansPage200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolLpDataForPlansPage200Response is not found in the empty JSON string", ToolLpDataForPlansPage200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolLpDataForPlansPage200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolLpDataForPlansPage200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ToolLpDataForPlansPage200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("navigation") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("navigation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `navigation` to be an array in the JSON string but got `%s`", jsonObj.get("navigation").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("plans").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `plans` to be an array in the JSON string but got `%s`", jsonObj.get("plans").toString()));
      }

      JsonArray jsonArrayplans = jsonObj.getAsJsonArray("plans");
      // validate the required field `plans` (array)
      for (int i = 0; i < jsonArrayplans.size(); i++) {
        ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.validateJsonElement(jsonArrayplans.get(i));
      };
      if (!jsonObj.get("pluginbaseurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginbaseurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluginbaseurl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolLpDataForPlansPage200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolLpDataForPlansPage200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolLpDataForPlansPage200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolLpDataForPlansPage200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolLpDataForPlansPage200Response>() {
           @Override
           public void write(JsonWriter out, ToolLpDataForPlansPage200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolLpDataForPlansPage200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolLpDataForPlansPage200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolLpDataForPlansPage200Response
  * @throws IOException if the JSON string is invalid with respect to ToolLpDataForPlansPage200Response
  */
  public static ToolLpDataForPlansPage200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolLpDataForPlansPage200Response.class);
  }

 /**
  * Convert an instance of ToolLpDataForPlansPage200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

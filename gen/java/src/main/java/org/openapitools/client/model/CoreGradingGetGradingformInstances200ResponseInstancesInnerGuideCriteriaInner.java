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
import java.math.BigDecimal;
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
 * CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner {
  public static final String SERIALIZED_NAME_CRITERIONID = "criterionid";
  @SerializedName(SERIALIZED_NAME_CRITERIONID)
  private Integer criterionid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_LEVELID = "levelid";
  @SerializedName(SERIALIZED_NAME_LEVELID)
  private Integer levelid;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = "null";

  public static final String SERIALIZED_NAME_REMARKFORMAT = "remarkformat";
  @SerializedName(SERIALIZED_NAME_REMARKFORMAT)
  private Integer remarkformat = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner() {
  }

  public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner criterionid(Integer criterionid) {
    this.criterionid = criterionid;
    return this;
  }

   /**
   * criterion id
   * @return criterionid
  **/
  @javax.annotation.Nullable
  public Integer getCriterionid() {
    return criterionid;
  }

  public void setCriterionid(Integer criterionid) {
    this.criterionid = criterionid;
  }


  public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * filling id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner levelid(Integer levelid) {
    this.levelid = levelid;
    return this;
  }

   /**
   * level id
   * @return levelid
  **/
  @javax.annotation.Nullable
  public Integer getLevelid() {
    return levelid;
  }

  public void setLevelid(Integer levelid) {
    this.levelid = levelid;
  }


  public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * remark
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner remarkformat(Integer remarkformat) {
    this.remarkformat = remarkformat;
    return this;
  }

   /**
   * remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return remarkformat
  **/
  @javax.annotation.Nullable
  public Integer getRemarkformat() {
    return remarkformat;
  }

  public void setRemarkformat(Integer remarkformat) {
    this.remarkformat = remarkformat;
  }


  public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner score(BigDecimal score) {
    this.score = score;
    return this;
  }

   /**
   * maximum score
   * @return score
  **/
  @javax.annotation.Nullable
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner coreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner = (CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner) o;
    return Objects.equals(this.criterionid, coreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.criterionid) &&
        Objects.equals(this.id, coreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.id) &&
        Objects.equals(this.levelid, coreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.levelid) &&
        Objects.equals(this.remark, coreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.remark) &&
        Objects.equals(this.remarkformat, coreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.remarkformat) &&
        Objects.equals(this.score, coreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionid, id, levelid, remark, remarkformat, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner {\n");
    sb.append("    criterionid: ").append(toIndentedString(criterionid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levelid: ").append(toIndentedString(levelid)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    remarkformat: ").append(toIndentedString(remarkformat)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("criterionid");
    openapiFields.add("id");
    openapiFields.add("levelid");
    openapiFields.add("remark");
    openapiFields.add("remarkformat");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner is not found in the empty JSON string", CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonNull()) && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner>() {
           @Override
           public void write(JsonWriter out, CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner
  * @throws IOException if the JSON string is invalid with respect to CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner
  */
  public static CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.class);
  }

 /**
  * Convert an instance of CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


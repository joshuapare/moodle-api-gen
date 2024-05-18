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
 * ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner {
  public static final String SERIALIZED_NAME_CRITERIONID = "criterionid";
  @SerializedName(SERIALIZED_NAME_CRITERIONID)
  private Integer criterionid;

  public static final String SERIALIZED_NAME_LEVELID = "levelid";
  @SerializedName(SERIALIZED_NAME_LEVELID)
  private Integer levelid;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_REMARKFORMAT = "remarkformat";
  @SerializedName(SERIALIZED_NAME_REMARKFORMAT)
  private Integer remarkformat;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner() {
  }

  public ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner criterionid(Integer criterionid) {
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


  public ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner levelid(Integer levelid) {
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


  public ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner remark(String remark) {
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


  public ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner remarkformat(Integer remarkformat) {
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


  public ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner score(BigDecimal score) {
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
    ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner modAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner = (ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner) o;
    return Objects.equals(this.criterionid, modAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.criterionid) &&
        Objects.equals(this.levelid, modAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.levelid) &&
        Objects.equals(this.remark, modAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.remark) &&
        Objects.equals(this.remarkformat, modAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.remarkformat) &&
        Objects.equals(this.score, modAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionid, levelid, remark, remarkformat, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner {\n");
    sb.append("    criterionid: ").append(toIndentedString(criterionid)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner is not found in the empty JSON string", ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner>() {
           @Override
           public void write(JsonWriter out, ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
  * @throws IOException if the JSON string is invalid with respect to ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner
  */
  public static ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.class);
  }

 /**
  * Convert an instance of ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


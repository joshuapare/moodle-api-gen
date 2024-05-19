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
 * GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTIONMARKERS = "descriptionmarkers";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONMARKERS)
  private String descriptionmarkers;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MAXSCORE = "maxscore";
  @SerializedName(SERIALIZED_NAME_MAXSCORE)
  private BigDecimal maxscore;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner() {
  }

  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the criterion
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner descriptionmarkers(String descriptionmarkers) {
    this.descriptionmarkers = descriptionmarkers;
    return this;
  }

   /**
   * The description of the criterion for markers
   * @return descriptionmarkers
  **/
  @javax.annotation.Nullable
  public String getDescriptionmarkers() {
    return descriptionmarkers;
  }

  public void setDescriptionmarkers(String descriptionmarkers) {
    this.descriptionmarkers = descriptionmarkers;
  }


  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the criterion
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner maxscore(BigDecimal maxscore) {
    this.maxscore = maxscore;
    return this;
  }

   /**
   * The maximum score for this criterion
   * @return maxscore
  **/
  @javax.annotation.Nullable
  public BigDecimal getMaxscore() {
    return maxscore;
  }

  public void setMaxscore(BigDecimal maxscore) {
    this.maxscore = maxscore;
  }


  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the criterion
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Any remarks for this criterion for the user being assessed
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner score(BigDecimal score) {
    this.score = score;
    return this;
  }

   /**
   * The current score for user being assessed
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
    GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner = (GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner) o;
    return Objects.equals(this.description, gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.description) &&
        Objects.equals(this.descriptionmarkers, gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.descriptionmarkers) &&
        Objects.equals(this.id, gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.id) &&
        Objects.equals(this.maxscore, gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.maxscore) &&
        Objects.equals(this.name, gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.name) &&
        Objects.equals(this.remark, gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.remark) &&
        Objects.equals(this.score, gradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionmarkers, id, maxscore, name, remark, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionmarkers: ").append(toIndentedString(descriptionmarkers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxscore: ").append(toIndentedString(maxscore)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("descriptionmarkers");
    openapiFields.add("id");
    openapiFields.add("maxscore");
    openapiFields.add("name");
    openapiFields.add("remark");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner is not found in the empty JSON string", GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("descriptionmarkers") != null && !jsonObj.get("descriptionmarkers").isJsonNull()) && !jsonObj.get("descriptionmarkers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionmarkers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionmarkers").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("remark") != null && !jsonObj.get("remark").isJsonNull()) && !jsonObj.get("remark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remark").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner>() {
           @Override
           public void write(JsonWriter out, GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
  * @throws IOException if the JSON string is invalid with respect to GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner
  */
  public static GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.class);
  }

 /**
  * Convert an instance of GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


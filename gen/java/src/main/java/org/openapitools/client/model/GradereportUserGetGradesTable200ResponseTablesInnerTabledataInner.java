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
import org.openapitools.client.model.GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage;
import org.openapitools.client.model.GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
import org.openapitools.client.model.GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname;
import org.openapitools.client.model.GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader;

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
 * table
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner {
  public static final String SERIALIZED_NAME_AVERAGE = "average";
  @SerializedName(SERIALIZED_NAME_AVERAGE)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage average;

  public static final String SERIALIZED_NAME_CONTRIBUTIONTOCOURSETOTAL = "contributiontocoursetotal";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTIONTOCOURSETOTAL)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal contributiontocoursetotal;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal feedback;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal grade;

  public static final String SERIALIZED_NAME_ITEMNAME = "itemname";
  @SerializedName(SERIALIZED_NAME_ITEMNAME)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname itemname;

  public static final String SERIALIZED_NAME_LEADER = "leader";
  @SerializedName(SERIALIZED_NAME_LEADER)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader leader;

  public static final String SERIALIZED_NAME_LETTERGRADE = "lettergrade";
  @SerializedName(SERIALIZED_NAME_LETTERGRADE)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal lettergrade;

  public static final String SERIALIZED_NAME_PARENTCATEGORIES = "parentcategories";
  @SerializedName(SERIALIZED_NAME_PARENTCATEGORIES)
  private List<Object> parentcategories = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal percentage;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal range;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal rank;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal weight;

  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner() {
  }

  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner average(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage average) {
    this.average = average;
    return this;
  }

   /**
   * Get average
   * @return average
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage getAverage() {
    return average;
  }

  public void setAverage(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage average) {
    this.average = average;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner contributiontocoursetotal(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal contributiontocoursetotal) {
    this.contributiontocoursetotal = contributiontocoursetotal;
    return this;
  }

   /**
   * Get contributiontocoursetotal
   * @return contributiontocoursetotal
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getContributiontocoursetotal() {
    return contributiontocoursetotal;
  }

  public void setContributiontocoursetotal(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal contributiontocoursetotal) {
    this.contributiontocoursetotal = contributiontocoursetotal;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner feedback(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal feedback) {
    this.feedback = feedback;
    return this;
  }

   /**
   * Get feedback
   * @return feedback
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getFeedback() {
    return feedback;
  }

  public void setFeedback(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal feedback) {
    this.feedback = feedback;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner grade(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getGrade() {
    return grade;
  }

  public void setGrade(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal grade) {
    this.grade = grade;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner itemname(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname itemname) {
    this.itemname = itemname;
    return this;
  }

   /**
   * Get itemname
   * @return itemname
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname getItemname() {
    return itemname;
  }

  public void setItemname(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname itemname) {
    this.itemname = itemname;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner leader(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader leader) {
    this.leader = leader;
    return this;
  }

   /**
   * Get leader
   * @return leader
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader getLeader() {
    return leader;
  }

  public void setLeader(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader leader) {
    this.leader = leader;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner lettergrade(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal lettergrade) {
    this.lettergrade = lettergrade;
    return this;
  }

   /**
   * Get lettergrade
   * @return lettergrade
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getLettergrade() {
    return lettergrade;
  }

  public void setLettergrade(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal lettergrade) {
    this.lettergrade = lettergrade;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner parentcategories(List<Object> parentcategories) {
    this.parentcategories = parentcategories;
    return this;
  }

  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner addParentcategoriesItem(Object parentcategoriesItem) {
    if (this.parentcategories == null) {
      this.parentcategories = new ArrayList<>();
    }
    this.parentcategories.add(parentcategoriesItem);
    return this;
  }

   /**
   * Get parentcategories
   * @return parentcategories
  **/
  @javax.annotation.Nullable
  public List<Object> getParentcategories() {
    return parentcategories;
  }

  public void setParentcategories(List<Object> parentcategories) {
    this.parentcategories = parentcategories;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner percentage(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getPercentage() {
    return percentage;
  }

  public void setPercentage(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal percentage) {
    this.percentage = percentage;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner range(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getRange() {
    return range;
  }

  public void setRange(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal range) {
    this.range = range;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner rank(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getRank() {
    return rank;
  }

  public void setRank(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal rank) {
    this.rank = rank;
  }


  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner weight(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal getWeight() {
    return weight;
  }

  public void setWeight(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner = (GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner) o;
    return Objects.equals(this.average, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.average) &&
        Objects.equals(this.contributiontocoursetotal, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.contributiontocoursetotal) &&
        Objects.equals(this.feedback, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.feedback) &&
        Objects.equals(this.grade, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.grade) &&
        Objects.equals(this.itemname, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.itemname) &&
        Objects.equals(this.leader, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.leader) &&
        Objects.equals(this.lettergrade, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.lettergrade) &&
        Objects.equals(this.parentcategories, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.parentcategories) &&
        Objects.equals(this.percentage, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.percentage) &&
        Objects.equals(this.range, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.range) &&
        Objects.equals(this.rank, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.rank) &&
        Objects.equals(this.weight, gradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, contributiontocoursetotal, feedback, grade, itemname, leader, lettergrade, parentcategories, percentage, range, rank, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner {\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    contributiontocoursetotal: ").append(toIndentedString(contributiontocoursetotal)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    itemname: ").append(toIndentedString(itemname)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    lettergrade: ").append(toIndentedString(lettergrade)).append("\n");
    sb.append("    parentcategories: ").append(toIndentedString(parentcategories)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("average");
    openapiFields.add("contributiontocoursetotal");
    openapiFields.add("feedback");
    openapiFields.add("grade");
    openapiFields.add("itemname");
    openapiFields.add("leader");
    openapiFields.add("lettergrade");
    openapiFields.add("parentcategories");
    openapiFields.add("percentage");
    openapiFields.add("range");
    openapiFields.add("rank");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner is not found in the empty JSON string", GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `average`
      if (jsonObj.get("average") != null && !jsonObj.get("average").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage.validateJsonElement(jsonObj.get("average"));
      }
      // validate the optional field `contributiontocoursetotal`
      if (jsonObj.get("contributiontocoursetotal") != null && !jsonObj.get("contributiontocoursetotal").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("contributiontocoursetotal"));
      }
      // validate the optional field `feedback`
      if (jsonObj.get("feedback") != null && !jsonObj.get("feedback").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("feedback"));
      }
      // validate the optional field `grade`
      if (jsonObj.get("grade") != null && !jsonObj.get("grade").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("grade"));
      }
      // validate the optional field `itemname`
      if (jsonObj.get("itemname") != null && !jsonObj.get("itemname").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname.validateJsonElement(jsonObj.get("itemname"));
      }
      // validate the optional field `leader`
      if (jsonObj.get("leader") != null && !jsonObj.get("leader").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader.validateJsonElement(jsonObj.get("leader"));
      }
      // validate the optional field `lettergrade`
      if (jsonObj.get("lettergrade") != null && !jsonObj.get("lettergrade").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("lettergrade"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("parentcategories") != null && !jsonObj.get("parentcategories").isJsonNull() && !jsonObj.get("parentcategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentcategories` to be an array in the JSON string but got `%s`", jsonObj.get("parentcategories").toString()));
      }
      // validate the optional field `percentage`
      if (jsonObj.get("percentage") != null && !jsonObj.get("percentage").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("percentage"));
      }
      // validate the optional field `range`
      if (jsonObj.get("range") != null && !jsonObj.get("range").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("range"));
      }
      // validate the optional field `rank`
      if (jsonObj.get("rank") != null && !jsonObj.get("rank").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("rank"));
      }
      // validate the optional field `weight`
      if (jsonObj.get("weight") != null && !jsonObj.get("weight").isJsonNull()) {
        GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.validateJsonElement(jsonObj.get("weight"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner>() {
           @Override
           public void write(JsonWriter out, GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
  * @throws IOException if the JSON string is invalid with respect to GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner
  */
  public static GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.class);
  }

 /**
  * Convert an instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon;

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
 * CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner {
  public static final String SERIALIZED_NAME_HEADING = "heading";
  @SerializedName(SERIALIZED_NAME_HEADING)
  private String heading = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MOVETITLE = "movetitle";
  @SerializedName(SERIALIZED_NAME_MOVETITLE)
  private String movetitle = "null";

  public static final String SERIALIZED_NAME_SORTDIRECTION = "sortdirection";
  @SerializedName(SERIALIZED_NAME_SORTDIRECTION)
  private Integer sortdirection = null;

  public static final String SERIALIZED_NAME_SORTENABLED = "sortenabled";
  @SerializedName(SERIALIZED_NAME_SORTENABLED)
  private Boolean sortenabled = null;

  public static final String SERIALIZED_NAME_SORTENABLEDTITLE = "sortenabledtitle";
  @SerializedName(SERIALIZED_NAME_SORTENABLEDTITLE)
  private String sortenabledtitle = "null";

  public static final String SERIALIZED_NAME_SORTICON = "sorticon";
  @SerializedName(SERIALIZED_NAME_SORTICON)
  private CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon sorticon;

  public static final String SERIALIZED_NAME_SORTORDER = "sortorder";
  @SerializedName(SERIALIZED_NAME_SORTORDER)
  private Integer sortorder;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner() {
  }

  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner heading(String heading) {
    this.heading = heading;
    return this;
  }

   /**
   * heading
   * @return heading
  **/
  @javax.annotation.Nullable
  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner movetitle(String movetitle) {
    this.movetitle = movetitle;
    return this;
  }

   /**
   * movetitle
   * @return movetitle
  **/
  @javax.annotation.Nullable
  public String getMovetitle() {
    return movetitle;
  }

  public void setMovetitle(String movetitle) {
    this.movetitle = movetitle;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner sortdirection(Integer sortdirection) {
    this.sortdirection = sortdirection;
    return this;
  }

   /**
   * sortdirection
   * @return sortdirection
  **/
  @javax.annotation.Nullable
  public Integer getSortdirection() {
    return sortdirection;
  }

  public void setSortdirection(Integer sortdirection) {
    this.sortdirection = sortdirection;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner sortenabled(Boolean sortenabled) {
    this.sortenabled = sortenabled;
    return this;
  }

   /**
   * sortenabled
   * @return sortenabled
  **/
  @javax.annotation.Nullable
  public Boolean getSortenabled() {
    return sortenabled;
  }

  public void setSortenabled(Boolean sortenabled) {
    this.sortenabled = sortenabled;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner sortenabledtitle(String sortenabledtitle) {
    this.sortenabledtitle = sortenabledtitle;
    return this;
  }

   /**
   * sortenabledtitle
   * @return sortenabledtitle
  **/
  @javax.annotation.Nullable
  public String getSortenabledtitle() {
    return sortenabledtitle;
  }

  public void setSortenabledtitle(String sortenabledtitle) {
    this.sortenabledtitle = sortenabledtitle;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner sorticon(CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon sorticon) {
    this.sorticon = sorticon;
    return this;
  }

   /**
   * Get sorticon
   * @return sorticon
  **/
  @javax.annotation.Nullable
  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon getSorticon() {
    return sorticon;
  }

  public void setSorticon(CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon sorticon) {
    this.sorticon = sorticon;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner sortorder(Integer sortorder) {
    this.sortorder = sortorder;
    return this;
  }

   /**
   * sortorder
   * @return sortorder
  **/
  @javax.annotation.Nullable
  public Integer getSortorder() {
    return sortorder;
  }

  public void setSortorder(Integer sortorder) {
    this.sortorder = sortorder;
  }


  public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner = (CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner) o;
    return Objects.equals(this.heading, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.heading) &&
        Objects.equals(this.id, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.id) &&
        Objects.equals(this.movetitle, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.movetitle) &&
        Objects.equals(this.sortdirection, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.sortdirection) &&
        Objects.equals(this.sortenabled, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.sortenabled) &&
        Objects.equals(this.sortenabledtitle, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.sortenabledtitle) &&
        Objects.equals(this.sorticon, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.sorticon) &&
        Objects.equals(this.sortorder, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.sortorder) &&
        Objects.equals(this.title, coreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, id, movetitle, sortdirection, sortenabled, sortenabledtitle, sorticon, sortorder, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner {\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    movetitle: ").append(toIndentedString(movetitle)).append("\n");
    sb.append("    sortdirection: ").append(toIndentedString(sortdirection)).append("\n");
    sb.append("    sortenabled: ").append(toIndentedString(sortenabled)).append("\n");
    sb.append("    sortenabledtitle: ").append(toIndentedString(sortenabledtitle)).append("\n");
    sb.append("    sorticon: ").append(toIndentedString(sorticon)).append("\n");
    sb.append("    sortorder: ").append(toIndentedString(sortorder)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("heading");
    openapiFields.add("id");
    openapiFields.add("movetitle");
    openapiFields.add("sortdirection");
    openapiFields.add("sortenabled");
    openapiFields.add("sortenabledtitle");
    openapiFields.add("sorticon");
    openapiFields.add("sortorder");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner is not found in the empty JSON string", CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("heading") != null && !jsonObj.get("heading").isJsonNull()) && !jsonObj.get("heading").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `heading` to be a primitive type in the JSON string but got `%s`", jsonObj.get("heading").toString()));
      }
      if ((jsonObj.get("movetitle") != null && !jsonObj.get("movetitle").isJsonNull()) && !jsonObj.get("movetitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `movetitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("movetitle").toString()));
      }
      if ((jsonObj.get("sortenabledtitle") != null && !jsonObj.get("sortenabledtitle").isJsonNull()) && !jsonObj.get("sortenabledtitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortenabledtitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortenabledtitle").toString()));
      }
      // validate the optional field `sorticon`
      if (jsonObj.get("sorticon") != null && !jsonObj.get("sorticon").isJsonNull()) {
        CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon.validateJsonElement(jsonObj.get("sorticon"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner>() {
           @Override
           public void write(JsonWriter out, CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner
  * @throws IOException if the JSON string is invalid with respect to CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner
  */
  public static CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.class);
  }

 /**
  * Convert an instance of CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


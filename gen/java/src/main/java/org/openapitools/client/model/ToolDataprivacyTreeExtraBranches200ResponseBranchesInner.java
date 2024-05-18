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
import org.openapitools.client.model.ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner;

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
 * Node structure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ToolDataprivacyTreeExtraBranches200ResponseBranchesInner {
  public static final String SERIALIZED_NAME_BRANCHES = "branches";
  @SerializedName(SERIALIZED_NAME_BRANCHES)
  private List<ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner> branches = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTEXTID = "contextid";
  @SerializedName(SERIALIZED_NAME_CONTEXTID)
  private Integer contextid;

  public static final String SERIALIZED_NAME_CONTEXTLEVEL = "contextlevel";
  @SerializedName(SERIALIZED_NAME_CONTEXTLEVEL)
  private Integer contextlevel;

  public static final String SERIALIZED_NAME_EXPANDCONTEXTID = "expandcontextid";
  @SerializedName(SERIALIZED_NAME_EXPANDCONTEXTID)
  private Integer expandcontextid;

  public static final String SERIALIZED_NAME_EXPANDED = "expanded";
  @SerializedName(SERIALIZED_NAME_EXPANDED)
  private Integer expanded;

  public static final String SERIALIZED_NAME_EXPANDELEMENT = "expandelement";
  @SerializedName(SERIALIZED_NAME_EXPANDELEMENT)
  private String expandelement;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner() {
  }

  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner branches(List<ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner> branches) {
    this.branches = branches;
    return this;
  }

  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner addBranchesItem(ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

   /**
   * Get branches
   * @return branches
  **/
  @javax.annotation.Nullable
  public List<ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner> getBranches() {
    return branches;
  }

  public void setBranches(List<ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner> branches) {
    this.branches = branches;
  }


  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner contextid(Integer contextid) {
    this.contextid = contextid;
    return this;
  }

   /**
   * The node contextid
   * @return contextid
  **/
  @javax.annotation.Nullable
  public Integer getContextid() {
    return contextid;
  }

  public void setContextid(Integer contextid) {
    this.contextid = contextid;
  }


  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner contextlevel(Integer contextlevel) {
    this.contextlevel = contextlevel;
    return this;
  }

   /**
   * The node contextlevel
   * @return contextlevel
  **/
  @javax.annotation.Nullable
  public Integer getContextlevel() {
    return contextlevel;
  }

  public void setContextlevel(Integer contextlevel) {
    this.contextlevel = contextlevel;
  }


  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner expandcontextid(Integer expandcontextid) {
    this.expandcontextid = expandcontextid;
    return this;
  }

   /**
   * The contextid this node expands
   * @return expandcontextid
  **/
  @javax.annotation.Nullable
  public Integer getExpandcontextid() {
    return expandcontextid;
  }

  public void setExpandcontextid(Integer expandcontextid) {
    this.expandcontextid = expandcontextid;
  }


  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner expanded(Integer expanded) {
    this.expanded = expanded;
    return this;
  }

   /**
   * Is it expanded
   * @return expanded
  **/
  @javax.annotation.Nullable
  public Integer getExpanded() {
    return expanded;
  }

  public void setExpanded(Integer expanded) {
    this.expanded = expanded;
  }


  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner expandelement(String expandelement) {
    this.expandelement = expandelement;
    return this;
  }

   /**
   * What element is this node expanded to
   * @return expandelement
  **/
  @javax.annotation.Nullable
  public String getExpandelement() {
    return expandelement;
  }

  public void setExpandelement(String expandelement) {
    this.expandelement = expandelement;
  }


  public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The node text
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolDataprivacyTreeExtraBranches200ResponseBranchesInner toolDataprivacyTreeExtraBranches200ResponseBranchesInner = (ToolDataprivacyTreeExtraBranches200ResponseBranchesInner) o;
    return Objects.equals(this.branches, toolDataprivacyTreeExtraBranches200ResponseBranchesInner.branches) &&
        Objects.equals(this.contextid, toolDataprivacyTreeExtraBranches200ResponseBranchesInner.contextid) &&
        Objects.equals(this.contextlevel, toolDataprivacyTreeExtraBranches200ResponseBranchesInner.contextlevel) &&
        Objects.equals(this.expandcontextid, toolDataprivacyTreeExtraBranches200ResponseBranchesInner.expandcontextid) &&
        Objects.equals(this.expanded, toolDataprivacyTreeExtraBranches200ResponseBranchesInner.expanded) &&
        Objects.equals(this.expandelement, toolDataprivacyTreeExtraBranches200ResponseBranchesInner.expandelement) &&
        Objects.equals(this.text, toolDataprivacyTreeExtraBranches200ResponseBranchesInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches, contextid, contextlevel, expandcontextid, expanded, expandelement, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolDataprivacyTreeExtraBranches200ResponseBranchesInner {\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    contextid: ").append(toIndentedString(contextid)).append("\n");
    sb.append("    contextlevel: ").append(toIndentedString(contextlevel)).append("\n");
    sb.append("    expandcontextid: ").append(toIndentedString(expandcontextid)).append("\n");
    sb.append("    expanded: ").append(toIndentedString(expanded)).append("\n");
    sb.append("    expandelement: ").append(toIndentedString(expandelement)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("branches");
    openapiFields.add("contextid");
    openapiFields.add("contextlevel");
    openapiFields.add("expandcontextid");
    openapiFields.add("expanded");
    openapiFields.add("expandelement");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ToolDataprivacyTreeExtraBranches200ResponseBranchesInner is not found in the empty JSON string", ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ToolDataprivacyTreeExtraBranches200ResponseBranchesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("branches") != null && !jsonObj.get("branches").isJsonNull()) {
        JsonArray jsonArraybranches = jsonObj.getAsJsonArray("branches");
        if (jsonArraybranches != null) {
          // ensure the json data is an array
          if (!jsonObj.get("branches").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `branches` to be an array in the JSON string but got `%s`", jsonObj.get("branches").toString()));
          }

          // validate the optional field `branches` (array)
          for (int i = 0; i < jsonArraybranches.size(); i++) {
            ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner.validateJsonElement(jsonArraybranches.get(i));
          };
        }
      }
      if ((jsonObj.get("expandelement") != null && !jsonObj.get("expandelement").isJsonNull()) && !jsonObj.get("expandelement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expandelement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expandelement").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolDataprivacyTreeExtraBranches200ResponseBranchesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolDataprivacyTreeExtraBranches200ResponseBranchesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolDataprivacyTreeExtraBranches200ResponseBranchesInner>() {
           @Override
           public void write(JsonWriter out, ToolDataprivacyTreeExtraBranches200ResponseBranchesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolDataprivacyTreeExtraBranches200ResponseBranchesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolDataprivacyTreeExtraBranches200ResponseBranchesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
  * @throws IOException if the JSON string is invalid with respect to ToolDataprivacyTreeExtraBranches200ResponseBranchesInner
  */
  public static ToolDataprivacyTreeExtraBranches200ResponseBranchesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.class);
  }

 /**
  * Convert an instance of ToolDataprivacyTreeExtraBranches200ResponseBranchesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

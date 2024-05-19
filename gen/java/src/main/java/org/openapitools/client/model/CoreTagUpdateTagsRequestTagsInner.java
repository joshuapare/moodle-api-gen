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
 * CoreTagUpdateTagsRequestTagsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreTagUpdateTagsRequestTagsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTIONFORMAT = "descriptionformat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONFORMAT)
  private Integer descriptionformat = null;

  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private Integer flag;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ISSTANDARD = "isstandard";
  @SerializedName(SERIALIZED_NAME_ISSTANDARD)
  private Integer isstandard;

  public static final String SERIALIZED_NAME_OFFICIAL = "official";
  @SerializedName(SERIALIZED_NAME_OFFICIAL)
  private Integer official = null;

  public static final String SERIALIZED_NAME_RAWNAME = "rawname";
  @SerializedName(SERIALIZED_NAME_RAWNAME)
  private String rawname;

  public CoreTagUpdateTagsRequestTagsInner() {
  }

  public CoreTagUpdateTagsRequestTagsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * tag description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CoreTagUpdateTagsRequestTagsInner descriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
    return this;
  }

   /**
   * tag description format
   * @return descriptionformat
  **/
  @javax.annotation.Nullable
  public Integer getDescriptionformat() {
    return descriptionformat;
  }

  public void setDescriptionformat(Integer descriptionformat) {
    this.descriptionformat = descriptionformat;
  }


  public CoreTagUpdateTagsRequestTagsInner flag(Integer flag) {
    this.flag = flag;
    return this;
  }

   /**
   * flag
   * @return flag
  **/
  @javax.annotation.Nullable
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }


  public CoreTagUpdateTagsRequestTagsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * tag id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreTagUpdateTagsRequestTagsInner isstandard(Integer isstandard) {
    this.isstandard = isstandard;
    return this;
  }

   /**
   * whether this flag is standard
   * @return isstandard
  **/
  @javax.annotation.Nullable
  public Integer getIsstandard() {
    return isstandard;
  }

  public void setIsstandard(Integer isstandard) {
    this.isstandard = isstandard;
  }


  public CoreTagUpdateTagsRequestTagsInner official(Integer official) {
    this.official = official;
    return this;
  }

   /**
   * (deprecated, use isstandard) whether this flag is standard
   * @return official
  **/
  @javax.annotation.Nullable
  public Integer getOfficial() {
    return official;
  }

  public void setOfficial(Integer official) {
    this.official = official;
  }


  public CoreTagUpdateTagsRequestTagsInner rawname(String rawname) {
    this.rawname = rawname;
    return this;
  }

   /**
   * tag raw name (may contain capital letters)
   * @return rawname
  **/
  @javax.annotation.Nullable
  public String getRawname() {
    return rawname;
  }

  public void setRawname(String rawname) {
    this.rawname = rawname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreTagUpdateTagsRequestTagsInner coreTagUpdateTagsRequestTagsInner = (CoreTagUpdateTagsRequestTagsInner) o;
    return Objects.equals(this.description, coreTagUpdateTagsRequestTagsInner.description) &&
        Objects.equals(this.descriptionformat, coreTagUpdateTagsRequestTagsInner.descriptionformat) &&
        Objects.equals(this.flag, coreTagUpdateTagsRequestTagsInner.flag) &&
        Objects.equals(this.id, coreTagUpdateTagsRequestTagsInner.id) &&
        Objects.equals(this.isstandard, coreTagUpdateTagsRequestTagsInner.isstandard) &&
        Objects.equals(this.official, coreTagUpdateTagsRequestTagsInner.official) &&
        Objects.equals(this.rawname, coreTagUpdateTagsRequestTagsInner.rawname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionformat, flag, id, isstandard, official, rawname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreTagUpdateTagsRequestTagsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionformat: ").append(toIndentedString(descriptionformat)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isstandard: ").append(toIndentedString(isstandard)).append("\n");
    sb.append("    official: ").append(toIndentedString(official)).append("\n");
    sb.append("    rawname: ").append(toIndentedString(rawname)).append("\n");
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
    openapiFields.add("descriptionformat");
    openapiFields.add("flag");
    openapiFields.add("id");
    openapiFields.add("isstandard");
    openapiFields.add("official");
    openapiFields.add("rawname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreTagUpdateTagsRequestTagsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreTagUpdateTagsRequestTagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreTagUpdateTagsRequestTagsInner is not found in the empty JSON string", CoreTagUpdateTagsRequestTagsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreTagUpdateTagsRequestTagsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreTagUpdateTagsRequestTagsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("rawname") != null && !jsonObj.get("rawname").isJsonNull()) && !jsonObj.get("rawname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreTagUpdateTagsRequestTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreTagUpdateTagsRequestTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreTagUpdateTagsRequestTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreTagUpdateTagsRequestTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreTagUpdateTagsRequestTagsInner>() {
           @Override
           public void write(JsonWriter out, CoreTagUpdateTagsRequestTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreTagUpdateTagsRequestTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreTagUpdateTagsRequestTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreTagUpdateTagsRequestTagsInner
  * @throws IOException if the JSON string is invalid with respect to CoreTagUpdateTagsRequestTagsInner
  */
  public static CoreTagUpdateTagsRequestTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreTagUpdateTagsRequestTagsInner.class);
  }

 /**
  * Convert an instance of CoreTagUpdateTagsRequestTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


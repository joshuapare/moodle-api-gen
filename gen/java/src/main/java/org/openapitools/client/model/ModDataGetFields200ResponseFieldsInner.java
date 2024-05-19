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
 * ModDataGetFields200ResponseFieldsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModDataGetFields200ResponseFieldsInner {
  public static final String SERIALIZED_NAME_DATAID = "dataid";
  @SerializedName(SERIALIZED_NAME_DATAID)
  private Integer dataid = 0;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PARAM1 = "param1";
  @SerializedName(SERIALIZED_NAME_PARAM1)
  private String param1 = "null";

  public static final String SERIALIZED_NAME_PARAM2 = "param2";
  @SerializedName(SERIALIZED_NAME_PARAM2)
  private String param2;

  public static final String SERIALIZED_NAME_PARAM3 = "param3";
  @SerializedName(SERIALIZED_NAME_PARAM3)
  private String param3;

  public static final String SERIALIZED_NAME_PARAM4 = "param4";
  @SerializedName(SERIALIZED_NAME_PARAM4)
  private String param4;

  public static final String SERIALIZED_NAME_PARAM5 = "param5";
  @SerializedName(SERIALIZED_NAME_PARAM5)
  private String param5;

  public static final String SERIALIZED_NAME_PARAM6 = "param6";
  @SerializedName(SERIALIZED_NAME_PARAM6)
  private String param6;

  public static final String SERIALIZED_NAME_PARAM7 = "param7";
  @SerializedName(SERIALIZED_NAME_PARAM7)
  private String param7;

  public static final String SERIALIZED_NAME_PARAM8 = "param8";
  @SerializedName(SERIALIZED_NAME_PARAM8)
  private String param8;

  public static final String SERIALIZED_NAME_PARAM9 = "param9";
  @SerializedName(SERIALIZED_NAME_PARAM9)
  private String param9;

  public static final String SERIALIZED_NAME_PARAM10 = "param10";
  @SerializedName(SERIALIZED_NAME_PARAM10)
  private String param10;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required = 0;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "null";

  public ModDataGetFields200ResponseFieldsInner() {
  }

  public ModDataGetFields200ResponseFieldsInner dataid(Integer dataid) {
    this.dataid = dataid;
    return this;
  }

   /**
   * The field type of the content.
   * @return dataid
  **/
  @javax.annotation.Nullable
  public Integer getDataid() {
    return dataid;
  }

  public void setDataid(Integer dataid) {
    this.dataid = dataid;
  }


  public ModDataGetFields200ResponseFieldsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The field description.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ModDataGetFields200ResponseFieldsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Field id.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModDataGetFields200ResponseFieldsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The field name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModDataGetFields200ResponseFieldsInner param1(String param1) {
    this.param1 = param1;
    return this;
  }

   /**
   * Field parameters
   * @return param1
  **/
  @javax.annotation.Nullable
  public String getParam1() {
    return param1;
  }

  public void setParam1(String param1) {
    this.param1 = param1;
  }


  public ModDataGetFields200ResponseFieldsInner param2(String param2) {
    this.param2 = param2;
    return this;
  }

   /**
   * Field parameters
   * @return param2
  **/
  @javax.annotation.Nullable
  public String getParam2() {
    return param2;
  }

  public void setParam2(String param2) {
    this.param2 = param2;
  }


  public ModDataGetFields200ResponseFieldsInner param3(String param3) {
    this.param3 = param3;
    return this;
  }

   /**
   * Field parameters
   * @return param3
  **/
  @javax.annotation.Nullable
  public String getParam3() {
    return param3;
  }

  public void setParam3(String param3) {
    this.param3 = param3;
  }


  public ModDataGetFields200ResponseFieldsInner param4(String param4) {
    this.param4 = param4;
    return this;
  }

   /**
   * Field parameters
   * @return param4
  **/
  @javax.annotation.Nullable
  public String getParam4() {
    return param4;
  }

  public void setParam4(String param4) {
    this.param4 = param4;
  }


  public ModDataGetFields200ResponseFieldsInner param5(String param5) {
    this.param5 = param5;
    return this;
  }

   /**
   * Field parameters
   * @return param5
  **/
  @javax.annotation.Nullable
  public String getParam5() {
    return param5;
  }

  public void setParam5(String param5) {
    this.param5 = param5;
  }


  public ModDataGetFields200ResponseFieldsInner param6(String param6) {
    this.param6 = param6;
    return this;
  }

   /**
   * Field parameters
   * @return param6
  **/
  @javax.annotation.Nullable
  public String getParam6() {
    return param6;
  }

  public void setParam6(String param6) {
    this.param6 = param6;
  }


  public ModDataGetFields200ResponseFieldsInner param7(String param7) {
    this.param7 = param7;
    return this;
  }

   /**
   * Field parameters
   * @return param7
  **/
  @javax.annotation.Nullable
  public String getParam7() {
    return param7;
  }

  public void setParam7(String param7) {
    this.param7 = param7;
  }


  public ModDataGetFields200ResponseFieldsInner param8(String param8) {
    this.param8 = param8;
    return this;
  }

   /**
   * Field parameters
   * @return param8
  **/
  @javax.annotation.Nullable
  public String getParam8() {
    return param8;
  }

  public void setParam8(String param8) {
    this.param8 = param8;
  }


  public ModDataGetFields200ResponseFieldsInner param9(String param9) {
    this.param9 = param9;
    return this;
  }

   /**
   * Field parameters
   * @return param9
  **/
  @javax.annotation.Nullable
  public String getParam9() {
    return param9;
  }

  public void setParam9(String param9) {
    this.param9 = param9;
  }


  public ModDataGetFields200ResponseFieldsInner param10(String param10) {
    this.param10 = param10;
    return this;
  }

   /**
   * Field parameters
   * @return param10
  **/
  @javax.annotation.Nullable
  public String getParam10() {
    return param10;
  }

  public void setParam10(String param10) {
    this.param10 = param10;
  }


  public ModDataGetFields200ResponseFieldsInner required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether is a field required or not.
   * @return required
  **/
  @javax.annotation.Nullable
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  public ModDataGetFields200ResponseFieldsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The field type.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModDataGetFields200ResponseFieldsInner modDataGetFields200ResponseFieldsInner = (ModDataGetFields200ResponseFieldsInner) o;
    return Objects.equals(this.dataid, modDataGetFields200ResponseFieldsInner.dataid) &&
        Objects.equals(this.description, modDataGetFields200ResponseFieldsInner.description) &&
        Objects.equals(this.id, modDataGetFields200ResponseFieldsInner.id) &&
        Objects.equals(this.name, modDataGetFields200ResponseFieldsInner.name) &&
        Objects.equals(this.param1, modDataGetFields200ResponseFieldsInner.param1) &&
        Objects.equals(this.param2, modDataGetFields200ResponseFieldsInner.param2) &&
        Objects.equals(this.param3, modDataGetFields200ResponseFieldsInner.param3) &&
        Objects.equals(this.param4, modDataGetFields200ResponseFieldsInner.param4) &&
        Objects.equals(this.param5, modDataGetFields200ResponseFieldsInner.param5) &&
        Objects.equals(this.param6, modDataGetFields200ResponseFieldsInner.param6) &&
        Objects.equals(this.param7, modDataGetFields200ResponseFieldsInner.param7) &&
        Objects.equals(this.param8, modDataGetFields200ResponseFieldsInner.param8) &&
        Objects.equals(this.param9, modDataGetFields200ResponseFieldsInner.param9) &&
        Objects.equals(this.param10, modDataGetFields200ResponseFieldsInner.param10) &&
        Objects.equals(this.required, modDataGetFields200ResponseFieldsInner.required) &&
        Objects.equals(this.type, modDataGetFields200ResponseFieldsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataid, description, id, name, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, required, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModDataGetFields200ResponseFieldsInner {\n");
    sb.append("    dataid: ").append(toIndentedString(dataid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    param1: ").append(toIndentedString(param1)).append("\n");
    sb.append("    param2: ").append(toIndentedString(param2)).append("\n");
    sb.append("    param3: ").append(toIndentedString(param3)).append("\n");
    sb.append("    param4: ").append(toIndentedString(param4)).append("\n");
    sb.append("    param5: ").append(toIndentedString(param5)).append("\n");
    sb.append("    param6: ").append(toIndentedString(param6)).append("\n");
    sb.append("    param7: ").append(toIndentedString(param7)).append("\n");
    sb.append("    param8: ").append(toIndentedString(param8)).append("\n");
    sb.append("    param9: ").append(toIndentedString(param9)).append("\n");
    sb.append("    param10: ").append(toIndentedString(param10)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("dataid");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("param1");
    openapiFields.add("param2");
    openapiFields.add("param3");
    openapiFields.add("param4");
    openapiFields.add("param5");
    openapiFields.add("param6");
    openapiFields.add("param7");
    openapiFields.add("param8");
    openapiFields.add("param9");
    openapiFields.add("param10");
    openapiFields.add("required");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModDataGetFields200ResponseFieldsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModDataGetFields200ResponseFieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModDataGetFields200ResponseFieldsInner is not found in the empty JSON string", ModDataGetFields200ResponseFieldsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModDataGetFields200ResponseFieldsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModDataGetFields200ResponseFieldsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("param1") != null && !jsonObj.get("param1").isJsonNull()) && !jsonObj.get("param1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param1").toString()));
      }
      if ((jsonObj.get("param2") != null && !jsonObj.get("param2").isJsonNull()) && !jsonObj.get("param2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param2").toString()));
      }
      if ((jsonObj.get("param3") != null && !jsonObj.get("param3").isJsonNull()) && !jsonObj.get("param3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param3").toString()));
      }
      if ((jsonObj.get("param4") != null && !jsonObj.get("param4").isJsonNull()) && !jsonObj.get("param4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param4").toString()));
      }
      if ((jsonObj.get("param5") != null && !jsonObj.get("param5").isJsonNull()) && !jsonObj.get("param5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param5").toString()));
      }
      if ((jsonObj.get("param6") != null && !jsonObj.get("param6").isJsonNull()) && !jsonObj.get("param6").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param6` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param6").toString()));
      }
      if ((jsonObj.get("param7") != null && !jsonObj.get("param7").isJsonNull()) && !jsonObj.get("param7").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param7` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param7").toString()));
      }
      if ((jsonObj.get("param8") != null && !jsonObj.get("param8").isJsonNull()) && !jsonObj.get("param8").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param8` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param8").toString()));
      }
      if ((jsonObj.get("param9") != null && !jsonObj.get("param9").isJsonNull()) && !jsonObj.get("param9").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param9` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param9").toString()));
      }
      if ((jsonObj.get("param10") != null && !jsonObj.get("param10").isJsonNull()) && !jsonObj.get("param10").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param10` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param10").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModDataGetFields200ResponseFieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModDataGetFields200ResponseFieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModDataGetFields200ResponseFieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModDataGetFields200ResponseFieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModDataGetFields200ResponseFieldsInner>() {
           @Override
           public void write(JsonWriter out, ModDataGetFields200ResponseFieldsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModDataGetFields200ResponseFieldsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModDataGetFields200ResponseFieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModDataGetFields200ResponseFieldsInner
  * @throws IOException if the JSON string is invalid with respect to ModDataGetFields200ResponseFieldsInner
  */
  public static ModDataGetFields200ResponseFieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModDataGetFields200ResponseFieldsInner.class);
  }

 /**
  * Convert an instance of ModDataGetFields200ResponseFieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


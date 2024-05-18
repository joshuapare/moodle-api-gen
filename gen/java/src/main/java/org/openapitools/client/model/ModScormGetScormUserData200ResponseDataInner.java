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
import org.openapitools.client.model.ModScormGetScormUserData200ResponseDataInnerDefaultdataInner;

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
 * SCO data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModScormGetScormUserData200ResponseDataInner {
  public static final String SERIALIZED_NAME_DEFAULTDATA = "defaultdata";
  @SerializedName(SERIALIZED_NAME_DEFAULTDATA)
  private List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> defaultdata = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCOID = "scoid";
  @SerializedName(SERIALIZED_NAME_SCOID)
  private Integer scoid;

  public static final String SERIALIZED_NAME_USERDATA = "userdata";
  @SerializedName(SERIALIZED_NAME_USERDATA)
  private List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> userdata = new ArrayList<>();

  public ModScormGetScormUserData200ResponseDataInner() {
  }

  public ModScormGetScormUserData200ResponseDataInner defaultdata(List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> defaultdata) {
    this.defaultdata = defaultdata;
    return this;
  }

  public ModScormGetScormUserData200ResponseDataInner addDefaultdataItem(ModScormGetScormUserData200ResponseDataInnerDefaultdataInner defaultdataItem) {
    if (this.defaultdata == null) {
      this.defaultdata = new ArrayList<>();
    }
    this.defaultdata.add(defaultdataItem);
    return this;
  }

   /**
   * Get defaultdata
   * @return defaultdata
  **/
  @javax.annotation.Nullable
  public List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> getDefaultdata() {
    return defaultdata;
  }

  public void setDefaultdata(List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> defaultdata) {
    this.defaultdata = defaultdata;
  }


  public ModScormGetScormUserData200ResponseDataInner scoid(Integer scoid) {
    this.scoid = scoid;
    return this;
  }

   /**
   * sco id
   * @return scoid
  **/
  @javax.annotation.Nullable
  public Integer getScoid() {
    return scoid;
  }

  public void setScoid(Integer scoid) {
    this.scoid = scoid;
  }


  public ModScormGetScormUserData200ResponseDataInner userdata(List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> userdata) {
    this.userdata = userdata;
    return this;
  }

  public ModScormGetScormUserData200ResponseDataInner addUserdataItem(ModScormGetScormUserData200ResponseDataInnerDefaultdataInner userdataItem) {
    if (this.userdata == null) {
      this.userdata = new ArrayList<>();
    }
    this.userdata.add(userdataItem);
    return this;
  }

   /**
   * Get userdata
   * @return userdata
  **/
  @javax.annotation.Nullable
  public List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> getUserdata() {
    return userdata;
  }

  public void setUserdata(List<ModScormGetScormUserData200ResponseDataInnerDefaultdataInner> userdata) {
    this.userdata = userdata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModScormGetScormUserData200ResponseDataInner modScormGetScormUserData200ResponseDataInner = (ModScormGetScormUserData200ResponseDataInner) o;
    return Objects.equals(this.defaultdata, modScormGetScormUserData200ResponseDataInner.defaultdata) &&
        Objects.equals(this.scoid, modScormGetScormUserData200ResponseDataInner.scoid) &&
        Objects.equals(this.userdata, modScormGetScormUserData200ResponseDataInner.userdata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultdata, scoid, userdata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModScormGetScormUserData200ResponseDataInner {\n");
    sb.append("    defaultdata: ").append(toIndentedString(defaultdata)).append("\n");
    sb.append("    scoid: ").append(toIndentedString(scoid)).append("\n");
    sb.append("    userdata: ").append(toIndentedString(userdata)).append("\n");
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
    openapiFields.add("defaultdata");
    openapiFields.add("scoid");
    openapiFields.add("userdata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModScormGetScormUserData200ResponseDataInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModScormGetScormUserData200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModScormGetScormUserData200ResponseDataInner is not found in the empty JSON string", ModScormGetScormUserData200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModScormGetScormUserData200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModScormGetScormUserData200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("defaultdata") != null && !jsonObj.get("defaultdata").isJsonNull()) {
        JsonArray jsonArraydefaultdata = jsonObj.getAsJsonArray("defaultdata");
        if (jsonArraydefaultdata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("defaultdata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `defaultdata` to be an array in the JSON string but got `%s`", jsonObj.get("defaultdata").toString()));
          }

          // validate the optional field `defaultdata` (array)
          for (int i = 0; i < jsonArraydefaultdata.size(); i++) {
            ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.validateJsonElement(jsonArraydefaultdata.get(i));
          };
        }
      }
      if (jsonObj.get("userdata") != null && !jsonObj.get("userdata").isJsonNull()) {
        JsonArray jsonArrayuserdata = jsonObj.getAsJsonArray("userdata");
        if (jsonArrayuserdata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("userdata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `userdata` to be an array in the JSON string but got `%s`", jsonObj.get("userdata").toString()));
          }

          // validate the optional field `userdata` (array)
          for (int i = 0; i < jsonArrayuserdata.size(); i++) {
            ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.validateJsonElement(jsonArrayuserdata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModScormGetScormUserData200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModScormGetScormUserData200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModScormGetScormUserData200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModScormGetScormUserData200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModScormGetScormUserData200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, ModScormGetScormUserData200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModScormGetScormUserData200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModScormGetScormUserData200ResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModScormGetScormUserData200ResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to ModScormGetScormUserData200ResponseDataInner
  */
  public static ModScormGetScormUserData200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModScormGetScormUserData200ResponseDataInner.class);
  }

 /**
  * Convert an instance of ModScormGetScormUserData200ResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

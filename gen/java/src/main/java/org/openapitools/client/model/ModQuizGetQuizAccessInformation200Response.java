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
import org.openapitools.client.model.AuthEmailSignupUser200ResponseWarningsInner;

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
 * ModQuizGetQuizAccessInformation200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModQuizGetQuizAccessInformation200Response {
  public static final String SERIALIZED_NAME_ACCESSRULES = "accessrules";
  @SerializedName(SERIALIZED_NAME_ACCESSRULES)
  private List<Object> accessrules = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTIVERULENAMES = "activerulenames";
  @SerializedName(SERIALIZED_NAME_ACTIVERULENAMES)
  private List<Object> activerulenames = new ArrayList<>();

  public static final String SERIALIZED_NAME_CANATTEMPT = "canattempt";
  @SerializedName(SERIALIZED_NAME_CANATTEMPT)
  private Boolean canattempt = null;

  public static final String SERIALIZED_NAME_CANMANAGE = "canmanage";
  @SerializedName(SERIALIZED_NAME_CANMANAGE)
  private Boolean canmanage = null;

  public static final String SERIALIZED_NAME_CANPREVIEW = "canpreview";
  @SerializedName(SERIALIZED_NAME_CANPREVIEW)
  private Boolean canpreview = null;

  public static final String SERIALIZED_NAME_CANREVIEWMYATTEMPTS = "canreviewmyattempts";
  @SerializedName(SERIALIZED_NAME_CANREVIEWMYATTEMPTS)
  private Boolean canreviewmyattempts = null;

  public static final String SERIALIZED_NAME_CANVIEWREPORTS = "canviewreports";
  @SerializedName(SERIALIZED_NAME_CANVIEWREPORTS)
  private Boolean canviewreports = null;

  public static final String SERIALIZED_NAME_PREVENTACCESSREASONS = "preventaccessreasons";
  @SerializedName(SERIALIZED_NAME_PREVENTACCESSREASONS)
  private List<Object> preventaccessreasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public ModQuizGetQuizAccessInformation200Response() {
  }

  public ModQuizGetQuizAccessInformation200Response accessrules(List<Object> accessrules) {
    this.accessrules = accessrules;
    return this;
  }

  public ModQuizGetQuizAccessInformation200Response addAccessrulesItem(Object accessrulesItem) {
    if (this.accessrules == null) {
      this.accessrules = new ArrayList<>();
    }
    this.accessrules.add(accessrulesItem);
    return this;
  }

   /**
   * Get accessrules
   * @return accessrules
  **/
  @javax.annotation.Nonnull
  public List<Object> getAccessrules() {
    return accessrules;
  }

  public void setAccessrules(List<Object> accessrules) {
    this.accessrules = accessrules;
  }


  public ModQuizGetQuizAccessInformation200Response activerulenames(List<Object> activerulenames) {
    this.activerulenames = activerulenames;
    return this;
  }

  public ModQuizGetQuizAccessInformation200Response addActiverulenamesItem(Object activerulenamesItem) {
    if (this.activerulenames == null) {
      this.activerulenames = new ArrayList<>();
    }
    this.activerulenames.add(activerulenamesItem);
    return this;
  }

   /**
   * Get activerulenames
   * @return activerulenames
  **/
  @javax.annotation.Nonnull
  public List<Object> getActiverulenames() {
    return activerulenames;
  }

  public void setActiverulenames(List<Object> activerulenames) {
    this.activerulenames = activerulenames;
  }


  public ModQuizGetQuizAccessInformation200Response canattempt(Boolean canattempt) {
    this.canattempt = canattempt;
    return this;
  }

   /**
   * Whether the user can do the quiz or not.
   * @return canattempt
  **/
  @javax.annotation.Nonnull
  public Boolean getCanattempt() {
    return canattempt;
  }

  public void setCanattempt(Boolean canattempt) {
    this.canattempt = canattempt;
  }


  public ModQuizGetQuizAccessInformation200Response canmanage(Boolean canmanage) {
    this.canmanage = canmanage;
    return this;
  }

   /**
   * Whether the user can edit the quiz settings or not.
   * @return canmanage
  **/
  @javax.annotation.Nonnull
  public Boolean getCanmanage() {
    return canmanage;
  }

  public void setCanmanage(Boolean canmanage) {
    this.canmanage = canmanage;
  }


  public ModQuizGetQuizAccessInformation200Response canpreview(Boolean canpreview) {
    this.canpreview = canpreview;
    return this;
  }

   /**
   * Whether the user can preview the quiz or not.
   * @return canpreview
  **/
  @javax.annotation.Nonnull
  public Boolean getCanpreview() {
    return canpreview;
  }

  public void setCanpreview(Boolean canpreview) {
    this.canpreview = canpreview;
  }


  public ModQuizGetQuizAccessInformation200Response canreviewmyattempts(Boolean canreviewmyattempts) {
    this.canreviewmyattempts = canreviewmyattempts;
    return this;
  }

   /**
   * Whether the users can review their previous attempts                                                                 or not.
   * @return canreviewmyattempts
  **/
  @javax.annotation.Nonnull
  public Boolean getCanreviewmyattempts() {
    return canreviewmyattempts;
  }

  public void setCanreviewmyattempts(Boolean canreviewmyattempts) {
    this.canreviewmyattempts = canreviewmyattempts;
  }


  public ModQuizGetQuizAccessInformation200Response canviewreports(Boolean canviewreports) {
    this.canviewreports = canviewreports;
    return this;
  }

   /**
   * Whether the user can view the quiz reports or not.
   * @return canviewreports
  **/
  @javax.annotation.Nonnull
  public Boolean getCanviewreports() {
    return canviewreports;
  }

  public void setCanviewreports(Boolean canviewreports) {
    this.canviewreports = canviewreports;
  }


  public ModQuizGetQuizAccessInformation200Response preventaccessreasons(List<Object> preventaccessreasons) {
    this.preventaccessreasons = preventaccessreasons;
    return this;
  }

  public ModQuizGetQuizAccessInformation200Response addPreventaccessreasonsItem(Object preventaccessreasonsItem) {
    if (this.preventaccessreasons == null) {
      this.preventaccessreasons = new ArrayList<>();
    }
    this.preventaccessreasons.add(preventaccessreasonsItem);
    return this;
  }

   /**
   * Get preventaccessreasons
   * @return preventaccessreasons
  **/
  @javax.annotation.Nonnull
  public List<Object> getPreventaccessreasons() {
    return preventaccessreasons;
  }

  public void setPreventaccessreasons(List<Object> preventaccessreasons) {
    this.preventaccessreasons = preventaccessreasons;
  }


  public ModQuizGetQuizAccessInformation200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ModQuizGetQuizAccessInformation200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  public List<AuthEmailSignupUser200ResponseWarningsInner> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModQuizGetQuizAccessInformation200Response modQuizGetQuizAccessInformation200Response = (ModQuizGetQuizAccessInformation200Response) o;
    return Objects.equals(this.accessrules, modQuizGetQuizAccessInformation200Response.accessrules) &&
        Objects.equals(this.activerulenames, modQuizGetQuizAccessInformation200Response.activerulenames) &&
        Objects.equals(this.canattempt, modQuizGetQuizAccessInformation200Response.canattempt) &&
        Objects.equals(this.canmanage, modQuizGetQuizAccessInformation200Response.canmanage) &&
        Objects.equals(this.canpreview, modQuizGetQuizAccessInformation200Response.canpreview) &&
        Objects.equals(this.canreviewmyattempts, modQuizGetQuizAccessInformation200Response.canreviewmyattempts) &&
        Objects.equals(this.canviewreports, modQuizGetQuizAccessInformation200Response.canviewreports) &&
        Objects.equals(this.preventaccessreasons, modQuizGetQuizAccessInformation200Response.preventaccessreasons) &&
        Objects.equals(this.warnings, modQuizGetQuizAccessInformation200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessrules, activerulenames, canattempt, canmanage, canpreview, canreviewmyattempts, canviewreports, preventaccessreasons, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModQuizGetQuizAccessInformation200Response {\n");
    sb.append("    accessrules: ").append(toIndentedString(accessrules)).append("\n");
    sb.append("    activerulenames: ").append(toIndentedString(activerulenames)).append("\n");
    sb.append("    canattempt: ").append(toIndentedString(canattempt)).append("\n");
    sb.append("    canmanage: ").append(toIndentedString(canmanage)).append("\n");
    sb.append("    canpreview: ").append(toIndentedString(canpreview)).append("\n");
    sb.append("    canreviewmyattempts: ").append(toIndentedString(canreviewmyattempts)).append("\n");
    sb.append("    canviewreports: ").append(toIndentedString(canviewreports)).append("\n");
    sb.append("    preventaccessreasons: ").append(toIndentedString(preventaccessreasons)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("accessrules");
    openapiFields.add("activerulenames");
    openapiFields.add("canattempt");
    openapiFields.add("canmanage");
    openapiFields.add("canpreview");
    openapiFields.add("canreviewmyattempts");
    openapiFields.add("canviewreports");
    openapiFields.add("preventaccessreasons");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accessrules");
    openapiRequiredFields.add("activerulenames");
    openapiRequiredFields.add("canattempt");
    openapiRequiredFields.add("canmanage");
    openapiRequiredFields.add("canpreview");
    openapiRequiredFields.add("canreviewmyattempts");
    openapiRequiredFields.add("canviewreports");
    openapiRequiredFields.add("preventaccessreasons");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModQuizGetQuizAccessInformation200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModQuizGetQuizAccessInformation200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModQuizGetQuizAccessInformation200Response is not found in the empty JSON string", ModQuizGetQuizAccessInformation200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModQuizGetQuizAccessInformation200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModQuizGetQuizAccessInformation200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModQuizGetQuizAccessInformation200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("accessrules") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("accessrules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessrules` to be an array in the JSON string but got `%s`", jsonObj.get("accessrules").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("activerulenames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("activerulenames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `activerulenames` to be an array in the JSON string but got `%s`", jsonObj.get("activerulenames").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("preventaccessreasons") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("preventaccessreasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preventaccessreasons` to be an array in the JSON string but got `%s`", jsonObj.get("preventaccessreasons").toString()));
      }
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) {
        JsonArray jsonArraywarnings = jsonObj.getAsJsonArray("warnings");
        if (jsonArraywarnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
          }

          // validate the optional field `warnings` (array)
          for (int i = 0; i < jsonArraywarnings.size(); i++) {
            AuthEmailSignupUser200ResponseWarningsInner.validateJsonElement(jsonArraywarnings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModQuizGetQuizAccessInformation200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModQuizGetQuizAccessInformation200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModQuizGetQuizAccessInformation200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModQuizGetQuizAccessInformation200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ModQuizGetQuizAccessInformation200Response>() {
           @Override
           public void write(JsonWriter out, ModQuizGetQuizAccessInformation200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModQuizGetQuizAccessInformation200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModQuizGetQuizAccessInformation200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModQuizGetQuizAccessInformation200Response
  * @throws IOException if the JSON string is invalid with respect to ModQuizGetQuizAccessInformation200Response
  */
  public static ModQuizGetQuizAccessInformation200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModQuizGetQuizAccessInformation200Response.class);
  }

 /**
  * Convert an instance of ModQuizGetQuizAccessInformation200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * CoreMoodlenetGetSharedCourseInfo200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreMoodlenetGetSharedCourseInfo200Response {
  public static final String SERIALIZED_NAME_ISSUERID = "issuerid";
  @SerializedName(SERIALIZED_NAME_ISSUERID)
  private Integer issuerid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Boolean status;

  public static final String SERIALIZED_NAME_SUPPORTPAGEURL = "supportpageurl";
  @SerializedName(SERIALIZED_NAME_SUPPORTPAGEURL)
  private String supportpageurl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "null";

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AuthEmailSignupUser200ResponseWarningsInner> warnings = new ArrayList<>();

  public CoreMoodlenetGetSharedCourseInfo200Response() {
  }

  public CoreMoodlenetGetSharedCourseInfo200Response issuerid(Integer issuerid) {
    this.issuerid = issuerid;
    return this;
  }

   /**
   * MoodleNet issuer id
   * @return issuerid
  **/
  @javax.annotation.Nonnull
  public Integer getIssuerid() {
    return issuerid;
  }

  public void setIssuerid(Integer issuerid) {
    this.issuerid = issuerid;
  }


  public CoreMoodlenetGetSharedCourseInfo200Response name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Course short name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreMoodlenetGetSharedCourseInfo200Response server(String server) {
    this.server = server;
    return this;
  }

   /**
   * MoodleNet server
   * @return server
  **/
  @javax.annotation.Nonnull
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  public CoreMoodlenetGetSharedCourseInfo200Response status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * status: true if success
   * @return status
  **/
  @javax.annotation.Nonnull
  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }


  public CoreMoodlenetGetSharedCourseInfo200Response supportpageurl(String supportpageurl) {
    this.supportpageurl = supportpageurl;
    return this;
  }

   /**
   * Support page URL
   * @return supportpageurl
  **/
  @javax.annotation.Nonnull
  public String getSupportpageurl() {
    return supportpageurl;
  }

  public void setSupportpageurl(String supportpageurl) {
    this.supportpageurl = supportpageurl;
  }


  public CoreMoodlenetGetSharedCourseInfo200Response type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Course type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CoreMoodlenetGetSharedCourseInfo200Response warnings(List<AuthEmailSignupUser200ResponseWarningsInner> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CoreMoodlenetGetSharedCourseInfo200Response addWarningsItem(AuthEmailSignupUser200ResponseWarningsInner warningsItem) {
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
    CoreMoodlenetGetSharedCourseInfo200Response coreMoodlenetGetSharedCourseInfo200Response = (CoreMoodlenetGetSharedCourseInfo200Response) o;
    return Objects.equals(this.issuerid, coreMoodlenetGetSharedCourseInfo200Response.issuerid) &&
        Objects.equals(this.name, coreMoodlenetGetSharedCourseInfo200Response.name) &&
        Objects.equals(this.server, coreMoodlenetGetSharedCourseInfo200Response.server) &&
        Objects.equals(this.status, coreMoodlenetGetSharedCourseInfo200Response.status) &&
        Objects.equals(this.supportpageurl, coreMoodlenetGetSharedCourseInfo200Response.supportpageurl) &&
        Objects.equals(this.type, coreMoodlenetGetSharedCourseInfo200Response.type) &&
        Objects.equals(this.warnings, coreMoodlenetGetSharedCourseInfo200Response.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerid, name, server, status, supportpageurl, type, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreMoodlenetGetSharedCourseInfo200Response {\n");
    sb.append("    issuerid: ").append(toIndentedString(issuerid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supportpageurl: ").append(toIndentedString(supportpageurl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("issuerid");
    openapiFields.add("name");
    openapiFields.add("server");
    openapiFields.add("status");
    openapiFields.add("supportpageurl");
    openapiFields.add("type");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issuerid");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("server");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("supportpageurl");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreMoodlenetGetSharedCourseInfo200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreMoodlenetGetSharedCourseInfo200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreMoodlenetGetSharedCourseInfo200Response is not found in the empty JSON string", CoreMoodlenetGetSharedCourseInfo200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreMoodlenetGetSharedCourseInfo200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreMoodlenetGetSharedCourseInfo200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreMoodlenetGetSharedCourseInfo200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if (!jsonObj.get("supportpageurl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportpageurl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportpageurl").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
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
       if (!CoreMoodlenetGetSharedCourseInfo200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreMoodlenetGetSharedCourseInfo200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreMoodlenetGetSharedCourseInfo200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreMoodlenetGetSharedCourseInfo200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreMoodlenetGetSharedCourseInfo200Response>() {
           @Override
           public void write(JsonWriter out, CoreMoodlenetGetSharedCourseInfo200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreMoodlenetGetSharedCourseInfo200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreMoodlenetGetSharedCourseInfo200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreMoodlenetGetSharedCourseInfo200Response
  * @throws IOException if the JSON string is invalid with respect to CoreMoodlenetGetSharedCourseInfo200Response
  */
  public static CoreMoodlenetGetSharedCourseInfo200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreMoodlenetGetSharedCourseInfo200Response.class);
  }

 /**
  * Convert an instance of CoreMoodlenetGetSharedCourseInfo200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

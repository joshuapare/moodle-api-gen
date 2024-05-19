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
 * CoreCourseAddContentItemToUserFavourites200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T20:58:28.689161-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CoreCourseAddContentItemToUserFavourites200Response {
  public static final String SERIALIZED_NAME_ARCHETYPE = "archetype";
  @SerializedName(SERIALIZED_NAME_ARCHETYPE)
  private String archetype = "null";

  public static final String SERIALIZED_NAME_COMPONENTNAME = "componentname";
  @SerializedName(SERIALIZED_NAME_COMPONENTNAME)
  private String componentname = "null";

  public static final String SERIALIZED_NAME_FAVOURITE = "favourite";
  @SerializedName(SERIALIZED_NAME_FAVOURITE)
  private Boolean favourite = null;

  public static final String SERIALIZED_NAME_HELP = "help";
  @SerializedName(SERIALIZED_NAME_HELP)
  private String help = "null";

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon = "null";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = null;

  public static final String SERIALIZED_NAME_LEGACYITEM = "legacyitem";
  @SerializedName(SERIALIZED_NAME_LEGACYITEM)
  private Boolean legacyitem = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = "null";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "null";

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private String purpose = "null";

  public static final String SERIALIZED_NAME_RECOMMENDED = "recommended";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED)
  private Boolean recommended = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = "null";

  public CoreCourseAddContentItemToUserFavourites200Response() {
  }

  public CoreCourseAddContentItemToUserFavourites200Response archetype(String archetype) {
    this.archetype = archetype;
    return this;
  }

   /**
   * The archetype of the module exposing the content item
   * @return archetype
  **/
  @javax.annotation.Nonnull
  public String getArchetype() {
    return archetype;
  }

  public void setArchetype(String archetype) {
    this.archetype = archetype;
  }


  public CoreCourseAddContentItemToUserFavourites200Response componentname(String componentname) {
    this.componentname = componentname;
    return this;
  }

   /**
   * The name of the component exposing the content item
   * @return componentname
  **/
  @javax.annotation.Nonnull
  public String getComponentname() {
    return componentname;
  }

  public void setComponentname(String componentname) {
    this.componentname = componentname;
  }


  public CoreCourseAddContentItemToUserFavourites200Response favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

   /**
   * Has the user favourited the content item
   * @return favourite
  **/
  @javax.annotation.Nonnull
  public Boolean getFavourite() {
    return favourite;
  }

  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }


  public CoreCourseAddContentItemToUserFavourites200Response help(String help) {
    this.help = help;
    return this;
  }

   /**
   * Html description / help for the content item
   * @return help
  **/
  @javax.annotation.Nonnull
  public String getHelp() {
    return help;
  }

  public void setHelp(String help) {
    this.help = help;
  }


  public CoreCourseAddContentItemToUserFavourites200Response icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Html containing the icon for the content item
   * @return icon
  **/
  @javax.annotation.Nonnull
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public CoreCourseAddContentItemToUserFavourites200Response id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the content item
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CoreCourseAddContentItemToUserFavourites200Response legacyitem(Boolean legacyitem) {
    this.legacyitem = legacyitem;
    return this;
  }

   /**
   * If this item was pulled from the old callback and has no item id.
   * @return legacyitem
  **/
  @javax.annotation.Nonnull
  public Boolean getLegacyitem() {
    return legacyitem;
  }

  public void setLegacyitem(Boolean legacyitem) {
    this.legacyitem = legacyitem;
  }


  public CoreCourseAddContentItemToUserFavourites200Response link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The link to the content item creation page
   * @return link
  **/
  @javax.annotation.Nonnull
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  public CoreCourseAddContentItemToUserFavourites200Response name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the content item
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CoreCourseAddContentItemToUserFavourites200Response purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the component exposing the content item
   * @return purpose
  **/
  @javax.annotation.Nonnull
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public CoreCourseAddContentItemToUserFavourites200Response recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Has this item been recommended
   * @return recommended
  **/
  @javax.annotation.Nonnull
  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }


  public CoreCourseAddContentItemToUserFavourites200Response title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The string title of the content item, human readable
   * @return title
  **/
  @javax.annotation.Nonnull
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
    CoreCourseAddContentItemToUserFavourites200Response coreCourseAddContentItemToUserFavourites200Response = (CoreCourseAddContentItemToUserFavourites200Response) o;
    return Objects.equals(this.archetype, coreCourseAddContentItemToUserFavourites200Response.archetype) &&
        Objects.equals(this.componentname, coreCourseAddContentItemToUserFavourites200Response.componentname) &&
        Objects.equals(this.favourite, coreCourseAddContentItemToUserFavourites200Response.favourite) &&
        Objects.equals(this.help, coreCourseAddContentItemToUserFavourites200Response.help) &&
        Objects.equals(this.icon, coreCourseAddContentItemToUserFavourites200Response.icon) &&
        Objects.equals(this.id, coreCourseAddContentItemToUserFavourites200Response.id) &&
        Objects.equals(this.legacyitem, coreCourseAddContentItemToUserFavourites200Response.legacyitem) &&
        Objects.equals(this.link, coreCourseAddContentItemToUserFavourites200Response.link) &&
        Objects.equals(this.name, coreCourseAddContentItemToUserFavourites200Response.name) &&
        Objects.equals(this.purpose, coreCourseAddContentItemToUserFavourites200Response.purpose) &&
        Objects.equals(this.recommended, coreCourseAddContentItemToUserFavourites200Response.recommended) &&
        Objects.equals(this.title, coreCourseAddContentItemToUserFavourites200Response.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archetype, componentname, favourite, help, icon, id, legacyitem, link, name, purpose, recommended, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCourseAddContentItemToUserFavourites200Response {\n");
    sb.append("    archetype: ").append(toIndentedString(archetype)).append("\n");
    sb.append("    componentname: ").append(toIndentedString(componentname)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legacyitem: ").append(toIndentedString(legacyitem)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
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
    openapiFields.add("archetype");
    openapiFields.add("componentname");
    openapiFields.add("favourite");
    openapiFields.add("help");
    openapiFields.add("icon");
    openapiFields.add("id");
    openapiFields.add("legacyitem");
    openapiFields.add("link");
    openapiFields.add("name");
    openapiFields.add("purpose");
    openapiFields.add("recommended");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("archetype");
    openapiRequiredFields.add("componentname");
    openapiRequiredFields.add("favourite");
    openapiRequiredFields.add("help");
    openapiRequiredFields.add("icon");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("legacyitem");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("purpose");
    openapiRequiredFields.add("recommended");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CoreCourseAddContentItemToUserFavourites200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreCourseAddContentItemToUserFavourites200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreCourseAddContentItemToUserFavourites200Response is not found in the empty JSON string", CoreCourseAddContentItemToUserFavourites200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreCourseAddContentItemToUserFavourites200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreCourseAddContentItemToUserFavourites200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreCourseAddContentItemToUserFavourites200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("archetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `archetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("archetype").toString()));
      }
      if (!jsonObj.get("componentname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentname").toString()));
      }
      if (!jsonObj.get("help").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `help` to be a primitive type in the JSON string but got `%s`", jsonObj.get("help").toString()));
      }
      if (!jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (!jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreCourseAddContentItemToUserFavourites200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreCourseAddContentItemToUserFavourites200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreCourseAddContentItemToUserFavourites200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreCourseAddContentItemToUserFavourites200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreCourseAddContentItemToUserFavourites200Response>() {
           @Override
           public void write(JsonWriter out, CoreCourseAddContentItemToUserFavourites200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreCourseAddContentItemToUserFavourites200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreCourseAddContentItemToUserFavourites200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreCourseAddContentItemToUserFavourites200Response
  * @throws IOException if the JSON string is invalid with respect to CoreCourseAddContentItemToUserFavourites200Response
  */
  public static CoreCourseAddContentItemToUserFavourites200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreCourseAddContentItemToUserFavourites200Response.class);
  }

 /**
  * Convert an instance of CoreCourseAddContentItemToUserFavourites200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


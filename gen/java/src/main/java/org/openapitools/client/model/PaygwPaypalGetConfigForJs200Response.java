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
 * PaygwPaypalGetConfigForJs200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class PaygwPaypalGetConfigForJs200Response {
  public static final String SERIALIZED_NAME_BRANDNAME = "brandname";
  @SerializedName(SERIALIZED_NAME_BRANDNAME)
  private String brandname = "null";

  public static final String SERIALIZED_NAME_CLIENTID = "clientid";
  @SerializedName(SERIALIZED_NAME_CLIENTID)
  private String clientid = "null";

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private BigDecimal cost = new BigDecimal("null");

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency = "null";

  public PaygwPaypalGetConfigForJs200Response() {
  }

  public PaygwPaypalGetConfigForJs200Response brandname(String brandname) {
    this.brandname = brandname;
    return this;
  }

   /**
   * Brand name
   * @return brandname
  **/
  @javax.annotation.Nonnull
  public String getBrandname() {
    return brandname;
  }

  public void setBrandname(String brandname) {
    this.brandname = brandname;
  }


  public PaygwPaypalGetConfigForJs200Response clientid(String clientid) {
    this.clientid = clientid;
    return this;
  }

   /**
   * PayPal client ID
   * @return clientid
  **/
  @javax.annotation.Nonnull
  public String getClientid() {
    return clientid;
  }

  public void setClientid(String clientid) {
    this.clientid = clientid;
  }


  public PaygwPaypalGetConfigForJs200Response cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Cost with gateway surcharge
   * @return cost
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }


  public PaygwPaypalGetConfigForJs200Response currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaygwPaypalGetConfigForJs200Response paygwPaypalGetConfigForJs200Response = (PaygwPaypalGetConfigForJs200Response) o;
    return Objects.equals(this.brandname, paygwPaypalGetConfigForJs200Response.brandname) &&
        Objects.equals(this.clientid, paygwPaypalGetConfigForJs200Response.clientid) &&
        Objects.equals(this.cost, paygwPaypalGetConfigForJs200Response.cost) &&
        Objects.equals(this.currency, paygwPaypalGetConfigForJs200Response.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandname, clientid, cost, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaygwPaypalGetConfigForJs200Response {\n");
    sb.append("    brandname: ").append(toIndentedString(brandname)).append("\n");
    sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("brandname");
    openapiFields.add("clientid");
    openapiFields.add("cost");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brandname");
    openapiRequiredFields.add("clientid");
    openapiRequiredFields.add("cost");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaygwPaypalGetConfigForJs200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaygwPaypalGetConfigForJs200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaygwPaypalGetConfigForJs200Response is not found in the empty JSON string", PaygwPaypalGetConfigForJs200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaygwPaypalGetConfigForJs200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaygwPaypalGetConfigForJs200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaygwPaypalGetConfigForJs200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("brandname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandname").toString()));
      }
      if (!jsonObj.get("clientid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientid").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaygwPaypalGetConfigForJs200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaygwPaypalGetConfigForJs200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaygwPaypalGetConfigForJs200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaygwPaypalGetConfigForJs200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PaygwPaypalGetConfigForJs200Response>() {
           @Override
           public void write(JsonWriter out, PaygwPaypalGetConfigForJs200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaygwPaypalGetConfigForJs200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaygwPaypalGetConfigForJs200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaygwPaypalGetConfigForJs200Response
  * @throws IOException if the JSON string is invalid with respect to PaygwPaypalGetConfigForJs200Response
  */
  public static PaygwPaypalGetConfigForJs200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaygwPaypalGetConfigForJs200Response.class);
  }

 /**
  * Convert an instance of PaygwPaypalGetConfigForJs200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


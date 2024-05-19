# AuthEmailApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authEmailGetSignupSettings**](AuthEmailApi.md#authEmailGetSignupSettings) | **POST** /auth_email_get_signup_settings | Get the signup required settings and profile fields. |
| [**authEmailSignupUser**](AuthEmailApi.md#authEmailSignupUser) | **POST** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site. |


<a id="authEmailGetSignupSettings"></a>
# **authEmailGetSignupSettings**
> AuthEmailGetSignupSettings200Response authEmailGetSignupSettings()

Get the signup required settings and profile fields.

Get the signup required settings and profile fields.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.AuthEmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    AuthEmailApi apiInstance = new AuthEmailApi(defaultClient);
    try {
      AuthEmailGetSignupSettings200Response result = apiInstance.authEmailGetSignupSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthEmailApi#authEmailGetSignupSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthEmailGetSignupSettings200Response**](AuthEmailGetSignupSettings200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

<a id="authEmailSignupUser"></a>
# **authEmailSignupUser**
> AuthEmailSignupUser200Response authEmailSignupUser(authEmailSignupUserRequest)

Adds a new user (pendingto be confirmed) in the site.

Adds a new user (pendingto be confirmed) in the site.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.AuthEmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    AuthEmailApi apiInstance = new AuthEmailApi(defaultClient);
    AuthEmailSignupUserRequest authEmailSignupUserRequest = new AuthEmailSignupUserRequest(); // AuthEmailSignupUserRequest | 
    try {
      AuthEmailSignupUser200Response result = apiInstance.authEmailSignupUser(authEmailSignupUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthEmailApi#authEmailSignupUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authEmailSignupUserRequest** | [**AuthEmailSignupUserRequest**](AuthEmailSignupUserRequest.md)|  | |

### Return type

[**AuthEmailSignupUser200Response**](AuthEmailSignupUser200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |


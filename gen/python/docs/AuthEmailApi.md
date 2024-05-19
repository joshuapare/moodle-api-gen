# openapi_client.AuthEmailApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth_email_get_signup_settings**](AuthEmailApi.md#auth_email_get_signup_settings) | **POST** /auth_email_get_signup_settings | Get the signup required settings and profile fields.
[**auth_email_signup_user**](AuthEmailApi.md#auth_email_signup_user) | **POST** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site.


# **auth_email_get_signup_settings**
> AuthEmailGetSignupSettings200Response auth_email_get_signup_settings()

Get the signup required settings and profile fields.

Get the signup required settings and profile fields.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.auth_email_get_signup_settings200_response import AuthEmailGetSignupSettings200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthEmailApi(api_client)

    try:
        # Get the signup required settings and profile fields.
        api_response = api_instance.auth_email_get_signup_settings()
        print("The response of AuthEmailApi->auth_email_get_signup_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthEmailApi->auth_email_get_signup_settings: %s\n" % e)
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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **auth_email_signup_user**
> AuthEmailSignupUser200Response auth_email_signup_user(auth_email_signup_user_request)

Adds a new user (pendingto be confirmed) in the site.

Adds a new user (pendingto be confirmed) in the site.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.auth_email_signup_user200_response import AuthEmailSignupUser200Response
from openapi_client.models.auth_email_signup_user_request import AuthEmailSignupUserRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthEmailApi(api_client)
    auth_email_signup_user_request = openapi_client.AuthEmailSignupUserRequest() # AuthEmailSignupUserRequest | 

    try:
        # Adds a new user (pendingto be confirmed) in the site.
        api_response = api_instance.auth_email_signup_user(auth_email_signup_user_request)
        print("The response of AuthEmailApi->auth_email_signup_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthEmailApi->auth_email_signup_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth_email_signup_user_request** | [**AuthEmailSignupUserRequest**](AuthEmailSignupUserRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


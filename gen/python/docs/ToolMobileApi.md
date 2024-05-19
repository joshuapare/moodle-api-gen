# openapi_client.ToolMobileApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_mobile_call_external_functions**](ToolMobileApi.md#tool_mobile_call_external_functions) | **POST** /tool_mobile_call_external_functions | Call multiple external functions and return all responses.
[**tool_mobile_get_autologin_key**](ToolMobileApi.md#tool_mobile_get_autologin_key) | **POST** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
[**tool_mobile_get_config**](ToolMobileApi.md#tool_mobile_get_config) | **POST** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section.
[**tool_mobile_get_content**](ToolMobileApi.md#tool_mobile_get_content) | **POST** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app.
[**tool_mobile_get_plugins_supporting_mobile**](ToolMobileApi.md#tool_mobile_get_plugins_supporting_mobile) | **POST** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app.
[**tool_mobile_get_public_config**](ToolMobileApi.md#tool_mobile_get_public_config) | **POST** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication.
[**tool_mobile_get_tokens_for_qr_login**](ToolMobileApi.md#tool_mobile_get_tokens_for_qr_login) | **POST** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login.
[**tool_mobile_validate_subscription_key**](ToolMobileApi.md#tool_mobile_validate_subscription_key) | **POST** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid.


# **tool_mobile_call_external_functions**
> ToolMobileCallExternalFunctions200Response tool_mobile_call_external_functions(tool_mobile_call_external_functions_request)

Call multiple external functions and return all responses.

Call multiple external functions and return all responses.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_call_external_functions200_response import ToolMobileCallExternalFunctions200Response
from openapi_client.models.tool_mobile_call_external_functions_request import ToolMobileCallExternalFunctionsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)
    tool_mobile_call_external_functions_request = openapi_client.ToolMobileCallExternalFunctionsRequest() # ToolMobileCallExternalFunctionsRequest | 

    try:
        # Call multiple external functions and return all responses.
        api_response = api_instance.tool_mobile_call_external_functions(tool_mobile_call_external_functions_request)
        print("The response of ToolMobileApi->tool_mobile_call_external_functions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_call_external_functions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_mobile_call_external_functions_request** | [**ToolMobileCallExternalFunctionsRequest**](ToolMobileCallExternalFunctionsRequest.md)|  | 

### Return type

[**ToolMobileCallExternalFunctions200Response**](ToolMobileCallExternalFunctions200Response.md)

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

# **tool_mobile_get_autologin_key**
> ToolMobileGetAutologinKey200Response tool_mobile_get_autologin_key(tool_mobile_get_autologin_key_request)

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_get_autologin_key200_response import ToolMobileGetAutologinKey200Response
from openapi_client.models.tool_mobile_get_autologin_key_request import ToolMobileGetAutologinKeyRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)
    tool_mobile_get_autologin_key_request = openapi_client.ToolMobileGetAutologinKeyRequest() # ToolMobileGetAutologinKeyRequest | 

    try:
        # Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
        api_response = api_instance.tool_mobile_get_autologin_key(tool_mobile_get_autologin_key_request)
        print("The response of ToolMobileApi->tool_mobile_get_autologin_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_get_autologin_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_mobile_get_autologin_key_request** | [**ToolMobileGetAutologinKeyRequest**](ToolMobileGetAutologinKeyRequest.md)|  | 

### Return type

[**ToolMobileGetAutologinKey200Response**](ToolMobileGetAutologinKey200Response.md)

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

# **tool_mobile_get_config**
> ToolMobileGetConfig200Response tool_mobile_get_config(tool_mobile_get_config_request)

Returns a list of the site configurations, filtering by section.

Returns a list of the site configurations, filtering by section.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_get_config200_response import ToolMobileGetConfig200Response
from openapi_client.models.tool_mobile_get_config_request import ToolMobileGetConfigRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)
    tool_mobile_get_config_request = openapi_client.ToolMobileGetConfigRequest() # ToolMobileGetConfigRequest | 

    try:
        # Returns a list of the site configurations, filtering by section.
        api_response = api_instance.tool_mobile_get_config(tool_mobile_get_config_request)
        print("The response of ToolMobileApi->tool_mobile_get_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_get_config: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_mobile_get_config_request** | [**ToolMobileGetConfigRequest**](ToolMobileGetConfigRequest.md)|  | 

### Return type

[**ToolMobileGetConfig200Response**](ToolMobileGetConfig200Response.md)

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

# **tool_mobile_get_content**
> ToolMobileGetContent200Response tool_mobile_get_content(tool_mobile_get_content_request)

Returns a piece of content to be displayed in the Mobile app.

Returns a piece of content to be displayed in the Mobile app.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_get_content200_response import ToolMobileGetContent200Response
from openapi_client.models.tool_mobile_get_content_request import ToolMobileGetContentRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)
    tool_mobile_get_content_request = openapi_client.ToolMobileGetContentRequest() # ToolMobileGetContentRequest | 

    try:
        # Returns a piece of content to be displayed in the Mobile app.
        api_response = api_instance.tool_mobile_get_content(tool_mobile_get_content_request)
        print("The response of ToolMobileApi->tool_mobile_get_content:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_get_content: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_mobile_get_content_request** | [**ToolMobileGetContentRequest**](ToolMobileGetContentRequest.md)|  | 

### Return type

[**ToolMobileGetContent200Response**](ToolMobileGetContent200Response.md)

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

# **tool_mobile_get_plugins_supporting_mobile**
> ToolMobileGetPluginsSupportingMobile200Response tool_mobile_get_plugins_supporting_mobile()

Returns a list of Moodle plugins supporting the mobile app.

Returns a list of Moodle plugins supporting the mobile app.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_get_plugins_supporting_mobile200_response import ToolMobileGetPluginsSupportingMobile200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)

    try:
        # Returns a list of Moodle plugins supporting the mobile app.
        api_response = api_instance.tool_mobile_get_plugins_supporting_mobile()
        print("The response of ToolMobileApi->tool_mobile_get_plugins_supporting_mobile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_get_plugins_supporting_mobile: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ToolMobileGetPluginsSupportingMobile200Response**](ToolMobileGetPluginsSupportingMobile200Response.md)

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

# **tool_mobile_get_public_config**
> ToolMobileGetPublicConfig200Response tool_mobile_get_public_config()

Returns a list of the site public settings, those not requiring authentication.

Returns a list of the site public settings, those not requiring authentication.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_get_public_config200_response import ToolMobileGetPublicConfig200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)

    try:
        # Returns a list of the site public settings, those not requiring authentication.
        api_response = api_instance.tool_mobile_get_public_config()
        print("The response of ToolMobileApi->tool_mobile_get_public_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_get_public_config: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ToolMobileGetPublicConfig200Response**](ToolMobileGetPublicConfig200Response.md)

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

# **tool_mobile_get_tokens_for_qr_login**
> ToolMobileGetTokensForQrLogin200Response tool_mobile_get_tokens_for_qr_login(tool_mobile_get_tokens_for_qr_login_request)

Returns a WebService token (and private token) for QR login.

Returns a WebService token (and private token) for QR login.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_get_tokens_for_qr_login200_response import ToolMobileGetTokensForQrLogin200Response
from openapi_client.models.tool_mobile_get_tokens_for_qr_login_request import ToolMobileGetTokensForQrLoginRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)
    tool_mobile_get_tokens_for_qr_login_request = openapi_client.ToolMobileGetTokensForQrLoginRequest() # ToolMobileGetTokensForQrLoginRequest | 

    try:
        # Returns a WebService token (and private token) for QR login.
        api_response = api_instance.tool_mobile_get_tokens_for_qr_login(tool_mobile_get_tokens_for_qr_login_request)
        print("The response of ToolMobileApi->tool_mobile_get_tokens_for_qr_login:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_get_tokens_for_qr_login: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_mobile_get_tokens_for_qr_login_request** | [**ToolMobileGetTokensForQrLoginRequest**](ToolMobileGetTokensForQrLoginRequest.md)|  | 

### Return type

[**ToolMobileGetTokensForQrLogin200Response**](ToolMobileGetTokensForQrLogin200Response.md)

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

# **tool_mobile_validate_subscription_key**
> ToolMobileValidateSubscriptionKey200Response tool_mobile_validate_subscription_key(tool_mobile_validate_subscription_key_request)

Check if the given site subscription key is valid.

Check if the given site subscription key is valid.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_mobile_validate_subscription_key200_response import ToolMobileValidateSubscriptionKey200Response
from openapi_client.models.tool_mobile_validate_subscription_key_request import ToolMobileValidateSubscriptionKeyRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
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
    api_instance = openapi_client.ToolMobileApi(api_client)
    tool_mobile_validate_subscription_key_request = openapi_client.ToolMobileValidateSubscriptionKeyRequest() # ToolMobileValidateSubscriptionKeyRequest | 

    try:
        # Check if the given site subscription key is valid.
        api_response = api_instance.tool_mobile_validate_subscription_key(tool_mobile_validate_subscription_key_request)
        print("The response of ToolMobileApi->tool_mobile_validate_subscription_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolMobileApi->tool_mobile_validate_subscription_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_mobile_validate_subscription_key_request** | [**ToolMobileValidateSubscriptionKeyRequest**](ToolMobileValidateSubscriptionKeyRequest.md)|  | 

### Return type

[**ToolMobileValidateSubscriptionKey200Response**](ToolMobileValidateSubscriptionKey200Response.md)

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


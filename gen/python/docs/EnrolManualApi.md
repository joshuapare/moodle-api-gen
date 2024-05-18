# openapi_client.EnrolManualApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_manual_enrol_users**](EnrolManualApi.md#enrol_manual_enrol_users) | **POST** /enrol_manual_enrol_users | Manual enrol users
[**enrol_manual_unenrol_users**](EnrolManualApi.md#enrol_manual_unenrol_users) | **POST** /enrol_manual_unenrol_users | Manual unenrol users


# **enrol_manual_enrol_users**
> object enrol_manual_enrol_users(enrol_manual_enrol_users_request)

Manual enrol users

Manual enrol users

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_manual_enrol_users_request import EnrolManualEnrolUsersRequest
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
    api_instance = openapi_client.EnrolManualApi(api_client)
    enrol_manual_enrol_users_request = openapi_client.EnrolManualEnrolUsersRequest() # EnrolManualEnrolUsersRequest | 

    try:
        # Manual enrol users
        api_response = api_instance.enrol_manual_enrol_users(enrol_manual_enrol_users_request)
        print("The response of EnrolManualApi->enrol_manual_enrol_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolManualApi->enrol_manual_enrol_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_manual_enrol_users_request** | [**EnrolManualEnrolUsersRequest**](EnrolManualEnrolUsersRequest.md)|  | 

### Return type

**object**

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

# **enrol_manual_unenrol_users**
> object enrol_manual_unenrol_users(enrol_manual_unenrol_users_request)

Manual unenrol users

Manual unenrol users

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_manual_unenrol_users_request import EnrolManualUnenrolUsersRequest
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
    api_instance = openapi_client.EnrolManualApi(api_client)
    enrol_manual_unenrol_users_request = openapi_client.EnrolManualUnenrolUsersRequest() # EnrolManualUnenrolUsersRequest | 

    try:
        # Manual unenrol users
        api_response = api_instance.enrol_manual_unenrol_users(enrol_manual_unenrol_users_request)
        print("The response of EnrolManualApi->enrol_manual_unenrol_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolManualApi->enrol_manual_unenrol_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_manual_unenrol_users_request** | [**EnrolManualUnenrolUsersRequest**](EnrolManualUnenrolUsersRequest.md)|  | 

### Return type

**object**

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


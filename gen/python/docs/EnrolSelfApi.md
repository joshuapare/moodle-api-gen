# openapi_client.EnrolSelfApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_self_enrol_user**](EnrolSelfApi.md#enrol_self_enrol_user) | **POST** /enrol_self_enrol_user | Self enrol the current user in the given course.
[**enrol_self_get_instance_info**](EnrolSelfApi.md#enrol_self_get_instance_info) | **POST** /enrol_self_get_instance_info | self enrolment instance information.


# **enrol_self_enrol_user**
> EnrolSelfEnrolUser200Response enrol_self_enrol_user(enrol_self_enrol_user_request)

Self enrol the current user in the given course.

Self enrol the current user in the given course.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_self_enrol_user200_response import EnrolSelfEnrolUser200Response
from openapi_client.models.enrol_self_enrol_user_request import EnrolSelfEnrolUserRequest
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
    api_instance = openapi_client.EnrolSelfApi(api_client)
    enrol_self_enrol_user_request = openapi_client.EnrolSelfEnrolUserRequest() # EnrolSelfEnrolUserRequest | 

    try:
        # Self enrol the current user in the given course.
        api_response = api_instance.enrol_self_enrol_user(enrol_self_enrol_user_request)
        print("The response of EnrolSelfApi->enrol_self_enrol_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolSelfApi->enrol_self_enrol_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_self_enrol_user_request** | [**EnrolSelfEnrolUserRequest**](EnrolSelfEnrolUserRequest.md)|  | 

### Return type

[**EnrolSelfEnrolUser200Response**](EnrolSelfEnrolUser200Response.md)

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

# **enrol_self_get_instance_info**
> EnrolSelfGetInstanceInfo200Response enrol_self_get_instance_info(enrol_self_get_instance_info_request)

self enrolment instance information.

self enrolment instance information.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_self_get_instance_info200_response import EnrolSelfGetInstanceInfo200Response
from openapi_client.models.enrol_self_get_instance_info_request import EnrolSelfGetInstanceInfoRequest
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
    api_instance = openapi_client.EnrolSelfApi(api_client)
    enrol_self_get_instance_info_request = openapi_client.EnrolSelfGetInstanceInfoRequest() # EnrolSelfGetInstanceInfoRequest | 

    try:
        # self enrolment instance information.
        api_response = api_instance.enrol_self_get_instance_info(enrol_self_get_instance_info_request)
        print("The response of EnrolSelfApi->enrol_self_get_instance_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolSelfApi->enrol_self_get_instance_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_self_get_instance_info_request** | [**EnrolSelfGetInstanceInfoRequest**](EnrolSelfGetInstanceInfoRequest.md)|  | 

### Return type

[**EnrolSelfGetInstanceInfo200Response**](EnrolSelfGetInstanceInfo200Response.md)

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


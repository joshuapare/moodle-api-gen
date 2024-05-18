# openapi_client.EnrolGuestApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_guest_get_instance_info**](EnrolGuestApi.md#enrol_guest_get_instance_info) | **POST** /enrol_guest_get_instance_info | Return guest enrolment instance information.
[**enrol_guest_validate_password**](EnrolGuestApi.md#enrol_guest_validate_password) | **POST** /enrol_guest_validate_password | Perform password validation.


# **enrol_guest_get_instance_info**
> EnrolGuestGetInstanceInfo200Response enrol_guest_get_instance_info(enrol_guest_get_instance_info_request)

Return guest enrolment instance information.

Return guest enrolment instance information.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_guest_get_instance_info200_response import EnrolGuestGetInstanceInfo200Response
from openapi_client.models.enrol_guest_get_instance_info_request import EnrolGuestGetInstanceInfoRequest
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
    api_instance = openapi_client.EnrolGuestApi(api_client)
    enrol_guest_get_instance_info_request = openapi_client.EnrolGuestGetInstanceInfoRequest() # EnrolGuestGetInstanceInfoRequest | 

    try:
        # Return guest enrolment instance information.
        api_response = api_instance.enrol_guest_get_instance_info(enrol_guest_get_instance_info_request)
        print("The response of EnrolGuestApi->enrol_guest_get_instance_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolGuestApi->enrol_guest_get_instance_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_guest_get_instance_info_request** | [**EnrolGuestGetInstanceInfoRequest**](EnrolGuestGetInstanceInfoRequest.md)|  | 

### Return type

[**EnrolGuestGetInstanceInfo200Response**](EnrolGuestGetInstanceInfo200Response.md)

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

# **enrol_guest_validate_password**
> EnrolGuestValidatePassword200Response enrol_guest_validate_password(enrol_guest_validate_password_request)

Perform password validation.

Perform password validation.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_guest_validate_password200_response import EnrolGuestValidatePassword200Response
from openapi_client.models.enrol_guest_validate_password_request import EnrolGuestValidatePasswordRequest
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
    api_instance = openapi_client.EnrolGuestApi(api_client)
    enrol_guest_validate_password_request = openapi_client.EnrolGuestValidatePasswordRequest() # EnrolGuestValidatePasswordRequest | 

    try:
        # Perform password validation.
        api_response = api_instance.enrol_guest_validate_password(enrol_guest_validate_password_request)
        print("The response of EnrolGuestApi->enrol_guest_validate_password:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolGuestApi->enrol_guest_validate_password: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_guest_validate_password_request** | [**EnrolGuestValidatePasswordRequest**](EnrolGuestValidatePasswordRequest.md)|  | 

### Return type

[**EnrolGuestValidatePassword200Response**](EnrolGuestValidatePassword200Response.md)

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


# openapi_client.EnrolLicenseApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_license_enrol_user**](EnrolLicenseApi.md#enrol_license_enrol_user) | **POST** /enrol_license_enrol_user | License enrol the current user in the given course.
[**enrol_license_get_instance_info**](EnrolLicenseApi.md#enrol_license_get_instance_info) | **POST** /enrol_license_get_instance_info | License enrolment instance information.


# **enrol_license_enrol_user**
> EnrolLicenseEnrolUser200Response enrol_license_enrol_user(enrol_license_enrol_user_request)

License enrol the current user in the given course.

License enrol the current user in the given course.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_license_enrol_user200_response import EnrolLicenseEnrolUser200Response
from openapi_client.models.enrol_license_enrol_user_request import EnrolLicenseEnrolUserRequest
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
    api_instance = openapi_client.EnrolLicenseApi(api_client)
    enrol_license_enrol_user_request = openapi_client.EnrolLicenseEnrolUserRequest() # EnrolLicenseEnrolUserRequest | 

    try:
        # License enrol the current user in the given course.
        api_response = api_instance.enrol_license_enrol_user(enrol_license_enrol_user_request)
        print("The response of EnrolLicenseApi->enrol_license_enrol_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolLicenseApi->enrol_license_enrol_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_license_enrol_user_request** | [**EnrolLicenseEnrolUserRequest**](EnrolLicenseEnrolUserRequest.md)|  | 

### Return type

[**EnrolLicenseEnrolUser200Response**](EnrolLicenseEnrolUser200Response.md)

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

# **enrol_license_get_instance_info**
> EnrolLicenseGetInstanceInfo200Response enrol_license_get_instance_info(enrol_license_get_instance_info_request)

License enrolment instance information.

License enrolment instance information.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_license_get_instance_info200_response import EnrolLicenseGetInstanceInfo200Response
from openapi_client.models.enrol_license_get_instance_info_request import EnrolLicenseGetInstanceInfoRequest
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
    api_instance = openapi_client.EnrolLicenseApi(api_client)
    enrol_license_get_instance_info_request = openapi_client.EnrolLicenseGetInstanceInfoRequest() # EnrolLicenseGetInstanceInfoRequest | 

    try:
        # License enrolment instance information.
        api_response = api_instance.enrol_license_get_instance_info(enrol_license_get_instance_info_request)
        print("The response of EnrolLicenseApi->enrol_license_get_instance_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolLicenseApi->enrol_license_get_instance_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_license_get_instance_info_request** | [**EnrolLicenseGetInstanceInfoRequest**](EnrolLicenseGetInstanceInfoRequest.md)|  | 

### Return type

[**EnrolLicenseGetInstanceInfo200Response**](EnrolLicenseGetInstanceInfo200Response.md)

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


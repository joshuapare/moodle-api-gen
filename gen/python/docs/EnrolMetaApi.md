# openapi_client.EnrolMetaApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_meta_add_instances**](EnrolMetaApi.md#enrol_meta_add_instances) | **POST** /enrol_meta_add_instances | Add meta enrolment instances
[**enrol_meta_delete_instances**](EnrolMetaApi.md#enrol_meta_delete_instances) | **POST** /enrol_meta_delete_instances | Delete meta enrolment instances


# **enrol_meta_add_instances**
> object enrol_meta_add_instances(enrol_meta_add_instances_request)

Add meta enrolment instances

Add meta enrolment instances

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_meta_add_instances_request import EnrolMetaAddInstancesRequest
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
    api_instance = openapi_client.EnrolMetaApi(api_client)
    enrol_meta_add_instances_request = openapi_client.EnrolMetaAddInstancesRequest() # EnrolMetaAddInstancesRequest | 

    try:
        # Add meta enrolment instances
        api_response = api_instance.enrol_meta_add_instances(enrol_meta_add_instances_request)
        print("The response of EnrolMetaApi->enrol_meta_add_instances:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolMetaApi->enrol_meta_add_instances: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_meta_add_instances_request** | [**EnrolMetaAddInstancesRequest**](EnrolMetaAddInstancesRequest.md)|  | 

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
**200** | List of course meta enrolment instances that were created. |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enrol_meta_delete_instances**
> object enrol_meta_delete_instances(enrol_meta_delete_instances_request)

Delete meta enrolment instances

Delete meta enrolment instances

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.enrol_meta_delete_instances_request import EnrolMetaDeleteInstancesRequest
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
    api_instance = openapi_client.EnrolMetaApi(api_client)
    enrol_meta_delete_instances_request = openapi_client.EnrolMetaDeleteInstancesRequest() # EnrolMetaDeleteInstancesRequest | 

    try:
        # Delete meta enrolment instances
        api_response = api_instance.enrol_meta_delete_instances(enrol_meta_delete_instances_request)
        print("The response of EnrolMetaApi->enrol_meta_delete_instances:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnrolMetaApi->enrol_meta_delete_instances: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrol_meta_delete_instances_request** | [**EnrolMetaDeleteInstancesRequest**](EnrolMetaDeleteInstancesRequest.md)|  | 

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
**200** | List of course meta enrolment instances that were deleted. |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# openapi_client.ModLabelApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_label_get_labels_by_courses**](ModLabelApi.md#mod_label_get_labels_by_courses) | **POST** /mod_label_get_labels_by_courses | Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.


# **mod_label_get_labels_by_courses**
> ModLabelGetLabelsByCourses200Response mod_label_get_labels_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)

Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request import ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest
from openapi_client.models.mod_label_get_labels_by_courses200_response import ModLabelGetLabelsByCourses200Response
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
    api_instance = openapi_client.ModLabelApi(api_client)
    mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = openapi_client.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest() # ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

    try:
        # Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
        api_response = api_instance.mod_label_get_labels_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
        print("The response of ModLabelApi->mod_label_get_labels_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModLabelApi->mod_label_get_labels_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | 

### Return type

[**ModLabelGetLabelsByCourses200Response**](ModLabelGetLabelsByCourses200Response.md)

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


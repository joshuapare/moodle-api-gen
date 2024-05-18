# openapi_client.BlockStarredcoursesApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block_starredcourses_get_starred_courses**](BlockStarredcoursesApi.md#block_starredcourses_get_starred_courses) | **POST** /block_starredcourses_get_starred_courses | Get users starred courses.


# **block_starredcourses_get_starred_courses**
> object block_starredcourses_get_starred_courses(block_starredcourses_get_starred_courses_request)

Get users starred courses.

Get users starred courses.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_starredcourses_get_starred_courses_request import BlockStarredcoursesGetStarredCoursesRequest
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
    api_instance = openapi_client.BlockStarredcoursesApi(api_client)
    block_starredcourses_get_starred_courses_request = openapi_client.BlockStarredcoursesGetStarredCoursesRequest() # BlockStarredcoursesGetStarredCoursesRequest | 

    try:
        # Get users starred courses.
        api_response = api_instance.block_starredcourses_get_starred_courses(block_starredcourses_get_starred_courses_request)
        print("The response of BlockStarredcoursesApi->block_starredcourses_get_starred_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockStarredcoursesApi->block_starredcourses_get_starred_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_starredcourses_get_starred_courses_request** | [**BlockStarredcoursesGetStarredCoursesRequest**](BlockStarredcoursesGetStarredCoursesRequest.md)|  | 

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


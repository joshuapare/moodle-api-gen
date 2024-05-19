# openapi_client.GradereportSingleviewApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradereport_singleview_get_grade_items_for_search_widget**](GradereportSingleviewApi.md#gradereport_singleview_get_grade_items_for_search_widget) | **POST** /gradereport_singleview_get_grade_items_for_search_widget | Get the gradeitem/(s) for a course


# **gradereport_singleview_get_grade_items_for_search_widget**
> GradereportSingleviewGetGradeItemsForSearchWidget200Response gradereport_singleview_get_grade_items_for_search_widget(core_grades_get_groups_for_search_widget_request)

Get the gradeitem/(s) for a course

Get the gradeitem/(s) for a course

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_grades_get_groups_for_search_widget_request import CoreGradesGetGroupsForSearchWidgetRequest
from openapi_client.models.gradereport_singleview_get_grade_items_for_search_widget200_response import GradereportSingleviewGetGradeItemsForSearchWidget200Response
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
    api_instance = openapi_client.GradereportSingleviewApi(api_client)
    core_grades_get_groups_for_search_widget_request = openapi_client.CoreGradesGetGroupsForSearchWidgetRequest() # CoreGradesGetGroupsForSearchWidgetRequest | 

    try:
        # Get the gradeitem/(s) for a course
        api_response = api_instance.gradereport_singleview_get_grade_items_for_search_widget(core_grades_get_groups_for_search_widget_request)
        print("The response of GradereportSingleviewApi->gradereport_singleview_get_grade_items_for_search_widget:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradereportSingleviewApi->gradereport_singleview_get_grade_items_for_search_widget: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **core_grades_get_groups_for_search_widget_request** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md)|  | 

### Return type

[**GradereportSingleviewGetGradeItemsForSearchWidget200Response**](GradereportSingleviewGetGradeItemsForSearchWidget200Response.md)

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


# openapi_client.GradingformGuideApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gradingform_guide_grader_gradingpanel_fetch**](GradingformGuideApi.md#gradingform_guide_grader_gradingpanel_fetch) | **POST** /gradingform_guide_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
[**gradingform_guide_grader_gradingpanel_store**](GradingformGuideApi.md#gradingform_guide_grader_gradingpanel_store) | **POST** /gradingform_guide_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.


# **gradingform_guide_grader_gradingpanel_fetch**
> GradingformGuideGraderGradingpanelFetch200Response gradingform_guide_grader_gradingpanel_fetch(core_grades_grader_gradingpanel_scale_fetch_request)

Fetch the data required to display the grader grading panel, creating the grade item if required

Fetch the data required to display the grader grading panel, creating the grade item if required

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_grades_grader_gradingpanel_scale_fetch_request import CoreGradesGraderGradingpanelScaleFetchRequest
from openapi_client.models.gradingform_guide_grader_gradingpanel_fetch200_response import GradingformGuideGraderGradingpanelFetch200Response
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
    api_instance = openapi_client.GradingformGuideApi(api_client)
    core_grades_grader_gradingpanel_scale_fetch_request = openapi_client.CoreGradesGraderGradingpanelScaleFetchRequest() # CoreGradesGraderGradingpanelScaleFetchRequest | 

    try:
        # Fetch the data required to display the grader grading panel, creating the grade item if required
        api_response = api_instance.gradingform_guide_grader_gradingpanel_fetch(core_grades_grader_gradingpanel_scale_fetch_request)
        print("The response of GradingformGuideApi->gradingform_guide_grader_gradingpanel_fetch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradingformGuideApi->gradingform_guide_grader_gradingpanel_fetch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **core_grades_grader_gradingpanel_scale_fetch_request** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md)|  | 

### Return type

[**GradingformGuideGraderGradingpanelFetch200Response**](GradingformGuideGraderGradingpanelFetch200Response.md)

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

# **gradingform_guide_grader_gradingpanel_store**
> GradingformGuideGraderGradingpanelStore200Response gradingform_guide_grader_gradingpanel_store(core_grades_grader_gradingpanel_scale_store_request)

Store the grading data for a user from the grader grading panel.

Store the grading data for a user from the grader grading panel.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_grades_grader_gradingpanel_scale_store_request import CoreGradesGraderGradingpanelScaleStoreRequest
from openapi_client.models.gradingform_guide_grader_gradingpanel_store200_response import GradingformGuideGraderGradingpanelStore200Response
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
    api_instance = openapi_client.GradingformGuideApi(api_client)
    core_grades_grader_gradingpanel_scale_store_request = openapi_client.CoreGradesGraderGradingpanelScaleStoreRequest() # CoreGradesGraderGradingpanelScaleStoreRequest | 

    try:
        # Store the grading data for a user from the grader grading panel.
        api_response = api_instance.gradingform_guide_grader_gradingpanel_store(core_grades_grader_gradingpanel_scale_store_request)
        print("The response of GradingformGuideApi->gradingform_guide_grader_gradingpanel_store:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GradingformGuideApi->gradingform_guide_grader_gradingpanel_store: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **core_grades_grader_gradingpanel_scale_store_request** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md)|  | 

### Return type

[**GradingformGuideGraderGradingpanelStore200Response**](GradingformGuideGraderGradingpanelStore200Response.md)

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


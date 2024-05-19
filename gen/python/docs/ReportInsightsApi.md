# openapi_client.ReportInsightsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**report_insights_action_executed**](ReportInsightsApi.md#report_insights_action_executed) | **POST** /report_insights_action_executed | Stores an action executed over a group of predictions.
[**report_insights_set_fixed_prediction**](ReportInsightsApi.md#report_insights_set_fixed_prediction) | **POST** /report_insights_set_fixed_prediction | Flags a prediction as fixed.
[**report_insights_set_notuseful_prediction**](ReportInsightsApi.md#report_insights_set_notuseful_prediction) | **POST** /report_insights_set_notuseful_prediction | Flags the prediction as not useful.


# **report_insights_action_executed**
> CoreCohortAddCohortMembers200Response report_insights_action_executed(report_insights_action_executed_request)

Stores an action executed over a group of predictions.

Stores an action executed over a group of predictions.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_cohort_add_cohort_members200_response import CoreCohortAddCohortMembers200Response
from openapi_client.models.report_insights_action_executed_request import ReportInsightsActionExecutedRequest
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
    api_instance = openapi_client.ReportInsightsApi(api_client)
    report_insights_action_executed_request = openapi_client.ReportInsightsActionExecutedRequest() # ReportInsightsActionExecutedRequest | 

    try:
        # Stores an action executed over a group of predictions.
        api_response = api_instance.report_insights_action_executed(report_insights_action_executed_request)
        print("The response of ReportInsightsApi->report_insights_action_executed:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportInsightsApi->report_insights_action_executed: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_insights_action_executed_request** | [**ReportInsightsActionExecutedRequest**](ReportInsightsActionExecutedRequest.md)|  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

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

# **report_insights_set_fixed_prediction**
> ReportInsightsSetFixedPrediction200Response report_insights_set_fixed_prediction(report_insights_set_fixed_prediction_request)

Flags a prediction as fixed.

Flags a prediction as fixed.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.report_insights_set_fixed_prediction200_response import ReportInsightsSetFixedPrediction200Response
from openapi_client.models.report_insights_set_fixed_prediction_request import ReportInsightsSetFixedPredictionRequest
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
    api_instance = openapi_client.ReportInsightsApi(api_client)
    report_insights_set_fixed_prediction_request = openapi_client.ReportInsightsSetFixedPredictionRequest() # ReportInsightsSetFixedPredictionRequest | 

    try:
        # Flags a prediction as fixed.
        api_response = api_instance.report_insights_set_fixed_prediction(report_insights_set_fixed_prediction_request)
        print("The response of ReportInsightsApi->report_insights_set_fixed_prediction:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportInsightsApi->report_insights_set_fixed_prediction: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_insights_set_fixed_prediction_request** | [**ReportInsightsSetFixedPredictionRequest**](ReportInsightsSetFixedPredictionRequest.md)|  | 

### Return type

[**ReportInsightsSetFixedPrediction200Response**](ReportInsightsSetFixedPrediction200Response.md)

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

# **report_insights_set_notuseful_prediction**
> ReportInsightsSetNotusefulPrediction200Response report_insights_set_notuseful_prediction(report_insights_set_notuseful_prediction_request)

Flags the prediction as not useful.

Flags the prediction as not useful.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.report_insights_set_notuseful_prediction200_response import ReportInsightsSetNotusefulPrediction200Response
from openapi_client.models.report_insights_set_notuseful_prediction_request import ReportInsightsSetNotusefulPredictionRequest
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
    api_instance = openapi_client.ReportInsightsApi(api_client)
    report_insights_set_notuseful_prediction_request = openapi_client.ReportInsightsSetNotusefulPredictionRequest() # ReportInsightsSetNotusefulPredictionRequest | 

    try:
        # Flags the prediction as not useful.
        api_response = api_instance.report_insights_set_notuseful_prediction(report_insights_set_notuseful_prediction_request)
        print("The response of ReportInsightsApi->report_insights_set_notuseful_prediction:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportInsightsApi->report_insights_set_notuseful_prediction: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_insights_set_notuseful_prediction_request** | [**ReportInsightsSetNotusefulPredictionRequest**](ReportInsightsSetNotusefulPredictionRequest.md)|  | 

### Return type

[**ReportInsightsSetNotusefulPrediction200Response**](ReportInsightsSetNotusefulPrediction200Response.md)

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


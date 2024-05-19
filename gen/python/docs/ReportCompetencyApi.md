# openapi_client.ReportCompetencyApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**report_competency_data_for_report**](ReportCompetencyApi.md#report_competency_data_for_report) | **POST** /report_competency_data_for_report | Load the data for the competency report in a course.


# **report_competency_data_for_report**
> ReportCompetencyDataForReport200Response report_competency_data_for_report(report_competency_data_for_report_request)

Load the data for the competency report in a course.

Load the data for the competency report in a course.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.report_competency_data_for_report200_response import ReportCompetencyDataForReport200Response
from openapi_client.models.report_competency_data_for_report_request import ReportCompetencyDataForReportRequest
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
    api_instance = openapi_client.ReportCompetencyApi(api_client)
    report_competency_data_for_report_request = openapi_client.ReportCompetencyDataForReportRequest() # ReportCompetencyDataForReportRequest | 

    try:
        # Load the data for the competency report in a course.
        api_response = api_instance.report_competency_data_for_report(report_competency_data_for_report_request)
        print("The response of ReportCompetencyApi->report_competency_data_for_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportCompetencyApi->report_competency_data_for_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_competency_data_for_report_request** | [**ReportCompetencyDataForReportRequest**](ReportCompetencyDataForReportRequest.md)|  | 

### Return type

[**ReportCompetencyDataForReport200Response**](ReportCompetencyDataForReport200Response.md)

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


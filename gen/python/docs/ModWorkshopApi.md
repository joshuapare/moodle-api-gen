# openapi_client.ModWorkshopApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_workshop_add_submission**](ModWorkshopApi.md#mod_workshop_add_submission) | **POST** /mod_workshop_add_submission | Add a new submission to a given workshop.
[**mod_workshop_delete_submission**](ModWorkshopApi.md#mod_workshop_delete_submission) | **POST** /mod_workshop_delete_submission | Deletes the given submission.
[**mod_workshop_evaluate_assessment**](ModWorkshopApi.md#mod_workshop_evaluate_assessment) | **POST** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer).
[**mod_workshop_evaluate_submission**](ModWorkshopApi.md#mod_workshop_evaluate_submission) | **POST** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade).
[**mod_workshop_get_assessment**](ModWorkshopApi.md#mod_workshop_get_assessment) | **POST** /mod_workshop_get_assessment | Retrieves the given assessment.
[**mod_workshop_get_assessment_form_definition**](ModWorkshopApi.md#mod_workshop_get_assessment_form_definition) | **POST** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition.
[**mod_workshop_get_grades**](ModWorkshopApi.md#mod_workshop_get_grades) | **POST** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user.
[**mod_workshop_get_grades_report**](ModWorkshopApi.md#mod_workshop_get_grades_report) | **POST** /mod_workshop_get_grades_report | Retrieves the assessment grades report.
[**mod_workshop_get_reviewer_assessments**](ModWorkshopApi.md#mod_workshop_get_reviewer_assessments) | **POST** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user.
[**mod_workshop_get_submission**](ModWorkshopApi.md#mod_workshop_get_submission) | **POST** /mod_workshop_get_submission | Retrieves the given submission.
[**mod_workshop_get_submission_assessments**](ModWorkshopApi.md#mod_workshop_get_submission_assessments) | **POST** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission.
[**mod_workshop_get_submissions**](ModWorkshopApi.md#mod_workshop_get_submissions) | **POST** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions).
[**mod_workshop_get_user_plan**](ModWorkshopApi.md#mod_workshop_get_user_plan) | **POST** /mod_workshop_get_user_plan | Return the planner information for the given user.
[**mod_workshop_get_workshop_access_information**](ModWorkshopApi.md#mod_workshop_get_workshop_access_information) | **POST** /mod_workshop_get_workshop_access_information | Return access information for a given workshop.
[**mod_workshop_get_workshops_by_courses**](ModWorkshopApi.md#mod_workshop_get_workshops_by_courses) | **POST** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
[**mod_workshop_update_assessment**](ModWorkshopApi.md#mod_workshop_update_assessment) | **POST** /mod_workshop_update_assessment | Add information to an allocated assessment.
[**mod_workshop_update_submission**](ModWorkshopApi.md#mod_workshop_update_submission) | **POST** /mod_workshop_update_submission | Update the given submission.
[**mod_workshop_view_submission**](ModWorkshopApi.md#mod_workshop_view_submission) | **POST** /mod_workshop_view_submission | Trigger the submission viewed event.
[**mod_workshop_view_workshop**](ModWorkshopApi.md#mod_workshop_view_workshop) | **POST** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status.


# **mod_workshop_add_submission**
> ModWorkshopAddSubmission200Response mod_workshop_add_submission(mod_workshop_add_submission_request)

Add a new submission to a given workshop.

Add a new submission to a given workshop.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_add_submission200_response import ModWorkshopAddSubmission200Response
from openapi_client.models.mod_workshop_add_submission_request import ModWorkshopAddSubmissionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_add_submission_request = openapi_client.ModWorkshopAddSubmissionRequest() # ModWorkshopAddSubmissionRequest | 

    try:
        # Add a new submission to a given workshop.
        api_response = api_instance.mod_workshop_add_submission(mod_workshop_add_submission_request)
        print("The response of ModWorkshopApi->mod_workshop_add_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_add_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_add_submission_request** | [**ModWorkshopAddSubmissionRequest**](ModWorkshopAddSubmissionRequest.md)|  | 

### Return type

[**ModWorkshopAddSubmission200Response**](ModWorkshopAddSubmission200Response.md)

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

# **mod_workshop_delete_submission**
> ModWorkshopDeleteSubmission200Response mod_workshop_delete_submission(mod_workshop_delete_submission_request)

Deletes the given submission.

Deletes the given submission.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_delete_submission200_response import ModWorkshopDeleteSubmission200Response
from openapi_client.models.mod_workshop_delete_submission_request import ModWorkshopDeleteSubmissionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_delete_submission_request = openapi_client.ModWorkshopDeleteSubmissionRequest() # ModWorkshopDeleteSubmissionRequest | 

    try:
        # Deletes the given submission.
        api_response = api_instance.mod_workshop_delete_submission(mod_workshop_delete_submission_request)
        print("The response of ModWorkshopApi->mod_workshop_delete_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_delete_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_delete_submission_request** | [**ModWorkshopDeleteSubmissionRequest**](ModWorkshopDeleteSubmissionRequest.md)|  | 

### Return type

[**ModWorkshopDeleteSubmission200Response**](ModWorkshopDeleteSubmission200Response.md)

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

# **mod_workshop_evaluate_assessment**
> ModWorkshopEvaluateAssessment200Response mod_workshop_evaluate_assessment(mod_workshop_evaluate_assessment_request)

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

Evaluates an assessment (used by teachers for provide feedback to the reviewer).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_evaluate_assessment200_response import ModWorkshopEvaluateAssessment200Response
from openapi_client.models.mod_workshop_evaluate_assessment_request import ModWorkshopEvaluateAssessmentRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_evaluate_assessment_request = openapi_client.ModWorkshopEvaluateAssessmentRequest() # ModWorkshopEvaluateAssessmentRequest | 

    try:
        # Evaluates an assessment (used by teachers for provide feedback to the reviewer).
        api_response = api_instance.mod_workshop_evaluate_assessment(mod_workshop_evaluate_assessment_request)
        print("The response of ModWorkshopApi->mod_workshop_evaluate_assessment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_evaluate_assessment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_evaluate_assessment_request** | [**ModWorkshopEvaluateAssessmentRequest**](ModWorkshopEvaluateAssessmentRequest.md)|  | 

### Return type

[**ModWorkshopEvaluateAssessment200Response**](ModWorkshopEvaluateAssessment200Response.md)

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

# **mod_workshop_evaluate_submission**
> ModWorkshopEvaluateSubmission200Response mod_workshop_evaluate_submission(mod_workshop_evaluate_submission_request)

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

Evaluates a submission (used by teachers for provide feedback or override the submission grade).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_evaluate_submission200_response import ModWorkshopEvaluateSubmission200Response
from openapi_client.models.mod_workshop_evaluate_submission_request import ModWorkshopEvaluateSubmissionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_evaluate_submission_request = openapi_client.ModWorkshopEvaluateSubmissionRequest() # ModWorkshopEvaluateSubmissionRequest | 

    try:
        # Evaluates a submission (used by teachers for provide feedback or override the submission grade).
        api_response = api_instance.mod_workshop_evaluate_submission(mod_workshop_evaluate_submission_request)
        print("The response of ModWorkshopApi->mod_workshop_evaluate_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_evaluate_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_evaluate_submission_request** | [**ModWorkshopEvaluateSubmissionRequest**](ModWorkshopEvaluateSubmissionRequest.md)|  | 

### Return type

[**ModWorkshopEvaluateSubmission200Response**](ModWorkshopEvaluateSubmission200Response.md)

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

# **mod_workshop_get_assessment**
> ModWorkshopGetAssessment200Response mod_workshop_get_assessment(mod_workshop_get_assessment_request)

Retrieves the given assessment.

Retrieves the given assessment.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_assessment200_response import ModWorkshopGetAssessment200Response
from openapi_client.models.mod_workshop_get_assessment_request import ModWorkshopGetAssessmentRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_assessment_request = openapi_client.ModWorkshopGetAssessmentRequest() # ModWorkshopGetAssessmentRequest | 

    try:
        # Retrieves the given assessment.
        api_response = api_instance.mod_workshop_get_assessment(mod_workshop_get_assessment_request)
        print("The response of ModWorkshopApi->mod_workshop_get_assessment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_assessment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_assessment_request** | [**ModWorkshopGetAssessmentRequest**](ModWorkshopGetAssessmentRequest.md)|  | 

### Return type

[**ModWorkshopGetAssessment200Response**](ModWorkshopGetAssessment200Response.md)

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

# **mod_workshop_get_assessment_form_definition**
> ModWorkshopGetAssessmentFormDefinition200Response mod_workshop_get_assessment_form_definition(mod_workshop_get_assessment_form_definition_request)

Retrieves the assessment form definition.

Retrieves the assessment form definition.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_assessment_form_definition200_response import ModWorkshopGetAssessmentFormDefinition200Response
from openapi_client.models.mod_workshop_get_assessment_form_definition_request import ModWorkshopGetAssessmentFormDefinitionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_assessment_form_definition_request = openapi_client.ModWorkshopGetAssessmentFormDefinitionRequest() # ModWorkshopGetAssessmentFormDefinitionRequest | 

    try:
        # Retrieves the assessment form definition.
        api_response = api_instance.mod_workshop_get_assessment_form_definition(mod_workshop_get_assessment_form_definition_request)
        print("The response of ModWorkshopApi->mod_workshop_get_assessment_form_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_assessment_form_definition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_assessment_form_definition_request** | [**ModWorkshopGetAssessmentFormDefinitionRequest**](ModWorkshopGetAssessmentFormDefinitionRequest.md)|  | 

### Return type

[**ModWorkshopGetAssessmentFormDefinition200Response**](ModWorkshopGetAssessmentFormDefinition200Response.md)

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

# **mod_workshop_get_grades**
> ModWorkshopGetGrades200Response mod_workshop_get_grades(mod_workshop_get_grades_request)

Returns the assessment and submission grade for the given user.

Returns the assessment and submission grade for the given user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_grades200_response import ModWorkshopGetGrades200Response
from openapi_client.models.mod_workshop_get_grades_request import ModWorkshopGetGradesRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_grades_request = openapi_client.ModWorkshopGetGradesRequest() # ModWorkshopGetGradesRequest | 

    try:
        # Returns the assessment and submission grade for the given user.
        api_response = api_instance.mod_workshop_get_grades(mod_workshop_get_grades_request)
        print("The response of ModWorkshopApi->mod_workshop_get_grades:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_grades: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_grades_request** | [**ModWorkshopGetGradesRequest**](ModWorkshopGetGradesRequest.md)|  | 

### Return type

[**ModWorkshopGetGrades200Response**](ModWorkshopGetGrades200Response.md)

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

# **mod_workshop_get_grades_report**
> ModWorkshopGetGradesReport200Response mod_workshop_get_grades_report(mod_workshop_get_grades_report_request)

Retrieves the assessment grades report.

Retrieves the assessment grades report.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_grades_report200_response import ModWorkshopGetGradesReport200Response
from openapi_client.models.mod_workshop_get_grades_report_request import ModWorkshopGetGradesReportRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_grades_report_request = openapi_client.ModWorkshopGetGradesReportRequest() # ModWorkshopGetGradesReportRequest | 

    try:
        # Retrieves the assessment grades report.
        api_response = api_instance.mod_workshop_get_grades_report(mod_workshop_get_grades_report_request)
        print("The response of ModWorkshopApi->mod_workshop_get_grades_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_grades_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_grades_report_request** | [**ModWorkshopGetGradesReportRequest**](ModWorkshopGetGradesReportRequest.md)|  | 

### Return type

[**ModWorkshopGetGradesReport200Response**](ModWorkshopGetGradesReport200Response.md)

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

# **mod_workshop_get_reviewer_assessments**
> ModWorkshopGetReviewerAssessments200Response mod_workshop_get_reviewer_assessments(mod_workshop_get_reviewer_assessments_request)

Retrieves all the assessments reviewed by the given user.

Retrieves all the assessments reviewed by the given user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_reviewer_assessments200_response import ModWorkshopGetReviewerAssessments200Response
from openapi_client.models.mod_workshop_get_reviewer_assessments_request import ModWorkshopGetReviewerAssessmentsRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_reviewer_assessments_request = openapi_client.ModWorkshopGetReviewerAssessmentsRequest() # ModWorkshopGetReviewerAssessmentsRequest | 

    try:
        # Retrieves all the assessments reviewed by the given user.
        api_response = api_instance.mod_workshop_get_reviewer_assessments(mod_workshop_get_reviewer_assessments_request)
        print("The response of ModWorkshopApi->mod_workshop_get_reviewer_assessments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_reviewer_assessments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_reviewer_assessments_request** | [**ModWorkshopGetReviewerAssessmentsRequest**](ModWorkshopGetReviewerAssessmentsRequest.md)|  | 

### Return type

[**ModWorkshopGetReviewerAssessments200Response**](ModWorkshopGetReviewerAssessments200Response.md)

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

# **mod_workshop_get_submission**
> ModWorkshopGetSubmission200Response mod_workshop_get_submission(mod_workshop_get_submission_request)

Retrieves the given submission.

Retrieves the given submission.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_submission200_response import ModWorkshopGetSubmission200Response
from openapi_client.models.mod_workshop_get_submission_request import ModWorkshopGetSubmissionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_submission_request = openapi_client.ModWorkshopGetSubmissionRequest() # ModWorkshopGetSubmissionRequest | 

    try:
        # Retrieves the given submission.
        api_response = api_instance.mod_workshop_get_submission(mod_workshop_get_submission_request)
        print("The response of ModWorkshopApi->mod_workshop_get_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_submission_request** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md)|  | 

### Return type

[**ModWorkshopGetSubmission200Response**](ModWorkshopGetSubmission200Response.md)

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

# **mod_workshop_get_submission_assessments**
> ModWorkshopGetReviewerAssessments200Response mod_workshop_get_submission_assessments(mod_workshop_get_submission_request)

Retrieves all the assessments of the given submission.

Retrieves all the assessments of the given submission.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_reviewer_assessments200_response import ModWorkshopGetReviewerAssessments200Response
from openapi_client.models.mod_workshop_get_submission_request import ModWorkshopGetSubmissionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_submission_request = openapi_client.ModWorkshopGetSubmissionRequest() # ModWorkshopGetSubmissionRequest | 

    try:
        # Retrieves all the assessments of the given submission.
        api_response = api_instance.mod_workshop_get_submission_assessments(mod_workshop_get_submission_request)
        print("The response of ModWorkshopApi->mod_workshop_get_submission_assessments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_submission_assessments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_submission_request** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md)|  | 

### Return type

[**ModWorkshopGetReviewerAssessments200Response**](ModWorkshopGetReviewerAssessments200Response.md)

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

# **mod_workshop_get_submissions**
> ModWorkshopGetSubmissions200Response mod_workshop_get_submissions(mod_workshop_get_submissions_request)

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

Retrieves all the workshop submissions or the one done by the given user (except example submissions).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_submissions200_response import ModWorkshopGetSubmissions200Response
from openapi_client.models.mod_workshop_get_submissions_request import ModWorkshopGetSubmissionsRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_submissions_request = openapi_client.ModWorkshopGetSubmissionsRequest() # ModWorkshopGetSubmissionsRequest | 

    try:
        # Retrieves all the workshop submissions or the one done by the given user (except example submissions).
        api_response = api_instance.mod_workshop_get_submissions(mod_workshop_get_submissions_request)
        print("The response of ModWorkshopApi->mod_workshop_get_submissions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_submissions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_submissions_request** | [**ModWorkshopGetSubmissionsRequest**](ModWorkshopGetSubmissionsRequest.md)|  | 

### Return type

[**ModWorkshopGetSubmissions200Response**](ModWorkshopGetSubmissions200Response.md)

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

# **mod_workshop_get_user_plan**
> ModWorkshopGetUserPlan200Response mod_workshop_get_user_plan(mod_workshop_get_user_plan_request)

Return the planner information for the given user.

Return the planner information for the given user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_user_plan200_response import ModWorkshopGetUserPlan200Response
from openapi_client.models.mod_workshop_get_user_plan_request import ModWorkshopGetUserPlanRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_user_plan_request = openapi_client.ModWorkshopGetUserPlanRequest() # ModWorkshopGetUserPlanRequest | 

    try:
        # Return the planner information for the given user.
        api_response = api_instance.mod_workshop_get_user_plan(mod_workshop_get_user_plan_request)
        print("The response of ModWorkshopApi->mod_workshop_get_user_plan:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_user_plan: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_user_plan_request** | [**ModWorkshopGetUserPlanRequest**](ModWorkshopGetUserPlanRequest.md)|  | 

### Return type

[**ModWorkshopGetUserPlan200Response**](ModWorkshopGetUserPlan200Response.md)

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

# **mod_workshop_get_workshop_access_information**
> ModWorkshopGetWorkshopAccessInformation200Response mod_workshop_get_workshop_access_information(mod_workshop_get_workshop_access_information_request)

Return access information for a given workshop.

Return access information for a given workshop.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_get_workshop_access_information200_response import ModWorkshopGetWorkshopAccessInformation200Response
from openapi_client.models.mod_workshop_get_workshop_access_information_request import ModWorkshopGetWorkshopAccessInformationRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_workshop_access_information_request = openapi_client.ModWorkshopGetWorkshopAccessInformationRequest() # ModWorkshopGetWorkshopAccessInformationRequest | 

    try:
        # Return access information for a given workshop.
        api_response = api_instance.mod_workshop_get_workshop_access_information(mod_workshop_get_workshop_access_information_request)
        print("The response of ModWorkshopApi->mod_workshop_get_workshop_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_workshop_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_workshop_access_information_request** | [**ModWorkshopGetWorkshopAccessInformationRequest**](ModWorkshopGetWorkshopAccessInformationRequest.md)|  | 

### Return type

[**ModWorkshopGetWorkshopAccessInformation200Response**](ModWorkshopGetWorkshopAccessInformation200Response.md)

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

# **mod_workshop_get_workshops_by_courses**
> ModWorkshopGetWorkshopsByCourses200Response mod_workshop_get_workshops_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request import ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest
from openapi_client.models.mod_workshop_get_workshops_by_courses200_response import ModWorkshopGetWorkshopsByCourses200Response
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request = openapi_client.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest() # ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest | 

    try:
        # Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
        api_response = api_instance.mod_workshop_get_workshops_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
        print("The response of ModWorkshopApi->mod_workshop_get_workshops_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_get_workshops_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)|  | 

### Return type

[**ModWorkshopGetWorkshopsByCourses200Response**](ModWorkshopGetWorkshopsByCourses200Response.md)

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

# **mod_workshop_update_assessment**
> ModWorkshopUpdateAssessment200Response mod_workshop_update_assessment(mod_workshop_update_assessment_request)

Add information to an allocated assessment.

Add information to an allocated assessment.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_update_assessment200_response import ModWorkshopUpdateAssessment200Response
from openapi_client.models.mod_workshop_update_assessment_request import ModWorkshopUpdateAssessmentRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_update_assessment_request = openapi_client.ModWorkshopUpdateAssessmentRequest() # ModWorkshopUpdateAssessmentRequest | 

    try:
        # Add information to an allocated assessment.
        api_response = api_instance.mod_workshop_update_assessment(mod_workshop_update_assessment_request)
        print("The response of ModWorkshopApi->mod_workshop_update_assessment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_update_assessment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_update_assessment_request** | [**ModWorkshopUpdateAssessmentRequest**](ModWorkshopUpdateAssessmentRequest.md)|  | 

### Return type

[**ModWorkshopUpdateAssessment200Response**](ModWorkshopUpdateAssessment200Response.md)

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

# **mod_workshop_update_submission**
> ModWorkshopUpdateSubmission200Response mod_workshop_update_submission(mod_workshop_update_submission_request)

Update the given submission.

Update the given submission.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_workshop_update_submission200_response import ModWorkshopUpdateSubmission200Response
from openapi_client.models.mod_workshop_update_submission_request import ModWorkshopUpdateSubmissionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_update_submission_request = openapi_client.ModWorkshopUpdateSubmissionRequest() # ModWorkshopUpdateSubmissionRequest | 

    try:
        # Update the given submission.
        api_response = api_instance.mod_workshop_update_submission(mod_workshop_update_submission_request)
        print("The response of ModWorkshopApi->mod_workshop_update_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_update_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_update_submission_request** | [**ModWorkshopUpdateSubmissionRequest**](ModWorkshopUpdateSubmissionRequest.md)|  | 

### Return type

[**ModWorkshopUpdateSubmission200Response**](ModWorkshopUpdateSubmission200Response.md)

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

# **mod_workshop_view_submission**
> CoreCalendarDeleteSubscription200Response mod_workshop_view_submission(mod_workshop_get_submission_request)

Trigger the submission viewed event.

Trigger the submission viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_workshop_get_submission_request import ModWorkshopGetSubmissionRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_get_submission_request = openapi_client.ModWorkshopGetSubmissionRequest() # ModWorkshopGetSubmissionRequest | 

    try:
        # Trigger the submission viewed event.
        api_response = api_instance.mod_workshop_view_submission(mod_workshop_get_submission_request)
        print("The response of ModWorkshopApi->mod_workshop_view_submission:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_view_submission: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_get_submission_request** | [**ModWorkshopGetSubmissionRequest**](ModWorkshopGetSubmissionRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

# **mod_workshop_view_workshop**
> CoreCalendarDeleteSubscription200Response mod_workshop_view_workshop(mod_workshop_view_workshop_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_workshop_view_workshop_request import ModWorkshopViewWorkshopRequest
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
    api_instance = openapi_client.ModWorkshopApi(api_client)
    mod_workshop_view_workshop_request = openapi_client.ModWorkshopViewWorkshopRequest() # ModWorkshopViewWorkshopRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_workshop_view_workshop(mod_workshop_view_workshop_request)
        print("The response of ModWorkshopApi->mod_workshop_view_workshop:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWorkshopApi->mod_workshop_view_workshop: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_workshop_view_workshop_request** | [**ModWorkshopViewWorkshopRequest**](ModWorkshopViewWorkshopRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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


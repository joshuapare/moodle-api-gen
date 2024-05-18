# openapi_client.ToolLpApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_lp_data_for_competencies_manage_page**](ToolLpApi.md#tool_lp_data_for_competencies_manage_page) | **POST** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template
[**tool_lp_data_for_competency_frameworks_manage_page**](ToolLpApi.md#tool_lp_data_for_competency_frameworks_manage_page) | **POST** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template
[**tool_lp_data_for_competency_summary**](ToolLpApi.md#tool_lp_data_for_competency_summary) | **POST** /tool_lp_data_for_competency_summary | Load competency data for summary template.
[**tool_lp_data_for_course_competencies_page**](ToolLpApi.md#tool_lp_data_for_course_competencies_page) | **POST** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template.
[**tool_lp_data_for_plan_page**](ToolLpApi.md#tool_lp_data_for_plan_page) | **POST** /tool_lp_data_for_plan_page | Load the data for the plan page template.
[**tool_lp_data_for_plans_page**](ToolLpApi.md#tool_lp_data_for_plans_page) | **POST** /tool_lp_data_for_plans_page | Load the data for the plans page template
[**tool_lp_data_for_related_competencies_section**](ToolLpApi.md#tool_lp_data_for_related_competencies_section) | **POST** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template.
[**tool_lp_data_for_template_competencies_page**](ToolLpApi.md#tool_lp_data_for_template_competencies_page) | **POST** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template.
[**tool_lp_data_for_templates_manage_page**](ToolLpApi.md#tool_lp_data_for_templates_manage_page) | **POST** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template
[**tool_lp_data_for_user_competency_summary**](ToolLpApi.md#tool_lp_data_for_user_competency_summary) | **POST** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency.
[**tool_lp_data_for_user_competency_summary_in_course**](ToolLpApi.md#tool_lp_data_for_user_competency_summary_in_course) | **POST** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency.
[**tool_lp_data_for_user_competency_summary_in_plan**](ToolLpApi.md#tool_lp_data_for_user_competency_summary_in_plan) | **POST** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency.
[**tool_lp_data_for_user_evidence_list_page**](ToolLpApi.md#tool_lp_data_for_user_evidence_list_page) | **POST** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template
[**tool_lp_data_for_user_evidence_page**](ToolLpApi.md#tool_lp_data_for_user_evidence_page) | **POST** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template
[**tool_lp_list_courses_using_competency**](ToolLpApi.md#tool_lp_list_courses_using_competency) | **POST** /tool_lp_list_courses_using_competency | List the courses using a competency
[**tool_lp_search_cohorts**](ToolLpApi.md#tool_lp_search_cohorts) | **POST** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead
[**tool_lp_search_users**](ToolLpApi.md#tool_lp_search_users) | **POST** /tool_lp_search_users | Search for users.


# **tool_lp_data_for_competencies_manage_page**
> ToolLpDataForCompetenciesManagePage200Response tool_lp_data_for_competencies_manage_page(tool_lp_data_for_competencies_manage_page_request)

Load the data for the competencies manage page template

Load the data for the competencies manage page template

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_competencies_manage_page200_response import ToolLpDataForCompetenciesManagePage200Response
from openapi_client.models.tool_lp_data_for_competencies_manage_page_request import ToolLpDataForCompetenciesManagePageRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_competencies_manage_page_request = openapi_client.ToolLpDataForCompetenciesManagePageRequest() # ToolLpDataForCompetenciesManagePageRequest | 

    try:
        # Load the data for the competencies manage page template
        api_response = api_instance.tool_lp_data_for_competencies_manage_page(tool_lp_data_for_competencies_manage_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_competencies_manage_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_competencies_manage_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_competencies_manage_page_request** | [**ToolLpDataForCompetenciesManagePageRequest**](ToolLpDataForCompetenciesManagePageRequest.md)|  | 

### Return type

[**ToolLpDataForCompetenciesManagePage200Response**](ToolLpDataForCompetenciesManagePage200Response.md)

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

# **tool_lp_data_for_competency_frameworks_manage_page**
> ToolLpDataForCompetencyFrameworksManagePage200Response tool_lp_data_for_competency_frameworks_manage_page(tool_lp_data_for_competency_frameworks_manage_page_request)

Load the data for the competency frameworks manage page template

Load the data for the competency frameworks manage page template

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_competency_frameworks_manage_page200_response import ToolLpDataForCompetencyFrameworksManagePage200Response
from openapi_client.models.tool_lp_data_for_competency_frameworks_manage_page_request import ToolLpDataForCompetencyFrameworksManagePageRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_competency_frameworks_manage_page_request = openapi_client.ToolLpDataForCompetencyFrameworksManagePageRequest() # ToolLpDataForCompetencyFrameworksManagePageRequest | 

    try:
        # Load the data for the competency frameworks manage page template
        api_response = api_instance.tool_lp_data_for_competency_frameworks_manage_page(tool_lp_data_for_competency_frameworks_manage_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_competency_frameworks_manage_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_competency_frameworks_manage_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_competency_frameworks_manage_page_request** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md)|  | 

### Return type

[**ToolLpDataForCompetencyFrameworksManagePage200Response**](ToolLpDataForCompetencyFrameworksManagePage200Response.md)

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

# **tool_lp_data_for_competency_summary**
> ToolLpDataForCompetencySummary200Response tool_lp_data_for_competency_summary(tool_lp_data_for_competency_summary_request)

Load competency data for summary template.

Load competency data for summary template.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_competency_summary200_response import ToolLpDataForCompetencySummary200Response
from openapi_client.models.tool_lp_data_for_competency_summary_request import ToolLpDataForCompetencySummaryRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_competency_summary_request = openapi_client.ToolLpDataForCompetencySummaryRequest() # ToolLpDataForCompetencySummaryRequest | 

    try:
        # Load competency data for summary template.
        api_response = api_instance.tool_lp_data_for_competency_summary(tool_lp_data_for_competency_summary_request)
        print("The response of ToolLpApi->tool_lp_data_for_competency_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_competency_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_competency_summary_request** | [**ToolLpDataForCompetencySummaryRequest**](ToolLpDataForCompetencySummaryRequest.md)|  | 

### Return type

[**ToolLpDataForCompetencySummary200Response**](ToolLpDataForCompetencySummary200Response.md)

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

# **tool_lp_data_for_course_competencies_page**
> ToolLpDataForCourseCompetenciesPage200Response tool_lp_data_for_course_competencies_page(tool_lp_data_for_course_competencies_page_request)

Load the data for the course competencies page template.

Load the data for the course competencies page template.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response import ToolLpDataForCourseCompetenciesPage200Response
from openapi_client.models.tool_lp_data_for_course_competencies_page_request import ToolLpDataForCourseCompetenciesPageRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_course_competencies_page_request = openapi_client.ToolLpDataForCourseCompetenciesPageRequest() # ToolLpDataForCourseCompetenciesPageRequest | 

    try:
        # Load the data for the course competencies page template.
        api_response = api_instance.tool_lp_data_for_course_competencies_page(tool_lp_data_for_course_competencies_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_course_competencies_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_course_competencies_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_course_competencies_page_request** | [**ToolLpDataForCourseCompetenciesPageRequest**](ToolLpDataForCourseCompetenciesPageRequest.md)|  | 

### Return type

[**ToolLpDataForCourseCompetenciesPage200Response**](ToolLpDataForCourseCompetenciesPage200Response.md)

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

# **tool_lp_data_for_plan_page**
> ToolLpDataForPlanPage200Response tool_lp_data_for_plan_page(core_competency_complete_plan_request)

Load the data for the plan page template.

Load the data for the plan page template.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_competency_complete_plan_request import CoreCompetencyCompletePlanRequest
from openapi_client.models.tool_lp_data_for_plan_page200_response import ToolLpDataForPlanPage200Response
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
    api_instance = openapi_client.ToolLpApi(api_client)
    core_competency_complete_plan_request = openapi_client.CoreCompetencyCompletePlanRequest() # CoreCompetencyCompletePlanRequest | 

    try:
        # Load the data for the plan page template.
        api_response = api_instance.tool_lp_data_for_plan_page(core_competency_complete_plan_request)
        print("The response of ToolLpApi->tool_lp_data_for_plan_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_plan_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **core_competency_complete_plan_request** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md)|  | 

### Return type

[**ToolLpDataForPlanPage200Response**](ToolLpDataForPlanPage200Response.md)

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

# **tool_lp_data_for_plans_page**
> ToolLpDataForPlansPage200Response tool_lp_data_for_plans_page(tool_lp_data_for_plans_page_request)

Load the data for the plans page template

Load the data for the plans page template

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_plans_page200_response import ToolLpDataForPlansPage200Response
from openapi_client.models.tool_lp_data_for_plans_page_request import ToolLpDataForPlansPageRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_plans_page_request = openapi_client.ToolLpDataForPlansPageRequest() # ToolLpDataForPlansPageRequest | 

    try:
        # Load the data for the plans page template
        api_response = api_instance.tool_lp_data_for_plans_page(tool_lp_data_for_plans_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_plans_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_plans_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_plans_page_request** | [**ToolLpDataForPlansPageRequest**](ToolLpDataForPlansPageRequest.md)|  | 

### Return type

[**ToolLpDataForPlansPage200Response**](ToolLpDataForPlansPage200Response.md)

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

# **tool_lp_data_for_related_competencies_section**
> ToolLpDataForRelatedCompetenciesSection200Response tool_lp_data_for_related_competencies_section(tool_lp_data_for_related_competencies_section_request)

Load the data for the related competencies template.

Load the data for the related competencies template.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_related_competencies_section200_response import ToolLpDataForRelatedCompetenciesSection200Response
from openapi_client.models.tool_lp_data_for_related_competencies_section_request import ToolLpDataForRelatedCompetenciesSectionRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_related_competencies_section_request = openapi_client.ToolLpDataForRelatedCompetenciesSectionRequest() # ToolLpDataForRelatedCompetenciesSectionRequest | 

    try:
        # Load the data for the related competencies template.
        api_response = api_instance.tool_lp_data_for_related_competencies_section(tool_lp_data_for_related_competencies_section_request)
        print("The response of ToolLpApi->tool_lp_data_for_related_competencies_section:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_related_competencies_section: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_related_competencies_section_request** | [**ToolLpDataForRelatedCompetenciesSectionRequest**](ToolLpDataForRelatedCompetenciesSectionRequest.md)|  | 

### Return type

[**ToolLpDataForRelatedCompetenciesSection200Response**](ToolLpDataForRelatedCompetenciesSection200Response.md)

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

# **tool_lp_data_for_template_competencies_page**
> ToolLpDataForTemplateCompetenciesPage200Response tool_lp_data_for_template_competencies_page(tool_lp_data_for_template_competencies_page_request)

Load the data for the template competencies page template.

Load the data for the template competencies page template.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_template_competencies_page200_response import ToolLpDataForTemplateCompetenciesPage200Response
from openapi_client.models.tool_lp_data_for_template_competencies_page_request import ToolLpDataForTemplateCompetenciesPageRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_template_competencies_page_request = openapi_client.ToolLpDataForTemplateCompetenciesPageRequest() # ToolLpDataForTemplateCompetenciesPageRequest | 

    try:
        # Load the data for the template competencies page template.
        api_response = api_instance.tool_lp_data_for_template_competencies_page(tool_lp_data_for_template_competencies_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_template_competencies_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_template_competencies_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_template_competencies_page_request** | [**ToolLpDataForTemplateCompetenciesPageRequest**](ToolLpDataForTemplateCompetenciesPageRequest.md)|  | 

### Return type

[**ToolLpDataForTemplateCompetenciesPage200Response**](ToolLpDataForTemplateCompetenciesPage200Response.md)

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

# **tool_lp_data_for_templates_manage_page**
> ToolLpDataForTemplatesManagePage200Response tool_lp_data_for_templates_manage_page(tool_lp_data_for_competency_frameworks_manage_page_request)

Load the data for the learning plan templates manage page template

Load the data for the learning plan templates manage page template

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_competency_frameworks_manage_page_request import ToolLpDataForCompetencyFrameworksManagePageRequest
from openapi_client.models.tool_lp_data_for_templates_manage_page200_response import ToolLpDataForTemplatesManagePage200Response
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_competency_frameworks_manage_page_request = openapi_client.ToolLpDataForCompetencyFrameworksManagePageRequest() # ToolLpDataForCompetencyFrameworksManagePageRequest | 

    try:
        # Load the data for the learning plan templates manage page template
        api_response = api_instance.tool_lp_data_for_templates_manage_page(tool_lp_data_for_competency_frameworks_manage_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_templates_manage_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_templates_manage_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_competency_frameworks_manage_page_request** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md)|  | 

### Return type

[**ToolLpDataForTemplatesManagePage200Response**](ToolLpDataForTemplatesManagePage200Response.md)

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

# **tool_lp_data_for_user_competency_summary**
> ToolLpDataForUserCompetencySummary200Response tool_lp_data_for_user_competency_summary(tool_lp_data_for_user_competency_summary_request)

Load a summary of a user competency.

Load a summary of a user competency.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_user_competency_summary200_response import ToolLpDataForUserCompetencySummary200Response
from openapi_client.models.tool_lp_data_for_user_competency_summary_request import ToolLpDataForUserCompetencySummaryRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_user_competency_summary_request = openapi_client.ToolLpDataForUserCompetencySummaryRequest() # ToolLpDataForUserCompetencySummaryRequest | 

    try:
        # Load a summary of a user competency.
        api_response = api_instance.tool_lp_data_for_user_competency_summary(tool_lp_data_for_user_competency_summary_request)
        print("The response of ToolLpApi->tool_lp_data_for_user_competency_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_user_competency_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_user_competency_summary_request** | [**ToolLpDataForUserCompetencySummaryRequest**](ToolLpDataForUserCompetencySummaryRequest.md)|  | 

### Return type

[**ToolLpDataForUserCompetencySummary200Response**](ToolLpDataForUserCompetencySummary200Response.md)

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

# **tool_lp_data_for_user_competency_summary_in_course**
> ToolLpDataForUserCompetencySummaryInCourse200Response tool_lp_data_for_user_competency_summary_in_course(tool_lp_data_for_user_competency_summary_in_course_request)

Load a summary of a user competency.

Load a summary of a user competency.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_user_competency_summary_in_course200_response import ToolLpDataForUserCompetencySummaryInCourse200Response
from openapi_client.models.tool_lp_data_for_user_competency_summary_in_course_request import ToolLpDataForUserCompetencySummaryInCourseRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_user_competency_summary_in_course_request = openapi_client.ToolLpDataForUserCompetencySummaryInCourseRequest() # ToolLpDataForUserCompetencySummaryInCourseRequest | 

    try:
        # Load a summary of a user competency.
        api_response = api_instance.tool_lp_data_for_user_competency_summary_in_course(tool_lp_data_for_user_competency_summary_in_course_request)
        print("The response of ToolLpApi->tool_lp_data_for_user_competency_summary_in_course:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_user_competency_summary_in_course: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_user_competency_summary_in_course_request** | [**ToolLpDataForUserCompetencySummaryInCourseRequest**](ToolLpDataForUserCompetencySummaryInCourseRequest.md)|  | 

### Return type

[**ToolLpDataForUserCompetencySummaryInCourse200Response**](ToolLpDataForUserCompetencySummaryInCourse200Response.md)

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

# **tool_lp_data_for_user_competency_summary_in_plan**
> ToolLpDataForUserCompetencySummaryInPlan200Response tool_lp_data_for_user_competency_summary_in_plan(tool_lp_data_for_user_competency_summary_in_plan_request)

Load a summary of a user competency.

Load a summary of a user competency.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_user_competency_summary_in_plan200_response import ToolLpDataForUserCompetencySummaryInPlan200Response
from openapi_client.models.tool_lp_data_for_user_competency_summary_in_plan_request import ToolLpDataForUserCompetencySummaryInPlanRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_user_competency_summary_in_plan_request = openapi_client.ToolLpDataForUserCompetencySummaryInPlanRequest() # ToolLpDataForUserCompetencySummaryInPlanRequest | 

    try:
        # Load a summary of a user competency.
        api_response = api_instance.tool_lp_data_for_user_competency_summary_in_plan(tool_lp_data_for_user_competency_summary_in_plan_request)
        print("The response of ToolLpApi->tool_lp_data_for_user_competency_summary_in_plan:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_user_competency_summary_in_plan: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_user_competency_summary_in_plan_request** | [**ToolLpDataForUserCompetencySummaryInPlanRequest**](ToolLpDataForUserCompetencySummaryInPlanRequest.md)|  | 

### Return type

[**ToolLpDataForUserCompetencySummaryInPlan200Response**](ToolLpDataForUserCompetencySummaryInPlan200Response.md)

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

# **tool_lp_data_for_user_evidence_list_page**
> ToolLpDataForUserEvidenceListPage200Response tool_lp_data_for_user_evidence_list_page(tool_lp_data_for_user_evidence_list_page_request)

Load the data for the user evidence list page template

Load the data for the user evidence list page template

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_user_evidence_list_page200_response import ToolLpDataForUserEvidenceListPage200Response
from openapi_client.models.tool_lp_data_for_user_evidence_list_page_request import ToolLpDataForUserEvidenceListPageRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_user_evidence_list_page_request = openapi_client.ToolLpDataForUserEvidenceListPageRequest() # ToolLpDataForUserEvidenceListPageRequest | 

    try:
        # Load the data for the user evidence list page template
        api_response = api_instance.tool_lp_data_for_user_evidence_list_page(tool_lp_data_for_user_evidence_list_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_user_evidence_list_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_user_evidence_list_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_user_evidence_list_page_request** | [**ToolLpDataForUserEvidenceListPageRequest**](ToolLpDataForUserEvidenceListPageRequest.md)|  | 

### Return type

[**ToolLpDataForUserEvidenceListPage200Response**](ToolLpDataForUserEvidenceListPage200Response.md)

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

# **tool_lp_data_for_user_evidence_page**
> ToolLpDataForUserEvidencePage200Response tool_lp_data_for_user_evidence_page(tool_lp_data_for_user_evidence_page_request)

Load the data for the user evidence page template

Load the data for the user evidence page template

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_data_for_user_evidence_page200_response import ToolLpDataForUserEvidencePage200Response
from openapi_client.models.tool_lp_data_for_user_evidence_page_request import ToolLpDataForUserEvidencePageRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_data_for_user_evidence_page_request = openapi_client.ToolLpDataForUserEvidencePageRequest() # ToolLpDataForUserEvidencePageRequest | 

    try:
        # Load the data for the user evidence page template
        api_response = api_instance.tool_lp_data_for_user_evidence_page(tool_lp_data_for_user_evidence_page_request)
        print("The response of ToolLpApi->tool_lp_data_for_user_evidence_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_data_for_user_evidence_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_data_for_user_evidence_page_request** | [**ToolLpDataForUserEvidencePageRequest**](ToolLpDataForUserEvidencePageRequest.md)|  | 

### Return type

[**ToolLpDataForUserEvidencePage200Response**](ToolLpDataForUserEvidencePage200Response.md)

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

# **tool_lp_list_courses_using_competency**
> object tool_lp_list_courses_using_competency(core_competency_competency_viewed_request)

List the courses using a competency

List the courses using a competency

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_competency_competency_viewed_request import CoreCompetencyCompetencyViewedRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    core_competency_competency_viewed_request = openapi_client.CoreCompetencyCompetencyViewedRequest() # CoreCompetencyCompetencyViewedRequest | 

    try:
        # List the courses using a competency
        api_response = api_instance.tool_lp_list_courses_using_competency(core_competency_competency_viewed_request)
        print("The response of ToolLpApi->tool_lp_list_courses_using_competency:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_list_courses_using_competency: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md)|  | 

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

# **tool_lp_search_cohorts**
> ToolLpSearchCohorts200Response tool_lp_search_cohorts(tool_lp_search_cohorts_request)

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_search_cohorts200_response import ToolLpSearchCohorts200Response
from openapi_client.models.tool_lp_search_cohorts_request import ToolLpSearchCohortsRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_search_cohorts_request = openapi_client.ToolLpSearchCohortsRequest() # ToolLpSearchCohortsRequest | 

    try:
        # Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead
        api_response = api_instance.tool_lp_search_cohorts(tool_lp_search_cohorts_request)
        print("The response of ToolLpApi->tool_lp_search_cohorts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_search_cohorts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_search_cohorts_request** | [**ToolLpSearchCohortsRequest**](ToolLpSearchCohortsRequest.md)|  | 

### Return type

[**ToolLpSearchCohorts200Response**](ToolLpSearchCohorts200Response.md)

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

# **tool_lp_search_users**
> ToolLpSearchUsers200Response tool_lp_search_users(tool_lp_search_users_request)

Search for users.

Search for users.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_lp_search_users200_response import ToolLpSearchUsers200Response
from openapi_client.models.tool_lp_search_users_request import ToolLpSearchUsersRequest
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
    api_instance = openapi_client.ToolLpApi(api_client)
    tool_lp_search_users_request = openapi_client.ToolLpSearchUsersRequest() # ToolLpSearchUsersRequest | 

    try:
        # Search for users.
        api_response = api_instance.tool_lp_search_users(tool_lp_search_users_request)
        print("The response of ToolLpApi->tool_lp_search_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolLpApi->tool_lp_search_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_lp_search_users_request** | [**ToolLpSearchUsersRequest**](ToolLpSearchUsersRequest.md)|  | 

### Return type

[**ToolLpSearchUsers200Response**](ToolLpSearchUsers200Response.md)

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


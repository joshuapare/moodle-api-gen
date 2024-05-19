# MoodleClient.Api.ToolLpApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolLpDataForCompetenciesManagePage**](ToolLpApi.md#toollpdataforcompetenciesmanagepage) | **POST** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template |
| [**ToolLpDataForCompetencyFrameworksManagePage**](ToolLpApi.md#toollpdataforcompetencyframeworksmanagepage) | **POST** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template |
| [**ToolLpDataForCompetencySummary**](ToolLpApi.md#toollpdataforcompetencysummary) | **POST** /tool_lp_data_for_competency_summary | Load competency data for summary template. |
| [**ToolLpDataForCourseCompetenciesPage**](ToolLpApi.md#toollpdataforcoursecompetenciespage) | **POST** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template. |
| [**ToolLpDataForPlanPage**](ToolLpApi.md#toollpdataforplanpage) | **POST** /tool_lp_data_for_plan_page | Load the data for the plan page template. |
| [**ToolLpDataForPlansPage**](ToolLpApi.md#toollpdataforplanspage) | **POST** /tool_lp_data_for_plans_page | Load the data for the plans page template |
| [**ToolLpDataForRelatedCompetenciesSection**](ToolLpApi.md#toollpdataforrelatedcompetenciessection) | **POST** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template. |
| [**ToolLpDataForTemplateCompetenciesPage**](ToolLpApi.md#toollpdatafortemplatecompetenciespage) | **POST** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template. |
| [**ToolLpDataForTemplatesManagePage**](ToolLpApi.md#toollpdatafortemplatesmanagepage) | **POST** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template |
| [**ToolLpDataForUserCompetencySummary**](ToolLpApi.md#toollpdataforusercompetencysummary) | **POST** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency. |
| [**ToolLpDataForUserCompetencySummaryInCourse**](ToolLpApi.md#toollpdataforusercompetencysummaryincourse) | **POST** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency. |
| [**ToolLpDataForUserCompetencySummaryInPlan**](ToolLpApi.md#toollpdataforusercompetencysummaryinplan) | **POST** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency. |
| [**ToolLpDataForUserEvidenceListPage**](ToolLpApi.md#toollpdataforuserevidencelistpage) | **POST** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template |
| [**ToolLpDataForUserEvidencePage**](ToolLpApi.md#toollpdataforuserevidencepage) | **POST** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template |
| [**ToolLpListCoursesUsingCompetency**](ToolLpApi.md#toollplistcoursesusingcompetency) | **POST** /tool_lp_list_courses_using_competency | List the courses using a competency |
| [**ToolLpSearchCohorts**](ToolLpApi.md#toollpsearchcohorts) | **POST** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead |
| [**ToolLpSearchUsers**](ToolLpApi.md#toollpsearchusers) | **POST** /tool_lp_search_users | Search for users. |

<a id="toollpdataforcompetenciesmanagepage"></a>
# **ToolLpDataForCompetenciesManagePage**
> ToolLpDataForCompetenciesManagePage200Response ToolLpDataForCompetenciesManagePage (ToolLpDataForCompetenciesManagePageRequest toolLpDataForCompetenciesManagePageRequest)

Load the data for the competencies manage page template

Load the data for the competencies manage page template

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForCompetenciesManagePageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForCompetenciesManagePageRequest = new ToolLpDataForCompetenciesManagePageRequest(); // ToolLpDataForCompetenciesManagePageRequest | 

            try
            {
                // Load the data for the competencies manage page template
                ToolLpDataForCompetenciesManagePage200Response result = apiInstance.ToolLpDataForCompetenciesManagePage(toolLpDataForCompetenciesManagePageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCompetenciesManagePage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForCompetenciesManagePageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the competencies manage page template
    ApiResponse<ToolLpDataForCompetenciesManagePage200Response> response = apiInstance.ToolLpDataForCompetenciesManagePageWithHttpInfo(toolLpDataForCompetenciesManagePageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCompetenciesManagePageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForCompetenciesManagePageRequest** | [**ToolLpDataForCompetenciesManagePageRequest**](ToolLpDataForCompetenciesManagePageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforcompetencyframeworksmanagepage"></a>
# **ToolLpDataForCompetencyFrameworksManagePage**
> ToolLpDataForCompetencyFrameworksManagePage200Response ToolLpDataForCompetencyFrameworksManagePage (ToolLpDataForCompetencyFrameworksManagePageRequest toolLpDataForCompetencyFrameworksManagePageRequest)

Load the data for the competency frameworks manage page template

Load the data for the competency frameworks manage page template

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForCompetencyFrameworksManagePageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForCompetencyFrameworksManagePageRequest = new ToolLpDataForCompetencyFrameworksManagePageRequest(); // ToolLpDataForCompetencyFrameworksManagePageRequest | 

            try
            {
                // Load the data for the competency frameworks manage page template
                ToolLpDataForCompetencyFrameworksManagePage200Response result = apiInstance.ToolLpDataForCompetencyFrameworksManagePage(toolLpDataForCompetencyFrameworksManagePageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCompetencyFrameworksManagePage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForCompetencyFrameworksManagePageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the competency frameworks manage page template
    ApiResponse<ToolLpDataForCompetencyFrameworksManagePage200Response> response = apiInstance.ToolLpDataForCompetencyFrameworksManagePageWithHttpInfo(toolLpDataForCompetencyFrameworksManagePageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCompetencyFrameworksManagePageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForCompetencyFrameworksManagePageRequest** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforcompetencysummary"></a>
# **ToolLpDataForCompetencySummary**
> ToolLpDataForCompetencySummary200Response ToolLpDataForCompetencySummary (ToolLpDataForCompetencySummaryRequest toolLpDataForCompetencySummaryRequest)

Load competency data for summary template.

Load competency data for summary template.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForCompetencySummaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForCompetencySummaryRequest = new ToolLpDataForCompetencySummaryRequest(); // ToolLpDataForCompetencySummaryRequest | 

            try
            {
                // Load competency data for summary template.
                ToolLpDataForCompetencySummary200Response result = apiInstance.ToolLpDataForCompetencySummary(toolLpDataForCompetencySummaryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCompetencySummary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForCompetencySummaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load competency data for summary template.
    ApiResponse<ToolLpDataForCompetencySummary200Response> response = apiInstance.ToolLpDataForCompetencySummaryWithHttpInfo(toolLpDataForCompetencySummaryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCompetencySummaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForCompetencySummaryRequest** | [**ToolLpDataForCompetencySummaryRequest**](ToolLpDataForCompetencySummaryRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforcoursecompetenciespage"></a>
# **ToolLpDataForCourseCompetenciesPage**
> ToolLpDataForCourseCompetenciesPage200Response ToolLpDataForCourseCompetenciesPage (ToolLpDataForCourseCompetenciesPageRequest toolLpDataForCourseCompetenciesPageRequest)

Load the data for the course competencies page template.

Load the data for the course competencies page template.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForCourseCompetenciesPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForCourseCompetenciesPageRequest = new ToolLpDataForCourseCompetenciesPageRequest(); // ToolLpDataForCourseCompetenciesPageRequest | 

            try
            {
                // Load the data for the course competencies page template.
                ToolLpDataForCourseCompetenciesPage200Response result = apiInstance.ToolLpDataForCourseCompetenciesPage(toolLpDataForCourseCompetenciesPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCourseCompetenciesPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForCourseCompetenciesPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the course competencies page template.
    ApiResponse<ToolLpDataForCourseCompetenciesPage200Response> response = apiInstance.ToolLpDataForCourseCompetenciesPageWithHttpInfo(toolLpDataForCourseCompetenciesPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForCourseCompetenciesPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForCourseCompetenciesPageRequest** | [**ToolLpDataForCourseCompetenciesPageRequest**](ToolLpDataForCourseCompetenciesPageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforplanpage"></a>
# **ToolLpDataForPlanPage**
> ToolLpDataForPlanPage200Response ToolLpDataForPlanPage (CoreCompetencyCompletePlanRequest coreCompetencyCompletePlanRequest)

Load the data for the plan page template.

Load the data for the plan page template.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForPlanPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var coreCompetencyCompletePlanRequest = new CoreCompetencyCompletePlanRequest(); // CoreCompetencyCompletePlanRequest | 

            try
            {
                // Load the data for the plan page template.
                ToolLpDataForPlanPage200Response result = apiInstance.ToolLpDataForPlanPage(coreCompetencyCompletePlanRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForPlanPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForPlanPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the plan page template.
    ApiResponse<ToolLpDataForPlanPage200Response> response = apiInstance.ToolLpDataForPlanPageWithHttpInfo(coreCompetencyCompletePlanRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForPlanPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreCompetencyCompletePlanRequest** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforplanspage"></a>
# **ToolLpDataForPlansPage**
> ToolLpDataForPlansPage200Response ToolLpDataForPlansPage (ToolLpDataForPlansPageRequest toolLpDataForPlansPageRequest)

Load the data for the plans page template

Load the data for the plans page template

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForPlansPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForPlansPageRequest = new ToolLpDataForPlansPageRequest(); // ToolLpDataForPlansPageRequest | 

            try
            {
                // Load the data for the plans page template
                ToolLpDataForPlansPage200Response result = apiInstance.ToolLpDataForPlansPage(toolLpDataForPlansPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForPlansPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForPlansPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the plans page template
    ApiResponse<ToolLpDataForPlansPage200Response> response = apiInstance.ToolLpDataForPlansPageWithHttpInfo(toolLpDataForPlansPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForPlansPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForPlansPageRequest** | [**ToolLpDataForPlansPageRequest**](ToolLpDataForPlansPageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforrelatedcompetenciessection"></a>
# **ToolLpDataForRelatedCompetenciesSection**
> ToolLpDataForRelatedCompetenciesSection200Response ToolLpDataForRelatedCompetenciesSection (ToolLpDataForRelatedCompetenciesSectionRequest toolLpDataForRelatedCompetenciesSectionRequest)

Load the data for the related competencies template.

Load the data for the related competencies template.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForRelatedCompetenciesSectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForRelatedCompetenciesSectionRequest = new ToolLpDataForRelatedCompetenciesSectionRequest(); // ToolLpDataForRelatedCompetenciesSectionRequest | 

            try
            {
                // Load the data for the related competencies template.
                ToolLpDataForRelatedCompetenciesSection200Response result = apiInstance.ToolLpDataForRelatedCompetenciesSection(toolLpDataForRelatedCompetenciesSectionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForRelatedCompetenciesSection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForRelatedCompetenciesSectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the related competencies template.
    ApiResponse<ToolLpDataForRelatedCompetenciesSection200Response> response = apiInstance.ToolLpDataForRelatedCompetenciesSectionWithHttpInfo(toolLpDataForRelatedCompetenciesSectionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForRelatedCompetenciesSectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForRelatedCompetenciesSectionRequest** | [**ToolLpDataForRelatedCompetenciesSectionRequest**](ToolLpDataForRelatedCompetenciesSectionRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdatafortemplatecompetenciespage"></a>
# **ToolLpDataForTemplateCompetenciesPage**
> ToolLpDataForTemplateCompetenciesPage200Response ToolLpDataForTemplateCompetenciesPage (ToolLpDataForTemplateCompetenciesPageRequest toolLpDataForTemplateCompetenciesPageRequest)

Load the data for the template competencies page template.

Load the data for the template competencies page template.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForTemplateCompetenciesPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForTemplateCompetenciesPageRequest = new ToolLpDataForTemplateCompetenciesPageRequest(); // ToolLpDataForTemplateCompetenciesPageRequest | 

            try
            {
                // Load the data for the template competencies page template.
                ToolLpDataForTemplateCompetenciesPage200Response result = apiInstance.ToolLpDataForTemplateCompetenciesPage(toolLpDataForTemplateCompetenciesPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForTemplateCompetenciesPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForTemplateCompetenciesPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the template competencies page template.
    ApiResponse<ToolLpDataForTemplateCompetenciesPage200Response> response = apiInstance.ToolLpDataForTemplateCompetenciesPageWithHttpInfo(toolLpDataForTemplateCompetenciesPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForTemplateCompetenciesPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForTemplateCompetenciesPageRequest** | [**ToolLpDataForTemplateCompetenciesPageRequest**](ToolLpDataForTemplateCompetenciesPageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdatafortemplatesmanagepage"></a>
# **ToolLpDataForTemplatesManagePage**
> ToolLpDataForTemplatesManagePage200Response ToolLpDataForTemplatesManagePage (ToolLpDataForCompetencyFrameworksManagePageRequest toolLpDataForCompetencyFrameworksManagePageRequest)

Load the data for the learning plan templates manage page template

Load the data for the learning plan templates manage page template

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForTemplatesManagePageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForCompetencyFrameworksManagePageRequest = new ToolLpDataForCompetencyFrameworksManagePageRequest(); // ToolLpDataForCompetencyFrameworksManagePageRequest | 

            try
            {
                // Load the data for the learning plan templates manage page template
                ToolLpDataForTemplatesManagePage200Response result = apiInstance.ToolLpDataForTemplatesManagePage(toolLpDataForCompetencyFrameworksManagePageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForTemplatesManagePage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForTemplatesManagePageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the learning plan templates manage page template
    ApiResponse<ToolLpDataForTemplatesManagePage200Response> response = apiInstance.ToolLpDataForTemplatesManagePageWithHttpInfo(toolLpDataForCompetencyFrameworksManagePageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForTemplatesManagePageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForCompetencyFrameworksManagePageRequest** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforusercompetencysummary"></a>
# **ToolLpDataForUserCompetencySummary**
> ToolLpDataForUserCompetencySummary200Response ToolLpDataForUserCompetencySummary (ToolLpDataForUserCompetencySummaryRequest toolLpDataForUserCompetencySummaryRequest)

Load a summary of a user competency.

Load a summary of a user competency.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForUserCompetencySummaryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForUserCompetencySummaryRequest = new ToolLpDataForUserCompetencySummaryRequest(); // ToolLpDataForUserCompetencySummaryRequest | 

            try
            {
                // Load a summary of a user competency.
                ToolLpDataForUserCompetencySummary200Response result = apiInstance.ToolLpDataForUserCompetencySummary(toolLpDataForUserCompetencySummaryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserCompetencySummary: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForUserCompetencySummaryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load a summary of a user competency.
    ApiResponse<ToolLpDataForUserCompetencySummary200Response> response = apiInstance.ToolLpDataForUserCompetencySummaryWithHttpInfo(toolLpDataForUserCompetencySummaryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserCompetencySummaryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForUserCompetencySummaryRequest** | [**ToolLpDataForUserCompetencySummaryRequest**](ToolLpDataForUserCompetencySummaryRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforusercompetencysummaryincourse"></a>
# **ToolLpDataForUserCompetencySummaryInCourse**
> ToolLpDataForUserCompetencySummaryInCourse200Response ToolLpDataForUserCompetencySummaryInCourse (ToolLpDataForUserCompetencySummaryInCourseRequest toolLpDataForUserCompetencySummaryInCourseRequest)

Load a summary of a user competency.

Load a summary of a user competency.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForUserCompetencySummaryInCourseExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForUserCompetencySummaryInCourseRequest = new ToolLpDataForUserCompetencySummaryInCourseRequest(); // ToolLpDataForUserCompetencySummaryInCourseRequest | 

            try
            {
                // Load a summary of a user competency.
                ToolLpDataForUserCompetencySummaryInCourse200Response result = apiInstance.ToolLpDataForUserCompetencySummaryInCourse(toolLpDataForUserCompetencySummaryInCourseRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserCompetencySummaryInCourse: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForUserCompetencySummaryInCourseWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load a summary of a user competency.
    ApiResponse<ToolLpDataForUserCompetencySummaryInCourse200Response> response = apiInstance.ToolLpDataForUserCompetencySummaryInCourseWithHttpInfo(toolLpDataForUserCompetencySummaryInCourseRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserCompetencySummaryInCourseWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForUserCompetencySummaryInCourseRequest** | [**ToolLpDataForUserCompetencySummaryInCourseRequest**](ToolLpDataForUserCompetencySummaryInCourseRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforusercompetencysummaryinplan"></a>
# **ToolLpDataForUserCompetencySummaryInPlan**
> ToolLpDataForUserCompetencySummaryInPlan200Response ToolLpDataForUserCompetencySummaryInPlan (ToolLpDataForUserCompetencySummaryInPlanRequest toolLpDataForUserCompetencySummaryInPlanRequest)

Load a summary of a user competency.

Load a summary of a user competency.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForUserCompetencySummaryInPlanExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForUserCompetencySummaryInPlanRequest = new ToolLpDataForUserCompetencySummaryInPlanRequest(); // ToolLpDataForUserCompetencySummaryInPlanRequest | 

            try
            {
                // Load a summary of a user competency.
                ToolLpDataForUserCompetencySummaryInPlan200Response result = apiInstance.ToolLpDataForUserCompetencySummaryInPlan(toolLpDataForUserCompetencySummaryInPlanRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserCompetencySummaryInPlan: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForUserCompetencySummaryInPlanWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load a summary of a user competency.
    ApiResponse<ToolLpDataForUserCompetencySummaryInPlan200Response> response = apiInstance.ToolLpDataForUserCompetencySummaryInPlanWithHttpInfo(toolLpDataForUserCompetencySummaryInPlanRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserCompetencySummaryInPlanWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForUserCompetencySummaryInPlanRequest** | [**ToolLpDataForUserCompetencySummaryInPlanRequest**](ToolLpDataForUserCompetencySummaryInPlanRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforuserevidencelistpage"></a>
# **ToolLpDataForUserEvidenceListPage**
> ToolLpDataForUserEvidenceListPage200Response ToolLpDataForUserEvidenceListPage (ToolLpDataForUserEvidenceListPageRequest toolLpDataForUserEvidenceListPageRequest)

Load the data for the user evidence list page template

Load the data for the user evidence list page template

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForUserEvidenceListPageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForUserEvidenceListPageRequest = new ToolLpDataForUserEvidenceListPageRequest(); // ToolLpDataForUserEvidenceListPageRequest | 

            try
            {
                // Load the data for the user evidence list page template
                ToolLpDataForUserEvidenceListPage200Response result = apiInstance.ToolLpDataForUserEvidenceListPage(toolLpDataForUserEvidenceListPageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserEvidenceListPage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForUserEvidenceListPageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the user evidence list page template
    ApiResponse<ToolLpDataForUserEvidenceListPage200Response> response = apiInstance.ToolLpDataForUserEvidenceListPageWithHttpInfo(toolLpDataForUserEvidenceListPageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserEvidenceListPageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForUserEvidenceListPageRequest** | [**ToolLpDataForUserEvidenceListPageRequest**](ToolLpDataForUserEvidenceListPageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpdataforuserevidencepage"></a>
# **ToolLpDataForUserEvidencePage**
> ToolLpDataForUserEvidencePage200Response ToolLpDataForUserEvidencePage (ToolLpDataForUserEvidencePageRequest toolLpDataForUserEvidencePageRequest)

Load the data for the user evidence page template

Load the data for the user evidence page template

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpDataForUserEvidencePageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpDataForUserEvidencePageRequest = new ToolLpDataForUserEvidencePageRequest(); // ToolLpDataForUserEvidencePageRequest | 

            try
            {
                // Load the data for the user evidence page template
                ToolLpDataForUserEvidencePage200Response result = apiInstance.ToolLpDataForUserEvidencePage(toolLpDataForUserEvidencePageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserEvidencePage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpDataForUserEvidencePageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load the data for the user evidence page template
    ApiResponse<ToolLpDataForUserEvidencePage200Response> response = apiInstance.ToolLpDataForUserEvidencePageWithHttpInfo(toolLpDataForUserEvidencePageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpDataForUserEvidencePageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpDataForUserEvidencePageRequest** | [**ToolLpDataForUserEvidencePageRequest**](ToolLpDataForUserEvidencePageRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollplistcoursesusingcompetency"></a>
# **ToolLpListCoursesUsingCompetency**
> Object ToolLpListCoursesUsingCompetency (CoreCompetencyCompetencyViewedRequest coreCompetencyCompetencyViewedRequest)

List the courses using a competency

List the courses using a competency

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpListCoursesUsingCompetencyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var coreCompetencyCompetencyViewedRequest = new CoreCompetencyCompetencyViewedRequest(); // CoreCompetencyCompetencyViewedRequest | 

            try
            {
                // List the courses using a competency
                Object result = apiInstance.ToolLpListCoursesUsingCompetency(coreCompetencyCompetencyViewedRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpListCoursesUsingCompetency: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpListCoursesUsingCompetencyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List the courses using a competency
    ApiResponse<Object> response = apiInstance.ToolLpListCoursesUsingCompetencyWithHttpInfo(coreCompetencyCompetencyViewedRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpListCoursesUsingCompetencyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  |  |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpsearchcohorts"></a>
# **ToolLpSearchCohorts**
> ToolLpSearchCohorts200Response ToolLpSearchCohorts (ToolLpSearchCohortsRequest toolLpSearchCohortsRequest)

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpSearchCohortsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpSearchCohortsRequest = new ToolLpSearchCohortsRequest(); // ToolLpSearchCohortsRequest | 

            try
            {
                // Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead
                ToolLpSearchCohorts200Response result = apiInstance.ToolLpSearchCohorts(toolLpSearchCohortsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpSearchCohorts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpSearchCohortsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead
    ApiResponse<ToolLpSearchCohorts200Response> response = apiInstance.ToolLpSearchCohortsWithHttpInfo(toolLpSearchCohortsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpSearchCohortsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpSearchCohortsRequest** | [**ToolLpSearchCohortsRequest**](ToolLpSearchCohortsRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="toollpsearchusers"></a>
# **ToolLpSearchUsers**
> ToolLpSearchUsers200Response ToolLpSearchUsers (ToolLpSearchUsersRequest toolLpSearchUsersRequest)

Search for users.

Search for users.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class ToolLpSearchUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolLpApi(config);
            var toolLpSearchUsersRequest = new ToolLpSearchUsersRequest(); // ToolLpSearchUsersRequest | 

            try
            {
                // Search for users.
                ToolLpSearchUsers200Response result = apiInstance.ToolLpSearchUsers(toolLpSearchUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolLpApi.ToolLpSearchUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolLpSearchUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search for users.
    ApiResponse<ToolLpSearchUsers200Response> response = apiInstance.ToolLpSearchUsersWithHttpInfo(toolLpSearchUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolLpApi.ToolLpSearchUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolLpSearchUsersRequest** | [**ToolLpSearchUsersRequest**](ToolLpSearchUsersRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


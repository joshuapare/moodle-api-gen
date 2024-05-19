# ToolLpApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolLpDataForCompetenciesManagePage**](ToolLpApi.md#toolLpDataForCompetenciesManagePage) | **POST** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template |
| [**toolLpDataForCompetencyFrameworksManagePage**](ToolLpApi.md#toolLpDataForCompetencyFrameworksManagePage) | **POST** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template |
| [**toolLpDataForCompetencySummary**](ToolLpApi.md#toolLpDataForCompetencySummary) | **POST** /tool_lp_data_for_competency_summary | Load competency data for summary template. |
| [**toolLpDataForCourseCompetenciesPage**](ToolLpApi.md#toolLpDataForCourseCompetenciesPage) | **POST** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template. |
| [**toolLpDataForPlanPage**](ToolLpApi.md#toolLpDataForPlanPage) | **POST** /tool_lp_data_for_plan_page | Load the data for the plan page template. |
| [**toolLpDataForPlansPage**](ToolLpApi.md#toolLpDataForPlansPage) | **POST** /tool_lp_data_for_plans_page | Load the data for the plans page template |
| [**toolLpDataForRelatedCompetenciesSection**](ToolLpApi.md#toolLpDataForRelatedCompetenciesSection) | **POST** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template. |
| [**toolLpDataForTemplateCompetenciesPage**](ToolLpApi.md#toolLpDataForTemplateCompetenciesPage) | **POST** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template. |
| [**toolLpDataForTemplatesManagePage**](ToolLpApi.md#toolLpDataForTemplatesManagePage) | **POST** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template |
| [**toolLpDataForUserCompetencySummary**](ToolLpApi.md#toolLpDataForUserCompetencySummary) | **POST** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency. |
| [**toolLpDataForUserCompetencySummaryInCourse**](ToolLpApi.md#toolLpDataForUserCompetencySummaryInCourse) | **POST** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency. |
| [**toolLpDataForUserCompetencySummaryInPlan**](ToolLpApi.md#toolLpDataForUserCompetencySummaryInPlan) | **POST** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency. |
| [**toolLpDataForUserEvidenceListPage**](ToolLpApi.md#toolLpDataForUserEvidenceListPage) | **POST** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template |
| [**toolLpDataForUserEvidencePage**](ToolLpApi.md#toolLpDataForUserEvidencePage) | **POST** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template |
| [**toolLpListCoursesUsingCompetency**](ToolLpApi.md#toolLpListCoursesUsingCompetency) | **POST** /tool_lp_list_courses_using_competency | List the courses using a competency |
| [**toolLpSearchCohorts**](ToolLpApi.md#toolLpSearchCohorts) | **POST** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead |
| [**toolLpSearchUsers**](ToolLpApi.md#toolLpSearchUsers) | **POST** /tool_lp_search_users | Search for users. |


<a id="toolLpDataForCompetenciesManagePage"></a>
# **toolLpDataForCompetenciesManagePage**
> ToolLpDataForCompetenciesManagePage200Response toolLpDataForCompetenciesManagePage(toolLpDataForCompetenciesManagePageRequest)

Load the data for the competencies manage page template

Load the data for the competencies manage page template

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForCompetenciesManagePageRequest toolLpDataForCompetenciesManagePageRequest = new ToolLpDataForCompetenciesManagePageRequest(); // ToolLpDataForCompetenciesManagePageRequest | 
    try {
      ToolLpDataForCompetenciesManagePage200Response result = apiInstance.toolLpDataForCompetenciesManagePage(toolLpDataForCompetenciesManagePageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForCompetenciesManagePage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForCompetenciesManagePageRequest** | [**ToolLpDataForCompetenciesManagePageRequest**](ToolLpDataForCompetenciesManagePageRequest.md)|  | |

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

<a id="toolLpDataForCompetencyFrameworksManagePage"></a>
# **toolLpDataForCompetencyFrameworksManagePage**
> ToolLpDataForCompetencyFrameworksManagePage200Response toolLpDataForCompetencyFrameworksManagePage(toolLpDataForCompetencyFrameworksManagePageRequest)

Load the data for the competency frameworks manage page template

Load the data for the competency frameworks manage page template

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForCompetencyFrameworksManagePageRequest toolLpDataForCompetencyFrameworksManagePageRequest = new ToolLpDataForCompetencyFrameworksManagePageRequest(); // ToolLpDataForCompetencyFrameworksManagePageRequest | 
    try {
      ToolLpDataForCompetencyFrameworksManagePage200Response result = apiInstance.toolLpDataForCompetencyFrameworksManagePage(toolLpDataForCompetencyFrameworksManagePageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForCompetencyFrameworksManagePage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForCompetencyFrameworksManagePageRequest** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md)|  | |

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

<a id="toolLpDataForCompetencySummary"></a>
# **toolLpDataForCompetencySummary**
> ToolLpDataForCompetencySummary200Response toolLpDataForCompetencySummary(toolLpDataForCompetencySummaryRequest)

Load competency data for summary template.

Load competency data for summary template.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForCompetencySummaryRequest toolLpDataForCompetencySummaryRequest = new ToolLpDataForCompetencySummaryRequest(); // ToolLpDataForCompetencySummaryRequest | 
    try {
      ToolLpDataForCompetencySummary200Response result = apiInstance.toolLpDataForCompetencySummary(toolLpDataForCompetencySummaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForCompetencySummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForCompetencySummaryRequest** | [**ToolLpDataForCompetencySummaryRequest**](ToolLpDataForCompetencySummaryRequest.md)|  | |

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

<a id="toolLpDataForCourseCompetenciesPage"></a>
# **toolLpDataForCourseCompetenciesPage**
> ToolLpDataForCourseCompetenciesPage200Response toolLpDataForCourseCompetenciesPage(toolLpDataForCourseCompetenciesPageRequest)

Load the data for the course competencies page template.

Load the data for the course competencies page template.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForCourseCompetenciesPageRequest toolLpDataForCourseCompetenciesPageRequest = new ToolLpDataForCourseCompetenciesPageRequest(); // ToolLpDataForCourseCompetenciesPageRequest | 
    try {
      ToolLpDataForCourseCompetenciesPage200Response result = apiInstance.toolLpDataForCourseCompetenciesPage(toolLpDataForCourseCompetenciesPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForCourseCompetenciesPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForCourseCompetenciesPageRequest** | [**ToolLpDataForCourseCompetenciesPageRequest**](ToolLpDataForCourseCompetenciesPageRequest.md)|  | |

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

<a id="toolLpDataForPlanPage"></a>
# **toolLpDataForPlanPage**
> ToolLpDataForPlanPage200Response toolLpDataForPlanPage(coreCompetencyCompletePlanRequest)

Load the data for the plan page template.

Load the data for the plan page template.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    CoreCompetencyCompletePlanRequest coreCompetencyCompletePlanRequest = new CoreCompetencyCompletePlanRequest(); // CoreCompetencyCompletePlanRequest | 
    try {
      ToolLpDataForPlanPage200Response result = apiInstance.toolLpDataForPlanPage(coreCompetencyCompletePlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForPlanPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coreCompetencyCompletePlanRequest** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md)|  | |

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

<a id="toolLpDataForPlansPage"></a>
# **toolLpDataForPlansPage**
> ToolLpDataForPlansPage200Response toolLpDataForPlansPage(toolLpDataForPlansPageRequest)

Load the data for the plans page template

Load the data for the plans page template

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForPlansPageRequest toolLpDataForPlansPageRequest = new ToolLpDataForPlansPageRequest(); // ToolLpDataForPlansPageRequest | 
    try {
      ToolLpDataForPlansPage200Response result = apiInstance.toolLpDataForPlansPage(toolLpDataForPlansPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForPlansPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForPlansPageRequest** | [**ToolLpDataForPlansPageRequest**](ToolLpDataForPlansPageRequest.md)|  | |

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

<a id="toolLpDataForRelatedCompetenciesSection"></a>
# **toolLpDataForRelatedCompetenciesSection**
> ToolLpDataForRelatedCompetenciesSection200Response toolLpDataForRelatedCompetenciesSection(toolLpDataForRelatedCompetenciesSectionRequest)

Load the data for the related competencies template.

Load the data for the related competencies template.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForRelatedCompetenciesSectionRequest toolLpDataForRelatedCompetenciesSectionRequest = new ToolLpDataForRelatedCompetenciesSectionRequest(); // ToolLpDataForRelatedCompetenciesSectionRequest | 
    try {
      ToolLpDataForRelatedCompetenciesSection200Response result = apiInstance.toolLpDataForRelatedCompetenciesSection(toolLpDataForRelatedCompetenciesSectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForRelatedCompetenciesSection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForRelatedCompetenciesSectionRequest** | [**ToolLpDataForRelatedCompetenciesSectionRequest**](ToolLpDataForRelatedCompetenciesSectionRequest.md)|  | |

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

<a id="toolLpDataForTemplateCompetenciesPage"></a>
# **toolLpDataForTemplateCompetenciesPage**
> ToolLpDataForTemplateCompetenciesPage200Response toolLpDataForTemplateCompetenciesPage(toolLpDataForTemplateCompetenciesPageRequest)

Load the data for the template competencies page template.

Load the data for the template competencies page template.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForTemplateCompetenciesPageRequest toolLpDataForTemplateCompetenciesPageRequest = new ToolLpDataForTemplateCompetenciesPageRequest(); // ToolLpDataForTemplateCompetenciesPageRequest | 
    try {
      ToolLpDataForTemplateCompetenciesPage200Response result = apiInstance.toolLpDataForTemplateCompetenciesPage(toolLpDataForTemplateCompetenciesPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForTemplateCompetenciesPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForTemplateCompetenciesPageRequest** | [**ToolLpDataForTemplateCompetenciesPageRequest**](ToolLpDataForTemplateCompetenciesPageRequest.md)|  | |

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

<a id="toolLpDataForTemplatesManagePage"></a>
# **toolLpDataForTemplatesManagePage**
> ToolLpDataForTemplatesManagePage200Response toolLpDataForTemplatesManagePage(toolLpDataForCompetencyFrameworksManagePageRequest)

Load the data for the learning plan templates manage page template

Load the data for the learning plan templates manage page template

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForCompetencyFrameworksManagePageRequest toolLpDataForCompetencyFrameworksManagePageRequest = new ToolLpDataForCompetencyFrameworksManagePageRequest(); // ToolLpDataForCompetencyFrameworksManagePageRequest | 
    try {
      ToolLpDataForTemplatesManagePage200Response result = apiInstance.toolLpDataForTemplatesManagePage(toolLpDataForCompetencyFrameworksManagePageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForTemplatesManagePage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForCompetencyFrameworksManagePageRequest** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md)|  | |

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

<a id="toolLpDataForUserCompetencySummary"></a>
# **toolLpDataForUserCompetencySummary**
> ToolLpDataForUserCompetencySummary200Response toolLpDataForUserCompetencySummary(toolLpDataForUserCompetencySummaryRequest)

Load a summary of a user competency.

Load a summary of a user competency.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForUserCompetencySummaryRequest toolLpDataForUserCompetencySummaryRequest = new ToolLpDataForUserCompetencySummaryRequest(); // ToolLpDataForUserCompetencySummaryRequest | 
    try {
      ToolLpDataForUserCompetencySummary200Response result = apiInstance.toolLpDataForUserCompetencySummary(toolLpDataForUserCompetencySummaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForUserCompetencySummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForUserCompetencySummaryRequest** | [**ToolLpDataForUserCompetencySummaryRequest**](ToolLpDataForUserCompetencySummaryRequest.md)|  | |

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

<a id="toolLpDataForUserCompetencySummaryInCourse"></a>
# **toolLpDataForUserCompetencySummaryInCourse**
> ToolLpDataForUserCompetencySummaryInCourse200Response toolLpDataForUserCompetencySummaryInCourse(toolLpDataForUserCompetencySummaryInCourseRequest)

Load a summary of a user competency.

Load a summary of a user competency.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForUserCompetencySummaryInCourseRequest toolLpDataForUserCompetencySummaryInCourseRequest = new ToolLpDataForUserCompetencySummaryInCourseRequest(); // ToolLpDataForUserCompetencySummaryInCourseRequest | 
    try {
      ToolLpDataForUserCompetencySummaryInCourse200Response result = apiInstance.toolLpDataForUserCompetencySummaryInCourse(toolLpDataForUserCompetencySummaryInCourseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForUserCompetencySummaryInCourse");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForUserCompetencySummaryInCourseRequest** | [**ToolLpDataForUserCompetencySummaryInCourseRequest**](ToolLpDataForUserCompetencySummaryInCourseRequest.md)|  | |

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

<a id="toolLpDataForUserCompetencySummaryInPlan"></a>
# **toolLpDataForUserCompetencySummaryInPlan**
> ToolLpDataForUserCompetencySummaryInPlan200Response toolLpDataForUserCompetencySummaryInPlan(toolLpDataForUserCompetencySummaryInPlanRequest)

Load a summary of a user competency.

Load a summary of a user competency.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForUserCompetencySummaryInPlanRequest toolLpDataForUserCompetencySummaryInPlanRequest = new ToolLpDataForUserCompetencySummaryInPlanRequest(); // ToolLpDataForUserCompetencySummaryInPlanRequest | 
    try {
      ToolLpDataForUserCompetencySummaryInPlan200Response result = apiInstance.toolLpDataForUserCompetencySummaryInPlan(toolLpDataForUserCompetencySummaryInPlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForUserCompetencySummaryInPlan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForUserCompetencySummaryInPlanRequest** | [**ToolLpDataForUserCompetencySummaryInPlanRequest**](ToolLpDataForUserCompetencySummaryInPlanRequest.md)|  | |

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

<a id="toolLpDataForUserEvidenceListPage"></a>
# **toolLpDataForUserEvidenceListPage**
> ToolLpDataForUserEvidenceListPage200Response toolLpDataForUserEvidenceListPage(toolLpDataForUserEvidenceListPageRequest)

Load the data for the user evidence list page template

Load the data for the user evidence list page template

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForUserEvidenceListPageRequest toolLpDataForUserEvidenceListPageRequest = new ToolLpDataForUserEvidenceListPageRequest(); // ToolLpDataForUserEvidenceListPageRequest | 
    try {
      ToolLpDataForUserEvidenceListPage200Response result = apiInstance.toolLpDataForUserEvidenceListPage(toolLpDataForUserEvidenceListPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForUserEvidenceListPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForUserEvidenceListPageRequest** | [**ToolLpDataForUserEvidenceListPageRequest**](ToolLpDataForUserEvidenceListPageRequest.md)|  | |

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

<a id="toolLpDataForUserEvidencePage"></a>
# **toolLpDataForUserEvidencePage**
> ToolLpDataForUserEvidencePage200Response toolLpDataForUserEvidencePage(toolLpDataForUserEvidencePageRequest)

Load the data for the user evidence page template

Load the data for the user evidence page template

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpDataForUserEvidencePageRequest toolLpDataForUserEvidencePageRequest = new ToolLpDataForUserEvidencePageRequest(); // ToolLpDataForUserEvidencePageRequest | 
    try {
      ToolLpDataForUserEvidencePage200Response result = apiInstance.toolLpDataForUserEvidencePage(toolLpDataForUserEvidencePageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpDataForUserEvidencePage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpDataForUserEvidencePageRequest** | [**ToolLpDataForUserEvidencePageRequest**](ToolLpDataForUserEvidencePageRequest.md)|  | |

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

<a id="toolLpListCoursesUsingCompetency"></a>
# **toolLpListCoursesUsingCompetency**
> Object toolLpListCoursesUsingCompetency(coreCompetencyCompetencyViewedRequest)

List the courses using a competency

List the courses using a competency

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    CoreCompetencyCompetencyViewedRequest coreCompetencyCompetencyViewedRequest = new CoreCompetencyCompetencyViewedRequest(); // CoreCompetencyCompetencyViewedRequest | 
    try {
      Object result = apiInstance.toolLpListCoursesUsingCompetency(coreCompetencyCompetencyViewedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpListCoursesUsingCompetency");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md)|  | |

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

<a id="toolLpSearchCohorts"></a>
# **toolLpSearchCohorts**
> ToolLpSearchCohorts200Response toolLpSearchCohorts(toolLpSearchCohortsRequest)

Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead

Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpSearchCohortsRequest toolLpSearchCohortsRequest = new ToolLpSearchCohortsRequest(); // ToolLpSearchCohortsRequest | 
    try {
      ToolLpSearchCohorts200Response result = apiInstance.toolLpSearchCohorts(toolLpSearchCohortsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpSearchCohorts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpSearchCohortsRequest** | [**ToolLpSearchCohortsRequest**](ToolLpSearchCohortsRequest.md)|  | |

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

<a id="toolLpSearchUsers"></a>
# **toolLpSearchUsers**
> ToolLpSearchUsers200Response toolLpSearchUsers(toolLpSearchUsersRequest)

Search for users.

Search for users.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolLpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolLpApi apiInstance = new ToolLpApi(defaultClient);
    ToolLpSearchUsersRequest toolLpSearchUsersRequest = new ToolLpSearchUsersRequest(); // ToolLpSearchUsersRequest | 
    try {
      ToolLpSearchUsers200Response result = apiInstance.toolLpSearchUsers(toolLpSearchUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolLpApi#toolLpSearchUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toolLpSearchUsersRequest** | [**ToolLpSearchUsersRequest**](ToolLpSearchUsersRequest.md)|  | |

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


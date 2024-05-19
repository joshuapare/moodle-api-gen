# ToolDataprivacyApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toolDataprivacyApproveDataRequest**](ToolDataprivacyApi.md#toolDataprivacyApproveDataRequest) | **POST** /tool_dataprivacy_approve_data_request | Approve a data request |
| [**toolDataprivacyBulkApproveDataRequests**](ToolDataprivacyApi.md#toolDataprivacyBulkApproveDataRequests) | **POST** /tool_dataprivacy_bulk_approve_data_requests | Bulk approve data requests |
| [**toolDataprivacyBulkDenyDataRequests**](ToolDataprivacyApi.md#toolDataprivacyBulkDenyDataRequests) | **POST** /tool_dataprivacy_bulk_deny_data_requests | Bulk deny data requests |
| [**toolDataprivacyCancelDataRequest**](ToolDataprivacyApi.md#toolDataprivacyCancelDataRequest) | **POST** /tool_dataprivacy_cancel_data_request | Cancel the data request made by the user |
| [**toolDataprivacyConfirmContextsForDeletion**](ToolDataprivacyApi.md#toolDataprivacyConfirmContextsForDeletion) | **POST** /tool_dataprivacy_confirm_contexts_for_deletion | Mark the selected expired contexts as confirmed for deletion |
| [**toolDataprivacyContactDpo**](ToolDataprivacyApi.md#toolDataprivacyContactDpo) | **POST** /tool_dataprivacy_contact_dpo | Contact the site Data Protection Officer(s) |
| [**toolDataprivacyCreateCategoryForm**](ToolDataprivacyApi.md#toolDataprivacyCreateCategoryForm) | **POST** /tool_dataprivacy_create_category_form | Adds a data category |
| [**toolDataprivacyCreatePurposeForm**](ToolDataprivacyApi.md#toolDataprivacyCreatePurposeForm) | **POST** /tool_dataprivacy_create_purpose_form | Adds a data purpose |
| [**toolDataprivacyDeleteCategory**](ToolDataprivacyApi.md#toolDataprivacyDeleteCategory) | **POST** /tool_dataprivacy_delete_category | Deletes an existing data category |
| [**toolDataprivacyDeletePurpose**](ToolDataprivacyApi.md#toolDataprivacyDeletePurpose) | **POST** /tool_dataprivacy_delete_purpose | Deletes an existing data purpose |
| [**toolDataprivacyDenyDataRequest**](ToolDataprivacyApi.md#toolDataprivacyDenyDataRequest) | **POST** /tool_dataprivacy_deny_data_request | Deny a data request |
| [**toolDataprivacyGetActivityOptions**](ToolDataprivacyApi.md#toolDataprivacyGetActivityOptions) | **POST** /tool_dataprivacy_get_activity_options | Fetches a list of activity options |
| [**toolDataprivacyGetCategoryOptions**](ToolDataprivacyApi.md#toolDataprivacyGetCategoryOptions) | **POST** /tool_dataprivacy_get_category_options | Fetches a list of data category options |
| [**toolDataprivacyGetDataRequest**](ToolDataprivacyApi.md#toolDataprivacyGetDataRequest) | **POST** /tool_dataprivacy_get_data_request | Fetch the details of a user&#39;s data request |
| [**toolDataprivacyGetPurposeOptions**](ToolDataprivacyApi.md#toolDataprivacyGetPurposeOptions) | **POST** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options |
| [**toolDataprivacyGetUsers**](ToolDataprivacyApi.md#toolDataprivacyGetUsers) | **POST** /tool_dataprivacy_get_users | Fetches a list of users |
| [**toolDataprivacyMarkComplete**](ToolDataprivacyApi.md#toolDataprivacyMarkComplete) | **POST** /tool_dataprivacy_mark_complete | Mark a user&#39;s general enquiry as complete |
| [**toolDataprivacySetContextDefaults**](ToolDataprivacyApi.md#toolDataprivacySetContextDefaults) | **POST** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin) |
| [**toolDataprivacySetContextForm**](ToolDataprivacyApi.md#toolDataprivacySetContextForm) | **POST** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context |
| [**toolDataprivacySetContextlevelForm**](ToolDataprivacyApi.md#toolDataprivacySetContextlevelForm) | **POST** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level |
| [**toolDataprivacySubmitSelectedCoursesForm**](ToolDataprivacyApi.md#toolDataprivacySubmitSelectedCoursesForm) | **POST** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export |
| [**toolDataprivacyTreeExtraBranches**](ToolDataprivacyApi.md#toolDataprivacyTreeExtraBranches) | **POST** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree |


<a id="toolDataprivacyApproveDataRequest"></a>
# **toolDataprivacyApproveDataRequest**
> CoreContentbankRenameContent200Response toolDataprivacyApproveDataRequest(toolDataprivacyApproveDataRequestRequest)

Approve a data request

Approve a data request

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyApproveDataRequestRequest toolDataprivacyApproveDataRequestRequest = new ToolDataprivacyApproveDataRequestRequest(); // ToolDataprivacyApproveDataRequestRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyApproveDataRequest(toolDataprivacyApproveDataRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyApproveDataRequest");
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
| **toolDataprivacyApproveDataRequestRequest** | [**ToolDataprivacyApproveDataRequestRequest**](ToolDataprivacyApproveDataRequestRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyBulkApproveDataRequests"></a>
# **toolDataprivacyBulkApproveDataRequests**
> CoreContentbankRenameContent200Response toolDataprivacyBulkApproveDataRequests(toolDataprivacyBulkApproveDataRequestsRequest)

Bulk approve data requests

Bulk approve data requests

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyBulkApproveDataRequestsRequest toolDataprivacyBulkApproveDataRequestsRequest = new ToolDataprivacyBulkApproveDataRequestsRequest(); // ToolDataprivacyBulkApproveDataRequestsRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyBulkApproveDataRequests(toolDataprivacyBulkApproveDataRequestsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyBulkApproveDataRequests");
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
| **toolDataprivacyBulkApproveDataRequestsRequest** | [**ToolDataprivacyBulkApproveDataRequestsRequest**](ToolDataprivacyBulkApproveDataRequestsRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyBulkDenyDataRequests"></a>
# **toolDataprivacyBulkDenyDataRequests**
> CoreContentbankRenameContent200Response toolDataprivacyBulkDenyDataRequests(toolDataprivacyBulkDenyDataRequestsRequest)

Bulk deny data requests

Bulk deny data requests

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyBulkDenyDataRequestsRequest toolDataprivacyBulkDenyDataRequestsRequest = new ToolDataprivacyBulkDenyDataRequestsRequest(); // ToolDataprivacyBulkDenyDataRequestsRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyBulkDenyDataRequests(toolDataprivacyBulkDenyDataRequestsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyBulkDenyDataRequests");
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
| **toolDataprivacyBulkDenyDataRequestsRequest** | [**ToolDataprivacyBulkDenyDataRequestsRequest**](ToolDataprivacyBulkDenyDataRequestsRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyCancelDataRequest"></a>
# **toolDataprivacyCancelDataRequest**
> CoreContentbankRenameContent200Response toolDataprivacyCancelDataRequest(toolDataprivacyCancelDataRequestRequest)

Cancel the data request made by the user

Cancel the data request made by the user

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyCancelDataRequest(toolDataprivacyCancelDataRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyCancelDataRequest");
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
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyConfirmContextsForDeletion"></a>
# **toolDataprivacyConfirmContextsForDeletion**
> ToolDataprivacyConfirmContextsForDeletion200Response toolDataprivacyConfirmContextsForDeletion(toolDataprivacyConfirmContextsForDeletionRequest)

Mark the selected expired contexts as confirmed for deletion

Mark the selected expired contexts as confirmed for deletion

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyConfirmContextsForDeletionRequest toolDataprivacyConfirmContextsForDeletionRequest = new ToolDataprivacyConfirmContextsForDeletionRequest(); // ToolDataprivacyConfirmContextsForDeletionRequest | 
    try {
      ToolDataprivacyConfirmContextsForDeletion200Response result = apiInstance.toolDataprivacyConfirmContextsForDeletion(toolDataprivacyConfirmContextsForDeletionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyConfirmContextsForDeletion");
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
| **toolDataprivacyConfirmContextsForDeletionRequest** | [**ToolDataprivacyConfirmContextsForDeletionRequest**](ToolDataprivacyConfirmContextsForDeletionRequest.md)|  | |

### Return type

[**ToolDataprivacyConfirmContextsForDeletion200Response**](ToolDataprivacyConfirmContextsForDeletion200Response.md)

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

<a id="toolDataprivacyContactDpo"></a>
# **toolDataprivacyContactDpo**
> CoreContentbankRenameContent200Response toolDataprivacyContactDpo(toolDataprivacyContactDpoRequest)

Contact the site Data Protection Officer(s)

Contact the site Data Protection Officer(s)

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyContactDpoRequest toolDataprivacyContactDpoRequest = new ToolDataprivacyContactDpoRequest(); // ToolDataprivacyContactDpoRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyContactDpo(toolDataprivacyContactDpoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyContactDpo");
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
| **toolDataprivacyContactDpoRequest** | [**ToolDataprivacyContactDpoRequest**](ToolDataprivacyContactDpoRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyCreateCategoryForm"></a>
# **toolDataprivacyCreateCategoryForm**
> ToolDataprivacyCreateCategoryForm200Response toolDataprivacyCreateCategoryForm(toolDataprivacyCreateCategoryFormRequest)

Adds a data category

Adds a data category

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyCreateCategoryFormRequest toolDataprivacyCreateCategoryFormRequest = new ToolDataprivacyCreateCategoryFormRequest(); // ToolDataprivacyCreateCategoryFormRequest | 
    try {
      ToolDataprivacyCreateCategoryForm200Response result = apiInstance.toolDataprivacyCreateCategoryForm(toolDataprivacyCreateCategoryFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyCreateCategoryForm");
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
| **toolDataprivacyCreateCategoryFormRequest** | [**ToolDataprivacyCreateCategoryFormRequest**](ToolDataprivacyCreateCategoryFormRequest.md)|  | |

### Return type

[**ToolDataprivacyCreateCategoryForm200Response**](ToolDataprivacyCreateCategoryForm200Response.md)

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

<a id="toolDataprivacyCreatePurposeForm"></a>
# **toolDataprivacyCreatePurposeForm**
> ToolDataprivacyCreatePurposeForm200Response toolDataprivacyCreatePurposeForm(toolDataprivacyCreatePurposeFormRequest)

Adds a data purpose

Adds a data purpose

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyCreatePurposeFormRequest toolDataprivacyCreatePurposeFormRequest = new ToolDataprivacyCreatePurposeFormRequest(); // ToolDataprivacyCreatePurposeFormRequest | 
    try {
      ToolDataprivacyCreatePurposeForm200Response result = apiInstance.toolDataprivacyCreatePurposeForm(toolDataprivacyCreatePurposeFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyCreatePurposeForm");
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
| **toolDataprivacyCreatePurposeFormRequest** | [**ToolDataprivacyCreatePurposeFormRequest**](ToolDataprivacyCreatePurposeFormRequest.md)|  | |

### Return type

[**ToolDataprivacyCreatePurposeForm200Response**](ToolDataprivacyCreatePurposeForm200Response.md)

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

<a id="toolDataprivacyDeleteCategory"></a>
# **toolDataprivacyDeleteCategory**
> CoreContentbankRenameContent200Response toolDataprivacyDeleteCategory(toolDataprivacyDeleteCategoryRequest)

Deletes an existing data category

Deletes an existing data category

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyDeleteCategoryRequest toolDataprivacyDeleteCategoryRequest = new ToolDataprivacyDeleteCategoryRequest(); // ToolDataprivacyDeleteCategoryRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyDeleteCategory(toolDataprivacyDeleteCategoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyDeleteCategory");
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
| **toolDataprivacyDeleteCategoryRequest** | [**ToolDataprivacyDeleteCategoryRequest**](ToolDataprivacyDeleteCategoryRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyDeletePurpose"></a>
# **toolDataprivacyDeletePurpose**
> CoreContentbankRenameContent200Response toolDataprivacyDeletePurpose(toolDataprivacyDeletePurposeRequest)

Deletes an existing data purpose

Deletes an existing data purpose

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyDeletePurposeRequest toolDataprivacyDeletePurposeRequest = new ToolDataprivacyDeletePurposeRequest(); // ToolDataprivacyDeletePurposeRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyDeletePurpose(toolDataprivacyDeletePurposeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyDeletePurpose");
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
| **toolDataprivacyDeletePurposeRequest** | [**ToolDataprivacyDeletePurposeRequest**](ToolDataprivacyDeletePurposeRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyDenyDataRequest"></a>
# **toolDataprivacyDenyDataRequest**
> CoreContentbankRenameContent200Response toolDataprivacyDenyDataRequest(toolDataprivacyCancelDataRequestRequest)

Deny a data request

Deny a data request

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyDenyDataRequest(toolDataprivacyCancelDataRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyDenyDataRequest");
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
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyGetActivityOptions"></a>
# **toolDataprivacyGetActivityOptions**
> ToolDataprivacyGetActivityOptions200Response toolDataprivacyGetActivityOptions(toolDataprivacyGetActivityOptionsRequest)

Fetches a list of activity options

Fetches a list of activity options

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyGetActivityOptionsRequest toolDataprivacyGetActivityOptionsRequest = new ToolDataprivacyGetActivityOptionsRequest(); // ToolDataprivacyGetActivityOptionsRequest | 
    try {
      ToolDataprivacyGetActivityOptions200Response result = apiInstance.toolDataprivacyGetActivityOptions(toolDataprivacyGetActivityOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyGetActivityOptions");
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
| **toolDataprivacyGetActivityOptionsRequest** | [**ToolDataprivacyGetActivityOptionsRequest**](ToolDataprivacyGetActivityOptionsRequest.md)|  | |

### Return type

[**ToolDataprivacyGetActivityOptions200Response**](ToolDataprivacyGetActivityOptions200Response.md)

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

<a id="toolDataprivacyGetCategoryOptions"></a>
# **toolDataprivacyGetCategoryOptions**
> ToolDataprivacyGetCategoryOptions200Response toolDataprivacyGetCategoryOptions(toolDataprivacyGetCategoryOptionsRequest)

Fetches a list of data category options

Fetches a list of data category options

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyGetCategoryOptionsRequest toolDataprivacyGetCategoryOptionsRequest = new ToolDataprivacyGetCategoryOptionsRequest(); // ToolDataprivacyGetCategoryOptionsRequest | 
    try {
      ToolDataprivacyGetCategoryOptions200Response result = apiInstance.toolDataprivacyGetCategoryOptions(toolDataprivacyGetCategoryOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyGetCategoryOptions");
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
| **toolDataprivacyGetCategoryOptionsRequest** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md)|  | |

### Return type

[**ToolDataprivacyGetCategoryOptions200Response**](ToolDataprivacyGetCategoryOptions200Response.md)

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

<a id="toolDataprivacyGetDataRequest"></a>
# **toolDataprivacyGetDataRequest**
> ToolDataprivacyGetDataRequest200Response toolDataprivacyGetDataRequest(toolDataprivacyCancelDataRequestRequest)

Fetch the details of a user&#39;s data request

Fetch the details of a user&#39;s data request

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 
    try {
      ToolDataprivacyGetDataRequest200Response result = apiInstance.toolDataprivacyGetDataRequest(toolDataprivacyCancelDataRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyGetDataRequest");
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
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | |

### Return type

[**ToolDataprivacyGetDataRequest200Response**](ToolDataprivacyGetDataRequest200Response.md)

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

<a id="toolDataprivacyGetPurposeOptions"></a>
# **toolDataprivacyGetPurposeOptions**
> ToolDataprivacyGetPurposeOptions200Response toolDataprivacyGetPurposeOptions(toolDataprivacyGetCategoryOptionsRequest)

Fetches a list of data storage purpose options

Fetches a list of data storage purpose options

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyGetCategoryOptionsRequest toolDataprivacyGetCategoryOptionsRequest = new ToolDataprivacyGetCategoryOptionsRequest(); // ToolDataprivacyGetCategoryOptionsRequest | 
    try {
      ToolDataprivacyGetPurposeOptions200Response result = apiInstance.toolDataprivacyGetPurposeOptions(toolDataprivacyGetCategoryOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyGetPurposeOptions");
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
| **toolDataprivacyGetCategoryOptionsRequest** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md)|  | |

### Return type

[**ToolDataprivacyGetPurposeOptions200Response**](ToolDataprivacyGetPurposeOptions200Response.md)

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

<a id="toolDataprivacyGetUsers"></a>
# **toolDataprivacyGetUsers**
> Object toolDataprivacyGetUsers(toolDataprivacyGetUsersRequest)

Fetches a list of users

Fetches a list of users

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyGetUsersRequest toolDataprivacyGetUsersRequest = new ToolDataprivacyGetUsersRequest(); // ToolDataprivacyGetUsersRequest | 
    try {
      Object result = apiInstance.toolDataprivacyGetUsers(toolDataprivacyGetUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyGetUsers");
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
| **toolDataprivacyGetUsersRequest** | [**ToolDataprivacyGetUsersRequest**](ToolDataprivacyGetUsersRequest.md)|  | |

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

<a id="toolDataprivacyMarkComplete"></a>
# **toolDataprivacyMarkComplete**
> CoreContentbankRenameContent200Response toolDataprivacyMarkComplete(toolDataprivacyCancelDataRequestRequest)

Mark a user&#39;s general enquiry as complete

Mark a user&#39;s general enquiry as complete

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacyMarkComplete(toolDataprivacyCancelDataRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyMarkComplete");
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
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacySetContextDefaults"></a>
# **toolDataprivacySetContextDefaults**
> ToolDataprivacySetContextDefaults200Response toolDataprivacySetContextDefaults(toolDataprivacySetContextDefaultsRequest)

Updates the default category and purpose for a given context level (and optionally, a plugin)

Updates the default category and purpose for a given context level (and optionally, a plugin)

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacySetContextDefaultsRequest toolDataprivacySetContextDefaultsRequest = new ToolDataprivacySetContextDefaultsRequest(); // ToolDataprivacySetContextDefaultsRequest | 
    try {
      ToolDataprivacySetContextDefaults200Response result = apiInstance.toolDataprivacySetContextDefaults(toolDataprivacySetContextDefaultsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacySetContextDefaults");
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
| **toolDataprivacySetContextDefaultsRequest** | [**ToolDataprivacySetContextDefaultsRequest**](ToolDataprivacySetContextDefaultsRequest.md)|  | |

### Return type

[**ToolDataprivacySetContextDefaults200Response**](ToolDataprivacySetContextDefaults200Response.md)

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

<a id="toolDataprivacySetContextForm"></a>
# **toolDataprivacySetContextForm**
> ToolDataprivacySetContextForm200Response toolDataprivacySetContextForm(toolDataprivacySetContextFormRequest)

Sets purpose and category for a specific context

Sets purpose and category for a specific context

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacySetContextFormRequest toolDataprivacySetContextFormRequest = new ToolDataprivacySetContextFormRequest(); // ToolDataprivacySetContextFormRequest | 
    try {
      ToolDataprivacySetContextForm200Response result = apiInstance.toolDataprivacySetContextForm(toolDataprivacySetContextFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacySetContextForm");
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
| **toolDataprivacySetContextFormRequest** | [**ToolDataprivacySetContextFormRequest**](ToolDataprivacySetContextFormRequest.md)|  | |

### Return type

[**ToolDataprivacySetContextForm200Response**](ToolDataprivacySetContextForm200Response.md)

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

<a id="toolDataprivacySetContextlevelForm"></a>
# **toolDataprivacySetContextlevelForm**
> ToolDataprivacySetContextlevelForm200Response toolDataprivacySetContextlevelForm(toolDataprivacySetContextlevelFormRequest)

Sets purpose and category across a context level

Sets purpose and category across a context level

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacySetContextlevelFormRequest toolDataprivacySetContextlevelFormRequest = new ToolDataprivacySetContextlevelFormRequest(); // ToolDataprivacySetContextlevelFormRequest | 
    try {
      ToolDataprivacySetContextlevelForm200Response result = apiInstance.toolDataprivacySetContextlevelForm(toolDataprivacySetContextlevelFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacySetContextlevelForm");
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
| **toolDataprivacySetContextlevelFormRequest** | [**ToolDataprivacySetContextlevelFormRequest**](ToolDataprivacySetContextlevelFormRequest.md)|  | |

### Return type

[**ToolDataprivacySetContextlevelForm200Response**](ToolDataprivacySetContextlevelForm200Response.md)

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

<a id="toolDataprivacySubmitSelectedCoursesForm"></a>
# **toolDataprivacySubmitSelectedCoursesForm**
> CoreContentbankRenameContent200Response toolDataprivacySubmitSelectedCoursesForm(toolDataprivacySubmitSelectedCoursesFormRequest)

Save list of selected courses for export

Save list of selected courses for export

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacySubmitSelectedCoursesFormRequest toolDataprivacySubmitSelectedCoursesFormRequest = new ToolDataprivacySubmitSelectedCoursesFormRequest(); // ToolDataprivacySubmitSelectedCoursesFormRequest | 
    try {
      CoreContentbankRenameContent200Response result = apiInstance.toolDataprivacySubmitSelectedCoursesForm(toolDataprivacySubmitSelectedCoursesFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacySubmitSelectedCoursesForm");
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
| **toolDataprivacySubmitSelectedCoursesFormRequest** | [**ToolDataprivacySubmitSelectedCoursesFormRequest**](ToolDataprivacySubmitSelectedCoursesFormRequest.md)|  | |

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

<a id="toolDataprivacyTreeExtraBranches"></a>
# **toolDataprivacyTreeExtraBranches**
> ToolDataprivacyTreeExtraBranches200Response toolDataprivacyTreeExtraBranches(toolDataprivacyTreeExtraBranchesRequest)

Return branches for the context tree

Return branches for the context tree

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ToolDataprivacyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ToolDataprivacyApi apiInstance = new ToolDataprivacyApi(defaultClient);
    ToolDataprivacyTreeExtraBranchesRequest toolDataprivacyTreeExtraBranchesRequest = new ToolDataprivacyTreeExtraBranchesRequest(); // ToolDataprivacyTreeExtraBranchesRequest | 
    try {
      ToolDataprivacyTreeExtraBranches200Response result = apiInstance.toolDataprivacyTreeExtraBranches(toolDataprivacyTreeExtraBranchesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolDataprivacyApi#toolDataprivacyTreeExtraBranches");
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
| **toolDataprivacyTreeExtraBranchesRequest** | [**ToolDataprivacyTreeExtraBranchesRequest**](ToolDataprivacyTreeExtraBranchesRequest.md)|  | |

### Return type

[**ToolDataprivacyTreeExtraBranches200Response**](ToolDataprivacyTreeExtraBranches200Response.md)

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


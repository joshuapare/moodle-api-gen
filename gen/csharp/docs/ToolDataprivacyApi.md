# Org.OpenAPITools.Api.ToolDataprivacyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ToolDataprivacyApproveDataRequest**](ToolDataprivacyApi.md#tooldataprivacyapprovedatarequest) | **POST** /tool_dataprivacy_approve_data_request | Approve a data request |
| [**ToolDataprivacyBulkApproveDataRequests**](ToolDataprivacyApi.md#tooldataprivacybulkapprovedatarequests) | **POST** /tool_dataprivacy_bulk_approve_data_requests | Bulk approve data requests |
| [**ToolDataprivacyBulkDenyDataRequests**](ToolDataprivacyApi.md#tooldataprivacybulkdenydatarequests) | **POST** /tool_dataprivacy_bulk_deny_data_requests | Bulk deny data requests |
| [**ToolDataprivacyCancelDataRequest**](ToolDataprivacyApi.md#tooldataprivacycanceldatarequest) | **POST** /tool_dataprivacy_cancel_data_request | Cancel the data request made by the user |
| [**ToolDataprivacyConfirmContextsForDeletion**](ToolDataprivacyApi.md#tooldataprivacyconfirmcontextsfordeletion) | **POST** /tool_dataprivacy_confirm_contexts_for_deletion | Mark the selected expired contexts as confirmed for deletion |
| [**ToolDataprivacyContactDpo**](ToolDataprivacyApi.md#tooldataprivacycontactdpo) | **POST** /tool_dataprivacy_contact_dpo | Contact the site Data Protection Officer(s) |
| [**ToolDataprivacyCreateCategoryForm**](ToolDataprivacyApi.md#tooldataprivacycreatecategoryform) | **POST** /tool_dataprivacy_create_category_form | Adds a data category |
| [**ToolDataprivacyCreatePurposeForm**](ToolDataprivacyApi.md#tooldataprivacycreatepurposeform) | **POST** /tool_dataprivacy_create_purpose_form | Adds a data purpose |
| [**ToolDataprivacyDeleteCategory**](ToolDataprivacyApi.md#tooldataprivacydeletecategory) | **POST** /tool_dataprivacy_delete_category | Deletes an existing data category |
| [**ToolDataprivacyDeletePurpose**](ToolDataprivacyApi.md#tooldataprivacydeletepurpose) | **POST** /tool_dataprivacy_delete_purpose | Deletes an existing data purpose |
| [**ToolDataprivacyDenyDataRequest**](ToolDataprivacyApi.md#tooldataprivacydenydatarequest) | **POST** /tool_dataprivacy_deny_data_request | Deny a data request |
| [**ToolDataprivacyGetActivityOptions**](ToolDataprivacyApi.md#tooldataprivacygetactivityoptions) | **POST** /tool_dataprivacy_get_activity_options | Fetches a list of activity options |
| [**ToolDataprivacyGetCategoryOptions**](ToolDataprivacyApi.md#tooldataprivacygetcategoryoptions) | **POST** /tool_dataprivacy_get_category_options | Fetches a list of data category options |
| [**ToolDataprivacyGetDataRequest**](ToolDataprivacyApi.md#tooldataprivacygetdatarequest) | **POST** /tool_dataprivacy_get_data_request | Fetch the details of a user&#39;s data request |
| [**ToolDataprivacyGetPurposeOptions**](ToolDataprivacyApi.md#tooldataprivacygetpurposeoptions) | **POST** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options |
| [**ToolDataprivacyGetUsers**](ToolDataprivacyApi.md#tooldataprivacygetusers) | **POST** /tool_dataprivacy_get_users | Fetches a list of users |
| [**ToolDataprivacyMarkComplete**](ToolDataprivacyApi.md#tooldataprivacymarkcomplete) | **POST** /tool_dataprivacy_mark_complete | Mark a user&#39;s general enquiry as complete |
| [**ToolDataprivacySetContextDefaults**](ToolDataprivacyApi.md#tooldataprivacysetcontextdefaults) | **POST** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin) |
| [**ToolDataprivacySetContextForm**](ToolDataprivacyApi.md#tooldataprivacysetcontextform) | **POST** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context |
| [**ToolDataprivacySetContextlevelForm**](ToolDataprivacyApi.md#tooldataprivacysetcontextlevelform) | **POST** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level |
| [**ToolDataprivacySubmitSelectedCoursesForm**](ToolDataprivacyApi.md#tooldataprivacysubmitselectedcoursesform) | **POST** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export |
| [**ToolDataprivacyTreeExtraBranches**](ToolDataprivacyApi.md#tooldataprivacytreeextrabranches) | **POST** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree |

<a id="tooldataprivacyapprovedatarequest"></a>
# **ToolDataprivacyApproveDataRequest**
> CoreContentbankRenameContent200Response ToolDataprivacyApproveDataRequest (ToolDataprivacyApproveDataRequestRequest toolDataprivacyApproveDataRequestRequest)

Approve a data request

Approve a data request

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyApproveDataRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyApproveDataRequestRequest = new ToolDataprivacyApproveDataRequestRequest(); // ToolDataprivacyApproveDataRequestRequest | 

            try
            {
                // Approve a data request
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyApproveDataRequest(toolDataprivacyApproveDataRequestRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyApproveDataRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyApproveDataRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Approve a data request
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyApproveDataRequestWithHttpInfo(toolDataprivacyApproveDataRequestRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyApproveDataRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyApproveDataRequestRequest** | [**ToolDataprivacyApproveDataRequestRequest**](ToolDataprivacyApproveDataRequestRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacybulkapprovedatarequests"></a>
# **ToolDataprivacyBulkApproveDataRequests**
> CoreContentbankRenameContent200Response ToolDataprivacyBulkApproveDataRequests (ToolDataprivacyBulkApproveDataRequestsRequest toolDataprivacyBulkApproveDataRequestsRequest)

Bulk approve data requests

Bulk approve data requests

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyBulkApproveDataRequestsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyBulkApproveDataRequestsRequest = new ToolDataprivacyBulkApproveDataRequestsRequest(); // ToolDataprivacyBulkApproveDataRequestsRequest | 

            try
            {
                // Bulk approve data requests
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyBulkApproveDataRequests(toolDataprivacyBulkApproveDataRequestsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyBulkApproveDataRequests: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyBulkApproveDataRequestsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Bulk approve data requests
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyBulkApproveDataRequestsWithHttpInfo(toolDataprivacyBulkApproveDataRequestsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyBulkApproveDataRequestsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyBulkApproveDataRequestsRequest** | [**ToolDataprivacyBulkApproveDataRequestsRequest**](ToolDataprivacyBulkApproveDataRequestsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacybulkdenydatarequests"></a>
# **ToolDataprivacyBulkDenyDataRequests**
> CoreContentbankRenameContent200Response ToolDataprivacyBulkDenyDataRequests (ToolDataprivacyBulkDenyDataRequestsRequest toolDataprivacyBulkDenyDataRequestsRequest)

Bulk deny data requests

Bulk deny data requests

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyBulkDenyDataRequestsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyBulkDenyDataRequestsRequest = new ToolDataprivacyBulkDenyDataRequestsRequest(); // ToolDataprivacyBulkDenyDataRequestsRequest | 

            try
            {
                // Bulk deny data requests
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyBulkDenyDataRequests(toolDataprivacyBulkDenyDataRequestsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyBulkDenyDataRequests: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyBulkDenyDataRequestsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Bulk deny data requests
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyBulkDenyDataRequestsWithHttpInfo(toolDataprivacyBulkDenyDataRequestsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyBulkDenyDataRequestsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyBulkDenyDataRequestsRequest** | [**ToolDataprivacyBulkDenyDataRequestsRequest**](ToolDataprivacyBulkDenyDataRequestsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacycanceldatarequest"></a>
# **ToolDataprivacyCancelDataRequest**
> CoreContentbankRenameContent200Response ToolDataprivacyCancelDataRequest (ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest)

Cancel the data request made by the user

Cancel the data request made by the user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyCancelDataRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 

            try
            {
                // Cancel the data request made by the user
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyCancelDataRequest(toolDataprivacyCancelDataRequestRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyCancelDataRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyCancelDataRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Cancel the data request made by the user
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyCancelDataRequestWithHttpInfo(toolDataprivacyCancelDataRequestRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyCancelDataRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacyconfirmcontextsfordeletion"></a>
# **ToolDataprivacyConfirmContextsForDeletion**
> ToolDataprivacyConfirmContextsForDeletion200Response ToolDataprivacyConfirmContextsForDeletion (ToolDataprivacyConfirmContextsForDeletionRequest toolDataprivacyConfirmContextsForDeletionRequest)

Mark the selected expired contexts as confirmed for deletion

Mark the selected expired contexts as confirmed for deletion

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyConfirmContextsForDeletionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyConfirmContextsForDeletionRequest = new ToolDataprivacyConfirmContextsForDeletionRequest(); // ToolDataprivacyConfirmContextsForDeletionRequest | 

            try
            {
                // Mark the selected expired contexts as confirmed for deletion
                ToolDataprivacyConfirmContextsForDeletion200Response result = apiInstance.ToolDataprivacyConfirmContextsForDeletion(toolDataprivacyConfirmContextsForDeletionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyConfirmContextsForDeletion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyConfirmContextsForDeletionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Mark the selected expired contexts as confirmed for deletion
    ApiResponse<ToolDataprivacyConfirmContextsForDeletion200Response> response = apiInstance.ToolDataprivacyConfirmContextsForDeletionWithHttpInfo(toolDataprivacyConfirmContextsForDeletionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyConfirmContextsForDeletionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyConfirmContextsForDeletionRequest** | [**ToolDataprivacyConfirmContextsForDeletionRequest**](ToolDataprivacyConfirmContextsForDeletionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacycontactdpo"></a>
# **ToolDataprivacyContactDpo**
> CoreContentbankRenameContent200Response ToolDataprivacyContactDpo (ToolDataprivacyContactDpoRequest toolDataprivacyContactDpoRequest)

Contact the site Data Protection Officer(s)

Contact the site Data Protection Officer(s)

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyContactDpoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyContactDpoRequest = new ToolDataprivacyContactDpoRequest(); // ToolDataprivacyContactDpoRequest | 

            try
            {
                // Contact the site Data Protection Officer(s)
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyContactDpo(toolDataprivacyContactDpoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyContactDpo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyContactDpoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Contact the site Data Protection Officer(s)
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyContactDpoWithHttpInfo(toolDataprivacyContactDpoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyContactDpoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyContactDpoRequest** | [**ToolDataprivacyContactDpoRequest**](ToolDataprivacyContactDpoRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacycreatecategoryform"></a>
# **ToolDataprivacyCreateCategoryForm**
> ToolDataprivacyCreateCategoryForm200Response ToolDataprivacyCreateCategoryForm (ToolDataprivacyCreateCategoryFormRequest toolDataprivacyCreateCategoryFormRequest)

Adds a data category

Adds a data category

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyCreateCategoryFormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyCreateCategoryFormRequest = new ToolDataprivacyCreateCategoryFormRequest(); // ToolDataprivacyCreateCategoryFormRequest | 

            try
            {
                // Adds a data category
                ToolDataprivacyCreateCategoryForm200Response result = apiInstance.ToolDataprivacyCreateCategoryForm(toolDataprivacyCreateCategoryFormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyCreateCategoryForm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyCreateCategoryFormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Adds a data category
    ApiResponse<ToolDataprivacyCreateCategoryForm200Response> response = apiInstance.ToolDataprivacyCreateCategoryFormWithHttpInfo(toolDataprivacyCreateCategoryFormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyCreateCategoryFormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyCreateCategoryFormRequest** | [**ToolDataprivacyCreateCategoryFormRequest**](ToolDataprivacyCreateCategoryFormRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacycreatepurposeform"></a>
# **ToolDataprivacyCreatePurposeForm**
> ToolDataprivacyCreatePurposeForm200Response ToolDataprivacyCreatePurposeForm (ToolDataprivacyCreatePurposeFormRequest toolDataprivacyCreatePurposeFormRequest)

Adds a data purpose

Adds a data purpose

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyCreatePurposeFormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyCreatePurposeFormRequest = new ToolDataprivacyCreatePurposeFormRequest(); // ToolDataprivacyCreatePurposeFormRequest | 

            try
            {
                // Adds a data purpose
                ToolDataprivacyCreatePurposeForm200Response result = apiInstance.ToolDataprivacyCreatePurposeForm(toolDataprivacyCreatePurposeFormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyCreatePurposeForm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyCreatePurposeFormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Adds a data purpose
    ApiResponse<ToolDataprivacyCreatePurposeForm200Response> response = apiInstance.ToolDataprivacyCreatePurposeFormWithHttpInfo(toolDataprivacyCreatePurposeFormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyCreatePurposeFormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyCreatePurposeFormRequest** | [**ToolDataprivacyCreatePurposeFormRequest**](ToolDataprivacyCreatePurposeFormRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacydeletecategory"></a>
# **ToolDataprivacyDeleteCategory**
> CoreContentbankRenameContent200Response ToolDataprivacyDeleteCategory (ToolDataprivacyDeleteCategoryRequest toolDataprivacyDeleteCategoryRequest)

Deletes an existing data category

Deletes an existing data category

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyDeleteCategoryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyDeleteCategoryRequest = new ToolDataprivacyDeleteCategoryRequest(); // ToolDataprivacyDeleteCategoryRequest | 

            try
            {
                // Deletes an existing data category
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyDeleteCategory(toolDataprivacyDeleteCategoryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyDeleteCategory: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyDeleteCategoryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deletes an existing data category
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyDeleteCategoryWithHttpInfo(toolDataprivacyDeleteCategoryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyDeleteCategoryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyDeleteCategoryRequest** | [**ToolDataprivacyDeleteCategoryRequest**](ToolDataprivacyDeleteCategoryRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacydeletepurpose"></a>
# **ToolDataprivacyDeletePurpose**
> CoreContentbankRenameContent200Response ToolDataprivacyDeletePurpose (ToolDataprivacyDeletePurposeRequest toolDataprivacyDeletePurposeRequest)

Deletes an existing data purpose

Deletes an existing data purpose

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyDeletePurposeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyDeletePurposeRequest = new ToolDataprivacyDeletePurposeRequest(); // ToolDataprivacyDeletePurposeRequest | 

            try
            {
                // Deletes an existing data purpose
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyDeletePurpose(toolDataprivacyDeletePurposeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyDeletePurpose: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyDeletePurposeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deletes an existing data purpose
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyDeletePurposeWithHttpInfo(toolDataprivacyDeletePurposeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyDeletePurposeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyDeletePurposeRequest** | [**ToolDataprivacyDeletePurposeRequest**](ToolDataprivacyDeletePurposeRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacydenydatarequest"></a>
# **ToolDataprivacyDenyDataRequest**
> CoreContentbankRenameContent200Response ToolDataprivacyDenyDataRequest (ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest)

Deny a data request

Deny a data request

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyDenyDataRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 

            try
            {
                // Deny a data request
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyDenyDataRequest(toolDataprivacyCancelDataRequestRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyDenyDataRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyDenyDataRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deny a data request
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyDenyDataRequestWithHttpInfo(toolDataprivacyCancelDataRequestRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyDenyDataRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacygetactivityoptions"></a>
# **ToolDataprivacyGetActivityOptions**
> ToolDataprivacyGetActivityOptions200Response ToolDataprivacyGetActivityOptions (ToolDataprivacyGetActivityOptionsRequest toolDataprivacyGetActivityOptionsRequest)

Fetches a list of activity options

Fetches a list of activity options

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyGetActivityOptionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyGetActivityOptionsRequest = new ToolDataprivacyGetActivityOptionsRequest(); // ToolDataprivacyGetActivityOptionsRequest | 

            try
            {
                // Fetches a list of activity options
                ToolDataprivacyGetActivityOptions200Response result = apiInstance.ToolDataprivacyGetActivityOptions(toolDataprivacyGetActivityOptionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetActivityOptions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyGetActivityOptionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetches a list of activity options
    ApiResponse<ToolDataprivacyGetActivityOptions200Response> response = apiInstance.ToolDataprivacyGetActivityOptionsWithHttpInfo(toolDataprivacyGetActivityOptionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetActivityOptionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyGetActivityOptionsRequest** | [**ToolDataprivacyGetActivityOptionsRequest**](ToolDataprivacyGetActivityOptionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacygetcategoryoptions"></a>
# **ToolDataprivacyGetCategoryOptions**
> ToolDataprivacyGetCategoryOptions200Response ToolDataprivacyGetCategoryOptions (ToolDataprivacyGetCategoryOptionsRequest toolDataprivacyGetCategoryOptionsRequest)

Fetches a list of data category options

Fetches a list of data category options

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyGetCategoryOptionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyGetCategoryOptionsRequest = new ToolDataprivacyGetCategoryOptionsRequest(); // ToolDataprivacyGetCategoryOptionsRequest | 

            try
            {
                // Fetches a list of data category options
                ToolDataprivacyGetCategoryOptions200Response result = apiInstance.ToolDataprivacyGetCategoryOptions(toolDataprivacyGetCategoryOptionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetCategoryOptions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyGetCategoryOptionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetches a list of data category options
    ApiResponse<ToolDataprivacyGetCategoryOptions200Response> response = apiInstance.ToolDataprivacyGetCategoryOptionsWithHttpInfo(toolDataprivacyGetCategoryOptionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetCategoryOptionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyGetCategoryOptionsRequest** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacygetdatarequest"></a>
# **ToolDataprivacyGetDataRequest**
> ToolDataprivacyGetDataRequest200Response ToolDataprivacyGetDataRequest (ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest)

Fetch the details of a user's data request

Fetch the details of a user's data request

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyGetDataRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 

            try
            {
                // Fetch the details of a user's data request
                ToolDataprivacyGetDataRequest200Response result = apiInstance.ToolDataprivacyGetDataRequest(toolDataprivacyCancelDataRequestRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetDataRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyGetDataRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch the details of a user's data request
    ApiResponse<ToolDataprivacyGetDataRequest200Response> response = apiInstance.ToolDataprivacyGetDataRequestWithHttpInfo(toolDataprivacyCancelDataRequestRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetDataRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacygetpurposeoptions"></a>
# **ToolDataprivacyGetPurposeOptions**
> ToolDataprivacyGetPurposeOptions200Response ToolDataprivacyGetPurposeOptions (ToolDataprivacyGetCategoryOptionsRequest toolDataprivacyGetCategoryOptionsRequest)

Fetches a list of data storage purpose options

Fetches a list of data storage purpose options

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyGetPurposeOptionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyGetCategoryOptionsRequest = new ToolDataprivacyGetCategoryOptionsRequest(); // ToolDataprivacyGetCategoryOptionsRequest | 

            try
            {
                // Fetches a list of data storage purpose options
                ToolDataprivacyGetPurposeOptions200Response result = apiInstance.ToolDataprivacyGetPurposeOptions(toolDataprivacyGetCategoryOptionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetPurposeOptions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyGetPurposeOptionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetches a list of data storage purpose options
    ApiResponse<ToolDataprivacyGetPurposeOptions200Response> response = apiInstance.ToolDataprivacyGetPurposeOptionsWithHttpInfo(toolDataprivacyGetCategoryOptionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetPurposeOptionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyGetCategoryOptionsRequest** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacygetusers"></a>
# **ToolDataprivacyGetUsers**
> Object ToolDataprivacyGetUsers (ToolDataprivacyGetUsersRequest toolDataprivacyGetUsersRequest)

Fetches a list of users

Fetches a list of users

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyGetUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyGetUsersRequest = new ToolDataprivacyGetUsersRequest(); // ToolDataprivacyGetUsersRequest | 

            try
            {
                // Fetches a list of users
                Object result = apiInstance.ToolDataprivacyGetUsers(toolDataprivacyGetUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyGetUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetches a list of users
    ApiResponse<Object> response = apiInstance.ToolDataprivacyGetUsersWithHttpInfo(toolDataprivacyGetUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyGetUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyGetUsersRequest** | [**ToolDataprivacyGetUsersRequest**](ToolDataprivacyGetUsersRequest.md) |  |  |

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

<a id="tooldataprivacymarkcomplete"></a>
# **ToolDataprivacyMarkComplete**
> CoreContentbankRenameContent200Response ToolDataprivacyMarkComplete (ToolDataprivacyCancelDataRequestRequest toolDataprivacyCancelDataRequestRequest)

Mark a user's general enquiry as complete

Mark a user's general enquiry as complete

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyMarkCompleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyCancelDataRequestRequest = new ToolDataprivacyCancelDataRequestRequest(); // ToolDataprivacyCancelDataRequestRequest | 

            try
            {
                // Mark a user's general enquiry as complete
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacyMarkComplete(toolDataprivacyCancelDataRequestRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyMarkComplete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyMarkCompleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Mark a user's general enquiry as complete
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacyMarkCompleteWithHttpInfo(toolDataprivacyCancelDataRequestRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyMarkCompleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacysetcontextdefaults"></a>
# **ToolDataprivacySetContextDefaults**
> ToolDataprivacySetContextDefaults200Response ToolDataprivacySetContextDefaults (ToolDataprivacySetContextDefaultsRequest toolDataprivacySetContextDefaultsRequest)

Updates the default category and purpose for a given context level (and optionally, a plugin)

Updates the default category and purpose for a given context level (and optionally, a plugin)

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacySetContextDefaultsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacySetContextDefaultsRequest = new ToolDataprivacySetContextDefaultsRequest(); // ToolDataprivacySetContextDefaultsRequest | 

            try
            {
                // Updates the default category and purpose for a given context level (and optionally, a plugin)
                ToolDataprivacySetContextDefaults200Response result = apiInstance.ToolDataprivacySetContextDefaults(toolDataprivacySetContextDefaultsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySetContextDefaults: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacySetContextDefaultsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates the default category and purpose for a given context level (and optionally, a plugin)
    ApiResponse<ToolDataprivacySetContextDefaults200Response> response = apiInstance.ToolDataprivacySetContextDefaultsWithHttpInfo(toolDataprivacySetContextDefaultsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySetContextDefaultsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacySetContextDefaultsRequest** | [**ToolDataprivacySetContextDefaultsRequest**](ToolDataprivacySetContextDefaultsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacysetcontextform"></a>
# **ToolDataprivacySetContextForm**
> ToolDataprivacySetContextForm200Response ToolDataprivacySetContextForm (ToolDataprivacySetContextFormRequest toolDataprivacySetContextFormRequest)

Sets purpose and category for a specific context

Sets purpose and category for a specific context

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacySetContextFormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacySetContextFormRequest = new ToolDataprivacySetContextFormRequest(); // ToolDataprivacySetContextFormRequest | 

            try
            {
                // Sets purpose and category for a specific context
                ToolDataprivacySetContextForm200Response result = apiInstance.ToolDataprivacySetContextForm(toolDataprivacySetContextFormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySetContextForm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacySetContextFormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sets purpose and category for a specific context
    ApiResponse<ToolDataprivacySetContextForm200Response> response = apiInstance.ToolDataprivacySetContextFormWithHttpInfo(toolDataprivacySetContextFormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySetContextFormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacySetContextFormRequest** | [**ToolDataprivacySetContextFormRequest**](ToolDataprivacySetContextFormRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacysetcontextlevelform"></a>
# **ToolDataprivacySetContextlevelForm**
> ToolDataprivacySetContextlevelForm200Response ToolDataprivacySetContextlevelForm (ToolDataprivacySetContextlevelFormRequest toolDataprivacySetContextlevelFormRequest)

Sets purpose and category across a context level

Sets purpose and category across a context level

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacySetContextlevelFormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacySetContextlevelFormRequest = new ToolDataprivacySetContextlevelFormRequest(); // ToolDataprivacySetContextlevelFormRequest | 

            try
            {
                // Sets purpose and category across a context level
                ToolDataprivacySetContextlevelForm200Response result = apiInstance.ToolDataprivacySetContextlevelForm(toolDataprivacySetContextlevelFormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySetContextlevelForm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacySetContextlevelFormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sets purpose and category across a context level
    ApiResponse<ToolDataprivacySetContextlevelForm200Response> response = apiInstance.ToolDataprivacySetContextlevelFormWithHttpInfo(toolDataprivacySetContextlevelFormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySetContextlevelFormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacySetContextlevelFormRequest** | [**ToolDataprivacySetContextlevelFormRequest**](ToolDataprivacySetContextlevelFormRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacysubmitselectedcoursesform"></a>
# **ToolDataprivacySubmitSelectedCoursesForm**
> CoreContentbankRenameContent200Response ToolDataprivacySubmitSelectedCoursesForm (ToolDataprivacySubmitSelectedCoursesFormRequest toolDataprivacySubmitSelectedCoursesFormRequest)

Save list of selected courses for export

Save list of selected courses for export

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacySubmitSelectedCoursesFormExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacySubmitSelectedCoursesFormRequest = new ToolDataprivacySubmitSelectedCoursesFormRequest(); // ToolDataprivacySubmitSelectedCoursesFormRequest | 

            try
            {
                // Save list of selected courses for export
                CoreContentbankRenameContent200Response result = apiInstance.ToolDataprivacySubmitSelectedCoursesForm(toolDataprivacySubmitSelectedCoursesFormRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySubmitSelectedCoursesForm: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacySubmitSelectedCoursesFormWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save list of selected courses for export
    ApiResponse<CoreContentbankRenameContent200Response> response = apiInstance.ToolDataprivacySubmitSelectedCoursesFormWithHttpInfo(toolDataprivacySubmitSelectedCoursesFormRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacySubmitSelectedCoursesFormWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacySubmitSelectedCoursesFormRequest** | [**ToolDataprivacySubmitSelectedCoursesFormRequest**](ToolDataprivacySubmitSelectedCoursesFormRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="tooldataprivacytreeextrabranches"></a>
# **ToolDataprivacyTreeExtraBranches**
> ToolDataprivacyTreeExtraBranches200Response ToolDataprivacyTreeExtraBranches (ToolDataprivacyTreeExtraBranchesRequest toolDataprivacyTreeExtraBranchesRequest)

Return branches for the context tree

Return branches for the context tree

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ToolDataprivacyTreeExtraBranchesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ToolDataprivacyApi(config);
            var toolDataprivacyTreeExtraBranchesRequest = new ToolDataprivacyTreeExtraBranchesRequest(); // ToolDataprivacyTreeExtraBranchesRequest | 

            try
            {
                // Return branches for the context tree
                ToolDataprivacyTreeExtraBranches200Response result = apiInstance.ToolDataprivacyTreeExtraBranches(toolDataprivacyTreeExtraBranchesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyTreeExtraBranches: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ToolDataprivacyTreeExtraBranchesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return branches for the context tree
    ApiResponse<ToolDataprivacyTreeExtraBranches200Response> response = apiInstance.ToolDataprivacyTreeExtraBranchesWithHttpInfo(toolDataprivacyTreeExtraBranchesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ToolDataprivacyApi.ToolDataprivacyTreeExtraBranchesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **toolDataprivacyTreeExtraBranchesRequest** | [**ToolDataprivacyTreeExtraBranchesRequest**](ToolDataprivacyTreeExtraBranchesRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# MoodleClient.Api.BlockIomadCompanyAdminApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BlockIomadCompanyAdminAllocateLicenses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminallocatelicenses) | **POST** /block_iomad_company_admin_allocate_licenses | Allocate course licenses to a user |
| [**BlockIomadCompanyAdminAssignCourses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminassigncourses) | **POST** /block_iomad_company_admin_assign_courses | Assign a course to a company |
| [**BlockIomadCompanyAdminAssignUsers**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminassignusers) | **POST** /block_iomad_company_admin_assign_users | Assign users to a company |
| [**BlockIomadCompanyAdminCapabilityDeleteTemplate**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmincapabilitydeletetemplate) | **POST** /block_iomad_company_admin_capability_delete_template | Delete Iomad capabilities template |
| [**BlockIomadCompanyAdminCheckToken**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminchecktoken) | **POST** /block_iomad_company_admin_check_token | Check SSO token |
| [**BlockIomadCompanyAdminCreateCompanies**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmincreatecompanies) | **POST** /block_iomad_company_admin_create_companies | Create new Iomad companies |
| [**BlockIomadCompanyAdminCreateLicenses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmincreatelicenses) | **POST** /block_iomad_company_admin_create_licenses | Create company licenses |
| [**BlockIomadCompanyAdminDeleteLicenses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmindeletelicenses) | **POST** /block_iomad_company_admin_delete_licenses | Delete company licenses |
| [**BlockIomadCompanyAdminEditCompanies**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmineditcompanies) | **POST** /block_iomad_company_admin_edit_companies | Edit Iomad companies |
| [**BlockIomadCompanyAdminEditLicenses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmineditlicenses) | **POST** /block_iomad_company_admin_edit_licenses | Edit company license settings |
| [**BlockIomadCompanyAdminEnrolUsers**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminenrolusers) | **POST** /block_iomad_company_admin_enrol_users | Assign users onto courses |
| [**BlockIomadCompanyAdminGetCompanies**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetcompanies) | **POST** /block_iomad_company_admin_get_companies | Get all Iomad companies |
| [**BlockIomadCompanyAdminGetCompanyCourses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetcompanycourses) | **POST** /block_iomad_company_admin_get_company_courses | Get Iomad company course allocations |
| [**BlockIomadCompanyAdminGetCourseInfo**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetcourseinfo) | **POST** /block_iomad_company_admin_get_course_info | Get Iomad course settings |
| [**BlockIomadCompanyAdminGetDepartmentUsers**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetdepartmentusers) | **POST** /block_iomad_company_admin_get_department_users | Get users within a department |
| [**BlockIomadCompanyAdminGetDepartments**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetdepartments) | **POST** /block_iomad_company_admin_get_departments | Get all company departments |
| [**BlockIomadCompanyAdminGetLicenseFromId**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetlicensefromid) | **POST** /block_iomad_company_admin_get_license_from_id | Get licence data give the ID |
| [**BlockIomadCompanyAdminGetLicenseInfo**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetlicenseinfo) | **POST** /block_iomad_company_admin_get_license_info | Get company license information |
| [**BlockIomadCompanyAdminMoveUsers**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminmoveusers) | **POST** /block_iomad_company_admin_move_users | Move users between departments |
| [**BlockIomadCompanyAdminRestrictCapability**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminrestrictcapability) | **POST** /block_iomad_company_admin_restrict_capability | set/reset Iomad capability |
| [**BlockIomadCompanyAdminSyncUsers**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminsyncusers) | **POST** /block_iomad_company_admin_sync_users | Call update users to sync to external system |
| [**BlockIomadCompanyAdminUnallocateLicenses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminunallocatelicenses) | **POST** /block_iomad_company_admin_unallocate_licenses | Remove course licenses from users |
| [**BlockIomadCompanyAdminUnassignCourses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminunassigncourses) | **POST** /block_iomad_company_admin_unassign_courses | Unassign a course from a company |
| [**BlockIomadCompanyAdminUnassignUsers**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminunassignusers) | **POST** /block_iomad_company_admin_unassign_users | Unassign users from a company |
| [**BlockIomadCompanyAdminUpdateCourses**](BlockIomadCompanyAdminApi.md#blockiomadcompanyadminupdatecourses) | **POST** /block_iomad_company_admin_update_courses | Update Iomad course settings |

<a id="blockiomadcompanyadminallocatelicenses"></a>
# **BlockIomadCompanyAdminAllocateLicenses**
> Object BlockIomadCompanyAdminAllocateLicenses (BlockIomadCompanyAdminAllocateLicensesRequest blockIomadCompanyAdminAllocateLicensesRequest)

Allocate course licenses to a user

Allocate course licenses to a user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminAllocateLicensesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminAllocateLicensesRequest = new BlockIomadCompanyAdminAllocateLicensesRequest(); // BlockIomadCompanyAdminAllocateLicensesRequest | 

            try
            {
                // Allocate course licenses to a user
                Object result = apiInstance.BlockIomadCompanyAdminAllocateLicenses(blockIomadCompanyAdminAllocateLicensesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminAllocateLicenses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminAllocateLicensesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Allocate course licenses to a user
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminAllocateLicensesWithHttpInfo(blockIomadCompanyAdminAllocateLicensesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminAllocateLicensesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminAllocateLicensesRequest** | [**BlockIomadCompanyAdminAllocateLicensesRequest**](BlockIomadCompanyAdminAllocateLicensesRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminassigncourses"></a>
# **BlockIomadCompanyAdminAssignCourses**
> Object BlockIomadCompanyAdminAssignCourses (BlockIomadCompanyAdminAssignCoursesRequest blockIomadCompanyAdminAssignCoursesRequest)

Assign a course to a company

Assign a course to a company

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminAssignCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminAssignCoursesRequest = new BlockIomadCompanyAdminAssignCoursesRequest(); // BlockIomadCompanyAdminAssignCoursesRequest | 

            try
            {
                // Assign a course to a company
                Object result = apiInstance.BlockIomadCompanyAdminAssignCourses(blockIomadCompanyAdminAssignCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminAssignCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminAssignCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Assign a course to a company
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminAssignCoursesWithHttpInfo(blockIomadCompanyAdminAssignCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminAssignCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminAssignCoursesRequest** | [**BlockIomadCompanyAdminAssignCoursesRequest**](BlockIomadCompanyAdminAssignCoursesRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminassignusers"></a>
# **BlockIomadCompanyAdminAssignUsers**
> BlockIomadCompanyAdminAssignUsers200Response BlockIomadCompanyAdminAssignUsers (BlockIomadCompanyAdminAssignUsersRequest blockIomadCompanyAdminAssignUsersRequest)

Assign users to a company

Assign users to a company

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminAssignUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminAssignUsersRequest = new BlockIomadCompanyAdminAssignUsersRequest(); // BlockIomadCompanyAdminAssignUsersRequest | 

            try
            {
                // Assign users to a company
                BlockIomadCompanyAdminAssignUsers200Response result = apiInstance.BlockIomadCompanyAdminAssignUsers(blockIomadCompanyAdminAssignUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminAssignUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminAssignUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Assign users to a company
    ApiResponse<BlockIomadCompanyAdminAssignUsers200Response> response = apiInstance.BlockIomadCompanyAdminAssignUsersWithHttpInfo(blockIomadCompanyAdminAssignUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminAssignUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminAssignUsersRequest** | [**BlockIomadCompanyAdminAssignUsersRequest**](BlockIomadCompanyAdminAssignUsersRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminAssignUsers200Response**](BlockIomadCompanyAdminAssignUsers200Response.md)

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

<a id="blockiomadcompanyadmincapabilitydeletetemplate"></a>
# **BlockIomadCompanyAdminCapabilityDeleteTemplate**
> Object BlockIomadCompanyAdminCapabilityDeleteTemplate (BlockIomadCompanyAdminCapabilityDeleteTemplateRequest blockIomadCompanyAdminCapabilityDeleteTemplateRequest)

Delete Iomad capabilities template

Delete Iomad capabilities template

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminCapabilityDeleteTemplateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminCapabilityDeleteTemplateRequest = new BlockIomadCompanyAdminCapabilityDeleteTemplateRequest(); // BlockIomadCompanyAdminCapabilityDeleteTemplateRequest | 

            try
            {
                // Delete Iomad capabilities template
                Object result = apiInstance.BlockIomadCompanyAdminCapabilityDeleteTemplate(blockIomadCompanyAdminCapabilityDeleteTemplateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCapabilityDeleteTemplate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminCapabilityDeleteTemplateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Iomad capabilities template
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminCapabilityDeleteTemplateWithHttpInfo(blockIomadCompanyAdminCapabilityDeleteTemplateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCapabilityDeleteTemplateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminCapabilityDeleteTemplateRequest** | [**BlockIomadCompanyAdminCapabilityDeleteTemplateRequest**](BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md) |  |  |

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
| **200** | True capability update succeeds |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminchecktoken"></a>
# **BlockIomadCompanyAdminCheckToken**
> BlockIomadCompanyAdminCheckToken200Response BlockIomadCompanyAdminCheckToken (BlockIomadCompanyAdminCheckTokenRequest blockIomadCompanyAdminCheckTokenRequest)

Check SSO token

Check SSO token

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminCheckTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminCheckTokenRequest = new BlockIomadCompanyAdminCheckTokenRequest(); // BlockIomadCompanyAdminCheckTokenRequest | 

            try
            {
                // Check SSO token
                BlockIomadCompanyAdminCheckToken200Response result = apiInstance.BlockIomadCompanyAdminCheckToken(blockIomadCompanyAdminCheckTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCheckToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminCheckTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Check SSO token
    ApiResponse<BlockIomadCompanyAdminCheckToken200Response> response = apiInstance.BlockIomadCompanyAdminCheckTokenWithHttpInfo(blockIomadCompanyAdminCheckTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCheckTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminCheckTokenRequest** | [**BlockIomadCompanyAdminCheckTokenRequest**](BlockIomadCompanyAdminCheckTokenRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminCheckToken200Response**](BlockIomadCompanyAdminCheckToken200Response.md)

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

<a id="blockiomadcompanyadmincreatecompanies"></a>
# **BlockIomadCompanyAdminCreateCompanies**
> Object BlockIomadCompanyAdminCreateCompanies (BlockIomadCompanyAdminCreateCompaniesRequest blockIomadCompanyAdminCreateCompaniesRequest)

Create new Iomad companies

Create new Iomad companies

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminCreateCompaniesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminCreateCompaniesRequest = new BlockIomadCompanyAdminCreateCompaniesRequest(); // BlockIomadCompanyAdminCreateCompaniesRequest | 

            try
            {
                // Create new Iomad companies
                Object result = apiInstance.BlockIomadCompanyAdminCreateCompanies(blockIomadCompanyAdminCreateCompaniesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCreateCompanies: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminCreateCompaniesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create new Iomad companies
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminCreateCompaniesWithHttpInfo(blockIomadCompanyAdminCreateCompaniesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCreateCompaniesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminCreateCompaniesRequest** | [**BlockIomadCompanyAdminCreateCompaniesRequest**](BlockIomadCompanyAdminCreateCompaniesRequest.md) |  |  |

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

<a id="blockiomadcompanyadmincreatelicenses"></a>
# **BlockIomadCompanyAdminCreateLicenses**
> Object BlockIomadCompanyAdminCreateLicenses (BlockIomadCompanyAdminCreateLicensesRequest blockIomadCompanyAdminCreateLicensesRequest)

Create company licenses

Create company licenses

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminCreateLicensesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminCreateLicensesRequest = new BlockIomadCompanyAdminCreateLicensesRequest(); // BlockIomadCompanyAdminCreateLicensesRequest | 

            try
            {
                // Create company licenses
                Object result = apiInstance.BlockIomadCompanyAdminCreateLicenses(blockIomadCompanyAdminCreateLicensesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCreateLicenses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminCreateLicensesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create company licenses
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminCreateLicensesWithHttpInfo(blockIomadCompanyAdminCreateLicensesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminCreateLicensesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminCreateLicensesRequest** | [**BlockIomadCompanyAdminCreateLicensesRequest**](BlockIomadCompanyAdminCreateLicensesRequest.md) |  |  |

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

<a id="blockiomadcompanyadmindeletelicenses"></a>
# **BlockIomadCompanyAdminDeleteLicenses**
> Object BlockIomadCompanyAdminDeleteLicenses (BlockIomadCompanyAdminDeleteLicensesRequest blockIomadCompanyAdminDeleteLicensesRequest)

Delete company licenses

Delete company licenses

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminDeleteLicensesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminDeleteLicensesRequest = new BlockIomadCompanyAdminDeleteLicensesRequest(); // BlockIomadCompanyAdminDeleteLicensesRequest | 

            try
            {
                // Delete company licenses
                Object result = apiInstance.BlockIomadCompanyAdminDeleteLicenses(blockIomadCompanyAdminDeleteLicensesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminDeleteLicenses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminDeleteLicensesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete company licenses
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminDeleteLicensesWithHttpInfo(blockIomadCompanyAdminDeleteLicensesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminDeleteLicensesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminDeleteLicensesRequest** | [**BlockIomadCompanyAdminDeleteLicensesRequest**](BlockIomadCompanyAdminDeleteLicensesRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadmineditcompanies"></a>
# **BlockIomadCompanyAdminEditCompanies**
> Object BlockIomadCompanyAdminEditCompanies (BlockIomadCompanyAdminEditCompaniesRequest blockIomadCompanyAdminEditCompaniesRequest)

Edit Iomad companies

Edit Iomad companies

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminEditCompaniesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminEditCompaniesRequest = new BlockIomadCompanyAdminEditCompaniesRequest(); // BlockIomadCompanyAdminEditCompaniesRequest | 

            try
            {
                // Edit Iomad companies
                Object result = apiInstance.BlockIomadCompanyAdminEditCompanies(blockIomadCompanyAdminEditCompaniesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminEditCompanies: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminEditCompaniesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Edit Iomad companies
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminEditCompaniesWithHttpInfo(blockIomadCompanyAdminEditCompaniesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminEditCompaniesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminEditCompaniesRequest** | [**BlockIomadCompanyAdminEditCompaniesRequest**](BlockIomadCompanyAdminEditCompaniesRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadmineditlicenses"></a>
# **BlockIomadCompanyAdminEditLicenses**
> Object BlockIomadCompanyAdminEditLicenses (BlockIomadCompanyAdminEditLicensesRequest blockIomadCompanyAdminEditLicensesRequest)

Edit company license settings

Edit company license settings

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminEditLicensesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminEditLicensesRequest = new BlockIomadCompanyAdminEditLicensesRequest(); // BlockIomadCompanyAdminEditLicensesRequest | 

            try
            {
                // Edit company license settings
                Object result = apiInstance.BlockIomadCompanyAdminEditLicenses(blockIomadCompanyAdminEditLicensesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminEditLicenses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminEditLicensesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Edit company license settings
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminEditLicensesWithHttpInfo(blockIomadCompanyAdminEditLicensesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminEditLicensesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminEditLicensesRequest** | [**BlockIomadCompanyAdminEditLicensesRequest**](BlockIomadCompanyAdminEditLicensesRequest.md) |  |  |

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

<a id="blockiomadcompanyadminenrolusers"></a>
# **BlockIomadCompanyAdminEnrolUsers**
> Object BlockIomadCompanyAdminEnrolUsers (BlockIomadCompanyAdminEnrolUsersRequest blockIomadCompanyAdminEnrolUsersRequest)

Assign users onto courses

Assign users onto courses

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminEnrolUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminEnrolUsersRequest = new BlockIomadCompanyAdminEnrolUsersRequest(); // BlockIomadCompanyAdminEnrolUsersRequest | 

            try
            {
                // Assign users onto courses
                Object result = apiInstance.BlockIomadCompanyAdminEnrolUsers(blockIomadCompanyAdminEnrolUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminEnrolUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminEnrolUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Assign users onto courses
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminEnrolUsersWithHttpInfo(blockIomadCompanyAdminEnrolUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminEnrolUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminEnrolUsersRequest** | [**BlockIomadCompanyAdminEnrolUsersRequest**](BlockIomadCompanyAdminEnrolUsersRequest.md) |  |  |

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
| **200** | True user enrolments succeeds |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadmingetcompanies"></a>
# **BlockIomadCompanyAdminGetCompanies**
> BlockIomadCompanyAdminGetCompanies200Response BlockIomadCompanyAdminGetCompanies (BlockIomadCompanyAdminGetCompaniesRequest blockIomadCompanyAdminGetCompaniesRequest)

Get all Iomad companies

Get all Iomad companies

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminGetCompaniesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminGetCompaniesRequest = new BlockIomadCompanyAdminGetCompaniesRequest(); // BlockIomadCompanyAdminGetCompaniesRequest | 

            try
            {
                // Get all Iomad companies
                BlockIomadCompanyAdminGetCompanies200Response result = apiInstance.BlockIomadCompanyAdminGetCompanies(blockIomadCompanyAdminGetCompaniesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetCompanies: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminGetCompaniesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get all Iomad companies
    ApiResponse<BlockIomadCompanyAdminGetCompanies200Response> response = apiInstance.BlockIomadCompanyAdminGetCompaniesWithHttpInfo(blockIomadCompanyAdminGetCompaniesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetCompaniesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminGetCompaniesRequest** | [**BlockIomadCompanyAdminGetCompaniesRequest**](BlockIomadCompanyAdminGetCompaniesRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminGetCompanies200Response**](BlockIomadCompanyAdminGetCompanies200Response.md)

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

<a id="blockiomadcompanyadmingetcompanycourses"></a>
# **BlockIomadCompanyAdminGetCompanyCourses**
> BlockIomadCompanyAdminGetCompanyCourses200Response BlockIomadCompanyAdminGetCompanyCourses (BlockIomadCompanyAdminGetCompanyCoursesRequest blockIomadCompanyAdminGetCompanyCoursesRequest)

Get Iomad company course allocations

Get Iomad company course allocations

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminGetCompanyCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminGetCompanyCoursesRequest = new BlockIomadCompanyAdminGetCompanyCoursesRequest(); // BlockIomadCompanyAdminGetCompanyCoursesRequest | 

            try
            {
                // Get Iomad company course allocations
                BlockIomadCompanyAdminGetCompanyCourses200Response result = apiInstance.BlockIomadCompanyAdminGetCompanyCourses(blockIomadCompanyAdminGetCompanyCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetCompanyCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminGetCompanyCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Iomad company course allocations
    ApiResponse<BlockIomadCompanyAdminGetCompanyCourses200Response> response = apiInstance.BlockIomadCompanyAdminGetCompanyCoursesWithHttpInfo(blockIomadCompanyAdminGetCompanyCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetCompanyCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminGetCompanyCoursesRequest** | [**BlockIomadCompanyAdminGetCompanyCoursesRequest**](BlockIomadCompanyAdminGetCompanyCoursesRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminGetCompanyCourses200Response**](BlockIomadCompanyAdminGetCompanyCourses200Response.md)

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

<a id="blockiomadcompanyadmingetcourseinfo"></a>
# **BlockIomadCompanyAdminGetCourseInfo**
> Object BlockIomadCompanyAdminGetCourseInfo (BlockIomadCompanyAdminGetCourseInfoRequest blockIomadCompanyAdminGetCourseInfoRequest)

Get Iomad course settings

Get Iomad course settings

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminGetCourseInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminGetCourseInfoRequest = new BlockIomadCompanyAdminGetCourseInfoRequest(); // BlockIomadCompanyAdminGetCourseInfoRequest | 

            try
            {
                // Get Iomad course settings
                Object result = apiInstance.BlockIomadCompanyAdminGetCourseInfo(blockIomadCompanyAdminGetCourseInfoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetCourseInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminGetCourseInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Iomad course settings
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminGetCourseInfoWithHttpInfo(blockIomadCompanyAdminGetCourseInfoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetCourseInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminGetCourseInfoRequest** | [**BlockIomadCompanyAdminGetCourseInfoRequest**](BlockIomadCompanyAdminGetCourseInfoRequest.md) |  |  |

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

<a id="blockiomadcompanyadmingetdepartmentusers"></a>
# **BlockIomadCompanyAdminGetDepartmentUsers**
> BlockIomadCompanyAdminGetDepartmentUsers200Response BlockIomadCompanyAdminGetDepartmentUsers (BlockIomadCompanyAdminGetDepartmentUsersRequest blockIomadCompanyAdminGetDepartmentUsersRequest)

Get users within a department

Get users within a department

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminGetDepartmentUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminGetDepartmentUsersRequest = new BlockIomadCompanyAdminGetDepartmentUsersRequest(); // BlockIomadCompanyAdminGetDepartmentUsersRequest | 

            try
            {
                // Get users within a department
                BlockIomadCompanyAdminGetDepartmentUsers200Response result = apiInstance.BlockIomadCompanyAdminGetDepartmentUsers(blockIomadCompanyAdminGetDepartmentUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetDepartmentUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminGetDepartmentUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get users within a department
    ApiResponse<BlockIomadCompanyAdminGetDepartmentUsers200Response> response = apiInstance.BlockIomadCompanyAdminGetDepartmentUsersWithHttpInfo(blockIomadCompanyAdminGetDepartmentUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetDepartmentUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminGetDepartmentUsersRequest** | [**BlockIomadCompanyAdminGetDepartmentUsersRequest**](BlockIomadCompanyAdminGetDepartmentUsersRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminGetDepartmentUsers200Response**](BlockIomadCompanyAdminGetDepartmentUsers200Response.md)

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

<a id="blockiomadcompanyadmingetdepartments"></a>
# **BlockIomadCompanyAdminGetDepartments**
> BlockIomadCompanyAdminGetDepartments200Response BlockIomadCompanyAdminGetDepartments (BlockIomadCompanyAdminGetDepartmentsRequest blockIomadCompanyAdminGetDepartmentsRequest)

Get all company departments

Get all company departments

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminGetDepartmentsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminGetDepartmentsRequest = new BlockIomadCompanyAdminGetDepartmentsRequest(); // BlockIomadCompanyAdminGetDepartmentsRequest | 

            try
            {
                // Get all company departments
                BlockIomadCompanyAdminGetDepartments200Response result = apiInstance.BlockIomadCompanyAdminGetDepartments(blockIomadCompanyAdminGetDepartmentsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetDepartments: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminGetDepartmentsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get all company departments
    ApiResponse<BlockIomadCompanyAdminGetDepartments200Response> response = apiInstance.BlockIomadCompanyAdminGetDepartmentsWithHttpInfo(blockIomadCompanyAdminGetDepartmentsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetDepartmentsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminGetDepartmentsRequest** | [**BlockIomadCompanyAdminGetDepartmentsRequest**](BlockIomadCompanyAdminGetDepartmentsRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminGetDepartments200Response**](BlockIomadCompanyAdminGetDepartments200Response.md)

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

<a id="blockiomadcompanyadmingetlicensefromid"></a>
# **BlockIomadCompanyAdminGetLicenseFromId**
> BlockIomadCompanyAdminGetLicenseFromId200Response BlockIomadCompanyAdminGetLicenseFromId (BlockIomadCompanyAdminGetLicenseFromIdRequest blockIomadCompanyAdminGetLicenseFromIdRequest)

Get licence data give the ID

Get licence data give the ID

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminGetLicenseFromIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminGetLicenseFromIdRequest = new BlockIomadCompanyAdminGetLicenseFromIdRequest(); // BlockIomadCompanyAdminGetLicenseFromIdRequest | 

            try
            {
                // Get licence data give the ID
                BlockIomadCompanyAdminGetLicenseFromId200Response result = apiInstance.BlockIomadCompanyAdminGetLicenseFromId(blockIomadCompanyAdminGetLicenseFromIdRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetLicenseFromId: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminGetLicenseFromIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get licence data give the ID
    ApiResponse<BlockIomadCompanyAdminGetLicenseFromId200Response> response = apiInstance.BlockIomadCompanyAdminGetLicenseFromIdWithHttpInfo(blockIomadCompanyAdminGetLicenseFromIdRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetLicenseFromIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminGetLicenseFromIdRequest** | [**BlockIomadCompanyAdminGetLicenseFromIdRequest**](BlockIomadCompanyAdminGetLicenseFromIdRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminGetLicenseFromId200Response**](BlockIomadCompanyAdminGetLicenseFromId200Response.md)

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

<a id="blockiomadcompanyadmingetlicenseinfo"></a>
# **BlockIomadCompanyAdminGetLicenseInfo**
> BlockIomadCompanyAdminGetLicenseInfo200Response BlockIomadCompanyAdminGetLicenseInfo (BlockIomadCompanyAdminGetLicenseInfoRequest blockIomadCompanyAdminGetLicenseInfoRequest)

Get company license information

Get company license information

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminGetLicenseInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminGetLicenseInfoRequest = new BlockIomadCompanyAdminGetLicenseInfoRequest(); // BlockIomadCompanyAdminGetLicenseInfoRequest | 

            try
            {
                // Get company license information
                BlockIomadCompanyAdminGetLicenseInfo200Response result = apiInstance.BlockIomadCompanyAdminGetLicenseInfo(blockIomadCompanyAdminGetLicenseInfoRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetLicenseInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminGetLicenseInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get company license information
    ApiResponse<BlockIomadCompanyAdminGetLicenseInfo200Response> response = apiInstance.BlockIomadCompanyAdminGetLicenseInfoWithHttpInfo(blockIomadCompanyAdminGetLicenseInfoRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminGetLicenseInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminGetLicenseInfoRequest** | [**BlockIomadCompanyAdminGetLicenseInfoRequest**](BlockIomadCompanyAdminGetLicenseInfoRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminGetLicenseInfo200Response**](BlockIomadCompanyAdminGetLicenseInfo200Response.md)

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

<a id="blockiomadcompanyadminmoveusers"></a>
# **BlockIomadCompanyAdminMoveUsers**
> Object BlockIomadCompanyAdminMoveUsers (BlockIomadCompanyAdminMoveUsersRequest blockIomadCompanyAdminMoveUsersRequest)

Move users between departments

Move users between departments

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminMoveUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminMoveUsersRequest = new BlockIomadCompanyAdminMoveUsersRequest(); // BlockIomadCompanyAdminMoveUsersRequest | 

            try
            {
                // Move users between departments
                Object result = apiInstance.BlockIomadCompanyAdminMoveUsers(blockIomadCompanyAdminMoveUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminMoveUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminMoveUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Move users between departments
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminMoveUsersWithHttpInfo(blockIomadCompanyAdminMoveUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminMoveUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminMoveUsersRequest** | [**BlockIomadCompanyAdminMoveUsersRequest**](BlockIomadCompanyAdminMoveUsersRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminrestrictcapability"></a>
# **BlockIomadCompanyAdminRestrictCapability**
> Object BlockIomadCompanyAdminRestrictCapability (BlockIomadCompanyAdminRestrictCapabilityRequest blockIomadCompanyAdminRestrictCapabilityRequest)

set/reset Iomad capability

set/reset Iomad capability

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminRestrictCapabilityExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminRestrictCapabilityRequest = new BlockIomadCompanyAdminRestrictCapabilityRequest(); // BlockIomadCompanyAdminRestrictCapabilityRequest | 

            try
            {
                // set/reset Iomad capability
                Object result = apiInstance.BlockIomadCompanyAdminRestrictCapability(blockIomadCompanyAdminRestrictCapabilityRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminRestrictCapability: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminRestrictCapabilityWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // set/reset Iomad capability
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminRestrictCapabilityWithHttpInfo(blockIomadCompanyAdminRestrictCapabilityRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminRestrictCapabilityWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminRestrictCapabilityRequest** | [**BlockIomadCompanyAdminRestrictCapabilityRequest**](BlockIomadCompanyAdminRestrictCapabilityRequest.md) |  |  |

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
| **200** | True capability update succeeds |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminsyncusers"></a>
# **BlockIomadCompanyAdminSyncUsers**
> BlockIomadCompanyAdminSyncUsers200Response BlockIomadCompanyAdminSyncUsers (BlockIomadCompanyAdminSyncUsersRequest blockIomadCompanyAdminSyncUsersRequest)

Call update users to sync to external system

Call update users to sync to external system

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminSyncUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminSyncUsersRequest = new BlockIomadCompanyAdminSyncUsersRequest(); // BlockIomadCompanyAdminSyncUsersRequest | 

            try
            {
                // Call update users to sync to external system
                BlockIomadCompanyAdminSyncUsers200Response result = apiInstance.BlockIomadCompanyAdminSyncUsers(blockIomadCompanyAdminSyncUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminSyncUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminSyncUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Call update users to sync to external system
    ApiResponse<BlockIomadCompanyAdminSyncUsers200Response> response = apiInstance.BlockIomadCompanyAdminSyncUsersWithHttpInfo(blockIomadCompanyAdminSyncUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminSyncUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminSyncUsersRequest** | [**BlockIomadCompanyAdminSyncUsersRequest**](BlockIomadCompanyAdminSyncUsersRequest.md) |  |  |

### Return type

[**BlockIomadCompanyAdminSyncUsers200Response**](BlockIomadCompanyAdminSyncUsers200Response.md)

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

<a id="blockiomadcompanyadminunallocatelicenses"></a>
# **BlockIomadCompanyAdminUnallocateLicenses**
> Object BlockIomadCompanyAdminUnallocateLicenses (BlockIomadCompanyAdminUnallocateLicensesRequest blockIomadCompanyAdminUnallocateLicensesRequest)

Remove course licenses from users

Remove course licenses from users

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminUnallocateLicensesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminUnallocateLicensesRequest = new BlockIomadCompanyAdminUnallocateLicensesRequest(); // BlockIomadCompanyAdminUnallocateLicensesRequest | 

            try
            {
                // Remove course licenses from users
                Object result = apiInstance.BlockIomadCompanyAdminUnallocateLicenses(blockIomadCompanyAdminUnallocateLicensesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUnallocateLicenses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminUnallocateLicensesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove course licenses from users
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminUnallocateLicensesWithHttpInfo(blockIomadCompanyAdminUnallocateLicensesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUnallocateLicensesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminUnallocateLicensesRequest** | [**BlockIomadCompanyAdminUnallocateLicensesRequest**](BlockIomadCompanyAdminUnallocateLicensesRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminunassigncourses"></a>
# **BlockIomadCompanyAdminUnassignCourses**
> Object BlockIomadCompanyAdminUnassignCourses (BlockIomadCompanyAdminUnassignCoursesRequest blockIomadCompanyAdminUnassignCoursesRequest)

Unassign a course from a company

Unassign a course from a company

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminUnassignCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminUnassignCoursesRequest = new BlockIomadCompanyAdminUnassignCoursesRequest(); // BlockIomadCompanyAdminUnassignCoursesRequest | 

            try
            {
                // Unassign a course from a company
                Object result = apiInstance.BlockIomadCompanyAdminUnassignCourses(blockIomadCompanyAdminUnassignCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUnassignCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminUnassignCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Unassign a course from a company
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminUnassignCoursesWithHttpInfo(blockIomadCompanyAdminUnassignCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUnassignCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminUnassignCoursesRequest** | [**BlockIomadCompanyAdminUnassignCoursesRequest**](BlockIomadCompanyAdminUnassignCoursesRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminunassignusers"></a>
# **BlockIomadCompanyAdminUnassignUsers**
> Object BlockIomadCompanyAdminUnassignUsers (BlockIomadCompanyAdminUnassignUsersRequest blockIomadCompanyAdminUnassignUsersRequest)

Unassign users from a company

Unassign users from a company

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminUnassignUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminUnassignUsersRequest = new BlockIomadCompanyAdminUnassignUsersRequest(); // BlockIomadCompanyAdminUnassignUsersRequest | 

            try
            {
                // Unassign users from a company
                Object result = apiInstance.BlockIomadCompanyAdminUnassignUsers(blockIomadCompanyAdminUnassignUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUnassignUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminUnassignUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Unassign users from a company
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminUnassignUsersWithHttpInfo(blockIomadCompanyAdminUnassignUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUnassignUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminUnassignUsersRequest** | [**BlockIomadCompanyAdminUnassignUsersRequest**](BlockIomadCompanyAdminUnassignUsersRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="blockiomadcompanyadminupdatecourses"></a>
# **BlockIomadCompanyAdminUpdateCourses**
> Object BlockIomadCompanyAdminUpdateCourses (BlockIomadCompanyAdminUpdateCoursesRequest blockIomadCompanyAdminUpdateCoursesRequest)

Update Iomad course settings

Update Iomad course settings

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class BlockIomadCompanyAdminUpdateCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BlockIomadCompanyAdminApi(config);
            var blockIomadCompanyAdminUpdateCoursesRequest = new BlockIomadCompanyAdminUpdateCoursesRequest(); // BlockIomadCompanyAdminUpdateCoursesRequest | 

            try
            {
                // Update Iomad course settings
                Object result = apiInstance.BlockIomadCompanyAdminUpdateCourses(blockIomadCompanyAdminUpdateCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUpdateCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BlockIomadCompanyAdminUpdateCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update Iomad course settings
    ApiResponse<Object> response = apiInstance.BlockIomadCompanyAdminUpdateCoursesWithHttpInfo(blockIomadCompanyAdminUpdateCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BlockIomadCompanyAdminApi.BlockIomadCompanyAdminUpdateCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **blockIomadCompanyAdminUpdateCoursesRequest** | [**BlockIomadCompanyAdminUpdateCoursesRequest**](BlockIomadCompanyAdminUpdateCoursesRequest.md) |  |  |

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
| **200** | Success or failure |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# BlockIomadCompanyAdminApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockIomadCompanyAdminAllocateLicenses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAllocateLicenses) | **POST** /block_iomad_company_admin_allocate_licenses | Allocate course licenses to a user |
| [**blockIomadCompanyAdminAssignCourses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAssignCourses) | **POST** /block_iomad_company_admin_assign_courses | Assign a course to a company |
| [**blockIomadCompanyAdminAssignUsers**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAssignUsers) | **POST** /block_iomad_company_admin_assign_users | Assign users to a company |
| [**blockIomadCompanyAdminCapabilityDeleteTemplate**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCapabilityDeleteTemplate) | **POST** /block_iomad_company_admin_capability_delete_template | Delete Iomad capabilities template |
| [**blockIomadCompanyAdminCheckToken**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCheckToken) | **POST** /block_iomad_company_admin_check_token | Check SSO token |
| [**blockIomadCompanyAdminCreateCompanies**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCreateCompanies) | **POST** /block_iomad_company_admin_create_companies | Create new Iomad companies |
| [**blockIomadCompanyAdminCreateLicenses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCreateLicenses) | **POST** /block_iomad_company_admin_create_licenses | Create company licenses |
| [**blockIomadCompanyAdminDeleteLicenses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminDeleteLicenses) | **POST** /block_iomad_company_admin_delete_licenses | Delete company licenses |
| [**blockIomadCompanyAdminEditCompanies**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEditCompanies) | **POST** /block_iomad_company_admin_edit_companies | Edit Iomad companies |
| [**blockIomadCompanyAdminEditLicenses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEditLicenses) | **POST** /block_iomad_company_admin_edit_licenses | Edit company license settings |
| [**blockIomadCompanyAdminEnrolUsers**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEnrolUsers) | **POST** /block_iomad_company_admin_enrol_users | Assign users onto courses |
| [**blockIomadCompanyAdminGetCompanies**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCompanies) | **POST** /block_iomad_company_admin_get_companies | Get all Iomad companies |
| [**blockIomadCompanyAdminGetCompanyCourses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCompanyCourses) | **POST** /block_iomad_company_admin_get_company_courses | Get Iomad company course allocations |
| [**blockIomadCompanyAdminGetCourseInfo**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCourseInfo) | **POST** /block_iomad_company_admin_get_course_info | Get Iomad course settings |
| [**blockIomadCompanyAdminGetDepartmentUsers**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetDepartmentUsers) | **POST** /block_iomad_company_admin_get_department_users | Get users within a department |
| [**blockIomadCompanyAdminGetDepartments**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetDepartments) | **POST** /block_iomad_company_admin_get_departments | Get all company departments |
| [**blockIomadCompanyAdminGetLicenseFromId**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetLicenseFromId) | **POST** /block_iomad_company_admin_get_license_from_id | Get licence data give the ID |
| [**blockIomadCompanyAdminGetLicenseInfo**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetLicenseInfo) | **POST** /block_iomad_company_admin_get_license_info | Get company license information |
| [**blockIomadCompanyAdminMoveUsers**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminMoveUsers) | **POST** /block_iomad_company_admin_move_users | Move users between departments |
| [**blockIomadCompanyAdminRestrictCapability**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminRestrictCapability) | **POST** /block_iomad_company_admin_restrict_capability | set/reset Iomad capability |
| [**blockIomadCompanyAdminSyncUsers**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminSyncUsers) | **POST** /block_iomad_company_admin_sync_users | Call update users to sync to external system |
| [**blockIomadCompanyAdminUnallocateLicenses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnallocateLicenses) | **POST** /block_iomad_company_admin_unallocate_licenses | Remove course licenses from users |
| [**blockIomadCompanyAdminUnassignCourses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnassignCourses) | **POST** /block_iomad_company_admin_unassign_courses | Unassign a course from a company |
| [**blockIomadCompanyAdminUnassignUsers**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnassignUsers) | **POST** /block_iomad_company_admin_unassign_users | Unassign users from a company |
| [**blockIomadCompanyAdminUpdateCourses**](BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUpdateCourses) | **POST** /block_iomad_company_admin_update_courses | Update Iomad course settings |


<a id="blockIomadCompanyAdminAllocateLicenses"></a>
# **blockIomadCompanyAdminAllocateLicenses**
> Object blockIomadCompanyAdminAllocateLicenses(blockIomadCompanyAdminAllocateLicensesRequest)

Allocate course licenses to a user

Allocate course licenses to a user

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminAllocateLicensesRequest blockIomadCompanyAdminAllocateLicensesRequest = new BlockIomadCompanyAdminAllocateLicensesRequest(); // BlockIomadCompanyAdminAllocateLicensesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminAllocateLicenses(blockIomadCompanyAdminAllocateLicensesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminAllocateLicenses");
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
| **blockIomadCompanyAdminAllocateLicensesRequest** | [**BlockIomadCompanyAdminAllocateLicensesRequest**](BlockIomadCompanyAdminAllocateLicensesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminAssignCourses"></a>
# **blockIomadCompanyAdminAssignCourses**
> Object blockIomadCompanyAdminAssignCourses(blockIomadCompanyAdminAssignCoursesRequest)

Assign a course to a company

Assign a course to a company

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminAssignCoursesRequest blockIomadCompanyAdminAssignCoursesRequest = new BlockIomadCompanyAdminAssignCoursesRequest(); // BlockIomadCompanyAdminAssignCoursesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminAssignCourses(blockIomadCompanyAdminAssignCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminAssignCourses");
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
| **blockIomadCompanyAdminAssignCoursesRequest** | [**BlockIomadCompanyAdminAssignCoursesRequest**](BlockIomadCompanyAdminAssignCoursesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminAssignUsers"></a>
# **blockIomadCompanyAdminAssignUsers**
> BlockIomadCompanyAdminAssignUsers200Response blockIomadCompanyAdminAssignUsers(blockIomadCompanyAdminAssignUsersRequest)

Assign users to a company

Assign users to a company

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminAssignUsersRequest blockIomadCompanyAdminAssignUsersRequest = new BlockIomadCompanyAdminAssignUsersRequest(); // BlockIomadCompanyAdminAssignUsersRequest | 
    try {
      BlockIomadCompanyAdminAssignUsers200Response result = apiInstance.blockIomadCompanyAdminAssignUsers(blockIomadCompanyAdminAssignUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminAssignUsers");
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
| **blockIomadCompanyAdminAssignUsersRequest** | [**BlockIomadCompanyAdminAssignUsersRequest**](BlockIomadCompanyAdminAssignUsersRequest.md)|  | |

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

<a id="blockIomadCompanyAdminCapabilityDeleteTemplate"></a>
# **blockIomadCompanyAdminCapabilityDeleteTemplate**
> Object blockIomadCompanyAdminCapabilityDeleteTemplate(blockIomadCompanyAdminCapabilityDeleteTemplateRequest)

Delete Iomad capabilities template

Delete Iomad capabilities template

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminCapabilityDeleteTemplateRequest blockIomadCompanyAdminCapabilityDeleteTemplateRequest = new BlockIomadCompanyAdminCapabilityDeleteTemplateRequest(); // BlockIomadCompanyAdminCapabilityDeleteTemplateRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminCapabilityDeleteTemplate(blockIomadCompanyAdminCapabilityDeleteTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminCapabilityDeleteTemplate");
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
| **blockIomadCompanyAdminCapabilityDeleteTemplateRequest** | [**BlockIomadCompanyAdminCapabilityDeleteTemplateRequest**](BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md)|  | |

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

<a id="blockIomadCompanyAdminCheckToken"></a>
# **blockIomadCompanyAdminCheckToken**
> BlockIomadCompanyAdminCheckToken200Response blockIomadCompanyAdminCheckToken(blockIomadCompanyAdminCheckTokenRequest)

Check SSO token

Check SSO token

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminCheckTokenRequest blockIomadCompanyAdminCheckTokenRequest = new BlockIomadCompanyAdminCheckTokenRequest(); // BlockIomadCompanyAdminCheckTokenRequest | 
    try {
      BlockIomadCompanyAdminCheckToken200Response result = apiInstance.blockIomadCompanyAdminCheckToken(blockIomadCompanyAdminCheckTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminCheckToken");
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
| **blockIomadCompanyAdminCheckTokenRequest** | [**BlockIomadCompanyAdminCheckTokenRequest**](BlockIomadCompanyAdminCheckTokenRequest.md)|  | |

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

<a id="blockIomadCompanyAdminCreateCompanies"></a>
# **blockIomadCompanyAdminCreateCompanies**
> Object blockIomadCompanyAdminCreateCompanies(blockIomadCompanyAdminCreateCompaniesRequest)

Create new Iomad companies

Create new Iomad companies

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminCreateCompaniesRequest blockIomadCompanyAdminCreateCompaniesRequest = new BlockIomadCompanyAdminCreateCompaniesRequest(); // BlockIomadCompanyAdminCreateCompaniesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminCreateCompanies(blockIomadCompanyAdminCreateCompaniesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminCreateCompanies");
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
| **blockIomadCompanyAdminCreateCompaniesRequest** | [**BlockIomadCompanyAdminCreateCompaniesRequest**](BlockIomadCompanyAdminCreateCompaniesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminCreateLicenses"></a>
# **blockIomadCompanyAdminCreateLicenses**
> Object blockIomadCompanyAdminCreateLicenses(blockIomadCompanyAdminCreateLicensesRequest)

Create company licenses

Create company licenses

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminCreateLicensesRequest blockIomadCompanyAdminCreateLicensesRequest = new BlockIomadCompanyAdminCreateLicensesRequest(); // BlockIomadCompanyAdminCreateLicensesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminCreateLicenses(blockIomadCompanyAdminCreateLicensesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminCreateLicenses");
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
| **blockIomadCompanyAdminCreateLicensesRequest** | [**BlockIomadCompanyAdminCreateLicensesRequest**](BlockIomadCompanyAdminCreateLicensesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminDeleteLicenses"></a>
# **blockIomadCompanyAdminDeleteLicenses**
> Object blockIomadCompanyAdminDeleteLicenses(blockIomadCompanyAdminDeleteLicensesRequest)

Delete company licenses

Delete company licenses

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminDeleteLicensesRequest blockIomadCompanyAdminDeleteLicensesRequest = new BlockIomadCompanyAdminDeleteLicensesRequest(); // BlockIomadCompanyAdminDeleteLicensesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminDeleteLicenses(blockIomadCompanyAdminDeleteLicensesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminDeleteLicenses");
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
| **blockIomadCompanyAdminDeleteLicensesRequest** | [**BlockIomadCompanyAdminDeleteLicensesRequest**](BlockIomadCompanyAdminDeleteLicensesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminEditCompanies"></a>
# **blockIomadCompanyAdminEditCompanies**
> Object blockIomadCompanyAdminEditCompanies(blockIomadCompanyAdminEditCompaniesRequest)

Edit Iomad companies

Edit Iomad companies

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminEditCompaniesRequest blockIomadCompanyAdminEditCompaniesRequest = new BlockIomadCompanyAdminEditCompaniesRequest(); // BlockIomadCompanyAdminEditCompaniesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminEditCompanies(blockIomadCompanyAdminEditCompaniesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminEditCompanies");
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
| **blockIomadCompanyAdminEditCompaniesRequest** | [**BlockIomadCompanyAdminEditCompaniesRequest**](BlockIomadCompanyAdminEditCompaniesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminEditLicenses"></a>
# **blockIomadCompanyAdminEditLicenses**
> Object blockIomadCompanyAdminEditLicenses(blockIomadCompanyAdminEditLicensesRequest)

Edit company license settings

Edit company license settings

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminEditLicensesRequest blockIomadCompanyAdminEditLicensesRequest = new BlockIomadCompanyAdminEditLicensesRequest(); // BlockIomadCompanyAdminEditLicensesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminEditLicenses(blockIomadCompanyAdminEditLicensesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminEditLicenses");
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
| **blockIomadCompanyAdminEditLicensesRequest** | [**BlockIomadCompanyAdminEditLicensesRequest**](BlockIomadCompanyAdminEditLicensesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminEnrolUsers"></a>
# **blockIomadCompanyAdminEnrolUsers**
> Object blockIomadCompanyAdminEnrolUsers(blockIomadCompanyAdminEnrolUsersRequest)

Assign users onto courses

Assign users onto courses

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminEnrolUsersRequest blockIomadCompanyAdminEnrolUsersRequest = new BlockIomadCompanyAdminEnrolUsersRequest(); // BlockIomadCompanyAdminEnrolUsersRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminEnrolUsers(blockIomadCompanyAdminEnrolUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminEnrolUsers");
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
| **blockIomadCompanyAdminEnrolUsersRequest** | [**BlockIomadCompanyAdminEnrolUsersRequest**](BlockIomadCompanyAdminEnrolUsersRequest.md)|  | |

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

<a id="blockIomadCompanyAdminGetCompanies"></a>
# **blockIomadCompanyAdminGetCompanies**
> BlockIomadCompanyAdminGetCompanies200Response blockIomadCompanyAdminGetCompanies(blockIomadCompanyAdminGetCompaniesRequest)

Get all Iomad companies

Get all Iomad companies

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminGetCompaniesRequest blockIomadCompanyAdminGetCompaniesRequest = new BlockIomadCompanyAdminGetCompaniesRequest(); // BlockIomadCompanyAdminGetCompaniesRequest | 
    try {
      BlockIomadCompanyAdminGetCompanies200Response result = apiInstance.blockIomadCompanyAdminGetCompanies(blockIomadCompanyAdminGetCompaniesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminGetCompanies");
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
| **blockIomadCompanyAdminGetCompaniesRequest** | [**BlockIomadCompanyAdminGetCompaniesRequest**](BlockIomadCompanyAdminGetCompaniesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminGetCompanyCourses"></a>
# **blockIomadCompanyAdminGetCompanyCourses**
> BlockIomadCompanyAdminGetCompanyCourses200Response blockIomadCompanyAdminGetCompanyCourses(blockIomadCompanyAdminGetCompanyCoursesRequest)

Get Iomad company course allocations

Get Iomad company course allocations

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminGetCompanyCoursesRequest blockIomadCompanyAdminGetCompanyCoursesRequest = new BlockIomadCompanyAdminGetCompanyCoursesRequest(); // BlockIomadCompanyAdminGetCompanyCoursesRequest | 
    try {
      BlockIomadCompanyAdminGetCompanyCourses200Response result = apiInstance.blockIomadCompanyAdminGetCompanyCourses(blockIomadCompanyAdminGetCompanyCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminGetCompanyCourses");
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
| **blockIomadCompanyAdminGetCompanyCoursesRequest** | [**BlockIomadCompanyAdminGetCompanyCoursesRequest**](BlockIomadCompanyAdminGetCompanyCoursesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminGetCourseInfo"></a>
# **blockIomadCompanyAdminGetCourseInfo**
> Object blockIomadCompanyAdminGetCourseInfo(blockIomadCompanyAdminGetCourseInfoRequest)

Get Iomad course settings

Get Iomad course settings

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminGetCourseInfoRequest blockIomadCompanyAdminGetCourseInfoRequest = new BlockIomadCompanyAdminGetCourseInfoRequest(); // BlockIomadCompanyAdminGetCourseInfoRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminGetCourseInfo(blockIomadCompanyAdminGetCourseInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminGetCourseInfo");
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
| **blockIomadCompanyAdminGetCourseInfoRequest** | [**BlockIomadCompanyAdminGetCourseInfoRequest**](BlockIomadCompanyAdminGetCourseInfoRequest.md)|  | |

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

<a id="blockIomadCompanyAdminGetDepartmentUsers"></a>
# **blockIomadCompanyAdminGetDepartmentUsers**
> BlockIomadCompanyAdminGetDepartmentUsers200Response blockIomadCompanyAdminGetDepartmentUsers(blockIomadCompanyAdminGetDepartmentUsersRequest)

Get users within a department

Get users within a department

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminGetDepartmentUsersRequest blockIomadCompanyAdminGetDepartmentUsersRequest = new BlockIomadCompanyAdminGetDepartmentUsersRequest(); // BlockIomadCompanyAdminGetDepartmentUsersRequest | 
    try {
      BlockIomadCompanyAdminGetDepartmentUsers200Response result = apiInstance.blockIomadCompanyAdminGetDepartmentUsers(blockIomadCompanyAdminGetDepartmentUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminGetDepartmentUsers");
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
| **blockIomadCompanyAdminGetDepartmentUsersRequest** | [**BlockIomadCompanyAdminGetDepartmentUsersRequest**](BlockIomadCompanyAdminGetDepartmentUsersRequest.md)|  | |

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

<a id="blockIomadCompanyAdminGetDepartments"></a>
# **blockIomadCompanyAdminGetDepartments**
> BlockIomadCompanyAdminGetDepartments200Response blockIomadCompanyAdminGetDepartments(blockIomadCompanyAdminGetDepartmentsRequest)

Get all company departments

Get all company departments

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminGetDepartmentsRequest blockIomadCompanyAdminGetDepartmentsRequest = new BlockIomadCompanyAdminGetDepartmentsRequest(); // BlockIomadCompanyAdminGetDepartmentsRequest | 
    try {
      BlockIomadCompanyAdminGetDepartments200Response result = apiInstance.blockIomadCompanyAdminGetDepartments(blockIomadCompanyAdminGetDepartmentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminGetDepartments");
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
| **blockIomadCompanyAdminGetDepartmentsRequest** | [**BlockIomadCompanyAdminGetDepartmentsRequest**](BlockIomadCompanyAdminGetDepartmentsRequest.md)|  | |

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

<a id="blockIomadCompanyAdminGetLicenseFromId"></a>
# **blockIomadCompanyAdminGetLicenseFromId**
> BlockIomadCompanyAdminGetLicenseFromId200Response blockIomadCompanyAdminGetLicenseFromId(blockIomadCompanyAdminGetLicenseFromIdRequest)

Get licence data give the ID

Get licence data give the ID

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminGetLicenseFromIdRequest blockIomadCompanyAdminGetLicenseFromIdRequest = new BlockIomadCompanyAdminGetLicenseFromIdRequest(); // BlockIomadCompanyAdminGetLicenseFromIdRequest | 
    try {
      BlockIomadCompanyAdminGetLicenseFromId200Response result = apiInstance.blockIomadCompanyAdminGetLicenseFromId(blockIomadCompanyAdminGetLicenseFromIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminGetLicenseFromId");
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
| **blockIomadCompanyAdminGetLicenseFromIdRequest** | [**BlockIomadCompanyAdminGetLicenseFromIdRequest**](BlockIomadCompanyAdminGetLicenseFromIdRequest.md)|  | |

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

<a id="blockIomadCompanyAdminGetLicenseInfo"></a>
# **blockIomadCompanyAdminGetLicenseInfo**
> BlockIomadCompanyAdminGetLicenseInfo200Response blockIomadCompanyAdminGetLicenseInfo(blockIomadCompanyAdminGetLicenseInfoRequest)

Get company license information

Get company license information

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminGetLicenseInfoRequest blockIomadCompanyAdminGetLicenseInfoRequest = new BlockIomadCompanyAdminGetLicenseInfoRequest(); // BlockIomadCompanyAdminGetLicenseInfoRequest | 
    try {
      BlockIomadCompanyAdminGetLicenseInfo200Response result = apiInstance.blockIomadCompanyAdminGetLicenseInfo(blockIomadCompanyAdminGetLicenseInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminGetLicenseInfo");
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
| **blockIomadCompanyAdminGetLicenseInfoRequest** | [**BlockIomadCompanyAdminGetLicenseInfoRequest**](BlockIomadCompanyAdminGetLicenseInfoRequest.md)|  | |

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

<a id="blockIomadCompanyAdminMoveUsers"></a>
# **blockIomadCompanyAdminMoveUsers**
> Object blockIomadCompanyAdminMoveUsers(blockIomadCompanyAdminMoveUsersRequest)

Move users between departments

Move users between departments

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminMoveUsersRequest blockIomadCompanyAdminMoveUsersRequest = new BlockIomadCompanyAdminMoveUsersRequest(); // BlockIomadCompanyAdminMoveUsersRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminMoveUsers(blockIomadCompanyAdminMoveUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminMoveUsers");
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
| **blockIomadCompanyAdminMoveUsersRequest** | [**BlockIomadCompanyAdminMoveUsersRequest**](BlockIomadCompanyAdminMoveUsersRequest.md)|  | |

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

<a id="blockIomadCompanyAdminRestrictCapability"></a>
# **blockIomadCompanyAdminRestrictCapability**
> Object blockIomadCompanyAdminRestrictCapability(blockIomadCompanyAdminRestrictCapabilityRequest)

set/reset Iomad capability

set/reset Iomad capability

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminRestrictCapabilityRequest blockIomadCompanyAdminRestrictCapabilityRequest = new BlockIomadCompanyAdminRestrictCapabilityRequest(); // BlockIomadCompanyAdminRestrictCapabilityRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminRestrictCapability(blockIomadCompanyAdminRestrictCapabilityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminRestrictCapability");
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
| **blockIomadCompanyAdminRestrictCapabilityRequest** | [**BlockIomadCompanyAdminRestrictCapabilityRequest**](BlockIomadCompanyAdminRestrictCapabilityRequest.md)|  | |

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

<a id="blockIomadCompanyAdminSyncUsers"></a>
# **blockIomadCompanyAdminSyncUsers**
> BlockIomadCompanyAdminSyncUsers200Response blockIomadCompanyAdminSyncUsers(blockIomadCompanyAdminSyncUsersRequest)

Call update users to sync to external system

Call update users to sync to external system

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminSyncUsersRequest blockIomadCompanyAdminSyncUsersRequest = new BlockIomadCompanyAdminSyncUsersRequest(); // BlockIomadCompanyAdminSyncUsersRequest | 
    try {
      BlockIomadCompanyAdminSyncUsers200Response result = apiInstance.blockIomadCompanyAdminSyncUsers(blockIomadCompanyAdminSyncUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminSyncUsers");
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
| **blockIomadCompanyAdminSyncUsersRequest** | [**BlockIomadCompanyAdminSyncUsersRequest**](BlockIomadCompanyAdminSyncUsersRequest.md)|  | |

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

<a id="blockIomadCompanyAdminUnallocateLicenses"></a>
# **blockIomadCompanyAdminUnallocateLicenses**
> Object blockIomadCompanyAdminUnallocateLicenses(blockIomadCompanyAdminUnallocateLicensesRequest)

Remove course licenses from users

Remove course licenses from users

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminUnallocateLicensesRequest blockIomadCompanyAdminUnallocateLicensesRequest = new BlockIomadCompanyAdminUnallocateLicensesRequest(); // BlockIomadCompanyAdminUnallocateLicensesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminUnallocateLicenses(blockIomadCompanyAdminUnallocateLicensesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminUnallocateLicenses");
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
| **blockIomadCompanyAdminUnallocateLicensesRequest** | [**BlockIomadCompanyAdminUnallocateLicensesRequest**](BlockIomadCompanyAdminUnallocateLicensesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminUnassignCourses"></a>
# **blockIomadCompanyAdminUnassignCourses**
> Object blockIomadCompanyAdminUnassignCourses(blockIomadCompanyAdminUnassignCoursesRequest)

Unassign a course from a company

Unassign a course from a company

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminUnassignCoursesRequest blockIomadCompanyAdminUnassignCoursesRequest = new BlockIomadCompanyAdminUnassignCoursesRequest(); // BlockIomadCompanyAdminUnassignCoursesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminUnassignCourses(blockIomadCompanyAdminUnassignCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminUnassignCourses");
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
| **blockIomadCompanyAdminUnassignCoursesRequest** | [**BlockIomadCompanyAdminUnassignCoursesRequest**](BlockIomadCompanyAdminUnassignCoursesRequest.md)|  | |

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

<a id="blockIomadCompanyAdminUnassignUsers"></a>
# **blockIomadCompanyAdminUnassignUsers**
> Object blockIomadCompanyAdminUnassignUsers(blockIomadCompanyAdminUnassignUsersRequest)

Unassign users from a company

Unassign users from a company

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminUnassignUsersRequest blockIomadCompanyAdminUnassignUsersRequest = new BlockIomadCompanyAdminUnassignUsersRequest(); // BlockIomadCompanyAdminUnassignUsersRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminUnassignUsers(blockIomadCompanyAdminUnassignUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminUnassignUsers");
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
| **blockIomadCompanyAdminUnassignUsersRequest** | [**BlockIomadCompanyAdminUnassignUsersRequest**](BlockIomadCompanyAdminUnassignUsersRequest.md)|  | |

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

<a id="blockIomadCompanyAdminUpdateCourses"></a>
# **blockIomadCompanyAdminUpdateCourses**
> Object blockIomadCompanyAdminUpdateCourses(blockIomadCompanyAdminUpdateCoursesRequest)

Update Iomad course settings

Update Iomad course settings

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.BlockIomadCompanyAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    BlockIomadCompanyAdminApi apiInstance = new BlockIomadCompanyAdminApi(defaultClient);
    BlockIomadCompanyAdminUpdateCoursesRequest blockIomadCompanyAdminUpdateCoursesRequest = new BlockIomadCompanyAdminUpdateCoursesRequest(); // BlockIomadCompanyAdminUpdateCoursesRequest | 
    try {
      Object result = apiInstance.blockIomadCompanyAdminUpdateCourses(blockIomadCompanyAdminUpdateCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockIomadCompanyAdminApi#blockIomadCompanyAdminUpdateCourses");
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
| **blockIomadCompanyAdminUpdateCoursesRequest** | [**BlockIomadCompanyAdminUpdateCoursesRequest**](BlockIomadCompanyAdminUpdateCoursesRequest.md)|  | |

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


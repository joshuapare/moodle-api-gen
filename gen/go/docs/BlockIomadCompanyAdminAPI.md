# \BlockIomadCompanyAdminAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BlockIomadCompanyAdminAllocateLicenses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminAllocateLicenses) | **Post** /block_iomad_company_admin_allocate_licenses | Allocate course licenses to a user
[**BlockIomadCompanyAdminAssignCourses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminAssignCourses) | **Post** /block_iomad_company_admin_assign_courses | Assign a course to a company
[**BlockIomadCompanyAdminAssignUsers**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminAssignUsers) | **Post** /block_iomad_company_admin_assign_users | Assign users to a company
[**BlockIomadCompanyAdminCapabilityDeleteTemplate**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminCapabilityDeleteTemplate) | **Post** /block_iomad_company_admin_capability_delete_template | Delete Iomad capabilities template
[**BlockIomadCompanyAdminCheckToken**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminCheckToken) | **Post** /block_iomad_company_admin_check_token | Check SSO token
[**BlockIomadCompanyAdminCreateCompanies**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminCreateCompanies) | **Post** /block_iomad_company_admin_create_companies | Create new Iomad companies
[**BlockIomadCompanyAdminCreateLicenses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminCreateLicenses) | **Post** /block_iomad_company_admin_create_licenses | Create company licenses
[**BlockIomadCompanyAdminDeleteLicenses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminDeleteLicenses) | **Post** /block_iomad_company_admin_delete_licenses | Delete company licenses
[**BlockIomadCompanyAdminEditCompanies**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminEditCompanies) | **Post** /block_iomad_company_admin_edit_companies | Edit Iomad companies
[**BlockIomadCompanyAdminEditLicenses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminEditLicenses) | **Post** /block_iomad_company_admin_edit_licenses | Edit company license settings
[**BlockIomadCompanyAdminEnrolUsers**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminEnrolUsers) | **Post** /block_iomad_company_admin_enrol_users | Assign users onto courses
[**BlockIomadCompanyAdminGetCompanies**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminGetCompanies) | **Post** /block_iomad_company_admin_get_companies | Get all Iomad companies
[**BlockIomadCompanyAdminGetCompanyCourses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminGetCompanyCourses) | **Post** /block_iomad_company_admin_get_company_courses | Get Iomad company course allocations
[**BlockIomadCompanyAdminGetCourseInfo**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminGetCourseInfo) | **Post** /block_iomad_company_admin_get_course_info | Get Iomad course settings
[**BlockIomadCompanyAdminGetDepartmentUsers**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminGetDepartmentUsers) | **Post** /block_iomad_company_admin_get_department_users | Get users within a department
[**BlockIomadCompanyAdminGetDepartments**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminGetDepartments) | **Post** /block_iomad_company_admin_get_departments | Get all company departments
[**BlockIomadCompanyAdminGetLicenseFromId**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminGetLicenseFromId) | **Post** /block_iomad_company_admin_get_license_from_id | Get licence data give the ID
[**BlockIomadCompanyAdminGetLicenseInfo**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminGetLicenseInfo) | **Post** /block_iomad_company_admin_get_license_info | Get company license information
[**BlockIomadCompanyAdminMoveUsers**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminMoveUsers) | **Post** /block_iomad_company_admin_move_users | Move users between departments
[**BlockIomadCompanyAdminRestrictCapability**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminRestrictCapability) | **Post** /block_iomad_company_admin_restrict_capability | set/reset Iomad capability
[**BlockIomadCompanyAdminSyncUsers**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminSyncUsers) | **Post** /block_iomad_company_admin_sync_users | Call update users to sync to external system
[**BlockIomadCompanyAdminUnallocateLicenses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminUnallocateLicenses) | **Post** /block_iomad_company_admin_unallocate_licenses | Remove course licenses from users
[**BlockIomadCompanyAdminUnassignCourses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminUnassignCourses) | **Post** /block_iomad_company_admin_unassign_courses | Unassign a course from a company
[**BlockIomadCompanyAdminUnassignUsers**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminUnassignUsers) | **Post** /block_iomad_company_admin_unassign_users | Unassign users from a company
[**BlockIomadCompanyAdminUpdateCourses**](BlockIomadCompanyAdminAPI.md#BlockIomadCompanyAdminUpdateCourses) | **Post** /block_iomad_company_admin_update_courses | Update Iomad course settings



## BlockIomadCompanyAdminAllocateLicenses

> map[string]interface{} BlockIomadCompanyAdminAllocateLicenses(ctx).BlockIomadCompanyAdminAllocateLicensesRequest(blockIomadCompanyAdminAllocateLicensesRequest).Execute()

Allocate course licenses to a user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminAllocateLicensesRequest := *openapiclient.NewBlockIomadCompanyAdminAllocateLicensesRequest([]openapiclient.BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner{*openapiclient.NewBlockIomadCompanyAdminAllocateLicensesRequestLicensesInner()}) // BlockIomadCompanyAdminAllocateLicensesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAllocateLicenses(context.Background()).BlockIomadCompanyAdminAllocateLicensesRequest(blockIomadCompanyAdminAllocateLicensesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAllocateLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminAllocateLicenses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAllocateLicenses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminAllocateLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminAllocateLicensesRequest** | [**BlockIomadCompanyAdminAllocateLicensesRequest**](BlockIomadCompanyAdminAllocateLicensesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminAssignCourses

> map[string]interface{} BlockIomadCompanyAdminAssignCourses(ctx).BlockIomadCompanyAdminAssignCoursesRequest(blockIomadCompanyAdminAssignCoursesRequest).Execute()

Assign a course to a company



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminAssignCoursesRequest := *openapiclient.NewBlockIomadCompanyAdminAssignCoursesRequest([]openapiclient.BlockIomadCompanyAdminAssignCoursesRequestCoursesInner{*openapiclient.NewBlockIomadCompanyAdminAssignCoursesRequestCoursesInner()}) // BlockIomadCompanyAdminAssignCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAssignCourses(context.Background()).BlockIomadCompanyAdminAssignCoursesRequest(blockIomadCompanyAdminAssignCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAssignCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminAssignCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAssignCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminAssignCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminAssignCoursesRequest** | [**BlockIomadCompanyAdminAssignCoursesRequest**](BlockIomadCompanyAdminAssignCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminAssignUsers

> BlockIomadCompanyAdminAssignUsers200Response BlockIomadCompanyAdminAssignUsers(ctx).BlockIomadCompanyAdminAssignUsersRequest(blockIomadCompanyAdminAssignUsersRequest).Execute()

Assign users to a company



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminAssignUsersRequest := *openapiclient.NewBlockIomadCompanyAdminAssignUsersRequest([]openapiclient.BlockIomadCompanyAdminAssignUsersRequestUsersInner{*openapiclient.NewBlockIomadCompanyAdminAssignUsersRequestUsersInner()}) // BlockIomadCompanyAdminAssignUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAssignUsers(context.Background()).BlockIomadCompanyAdminAssignUsersRequest(blockIomadCompanyAdminAssignUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAssignUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminAssignUsers`: BlockIomadCompanyAdminAssignUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminAssignUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminAssignUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminAssignUsersRequest** | [**BlockIomadCompanyAdminAssignUsersRequest**](BlockIomadCompanyAdminAssignUsersRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminAssignUsers200Response**](BlockIomadCompanyAdminAssignUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminCapabilityDeleteTemplate

> map[string]interface{} BlockIomadCompanyAdminCapabilityDeleteTemplate(ctx).BlockIomadCompanyAdminCapabilityDeleteTemplateRequest(blockIomadCompanyAdminCapabilityDeleteTemplateRequest).Execute()

Delete Iomad capabilities template



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminCapabilityDeleteTemplateRequest := *openapiclient.NewBlockIomadCompanyAdminCapabilityDeleteTemplateRequest(int32(123)) // BlockIomadCompanyAdminCapabilityDeleteTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCapabilityDeleteTemplate(context.Background()).BlockIomadCompanyAdminCapabilityDeleteTemplateRequest(blockIomadCompanyAdminCapabilityDeleteTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCapabilityDeleteTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminCapabilityDeleteTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCapabilityDeleteTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminCapabilityDeleteTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminCapabilityDeleteTemplateRequest** | [**BlockIomadCompanyAdminCapabilityDeleteTemplateRequest**](BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminCheckToken

> BlockIomadCompanyAdminCheckToken200Response BlockIomadCompanyAdminCheckToken(ctx).BlockIomadCompanyAdminCheckTokenRequest(blockIomadCompanyAdminCheckTokenRequest).Execute()

Check SSO token



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminCheckTokenRequest := *openapiclient.NewBlockIomadCompanyAdminCheckTokenRequest(*openapiclient.NewBlockIomadCompanyAdminCheckTokenRequestKey0("Token_example", "Username_example")) // BlockIomadCompanyAdminCheckTokenRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCheckToken(context.Background()).BlockIomadCompanyAdminCheckTokenRequest(blockIomadCompanyAdminCheckTokenRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCheckToken``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminCheckToken`: BlockIomadCompanyAdminCheckToken200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCheckToken`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminCheckTokenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminCheckTokenRequest** | [**BlockIomadCompanyAdminCheckTokenRequest**](BlockIomadCompanyAdminCheckTokenRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminCheckToken200Response**](BlockIomadCompanyAdminCheckToken200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminCreateCompanies

> map[string]interface{} BlockIomadCompanyAdminCreateCompanies(ctx).BlockIomadCompanyAdminCreateCompaniesRequest(blockIomadCompanyAdminCreateCompaniesRequest).Execute()

Create new Iomad companies



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminCreateCompaniesRequest := *openapiclient.NewBlockIomadCompanyAdminCreateCompaniesRequest([]openapiclient.BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner{*openapiclient.NewBlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner()}) // BlockIomadCompanyAdminCreateCompaniesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCreateCompanies(context.Background()).BlockIomadCompanyAdminCreateCompaniesRequest(blockIomadCompanyAdminCreateCompaniesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCreateCompanies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminCreateCompanies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCreateCompanies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminCreateCompaniesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminCreateCompaniesRequest** | [**BlockIomadCompanyAdminCreateCompaniesRequest**](BlockIomadCompanyAdminCreateCompaniesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminCreateLicenses

> map[string]interface{} BlockIomadCompanyAdminCreateLicenses(ctx).BlockIomadCompanyAdminCreateLicensesRequest(blockIomadCompanyAdminCreateLicensesRequest).Execute()

Create company licenses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminCreateLicensesRequest := *openapiclient.NewBlockIomadCompanyAdminCreateLicensesRequest([]openapiclient.BlockIomadCompanyAdminCreateLicensesRequestLicensesInner{*openapiclient.NewBlockIomadCompanyAdminCreateLicensesRequestLicensesInner()}) // BlockIomadCompanyAdminCreateLicensesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCreateLicenses(context.Background()).BlockIomadCompanyAdminCreateLicensesRequest(blockIomadCompanyAdminCreateLicensesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCreateLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminCreateLicenses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminCreateLicenses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminCreateLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminCreateLicensesRequest** | [**BlockIomadCompanyAdminCreateLicensesRequest**](BlockIomadCompanyAdminCreateLicensesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminDeleteLicenses

> map[string]interface{} BlockIomadCompanyAdminDeleteLicenses(ctx).BlockIomadCompanyAdminDeleteLicensesRequest(blockIomadCompanyAdminDeleteLicensesRequest).Execute()

Delete company licenses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminDeleteLicensesRequest := *openapiclient.NewBlockIomadCompanyAdminDeleteLicensesRequest([]openapiclient.BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner{*openapiclient.NewBlockIomadCompanyAdminDeleteLicensesRequestLicensesInner()}) // BlockIomadCompanyAdminDeleteLicensesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminDeleteLicenses(context.Background()).BlockIomadCompanyAdminDeleteLicensesRequest(blockIomadCompanyAdminDeleteLicensesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminDeleteLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminDeleteLicenses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminDeleteLicenses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminDeleteLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminDeleteLicensesRequest** | [**BlockIomadCompanyAdminDeleteLicensesRequest**](BlockIomadCompanyAdminDeleteLicensesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminEditCompanies

> map[string]interface{} BlockIomadCompanyAdminEditCompanies(ctx).BlockIomadCompanyAdminEditCompaniesRequest(blockIomadCompanyAdminEditCompaniesRequest).Execute()

Edit Iomad companies



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminEditCompaniesRequest := *openapiclient.NewBlockIomadCompanyAdminEditCompaniesRequest([]openapiclient.BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner{*openapiclient.NewBlockIomadCompanyAdminEditCompaniesRequestCompaniesInner()}) // BlockIomadCompanyAdminEditCompaniesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEditCompanies(context.Background()).BlockIomadCompanyAdminEditCompaniesRequest(blockIomadCompanyAdminEditCompaniesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEditCompanies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminEditCompanies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEditCompanies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminEditCompaniesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminEditCompaniesRequest** | [**BlockIomadCompanyAdminEditCompaniesRequest**](BlockIomadCompanyAdminEditCompaniesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminEditLicenses

> map[string]interface{} BlockIomadCompanyAdminEditLicenses(ctx).BlockIomadCompanyAdminEditLicensesRequest(blockIomadCompanyAdminEditLicensesRequest).Execute()

Edit company license settings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminEditLicensesRequest := *openapiclient.NewBlockIomadCompanyAdminEditLicensesRequest([]openapiclient.BlockIomadCompanyAdminEditLicensesRequestLicensesInner{*openapiclient.NewBlockIomadCompanyAdminEditLicensesRequestLicensesInner()}) // BlockIomadCompanyAdminEditLicensesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEditLicenses(context.Background()).BlockIomadCompanyAdminEditLicensesRequest(blockIomadCompanyAdminEditLicensesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEditLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminEditLicenses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEditLicenses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminEditLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminEditLicensesRequest** | [**BlockIomadCompanyAdminEditLicensesRequest**](BlockIomadCompanyAdminEditLicensesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminEnrolUsers

> map[string]interface{} BlockIomadCompanyAdminEnrolUsers(ctx).BlockIomadCompanyAdminEnrolUsersRequest(blockIomadCompanyAdminEnrolUsersRequest).Execute()

Assign users onto courses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminEnrolUsersRequest := *openapiclient.NewBlockIomadCompanyAdminEnrolUsersRequest([]openapiclient.BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner{*openapiclient.NewBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner()}) // BlockIomadCompanyAdminEnrolUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEnrolUsers(context.Background()).BlockIomadCompanyAdminEnrolUsersRequest(blockIomadCompanyAdminEnrolUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEnrolUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminEnrolUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminEnrolUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminEnrolUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminEnrolUsersRequest** | [**BlockIomadCompanyAdminEnrolUsersRequest**](BlockIomadCompanyAdminEnrolUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminGetCompanies

> BlockIomadCompanyAdminGetCompanies200Response BlockIomadCompanyAdminGetCompanies(ctx).BlockIomadCompanyAdminGetCompaniesRequest(blockIomadCompanyAdminGetCompaniesRequest).Execute()

Get all Iomad companies



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminGetCompaniesRequest := *openapiclient.NewBlockIomadCompanyAdminGetCompaniesRequest([]openapiclient.BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner{*openapiclient.NewBlockIomadCompanyAdminGetCompaniesRequestCriteriaInner()}) // BlockIomadCompanyAdminGetCompaniesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCompanies(context.Background()).BlockIomadCompanyAdminGetCompaniesRequest(blockIomadCompanyAdminGetCompaniesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCompanies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminGetCompanies`: BlockIomadCompanyAdminGetCompanies200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCompanies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminGetCompaniesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminGetCompaniesRequest** | [**BlockIomadCompanyAdminGetCompaniesRequest**](BlockIomadCompanyAdminGetCompaniesRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminGetCompanies200Response**](BlockIomadCompanyAdminGetCompanies200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminGetCompanyCourses

> BlockIomadCompanyAdminGetCompanyCourses200Response BlockIomadCompanyAdminGetCompanyCourses(ctx).BlockIomadCompanyAdminGetCompanyCoursesRequest(blockIomadCompanyAdminGetCompanyCoursesRequest).Execute()

Get Iomad company course allocations



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminGetCompanyCoursesRequest := *openapiclient.NewBlockIomadCompanyAdminGetCompanyCoursesRequest([]openapiclient.BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner{*openapiclient.NewBlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner()}) // BlockIomadCompanyAdminGetCompanyCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCompanyCourses(context.Background()).BlockIomadCompanyAdminGetCompanyCoursesRequest(blockIomadCompanyAdminGetCompanyCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCompanyCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminGetCompanyCourses`: BlockIomadCompanyAdminGetCompanyCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCompanyCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminGetCompanyCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminGetCompanyCoursesRequest** | [**BlockIomadCompanyAdminGetCompanyCoursesRequest**](BlockIomadCompanyAdminGetCompanyCoursesRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminGetCompanyCourses200Response**](BlockIomadCompanyAdminGetCompanyCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminGetCourseInfo

> map[string]interface{} BlockIomadCompanyAdminGetCourseInfo(ctx).BlockIomadCompanyAdminGetCourseInfoRequest(blockIomadCompanyAdminGetCourseInfoRequest).Execute()

Get Iomad course settings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminGetCourseInfoRequest := *openapiclient.NewBlockIomadCompanyAdminGetCourseInfoRequest() // BlockIomadCompanyAdminGetCourseInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCourseInfo(context.Background()).BlockIomadCompanyAdminGetCourseInfoRequest(blockIomadCompanyAdminGetCourseInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCourseInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminGetCourseInfo`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetCourseInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminGetCourseInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminGetCourseInfoRequest** | [**BlockIomadCompanyAdminGetCourseInfoRequest**](BlockIomadCompanyAdminGetCourseInfoRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminGetDepartmentUsers

> BlockIomadCompanyAdminGetDepartmentUsers200Response BlockIomadCompanyAdminGetDepartmentUsers(ctx).BlockIomadCompanyAdminGetDepartmentUsersRequest(blockIomadCompanyAdminGetDepartmentUsersRequest).Execute()

Get users within a department



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminGetDepartmentUsersRequest := *openapiclient.NewBlockIomadCompanyAdminGetDepartmentUsersRequest() // BlockIomadCompanyAdminGetDepartmentUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetDepartmentUsers(context.Background()).BlockIomadCompanyAdminGetDepartmentUsersRequest(blockIomadCompanyAdminGetDepartmentUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetDepartmentUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminGetDepartmentUsers`: BlockIomadCompanyAdminGetDepartmentUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetDepartmentUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminGetDepartmentUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminGetDepartmentUsersRequest** | [**BlockIomadCompanyAdminGetDepartmentUsersRequest**](BlockIomadCompanyAdminGetDepartmentUsersRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminGetDepartmentUsers200Response**](BlockIomadCompanyAdminGetDepartmentUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminGetDepartments

> BlockIomadCompanyAdminGetDepartments200Response BlockIomadCompanyAdminGetDepartments(ctx).BlockIomadCompanyAdminGetDepartmentsRequest(blockIomadCompanyAdminGetDepartmentsRequest).Execute()

Get all company departments



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminGetDepartmentsRequest := *openapiclient.NewBlockIomadCompanyAdminGetDepartmentsRequest([]openapiclient.BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner{*openapiclient.NewBlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner()}) // BlockIomadCompanyAdminGetDepartmentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetDepartments(context.Background()).BlockIomadCompanyAdminGetDepartmentsRequest(blockIomadCompanyAdminGetDepartmentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetDepartments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminGetDepartments`: BlockIomadCompanyAdminGetDepartments200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetDepartments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminGetDepartmentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminGetDepartmentsRequest** | [**BlockIomadCompanyAdminGetDepartmentsRequest**](BlockIomadCompanyAdminGetDepartmentsRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminGetDepartments200Response**](BlockIomadCompanyAdminGetDepartments200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminGetLicenseFromId

> BlockIomadCompanyAdminGetLicenseFromId200Response BlockIomadCompanyAdminGetLicenseFromId(ctx).BlockIomadCompanyAdminGetLicenseFromIdRequest(blockIomadCompanyAdminGetLicenseFromIdRequest).Execute()

Get licence data give the ID



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminGetLicenseFromIdRequest := *openapiclient.NewBlockIomadCompanyAdminGetLicenseFromIdRequest(int32(123)) // BlockIomadCompanyAdminGetLicenseFromIdRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetLicenseFromId(context.Background()).BlockIomadCompanyAdminGetLicenseFromIdRequest(blockIomadCompanyAdminGetLicenseFromIdRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetLicenseFromId``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminGetLicenseFromId`: BlockIomadCompanyAdminGetLicenseFromId200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetLicenseFromId`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminGetLicenseFromIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminGetLicenseFromIdRequest** | [**BlockIomadCompanyAdminGetLicenseFromIdRequest**](BlockIomadCompanyAdminGetLicenseFromIdRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminGetLicenseFromId200Response**](BlockIomadCompanyAdminGetLicenseFromId200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminGetLicenseInfo

> BlockIomadCompanyAdminGetLicenseInfo200Response BlockIomadCompanyAdminGetLicenseInfo(ctx).BlockIomadCompanyAdminGetLicenseInfoRequest(blockIomadCompanyAdminGetLicenseInfoRequest).Execute()

Get company license information



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminGetLicenseInfoRequest := *openapiclient.NewBlockIomadCompanyAdminGetLicenseInfoRequest([]openapiclient.BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner{*openapiclient.NewBlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner()}) // BlockIomadCompanyAdminGetLicenseInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetLicenseInfo(context.Background()).BlockIomadCompanyAdminGetLicenseInfoRequest(blockIomadCompanyAdminGetLicenseInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetLicenseInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminGetLicenseInfo`: BlockIomadCompanyAdminGetLicenseInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminGetLicenseInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminGetLicenseInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminGetLicenseInfoRequest** | [**BlockIomadCompanyAdminGetLicenseInfoRequest**](BlockIomadCompanyAdminGetLicenseInfoRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminGetLicenseInfo200Response**](BlockIomadCompanyAdminGetLicenseInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminMoveUsers

> map[string]interface{} BlockIomadCompanyAdminMoveUsers(ctx).BlockIomadCompanyAdminMoveUsersRequest(blockIomadCompanyAdminMoveUsersRequest).Execute()

Move users between departments



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminMoveUsersRequest := *openapiclient.NewBlockIomadCompanyAdminMoveUsersRequest([]openapiclient.BlockIomadCompanyAdminMoveUsersRequestUsersInner{*openapiclient.NewBlockIomadCompanyAdminMoveUsersRequestUsersInner()}) // BlockIomadCompanyAdminMoveUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminMoveUsers(context.Background()).BlockIomadCompanyAdminMoveUsersRequest(blockIomadCompanyAdminMoveUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminMoveUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminMoveUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminMoveUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminMoveUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminMoveUsersRequest** | [**BlockIomadCompanyAdminMoveUsersRequest**](BlockIomadCompanyAdminMoveUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminRestrictCapability

> map[string]interface{} BlockIomadCompanyAdminRestrictCapability(ctx).BlockIomadCompanyAdminRestrictCapabilityRequest(blockIomadCompanyAdminRestrictCapabilityRequest).Execute()

set/reset Iomad capability



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminRestrictCapabilityRequest := *openapiclient.NewBlockIomadCompanyAdminRestrictCapabilityRequest(false, "Capability_example", int32(123), int32(123)) // BlockIomadCompanyAdminRestrictCapabilityRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminRestrictCapability(context.Background()).BlockIomadCompanyAdminRestrictCapabilityRequest(blockIomadCompanyAdminRestrictCapabilityRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminRestrictCapability``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminRestrictCapability`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminRestrictCapability`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminRestrictCapabilityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminRestrictCapabilityRequest** | [**BlockIomadCompanyAdminRestrictCapabilityRequest**](BlockIomadCompanyAdminRestrictCapabilityRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminSyncUsers

> BlockIomadCompanyAdminSyncUsers200Response BlockIomadCompanyAdminSyncUsers(ctx).BlockIomadCompanyAdminSyncUsersRequest(blockIomadCompanyAdminSyncUsersRequest).Execute()

Call update users to sync to external system



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminSyncUsersRequest := *openapiclient.NewBlockIomadCompanyAdminSyncUsersRequest("Source_example") // BlockIomadCompanyAdminSyncUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminSyncUsers(context.Background()).BlockIomadCompanyAdminSyncUsersRequest(blockIomadCompanyAdminSyncUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminSyncUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminSyncUsers`: BlockIomadCompanyAdminSyncUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminSyncUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminSyncUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminSyncUsersRequest** | [**BlockIomadCompanyAdminSyncUsersRequest**](BlockIomadCompanyAdminSyncUsersRequest.md) |  | 

### Return type

[**BlockIomadCompanyAdminSyncUsers200Response**](BlockIomadCompanyAdminSyncUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminUnallocateLicenses

> map[string]interface{} BlockIomadCompanyAdminUnallocateLicenses(ctx).BlockIomadCompanyAdminUnallocateLicensesRequest(blockIomadCompanyAdminUnallocateLicensesRequest).Execute()

Remove course licenses from users



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminUnallocateLicensesRequest := *openapiclient.NewBlockIomadCompanyAdminUnallocateLicensesRequest([]openapiclient.BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner{*openapiclient.NewBlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner()}) // BlockIomadCompanyAdminUnallocateLicensesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnallocateLicenses(context.Background()).BlockIomadCompanyAdminUnallocateLicensesRequest(blockIomadCompanyAdminUnallocateLicensesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnallocateLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminUnallocateLicenses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnallocateLicenses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminUnallocateLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminUnallocateLicensesRequest** | [**BlockIomadCompanyAdminUnallocateLicensesRequest**](BlockIomadCompanyAdminUnallocateLicensesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminUnassignCourses

> map[string]interface{} BlockIomadCompanyAdminUnassignCourses(ctx).BlockIomadCompanyAdminUnassignCoursesRequest(blockIomadCompanyAdminUnassignCoursesRequest).Execute()

Unassign a course from a company



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminUnassignCoursesRequest := *openapiclient.NewBlockIomadCompanyAdminUnassignCoursesRequest([]openapiclient.BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner{*openapiclient.NewBlockIomadCompanyAdminUnassignCoursesRequestCoursesInner()}) // BlockIomadCompanyAdminUnassignCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnassignCourses(context.Background()).BlockIomadCompanyAdminUnassignCoursesRequest(blockIomadCompanyAdminUnassignCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnassignCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminUnassignCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnassignCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminUnassignCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminUnassignCoursesRequest** | [**BlockIomadCompanyAdminUnassignCoursesRequest**](BlockIomadCompanyAdminUnassignCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminUnassignUsers

> map[string]interface{} BlockIomadCompanyAdminUnassignUsers(ctx).BlockIomadCompanyAdminUnassignUsersRequest(blockIomadCompanyAdminUnassignUsersRequest).Execute()

Unassign users from a company



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminUnassignUsersRequest := *openapiclient.NewBlockIomadCompanyAdminUnassignUsersRequest([]openapiclient.BlockIomadCompanyAdminUnassignUsersRequestUsersInner{*openapiclient.NewBlockIomadCompanyAdminUnassignUsersRequestUsersInner()}) // BlockIomadCompanyAdminUnassignUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnassignUsers(context.Background()).BlockIomadCompanyAdminUnassignUsersRequest(blockIomadCompanyAdminUnassignUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnassignUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminUnassignUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUnassignUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminUnassignUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminUnassignUsersRequest** | [**BlockIomadCompanyAdminUnassignUsersRequest**](BlockIomadCompanyAdminUnassignUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BlockIomadCompanyAdminUpdateCourses

> map[string]interface{} BlockIomadCompanyAdminUpdateCourses(ctx).BlockIomadCompanyAdminUpdateCoursesRequest(blockIomadCompanyAdminUpdateCoursesRequest).Execute()

Update Iomad course settings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	blockIomadCompanyAdminUpdateCoursesRequest := *openapiclient.NewBlockIomadCompanyAdminUpdateCoursesRequest([]openapiclient.BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner{*openapiclient.NewBlockIomadCompanyAdminUpdateCoursesRequestCoursesInner()}) // BlockIomadCompanyAdminUpdateCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUpdateCourses(context.Background()).BlockIomadCompanyAdminUpdateCoursesRequest(blockIomadCompanyAdminUpdateCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUpdateCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BlockIomadCompanyAdminUpdateCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `BlockIomadCompanyAdminAPI.BlockIomadCompanyAdminUpdateCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBlockIomadCompanyAdminUpdateCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockIomadCompanyAdminUpdateCoursesRequest** | [**BlockIomadCompanyAdminUpdateCoursesRequest**](BlockIomadCompanyAdminUpdateCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


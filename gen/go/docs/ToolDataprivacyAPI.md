# \ToolDataprivacyAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolDataprivacyApproveDataRequest**](ToolDataprivacyAPI.md#ToolDataprivacyApproveDataRequest) | **Post** /tool_dataprivacy_approve_data_request | Approve a data request
[**ToolDataprivacyBulkApproveDataRequests**](ToolDataprivacyAPI.md#ToolDataprivacyBulkApproveDataRequests) | **Post** /tool_dataprivacy_bulk_approve_data_requests | Bulk approve data requests
[**ToolDataprivacyBulkDenyDataRequests**](ToolDataprivacyAPI.md#ToolDataprivacyBulkDenyDataRequests) | **Post** /tool_dataprivacy_bulk_deny_data_requests | Bulk deny data requests
[**ToolDataprivacyCancelDataRequest**](ToolDataprivacyAPI.md#ToolDataprivacyCancelDataRequest) | **Post** /tool_dataprivacy_cancel_data_request | Cancel the data request made by the user
[**ToolDataprivacyConfirmContextsForDeletion**](ToolDataprivacyAPI.md#ToolDataprivacyConfirmContextsForDeletion) | **Post** /tool_dataprivacy_confirm_contexts_for_deletion | Mark the selected expired contexts as confirmed for deletion
[**ToolDataprivacyContactDpo**](ToolDataprivacyAPI.md#ToolDataprivacyContactDpo) | **Post** /tool_dataprivacy_contact_dpo | Contact the site Data Protection Officer(s)
[**ToolDataprivacyCreateCategoryForm**](ToolDataprivacyAPI.md#ToolDataprivacyCreateCategoryForm) | **Post** /tool_dataprivacy_create_category_form | Adds a data category
[**ToolDataprivacyCreatePurposeForm**](ToolDataprivacyAPI.md#ToolDataprivacyCreatePurposeForm) | **Post** /tool_dataprivacy_create_purpose_form | Adds a data purpose
[**ToolDataprivacyDeleteCategory**](ToolDataprivacyAPI.md#ToolDataprivacyDeleteCategory) | **Post** /tool_dataprivacy_delete_category | Deletes an existing data category
[**ToolDataprivacyDeletePurpose**](ToolDataprivacyAPI.md#ToolDataprivacyDeletePurpose) | **Post** /tool_dataprivacy_delete_purpose | Deletes an existing data purpose
[**ToolDataprivacyDenyDataRequest**](ToolDataprivacyAPI.md#ToolDataprivacyDenyDataRequest) | **Post** /tool_dataprivacy_deny_data_request | Deny a data request
[**ToolDataprivacyGetActivityOptions**](ToolDataprivacyAPI.md#ToolDataprivacyGetActivityOptions) | **Post** /tool_dataprivacy_get_activity_options | Fetches a list of activity options
[**ToolDataprivacyGetCategoryOptions**](ToolDataprivacyAPI.md#ToolDataprivacyGetCategoryOptions) | **Post** /tool_dataprivacy_get_category_options | Fetches a list of data category options
[**ToolDataprivacyGetDataRequest**](ToolDataprivacyAPI.md#ToolDataprivacyGetDataRequest) | **Post** /tool_dataprivacy_get_data_request | Fetch the details of a user&#39;s data request
[**ToolDataprivacyGetPurposeOptions**](ToolDataprivacyAPI.md#ToolDataprivacyGetPurposeOptions) | **Post** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options
[**ToolDataprivacyGetUsers**](ToolDataprivacyAPI.md#ToolDataprivacyGetUsers) | **Post** /tool_dataprivacy_get_users | Fetches a list of users
[**ToolDataprivacyMarkComplete**](ToolDataprivacyAPI.md#ToolDataprivacyMarkComplete) | **Post** /tool_dataprivacy_mark_complete | Mark a user&#39;s general enquiry as complete
[**ToolDataprivacySetContextDefaults**](ToolDataprivacyAPI.md#ToolDataprivacySetContextDefaults) | **Post** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin)
[**ToolDataprivacySetContextForm**](ToolDataprivacyAPI.md#ToolDataprivacySetContextForm) | **Post** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context
[**ToolDataprivacySetContextlevelForm**](ToolDataprivacyAPI.md#ToolDataprivacySetContextlevelForm) | **Post** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level
[**ToolDataprivacySubmitSelectedCoursesForm**](ToolDataprivacyAPI.md#ToolDataprivacySubmitSelectedCoursesForm) | **Post** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export
[**ToolDataprivacyTreeExtraBranches**](ToolDataprivacyAPI.md#ToolDataprivacyTreeExtraBranches) | **Post** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree



## ToolDataprivacyApproveDataRequest

> CoreContentbankRenameContent200Response ToolDataprivacyApproveDataRequest(ctx).ToolDataprivacyApproveDataRequestRequest(toolDataprivacyApproveDataRequestRequest).Execute()

Approve a data request



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
	toolDataprivacyApproveDataRequestRequest := *openapiclient.NewToolDataprivacyApproveDataRequestRequest(int32(123)) // ToolDataprivacyApproveDataRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyApproveDataRequest(context.Background()).ToolDataprivacyApproveDataRequestRequest(toolDataprivacyApproveDataRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyApproveDataRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyApproveDataRequest`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyApproveDataRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyApproveDataRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyApproveDataRequestRequest** | [**ToolDataprivacyApproveDataRequestRequest**](ToolDataprivacyApproveDataRequestRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyBulkApproveDataRequests

> CoreContentbankRenameContent200Response ToolDataprivacyBulkApproveDataRequests(ctx).ToolDataprivacyBulkApproveDataRequestsRequest(toolDataprivacyBulkApproveDataRequestsRequest).Execute()

Bulk approve data requests



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
	toolDataprivacyBulkApproveDataRequestsRequest := *openapiclient.NewToolDataprivacyBulkApproveDataRequestsRequest([]map[string]interface{}{map[string]interface{}(123)}) // ToolDataprivacyBulkApproveDataRequestsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyBulkApproveDataRequests(context.Background()).ToolDataprivacyBulkApproveDataRequestsRequest(toolDataprivacyBulkApproveDataRequestsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyBulkApproveDataRequests``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyBulkApproveDataRequests`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyBulkApproveDataRequests`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyBulkApproveDataRequestsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyBulkApproveDataRequestsRequest** | [**ToolDataprivacyBulkApproveDataRequestsRequest**](ToolDataprivacyBulkApproveDataRequestsRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyBulkDenyDataRequests

> CoreContentbankRenameContent200Response ToolDataprivacyBulkDenyDataRequests(ctx).ToolDataprivacyBulkDenyDataRequestsRequest(toolDataprivacyBulkDenyDataRequestsRequest).Execute()

Bulk deny data requests



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
	toolDataprivacyBulkDenyDataRequestsRequest := *openapiclient.NewToolDataprivacyBulkDenyDataRequestsRequest([]map[string]interface{}{map[string]interface{}(123)}) // ToolDataprivacyBulkDenyDataRequestsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyBulkDenyDataRequests(context.Background()).ToolDataprivacyBulkDenyDataRequestsRequest(toolDataprivacyBulkDenyDataRequestsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyBulkDenyDataRequests``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyBulkDenyDataRequests`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyBulkDenyDataRequests`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyBulkDenyDataRequestsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyBulkDenyDataRequestsRequest** | [**ToolDataprivacyBulkDenyDataRequestsRequest**](ToolDataprivacyBulkDenyDataRequestsRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyCancelDataRequest

> CoreContentbankRenameContent200Response ToolDataprivacyCancelDataRequest(ctx).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()

Cancel the data request made by the user



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
	toolDataprivacyCancelDataRequestRequest := *openapiclient.NewToolDataprivacyCancelDataRequestRequest(int32(123)) // ToolDataprivacyCancelDataRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyCancelDataRequest(context.Background()).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyCancelDataRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyCancelDataRequest`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyCancelDataRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyCancelDataRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyConfirmContextsForDeletion

> ToolDataprivacyConfirmContextsForDeletion200Response ToolDataprivacyConfirmContextsForDeletion(ctx).ToolDataprivacyConfirmContextsForDeletionRequest(toolDataprivacyConfirmContextsForDeletionRequest).Execute()

Mark the selected expired contexts as confirmed for deletion



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
	toolDataprivacyConfirmContextsForDeletionRequest := *openapiclient.NewToolDataprivacyConfirmContextsForDeletionRequest() // ToolDataprivacyConfirmContextsForDeletionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyConfirmContextsForDeletion(context.Background()).ToolDataprivacyConfirmContextsForDeletionRequest(toolDataprivacyConfirmContextsForDeletionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyConfirmContextsForDeletion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyConfirmContextsForDeletion`: ToolDataprivacyConfirmContextsForDeletion200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyConfirmContextsForDeletion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyConfirmContextsForDeletionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyConfirmContextsForDeletionRequest** | [**ToolDataprivacyConfirmContextsForDeletionRequest**](ToolDataprivacyConfirmContextsForDeletionRequest.md) |  | 

### Return type

[**ToolDataprivacyConfirmContextsForDeletion200Response**](ToolDataprivacyConfirmContextsForDeletion200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyContactDpo

> CoreContentbankRenameContent200Response ToolDataprivacyContactDpo(ctx).ToolDataprivacyContactDpoRequest(toolDataprivacyContactDpoRequest).Execute()

Contact the site Data Protection Officer(s)



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
	toolDataprivacyContactDpoRequest := *openapiclient.NewToolDataprivacyContactDpoRequest("Message_example") // ToolDataprivacyContactDpoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyContactDpo(context.Background()).ToolDataprivacyContactDpoRequest(toolDataprivacyContactDpoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyContactDpo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyContactDpo`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyContactDpo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyContactDpoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyContactDpoRequest** | [**ToolDataprivacyContactDpoRequest**](ToolDataprivacyContactDpoRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyCreateCategoryForm

> ToolDataprivacyCreateCategoryForm200Response ToolDataprivacyCreateCategoryForm(ctx).ToolDataprivacyCreateCategoryFormRequest(toolDataprivacyCreateCategoryFormRequest).Execute()

Adds a data category



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
	toolDataprivacyCreateCategoryFormRequest := *openapiclient.NewToolDataprivacyCreateCategoryFormRequest("Jsonformdata_example") // ToolDataprivacyCreateCategoryFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyCreateCategoryForm(context.Background()).ToolDataprivacyCreateCategoryFormRequest(toolDataprivacyCreateCategoryFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyCreateCategoryForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyCreateCategoryForm`: ToolDataprivacyCreateCategoryForm200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyCreateCategoryForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyCreateCategoryFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyCreateCategoryFormRequest** | [**ToolDataprivacyCreateCategoryFormRequest**](ToolDataprivacyCreateCategoryFormRequest.md) |  | 

### Return type

[**ToolDataprivacyCreateCategoryForm200Response**](ToolDataprivacyCreateCategoryForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyCreatePurposeForm

> ToolDataprivacyCreatePurposeForm200Response ToolDataprivacyCreatePurposeForm(ctx).ToolDataprivacyCreatePurposeFormRequest(toolDataprivacyCreatePurposeFormRequest).Execute()

Adds a data purpose



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
	toolDataprivacyCreatePurposeFormRequest := *openapiclient.NewToolDataprivacyCreatePurposeFormRequest("Jsonformdata_example") // ToolDataprivacyCreatePurposeFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyCreatePurposeForm(context.Background()).ToolDataprivacyCreatePurposeFormRequest(toolDataprivacyCreatePurposeFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyCreatePurposeForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyCreatePurposeForm`: ToolDataprivacyCreatePurposeForm200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyCreatePurposeForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyCreatePurposeFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyCreatePurposeFormRequest** | [**ToolDataprivacyCreatePurposeFormRequest**](ToolDataprivacyCreatePurposeFormRequest.md) |  | 

### Return type

[**ToolDataprivacyCreatePurposeForm200Response**](ToolDataprivacyCreatePurposeForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyDeleteCategory

> CoreContentbankRenameContent200Response ToolDataprivacyDeleteCategory(ctx).ToolDataprivacyDeleteCategoryRequest(toolDataprivacyDeleteCategoryRequest).Execute()

Deletes an existing data category



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
	toolDataprivacyDeleteCategoryRequest := *openapiclient.NewToolDataprivacyDeleteCategoryRequest(int32(123)) // ToolDataprivacyDeleteCategoryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyDeleteCategory(context.Background()).ToolDataprivacyDeleteCategoryRequest(toolDataprivacyDeleteCategoryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyDeleteCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyDeleteCategory`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyDeleteCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyDeleteCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyDeleteCategoryRequest** | [**ToolDataprivacyDeleteCategoryRequest**](ToolDataprivacyDeleteCategoryRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyDeletePurpose

> CoreContentbankRenameContent200Response ToolDataprivacyDeletePurpose(ctx).ToolDataprivacyDeletePurposeRequest(toolDataprivacyDeletePurposeRequest).Execute()

Deletes an existing data purpose



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
	toolDataprivacyDeletePurposeRequest := *openapiclient.NewToolDataprivacyDeletePurposeRequest(int32(123)) // ToolDataprivacyDeletePurposeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyDeletePurpose(context.Background()).ToolDataprivacyDeletePurposeRequest(toolDataprivacyDeletePurposeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyDeletePurpose``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyDeletePurpose`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyDeletePurpose`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyDeletePurposeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyDeletePurposeRequest** | [**ToolDataprivacyDeletePurposeRequest**](ToolDataprivacyDeletePurposeRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyDenyDataRequest

> CoreContentbankRenameContent200Response ToolDataprivacyDenyDataRequest(ctx).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()

Deny a data request



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
	toolDataprivacyCancelDataRequestRequest := *openapiclient.NewToolDataprivacyCancelDataRequestRequest(int32(123)) // ToolDataprivacyCancelDataRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyDenyDataRequest(context.Background()).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyDenyDataRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyDenyDataRequest`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyDenyDataRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyDenyDataRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyGetActivityOptions

> ToolDataprivacyGetActivityOptions200Response ToolDataprivacyGetActivityOptions(ctx).ToolDataprivacyGetActivityOptionsRequest(toolDataprivacyGetActivityOptionsRequest).Execute()

Fetches a list of activity options



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
	toolDataprivacyGetActivityOptionsRequest := *openapiclient.NewToolDataprivacyGetActivityOptionsRequest() // ToolDataprivacyGetActivityOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyGetActivityOptions(context.Background()).ToolDataprivacyGetActivityOptionsRequest(toolDataprivacyGetActivityOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyGetActivityOptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyGetActivityOptions`: ToolDataprivacyGetActivityOptions200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyGetActivityOptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyGetActivityOptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyGetActivityOptionsRequest** | [**ToolDataprivacyGetActivityOptionsRequest**](ToolDataprivacyGetActivityOptionsRequest.md) |  | 

### Return type

[**ToolDataprivacyGetActivityOptions200Response**](ToolDataprivacyGetActivityOptions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyGetCategoryOptions

> ToolDataprivacyGetCategoryOptions200Response ToolDataprivacyGetCategoryOptions(ctx).ToolDataprivacyGetCategoryOptionsRequest(toolDataprivacyGetCategoryOptionsRequest).Execute()

Fetches a list of data category options



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
	toolDataprivacyGetCategoryOptionsRequest := *openapiclient.NewToolDataprivacyGetCategoryOptionsRequest() // ToolDataprivacyGetCategoryOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyGetCategoryOptions(context.Background()).ToolDataprivacyGetCategoryOptionsRequest(toolDataprivacyGetCategoryOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyGetCategoryOptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyGetCategoryOptions`: ToolDataprivacyGetCategoryOptions200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyGetCategoryOptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyGetCategoryOptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyGetCategoryOptionsRequest** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md) |  | 

### Return type

[**ToolDataprivacyGetCategoryOptions200Response**](ToolDataprivacyGetCategoryOptions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyGetDataRequest

> ToolDataprivacyGetDataRequest200Response ToolDataprivacyGetDataRequest(ctx).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()

Fetch the details of a user's data request



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
	toolDataprivacyCancelDataRequestRequest := *openapiclient.NewToolDataprivacyCancelDataRequestRequest(int32(123)) // ToolDataprivacyCancelDataRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyGetDataRequest(context.Background()).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyGetDataRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyGetDataRequest`: ToolDataprivacyGetDataRequest200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyGetDataRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyGetDataRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | 

### Return type

[**ToolDataprivacyGetDataRequest200Response**](ToolDataprivacyGetDataRequest200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyGetPurposeOptions

> ToolDataprivacyGetPurposeOptions200Response ToolDataprivacyGetPurposeOptions(ctx).ToolDataprivacyGetCategoryOptionsRequest(toolDataprivacyGetCategoryOptionsRequest).Execute()

Fetches a list of data storage purpose options



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
	toolDataprivacyGetCategoryOptionsRequest := *openapiclient.NewToolDataprivacyGetCategoryOptionsRequest() // ToolDataprivacyGetCategoryOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyGetPurposeOptions(context.Background()).ToolDataprivacyGetCategoryOptionsRequest(toolDataprivacyGetCategoryOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyGetPurposeOptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyGetPurposeOptions`: ToolDataprivacyGetPurposeOptions200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyGetPurposeOptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyGetPurposeOptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyGetCategoryOptionsRequest** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md) |  | 

### Return type

[**ToolDataprivacyGetPurposeOptions200Response**](ToolDataprivacyGetPurposeOptions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyGetUsers

> map[string]interface{} ToolDataprivacyGetUsers(ctx).ToolDataprivacyGetUsersRequest(toolDataprivacyGetUsersRequest).Execute()

Fetches a list of users



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
	toolDataprivacyGetUsersRequest := *openapiclient.NewToolDataprivacyGetUsersRequest("Query_example") // ToolDataprivacyGetUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyGetUsers(context.Background()).ToolDataprivacyGetUsersRequest(toolDataprivacyGetUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyGetUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyGetUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyGetUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyGetUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyGetUsersRequest** | [**ToolDataprivacyGetUsersRequest**](ToolDataprivacyGetUsersRequest.md) |  | 

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


## ToolDataprivacyMarkComplete

> CoreContentbankRenameContent200Response ToolDataprivacyMarkComplete(ctx).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()

Mark a user's general enquiry as complete



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
	toolDataprivacyCancelDataRequestRequest := *openapiclient.NewToolDataprivacyCancelDataRequestRequest(int32(123)) // ToolDataprivacyCancelDataRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyMarkComplete(context.Background()).ToolDataprivacyCancelDataRequestRequest(toolDataprivacyCancelDataRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyMarkComplete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyMarkComplete`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyMarkComplete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyMarkCompleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyCancelDataRequestRequest** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacySetContextDefaults

> ToolDataprivacySetContextDefaults200Response ToolDataprivacySetContextDefaults(ctx).ToolDataprivacySetContextDefaultsRequest(toolDataprivacySetContextDefaultsRequest).Execute()

Updates the default category and purpose for a given context level (and optionally, a plugin)



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
	toolDataprivacySetContextDefaultsRequest := *openapiclient.NewToolDataprivacySetContextDefaultsRequest(int32(123), int32(123), int32(123)) // ToolDataprivacySetContextDefaultsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacySetContextDefaults(context.Background()).ToolDataprivacySetContextDefaultsRequest(toolDataprivacySetContextDefaultsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacySetContextDefaults``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacySetContextDefaults`: ToolDataprivacySetContextDefaults200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacySetContextDefaults`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacySetContextDefaultsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacySetContextDefaultsRequest** | [**ToolDataprivacySetContextDefaultsRequest**](ToolDataprivacySetContextDefaultsRequest.md) |  | 

### Return type

[**ToolDataprivacySetContextDefaults200Response**](ToolDataprivacySetContextDefaults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacySetContextForm

> ToolDataprivacySetContextForm200Response ToolDataprivacySetContextForm(ctx).ToolDataprivacySetContextFormRequest(toolDataprivacySetContextFormRequest).Execute()

Sets purpose and category for a specific context



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
	toolDataprivacySetContextFormRequest := *openapiclient.NewToolDataprivacySetContextFormRequest("Jsonformdata_example") // ToolDataprivacySetContextFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacySetContextForm(context.Background()).ToolDataprivacySetContextFormRequest(toolDataprivacySetContextFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacySetContextForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacySetContextForm`: ToolDataprivacySetContextForm200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacySetContextForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacySetContextFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacySetContextFormRequest** | [**ToolDataprivacySetContextFormRequest**](ToolDataprivacySetContextFormRequest.md) |  | 

### Return type

[**ToolDataprivacySetContextForm200Response**](ToolDataprivacySetContextForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacySetContextlevelForm

> ToolDataprivacySetContextlevelForm200Response ToolDataprivacySetContextlevelForm(ctx).ToolDataprivacySetContextlevelFormRequest(toolDataprivacySetContextlevelFormRequest).Execute()

Sets purpose and category across a context level



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
	toolDataprivacySetContextlevelFormRequest := *openapiclient.NewToolDataprivacySetContextlevelFormRequest("Jsonformdata_example") // ToolDataprivacySetContextlevelFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacySetContextlevelForm(context.Background()).ToolDataprivacySetContextlevelFormRequest(toolDataprivacySetContextlevelFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacySetContextlevelForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacySetContextlevelForm`: ToolDataprivacySetContextlevelForm200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacySetContextlevelForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacySetContextlevelFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacySetContextlevelFormRequest** | [**ToolDataprivacySetContextlevelFormRequest**](ToolDataprivacySetContextlevelFormRequest.md) |  | 

### Return type

[**ToolDataprivacySetContextlevelForm200Response**](ToolDataprivacySetContextlevelForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacySubmitSelectedCoursesForm

> CoreContentbankRenameContent200Response ToolDataprivacySubmitSelectedCoursesForm(ctx).ToolDataprivacySubmitSelectedCoursesFormRequest(toolDataprivacySubmitSelectedCoursesFormRequest).Execute()

Save list of selected courses for export



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
	toolDataprivacySubmitSelectedCoursesFormRequest := *openapiclient.NewToolDataprivacySubmitSelectedCoursesFormRequest("Jsonformdata_example", int32(123)) // ToolDataprivacySubmitSelectedCoursesFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacySubmitSelectedCoursesForm(context.Background()).ToolDataprivacySubmitSelectedCoursesFormRequest(toolDataprivacySubmitSelectedCoursesFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacySubmitSelectedCoursesForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacySubmitSelectedCoursesForm`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacySubmitSelectedCoursesForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacySubmitSelectedCoursesFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacySubmitSelectedCoursesFormRequest** | [**ToolDataprivacySubmitSelectedCoursesFormRequest**](ToolDataprivacySubmitSelectedCoursesFormRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolDataprivacyTreeExtraBranches

> ToolDataprivacyTreeExtraBranches200Response ToolDataprivacyTreeExtraBranches(ctx).ToolDataprivacyTreeExtraBranchesRequest(toolDataprivacyTreeExtraBranchesRequest).Execute()

Return branches for the context tree



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
	toolDataprivacyTreeExtraBranchesRequest := *openapiclient.NewToolDataprivacyTreeExtraBranchesRequest(int32(123), "Element_example") // ToolDataprivacyTreeExtraBranchesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolDataprivacyAPI.ToolDataprivacyTreeExtraBranches(context.Background()).ToolDataprivacyTreeExtraBranchesRequest(toolDataprivacyTreeExtraBranchesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolDataprivacyAPI.ToolDataprivacyTreeExtraBranches``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolDataprivacyTreeExtraBranches`: ToolDataprivacyTreeExtraBranches200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolDataprivacyAPI.ToolDataprivacyTreeExtraBranches`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolDataprivacyTreeExtraBranchesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolDataprivacyTreeExtraBranchesRequest** | [**ToolDataprivacyTreeExtraBranchesRequest**](ToolDataprivacyTreeExtraBranchesRequest.md) |  | 

### Return type

[**ToolDataprivacyTreeExtraBranches200Response**](ToolDataprivacyTreeExtraBranches200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


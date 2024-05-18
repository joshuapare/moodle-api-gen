# \ModDataAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModDataAddEntry**](ModDataAPI.md#ModDataAddEntry) | **Post** /mod_data_add_entry | Adds a new entry.
[**ModDataApproveEntry**](ModDataAPI.md#ModDataApproveEntry) | **Post** /mod_data_approve_entry | Approves or unapproves an entry.
[**ModDataDeleteEntry**](ModDataAPI.md#ModDataDeleteEntry) | **Post** /mod_data_delete_entry | Deletes an entry.
[**ModDataDeleteSavedPreset**](ModDataAPI.md#ModDataDeleteSavedPreset) | **Post** /mod_data_delete_saved_preset | Delete site user preset.
[**ModDataGetDataAccessInformation**](ModDataAPI.md#ModDataGetDataAccessInformation) | **Post** /mod_data_get_data_access_information | Return access information for a given database.
[**ModDataGetDatabasesByCourses**](ModDataAPI.md#ModDataGetDatabasesByCourses) | **Post** /mod_data_get_databases_by_courses | Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
[**ModDataGetEntries**](ModDataAPI.md#ModDataGetEntries) | **Post** /mod_data_get_entries | Return the complete list of entries of the given database.
[**ModDataGetEntry**](ModDataAPI.md#ModDataGetEntry) | **Post** /mod_data_get_entry | Return one entry record from the database, including contents optionally.
[**ModDataGetFields**](ModDataAPI.md#ModDataGetFields) | **Post** /mod_data_get_fields | Return the list of configured fields for the given database.
[**ModDataGetMappingInformation**](ModDataAPI.md#ModDataGetMappingInformation) | **Post** /mod_data_get_mapping_information | Get importing information
[**ModDataSearchEntries**](ModDataAPI.md#ModDataSearchEntries) | **Post** /mod_data_search_entries | Search for entries in the given database.
[**ModDataUpdateEntry**](ModDataAPI.md#ModDataUpdateEntry) | **Post** /mod_data_update_entry | Updates an existing entry.
[**ModDataViewDatabase**](ModDataAPI.md#ModDataViewDatabase) | **Post** /mod_data_view_database | Simulate the view.php web interface data: trigger events, completion, etc...



## ModDataAddEntry

> ModDataAddEntry200Response ModDataAddEntry(ctx).ModDataAddEntryRequest(modDataAddEntryRequest).Execute()

Adds a new entry.



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
	modDataAddEntryRequest := *openapiclient.NewModDataAddEntryRequest([]openapiclient.ModDataAddEntryRequestDataInner{*openapiclient.NewModDataAddEntryRequestDataInner()}, int32(123)) // ModDataAddEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataAddEntry(context.Background()).ModDataAddEntryRequest(modDataAddEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataAddEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataAddEntry`: ModDataAddEntry200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataAddEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataAddEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataAddEntryRequest** | [**ModDataAddEntryRequest**](ModDataAddEntryRequest.md) |  | 

### Return type

[**ModDataAddEntry200Response**](ModDataAddEntry200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataApproveEntry

> CoreCalendarDeleteSubscription200Response ModDataApproveEntry(ctx).ModDataApproveEntryRequest(modDataApproveEntryRequest).Execute()

Approves or unapproves an entry.



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
	modDataApproveEntryRequest := *openapiclient.NewModDataApproveEntryRequest(int32(123)) // ModDataApproveEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataApproveEntry(context.Background()).ModDataApproveEntryRequest(modDataApproveEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataApproveEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataApproveEntry`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataApproveEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataApproveEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataApproveEntryRequest** | [**ModDataApproveEntryRequest**](ModDataApproveEntryRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataDeleteEntry

> ModDataDeleteEntry200Response ModDataDeleteEntry(ctx).ModDataDeleteEntryRequest(modDataDeleteEntryRequest).Execute()

Deletes an entry.



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
	modDataDeleteEntryRequest := *openapiclient.NewModDataDeleteEntryRequest(int32(123)) // ModDataDeleteEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataDeleteEntry(context.Background()).ModDataDeleteEntryRequest(modDataDeleteEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataDeleteEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataDeleteEntry`: ModDataDeleteEntry200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataDeleteEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataDeleteEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataDeleteEntryRequest** | [**ModDataDeleteEntryRequest**](ModDataDeleteEntryRequest.md) |  | 

### Return type

[**ModDataDeleteEntry200Response**](ModDataDeleteEntry200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataDeleteSavedPreset

> CoreContentbankRenameContent200Response ModDataDeleteSavedPreset(ctx).ModDataDeleteSavedPresetRequest(modDataDeleteSavedPresetRequest).Execute()

Delete site user preset.



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
	modDataDeleteSavedPresetRequest := *openapiclient.NewModDataDeleteSavedPresetRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // ModDataDeleteSavedPresetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataDeleteSavedPreset(context.Background()).ModDataDeleteSavedPresetRequest(modDataDeleteSavedPresetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataDeleteSavedPreset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataDeleteSavedPreset`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataDeleteSavedPreset`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataDeleteSavedPresetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataDeleteSavedPresetRequest** | [**ModDataDeleteSavedPresetRequest**](ModDataDeleteSavedPresetRequest.md) |  | 

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


## ModDataGetDataAccessInformation

> ModDataGetDataAccessInformation200Response ModDataGetDataAccessInformation(ctx).ModDataGetDataAccessInformationRequest(modDataGetDataAccessInformationRequest).Execute()

Return access information for a given database.



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
	modDataGetDataAccessInformationRequest := *openapiclient.NewModDataGetDataAccessInformationRequest(int32(123)) // ModDataGetDataAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataGetDataAccessInformation(context.Background()).ModDataGetDataAccessInformationRequest(modDataGetDataAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataGetDataAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataGetDataAccessInformation`: ModDataGetDataAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataGetDataAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataGetDataAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataGetDataAccessInformationRequest** | [**ModDataGetDataAccessInformationRequest**](ModDataGetDataAccessInformationRequest.md) |  | 

### Return type

[**ModDataGetDataAccessInformation200Response**](ModDataGetDataAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataGetDatabasesByCourses

> ModDataGetDatabasesByCourses200Response ModDataGetDatabasesByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.



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
	modChatGetChatsByCoursesRequest := *openapiclient.NewModChatGetChatsByCoursesRequest() // ModChatGetChatsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataGetDatabasesByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataGetDatabasesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataGetDatabasesByCourses`: ModDataGetDatabasesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataGetDatabasesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataGetDatabasesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModDataGetDatabasesByCourses200Response**](ModDataGetDatabasesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataGetEntries

> ModDataGetEntries200Response ModDataGetEntries(ctx).ModDataGetEntriesRequest(modDataGetEntriesRequest).Execute()

Return the complete list of entries of the given database.



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
	modDataGetEntriesRequest := *openapiclient.NewModDataGetEntriesRequest(int32(123)) // ModDataGetEntriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataGetEntries(context.Background()).ModDataGetEntriesRequest(modDataGetEntriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataGetEntries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataGetEntries`: ModDataGetEntries200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataGetEntries`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataGetEntriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataGetEntriesRequest** | [**ModDataGetEntriesRequest**](ModDataGetEntriesRequest.md) |  | 

### Return type

[**ModDataGetEntries200Response**](ModDataGetEntries200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataGetEntry

> ModDataGetEntry200Response ModDataGetEntry(ctx).ModDataGetEntryRequest(modDataGetEntryRequest).Execute()

Return one entry record from the database, including contents optionally.



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
	modDataGetEntryRequest := *openapiclient.NewModDataGetEntryRequest(int32(123)) // ModDataGetEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataGetEntry(context.Background()).ModDataGetEntryRequest(modDataGetEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataGetEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataGetEntry`: ModDataGetEntry200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataGetEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataGetEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataGetEntryRequest** | [**ModDataGetEntryRequest**](ModDataGetEntryRequest.md) |  | 

### Return type

[**ModDataGetEntry200Response**](ModDataGetEntry200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataGetFields

> ModDataGetFields200Response ModDataGetFields(ctx).ModDataGetFieldsRequest(modDataGetFieldsRequest).Execute()

Return the list of configured fields for the given database.



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
	modDataGetFieldsRequest := *openapiclient.NewModDataGetFieldsRequest(int32(123)) // ModDataGetFieldsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataGetFields(context.Background()).ModDataGetFieldsRequest(modDataGetFieldsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataGetFields``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataGetFields`: ModDataGetFields200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataGetFields`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataGetFieldsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataGetFieldsRequest** | [**ModDataGetFieldsRequest**](ModDataGetFieldsRequest.md) |  | 

### Return type

[**ModDataGetFields200Response**](ModDataGetFields200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataGetMappingInformation

> ModDataGetMappingInformation200Response ModDataGetMappingInformation(ctx).ModDataGetMappingInformationRequest(modDataGetMappingInformationRequest).Execute()

Get importing information



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
	modDataGetMappingInformationRequest := *openapiclient.NewModDataGetMappingInformationRequest(int32(123), "Importedpreset_example") // ModDataGetMappingInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataGetMappingInformation(context.Background()).ModDataGetMappingInformationRequest(modDataGetMappingInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataGetMappingInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataGetMappingInformation`: ModDataGetMappingInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataGetMappingInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataGetMappingInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataGetMappingInformationRequest** | [**ModDataGetMappingInformationRequest**](ModDataGetMappingInformationRequest.md) |  | 

### Return type

[**ModDataGetMappingInformation200Response**](ModDataGetMappingInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataSearchEntries

> ModDataSearchEntries200Response ModDataSearchEntries(ctx).ModDataSearchEntriesRequest(modDataSearchEntriesRequest).Execute()

Search for entries in the given database.



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
	modDataSearchEntriesRequest := *openapiclient.NewModDataSearchEntriesRequest(int32(123)) // ModDataSearchEntriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataSearchEntries(context.Background()).ModDataSearchEntriesRequest(modDataSearchEntriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataSearchEntries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataSearchEntries`: ModDataSearchEntries200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataSearchEntries`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataSearchEntriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataSearchEntriesRequest** | [**ModDataSearchEntriesRequest**](ModDataSearchEntriesRequest.md) |  | 

### Return type

[**ModDataSearchEntries200Response**](ModDataSearchEntries200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataUpdateEntry

> ModDataUpdateEntry200Response ModDataUpdateEntry(ctx).ModDataUpdateEntryRequest(modDataUpdateEntryRequest).Execute()

Updates an existing entry.



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
	modDataUpdateEntryRequest := *openapiclient.NewModDataUpdateEntryRequest([]openapiclient.ModDataUpdateEntryRequestDataInner{*openapiclient.NewModDataUpdateEntryRequestDataInner()}, int32(123)) // ModDataUpdateEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataUpdateEntry(context.Background()).ModDataUpdateEntryRequest(modDataUpdateEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataUpdateEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataUpdateEntry`: ModDataUpdateEntry200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataUpdateEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataUpdateEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataUpdateEntryRequest** | [**ModDataUpdateEntryRequest**](ModDataUpdateEntryRequest.md) |  | 

### Return type

[**ModDataUpdateEntry200Response**](ModDataUpdateEntry200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModDataViewDatabase

> CoreCalendarDeleteSubscription200Response ModDataViewDatabase(ctx).ModDataViewDatabaseRequest(modDataViewDatabaseRequest).Execute()

Simulate the view.php web interface data: trigger events, completion, etc...



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
	modDataViewDatabaseRequest := *openapiclient.NewModDataViewDatabaseRequest(int32(123)) // ModDataViewDatabaseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModDataAPI.ModDataViewDatabase(context.Background()).ModDataViewDatabaseRequest(modDataViewDatabaseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModDataAPI.ModDataViewDatabase``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModDataViewDatabase`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModDataAPI.ModDataViewDatabase`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModDataViewDatabaseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modDataViewDatabaseRequest** | [**ModDataViewDatabaseRequest**](ModDataViewDatabaseRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


# \ModScormAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModScormGetScormAccessInformation**](ModScormAPI.md#ModScormGetScormAccessInformation) | **Post** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm.
[**ModScormGetScormAttemptCount**](ModScormAPI.md#ModScormGetScormAttemptCount) | **Post** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM.
[**ModScormGetScormScoTracks**](ModScormAPI.md#ModScormGetScormScoTracks) | **Post** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number
[**ModScormGetScormScoes**](ModScormAPI.md#ModScormGetScormScoes) | **Post** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id
[**ModScormGetScormUserData**](ModScormAPI.md#ModScormGetScormUserData) | **Post** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values
[**ModScormGetScormsByCourses**](ModScormAPI.md#ModScormGetScormsByCourses) | **Post** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
[**ModScormInsertScormTracks**](ModScormAPI.md#ModScormInsertScormTracks) | **Post** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
[**ModScormLaunchSco**](ModScormAPI.md#ModScormLaunchSco) | **Post** /mod_scorm_launch_sco | Trigger the SCO launched event.
[**ModScormViewScorm**](ModScormAPI.md#ModScormViewScorm) | **Post** /mod_scorm_view_scorm | Trigger the course module viewed event.



## ModScormGetScormAccessInformation

> ModScormGetScormAccessInformation200Response ModScormGetScormAccessInformation(ctx).ModScormGetScormAccessInformationRequest(modScormGetScormAccessInformationRequest).Execute()

Return capabilities information for a given scorm.



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
	modScormGetScormAccessInformationRequest := *openapiclient.NewModScormGetScormAccessInformationRequest(int32(123)) // ModScormGetScormAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormGetScormAccessInformation(context.Background()).ModScormGetScormAccessInformationRequest(modScormGetScormAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormGetScormAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormGetScormAccessInformation`: ModScormGetScormAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormGetScormAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormGetScormAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormGetScormAccessInformationRequest** | [**ModScormGetScormAccessInformationRequest**](ModScormGetScormAccessInformationRequest.md) |  | 

### Return type

[**ModScormGetScormAccessInformation200Response**](ModScormGetScormAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModScormGetScormAttemptCount

> ModScormGetScormAttemptCount200Response ModScormGetScormAttemptCount(ctx).ModScormGetScormAttemptCountRequest(modScormGetScormAttemptCountRequest).Execute()

Return the number of attempts done by a user in the given SCORM.



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
	modScormGetScormAttemptCountRequest := *openapiclient.NewModScormGetScormAttemptCountRequest(int32(123), int32(123)) // ModScormGetScormAttemptCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormGetScormAttemptCount(context.Background()).ModScormGetScormAttemptCountRequest(modScormGetScormAttemptCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormGetScormAttemptCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormGetScormAttemptCount`: ModScormGetScormAttemptCount200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormGetScormAttemptCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormGetScormAttemptCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormGetScormAttemptCountRequest** | [**ModScormGetScormAttemptCountRequest**](ModScormGetScormAttemptCountRequest.md) |  | 

### Return type

[**ModScormGetScormAttemptCount200Response**](ModScormGetScormAttemptCount200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModScormGetScormScoTracks

> ModScormGetScormScoTracks200Response ModScormGetScormScoTracks(ctx).ModScormGetScormScoTracksRequest(modScormGetScormScoTracksRequest).Execute()

Retrieves SCO tracking data for the given user id and attempt number



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
	modScormGetScormScoTracksRequest := *openapiclient.NewModScormGetScormScoTracksRequest(int32(123), int32(123)) // ModScormGetScormScoTracksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormGetScormScoTracks(context.Background()).ModScormGetScormScoTracksRequest(modScormGetScormScoTracksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormGetScormScoTracks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormGetScormScoTracks`: ModScormGetScormScoTracks200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormGetScormScoTracks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormGetScormScoTracksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormGetScormScoTracksRequest** | [**ModScormGetScormScoTracksRequest**](ModScormGetScormScoTracksRequest.md) |  | 

### Return type

[**ModScormGetScormScoTracks200Response**](ModScormGetScormScoTracks200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModScormGetScormScoes

> ModScormGetScormScoes200Response ModScormGetScormScoes(ctx).ModScormGetScormScoesRequest(modScormGetScormScoesRequest).Execute()

Returns a list containing all the scoes data related to the given scorm id



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
	modScormGetScormScoesRequest := *openapiclient.NewModScormGetScormScoesRequest(int32(123)) // ModScormGetScormScoesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormGetScormScoes(context.Background()).ModScormGetScormScoesRequest(modScormGetScormScoesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormGetScormScoes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormGetScormScoes`: ModScormGetScormScoes200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormGetScormScoes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormGetScormScoesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormGetScormScoesRequest** | [**ModScormGetScormScoesRequest**](ModScormGetScormScoesRequest.md) |  | 

### Return type

[**ModScormGetScormScoes200Response**](ModScormGetScormScoes200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModScormGetScormUserData

> ModScormGetScormUserData200Response ModScormGetScormUserData(ctx).ModScormGetScormUserDataRequest(modScormGetScormUserDataRequest).Execute()

Retrieves user tracking and SCO data and default SCORM values



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
	modScormGetScormUserDataRequest := *openapiclient.NewModScormGetScormUserDataRequest(int32(123), int32(123)) // ModScormGetScormUserDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormGetScormUserData(context.Background()).ModScormGetScormUserDataRequest(modScormGetScormUserDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormGetScormUserData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormGetScormUserData`: ModScormGetScormUserData200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormGetScormUserData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormGetScormUserDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormGetScormUserDataRequest** | [**ModScormGetScormUserDataRequest**](ModScormGetScormUserDataRequest.md) |  | 

### Return type

[**ModScormGetScormUserData200Response**](ModScormGetScormUserData200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModScormGetScormsByCourses

> ModScormGetScormsByCourses200Response ModScormGetScormsByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.



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
	resp, r, err := apiClient.ModScormAPI.ModScormGetScormsByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormGetScormsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormGetScormsByCourses`: ModScormGetScormsByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormGetScormsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormGetScormsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModScormGetScormsByCourses200Response**](ModScormGetScormsByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModScormInsertScormTracks

> ModScormInsertScormTracks200Response ModScormInsertScormTracks(ctx).ModScormInsertScormTracksRequest(modScormInsertScormTracksRequest).Execute()

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.



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
	modScormInsertScormTracksRequest := *openapiclient.NewModScormInsertScormTracksRequest(int32(123), int32(123), []openapiclient.ModScormGetScormUserData200ResponseDataInnerDefaultdataInner{*openapiclient.NewModScormGetScormUserData200ResponseDataInnerDefaultdataInner()}) // ModScormInsertScormTracksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormInsertScormTracks(context.Background()).ModScormInsertScormTracksRequest(modScormInsertScormTracksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormInsertScormTracks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormInsertScormTracks`: ModScormInsertScormTracks200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormInsertScormTracks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormInsertScormTracksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormInsertScormTracksRequest** | [**ModScormInsertScormTracksRequest**](ModScormInsertScormTracksRequest.md) |  | 

### Return type

[**ModScormInsertScormTracks200Response**](ModScormInsertScormTracks200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModScormLaunchSco

> CoreCalendarDeleteSubscription200Response ModScormLaunchSco(ctx).ModScormLaunchScoRequest(modScormLaunchScoRequest).Execute()

Trigger the SCO launched event.



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
	modScormLaunchScoRequest := *openapiclient.NewModScormLaunchScoRequest(int32(123)) // ModScormLaunchScoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormLaunchSco(context.Background()).ModScormLaunchScoRequest(modScormLaunchScoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormLaunchSco``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormLaunchSco`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormLaunchSco`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormLaunchScoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormLaunchScoRequest** | [**ModScormLaunchScoRequest**](ModScormLaunchScoRequest.md) |  | 

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


## ModScormViewScorm

> CoreCalendarDeleteSubscription200Response ModScormViewScorm(ctx).ModScormViewScormRequest(modScormViewScormRequest).Execute()

Trigger the course module viewed event.



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
	modScormViewScormRequest := *openapiclient.NewModScormViewScormRequest(int32(123)) // ModScormViewScormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModScormAPI.ModScormViewScorm(context.Background()).ModScormViewScormRequest(modScormViewScormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModScormAPI.ModScormViewScorm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModScormViewScorm`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModScormAPI.ModScormViewScorm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModScormViewScormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modScormViewScormRequest** | [**ModScormViewScormRequest**](ModScormViewScormRequest.md) |  | 

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


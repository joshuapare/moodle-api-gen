# \LocalIomadLearningpathAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LocalIomadLearningpathActivate**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathActivate) | **Post** /local_iomad_learningpath_activate | Activates / deactivates learning path
[**LocalIomadLearningpathAddcourses**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathAddcourses) | **Post** /local_iomad_learningpath_addcourses | Add courses to learning path
[**LocalIomadLearningpathAddusers**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathAddusers) | **Post** /local_iomad_learningpath_addusers | Add users to learning path
[**LocalIomadLearningpathCopypath**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathCopypath) | **Post** /local_iomad_learningpath_copypath | Copy a learning path
[**LocalIomadLearningpathDeletepath**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathDeletepath) | **Post** /local_iomad_learningpath_deletepath | Completely delete a learning path
[**LocalIomadLearningpathGetcourses**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathGetcourses) | **Post** /local_iomad_learningpath_getcourses | Read list of courses for given learning
[**LocalIomadLearningpathGetprospectivecourses**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathGetprospectivecourses) | **Post** /local_iomad_learningpath_getprospectivecourses | Read set of filtered courses for given company
[**LocalIomadLearningpathGetprospectiveusers**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathGetprospectiveusers) | **Post** /local_iomad_learningpath_getprospectiveusers | Get set of filtered users for given company
[**LocalIomadLearningpathGetusers**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathGetusers) | **Post** /local_iomad_learningpath_getusers | Get users assigned to path
[**LocalIomadLearningpathOrdercourses**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathOrdercourses) | **Post** /local_iomad_learningpath_ordercourses | Set sequence of courses in learning path
[**LocalIomadLearningpathRemovecourses**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathRemovecourses) | **Post** /local_iomad_learningpath_removecourses | Remove courses from learning path
[**LocalIomadLearningpathRemoveusers**](LocalIomadLearningpathAPI.md#LocalIomadLearningpathRemoveusers) | **Post** /local_iomad_learningpath_removeusers | Remove users from learning path



## LocalIomadLearningpathActivate

> map[string]interface{} LocalIomadLearningpathActivate(ctx).LocalIomadLearningpathActivateRequest(localIomadLearningpathActivateRequest).Execute()

Activates / deactivates learning path



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
	localIomadLearningpathActivateRequest := *openapiclient.NewLocalIomadLearningpathActivateRequest(int32(123), int32(123)) // LocalIomadLearningpathActivateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathActivate(context.Background()).LocalIomadLearningpathActivateRequest(localIomadLearningpathActivateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathActivate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathActivate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathActivate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathActivateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathActivateRequest** | [**LocalIomadLearningpathActivateRequest**](LocalIomadLearningpathActivateRequest.md) |  | 

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


## LocalIomadLearningpathAddcourses

> map[string]interface{} LocalIomadLearningpathAddcourses(ctx).LocalIomadLearningpathAddcoursesRequest(localIomadLearningpathAddcoursesRequest).Execute()

Add courses to learning path



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
	localIomadLearningpathAddcoursesRequest := *openapiclient.NewLocalIomadLearningpathAddcoursesRequest([]map[string]interface{}{map[string]interface{}(123)}, int32(123)) // LocalIomadLearningpathAddcoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathAddcourses(context.Background()).LocalIomadLearningpathAddcoursesRequest(localIomadLearningpathAddcoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathAddcourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathAddcourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathAddcourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathAddcoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathAddcoursesRequest** | [**LocalIomadLearningpathAddcoursesRequest**](LocalIomadLearningpathAddcoursesRequest.md) |  | 

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


## LocalIomadLearningpathAddusers

> map[string]interface{} LocalIomadLearningpathAddusers(ctx).LocalIomadLearningpathAddusersRequest(localIomadLearningpathAddusersRequest).Execute()

Add users to learning path



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
	localIomadLearningpathAddusersRequest := *openapiclient.NewLocalIomadLearningpathAddusersRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // LocalIomadLearningpathAddusersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathAddusers(context.Background()).LocalIomadLearningpathAddusersRequest(localIomadLearningpathAddusersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathAddusers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathAddusers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathAddusers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathAddusersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathAddusersRequest** | [**LocalIomadLearningpathAddusersRequest**](LocalIomadLearningpathAddusersRequest.md) |  | 

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


## LocalIomadLearningpathCopypath

> map[string]interface{} LocalIomadLearningpathCopypath(ctx).LocalIomadLearningpathCopypathRequest(localIomadLearningpathCopypathRequest).Execute()

Copy a learning path



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
	localIomadLearningpathCopypathRequest := *openapiclient.NewLocalIomadLearningpathCopypathRequest(int32(123)) // LocalIomadLearningpathCopypathRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathCopypath(context.Background()).LocalIomadLearningpathCopypathRequest(localIomadLearningpathCopypathRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathCopypath``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathCopypath`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathCopypath`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathCopypathRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathCopypathRequest** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md) |  | 

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


## LocalIomadLearningpathDeletepath

> map[string]interface{} LocalIomadLearningpathDeletepath(ctx).LocalIomadLearningpathCopypathRequest(localIomadLearningpathCopypathRequest).Execute()

Completely delete a learning path



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
	localIomadLearningpathCopypathRequest := *openapiclient.NewLocalIomadLearningpathCopypathRequest(int32(123)) // LocalIomadLearningpathCopypathRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathDeletepath(context.Background()).LocalIomadLearningpathCopypathRequest(localIomadLearningpathCopypathRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathDeletepath``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathDeletepath`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathDeletepath`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathDeletepathRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathCopypathRequest** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md) |  | 

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


## LocalIomadLearningpathGetcourses

> map[string]interface{} LocalIomadLearningpathGetcourses(ctx).LocalIomadLearningpathGetcoursesRequest(localIomadLearningpathGetcoursesRequest).Execute()

Read list of courses for given learning



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
	localIomadLearningpathGetcoursesRequest := *openapiclient.NewLocalIomadLearningpathGetcoursesRequest(int32(123)) // LocalIomadLearningpathGetcoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathGetcourses(context.Background()).LocalIomadLearningpathGetcoursesRequest(localIomadLearningpathGetcoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathGetcourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathGetcourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathGetcourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathGetcoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathGetcoursesRequest** | [**LocalIomadLearningpathGetcoursesRequest**](LocalIomadLearningpathGetcoursesRequest.md) |  | 

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


## LocalIomadLearningpathGetprospectivecourses

> map[string]interface{} LocalIomadLearningpathGetprospectivecourses(ctx).LocalIomadLearningpathGetprospectivecoursesRequest(localIomadLearningpathGetprospectivecoursesRequest).Execute()

Read set of filtered courses for given company



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
	localIomadLearningpathGetprospectivecoursesRequest := *openapiclient.NewLocalIomadLearningpathGetprospectivecoursesRequest(int32(123)) // LocalIomadLearningpathGetprospectivecoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathGetprospectivecourses(context.Background()).LocalIomadLearningpathGetprospectivecoursesRequest(localIomadLearningpathGetprospectivecoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathGetprospectivecourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathGetprospectivecourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathGetprospectivecourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathGetprospectivecoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathGetprospectivecoursesRequest** | [**LocalIomadLearningpathGetprospectivecoursesRequest**](LocalIomadLearningpathGetprospectivecoursesRequest.md) |  | 

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


## LocalIomadLearningpathGetprospectiveusers

> map[string]interface{} LocalIomadLearningpathGetprospectiveusers(ctx).LocalIomadLearningpathGetprospectiveusersRequest(localIomadLearningpathGetprospectiveusersRequest).Execute()

Get set of filtered users for given company



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
	localIomadLearningpathGetprospectiveusersRequest := *openapiclient.NewLocalIomadLearningpathGetprospectiveusersRequest(int32(123), int32(123)) // LocalIomadLearningpathGetprospectiveusersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathGetprospectiveusers(context.Background()).LocalIomadLearningpathGetprospectiveusersRequest(localIomadLearningpathGetprospectiveusersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathGetprospectiveusers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathGetprospectiveusers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathGetprospectiveusers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathGetprospectiveusersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathGetprospectiveusersRequest** | [**LocalIomadLearningpathGetprospectiveusersRequest**](LocalIomadLearningpathGetprospectiveusersRequest.md) |  | 

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


## LocalIomadLearningpathGetusers

> map[string]interface{} LocalIomadLearningpathGetusers(ctx).LocalIomadLearningpathGetusersRequest(localIomadLearningpathGetusersRequest).Execute()

Get users assigned to path



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
	localIomadLearningpathGetusersRequest := *openapiclient.NewLocalIomadLearningpathGetusersRequest(int32(123), int32(123)) // LocalIomadLearningpathGetusersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathGetusers(context.Background()).LocalIomadLearningpathGetusersRequest(localIomadLearningpathGetusersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathGetusers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathGetusers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathGetusers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathGetusersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathGetusersRequest** | [**LocalIomadLearningpathGetusersRequest**](LocalIomadLearningpathGetusersRequest.md) |  | 

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


## LocalIomadLearningpathOrdercourses

> map[string]interface{} LocalIomadLearningpathOrdercourses(ctx).LocalIomadLearningpathOrdercoursesRequest(localIomadLearningpathOrdercoursesRequest).Execute()

Set sequence of courses in learning path



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
	localIomadLearningpathOrdercoursesRequest := *openapiclient.NewLocalIomadLearningpathOrdercoursesRequest([]openapiclient.LocalIomadLearningpathOrdercoursesRequestCoursesInner{*openapiclient.NewLocalIomadLearningpathOrdercoursesRequestCoursesInner()}, int32(123)) // LocalIomadLearningpathOrdercoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathOrdercourses(context.Background()).LocalIomadLearningpathOrdercoursesRequest(localIomadLearningpathOrdercoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathOrdercourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathOrdercourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathOrdercourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathOrdercoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathOrdercoursesRequest** | [**LocalIomadLearningpathOrdercoursesRequest**](LocalIomadLearningpathOrdercoursesRequest.md) |  | 

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


## LocalIomadLearningpathRemovecourses

> map[string]interface{} LocalIomadLearningpathRemovecourses(ctx).LocalIomadLearningpathRemovecoursesRequest(localIomadLearningpathRemovecoursesRequest).Execute()

Remove courses from learning path



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
	localIomadLearningpathRemovecoursesRequest := *openapiclient.NewLocalIomadLearningpathRemovecoursesRequest([]map[string]interface{}{map[string]interface{}(123)}, int32(123)) // LocalIomadLearningpathRemovecoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathRemovecourses(context.Background()).LocalIomadLearningpathRemovecoursesRequest(localIomadLearningpathRemovecoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathRemovecourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathRemovecourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathRemovecourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathRemovecoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathRemovecoursesRequest** | [**LocalIomadLearningpathRemovecoursesRequest**](LocalIomadLearningpathRemovecoursesRequest.md) |  | 

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


## LocalIomadLearningpathRemoveusers

> map[string]interface{} LocalIomadLearningpathRemoveusers(ctx).LocalIomadLearningpathRemoveusersRequest(localIomadLearningpathRemoveusersRequest).Execute()

Remove users from learning path



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
	localIomadLearningpathRemoveusersRequest := *openapiclient.NewLocalIomadLearningpathRemoveusersRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // LocalIomadLearningpathRemoveusersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.LocalIomadLearningpathAPI.LocalIomadLearningpathRemoveusers(context.Background()).LocalIomadLearningpathRemoveusersRequest(localIomadLearningpathRemoveusersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `LocalIomadLearningpathAPI.LocalIomadLearningpathRemoveusers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `LocalIomadLearningpathRemoveusers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `LocalIomadLearningpathAPI.LocalIomadLearningpathRemoveusers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLocalIomadLearningpathRemoveusersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localIomadLearningpathRemoveusersRequest** | [**LocalIomadLearningpathRemoveusersRequest**](LocalIomadLearningpathRemoveusersRequest.md) |  | 

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


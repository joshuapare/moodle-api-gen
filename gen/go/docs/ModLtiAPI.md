# \ModLtiAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModLtiCreateToolProxy**](ModLtiAPI.md#ModLtiCreateToolProxy) | **Post** /mod_lti_create_tool_proxy | Create a tool proxy
[**ModLtiCreateToolType**](ModLtiAPI.md#ModLtiCreateToolType) | **Post** /mod_lti_create_tool_type | Create a tool type
[**ModLtiDeleteCourseToolType**](ModLtiAPI.md#ModLtiDeleteCourseToolType) | **Post** /mod_lti_delete_course_tool_type | Delete a course tool type
[**ModLtiDeleteToolProxy**](ModLtiAPI.md#ModLtiDeleteToolProxy) | **Post** /mod_lti_delete_tool_proxy | Delete a tool proxy
[**ModLtiDeleteToolType**](ModLtiAPI.md#ModLtiDeleteToolType) | **Post** /mod_lti_delete_tool_type | Delete a tool type
[**ModLtiGetLtisByCourses**](ModLtiAPI.md#ModLtiGetLtisByCourses) | **Post** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
[**ModLtiGetToolLaunchData**](ModLtiAPI.md#ModLtiGetToolLaunchData) | **Post** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool.
[**ModLtiGetToolProxies**](ModLtiAPI.md#ModLtiGetToolProxies) | **Post** /mod_lti_get_tool_proxies | Get a list of the tool proxies
[**ModLtiGetToolProxyRegistrationRequest**](ModLtiAPI.md#ModLtiGetToolProxyRegistrationRequest) | **Post** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy
[**ModLtiGetToolTypes**](ModLtiAPI.md#ModLtiGetToolTypes) | **Post** /mod_lti_get_tool_types | Get a list of the tool types
[**ModLtiGetToolTypesAndProxies**](ModLtiAPI.md#ModLtiGetToolTypesAndProxies) | **Post** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies
[**ModLtiGetToolTypesAndProxiesCount**](ModLtiAPI.md#ModLtiGetToolTypesAndProxiesCount) | **Post** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies
[**ModLtiIsCartridge**](ModLtiAPI.md#ModLtiIsCartridge) | **Post** /mod_lti_is_cartridge | Determine if the given url is for a cartridge
[**ModLtiToggleShowinactivitychooser**](ModLtiAPI.md#ModLtiToggleShowinactivitychooser) | **Post** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course
[**ModLtiUpdateToolType**](ModLtiAPI.md#ModLtiUpdateToolType) | **Post** /mod_lti_update_tool_type | Update a tool type
[**ModLtiViewLti**](ModLtiAPI.md#ModLtiViewLti) | **Post** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status.



## ModLtiCreateToolProxy

> ModLtiCreateToolProxy200Response ModLtiCreateToolProxy(ctx).ModLtiCreateToolProxyRequest(modLtiCreateToolProxyRequest).Execute()

Create a tool proxy



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
	modLtiCreateToolProxyRequest := *openapiclient.NewModLtiCreateToolProxyRequest("Regurl_example") // ModLtiCreateToolProxyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiCreateToolProxy(context.Background()).ModLtiCreateToolProxyRequest(modLtiCreateToolProxyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiCreateToolProxy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiCreateToolProxy`: ModLtiCreateToolProxy200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiCreateToolProxy`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiCreateToolProxyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiCreateToolProxyRequest** | [**ModLtiCreateToolProxyRequest**](ModLtiCreateToolProxyRequest.md) |  | 

### Return type

[**ModLtiCreateToolProxy200Response**](ModLtiCreateToolProxy200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiCreateToolType

> ModLtiCreateToolType200Response ModLtiCreateToolType(ctx).ModLtiCreateToolTypeRequest(modLtiCreateToolTypeRequest).Execute()

Create a tool type



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
	modLtiCreateToolTypeRequest := *openapiclient.NewModLtiCreateToolTypeRequest() // ModLtiCreateToolTypeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiCreateToolType(context.Background()).ModLtiCreateToolTypeRequest(modLtiCreateToolTypeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiCreateToolType``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiCreateToolType`: ModLtiCreateToolType200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiCreateToolType`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiCreateToolTypeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiCreateToolTypeRequest** | [**ModLtiCreateToolTypeRequest**](ModLtiCreateToolTypeRequest.md) |  | 

### Return type

[**ModLtiCreateToolType200Response**](ModLtiCreateToolType200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiDeleteCourseToolType

> map[string]interface{} ModLtiDeleteCourseToolType(ctx).ModLtiDeleteCourseToolTypeRequest(modLtiDeleteCourseToolTypeRequest).Execute()

Delete a course tool type



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
	modLtiDeleteCourseToolTypeRequest := *openapiclient.NewModLtiDeleteCourseToolTypeRequest(int32(123)) // ModLtiDeleteCourseToolTypeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiDeleteCourseToolType(context.Background()).ModLtiDeleteCourseToolTypeRequest(modLtiDeleteCourseToolTypeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiDeleteCourseToolType``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiDeleteCourseToolType`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiDeleteCourseToolType`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiDeleteCourseToolTypeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiDeleteCourseToolTypeRequest** | [**ModLtiDeleteCourseToolTypeRequest**](ModLtiDeleteCourseToolTypeRequest.md) |  | 

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


## ModLtiDeleteToolProxy

> ModLtiDeleteToolProxy200Response ModLtiDeleteToolProxy(ctx).ModLtiDeleteToolProxyRequest(modLtiDeleteToolProxyRequest).Execute()

Delete a tool proxy



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
	modLtiDeleteToolProxyRequest := *openapiclient.NewModLtiDeleteToolProxyRequest(int32(123)) // ModLtiDeleteToolProxyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiDeleteToolProxy(context.Background()).ModLtiDeleteToolProxyRequest(modLtiDeleteToolProxyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiDeleteToolProxy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiDeleteToolProxy`: ModLtiDeleteToolProxy200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiDeleteToolProxy`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiDeleteToolProxyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiDeleteToolProxyRequest** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md) |  | 

### Return type

[**ModLtiDeleteToolProxy200Response**](ModLtiDeleteToolProxy200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiDeleteToolType

> ModLtiDeleteToolTypeRequest ModLtiDeleteToolType(ctx).ModLtiDeleteToolTypeRequest(modLtiDeleteToolTypeRequest).Execute()

Delete a tool type



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
	modLtiDeleteToolTypeRequest := *openapiclient.NewModLtiDeleteToolTypeRequest(int32(123)) // ModLtiDeleteToolTypeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiDeleteToolType(context.Background()).ModLtiDeleteToolTypeRequest(modLtiDeleteToolTypeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiDeleteToolType``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiDeleteToolType`: ModLtiDeleteToolTypeRequest
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiDeleteToolType`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiDeleteToolTypeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiDeleteToolTypeRequest** | [**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md) |  | 

### Return type

[**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiGetLtisByCourses

> ModLtiGetLtisByCourses200Response ModLtiGetLtisByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.



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
	resp, r, err := apiClient.ModLtiAPI.ModLtiGetLtisByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiGetLtisByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiGetLtisByCourses`: ModLtiGetLtisByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiGetLtisByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiGetLtisByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModLtiGetLtisByCourses200Response**](ModLtiGetLtisByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiGetToolLaunchData

> ModLtiGetToolLaunchData200Response ModLtiGetToolLaunchData(ctx).ModLtiGetToolLaunchDataRequest(modLtiGetToolLaunchDataRequest).Execute()

Return the launch data for a given external tool.



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
	modLtiGetToolLaunchDataRequest := *openapiclient.NewModLtiGetToolLaunchDataRequest(int32(123)) // ModLtiGetToolLaunchDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiGetToolLaunchData(context.Background()).ModLtiGetToolLaunchDataRequest(modLtiGetToolLaunchDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiGetToolLaunchData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiGetToolLaunchData`: ModLtiGetToolLaunchData200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiGetToolLaunchData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiGetToolLaunchDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiGetToolLaunchDataRequest** | [**ModLtiGetToolLaunchDataRequest**](ModLtiGetToolLaunchDataRequest.md) |  | 

### Return type

[**ModLtiGetToolLaunchData200Response**](ModLtiGetToolLaunchData200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiGetToolProxies

> map[string]interface{} ModLtiGetToolProxies(ctx).ModLtiGetToolProxiesRequest(modLtiGetToolProxiesRequest).Execute()

Get a list of the tool proxies



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
	modLtiGetToolProxiesRequest := *openapiclient.NewModLtiGetToolProxiesRequest() // ModLtiGetToolProxiesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiGetToolProxies(context.Background()).ModLtiGetToolProxiesRequest(modLtiGetToolProxiesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiGetToolProxies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiGetToolProxies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiGetToolProxies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiGetToolProxiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiGetToolProxiesRequest** | [**ModLtiGetToolProxiesRequest**](ModLtiGetToolProxiesRequest.md) |  | 

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


## ModLtiGetToolProxyRegistrationRequest

> ModLtiGetToolProxyRegistrationRequest200Response ModLtiGetToolProxyRegistrationRequest(ctx).ModLtiDeleteToolProxyRequest(modLtiDeleteToolProxyRequest).Execute()

Get a registration request for a tool proxy



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
	modLtiDeleteToolProxyRequest := *openapiclient.NewModLtiDeleteToolProxyRequest(int32(123)) // ModLtiDeleteToolProxyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiGetToolProxyRegistrationRequest(context.Background()).ModLtiDeleteToolProxyRequest(modLtiDeleteToolProxyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiGetToolProxyRegistrationRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiGetToolProxyRegistrationRequest`: ModLtiGetToolProxyRegistrationRequest200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiGetToolProxyRegistrationRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiGetToolProxyRegistrationRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiDeleteToolProxyRequest** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md) |  | 

### Return type

[**ModLtiGetToolProxyRegistrationRequest200Response**](ModLtiGetToolProxyRegistrationRequest200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiGetToolTypes

> map[string]interface{} ModLtiGetToolTypes(ctx).ModLtiGetToolTypesRequest(modLtiGetToolTypesRequest).Execute()

Get a list of the tool types



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
	modLtiGetToolTypesRequest := *openapiclient.NewModLtiGetToolTypesRequest() // ModLtiGetToolTypesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiGetToolTypes(context.Background()).ModLtiGetToolTypesRequest(modLtiGetToolTypesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiGetToolTypes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiGetToolTypes`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiGetToolTypes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiGetToolTypesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiGetToolTypesRequest** | [**ModLtiGetToolTypesRequest**](ModLtiGetToolTypesRequest.md) |  | 

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


## ModLtiGetToolTypesAndProxies

> ModLtiGetToolTypesAndProxies200Response ModLtiGetToolTypesAndProxies(ctx).ModLtiGetToolTypesAndProxiesRequest(modLtiGetToolTypesAndProxiesRequest).Execute()

Get a list of the tool types and tool proxies



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
	modLtiGetToolTypesAndProxiesRequest := *openapiclient.NewModLtiGetToolTypesAndProxiesRequest() // ModLtiGetToolTypesAndProxiesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiGetToolTypesAndProxies(context.Background()).ModLtiGetToolTypesAndProxiesRequest(modLtiGetToolTypesAndProxiesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiGetToolTypesAndProxies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiGetToolTypesAndProxies`: ModLtiGetToolTypesAndProxies200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiGetToolTypesAndProxies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiGetToolTypesAndProxiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiGetToolTypesAndProxiesRequest** | [**ModLtiGetToolTypesAndProxiesRequest**](ModLtiGetToolTypesAndProxiesRequest.md) |  | 

### Return type

[**ModLtiGetToolTypesAndProxies200Response**](ModLtiGetToolTypesAndProxies200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiGetToolTypesAndProxiesCount

> ModLtiGetToolTypesAndProxiesCount200Response ModLtiGetToolTypesAndProxiesCount(ctx).ModLtiGetToolTypesAndProxiesCountRequest(modLtiGetToolTypesAndProxiesCountRequest).Execute()

Get total number of the tool types and tool proxies



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
	modLtiGetToolTypesAndProxiesCountRequest := *openapiclient.NewModLtiGetToolTypesAndProxiesCountRequest() // ModLtiGetToolTypesAndProxiesCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiGetToolTypesAndProxiesCount(context.Background()).ModLtiGetToolTypesAndProxiesCountRequest(modLtiGetToolTypesAndProxiesCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiGetToolTypesAndProxiesCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiGetToolTypesAndProxiesCount`: ModLtiGetToolTypesAndProxiesCount200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiGetToolTypesAndProxiesCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiGetToolTypesAndProxiesCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiGetToolTypesAndProxiesCountRequest** | [**ModLtiGetToolTypesAndProxiesCountRequest**](ModLtiGetToolTypesAndProxiesCountRequest.md) |  | 

### Return type

[**ModLtiGetToolTypesAndProxiesCount200Response**](ModLtiGetToolTypesAndProxiesCount200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiIsCartridge

> ModLtiIsCartridge200Response ModLtiIsCartridge(ctx).ModLtiIsCartridgeRequest(modLtiIsCartridgeRequest).Execute()

Determine if the given url is for a cartridge



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
	modLtiIsCartridgeRequest := *openapiclient.NewModLtiIsCartridgeRequest("Url_example") // ModLtiIsCartridgeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiIsCartridge(context.Background()).ModLtiIsCartridgeRequest(modLtiIsCartridgeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiIsCartridge``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiIsCartridge`: ModLtiIsCartridge200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiIsCartridge`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiIsCartridgeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiIsCartridgeRequest** | [**ModLtiIsCartridgeRequest**](ModLtiIsCartridgeRequest.md) |  | 

### Return type

[**ModLtiIsCartridge200Response**](ModLtiIsCartridge200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiToggleShowinactivitychooser

> map[string]interface{} ModLtiToggleShowinactivitychooser(ctx).ModLtiToggleShowinactivitychooserRequest(modLtiToggleShowinactivitychooserRequest).Execute()

Toggle showinactivitychooser for a tool type in a course



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
	modLtiToggleShowinactivitychooserRequest := *openapiclient.NewModLtiToggleShowinactivitychooserRequest(int32(123), false, int32(123)) // ModLtiToggleShowinactivitychooserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiToggleShowinactivitychooser(context.Background()).ModLtiToggleShowinactivitychooserRequest(modLtiToggleShowinactivitychooserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiToggleShowinactivitychooser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiToggleShowinactivitychooser`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiToggleShowinactivitychooser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiToggleShowinactivitychooserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiToggleShowinactivitychooserRequest** | [**ModLtiToggleShowinactivitychooserRequest**](ModLtiToggleShowinactivitychooserRequest.md) |  | 

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


## ModLtiUpdateToolType

> ModLtiUpdateToolType200Response ModLtiUpdateToolType(ctx).ModLtiUpdateToolTypeRequest(modLtiUpdateToolTypeRequest).Execute()

Update a tool type



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
	modLtiUpdateToolTypeRequest := *openapiclient.NewModLtiUpdateToolTypeRequest(int32(123)) // ModLtiUpdateToolTypeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiUpdateToolType(context.Background()).ModLtiUpdateToolTypeRequest(modLtiUpdateToolTypeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiUpdateToolType``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiUpdateToolType`: ModLtiUpdateToolType200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiUpdateToolType`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiUpdateToolTypeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiUpdateToolTypeRequest** | [**ModLtiUpdateToolTypeRequest**](ModLtiUpdateToolTypeRequest.md) |  | 

### Return type

[**ModLtiUpdateToolType200Response**](ModLtiUpdateToolType200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModLtiViewLti

> CoreCalendarDeleteSubscription200Response ModLtiViewLti(ctx).ModLtiViewLtiRequest(modLtiViewLtiRequest).Execute()

Trigger the course module viewed event and update the module completion status.



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
	modLtiViewLtiRequest := *openapiclient.NewModLtiViewLtiRequest(int32(123)) // ModLtiViewLtiRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModLtiAPI.ModLtiViewLti(context.Background()).ModLtiViewLtiRequest(modLtiViewLtiRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModLtiAPI.ModLtiViewLti``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModLtiViewLti`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModLtiAPI.ModLtiViewLti`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModLtiViewLtiRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modLtiViewLtiRequest** | [**ModLtiViewLtiRequest**](ModLtiViewLtiRequest.md) |  | 

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


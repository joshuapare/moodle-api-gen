# \ModChatAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModChatGetChatLatestMessages**](ModChatAPI.md#ModChatGetChatLatestMessages) | **Post** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session.
[**ModChatGetChatUsers**](ModChatAPI.md#ModChatGetChatUsers) | **Post** /mod_chat_get_chat_users | Get the list of users in the given chat session.
[**ModChatGetChatsByCourses**](ModChatAPI.md#ModChatGetChatsByCourses) | **Post** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
[**ModChatGetSessionMessages**](ModChatAPI.md#ModChatGetSessionMessages) | **Post** /mod_chat_get_session_messages | Retrieves messages of the given chat session.
[**ModChatGetSessions**](ModChatAPI.md#ModChatGetSessions) | **Post** /mod_chat_get_sessions | Retrieves chat sessions for a given chat.
[**ModChatLoginUser**](ModChatAPI.md#ModChatLoginUser) | **Post** /mod_chat_login_user | Log a user into a chat room in the given chat.
[**ModChatSendChatMessage**](ModChatAPI.md#ModChatSendChatMessage) | **Post** /mod_chat_send_chat_message | Send a message on the given chat session.
[**ModChatViewChat**](ModChatAPI.md#ModChatViewChat) | **Post** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status.
[**ModChatViewSessions**](ModChatAPI.md#ModChatViewSessions) | **Post** /mod_chat_view_sessions | Trigger the chat session viewed event.



## ModChatGetChatLatestMessages

> ModChatGetChatLatestMessages200Response ModChatGetChatLatestMessages(ctx).ModChatGetChatLatestMessagesRequest(modChatGetChatLatestMessagesRequest).Execute()

Get the latest messages from the given chat session.



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
	modChatGetChatLatestMessagesRequest := *openapiclient.NewModChatGetChatLatestMessagesRequest("Chatsid_example") // ModChatGetChatLatestMessagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatGetChatLatestMessages(context.Background()).ModChatGetChatLatestMessagesRequest(modChatGetChatLatestMessagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatGetChatLatestMessages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatGetChatLatestMessages`: ModChatGetChatLatestMessages200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatGetChatLatestMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatGetChatLatestMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatLatestMessagesRequest** | [**ModChatGetChatLatestMessagesRequest**](ModChatGetChatLatestMessagesRequest.md) |  | 

### Return type

[**ModChatGetChatLatestMessages200Response**](ModChatGetChatLatestMessages200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChatGetChatUsers

> ModChatGetChatUsers200Response ModChatGetChatUsers(ctx).ModChatGetChatUsersRequest(modChatGetChatUsersRequest).Execute()

Get the list of users in the given chat session.



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
	modChatGetChatUsersRequest := *openapiclient.NewModChatGetChatUsersRequest("Chatsid_example") // ModChatGetChatUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatGetChatUsers(context.Background()).ModChatGetChatUsersRequest(modChatGetChatUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatGetChatUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatGetChatUsers`: ModChatGetChatUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatGetChatUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatGetChatUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatUsersRequest** | [**ModChatGetChatUsersRequest**](ModChatGetChatUsersRequest.md) |  | 

### Return type

[**ModChatGetChatUsers200Response**](ModChatGetChatUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChatGetChatsByCourses

> ModChatGetChatsByCourses200Response ModChatGetChatsByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.



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
	resp, r, err := apiClient.ModChatAPI.ModChatGetChatsByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatGetChatsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatGetChatsByCourses`: ModChatGetChatsByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatGetChatsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatGetChatsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModChatGetChatsByCourses200Response**](ModChatGetChatsByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChatGetSessionMessages

> ModChatGetSessionMessages200Response ModChatGetSessionMessages(ctx).ModChatGetSessionMessagesRequest(modChatGetSessionMessagesRequest).Execute()

Retrieves messages of the given chat session.



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
	modChatGetSessionMessagesRequest := *openapiclient.NewModChatGetSessionMessagesRequest(int32(123), int32(123), int32(123)) // ModChatGetSessionMessagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatGetSessionMessages(context.Background()).ModChatGetSessionMessagesRequest(modChatGetSessionMessagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatGetSessionMessages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatGetSessionMessages`: ModChatGetSessionMessages200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatGetSessionMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatGetSessionMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetSessionMessagesRequest** | [**ModChatGetSessionMessagesRequest**](ModChatGetSessionMessagesRequest.md) |  | 

### Return type

[**ModChatGetSessionMessages200Response**](ModChatGetSessionMessages200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChatGetSessions

> ModChatGetSessions200Response ModChatGetSessions(ctx).ModChatGetSessionsRequest(modChatGetSessionsRequest).Execute()

Retrieves chat sessions for a given chat.



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
	modChatGetSessionsRequest := *openapiclient.NewModChatGetSessionsRequest(int32(123)) // ModChatGetSessionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatGetSessions(context.Background()).ModChatGetSessionsRequest(modChatGetSessionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatGetSessions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatGetSessions`: ModChatGetSessions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatGetSessions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatGetSessionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetSessionsRequest** | [**ModChatGetSessionsRequest**](ModChatGetSessionsRequest.md) |  | 

### Return type

[**ModChatGetSessions200Response**](ModChatGetSessions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChatLoginUser

> ModChatLoginUser200Response ModChatLoginUser(ctx).ModChatLoginUserRequest(modChatLoginUserRequest).Execute()

Log a user into a chat room in the given chat.



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
	modChatLoginUserRequest := *openapiclient.NewModChatLoginUserRequest(int32(123)) // ModChatLoginUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatLoginUser(context.Background()).ModChatLoginUserRequest(modChatLoginUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatLoginUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatLoginUser`: ModChatLoginUser200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatLoginUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatLoginUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatLoginUserRequest** | [**ModChatLoginUserRequest**](ModChatLoginUserRequest.md) |  | 

### Return type

[**ModChatLoginUser200Response**](ModChatLoginUser200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChatSendChatMessage

> ModChatSendChatMessage200Response ModChatSendChatMessage(ctx).ModChatSendChatMessageRequest(modChatSendChatMessageRequest).Execute()

Send a message on the given chat session.



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
	modChatSendChatMessageRequest := *openapiclient.NewModChatSendChatMessageRequest("Chatsid_example", "Messagetext_example") // ModChatSendChatMessageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatSendChatMessage(context.Background()).ModChatSendChatMessageRequest(modChatSendChatMessageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatSendChatMessage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatSendChatMessage`: ModChatSendChatMessage200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatSendChatMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatSendChatMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatSendChatMessageRequest** | [**ModChatSendChatMessageRequest**](ModChatSendChatMessageRequest.md) |  | 

### Return type

[**ModChatSendChatMessage200Response**](ModChatSendChatMessage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModChatViewChat

> CoreCalendarDeleteSubscription200Response ModChatViewChat(ctx).ModChatViewChatRequest(modChatViewChatRequest).Execute()

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
	modChatViewChatRequest := *openapiclient.NewModChatViewChatRequest(int32(123)) // ModChatViewChatRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatViewChat(context.Background()).ModChatViewChatRequest(modChatViewChatRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatViewChat``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatViewChat`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatViewChat`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatViewChatRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatViewChatRequest** | [**ModChatViewChatRequest**](ModChatViewChatRequest.md) |  | 

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


## ModChatViewSessions

> CoreCalendarDeleteSubscription200Response ModChatViewSessions(ctx).ModChatViewSessionsRequest(modChatViewSessionsRequest).Execute()

Trigger the chat session viewed event.



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
	modChatViewSessionsRequest := *openapiclient.NewModChatViewSessionsRequest(int32(123)) // ModChatViewSessionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModChatAPI.ModChatViewSessions(context.Background()).ModChatViewSessionsRequest(modChatViewSessionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModChatAPI.ModChatViewSessions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModChatViewSessions`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModChatAPI.ModChatViewSessions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModChatViewSessionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatViewSessionsRequest** | [**ModChatViewSessionsRequest**](ModChatViewSessionsRequest.md) |  | 

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


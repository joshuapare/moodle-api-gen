# \MessagePopupAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MessagePopupGetPopupNotifications**](MessagePopupAPI.md#MessagePopupGetPopupNotifications) | **Post** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user
[**MessagePopupGetUnreadPopupNotificationCount**](MessagePopupAPI.md#MessagePopupGetUnreadPopupNotificationCount) | **Post** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user



## MessagePopupGetPopupNotifications

> MessagePopupGetPopupNotifications200Response MessagePopupGetPopupNotifications(ctx).MessagePopupGetPopupNotificationsRequest(messagePopupGetPopupNotificationsRequest).Execute()

Retrieve a list of popup notifications for a user



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
	messagePopupGetPopupNotificationsRequest := *openapiclient.NewMessagePopupGetPopupNotificationsRequest(int32(123)) // MessagePopupGetPopupNotificationsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MessagePopupAPI.MessagePopupGetPopupNotifications(context.Background()).MessagePopupGetPopupNotificationsRequest(messagePopupGetPopupNotificationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MessagePopupAPI.MessagePopupGetPopupNotifications``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MessagePopupGetPopupNotifications`: MessagePopupGetPopupNotifications200Response
	fmt.Fprintf(os.Stdout, "Response from `MessagePopupAPI.MessagePopupGetPopupNotifications`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMessagePopupGetPopupNotificationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messagePopupGetPopupNotificationsRequest** | [**MessagePopupGetPopupNotificationsRequest**](MessagePopupGetPopupNotificationsRequest.md) |  | 

### Return type

[**MessagePopupGetPopupNotifications200Response**](MessagePopupGetPopupNotifications200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MessagePopupGetUnreadPopupNotificationCount

> map[string]interface{} MessagePopupGetUnreadPopupNotificationCount(ctx).CoreMessageGetUnreadConversationsCountRequest(coreMessageGetUnreadConversationsCountRequest).Execute()

Retrieve the count of unread popup notifications for a given user



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
	coreMessageGetUnreadConversationsCountRequest := *openapiclient.NewCoreMessageGetUnreadConversationsCountRequest(int32(123)) // CoreMessageGetUnreadConversationsCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MessagePopupAPI.MessagePopupGetUnreadPopupNotificationCount(context.Background()).CoreMessageGetUnreadConversationsCountRequest(coreMessageGetUnreadConversationsCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MessagePopupAPI.MessagePopupGetUnreadPopupNotificationCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `MessagePopupGetUnreadPopupNotificationCount`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MessagePopupAPI.MessagePopupGetUnreadPopupNotificationCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMessagePopupGetUnreadPopupNotificationCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetUnreadConversationsCountRequest** | [**CoreMessageGetUnreadConversationsCountRequest**](CoreMessageGetUnreadConversationsCountRequest.md) |  | 

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


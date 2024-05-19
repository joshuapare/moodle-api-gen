# \MessagePopupApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**message_popup_get_popup_notifications**](MessagePopupApi.md#message_popup_get_popup_notifications) | **POST** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user
[**message_popup_get_unread_popup_notification_count**](MessagePopupApi.md#message_popup_get_unread_popup_notification_count) | **POST** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user



## message_popup_get_popup_notifications

> models::MessagePopupGetPopupNotifications200Response message_popup_get_popup_notifications(message_popup_get_popup_notifications_request)
Retrieve a list of popup notifications for a user

Retrieve a list of popup notifications for a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**message_popup_get_popup_notifications_request** | [**MessagePopupGetPopupNotificationsRequest**](MessagePopupGetPopupNotificationsRequest.md) |  | [required] |

### Return type

[**models::MessagePopupGetPopupNotifications200Response**](message_popup_get_popup_notifications_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## message_popup_get_unread_popup_notification_count

> serde_json::Value message_popup_get_unread_popup_notification_count(core_message_get_unread_conversations_count_request)
Retrieve the count of unread popup notifications for a given user

Retrieve the count of unread popup notifications for a given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_unread_conversations_count_request** | [**CoreMessageGetUnreadConversationsCountRequest**](CoreMessageGetUnreadConversationsCountRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


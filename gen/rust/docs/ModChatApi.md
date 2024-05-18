# \ModChatApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_chat_get_chat_latest_messages**](ModChatApi.md#mod_chat_get_chat_latest_messages) | **POST** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session.
[**mod_chat_get_chat_users**](ModChatApi.md#mod_chat_get_chat_users) | **POST** /mod_chat_get_chat_users | Get the list of users in the given chat session.
[**mod_chat_get_chats_by_courses**](ModChatApi.md#mod_chat_get_chats_by_courses) | **POST** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
[**mod_chat_get_session_messages**](ModChatApi.md#mod_chat_get_session_messages) | **POST** /mod_chat_get_session_messages | Retrieves messages of the given chat session.
[**mod_chat_get_sessions**](ModChatApi.md#mod_chat_get_sessions) | **POST** /mod_chat_get_sessions | Retrieves chat sessions for a given chat.
[**mod_chat_login_user**](ModChatApi.md#mod_chat_login_user) | **POST** /mod_chat_login_user | Log a user into a chat room in the given chat.
[**mod_chat_send_chat_message**](ModChatApi.md#mod_chat_send_chat_message) | **POST** /mod_chat_send_chat_message | Send a message on the given chat session.
[**mod_chat_view_chat**](ModChatApi.md#mod_chat_view_chat) | **POST** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status.
[**mod_chat_view_sessions**](ModChatApi.md#mod_chat_view_sessions) | **POST** /mod_chat_view_sessions | Trigger the chat session viewed event.



## mod_chat_get_chat_latest_messages

> models::ModChatGetChatLatestMessages200Response mod_chat_get_chat_latest_messages(mod_chat_get_chat_latest_messages_request)
Get the latest messages from the given chat session.

Get the latest messages from the given chat session.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chat_latest_messages_request** | [**ModChatGetChatLatestMessagesRequest**](ModChatGetChatLatestMessagesRequest.md) |  | [required] |

### Return type

[**models::ModChatGetChatLatestMessages200Response**](mod_chat_get_chat_latest_messages_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_get_chat_users

> models::ModChatGetChatUsers200Response mod_chat_get_chat_users(mod_chat_get_chat_users_request)
Get the list of users in the given chat session.

Get the list of users in the given chat session.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chat_users_request** | [**ModChatGetChatUsersRequest**](ModChatGetChatUsersRequest.md) |  | [required] |

### Return type

[**models::ModChatGetChatUsers200Response**](mod_chat_get_chat_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_get_chats_by_courses

> models::ModChatGetChatsByCourses200Response mod_chat_get_chats_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModChatGetChatsByCourses200Response**](mod_chat_get_chats_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_get_session_messages

> models::ModChatGetSessionMessages200Response mod_chat_get_session_messages(mod_chat_get_session_messages_request)
Retrieves messages of the given chat session.

Retrieves messages of the given chat session.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_session_messages_request** | [**ModChatGetSessionMessagesRequest**](ModChatGetSessionMessagesRequest.md) |  | [required] |

### Return type

[**models::ModChatGetSessionMessages200Response**](mod_chat_get_session_messages_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_get_sessions

> models::ModChatGetSessions200Response mod_chat_get_sessions(mod_chat_get_sessions_request)
Retrieves chat sessions for a given chat.

Retrieves chat sessions for a given chat.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_sessions_request** | [**ModChatGetSessionsRequest**](ModChatGetSessionsRequest.md) |  | [required] |

### Return type

[**models::ModChatGetSessions200Response**](mod_chat_get_sessions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_login_user

> models::ModChatLoginUser200Response mod_chat_login_user(mod_chat_login_user_request)
Log a user into a chat room in the given chat.

Log a user into a chat room in the given chat.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_login_user_request** | [**ModChatLoginUserRequest**](ModChatLoginUserRequest.md) |  | [required] |

### Return type

[**models::ModChatLoginUser200Response**](mod_chat_login_user_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_send_chat_message

> models::ModChatSendChatMessage200Response mod_chat_send_chat_message(mod_chat_send_chat_message_request)
Send a message on the given chat session.

Send a message on the given chat session.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_send_chat_message_request** | [**ModChatSendChatMessageRequest**](ModChatSendChatMessageRequest.md) |  | [required] |

### Return type

[**models::ModChatSendChatMessage200Response**](mod_chat_send_chat_message_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_view_chat

> models::CoreCalendarDeleteSubscription200Response mod_chat_view_chat(mod_chat_view_chat_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_view_chat_request** | [**ModChatViewChatRequest**](ModChatViewChatRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_chat_view_sessions

> models::CoreCalendarDeleteSubscription200Response mod_chat_view_sessions(mod_chat_view_sessions_request)
Trigger the chat session viewed event.

Trigger the chat session viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_view_sessions_request** | [**ModChatViewSessionsRequest**](ModChatViewSessionsRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


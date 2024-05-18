# \ModChoiceApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_choice_delete_choice_responses**](ModChoiceApi.md#mod_choice_delete_choice_responses) | **POST** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice
[**mod_choice_get_choice_options**](ModChoiceApi.md#mod_choice_get_choice_options) | **POST** /mod_choice_get_choice_options | Retrieve options for a specific choice.
[**mod_choice_get_choice_results**](ModChoiceApi.md#mod_choice_get_choice_results) | **POST** /mod_choice_get_choice_results | Retrieve users results for a given choice.
[**mod_choice_get_choices_by_courses**](ModChoiceApi.md#mod_choice_get_choices_by_courses) | **POST** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
[**mod_choice_submit_choice_response**](ModChoiceApi.md#mod_choice_submit_choice_response) | **POST** /mod_choice_submit_choice_response | Submit responses to a specific choice item.
[**mod_choice_view_choice**](ModChoiceApi.md#mod_choice_view_choice) | **POST** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status.



## mod_choice_delete_choice_responses

> models::ModChoiceDeleteChoiceResponses200Response mod_choice_delete_choice_responses(mod_choice_delete_choice_responses_request)
Delete the given submitted responses in a choice

Delete the given submitted responses in a choice

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_choice_delete_choice_responses_request** | [**ModChoiceDeleteChoiceResponsesRequest**](ModChoiceDeleteChoiceResponsesRequest.md) |  | [required] |

### Return type

[**models::ModChoiceDeleteChoiceResponses200Response**](mod_choice_delete_choice_responses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_choice_get_choice_options

> models::ModChoiceGetChoiceOptions200Response mod_choice_get_choice_options(mod_choice_get_choice_options_request)
Retrieve options for a specific choice.

Retrieve options for a specific choice.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_choice_get_choice_options_request** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  | [required] |

### Return type

[**models::ModChoiceGetChoiceOptions200Response**](mod_choice_get_choice_options_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_choice_get_choice_results

> models::ModChoiceGetChoiceResults200Response mod_choice_get_choice_results(mod_choice_get_choice_options_request)
Retrieve users results for a given choice.

Retrieve users results for a given choice.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_choice_get_choice_options_request** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  | [required] |

### Return type

[**models::ModChoiceGetChoiceResults200Response**](mod_choice_get_choice_results_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_choice_get_choices_by_courses

> models::ModChoiceGetChoicesByCourses200Response mod_choice_get_choices_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModChoiceGetChoicesByCourses200Response**](mod_choice_get_choices_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_choice_submit_choice_response

> models::ModChoiceSubmitChoiceResponse200Response mod_choice_submit_choice_response(mod_choice_submit_choice_response_request)
Submit responses to a specific choice item.

Submit responses to a specific choice item.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_choice_submit_choice_response_request** | [**ModChoiceSubmitChoiceResponseRequest**](ModChoiceSubmitChoiceResponseRequest.md) |  | [required] |

### Return type

[**models::ModChoiceSubmitChoiceResponse200Response**](mod_choice_submit_choice_response_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_choice_view_choice

> models::CoreCalendarDeleteSubscription200Response mod_choice_view_choice(mod_choice_get_choice_options_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_choice_get_choice_options_request** | [**ModChoiceGetChoiceOptionsRequest**](ModChoiceGetChoiceOptionsRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


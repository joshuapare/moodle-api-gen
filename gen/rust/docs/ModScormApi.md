# \ModScormApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_scorm_get_scorm_access_information**](ModScormApi.md#mod_scorm_get_scorm_access_information) | **POST** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm.
[**mod_scorm_get_scorm_attempt_count**](ModScormApi.md#mod_scorm_get_scorm_attempt_count) | **POST** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM.
[**mod_scorm_get_scorm_sco_tracks**](ModScormApi.md#mod_scorm_get_scorm_sco_tracks) | **POST** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number
[**mod_scorm_get_scorm_scoes**](ModScormApi.md#mod_scorm_get_scorm_scoes) | **POST** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id
[**mod_scorm_get_scorm_user_data**](ModScormApi.md#mod_scorm_get_scorm_user_data) | **POST** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values
[**mod_scorm_get_scorms_by_courses**](ModScormApi.md#mod_scorm_get_scorms_by_courses) | **POST** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
[**mod_scorm_insert_scorm_tracks**](ModScormApi.md#mod_scorm_insert_scorm_tracks) | **POST** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
[**mod_scorm_launch_sco**](ModScormApi.md#mod_scorm_launch_sco) | **POST** /mod_scorm_launch_sco | Trigger the SCO launched event.
[**mod_scorm_view_scorm**](ModScormApi.md#mod_scorm_view_scorm) | **POST** /mod_scorm_view_scorm | Trigger the course module viewed event.



## mod_scorm_get_scorm_access_information

> models::ModScormGetScormAccessInformation200Response mod_scorm_get_scorm_access_information(mod_scorm_get_scorm_access_information_request)
Return capabilities information for a given scorm.

Return capabilities information for a given scorm.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_get_scorm_access_information_request** | [**ModScormGetScormAccessInformationRequest**](ModScormGetScormAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModScormGetScormAccessInformation200Response**](mod_scorm_get_scorm_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_get_scorm_attempt_count

> models::ModScormGetScormAttemptCount200Response mod_scorm_get_scorm_attempt_count(mod_scorm_get_scorm_attempt_count_request)
Return the number of attempts done by a user in the given SCORM.

Return the number of attempts done by a user in the given SCORM.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_get_scorm_attempt_count_request** | [**ModScormGetScormAttemptCountRequest**](ModScormGetScormAttemptCountRequest.md) |  | [required] |

### Return type

[**models::ModScormGetScormAttemptCount200Response**](mod_scorm_get_scorm_attempt_count_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_get_scorm_sco_tracks

> models::ModScormGetScormScoTracks200Response mod_scorm_get_scorm_sco_tracks(mod_scorm_get_scorm_sco_tracks_request)
Retrieves SCO tracking data for the given user id and attempt number

Retrieves SCO tracking data for the given user id and attempt number

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_get_scorm_sco_tracks_request** | [**ModScormGetScormScoTracksRequest**](ModScormGetScormScoTracksRequest.md) |  | [required] |

### Return type

[**models::ModScormGetScormScoTracks200Response**](mod_scorm_get_scorm_sco_tracks_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_get_scorm_scoes

> models::ModScormGetScormScoes200Response mod_scorm_get_scorm_scoes(mod_scorm_get_scorm_scoes_request)
Returns a list containing all the scoes data related to the given scorm id

Returns a list containing all the scoes data related to the given scorm id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_get_scorm_scoes_request** | [**ModScormGetScormScoesRequest**](ModScormGetScormScoesRequest.md) |  | [required] |

### Return type

[**models::ModScormGetScormScoes200Response**](mod_scorm_get_scorm_scoes_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_get_scorm_user_data

> models::ModScormGetScormUserData200Response mod_scorm_get_scorm_user_data(mod_scorm_get_scorm_user_data_request)
Retrieves user tracking and SCO data and default SCORM values

Retrieves user tracking and SCO data and default SCORM values

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_get_scorm_user_data_request** | [**ModScormGetScormUserDataRequest**](ModScormGetScormUserDataRequest.md) |  | [required] |

### Return type

[**models::ModScormGetScormUserData200Response**](mod_scorm_get_scorm_user_data_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_get_scorms_by_courses

> models::ModScormGetScormsByCourses200Response mod_scorm_get_scorms_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModScormGetScormsByCourses200Response**](mod_scorm_get_scorms_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_insert_scorm_tracks

> models::ModScormInsertScormTracks200Response mod_scorm_insert_scorm_tracks(mod_scorm_insert_scorm_tracks_request)
Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_insert_scorm_tracks_request** | [**ModScormInsertScormTracksRequest**](ModScormInsertScormTracksRequest.md) |  | [required] |

### Return type

[**models::ModScormInsertScormTracks200Response**](mod_scorm_insert_scorm_tracks_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_launch_sco

> models::CoreCalendarDeleteSubscription200Response mod_scorm_launch_sco(mod_scorm_launch_sco_request)
Trigger the SCO launched event.

Trigger the SCO launched event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_launch_sco_request** | [**ModScormLaunchScoRequest**](ModScormLaunchScoRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_scorm_view_scorm

> models::CoreCalendarDeleteSubscription200Response mod_scorm_view_scorm(mod_scorm_view_scorm_request)
Trigger the course module viewed event.

Trigger the course module viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_scorm_view_scorm_request** | [**ModScormViewScormRequest**](ModScormViewScormRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


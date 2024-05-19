# \ModBigbluebuttonbnApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_bigbluebuttonbn_can_join**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_can_join) | **POST** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not.
[**mod_bigbluebuttonbn_completion_validate**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_completion_validate) | **POST** /mod_bigbluebuttonbn_completion_validate | Validate completion
[**mod_bigbluebuttonbn_end_meeting**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_end_meeting) | **POST** /mod_bigbluebuttonbn_end_meeting | End a meeting
[**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses) | **POST** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
[**mod_bigbluebuttonbn_get_join_url**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_join_url) | **POST** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist.
[**mod_bigbluebuttonbn_get_recordings**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_recordings) | **POST** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable.
[**mod_bigbluebuttonbn_get_recordings_to_import**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_get_recordings_to_import) | **POST** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable.
[**mod_bigbluebuttonbn_meeting_info**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_meeting_info) | **POST** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting
[**mod_bigbluebuttonbn_update_recording**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_update_recording) | **POST** /mod_bigbluebuttonbn_update_recording | Update a single recording
[**mod_bigbluebuttonbn_view_bigbluebuttonbn**](ModBigbluebuttonbnApi.md#mod_bigbluebuttonbn_view_bigbluebuttonbn) | **POST** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status.



## mod_bigbluebuttonbn_can_join

> models::ModBigbluebuttonbnCanJoin200Response mod_bigbluebuttonbn_can_join(mod_bigbluebuttonbn_can_join_request)
Returns information if the current user can join or not.

Returns information if the current user can join or not.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_can_join_request** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md) |  | [required] |

### Return type

[**models::ModBigbluebuttonbnCanJoin200Response**](mod_bigbluebuttonbn_can_join_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_completion_validate

> models::CoreCohortAddCohortMembers200Response mod_bigbluebuttonbn_completion_validate(mod_bigbluebuttonbn_completion_validate_request)
Validate completion

Validate completion

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_completion_validate_request** | [**ModBigbluebuttonbnCompletionValidateRequest**](ModBigbluebuttonbnCompletionValidateRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_end_meeting

> models::CoreCohortAddCohortMembers200Response mod_bigbluebuttonbn_end_meeting(mod_bigbluebuttonbn_end_meeting_request)
End a meeting

End a meeting

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_end_meeting_request** | [**ModBigbluebuttonbnEndMeetingRequest**](ModBigbluebuttonbnEndMeetingRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses

> models::ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response**](mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_get_join_url

> models::ModBigbluebuttonbnGetJoinUrl200Response mod_bigbluebuttonbn_get_join_url(mod_bigbluebuttonbn_can_join_request)
Get the join URL for the meeting and create if it does not exist.

Get the join URL for the meeting and create if it does not exist.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_can_join_request** | [**ModBigbluebuttonbnCanJoinRequest**](ModBigbluebuttonbnCanJoinRequest.md) |  | [required] |

### Return type

[**models::ModBigbluebuttonbnGetJoinUrl200Response**](mod_bigbluebuttonbn_get_join_url_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_get_recordings

> models::ModBigbluebuttonbnGetRecordings200Response mod_bigbluebuttonbn_get_recordings(mod_bigbluebuttonbn_get_recordings_request)
Returns a list of recordings ready to be processed by a datatable.

Returns a list of recordings ready to be processed by a datatable.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_recordings_request** | [**ModBigbluebuttonbnGetRecordingsRequest**](ModBigbluebuttonbnGetRecordingsRequest.md) |  | [required] |

### Return type

[**models::ModBigbluebuttonbnGetRecordings200Response**](mod_bigbluebuttonbn_get_recordings_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_get_recordings_to_import

> models::ModBigbluebuttonbnGetRecordingsToImport200Response mod_bigbluebuttonbn_get_recordings_to_import(mod_bigbluebuttonbn_get_recordings_to_import_request)
Returns a list of recordings ready to import to be processed by a datatable.

Returns a list of recordings ready to import to be processed by a datatable.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_recordings_to_import_request** | [**ModBigbluebuttonbnGetRecordingsToImportRequest**](ModBigbluebuttonbnGetRecordingsToImportRequest.md) |  | [required] |

### Return type

[**models::ModBigbluebuttonbnGetRecordingsToImport200Response**](mod_bigbluebuttonbn_get_recordings_to_import_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_meeting_info

> models::ModBigbluebuttonbnMeetingInfo200Response mod_bigbluebuttonbn_meeting_info(mod_bigbluebuttonbn_meeting_info_request)
Get displayable information on the meeting

Get displayable information on the meeting

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_meeting_info_request** | [**ModBigbluebuttonbnMeetingInfoRequest**](ModBigbluebuttonbnMeetingInfoRequest.md) |  | [required] |

### Return type

[**models::ModBigbluebuttonbnMeetingInfo200Response**](mod_bigbluebuttonbn_meeting_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_update_recording

> serde_json::Value mod_bigbluebuttonbn_update_recording(mod_bigbluebuttonbn_update_recording_request)
Update a single recording

Update a single recording

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_update_recording_request** | [**ModBigbluebuttonbnUpdateRecordingRequest**](ModBigbluebuttonbnUpdateRecordingRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_bigbluebuttonbn_view_bigbluebuttonbn

> models::CoreCalendarDeleteSubscription200Response mod_bigbluebuttonbn_view_bigbluebuttonbn(mod_bigbluebuttonbn_view_bigbluebuttonbn_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_view_bigbluebuttonbn_request** | [**ModBigbluebuttonbnViewBigbluebuttonbnRequest**](ModBigbluebuttonbnViewBigbluebuttonbnRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


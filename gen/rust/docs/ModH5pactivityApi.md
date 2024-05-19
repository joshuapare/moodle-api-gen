# \ModH5pactivityApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_h5pactivity_get_attempts**](ModH5pactivityApi.md#mod_h5pactivity_get_attempts) | **POST** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts.
[**mod_h5pactivity_get_h5pactivities_by_courses**](ModH5pactivityApi.md#mod_h5pactivity_get_h5pactivities_by_courses) | **POST** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
[**mod_h5pactivity_get_h5pactivity_access_information**](ModH5pactivityApi.md#mod_h5pactivity_get_h5pactivity_access_information) | **POST** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity.
[**mod_h5pactivity_get_results**](ModH5pactivityApi.md#mod_h5pactivity_get_results) | **POST** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results.
[**mod_h5pactivity_get_user_attempts**](ModH5pactivityApi.md#mod_h5pactivity_get_user_attempts) | **POST** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts.
[**mod_h5pactivity_log_report_viewed**](ModH5pactivityApi.md#mod_h5pactivity_log_report_viewed) | **POST** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed.
[**mod_h5pactivity_view_h5pactivity**](ModH5pactivityApi.md#mod_h5pactivity_view_h5pactivity) | **POST** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status.



## mod_h5pactivity_get_attempts

> models::ModH5pactivityGetAttempts200Response mod_h5pactivity_get_attempts(mod_h5pactivity_get_attempts_request)
Return the information needed to list a user attempts.

Return the information needed to list a user attempts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_h5pactivity_get_attempts_request** | [**ModH5pactivityGetAttemptsRequest**](ModH5pactivityGetAttemptsRequest.md) |  | [required] |

### Return type

[**models::ModH5pactivityGetAttempts200Response**](mod_h5pactivity_get_attempts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_h5pactivity_get_h5pactivities_by_courses

> models::ModH5pactivityGetH5pactivitiesByCourses200Response mod_h5pactivity_get_h5pactivities_by_courses(mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request)
Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request** | [**ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest**](ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModH5pactivityGetH5pactivitiesByCourses200Response**](mod_h5pactivity_get_h5pactivities_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_h5pactivity_get_h5pactivity_access_information

> models::ModH5pactivityGetH5pactivityAccessInformation200Response mod_h5pactivity_get_h5pactivity_access_information(mod_h5pactivity_get_h5pactivity_access_information_request)
Return access information for a given h5p activity.

Return access information for a given h5p activity.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_h5pactivity_get_h5pactivity_access_information_request** | [**ModH5pactivityGetH5pactivityAccessInformationRequest**](ModH5pactivityGetH5pactivityAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModH5pactivityGetH5pactivityAccessInformation200Response**](mod_h5pactivity_get_h5pactivity_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_h5pactivity_get_results

> models::ModH5pactivityGetResults200Response mod_h5pactivity_get_results(mod_h5pactivity_get_results_request)
Return the information needed to list a user attempt results.

Return the information needed to list a user attempt results.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_h5pactivity_get_results_request** | [**ModH5pactivityGetResultsRequest**](ModH5pactivityGetResultsRequest.md) |  | [required] |

### Return type

[**models::ModH5pactivityGetResults200Response**](mod_h5pactivity_get_results_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_h5pactivity_get_user_attempts

> models::ModH5pactivityGetUserAttempts200Response mod_h5pactivity_get_user_attempts(mod_h5pactivity_get_user_attempts_request)
Return the information needed to list all enrolled user attempts.

Return the information needed to list all enrolled user attempts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_h5pactivity_get_user_attempts_request** | [**ModH5pactivityGetUserAttemptsRequest**](ModH5pactivityGetUserAttemptsRequest.md) |  | [required] |

### Return type

[**models::ModH5pactivityGetUserAttempts200Response**](mod_h5pactivity_get_user_attempts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_h5pactivity_log_report_viewed

> models::CoreCalendarDeleteSubscription200Response mod_h5pactivity_log_report_viewed(mod_h5pactivity_log_report_viewed_request)
Log that the h5pactivity was viewed.

Log that the h5pactivity was viewed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_h5pactivity_log_report_viewed_request** | [**ModH5pactivityLogReportViewedRequest**](ModH5pactivityLogReportViewedRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_h5pactivity_view_h5pactivity

> models::CoreCalendarDeleteSubscription200Response mod_h5pactivity_view_h5pactivity(mod_h5pactivity_view_h5pactivity_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_h5pactivity_view_h5pactivity_request** | [**ModH5pactivityViewH5pactivityRequest**](ModH5pactivityViewH5pactivityRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# \ToolUsertoursApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_usertours_complete_tour**](ToolUsertoursApi.md#tool_usertours_complete_tour) | **POST** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user
[**tool_usertours_fetch_and_start_tour**](ToolUsertoursApi.md#tool_usertours_fetch_and_start_tour) | **POST** /tool_usertours_fetch_and_start_tour | Fetch the specified tour
[**tool_usertours_reset_tour**](ToolUsertoursApi.md#tool_usertours_reset_tour) | **POST** /tool_usertours_reset_tour | Remove the specified tour
[**tool_usertours_step_shown**](ToolUsertoursApi.md#tool_usertours_step_shown) | **POST** /tool_usertours_step_shown | Mark the specified step as completed for the current user



## tool_usertours_complete_tour

> serde_json::Value tool_usertours_complete_tour(tool_usertours_complete_tour_request)
Mark the specified tour as completed for the current user

Mark the specified tour as completed for the current user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_usertours_complete_tour_request** | [**ToolUsertoursCompleteTourRequest**](ToolUsertoursCompleteTourRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_usertours_fetch_and_start_tour

> models::ToolUsertoursFetchAndStartTour200Response tool_usertours_fetch_and_start_tour(tool_usertours_fetch_and_start_tour_request)
Fetch the specified tour

Fetch the specified tour

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_usertours_fetch_and_start_tour_request** | [**ToolUsertoursFetchAndStartTourRequest**](ToolUsertoursFetchAndStartTourRequest.md) |  | [required] |

### Return type

[**models::ToolUsertoursFetchAndStartTour200Response**](tool_usertours_fetch_and_start_tour_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_usertours_reset_tour

> models::ToolUsertoursResetTour200Response tool_usertours_reset_tour(tool_usertours_reset_tour_request)
Remove the specified tour

Remove the specified tour

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_usertours_reset_tour_request** | [**ToolUsertoursResetTourRequest**](ToolUsertoursResetTourRequest.md) |  | [required] |

### Return type

[**models::ToolUsertoursResetTour200Response**](tool_usertours_reset_tour_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_usertours_step_shown

> serde_json::Value tool_usertours_step_shown(tool_usertours_step_shown_request)
Mark the specified step as completed for the current user

Mark the specified step as completed for the current user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_usertours_step_shown_request** | [**ToolUsertoursStepShownRequest**](ToolUsertoursStepShownRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


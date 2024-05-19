# \ToolAnalyticsApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_analytics_potential_contexts**](ToolAnalyticsApi.md#tool_analytics_potential_contexts) | **POST** /tool_analytics_potential_contexts | Retrieve the list of potential contexts for a model.



## tool_analytics_potential_contexts

> serde_json::Value tool_analytics_potential_contexts(tool_analytics_potential_contexts_request)
Retrieve the list of potential contexts for a model.

Retrieve the list of potential contexts for a model.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_analytics_potential_contexts_request** | [**ToolAnalyticsPotentialContextsRequest**](ToolAnalyticsPotentialContextsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


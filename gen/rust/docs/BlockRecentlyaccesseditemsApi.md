# \BlockRecentlyaccesseditemsApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block_recentlyaccesseditems_get_recent_items**](BlockRecentlyaccesseditemsApi.md#block_recentlyaccesseditems_get_recent_items) | **POST** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently.



## block_recentlyaccesseditems_get_recent_items

> serde_json::Value block_recentlyaccesseditems_get_recent_items(block_recentlyaccesseditems_get_recent_items_request)
List of items a user has accessed most recently.

List of items a user has accessed most recently.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_recentlyaccesseditems_get_recent_items_request** | [**BlockRecentlyaccesseditemsGetRecentItemsRequest**](BlockRecentlyaccesseditemsGetRecentItemsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


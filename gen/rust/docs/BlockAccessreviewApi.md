# \BlockAccessreviewApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block_accessreview_get_module_data**](BlockAccessreviewApi.md#block_accessreview_get_module_data) | **POST** /block_accessreview_get_module_data | Gets error data for course modules.
[**block_accessreview_get_section_data**](BlockAccessreviewApi.md#block_accessreview_get_section_data) | **POST** /block_accessreview_get_section_data | Gets error data for course sections.



## block_accessreview_get_module_data

> serde_json::Value block_accessreview_get_module_data(block_accessreview_get_module_data_request)
Gets error data for course modules.

Gets error data for course modules.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_accessreview_get_module_data_request** | [**BlockAccessreviewGetModuleDataRequest**](BlockAccessreviewGetModuleDataRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_accessreview_get_section_data

> serde_json::Value block_accessreview_get_section_data(block_accessreview_get_section_data_request)
Gets error data for course sections.

Gets error data for course sections.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_accessreview_get_section_data_request** | [**BlockAccessreviewGetSectionDataRequest**](BlockAccessreviewGetSectionDataRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


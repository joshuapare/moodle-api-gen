# \ToolIomadpolicyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_iomadpolicy_get_iomadpolicy_version**](ToolIomadpolicyApi.md#tool_iomadpolicy_get_iomadpolicy_version) | **POST** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version
[**tool_iomadpolicy_submit_accept_on_behalf**](ToolIomadpolicyApi.md#tool_iomadpolicy_submit_accept_on_behalf) | **POST** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users



## tool_iomadpolicy_get_iomadpolicy_version

> models::ToolIomadpolicyGetIomadpolicyVersion200Response tool_iomadpolicy_get_iomadpolicy_version(tool_iomadpolicy_get_iomadpolicy_version_request)
Fetch the details of a iomadpolicy version

Fetch the details of a iomadpolicy version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_iomadpolicy_get_iomadpolicy_version_request** | [**ToolIomadpolicyGetIomadpolicyVersionRequest**](ToolIomadpolicyGetIomadpolicyVersionRequest.md) |  | [required] |

### Return type

[**models::ToolIomadpolicyGetIomadpolicyVersion200Response**](tool_iomadpolicy_get_iomadpolicy_version_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_iomadpolicy_submit_accept_on_behalf

> serde_json::Value tool_iomadpolicy_submit_accept_on_behalf(tool_iomadpolicy_submit_accept_on_behalf_request)
Accept policies on behalf of other users

Accept policies on behalf of other users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_iomadpolicy_submit_accept_on_behalf_request** | [**ToolIomadpolicySubmitAcceptOnBehalfRequest**](ToolIomadpolicySubmitAcceptOnBehalfRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


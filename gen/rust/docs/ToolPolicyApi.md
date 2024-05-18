# \ToolPolicyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_policy_get_policy_version**](ToolPolicyApi.md#tool_policy_get_policy_version) | **POST** /tool_policy_get_policy_version | Fetch the details of a policy version
[**tool_policy_submit_accept_on_behalf**](ToolPolicyApi.md#tool_policy_submit_accept_on_behalf) | **POST** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users



## tool_policy_get_policy_version

> models::ToolPolicyGetPolicyVersion200Response tool_policy_get_policy_version(tool_policy_get_policy_version_request)
Fetch the details of a policy version

Fetch the details of a policy version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_policy_get_policy_version_request** | [**ToolPolicyGetPolicyVersionRequest**](ToolPolicyGetPolicyVersionRequest.md) |  | [required] |

### Return type

[**models::ToolPolicyGetPolicyVersion200Response**](tool_policy_get_policy_version_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_policy_submit_accept_on_behalf

> serde_json::Value tool_policy_submit_accept_on_behalf(tool_policy_submit_accept_on_behalf_request)
Accept policies on behalf of other users

Accept policies on behalf of other users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_policy_submit_accept_on_behalf_request** | [**ToolPolicySubmitAcceptOnBehalfRequest**](ToolPolicySubmitAcceptOnBehalfRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


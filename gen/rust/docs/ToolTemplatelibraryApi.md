# \ToolTemplatelibraryApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_templatelibrary_list_templates**](ToolTemplatelibraryApi.md#tool_templatelibrary_list_templates) | **POST** /tool_templatelibrary_list_templates | List/search templates by component.
[**tool_templatelibrary_load_canonical_template**](ToolTemplatelibraryApi.md#tool_templatelibrary_load_canonical_template) | **POST** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one).



## tool_templatelibrary_list_templates

> serde_json::Value tool_templatelibrary_list_templates(tool_templatelibrary_list_templates_request)
List/search templates by component.

List/search templates by component.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_templatelibrary_list_templates_request** | [**ToolTemplatelibraryListTemplatesRequest**](ToolTemplatelibraryListTemplatesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_templatelibrary_load_canonical_template

> serde_json::Value tool_templatelibrary_load_canonical_template(tool_templatelibrary_load_canonical_template_request)
Load a canonical template by name (not the theme overidden one).

Load a canonical template by name (not the theme overidden one).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_templatelibrary_load_canonical_template_request** | [**ToolTemplatelibraryLoadCanonicalTemplateRequest**](ToolTemplatelibraryLoadCanonicalTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


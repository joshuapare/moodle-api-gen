# \EnrolMetaApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_meta_add_instances**](EnrolMetaApi.md#enrol_meta_add_instances) | **POST** /enrol_meta_add_instances | Add meta enrolment instances
[**enrol_meta_delete_instances**](EnrolMetaApi.md#enrol_meta_delete_instances) | **POST** /enrol_meta_delete_instances | Delete meta enrolment instances



## enrol_meta_add_instances

> serde_json::Value enrol_meta_add_instances(enrol_meta_add_instances_request)
Add meta enrolment instances

Add meta enrolment instances

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_meta_add_instances_request** | [**EnrolMetaAddInstancesRequest**](EnrolMetaAddInstancesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## enrol_meta_delete_instances

> serde_json::Value enrol_meta_delete_instances(enrol_meta_delete_instances_request)
Delete meta enrolment instances

Delete meta enrolment instances

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_meta_delete_instances_request** | [**EnrolMetaDeleteInstancesRequest**](EnrolMetaDeleteInstancesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


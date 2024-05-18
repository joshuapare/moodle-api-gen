# \EnrolSelfApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_self_enrol_user**](EnrolSelfApi.md#enrol_self_enrol_user) | **POST** /enrol_self_enrol_user | Self enrol the current user in the given course.
[**enrol_self_get_instance_info**](EnrolSelfApi.md#enrol_self_get_instance_info) | **POST** /enrol_self_get_instance_info | self enrolment instance information.



## enrol_self_enrol_user

> models::EnrolSelfEnrolUser200Response enrol_self_enrol_user(enrol_self_enrol_user_request)
Self enrol the current user in the given course.

Self enrol the current user in the given course.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_self_enrol_user_request** | [**EnrolSelfEnrolUserRequest**](EnrolSelfEnrolUserRequest.md) |  | [required] |

### Return type

[**models::EnrolSelfEnrolUser200Response**](enrol_self_enrol_user_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## enrol_self_get_instance_info

> models::EnrolSelfGetInstanceInfo200Response enrol_self_get_instance_info(enrol_self_get_instance_info_request)
self enrolment instance information.

self enrolment instance information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_self_get_instance_info_request** | [**EnrolSelfGetInstanceInfoRequest**](EnrolSelfGetInstanceInfoRequest.md) |  | [required] |

### Return type

[**models::EnrolSelfGetInstanceInfo200Response**](enrol_self_get_instance_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


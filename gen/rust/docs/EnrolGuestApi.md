# \EnrolGuestApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_guest_get_instance_info**](EnrolGuestApi.md#enrol_guest_get_instance_info) | **POST** /enrol_guest_get_instance_info | Return guest enrolment instance information.
[**enrol_guest_validate_password**](EnrolGuestApi.md#enrol_guest_validate_password) | **POST** /enrol_guest_validate_password | Perform password validation.



## enrol_guest_get_instance_info

> models::EnrolGuestGetInstanceInfo200Response enrol_guest_get_instance_info(enrol_guest_get_instance_info_request)
Return guest enrolment instance information.

Return guest enrolment instance information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_guest_get_instance_info_request** | [**EnrolGuestGetInstanceInfoRequest**](EnrolGuestGetInstanceInfoRequest.md) |  | [required] |

### Return type

[**models::EnrolGuestGetInstanceInfo200Response**](enrol_guest_get_instance_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## enrol_guest_validate_password

> models::EnrolGuestValidatePassword200Response enrol_guest_validate_password(enrol_guest_validate_password_request)
Perform password validation.

Perform password validation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_guest_validate_password_request** | [**EnrolGuestValidatePasswordRequest**](EnrolGuestValidatePasswordRequest.md) |  | [required] |

### Return type

[**models::EnrolGuestValidatePassword200Response**](enrol_guest_validate_password_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# \EnrolLicenseApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrol_license_enrol_user**](EnrolLicenseApi.md#enrol_license_enrol_user) | **POST** /enrol_license_enrol_user | License enrol the current user in the given course.
[**enrol_license_get_instance_info**](EnrolLicenseApi.md#enrol_license_get_instance_info) | **POST** /enrol_license_get_instance_info | License enrolment instance information.



## enrol_license_enrol_user

> models::EnrolLicenseEnrolUser200Response enrol_license_enrol_user(enrol_license_enrol_user_request)
License enrol the current user in the given course.

License enrol the current user in the given course.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_license_enrol_user_request** | [**EnrolLicenseEnrolUserRequest**](EnrolLicenseEnrolUserRequest.md) |  | [required] |

### Return type

[**models::EnrolLicenseEnrolUser200Response**](enrol_license_enrol_user_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## enrol_license_get_instance_info

> models::EnrolLicenseGetInstanceInfo200Response enrol_license_get_instance_info(enrol_license_get_instance_info_request)
License enrolment instance information.

License enrolment instance information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**enrol_license_get_instance_info_request** | [**EnrolLicenseGetInstanceInfoRequest**](EnrolLicenseGetInstanceInfoRequest.md) |  | [required] |

### Return type

[**models::EnrolLicenseGetInstanceInfo200Response**](enrol_license_get_instance_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


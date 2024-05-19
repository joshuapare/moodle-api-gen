# \AuthEmailApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth_email_get_signup_settings**](AuthEmailApi.md#auth_email_get_signup_settings) | **POST** /auth_email_get_signup_settings | Get the signup required settings and profile fields.
[**auth_email_signup_user**](AuthEmailApi.md#auth_email_signup_user) | **POST** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site.



## auth_email_get_signup_settings

> models::AuthEmailGetSignupSettings200Response auth_email_get_signup_settings()
Get the signup required settings and profile fields.

Get the signup required settings and profile fields.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::AuthEmailGetSignupSettings200Response**](auth_email_get_signup_settings_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## auth_email_signup_user

> models::AuthEmailSignupUser200Response auth_email_signup_user(auth_email_signup_user_request)
Adds a new user (pendingto be confirmed) in the site.

Adds a new user (pendingto be confirmed) in the site.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**auth_email_signup_user_request** | [**AuthEmailSignupUserRequest**](AuthEmailSignupUserRequest.md) |  | [required] |

### Return type

[**models::AuthEmailSignupUser200Response**](auth_email_signup_user_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# \AuthEmailAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuthEmailGetSignupSettings**](AuthEmailAPI.md#AuthEmailGetSignupSettings) | **Post** /auth_email_get_signup_settings | Get the signup required settings and profile fields.
[**AuthEmailSignupUser**](AuthEmailAPI.md#AuthEmailSignupUser) | **Post** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site.



## AuthEmailGetSignupSettings

> AuthEmailGetSignupSettings200Response AuthEmailGetSignupSettings(ctx).Execute()

Get the signup required settings and profile fields.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthEmailAPI.AuthEmailGetSignupSettings(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthEmailAPI.AuthEmailGetSignupSettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthEmailGetSignupSettings`: AuthEmailGetSignupSettings200Response
	fmt.Fprintf(os.Stdout, "Response from `AuthEmailAPI.AuthEmailGetSignupSettings`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAuthEmailGetSignupSettingsRequest struct via the builder pattern


### Return type

[**AuthEmailGetSignupSettings200Response**](AuthEmailGetSignupSettings200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AuthEmailSignupUser

> AuthEmailSignupUser200Response AuthEmailSignupUser(ctx).AuthEmailSignupUserRequest(authEmailSignupUserRequest).Execute()

Adds a new user (pendingto be confirmed) in the site.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	authEmailSignupUserRequest := *openapiclient.NewAuthEmailSignupUserRequest("Email_example", "Firstname_example", "Lastname_example", "Password_example", "Username_example") // AuthEmailSignupUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthEmailAPI.AuthEmailSignupUser(context.Background()).AuthEmailSignupUserRequest(authEmailSignupUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthEmailAPI.AuthEmailSignupUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthEmailSignupUser`: AuthEmailSignupUser200Response
	fmt.Fprintf(os.Stdout, "Response from `AuthEmailAPI.AuthEmailSignupUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuthEmailSignupUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authEmailSignupUserRequest** | [**AuthEmailSignupUserRequest**](AuthEmailSignupUserRequest.md) |  | 

### Return type

[**AuthEmailSignupUser200Response**](AuthEmailSignupUser200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


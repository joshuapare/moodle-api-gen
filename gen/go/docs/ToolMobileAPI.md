# \ToolMobileAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolMobileCallExternalFunctions**](ToolMobileAPI.md#ToolMobileCallExternalFunctions) | **Post** /tool_mobile_call_external_functions | Call multiple external functions and return all responses.
[**ToolMobileGetAutologinKey**](ToolMobileAPI.md#ToolMobileGetAutologinKey) | **Post** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
[**ToolMobileGetConfig**](ToolMobileAPI.md#ToolMobileGetConfig) | **Post** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section.
[**ToolMobileGetContent**](ToolMobileAPI.md#ToolMobileGetContent) | **Post** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app.
[**ToolMobileGetPluginsSupportingMobile**](ToolMobileAPI.md#ToolMobileGetPluginsSupportingMobile) | **Post** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app.
[**ToolMobileGetPublicConfig**](ToolMobileAPI.md#ToolMobileGetPublicConfig) | **Post** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication.
[**ToolMobileGetTokensForQrLogin**](ToolMobileAPI.md#ToolMobileGetTokensForQrLogin) | **Post** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login.
[**ToolMobileValidateSubscriptionKey**](ToolMobileAPI.md#ToolMobileValidateSubscriptionKey) | **Post** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid.



## ToolMobileCallExternalFunctions

> ToolMobileCallExternalFunctions200Response ToolMobileCallExternalFunctions(ctx).ToolMobileCallExternalFunctionsRequest(toolMobileCallExternalFunctionsRequest).Execute()

Call multiple external functions and return all responses.



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
	toolMobileCallExternalFunctionsRequest := *openapiclient.NewToolMobileCallExternalFunctionsRequest([]openapiclient.ToolMobileCallExternalFunctionsRequestRequestsInner{*openapiclient.NewToolMobileCallExternalFunctionsRequestRequestsInner()}) // ToolMobileCallExternalFunctionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileCallExternalFunctions(context.Background()).ToolMobileCallExternalFunctionsRequest(toolMobileCallExternalFunctionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileCallExternalFunctions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileCallExternalFunctions`: ToolMobileCallExternalFunctions200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileCallExternalFunctions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileCallExternalFunctionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMobileCallExternalFunctionsRequest** | [**ToolMobileCallExternalFunctionsRequest**](ToolMobileCallExternalFunctionsRequest.md) |  | 

### Return type

[**ToolMobileCallExternalFunctions200Response**](ToolMobileCallExternalFunctions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMobileGetAutologinKey

> ToolMobileGetAutologinKey200Response ToolMobileGetAutologinKey(ctx).ToolMobileGetAutologinKeyRequest(toolMobileGetAutologinKeyRequest).Execute()

Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.



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
	toolMobileGetAutologinKeyRequest := *openapiclient.NewToolMobileGetAutologinKeyRequest("Privatetoken_example") // ToolMobileGetAutologinKeyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileGetAutologinKey(context.Background()).ToolMobileGetAutologinKeyRequest(toolMobileGetAutologinKeyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileGetAutologinKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileGetAutologinKey`: ToolMobileGetAutologinKey200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileGetAutologinKey`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileGetAutologinKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMobileGetAutologinKeyRequest** | [**ToolMobileGetAutologinKeyRequest**](ToolMobileGetAutologinKeyRequest.md) |  | 

### Return type

[**ToolMobileGetAutologinKey200Response**](ToolMobileGetAutologinKey200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMobileGetConfig

> ToolMobileGetConfig200Response ToolMobileGetConfig(ctx).ToolMobileGetConfigRequest(toolMobileGetConfigRequest).Execute()

Returns a list of the site configurations, filtering by section.



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
	toolMobileGetConfigRequest := *openapiclient.NewToolMobileGetConfigRequest() // ToolMobileGetConfigRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileGetConfig(context.Background()).ToolMobileGetConfigRequest(toolMobileGetConfigRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileGetConfig``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileGetConfig`: ToolMobileGetConfig200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileGetConfig`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileGetConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMobileGetConfigRequest** | [**ToolMobileGetConfigRequest**](ToolMobileGetConfigRequest.md) |  | 

### Return type

[**ToolMobileGetConfig200Response**](ToolMobileGetConfig200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMobileGetContent

> ToolMobileGetContent200Response ToolMobileGetContent(ctx).ToolMobileGetContentRequest(toolMobileGetContentRequest).Execute()

Returns a piece of content to be displayed in the Mobile app.



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
	toolMobileGetContentRequest := *openapiclient.NewToolMobileGetContentRequest("Component_example", "Method_example") // ToolMobileGetContentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileGetContent(context.Background()).ToolMobileGetContentRequest(toolMobileGetContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileGetContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileGetContent`: ToolMobileGetContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileGetContent`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileGetContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMobileGetContentRequest** | [**ToolMobileGetContentRequest**](ToolMobileGetContentRequest.md) |  | 

### Return type

[**ToolMobileGetContent200Response**](ToolMobileGetContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMobileGetPluginsSupportingMobile

> ToolMobileGetPluginsSupportingMobile200Response ToolMobileGetPluginsSupportingMobile(ctx).Execute()

Returns a list of Moodle plugins supporting the mobile app.



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
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileGetPluginsSupportingMobile(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileGetPluginsSupportingMobile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileGetPluginsSupportingMobile`: ToolMobileGetPluginsSupportingMobile200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileGetPluginsSupportingMobile`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileGetPluginsSupportingMobileRequest struct via the builder pattern


### Return type

[**ToolMobileGetPluginsSupportingMobile200Response**](ToolMobileGetPluginsSupportingMobile200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMobileGetPublicConfig

> ToolMobileGetPublicConfig200Response ToolMobileGetPublicConfig(ctx).Execute()

Returns a list of the site public settings, those not requiring authentication.



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
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileGetPublicConfig(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileGetPublicConfig``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileGetPublicConfig`: ToolMobileGetPublicConfig200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileGetPublicConfig`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileGetPublicConfigRequest struct via the builder pattern


### Return type

[**ToolMobileGetPublicConfig200Response**](ToolMobileGetPublicConfig200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMobileGetTokensForQrLogin

> ToolMobileGetTokensForQrLogin200Response ToolMobileGetTokensForQrLogin(ctx).ToolMobileGetTokensForQrLoginRequest(toolMobileGetTokensForQrLoginRequest).Execute()

Returns a WebService token (and private token) for QR login.



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
	toolMobileGetTokensForQrLoginRequest := *openapiclient.NewToolMobileGetTokensForQrLoginRequest("Qrloginkey_example", int32(123)) // ToolMobileGetTokensForQrLoginRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileGetTokensForQrLogin(context.Background()).ToolMobileGetTokensForQrLoginRequest(toolMobileGetTokensForQrLoginRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileGetTokensForQrLogin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileGetTokensForQrLogin`: ToolMobileGetTokensForQrLogin200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileGetTokensForQrLogin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileGetTokensForQrLoginRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMobileGetTokensForQrLoginRequest** | [**ToolMobileGetTokensForQrLoginRequest**](ToolMobileGetTokensForQrLoginRequest.md) |  | 

### Return type

[**ToolMobileGetTokensForQrLogin200Response**](ToolMobileGetTokensForQrLogin200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolMobileValidateSubscriptionKey

> ToolMobileValidateSubscriptionKey200Response ToolMobileValidateSubscriptionKey(ctx).ToolMobileValidateSubscriptionKeyRequest(toolMobileValidateSubscriptionKeyRequest).Execute()

Check if the given site subscription key is valid.



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
	toolMobileValidateSubscriptionKeyRequest := *openapiclient.NewToolMobileValidateSubscriptionKeyRequest("Key_example") // ToolMobileValidateSubscriptionKeyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolMobileAPI.ToolMobileValidateSubscriptionKey(context.Background()).ToolMobileValidateSubscriptionKeyRequest(toolMobileValidateSubscriptionKeyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolMobileAPI.ToolMobileValidateSubscriptionKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolMobileValidateSubscriptionKey`: ToolMobileValidateSubscriptionKey200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolMobileAPI.ToolMobileValidateSubscriptionKey`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolMobileValidateSubscriptionKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolMobileValidateSubscriptionKeyRequest** | [**ToolMobileValidateSubscriptionKeyRequest**](ToolMobileValidateSubscriptionKeyRequest.md) |  | 

### Return type

[**ToolMobileValidateSubscriptionKey200Response**](ToolMobileValidateSubscriptionKey200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


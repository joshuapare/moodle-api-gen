# \ModBookAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModBookGetBooksByCourses**](ModBookAPI.md#ModBookGetBooksByCourses) | **Post** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
[**ModBookViewBook**](ModBookAPI.md#ModBookViewBook) | **Post** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc...



## ModBookGetBooksByCourses

> ModBookGetBooksByCourses200Response ModBookGetBooksByCourses(ctx).ModBookGetBooksByCoursesRequest(modBookGetBooksByCoursesRequest).Execute()

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.



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
	modBookGetBooksByCoursesRequest := *openapiclient.NewModBookGetBooksByCoursesRequest() // ModBookGetBooksByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBookAPI.ModBookGetBooksByCourses(context.Background()).ModBookGetBooksByCoursesRequest(modBookGetBooksByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBookAPI.ModBookGetBooksByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBookGetBooksByCourses`: ModBookGetBooksByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBookAPI.ModBookGetBooksByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBookGetBooksByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBookGetBooksByCoursesRequest** | [**ModBookGetBooksByCoursesRequest**](ModBookGetBooksByCoursesRequest.md) |  | 

### Return type

[**ModBookGetBooksByCourses200Response**](ModBookGetBooksByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModBookViewBook

> CoreCalendarDeleteSubscription200Response ModBookViewBook(ctx).ModBookViewBookRequest(modBookViewBookRequest).Execute()

Simulate the view.php web interface book: trigger events, completion, etc...



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
	modBookViewBookRequest := *openapiclient.NewModBookViewBookRequest(int32(123)) // ModBookViewBookRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModBookAPI.ModBookViewBook(context.Background()).ModBookViewBookRequest(modBookViewBookRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModBookAPI.ModBookViewBook``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModBookViewBook`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModBookAPI.ModBookViewBook`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModBookViewBookRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modBookViewBookRequest** | [**ModBookViewBookRequest**](ModBookViewBookRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


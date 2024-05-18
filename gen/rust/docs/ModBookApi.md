# \ModBookApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_book_get_books_by_courses**](ModBookApi.md#mod_book_get_books_by_courses) | **POST** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
[**mod_book_view_book**](ModBookApi.md#mod_book_view_book) | **POST** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc...



## mod_book_get_books_by_courses

> models::ModBookGetBooksByCourses200Response mod_book_get_books_by_courses(mod_book_get_books_by_courses_request)
Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_book_get_books_by_courses_request** | [**ModBookGetBooksByCoursesRequest**](ModBookGetBooksByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModBookGetBooksByCourses200Response**](mod_book_get_books_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_book_view_book

> models::CoreCalendarDeleteSubscription200Response mod_book_view_book(mod_book_view_book_request)
Simulate the view.php web interface book: trigger events, completion, etc...

Simulate the view.php web interface book: trigger events, completion, etc...

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_book_view_book_request** | [**ModBookViewBookRequest**](ModBookViewBookRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


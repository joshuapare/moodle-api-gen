# openapi_client.ModBookApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_book_get_books_by_courses**](ModBookApi.md#mod_book_get_books_by_courses) | **POST** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
[**mod_book_view_book**](ModBookApi.md#mod_book_view_book) | **POST** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc...


# **mod_book_get_books_by_courses**
> ModBookGetBooksByCourses200Response mod_book_get_books_by_courses(mod_book_get_books_by_courses_request)

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_book_get_books_by_courses200_response import ModBookGetBooksByCourses200Response
from openapi_client.models.mod_book_get_books_by_courses_request import ModBookGetBooksByCoursesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ModBookApi(api_client)
    mod_book_get_books_by_courses_request = openapi_client.ModBookGetBooksByCoursesRequest() # ModBookGetBooksByCoursesRequest | 

    try:
        # Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
        api_response = api_instance.mod_book_get_books_by_courses(mod_book_get_books_by_courses_request)
        print("The response of ModBookApi->mod_book_get_books_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBookApi->mod_book_get_books_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_book_get_books_by_courses_request** | [**ModBookGetBooksByCoursesRequest**](ModBookGetBooksByCoursesRequest.md)|  | 

### Return type

[**ModBookGetBooksByCourses200Response**](ModBookGetBooksByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_book_view_book**
> CoreCalendarDeleteSubscription200Response mod_book_view_book(mod_book_view_book_request)

Simulate the view.php web interface book: trigger events, completion, etc...

Simulate the view.php web interface book: trigger events, completion, etc...

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_book_view_book_request import ModBookViewBookRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ModBookApi(api_client)
    mod_book_view_book_request = openapi_client.ModBookViewBookRequest() # ModBookViewBookRequest | 

    try:
        # Simulate the view.php web interface book: trigger events, completion, etc...
        api_response = api_instance.mod_book_view_book(mod_book_view_book_request)
        print("The response of ModBookApi->mod_book_view_book:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModBookApi->mod_book_view_book: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_book_view_book_request** | [**ModBookViewBookRequest**](ModBookViewBookRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


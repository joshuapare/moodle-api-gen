# Org.OpenAPITools.Api.ModBookApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModBookGetBooksByCourses**](ModBookApi.md#modbookgetbooksbycourses) | **POST** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned. |
| [**ModBookViewBook**](ModBookApi.md#modbookviewbook) | **POST** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc... |

<a id="modbookgetbooksbycourses"></a>
# **ModBookGetBooksByCourses**
> ModBookGetBooksByCourses200Response ModBookGetBooksByCourses (ModBookGetBooksByCoursesRequest modBookGetBooksByCoursesRequest)

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModBookGetBooksByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBookApi(config);
            var modBookGetBooksByCoursesRequest = new ModBookGetBooksByCoursesRequest(); // ModBookGetBooksByCoursesRequest | 

            try
            {
                // Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
                ModBookGetBooksByCourses200Response result = apiInstance.ModBookGetBooksByCourses(modBookGetBooksByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBookApi.ModBookGetBooksByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBookGetBooksByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
    ApiResponse<ModBookGetBooksByCourses200Response> response = apiInstance.ModBookGetBooksByCoursesWithHttpInfo(modBookGetBooksByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBookApi.ModBookGetBooksByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBookGetBooksByCoursesRequest** | [**ModBookGetBooksByCoursesRequest**](ModBookGetBooksByCoursesRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="modbookviewbook"></a>
# **ModBookViewBook**
> CoreCalendarDeleteSubscription200Response ModBookViewBook (ModBookViewBookRequest modBookViewBookRequest)

Simulate the view.php web interface book: trigger events, completion, etc...

Simulate the view.php web interface book: trigger events, completion, etc...

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModBookViewBookExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModBookApi(config);
            var modBookViewBookRequest = new ModBookViewBookRequest(); // ModBookViewBookRequest | 

            try
            {
                // Simulate the view.php web interface book: trigger events, completion, etc...
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModBookViewBook(modBookViewBookRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModBookApi.ModBookViewBook: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModBookViewBookWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Simulate the view.php web interface book: trigger events, completion, etc...
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModBookViewBookWithHttpInfo(modBookViewBookRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModBookApi.ModBookViewBookWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modBookViewBookRequest** | [**ModBookViewBookRequest**](ModBookViewBookRequest.md) |  |  |

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
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


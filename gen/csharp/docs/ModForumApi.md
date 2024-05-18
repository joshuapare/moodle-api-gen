# Org.OpenAPITools.Api.ModForumApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ModForumAddDiscussion**](ModForumApi.md#modforumadddiscussion) | **POST** /mod_forum_add_discussion | Add a new discussion into an existing forum. |
| [**ModForumAddDiscussionPost**](ModForumApi.md#modforumadddiscussionpost) | **POST** /mod_forum_add_discussion_post | Create new posts into an existing discussion. |
| [**ModForumCanAddDiscussion**](ModForumApi.md#modforumcanadddiscussion) | **POST** /mod_forum_can_add_discussion | Check if the current user can add discussions in the given forum (and optionally for the given group). |
| [**ModForumDeletePost**](ModForumApi.md#modforumdeletepost) | **POST** /mod_forum_delete_post | Deletes a post or a discussion completely when the post is the discussion topic. |
| [**ModForumGetDiscussionPost**](ModForumApi.md#modforumgetdiscussionpost) | **POST** /mod_forum_get_discussion_post | Get a particular discussion post. |
| [**ModForumGetDiscussionPosts**](ModForumApi.md#modforumgetdiscussionposts) | **POST** /mod_forum_get_discussion_posts | Returns a list of forum posts for a discussion. |
| [**ModForumGetDiscussionPostsByUserid**](ModForumApi.md#modforumgetdiscussionpostsbyuserid) | **POST** /mod_forum_get_discussion_posts_by_userid | Returns a list of forum posts for a discussion for a user. |
| [**ModForumGetForumAccessInformation**](ModForumApi.md#modforumgetforumaccessinformation) | **POST** /mod_forum_get_forum_access_information | Return capabilities information for a given forum. |
| [**ModForumGetForumDiscussions**](ModForumApi.md#modforumgetforumdiscussions) | **POST** /mod_forum_get_forum_discussions | Returns a list of forum discussions optionally sorted and paginated. |
| [**ModForumGetForumDiscussionsPaginated**](ModForumApi.md#modforumgetforumdiscussionspaginated) | **POST** /mod_forum_get_forum_discussions_paginated | ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated. |
| [**ModForumGetForumsByCourses**](ModForumApi.md#modforumgetforumsbycourses) | **POST** /mod_forum_get_forums_by_courses | Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned. |
| [**ModForumPrepareDraftAreaForPost**](ModForumApi.md#modforumpreparedraftareaforpost) | **POST** /mod_forum_prepare_draft_area_for_post | Prepares a draft area for editing a post. |
| [**ModForumSetLockState**](ModForumApi.md#modforumsetlockstate) | **POST** /mod_forum_set_lock_state | Set the lock state for the discussion |
| [**ModForumSetPinState**](ModForumApi.md#modforumsetpinstate) | **POST** /mod_forum_set_pin_state | Set the pin state |
| [**ModForumSetSubscriptionState**](ModForumApi.md#modforumsetsubscriptionstate) | **POST** /mod_forum_set_subscription_state | Set the subscription state |
| [**ModForumToggleFavouriteState**](ModForumApi.md#modforumtogglefavouritestate) | **POST** /mod_forum_toggle_favourite_state | Toggle the favourite state |
| [**ModForumUpdateDiscussionPost**](ModForumApi.md#modforumupdatediscussionpost) | **POST** /mod_forum_update_discussion_post | Updates a post or a discussion topic post. |
| [**ModForumViewForum**](ModForumApi.md#modforumviewforum) | **POST** /mod_forum_view_forum | Trigger the course module viewed event and update the module completion status. |
| [**ModForumViewForumDiscussion**](ModForumApi.md#modforumviewforumdiscussion) | **POST** /mod_forum_view_forum_discussion | Trigger the forum discussion viewed event. |

<a id="modforumadddiscussion"></a>
# **ModForumAddDiscussion**
> ModForumAddDiscussion200Response ModForumAddDiscussion (ModForumAddDiscussionRequest modForumAddDiscussionRequest)

Add a new discussion into an existing forum.

Add a new discussion into an existing forum.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumAddDiscussionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumAddDiscussionRequest = new ModForumAddDiscussionRequest(); // ModForumAddDiscussionRequest | 

            try
            {
                // Add a new discussion into an existing forum.
                ModForumAddDiscussion200Response result = apiInstance.ModForumAddDiscussion(modForumAddDiscussionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumAddDiscussion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumAddDiscussionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a new discussion into an existing forum.
    ApiResponse<ModForumAddDiscussion200Response> response = apiInstance.ModForumAddDiscussionWithHttpInfo(modForumAddDiscussionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumAddDiscussionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumAddDiscussionRequest** | [**ModForumAddDiscussionRequest**](ModForumAddDiscussionRequest.md) |  |  |

### Return type

[**ModForumAddDiscussion200Response**](ModForumAddDiscussion200Response.md)

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

<a id="modforumadddiscussionpost"></a>
# **ModForumAddDiscussionPost**
> ModForumAddDiscussionPost200Response ModForumAddDiscussionPost (ModForumAddDiscussionPostRequest modForumAddDiscussionPostRequest)

Create new posts into an existing discussion.

Create new posts into an existing discussion.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumAddDiscussionPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumAddDiscussionPostRequest = new ModForumAddDiscussionPostRequest(); // ModForumAddDiscussionPostRequest | 

            try
            {
                // Create new posts into an existing discussion.
                ModForumAddDiscussionPost200Response result = apiInstance.ModForumAddDiscussionPost(modForumAddDiscussionPostRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumAddDiscussionPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumAddDiscussionPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create new posts into an existing discussion.
    ApiResponse<ModForumAddDiscussionPost200Response> response = apiInstance.ModForumAddDiscussionPostWithHttpInfo(modForumAddDiscussionPostRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumAddDiscussionPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumAddDiscussionPostRequest** | [**ModForumAddDiscussionPostRequest**](ModForumAddDiscussionPostRequest.md) |  |  |

### Return type

[**ModForumAddDiscussionPost200Response**](ModForumAddDiscussionPost200Response.md)

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

<a id="modforumcanadddiscussion"></a>
# **ModForumCanAddDiscussion**
> ModForumCanAddDiscussion200Response ModForumCanAddDiscussion (ModForumCanAddDiscussionRequest modForumCanAddDiscussionRequest)

Check if the current user can add discussions in the given forum (and optionally for the given group).

Check if the current user can add discussions in the given forum (and optionally for the given group).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumCanAddDiscussionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumCanAddDiscussionRequest = new ModForumCanAddDiscussionRequest(); // ModForumCanAddDiscussionRequest | 

            try
            {
                // Check if the current user can add discussions in the given forum (and optionally for the given group).
                ModForumCanAddDiscussion200Response result = apiInstance.ModForumCanAddDiscussion(modForumCanAddDiscussionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumCanAddDiscussion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumCanAddDiscussionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Check if the current user can add discussions in the given forum (and optionally for the given group).
    ApiResponse<ModForumCanAddDiscussion200Response> response = apiInstance.ModForumCanAddDiscussionWithHttpInfo(modForumCanAddDiscussionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumCanAddDiscussionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumCanAddDiscussionRequest** | [**ModForumCanAddDiscussionRequest**](ModForumCanAddDiscussionRequest.md) |  |  |

### Return type

[**ModForumCanAddDiscussion200Response**](ModForumCanAddDiscussion200Response.md)

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

<a id="modforumdeletepost"></a>
# **ModForumDeletePost**
> ModForumDeletePost200Response ModForumDeletePost (ModForumDeletePostRequest modForumDeletePostRequest)

Deletes a post or a discussion completely when the post is the discussion topic.

Deletes a post or a discussion completely when the post is the discussion topic.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumDeletePostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumDeletePostRequest = new ModForumDeletePostRequest(); // ModForumDeletePostRequest | 

            try
            {
                // Deletes a post or a discussion completely when the post is the discussion topic.
                ModForumDeletePost200Response result = apiInstance.ModForumDeletePost(modForumDeletePostRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumDeletePost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumDeletePostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Deletes a post or a discussion completely when the post is the discussion topic.
    ApiResponse<ModForumDeletePost200Response> response = apiInstance.ModForumDeletePostWithHttpInfo(modForumDeletePostRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumDeletePostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumDeletePostRequest** | [**ModForumDeletePostRequest**](ModForumDeletePostRequest.md) |  |  |

### Return type

[**ModForumDeletePost200Response**](ModForumDeletePost200Response.md)

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

<a id="modforumgetdiscussionpost"></a>
# **ModForumGetDiscussionPost**
> ModForumGetDiscussionPost200Response ModForumGetDiscussionPost (ModForumGetDiscussionPostRequest modForumGetDiscussionPostRequest)

Get a particular discussion post.

Get a particular discussion post.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumGetDiscussionPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumGetDiscussionPostRequest = new ModForumGetDiscussionPostRequest(); // ModForumGetDiscussionPostRequest | 

            try
            {
                // Get a particular discussion post.
                ModForumGetDiscussionPost200Response result = apiInstance.ModForumGetDiscussionPost(modForumGetDiscussionPostRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumGetDiscussionPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumGetDiscussionPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a particular discussion post.
    ApiResponse<ModForumGetDiscussionPost200Response> response = apiInstance.ModForumGetDiscussionPostWithHttpInfo(modForumGetDiscussionPostRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumGetDiscussionPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumGetDiscussionPostRequest** | [**ModForumGetDiscussionPostRequest**](ModForumGetDiscussionPostRequest.md) |  |  |

### Return type

[**ModForumGetDiscussionPost200Response**](ModForumGetDiscussionPost200Response.md)

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

<a id="modforumgetdiscussionposts"></a>
# **ModForumGetDiscussionPosts**
> ModForumGetDiscussionPosts200Response ModForumGetDiscussionPosts (ModForumGetDiscussionPostsRequest modForumGetDiscussionPostsRequest)

Returns a list of forum posts for a discussion.

Returns a list of forum posts for a discussion.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumGetDiscussionPostsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumGetDiscussionPostsRequest = new ModForumGetDiscussionPostsRequest(); // ModForumGetDiscussionPostsRequest | 

            try
            {
                // Returns a list of forum posts for a discussion.
                ModForumGetDiscussionPosts200Response result = apiInstance.ModForumGetDiscussionPosts(modForumGetDiscussionPostsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumGetDiscussionPosts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumGetDiscussionPostsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of forum posts for a discussion.
    ApiResponse<ModForumGetDiscussionPosts200Response> response = apiInstance.ModForumGetDiscussionPostsWithHttpInfo(modForumGetDiscussionPostsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumGetDiscussionPostsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumGetDiscussionPostsRequest** | [**ModForumGetDiscussionPostsRequest**](ModForumGetDiscussionPostsRequest.md) |  |  |

### Return type

[**ModForumGetDiscussionPosts200Response**](ModForumGetDiscussionPosts200Response.md)

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

<a id="modforumgetdiscussionpostsbyuserid"></a>
# **ModForumGetDiscussionPostsByUserid**
> ModForumGetDiscussionPostsByUserid200Response ModForumGetDiscussionPostsByUserid (ModForumGetDiscussionPostsByUseridRequest modForumGetDiscussionPostsByUseridRequest)

Returns a list of forum posts for a discussion for a user.

Returns a list of forum posts for a discussion for a user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumGetDiscussionPostsByUseridExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumGetDiscussionPostsByUseridRequest = new ModForumGetDiscussionPostsByUseridRequest(); // ModForumGetDiscussionPostsByUseridRequest | 

            try
            {
                // Returns a list of forum posts for a discussion for a user.
                ModForumGetDiscussionPostsByUserid200Response result = apiInstance.ModForumGetDiscussionPostsByUserid(modForumGetDiscussionPostsByUseridRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumGetDiscussionPostsByUserid: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumGetDiscussionPostsByUseridWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of forum posts for a discussion for a user.
    ApiResponse<ModForumGetDiscussionPostsByUserid200Response> response = apiInstance.ModForumGetDiscussionPostsByUseridWithHttpInfo(modForumGetDiscussionPostsByUseridRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumGetDiscussionPostsByUseridWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumGetDiscussionPostsByUseridRequest** | [**ModForumGetDiscussionPostsByUseridRequest**](ModForumGetDiscussionPostsByUseridRequest.md) |  |  |

### Return type

[**ModForumGetDiscussionPostsByUserid200Response**](ModForumGetDiscussionPostsByUserid200Response.md)

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

<a id="modforumgetforumaccessinformation"></a>
# **ModForumGetForumAccessInformation**
> ModForumGetForumAccessInformation200Response ModForumGetForumAccessInformation (ModForumGetForumAccessInformationRequest modForumGetForumAccessInformationRequest)

Return capabilities information for a given forum.

Return capabilities information for a given forum.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumGetForumAccessInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumGetForumAccessInformationRequest = new ModForumGetForumAccessInformationRequest(); // ModForumGetForumAccessInformationRequest | 

            try
            {
                // Return capabilities information for a given forum.
                ModForumGetForumAccessInformation200Response result = apiInstance.ModForumGetForumAccessInformation(modForumGetForumAccessInformationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumGetForumAccessInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumGetForumAccessInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Return capabilities information for a given forum.
    ApiResponse<ModForumGetForumAccessInformation200Response> response = apiInstance.ModForumGetForumAccessInformationWithHttpInfo(modForumGetForumAccessInformationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumGetForumAccessInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumGetForumAccessInformationRequest** | [**ModForumGetForumAccessInformationRequest**](ModForumGetForumAccessInformationRequest.md) |  |  |

### Return type

[**ModForumGetForumAccessInformation200Response**](ModForumGetForumAccessInformation200Response.md)

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

<a id="modforumgetforumdiscussions"></a>
# **ModForumGetForumDiscussions**
> ModForumGetForumDiscussions200Response ModForumGetForumDiscussions (ModForumGetForumDiscussionsRequest modForumGetForumDiscussionsRequest)

Returns a list of forum discussions optionally sorted and paginated.

Returns a list of forum discussions optionally sorted and paginated.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumGetForumDiscussionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumGetForumDiscussionsRequest = new ModForumGetForumDiscussionsRequest(); // ModForumGetForumDiscussionsRequest | 

            try
            {
                // Returns a list of forum discussions optionally sorted and paginated.
                ModForumGetForumDiscussions200Response result = apiInstance.ModForumGetForumDiscussions(modForumGetForumDiscussionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumGetForumDiscussions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumGetForumDiscussionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of forum discussions optionally sorted and paginated.
    ApiResponse<ModForumGetForumDiscussions200Response> response = apiInstance.ModForumGetForumDiscussionsWithHttpInfo(modForumGetForumDiscussionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumGetForumDiscussionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumGetForumDiscussionsRequest** | [**ModForumGetForumDiscussionsRequest**](ModForumGetForumDiscussionsRequest.md) |  |  |

### Return type

[**ModForumGetForumDiscussions200Response**](ModForumGetForumDiscussions200Response.md)

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

<a id="modforumgetforumdiscussionspaginated"></a>
# **ModForumGetForumDiscussionsPaginated**
> ModForumGetForumDiscussionsPaginated200Response ModForumGetForumDiscussionsPaginated (ModForumGetForumDiscussionsPaginatedRequest modForumGetForumDiscussionsPaginatedRequest)

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumGetForumDiscussionsPaginatedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumGetForumDiscussionsPaginatedRequest = new ModForumGetForumDiscussionsPaginatedRequest(); // ModForumGetForumDiscussionsPaginatedRequest | 

            try
            {
                // ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
                ModForumGetForumDiscussionsPaginated200Response result = apiInstance.ModForumGetForumDiscussionsPaginated(modForumGetForumDiscussionsPaginatedRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumGetForumDiscussionsPaginated: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumGetForumDiscussionsPaginatedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
    ApiResponse<ModForumGetForumDiscussionsPaginated200Response> response = apiInstance.ModForumGetForumDiscussionsPaginatedWithHttpInfo(modForumGetForumDiscussionsPaginatedRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumGetForumDiscussionsPaginatedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumGetForumDiscussionsPaginatedRequest** | [**ModForumGetForumDiscussionsPaginatedRequest**](ModForumGetForumDiscussionsPaginatedRequest.md) |  |  |

### Return type

[**ModForumGetForumDiscussionsPaginated200Response**](ModForumGetForumDiscussionsPaginated200Response.md)

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

<a id="modforumgetforumsbycourses"></a>
# **ModForumGetForumsByCourses**
> Object ModForumGetForumsByCourses (ModForumGetForumsByCoursesRequest modForumGetForumsByCoursesRequest)

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumGetForumsByCoursesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumGetForumsByCoursesRequest = new ModForumGetForumsByCoursesRequest(); // ModForumGetForumsByCoursesRequest | 

            try
            {
                // Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
                Object result = apiInstance.ModForumGetForumsByCourses(modForumGetForumsByCoursesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumGetForumsByCourses: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumGetForumsByCoursesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
    ApiResponse<Object> response = apiInstance.ModForumGetForumsByCoursesWithHttpInfo(modForumGetForumsByCoursesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumGetForumsByCoursesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumGetForumsByCoursesRequest** | [**ModForumGetForumsByCoursesRequest**](ModForumGetForumsByCoursesRequest.md) |  |  |

### Return type

**Object**

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

<a id="modforumpreparedraftareaforpost"></a>
# **ModForumPrepareDraftAreaForPost**
> ModForumPrepareDraftAreaForPost200Response ModForumPrepareDraftAreaForPost (ModForumPrepareDraftAreaForPostRequest modForumPrepareDraftAreaForPostRequest)

Prepares a draft area for editing a post.

Prepares a draft area for editing a post.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumPrepareDraftAreaForPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumPrepareDraftAreaForPostRequest = new ModForumPrepareDraftAreaForPostRequest(); // ModForumPrepareDraftAreaForPostRequest | 

            try
            {
                // Prepares a draft area for editing a post.
                ModForumPrepareDraftAreaForPost200Response result = apiInstance.ModForumPrepareDraftAreaForPost(modForumPrepareDraftAreaForPostRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumPrepareDraftAreaForPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumPrepareDraftAreaForPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Prepares a draft area for editing a post.
    ApiResponse<ModForumPrepareDraftAreaForPost200Response> response = apiInstance.ModForumPrepareDraftAreaForPostWithHttpInfo(modForumPrepareDraftAreaForPostRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumPrepareDraftAreaForPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumPrepareDraftAreaForPostRequest** | [**ModForumPrepareDraftAreaForPostRequest**](ModForumPrepareDraftAreaForPostRequest.md) |  |  |

### Return type

[**ModForumPrepareDraftAreaForPost200Response**](ModForumPrepareDraftAreaForPost200Response.md)

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

<a id="modforumsetlockstate"></a>
# **ModForumSetLockState**
> ModForumSetLockState200Response ModForumSetLockState (ModForumSetLockStateRequest modForumSetLockStateRequest)

Set the lock state for the discussion

Set the lock state for the discussion

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumSetLockStateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumSetLockStateRequest = new ModForumSetLockStateRequest(); // ModForumSetLockStateRequest | 

            try
            {
                // Set the lock state for the discussion
                ModForumSetLockState200Response result = apiInstance.ModForumSetLockState(modForumSetLockStateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumSetLockState: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumSetLockStateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Set the lock state for the discussion
    ApiResponse<ModForumSetLockState200Response> response = apiInstance.ModForumSetLockStateWithHttpInfo(modForumSetLockStateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumSetLockStateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumSetLockStateRequest** | [**ModForumSetLockStateRequest**](ModForumSetLockStateRequest.md) |  |  |

### Return type

[**ModForumSetLockState200Response**](ModForumSetLockState200Response.md)

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

<a id="modforumsetpinstate"></a>
# **ModForumSetPinState**
> ModForumSetPinState200Response ModForumSetPinState (ModForumSetPinStateRequest modForumSetPinStateRequest)

Set the pin state

Set the pin state

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumSetPinStateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumSetPinStateRequest = new ModForumSetPinStateRequest(); // ModForumSetPinStateRequest | 

            try
            {
                // Set the pin state
                ModForumSetPinState200Response result = apiInstance.ModForumSetPinState(modForumSetPinStateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumSetPinState: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumSetPinStateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Set the pin state
    ApiResponse<ModForumSetPinState200Response> response = apiInstance.ModForumSetPinStateWithHttpInfo(modForumSetPinStateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumSetPinStateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumSetPinStateRequest** | [**ModForumSetPinStateRequest**](ModForumSetPinStateRequest.md) |  |  |

### Return type

[**ModForumSetPinState200Response**](ModForumSetPinState200Response.md)

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

<a id="modforumsetsubscriptionstate"></a>
# **ModForumSetSubscriptionState**
> ModForumSetSubscriptionState200Response ModForumSetSubscriptionState (ModForumSetSubscriptionStateRequest modForumSetSubscriptionStateRequest)

Set the subscription state

Set the subscription state

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumSetSubscriptionStateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumSetSubscriptionStateRequest = new ModForumSetSubscriptionStateRequest(); // ModForumSetSubscriptionStateRequest | 

            try
            {
                // Set the subscription state
                ModForumSetSubscriptionState200Response result = apiInstance.ModForumSetSubscriptionState(modForumSetSubscriptionStateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumSetSubscriptionState: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumSetSubscriptionStateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Set the subscription state
    ApiResponse<ModForumSetSubscriptionState200Response> response = apiInstance.ModForumSetSubscriptionStateWithHttpInfo(modForumSetSubscriptionStateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumSetSubscriptionStateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumSetSubscriptionStateRequest** | [**ModForumSetSubscriptionStateRequest**](ModForumSetSubscriptionStateRequest.md) |  |  |

### Return type

[**ModForumSetSubscriptionState200Response**](ModForumSetSubscriptionState200Response.md)

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

<a id="modforumtogglefavouritestate"></a>
# **ModForumToggleFavouriteState**
> ModForumSetSubscriptionState200Response ModForumToggleFavouriteState (ModForumToggleFavouriteStateRequest modForumToggleFavouriteStateRequest)

Toggle the favourite state

Toggle the favourite state

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumToggleFavouriteStateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumToggleFavouriteStateRequest = new ModForumToggleFavouriteStateRequest(); // ModForumToggleFavouriteStateRequest | 

            try
            {
                // Toggle the favourite state
                ModForumSetSubscriptionState200Response result = apiInstance.ModForumToggleFavouriteState(modForumToggleFavouriteStateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumToggleFavouriteState: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumToggleFavouriteStateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Toggle the favourite state
    ApiResponse<ModForumSetSubscriptionState200Response> response = apiInstance.ModForumToggleFavouriteStateWithHttpInfo(modForumToggleFavouriteStateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumToggleFavouriteStateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumToggleFavouriteStateRequest** | [**ModForumToggleFavouriteStateRequest**](ModForumToggleFavouriteStateRequest.md) |  |  |

### Return type

[**ModForumSetSubscriptionState200Response**](ModForumSetSubscriptionState200Response.md)

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

<a id="modforumupdatediscussionpost"></a>
# **ModForumUpdateDiscussionPost**
> ModForumUpdateDiscussionPost200Response ModForumUpdateDiscussionPost (ModForumUpdateDiscussionPostRequest modForumUpdateDiscussionPostRequest)

Updates a post or a discussion topic post.

Updates a post or a discussion topic post.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumUpdateDiscussionPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumUpdateDiscussionPostRequest = new ModForumUpdateDiscussionPostRequest(); // ModForumUpdateDiscussionPostRequest | 

            try
            {
                // Updates a post or a discussion topic post.
                ModForumUpdateDiscussionPost200Response result = apiInstance.ModForumUpdateDiscussionPost(modForumUpdateDiscussionPostRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumUpdateDiscussionPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumUpdateDiscussionPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Updates a post or a discussion topic post.
    ApiResponse<ModForumUpdateDiscussionPost200Response> response = apiInstance.ModForumUpdateDiscussionPostWithHttpInfo(modForumUpdateDiscussionPostRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumUpdateDiscussionPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumUpdateDiscussionPostRequest** | [**ModForumUpdateDiscussionPostRequest**](ModForumUpdateDiscussionPostRequest.md) |  |  |

### Return type

[**ModForumUpdateDiscussionPost200Response**](ModForumUpdateDiscussionPost200Response.md)

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

<a id="modforumviewforum"></a>
# **ModForumViewForum**
> CoreCalendarDeleteSubscription200Response ModForumViewForum (ModForumViewForumRequest modForumViewForumRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumViewForumExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumViewForumRequest = new ModForumViewForumRequest(); // ModForumViewForumRequest | 

            try
            {
                // Trigger the course module viewed event and update the module completion status.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModForumViewForum(modForumViewForumRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumViewForum: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumViewForumWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the course module viewed event and update the module completion status.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModForumViewForumWithHttpInfo(modForumViewForumRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumViewForumWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumViewForumRequest** | [**ModForumViewForumRequest**](ModForumViewForumRequest.md) |  |  |

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

<a id="modforumviewforumdiscussion"></a>
# **ModForumViewForumDiscussion**
> CoreCalendarDeleteSubscription200Response ModForumViewForumDiscussion (ModForumViewForumDiscussionRequest modForumViewForumDiscussionRequest)

Trigger the forum discussion viewed event.

Trigger the forum discussion viewed event.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ModForumViewForumDiscussionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/rest/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new ModForumApi(config);
            var modForumViewForumDiscussionRequest = new ModForumViewForumDiscussionRequest(); // ModForumViewForumDiscussionRequest | 

            try
            {
                // Trigger the forum discussion viewed event.
                CoreCalendarDeleteSubscription200Response result = apiInstance.ModForumViewForumDiscussion(modForumViewForumDiscussionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ModForumApi.ModForumViewForumDiscussion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ModForumViewForumDiscussionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Trigger the forum discussion viewed event.
    ApiResponse<CoreCalendarDeleteSubscription200Response> response = apiInstance.ModForumViewForumDiscussionWithHttpInfo(modForumViewForumDiscussionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ModForumApi.ModForumViewForumDiscussionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **modForumViewForumDiscussionRequest** | [**ModForumViewForumDiscussionRequest**](ModForumViewForumDiscussionRequest.md) |  |  |

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


# ModForumApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modForumAddDiscussion**](ModForumApi.md#modForumAddDiscussion) | **POST** /mod_forum_add_discussion | Add a new discussion into an existing forum. |
| [**modForumAddDiscussionPost**](ModForumApi.md#modForumAddDiscussionPost) | **POST** /mod_forum_add_discussion_post | Create new posts into an existing discussion. |
| [**modForumCanAddDiscussion**](ModForumApi.md#modForumCanAddDiscussion) | **POST** /mod_forum_can_add_discussion | Check if the current user can add discussions in the given forum (and optionally for the given group). |
| [**modForumDeletePost**](ModForumApi.md#modForumDeletePost) | **POST** /mod_forum_delete_post | Deletes a post or a discussion completely when the post is the discussion topic. |
| [**modForumGetDiscussionPost**](ModForumApi.md#modForumGetDiscussionPost) | **POST** /mod_forum_get_discussion_post | Get a particular discussion post. |
| [**modForumGetDiscussionPosts**](ModForumApi.md#modForumGetDiscussionPosts) | **POST** /mod_forum_get_discussion_posts | Returns a list of forum posts for a discussion. |
| [**modForumGetDiscussionPostsByUserid**](ModForumApi.md#modForumGetDiscussionPostsByUserid) | **POST** /mod_forum_get_discussion_posts_by_userid | Returns a list of forum posts for a discussion for a user. |
| [**modForumGetForumAccessInformation**](ModForumApi.md#modForumGetForumAccessInformation) | **POST** /mod_forum_get_forum_access_information | Return capabilities information for a given forum. |
| [**modForumGetForumDiscussions**](ModForumApi.md#modForumGetForumDiscussions) | **POST** /mod_forum_get_forum_discussions | Returns a list of forum discussions optionally sorted and paginated. |
| [**modForumGetForumDiscussionsPaginated**](ModForumApi.md#modForumGetForumDiscussionsPaginated) | **POST** /mod_forum_get_forum_discussions_paginated | ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated. |
| [**modForumGetForumsByCourses**](ModForumApi.md#modForumGetForumsByCourses) | **POST** /mod_forum_get_forums_by_courses | Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned. |
| [**modForumPrepareDraftAreaForPost**](ModForumApi.md#modForumPrepareDraftAreaForPost) | **POST** /mod_forum_prepare_draft_area_for_post | Prepares a draft area for editing a post. |
| [**modForumSetLockState**](ModForumApi.md#modForumSetLockState) | **POST** /mod_forum_set_lock_state | Set the lock state for the discussion |
| [**modForumSetPinState**](ModForumApi.md#modForumSetPinState) | **POST** /mod_forum_set_pin_state | Set the pin state |
| [**modForumSetSubscriptionState**](ModForumApi.md#modForumSetSubscriptionState) | **POST** /mod_forum_set_subscription_state | Set the subscription state |
| [**modForumToggleFavouriteState**](ModForumApi.md#modForumToggleFavouriteState) | **POST** /mod_forum_toggle_favourite_state | Toggle the favourite state |
| [**modForumUpdateDiscussionPost**](ModForumApi.md#modForumUpdateDiscussionPost) | **POST** /mod_forum_update_discussion_post | Updates a post or a discussion topic post. |
| [**modForumViewForum**](ModForumApi.md#modForumViewForum) | **POST** /mod_forum_view_forum | Trigger the course module viewed event and update the module completion status. |
| [**modForumViewForumDiscussion**](ModForumApi.md#modForumViewForumDiscussion) | **POST** /mod_forum_view_forum_discussion | Trigger the forum discussion viewed event. |


<a id="modForumAddDiscussion"></a>
# **modForumAddDiscussion**
> ModForumAddDiscussion200Response modForumAddDiscussion(modForumAddDiscussionRequest)

Add a new discussion into an existing forum.

Add a new discussion into an existing forum.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumAddDiscussionRequest modForumAddDiscussionRequest = new ModForumAddDiscussionRequest(); // ModForumAddDiscussionRequest | 
    try {
      ModForumAddDiscussion200Response result = apiInstance.modForumAddDiscussion(modForumAddDiscussionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumAddDiscussion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumAddDiscussionRequest** | [**ModForumAddDiscussionRequest**](ModForumAddDiscussionRequest.md)|  | |

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

<a id="modForumAddDiscussionPost"></a>
# **modForumAddDiscussionPost**
> ModForumAddDiscussionPost200Response modForumAddDiscussionPost(modForumAddDiscussionPostRequest)

Create new posts into an existing discussion.

Create new posts into an existing discussion.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumAddDiscussionPostRequest modForumAddDiscussionPostRequest = new ModForumAddDiscussionPostRequest(); // ModForumAddDiscussionPostRequest | 
    try {
      ModForumAddDiscussionPost200Response result = apiInstance.modForumAddDiscussionPost(modForumAddDiscussionPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumAddDiscussionPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumAddDiscussionPostRequest** | [**ModForumAddDiscussionPostRequest**](ModForumAddDiscussionPostRequest.md)|  | |

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

<a id="modForumCanAddDiscussion"></a>
# **modForumCanAddDiscussion**
> ModForumCanAddDiscussion200Response modForumCanAddDiscussion(modForumCanAddDiscussionRequest)

Check if the current user can add discussions in the given forum (and optionally for the given group).

Check if the current user can add discussions in the given forum (and optionally for the given group).

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumCanAddDiscussionRequest modForumCanAddDiscussionRequest = new ModForumCanAddDiscussionRequest(); // ModForumCanAddDiscussionRequest | 
    try {
      ModForumCanAddDiscussion200Response result = apiInstance.modForumCanAddDiscussion(modForumCanAddDiscussionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumCanAddDiscussion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumCanAddDiscussionRequest** | [**ModForumCanAddDiscussionRequest**](ModForumCanAddDiscussionRequest.md)|  | |

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

<a id="modForumDeletePost"></a>
# **modForumDeletePost**
> ModForumDeletePost200Response modForumDeletePost(modForumDeletePostRequest)

Deletes a post or a discussion completely when the post is the discussion topic.

Deletes a post or a discussion completely when the post is the discussion topic.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumDeletePostRequest modForumDeletePostRequest = new ModForumDeletePostRequest(); // ModForumDeletePostRequest | 
    try {
      ModForumDeletePost200Response result = apiInstance.modForumDeletePost(modForumDeletePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumDeletePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumDeletePostRequest** | [**ModForumDeletePostRequest**](ModForumDeletePostRequest.md)|  | |

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

<a id="modForumGetDiscussionPost"></a>
# **modForumGetDiscussionPost**
> ModForumGetDiscussionPost200Response modForumGetDiscussionPost(modForumGetDiscussionPostRequest)

Get a particular discussion post.

Get a particular discussion post.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumGetDiscussionPostRequest modForumGetDiscussionPostRequest = new ModForumGetDiscussionPostRequest(); // ModForumGetDiscussionPostRequest | 
    try {
      ModForumGetDiscussionPost200Response result = apiInstance.modForumGetDiscussionPost(modForumGetDiscussionPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumGetDiscussionPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumGetDiscussionPostRequest** | [**ModForumGetDiscussionPostRequest**](ModForumGetDiscussionPostRequest.md)|  | |

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

<a id="modForumGetDiscussionPosts"></a>
# **modForumGetDiscussionPosts**
> ModForumGetDiscussionPosts200Response modForumGetDiscussionPosts(modForumGetDiscussionPostsRequest)

Returns a list of forum posts for a discussion.

Returns a list of forum posts for a discussion.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumGetDiscussionPostsRequest modForumGetDiscussionPostsRequest = new ModForumGetDiscussionPostsRequest(); // ModForumGetDiscussionPostsRequest | 
    try {
      ModForumGetDiscussionPosts200Response result = apiInstance.modForumGetDiscussionPosts(modForumGetDiscussionPostsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumGetDiscussionPosts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumGetDiscussionPostsRequest** | [**ModForumGetDiscussionPostsRequest**](ModForumGetDiscussionPostsRequest.md)|  | |

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

<a id="modForumGetDiscussionPostsByUserid"></a>
# **modForumGetDiscussionPostsByUserid**
> ModForumGetDiscussionPostsByUserid200Response modForumGetDiscussionPostsByUserid(modForumGetDiscussionPostsByUseridRequest)

Returns a list of forum posts for a discussion for a user.

Returns a list of forum posts for a discussion for a user.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumGetDiscussionPostsByUseridRequest modForumGetDiscussionPostsByUseridRequest = new ModForumGetDiscussionPostsByUseridRequest(); // ModForumGetDiscussionPostsByUseridRequest | 
    try {
      ModForumGetDiscussionPostsByUserid200Response result = apiInstance.modForumGetDiscussionPostsByUserid(modForumGetDiscussionPostsByUseridRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumGetDiscussionPostsByUserid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumGetDiscussionPostsByUseridRequest** | [**ModForumGetDiscussionPostsByUseridRequest**](ModForumGetDiscussionPostsByUseridRequest.md)|  | |

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

<a id="modForumGetForumAccessInformation"></a>
# **modForumGetForumAccessInformation**
> ModForumGetForumAccessInformation200Response modForumGetForumAccessInformation(modForumGetForumAccessInformationRequest)

Return capabilities information for a given forum.

Return capabilities information for a given forum.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumGetForumAccessInformationRequest modForumGetForumAccessInformationRequest = new ModForumGetForumAccessInformationRequest(); // ModForumGetForumAccessInformationRequest | 
    try {
      ModForumGetForumAccessInformation200Response result = apiInstance.modForumGetForumAccessInformation(modForumGetForumAccessInformationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumGetForumAccessInformation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumGetForumAccessInformationRequest** | [**ModForumGetForumAccessInformationRequest**](ModForumGetForumAccessInformationRequest.md)|  | |

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

<a id="modForumGetForumDiscussions"></a>
# **modForumGetForumDiscussions**
> ModForumGetForumDiscussions200Response modForumGetForumDiscussions(modForumGetForumDiscussionsRequest)

Returns a list of forum discussions optionally sorted and paginated.

Returns a list of forum discussions optionally sorted and paginated.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumGetForumDiscussionsRequest modForumGetForumDiscussionsRequest = new ModForumGetForumDiscussionsRequest(); // ModForumGetForumDiscussionsRequest | 
    try {
      ModForumGetForumDiscussions200Response result = apiInstance.modForumGetForumDiscussions(modForumGetForumDiscussionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumGetForumDiscussions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumGetForumDiscussionsRequest** | [**ModForumGetForumDiscussionsRequest**](ModForumGetForumDiscussionsRequest.md)|  | |

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

<a id="modForumGetForumDiscussionsPaginated"></a>
# **modForumGetForumDiscussionsPaginated**
> ModForumGetForumDiscussionsPaginated200Response modForumGetForumDiscussionsPaginated(modForumGetForumDiscussionsPaginatedRequest)

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumGetForumDiscussionsPaginatedRequest modForumGetForumDiscussionsPaginatedRequest = new ModForumGetForumDiscussionsPaginatedRequest(); // ModForumGetForumDiscussionsPaginatedRequest | 
    try {
      ModForumGetForumDiscussionsPaginated200Response result = apiInstance.modForumGetForumDiscussionsPaginated(modForumGetForumDiscussionsPaginatedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumGetForumDiscussionsPaginated");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumGetForumDiscussionsPaginatedRequest** | [**ModForumGetForumDiscussionsPaginatedRequest**](ModForumGetForumDiscussionsPaginatedRequest.md)|  | |

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

<a id="modForumGetForumsByCourses"></a>
# **modForumGetForumsByCourses**
> Object modForumGetForumsByCourses(modForumGetForumsByCoursesRequest)

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumGetForumsByCoursesRequest modForumGetForumsByCoursesRequest = new ModForumGetForumsByCoursesRequest(); // ModForumGetForumsByCoursesRequest | 
    try {
      Object result = apiInstance.modForumGetForumsByCourses(modForumGetForumsByCoursesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumGetForumsByCourses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumGetForumsByCoursesRequest** | [**ModForumGetForumsByCoursesRequest**](ModForumGetForumsByCoursesRequest.md)|  | |

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

<a id="modForumPrepareDraftAreaForPost"></a>
# **modForumPrepareDraftAreaForPost**
> ModForumPrepareDraftAreaForPost200Response modForumPrepareDraftAreaForPost(modForumPrepareDraftAreaForPostRequest)

Prepares a draft area for editing a post.

Prepares a draft area for editing a post.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumPrepareDraftAreaForPostRequest modForumPrepareDraftAreaForPostRequest = new ModForumPrepareDraftAreaForPostRequest(); // ModForumPrepareDraftAreaForPostRequest | 
    try {
      ModForumPrepareDraftAreaForPost200Response result = apiInstance.modForumPrepareDraftAreaForPost(modForumPrepareDraftAreaForPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumPrepareDraftAreaForPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumPrepareDraftAreaForPostRequest** | [**ModForumPrepareDraftAreaForPostRequest**](ModForumPrepareDraftAreaForPostRequest.md)|  | |

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

<a id="modForumSetLockState"></a>
# **modForumSetLockState**
> ModForumSetLockState200Response modForumSetLockState(modForumSetLockStateRequest)

Set the lock state for the discussion

Set the lock state for the discussion

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumSetLockStateRequest modForumSetLockStateRequest = new ModForumSetLockStateRequest(); // ModForumSetLockStateRequest | 
    try {
      ModForumSetLockState200Response result = apiInstance.modForumSetLockState(modForumSetLockStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumSetLockState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumSetLockStateRequest** | [**ModForumSetLockStateRequest**](ModForumSetLockStateRequest.md)|  | |

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

<a id="modForumSetPinState"></a>
# **modForumSetPinState**
> ModForumSetPinState200Response modForumSetPinState(modForumSetPinStateRequest)

Set the pin state

Set the pin state

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumSetPinStateRequest modForumSetPinStateRequest = new ModForumSetPinStateRequest(); // ModForumSetPinStateRequest | 
    try {
      ModForumSetPinState200Response result = apiInstance.modForumSetPinState(modForumSetPinStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumSetPinState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumSetPinStateRequest** | [**ModForumSetPinStateRequest**](ModForumSetPinStateRequest.md)|  | |

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

<a id="modForumSetSubscriptionState"></a>
# **modForumSetSubscriptionState**
> ModForumSetSubscriptionState200Response modForumSetSubscriptionState(modForumSetSubscriptionStateRequest)

Set the subscription state

Set the subscription state

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumSetSubscriptionStateRequest modForumSetSubscriptionStateRequest = new ModForumSetSubscriptionStateRequest(); // ModForumSetSubscriptionStateRequest | 
    try {
      ModForumSetSubscriptionState200Response result = apiInstance.modForumSetSubscriptionState(modForumSetSubscriptionStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumSetSubscriptionState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumSetSubscriptionStateRequest** | [**ModForumSetSubscriptionStateRequest**](ModForumSetSubscriptionStateRequest.md)|  | |

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

<a id="modForumToggleFavouriteState"></a>
# **modForumToggleFavouriteState**
> ModForumSetSubscriptionState200Response modForumToggleFavouriteState(modForumToggleFavouriteStateRequest)

Toggle the favourite state

Toggle the favourite state

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumToggleFavouriteStateRequest modForumToggleFavouriteStateRequest = new ModForumToggleFavouriteStateRequest(); // ModForumToggleFavouriteStateRequest | 
    try {
      ModForumSetSubscriptionState200Response result = apiInstance.modForumToggleFavouriteState(modForumToggleFavouriteStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumToggleFavouriteState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumToggleFavouriteStateRequest** | [**ModForumToggleFavouriteStateRequest**](ModForumToggleFavouriteStateRequest.md)|  | |

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

<a id="modForumUpdateDiscussionPost"></a>
# **modForumUpdateDiscussionPost**
> ModForumUpdateDiscussionPost200Response modForumUpdateDiscussionPost(modForumUpdateDiscussionPostRequest)

Updates a post or a discussion topic post.

Updates a post or a discussion topic post.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumUpdateDiscussionPostRequest modForumUpdateDiscussionPostRequest = new ModForumUpdateDiscussionPostRequest(); // ModForumUpdateDiscussionPostRequest | 
    try {
      ModForumUpdateDiscussionPost200Response result = apiInstance.modForumUpdateDiscussionPost(modForumUpdateDiscussionPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumUpdateDiscussionPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumUpdateDiscussionPostRequest** | [**ModForumUpdateDiscussionPostRequest**](ModForumUpdateDiscussionPostRequest.md)|  | |

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

<a id="modForumViewForum"></a>
# **modForumViewForum**
> CoreCalendarDeleteSubscription200Response modForumViewForum(modForumViewForumRequest)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumViewForumRequest modForumViewForumRequest = new ModForumViewForumRequest(); // ModForumViewForumRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modForumViewForum(modForumViewForumRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumViewForum");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumViewForumRequest** | [**ModForumViewForumRequest**](ModForumViewForumRequest.md)|  | |

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

<a id="modForumViewForumDiscussion"></a>
# **modForumViewForumDiscussion**
> CoreCalendarDeleteSubscription200Response modForumViewForumDiscussion(modForumViewForumDiscussionRequest)

Trigger the forum discussion viewed event.

Trigger the forum discussion viewed event.

### Example
```java
// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.ModForumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    ModForumApi apiInstance = new ModForumApi(defaultClient);
    ModForumViewForumDiscussionRequest modForumViewForumDiscussionRequest = new ModForumViewForumDiscussionRequest(); // ModForumViewForumDiscussionRequest | 
    try {
      CoreCalendarDeleteSubscription200Response result = apiInstance.modForumViewForumDiscussion(modForumViewForumDiscussionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModForumApi#modForumViewForumDiscussion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modForumViewForumDiscussionRequest** | [**ModForumViewForumDiscussionRequest**](ModForumViewForumDiscussionRequest.md)|  | |

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


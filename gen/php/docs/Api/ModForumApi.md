# OpenAPI\Client\ModForumApi

All URIs are relative to https://localhost/webservice/restful/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modForumAddDiscussion()**](ModForumApi.md#modForumAddDiscussion) | **POST** /mod_forum_add_discussion | Add a new discussion into an existing forum. |
| [**modForumAddDiscussionPost()**](ModForumApi.md#modForumAddDiscussionPost) | **POST** /mod_forum_add_discussion_post | Create new posts into an existing discussion. |
| [**modForumCanAddDiscussion()**](ModForumApi.md#modForumCanAddDiscussion) | **POST** /mod_forum_can_add_discussion | Check if the current user can add discussions in the given forum (and optionally for the given group). |
| [**modForumDeletePost()**](ModForumApi.md#modForumDeletePost) | **POST** /mod_forum_delete_post | Deletes a post or a discussion completely when the post is the discussion topic. |
| [**modForumGetDiscussionPost()**](ModForumApi.md#modForumGetDiscussionPost) | **POST** /mod_forum_get_discussion_post | Get a particular discussion post. |
| [**modForumGetDiscussionPosts()**](ModForumApi.md#modForumGetDiscussionPosts) | **POST** /mod_forum_get_discussion_posts | Returns a list of forum posts for a discussion. |
| [**modForumGetDiscussionPostsByUserid()**](ModForumApi.md#modForumGetDiscussionPostsByUserid) | **POST** /mod_forum_get_discussion_posts_by_userid | Returns a list of forum posts for a discussion for a user. |
| [**modForumGetForumAccessInformation()**](ModForumApi.md#modForumGetForumAccessInformation) | **POST** /mod_forum_get_forum_access_information | Return capabilities information for a given forum. |
| [**modForumGetForumDiscussions()**](ModForumApi.md#modForumGetForumDiscussions) | **POST** /mod_forum_get_forum_discussions | Returns a list of forum discussions optionally sorted and paginated. |
| [**modForumGetForumDiscussionsPaginated()**](ModForumApi.md#modForumGetForumDiscussionsPaginated) | **POST** /mod_forum_get_forum_discussions_paginated | ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated. |
| [**modForumGetForumsByCourses()**](ModForumApi.md#modForumGetForumsByCourses) | **POST** /mod_forum_get_forums_by_courses | Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned. |
| [**modForumPrepareDraftAreaForPost()**](ModForumApi.md#modForumPrepareDraftAreaForPost) | **POST** /mod_forum_prepare_draft_area_for_post | Prepares a draft area for editing a post. |
| [**modForumSetLockState()**](ModForumApi.md#modForumSetLockState) | **POST** /mod_forum_set_lock_state | Set the lock state for the discussion |
| [**modForumSetPinState()**](ModForumApi.md#modForumSetPinState) | **POST** /mod_forum_set_pin_state | Set the pin state |
| [**modForumSetSubscriptionState()**](ModForumApi.md#modForumSetSubscriptionState) | **POST** /mod_forum_set_subscription_state | Set the subscription state |
| [**modForumToggleFavouriteState()**](ModForumApi.md#modForumToggleFavouriteState) | **POST** /mod_forum_toggle_favourite_state | Toggle the favourite state |
| [**modForumUpdateDiscussionPost()**](ModForumApi.md#modForumUpdateDiscussionPost) | **POST** /mod_forum_update_discussion_post | Updates a post or a discussion topic post. |
| [**modForumViewForum()**](ModForumApi.md#modForumViewForum) | **POST** /mod_forum_view_forum | Trigger the course module viewed event and update the module completion status. |
| [**modForumViewForumDiscussion()**](ModForumApi.md#modForumViewForumDiscussion) | **POST** /mod_forum_view_forum_discussion | Trigger the forum discussion viewed event. |


## `modForumAddDiscussion()`

```php
modForumAddDiscussion($mod_forum_add_discussion_request): \OpenAPI\Client\Model\ModForumAddDiscussion200Response
```

Add a new discussion into an existing forum.

Add a new discussion into an existing forum.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_add_discussion_request = new \OpenAPI\Client\Model\ModForumAddDiscussionRequest(); // \OpenAPI\Client\Model\ModForumAddDiscussionRequest

try {
    $result = $apiInstance->modForumAddDiscussion($mod_forum_add_discussion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumAddDiscussion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_add_discussion_request** | [**\OpenAPI\Client\Model\ModForumAddDiscussionRequest**](../Model/ModForumAddDiscussionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumAddDiscussion200Response**](../Model/ModForumAddDiscussion200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumAddDiscussionPost()`

```php
modForumAddDiscussionPost($mod_forum_add_discussion_post_request): \OpenAPI\Client\Model\ModForumAddDiscussionPost200Response
```

Create new posts into an existing discussion.

Create new posts into an existing discussion.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_add_discussion_post_request = new \OpenAPI\Client\Model\ModForumAddDiscussionPostRequest(); // \OpenAPI\Client\Model\ModForumAddDiscussionPostRequest

try {
    $result = $apiInstance->modForumAddDiscussionPost($mod_forum_add_discussion_post_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumAddDiscussionPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_add_discussion_post_request** | [**\OpenAPI\Client\Model\ModForumAddDiscussionPostRequest**](../Model/ModForumAddDiscussionPostRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumAddDiscussionPost200Response**](../Model/ModForumAddDiscussionPost200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumCanAddDiscussion()`

```php
modForumCanAddDiscussion($mod_forum_can_add_discussion_request): \OpenAPI\Client\Model\ModForumCanAddDiscussion200Response
```

Check if the current user can add discussions in the given forum (and optionally for the given group).

Check if the current user can add discussions in the given forum (and optionally for the given group).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_can_add_discussion_request = new \OpenAPI\Client\Model\ModForumCanAddDiscussionRequest(); // \OpenAPI\Client\Model\ModForumCanAddDiscussionRequest

try {
    $result = $apiInstance->modForumCanAddDiscussion($mod_forum_can_add_discussion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumCanAddDiscussion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_can_add_discussion_request** | [**\OpenAPI\Client\Model\ModForumCanAddDiscussionRequest**](../Model/ModForumCanAddDiscussionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumCanAddDiscussion200Response**](../Model/ModForumCanAddDiscussion200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumDeletePost()`

```php
modForumDeletePost($mod_forum_delete_post_request): \OpenAPI\Client\Model\ModForumDeletePost200Response
```

Deletes a post or a discussion completely when the post is the discussion topic.

Deletes a post or a discussion completely when the post is the discussion topic.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_delete_post_request = new \OpenAPI\Client\Model\ModForumDeletePostRequest(); // \OpenAPI\Client\Model\ModForumDeletePostRequest

try {
    $result = $apiInstance->modForumDeletePost($mod_forum_delete_post_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumDeletePost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_delete_post_request** | [**\OpenAPI\Client\Model\ModForumDeletePostRequest**](../Model/ModForumDeletePostRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumDeletePost200Response**](../Model/ModForumDeletePost200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumGetDiscussionPost()`

```php
modForumGetDiscussionPost($mod_forum_get_discussion_post_request): \OpenAPI\Client\Model\ModForumGetDiscussionPost200Response
```

Get a particular discussion post.

Get a particular discussion post.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_get_discussion_post_request = new \OpenAPI\Client\Model\ModForumGetDiscussionPostRequest(); // \OpenAPI\Client\Model\ModForumGetDiscussionPostRequest

try {
    $result = $apiInstance->modForumGetDiscussionPost($mod_forum_get_discussion_post_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumGetDiscussionPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_get_discussion_post_request** | [**\OpenAPI\Client\Model\ModForumGetDiscussionPostRequest**](../Model/ModForumGetDiscussionPostRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumGetDiscussionPost200Response**](../Model/ModForumGetDiscussionPost200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumGetDiscussionPosts()`

```php
modForumGetDiscussionPosts($mod_forum_get_discussion_posts_request): \OpenAPI\Client\Model\ModForumGetDiscussionPosts200Response
```

Returns a list of forum posts for a discussion.

Returns a list of forum posts for a discussion.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_get_discussion_posts_request = new \OpenAPI\Client\Model\ModForumGetDiscussionPostsRequest(); // \OpenAPI\Client\Model\ModForumGetDiscussionPostsRequest

try {
    $result = $apiInstance->modForumGetDiscussionPosts($mod_forum_get_discussion_posts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumGetDiscussionPosts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_get_discussion_posts_request** | [**\OpenAPI\Client\Model\ModForumGetDiscussionPostsRequest**](../Model/ModForumGetDiscussionPostsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumGetDiscussionPosts200Response**](../Model/ModForumGetDiscussionPosts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumGetDiscussionPostsByUserid()`

```php
modForumGetDiscussionPostsByUserid($mod_forum_get_discussion_posts_by_userid_request): \OpenAPI\Client\Model\ModForumGetDiscussionPostsByUserid200Response
```

Returns a list of forum posts for a discussion for a user.

Returns a list of forum posts for a discussion for a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_get_discussion_posts_by_userid_request = new \OpenAPI\Client\Model\ModForumGetDiscussionPostsByUseridRequest(); // \OpenAPI\Client\Model\ModForumGetDiscussionPostsByUseridRequest

try {
    $result = $apiInstance->modForumGetDiscussionPostsByUserid($mod_forum_get_discussion_posts_by_userid_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumGetDiscussionPostsByUserid: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_get_discussion_posts_by_userid_request** | [**\OpenAPI\Client\Model\ModForumGetDiscussionPostsByUseridRequest**](../Model/ModForumGetDiscussionPostsByUseridRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumGetDiscussionPostsByUserid200Response**](../Model/ModForumGetDiscussionPostsByUserid200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumGetForumAccessInformation()`

```php
modForumGetForumAccessInformation($mod_forum_get_forum_access_information_request): \OpenAPI\Client\Model\ModForumGetForumAccessInformation200Response
```

Return capabilities information for a given forum.

Return capabilities information for a given forum.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_get_forum_access_information_request = new \OpenAPI\Client\Model\ModForumGetForumAccessInformationRequest(); // \OpenAPI\Client\Model\ModForumGetForumAccessInformationRequest

try {
    $result = $apiInstance->modForumGetForumAccessInformation($mod_forum_get_forum_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumGetForumAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_get_forum_access_information_request** | [**\OpenAPI\Client\Model\ModForumGetForumAccessInformationRequest**](../Model/ModForumGetForumAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumGetForumAccessInformation200Response**](../Model/ModForumGetForumAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumGetForumDiscussions()`

```php
modForumGetForumDiscussions($mod_forum_get_forum_discussions_request): \OpenAPI\Client\Model\ModForumGetForumDiscussions200Response
```

Returns a list of forum discussions optionally sorted and paginated.

Returns a list of forum discussions optionally sorted and paginated.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_get_forum_discussions_request = new \OpenAPI\Client\Model\ModForumGetForumDiscussionsRequest(); // \OpenAPI\Client\Model\ModForumGetForumDiscussionsRequest

try {
    $result = $apiInstance->modForumGetForumDiscussions($mod_forum_get_forum_discussions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumGetForumDiscussions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_get_forum_discussions_request** | [**\OpenAPI\Client\Model\ModForumGetForumDiscussionsRequest**](../Model/ModForumGetForumDiscussionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumGetForumDiscussions200Response**](../Model/ModForumGetForumDiscussions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumGetForumDiscussionsPaginated()`

```php
modForumGetForumDiscussionsPaginated($mod_forum_get_forum_discussions_paginated_request): \OpenAPI\Client\Model\ModForumGetForumDiscussionsPaginated200Response
```

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_get_forum_discussions_paginated_request = new \OpenAPI\Client\Model\ModForumGetForumDiscussionsPaginatedRequest(); // \OpenAPI\Client\Model\ModForumGetForumDiscussionsPaginatedRequest

try {
    $result = $apiInstance->modForumGetForumDiscussionsPaginated($mod_forum_get_forum_discussions_paginated_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumGetForumDiscussionsPaginated: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_get_forum_discussions_paginated_request** | [**\OpenAPI\Client\Model\ModForumGetForumDiscussionsPaginatedRequest**](../Model/ModForumGetForumDiscussionsPaginatedRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumGetForumDiscussionsPaginated200Response**](../Model/ModForumGetForumDiscussionsPaginated200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumGetForumsByCourses()`

```php
modForumGetForumsByCourses($mod_forum_get_forums_by_courses_request): object
```

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_get_forums_by_courses_request = new \OpenAPI\Client\Model\ModForumGetForumsByCoursesRequest(); // \OpenAPI\Client\Model\ModForumGetForumsByCoursesRequest

try {
    $result = $apiInstance->modForumGetForumsByCourses($mod_forum_get_forums_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumGetForumsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_get_forums_by_courses_request** | [**\OpenAPI\Client\Model\ModForumGetForumsByCoursesRequest**](../Model/ModForumGetForumsByCoursesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumPrepareDraftAreaForPost()`

```php
modForumPrepareDraftAreaForPost($mod_forum_prepare_draft_area_for_post_request): \OpenAPI\Client\Model\ModForumPrepareDraftAreaForPost200Response
```

Prepares a draft area for editing a post.

Prepares a draft area for editing a post.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_prepare_draft_area_for_post_request = new \OpenAPI\Client\Model\ModForumPrepareDraftAreaForPostRequest(); // \OpenAPI\Client\Model\ModForumPrepareDraftAreaForPostRequest

try {
    $result = $apiInstance->modForumPrepareDraftAreaForPost($mod_forum_prepare_draft_area_for_post_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumPrepareDraftAreaForPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_prepare_draft_area_for_post_request** | [**\OpenAPI\Client\Model\ModForumPrepareDraftAreaForPostRequest**](../Model/ModForumPrepareDraftAreaForPostRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumPrepareDraftAreaForPost200Response**](../Model/ModForumPrepareDraftAreaForPost200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumSetLockState()`

```php
modForumSetLockState($mod_forum_set_lock_state_request): \OpenAPI\Client\Model\ModForumSetLockState200Response
```

Set the lock state for the discussion

Set the lock state for the discussion

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_set_lock_state_request = new \OpenAPI\Client\Model\ModForumSetLockStateRequest(); // \OpenAPI\Client\Model\ModForumSetLockStateRequest

try {
    $result = $apiInstance->modForumSetLockState($mod_forum_set_lock_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumSetLockState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_set_lock_state_request** | [**\OpenAPI\Client\Model\ModForumSetLockStateRequest**](../Model/ModForumSetLockStateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumSetLockState200Response**](../Model/ModForumSetLockState200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumSetPinState()`

```php
modForumSetPinState($mod_forum_set_pin_state_request): \OpenAPI\Client\Model\ModForumSetPinState200Response
```

Set the pin state

Set the pin state

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_set_pin_state_request = new \OpenAPI\Client\Model\ModForumSetPinStateRequest(); // \OpenAPI\Client\Model\ModForumSetPinStateRequest

try {
    $result = $apiInstance->modForumSetPinState($mod_forum_set_pin_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumSetPinState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_set_pin_state_request** | [**\OpenAPI\Client\Model\ModForumSetPinStateRequest**](../Model/ModForumSetPinStateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumSetPinState200Response**](../Model/ModForumSetPinState200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumSetSubscriptionState()`

```php
modForumSetSubscriptionState($mod_forum_set_subscription_state_request): \OpenAPI\Client\Model\ModForumSetSubscriptionState200Response
```

Set the subscription state

Set the subscription state

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_set_subscription_state_request = new \OpenAPI\Client\Model\ModForumSetSubscriptionStateRequest(); // \OpenAPI\Client\Model\ModForumSetSubscriptionStateRequest

try {
    $result = $apiInstance->modForumSetSubscriptionState($mod_forum_set_subscription_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumSetSubscriptionState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_set_subscription_state_request** | [**\OpenAPI\Client\Model\ModForumSetSubscriptionStateRequest**](../Model/ModForumSetSubscriptionStateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumSetSubscriptionState200Response**](../Model/ModForumSetSubscriptionState200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumToggleFavouriteState()`

```php
modForumToggleFavouriteState($mod_forum_toggle_favourite_state_request): \OpenAPI\Client\Model\ModForumSetSubscriptionState200Response
```

Toggle the favourite state

Toggle the favourite state

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_toggle_favourite_state_request = new \OpenAPI\Client\Model\ModForumToggleFavouriteStateRequest(); // \OpenAPI\Client\Model\ModForumToggleFavouriteStateRequest

try {
    $result = $apiInstance->modForumToggleFavouriteState($mod_forum_toggle_favourite_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumToggleFavouriteState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_toggle_favourite_state_request** | [**\OpenAPI\Client\Model\ModForumToggleFavouriteStateRequest**](../Model/ModForumToggleFavouriteStateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumSetSubscriptionState200Response**](../Model/ModForumSetSubscriptionState200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumUpdateDiscussionPost()`

```php
modForumUpdateDiscussionPost($mod_forum_update_discussion_post_request): \OpenAPI\Client\Model\ModForumUpdateDiscussionPost200Response
```

Updates a post or a discussion topic post.

Updates a post or a discussion topic post.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_update_discussion_post_request = new \OpenAPI\Client\Model\ModForumUpdateDiscussionPostRequest(); // \OpenAPI\Client\Model\ModForumUpdateDiscussionPostRequest

try {
    $result = $apiInstance->modForumUpdateDiscussionPost($mod_forum_update_discussion_post_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumUpdateDiscussionPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_update_discussion_post_request** | [**\OpenAPI\Client\Model\ModForumUpdateDiscussionPostRequest**](../Model/ModForumUpdateDiscussionPostRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ModForumUpdateDiscussionPost200Response**](../Model/ModForumUpdateDiscussionPost200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumViewForum()`

```php
modForumViewForum($mod_forum_view_forum_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_view_forum_request = new \OpenAPI\Client\Model\ModForumViewForumRequest(); // \OpenAPI\Client\Model\ModForumViewForumRequest

try {
    $result = $apiInstance->modForumViewForum($mod_forum_view_forum_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumViewForum: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_view_forum_request** | [**\OpenAPI\Client\Model\ModForumViewForumRequest**](../Model/ModForumViewForumRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modForumViewForumDiscussion()`

```php
modForumViewForumDiscussion($mod_forum_view_forum_discussion_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the forum discussion viewed event.

Trigger the forum discussion viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ModForumApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$mod_forum_view_forum_discussion_request = new \OpenAPI\Client\Model\ModForumViewForumDiscussionRequest(); // \OpenAPI\Client\Model\ModForumViewForumDiscussionRequest

try {
    $result = $apiInstance->modForumViewForumDiscussion($mod_forum_view_forum_discussion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModForumApi->modForumViewForumDiscussion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mod_forum_view_forum_discussion_request** | [**\OpenAPI\Client\Model\ModForumViewForumDiscussionRequest**](../Model/ModForumViewForumDiscussionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

# openapi_client.ModForumApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_forum_add_discussion**](ModForumApi.md#mod_forum_add_discussion) | **POST** /mod_forum_add_discussion | Add a new discussion into an existing forum.
[**mod_forum_add_discussion_post**](ModForumApi.md#mod_forum_add_discussion_post) | **POST** /mod_forum_add_discussion_post | Create new posts into an existing discussion.
[**mod_forum_can_add_discussion**](ModForumApi.md#mod_forum_can_add_discussion) | **POST** /mod_forum_can_add_discussion | Check if the current user can add discussions in the given forum (and optionally for the given group).
[**mod_forum_delete_post**](ModForumApi.md#mod_forum_delete_post) | **POST** /mod_forum_delete_post | Deletes a post or a discussion completely when the post is the discussion topic.
[**mod_forum_get_discussion_post**](ModForumApi.md#mod_forum_get_discussion_post) | **POST** /mod_forum_get_discussion_post | Get a particular discussion post.
[**mod_forum_get_discussion_posts**](ModForumApi.md#mod_forum_get_discussion_posts) | **POST** /mod_forum_get_discussion_posts | Returns a list of forum posts for a discussion.
[**mod_forum_get_discussion_posts_by_userid**](ModForumApi.md#mod_forum_get_discussion_posts_by_userid) | **POST** /mod_forum_get_discussion_posts_by_userid | Returns a list of forum posts for a discussion for a user.
[**mod_forum_get_forum_access_information**](ModForumApi.md#mod_forum_get_forum_access_information) | **POST** /mod_forum_get_forum_access_information | Return capabilities information for a given forum.
[**mod_forum_get_forum_discussions**](ModForumApi.md#mod_forum_get_forum_discussions) | **POST** /mod_forum_get_forum_discussions | Returns a list of forum discussions optionally sorted and paginated.
[**mod_forum_get_forum_discussions_paginated**](ModForumApi.md#mod_forum_get_forum_discussions_paginated) | **POST** /mod_forum_get_forum_discussions_paginated | ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
[**mod_forum_get_forums_by_courses**](ModForumApi.md#mod_forum_get_forums_by_courses) | **POST** /mod_forum_get_forums_by_courses | Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
[**mod_forum_prepare_draft_area_for_post**](ModForumApi.md#mod_forum_prepare_draft_area_for_post) | **POST** /mod_forum_prepare_draft_area_for_post | Prepares a draft area for editing a post.
[**mod_forum_set_lock_state**](ModForumApi.md#mod_forum_set_lock_state) | **POST** /mod_forum_set_lock_state | Set the lock state for the discussion
[**mod_forum_set_pin_state**](ModForumApi.md#mod_forum_set_pin_state) | **POST** /mod_forum_set_pin_state | Set the pin state
[**mod_forum_set_subscription_state**](ModForumApi.md#mod_forum_set_subscription_state) | **POST** /mod_forum_set_subscription_state | Set the subscription state
[**mod_forum_toggle_favourite_state**](ModForumApi.md#mod_forum_toggle_favourite_state) | **POST** /mod_forum_toggle_favourite_state | Toggle the favourite state
[**mod_forum_update_discussion_post**](ModForumApi.md#mod_forum_update_discussion_post) | **POST** /mod_forum_update_discussion_post | Updates a post or a discussion topic post.
[**mod_forum_view_forum**](ModForumApi.md#mod_forum_view_forum) | **POST** /mod_forum_view_forum | Trigger the course module viewed event and update the module completion status.
[**mod_forum_view_forum_discussion**](ModForumApi.md#mod_forum_view_forum_discussion) | **POST** /mod_forum_view_forum_discussion | Trigger the forum discussion viewed event.


# **mod_forum_add_discussion**
> ModForumAddDiscussion200Response mod_forum_add_discussion(mod_forum_add_discussion_request)

Add a new discussion into an existing forum.

Add a new discussion into an existing forum.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_add_discussion200_response import ModForumAddDiscussion200Response
from openapi_client.models.mod_forum_add_discussion_request import ModForumAddDiscussionRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_add_discussion_request = openapi_client.ModForumAddDiscussionRequest() # ModForumAddDiscussionRequest | 

    try:
        # Add a new discussion into an existing forum.
        api_response = api_instance.mod_forum_add_discussion(mod_forum_add_discussion_request)
        print("The response of ModForumApi->mod_forum_add_discussion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_add_discussion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_add_discussion_request** | [**ModForumAddDiscussionRequest**](ModForumAddDiscussionRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_add_discussion_post**
> ModForumAddDiscussionPost200Response mod_forum_add_discussion_post(mod_forum_add_discussion_post_request)

Create new posts into an existing discussion.

Create new posts into an existing discussion.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_add_discussion_post200_response import ModForumAddDiscussionPost200Response
from openapi_client.models.mod_forum_add_discussion_post_request import ModForumAddDiscussionPostRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_add_discussion_post_request = openapi_client.ModForumAddDiscussionPostRequest() # ModForumAddDiscussionPostRequest | 

    try:
        # Create new posts into an existing discussion.
        api_response = api_instance.mod_forum_add_discussion_post(mod_forum_add_discussion_post_request)
        print("The response of ModForumApi->mod_forum_add_discussion_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_add_discussion_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_add_discussion_post_request** | [**ModForumAddDiscussionPostRequest**](ModForumAddDiscussionPostRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_can_add_discussion**
> ModForumCanAddDiscussion200Response mod_forum_can_add_discussion(mod_forum_can_add_discussion_request)

Check if the current user can add discussions in the given forum (and optionally for the given group).

Check if the current user can add discussions in the given forum (and optionally for the given group).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_can_add_discussion200_response import ModForumCanAddDiscussion200Response
from openapi_client.models.mod_forum_can_add_discussion_request import ModForumCanAddDiscussionRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_can_add_discussion_request = openapi_client.ModForumCanAddDiscussionRequest() # ModForumCanAddDiscussionRequest | 

    try:
        # Check if the current user can add discussions in the given forum (and optionally for the given group).
        api_response = api_instance.mod_forum_can_add_discussion(mod_forum_can_add_discussion_request)
        print("The response of ModForumApi->mod_forum_can_add_discussion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_can_add_discussion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_can_add_discussion_request** | [**ModForumCanAddDiscussionRequest**](ModForumCanAddDiscussionRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_delete_post**
> ModForumDeletePost200Response mod_forum_delete_post(mod_forum_delete_post_request)

Deletes a post or a discussion completely when the post is the discussion topic.

Deletes a post or a discussion completely when the post is the discussion topic.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_delete_post200_response import ModForumDeletePost200Response
from openapi_client.models.mod_forum_delete_post_request import ModForumDeletePostRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_delete_post_request = openapi_client.ModForumDeletePostRequest() # ModForumDeletePostRequest | 

    try:
        # Deletes a post or a discussion completely when the post is the discussion topic.
        api_response = api_instance.mod_forum_delete_post(mod_forum_delete_post_request)
        print("The response of ModForumApi->mod_forum_delete_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_delete_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_delete_post_request** | [**ModForumDeletePostRequest**](ModForumDeletePostRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_get_discussion_post**
> ModForumGetDiscussionPost200Response mod_forum_get_discussion_post(mod_forum_get_discussion_post_request)

Get a particular discussion post.

Get a particular discussion post.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_get_discussion_post200_response import ModForumGetDiscussionPost200Response
from openapi_client.models.mod_forum_get_discussion_post_request import ModForumGetDiscussionPostRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_get_discussion_post_request = openapi_client.ModForumGetDiscussionPostRequest() # ModForumGetDiscussionPostRequest | 

    try:
        # Get a particular discussion post.
        api_response = api_instance.mod_forum_get_discussion_post(mod_forum_get_discussion_post_request)
        print("The response of ModForumApi->mod_forum_get_discussion_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_get_discussion_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_get_discussion_post_request** | [**ModForumGetDiscussionPostRequest**](ModForumGetDiscussionPostRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_get_discussion_posts**
> ModForumGetDiscussionPosts200Response mod_forum_get_discussion_posts(mod_forum_get_discussion_posts_request)

Returns a list of forum posts for a discussion.

Returns a list of forum posts for a discussion.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_get_discussion_posts200_response import ModForumGetDiscussionPosts200Response
from openapi_client.models.mod_forum_get_discussion_posts_request import ModForumGetDiscussionPostsRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_get_discussion_posts_request = openapi_client.ModForumGetDiscussionPostsRequest() # ModForumGetDiscussionPostsRequest | 

    try:
        # Returns a list of forum posts for a discussion.
        api_response = api_instance.mod_forum_get_discussion_posts(mod_forum_get_discussion_posts_request)
        print("The response of ModForumApi->mod_forum_get_discussion_posts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_get_discussion_posts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_get_discussion_posts_request** | [**ModForumGetDiscussionPostsRequest**](ModForumGetDiscussionPostsRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_get_discussion_posts_by_userid**
> ModForumGetDiscussionPostsByUserid200Response mod_forum_get_discussion_posts_by_userid(mod_forum_get_discussion_posts_by_userid_request)

Returns a list of forum posts for a discussion for a user.

Returns a list of forum posts for a discussion for a user.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_get_discussion_posts_by_userid200_response import ModForumGetDiscussionPostsByUserid200Response
from openapi_client.models.mod_forum_get_discussion_posts_by_userid_request import ModForumGetDiscussionPostsByUseridRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_get_discussion_posts_by_userid_request = openapi_client.ModForumGetDiscussionPostsByUseridRequest() # ModForumGetDiscussionPostsByUseridRequest | 

    try:
        # Returns a list of forum posts for a discussion for a user.
        api_response = api_instance.mod_forum_get_discussion_posts_by_userid(mod_forum_get_discussion_posts_by_userid_request)
        print("The response of ModForumApi->mod_forum_get_discussion_posts_by_userid:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_get_discussion_posts_by_userid: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_get_discussion_posts_by_userid_request** | [**ModForumGetDiscussionPostsByUseridRequest**](ModForumGetDiscussionPostsByUseridRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_get_forum_access_information**
> ModForumGetForumAccessInformation200Response mod_forum_get_forum_access_information(mod_forum_get_forum_access_information_request)

Return capabilities information for a given forum.

Return capabilities information for a given forum.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_get_forum_access_information200_response import ModForumGetForumAccessInformation200Response
from openapi_client.models.mod_forum_get_forum_access_information_request import ModForumGetForumAccessInformationRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_get_forum_access_information_request = openapi_client.ModForumGetForumAccessInformationRequest() # ModForumGetForumAccessInformationRequest | 

    try:
        # Return capabilities information for a given forum.
        api_response = api_instance.mod_forum_get_forum_access_information(mod_forum_get_forum_access_information_request)
        print("The response of ModForumApi->mod_forum_get_forum_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_get_forum_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_get_forum_access_information_request** | [**ModForumGetForumAccessInformationRequest**](ModForumGetForumAccessInformationRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_get_forum_discussions**
> ModForumGetForumDiscussions200Response mod_forum_get_forum_discussions(mod_forum_get_forum_discussions_request)

Returns a list of forum discussions optionally sorted and paginated.

Returns a list of forum discussions optionally sorted and paginated.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_get_forum_discussions200_response import ModForumGetForumDiscussions200Response
from openapi_client.models.mod_forum_get_forum_discussions_request import ModForumGetForumDiscussionsRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_get_forum_discussions_request = openapi_client.ModForumGetForumDiscussionsRequest() # ModForumGetForumDiscussionsRequest | 

    try:
        # Returns a list of forum discussions optionally sorted and paginated.
        api_response = api_instance.mod_forum_get_forum_discussions(mod_forum_get_forum_discussions_request)
        print("The response of ModForumApi->mod_forum_get_forum_discussions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_get_forum_discussions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_get_forum_discussions_request** | [**ModForumGetForumDiscussionsRequest**](ModForumGetForumDiscussionsRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_get_forum_discussions_paginated**
> ModForumGetForumDiscussionsPaginated200Response mod_forum_get_forum_discussions_paginated(mod_forum_get_forum_discussions_paginated_request)

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_get_forum_discussions_paginated200_response import ModForumGetForumDiscussionsPaginated200Response
from openapi_client.models.mod_forum_get_forum_discussions_paginated_request import ModForumGetForumDiscussionsPaginatedRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_get_forum_discussions_paginated_request = openapi_client.ModForumGetForumDiscussionsPaginatedRequest() # ModForumGetForumDiscussionsPaginatedRequest | 

    try:
        # ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
        api_response = api_instance.mod_forum_get_forum_discussions_paginated(mod_forum_get_forum_discussions_paginated_request)
        print("The response of ModForumApi->mod_forum_get_forum_discussions_paginated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_get_forum_discussions_paginated: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_get_forum_discussions_paginated_request** | [**ModForumGetForumDiscussionsPaginatedRequest**](ModForumGetForumDiscussionsPaginatedRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_get_forums_by_courses**
> object mod_forum_get_forums_by_courses(mod_forum_get_forums_by_courses_request)

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_get_forums_by_courses_request import ModForumGetForumsByCoursesRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_get_forums_by_courses_request = openapi_client.ModForumGetForumsByCoursesRequest() # ModForumGetForumsByCoursesRequest | 

    try:
        # Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
        api_response = api_instance.mod_forum_get_forums_by_courses(mod_forum_get_forums_by_courses_request)
        print("The response of ModForumApi->mod_forum_get_forums_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_get_forums_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_get_forums_by_courses_request** | [**ModForumGetForumsByCoursesRequest**](ModForumGetForumsByCoursesRequest.md)|  | 

### Return type

**object**

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

# **mod_forum_prepare_draft_area_for_post**
> ModForumPrepareDraftAreaForPost200Response mod_forum_prepare_draft_area_for_post(mod_forum_prepare_draft_area_for_post_request)

Prepares a draft area for editing a post.

Prepares a draft area for editing a post.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_prepare_draft_area_for_post200_response import ModForumPrepareDraftAreaForPost200Response
from openapi_client.models.mod_forum_prepare_draft_area_for_post_request import ModForumPrepareDraftAreaForPostRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_prepare_draft_area_for_post_request = openapi_client.ModForumPrepareDraftAreaForPostRequest() # ModForumPrepareDraftAreaForPostRequest | 

    try:
        # Prepares a draft area for editing a post.
        api_response = api_instance.mod_forum_prepare_draft_area_for_post(mod_forum_prepare_draft_area_for_post_request)
        print("The response of ModForumApi->mod_forum_prepare_draft_area_for_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_prepare_draft_area_for_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_prepare_draft_area_for_post_request** | [**ModForumPrepareDraftAreaForPostRequest**](ModForumPrepareDraftAreaForPostRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_set_lock_state**
> ModForumSetLockState200Response mod_forum_set_lock_state(mod_forum_set_lock_state_request)

Set the lock state for the discussion

Set the lock state for the discussion

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_set_lock_state200_response import ModForumSetLockState200Response
from openapi_client.models.mod_forum_set_lock_state_request import ModForumSetLockStateRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_set_lock_state_request = openapi_client.ModForumSetLockStateRequest() # ModForumSetLockStateRequest | 

    try:
        # Set the lock state for the discussion
        api_response = api_instance.mod_forum_set_lock_state(mod_forum_set_lock_state_request)
        print("The response of ModForumApi->mod_forum_set_lock_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_set_lock_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_set_lock_state_request** | [**ModForumSetLockStateRequest**](ModForumSetLockStateRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_set_pin_state**
> ModForumSetPinState200Response mod_forum_set_pin_state(mod_forum_set_pin_state_request)

Set the pin state

Set the pin state

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_set_pin_state200_response import ModForumSetPinState200Response
from openapi_client.models.mod_forum_set_pin_state_request import ModForumSetPinStateRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_set_pin_state_request = openapi_client.ModForumSetPinStateRequest() # ModForumSetPinStateRequest | 

    try:
        # Set the pin state
        api_response = api_instance.mod_forum_set_pin_state(mod_forum_set_pin_state_request)
        print("The response of ModForumApi->mod_forum_set_pin_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_set_pin_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_set_pin_state_request** | [**ModForumSetPinStateRequest**](ModForumSetPinStateRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_set_subscription_state**
> ModForumSetSubscriptionState200Response mod_forum_set_subscription_state(mod_forum_set_subscription_state_request)

Set the subscription state

Set the subscription state

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_set_subscription_state200_response import ModForumSetSubscriptionState200Response
from openapi_client.models.mod_forum_set_subscription_state_request import ModForumSetSubscriptionStateRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_set_subscription_state_request = openapi_client.ModForumSetSubscriptionStateRequest() # ModForumSetSubscriptionStateRequest | 

    try:
        # Set the subscription state
        api_response = api_instance.mod_forum_set_subscription_state(mod_forum_set_subscription_state_request)
        print("The response of ModForumApi->mod_forum_set_subscription_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_set_subscription_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_set_subscription_state_request** | [**ModForumSetSubscriptionStateRequest**](ModForumSetSubscriptionStateRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_toggle_favourite_state**
> ModForumSetSubscriptionState200Response mod_forum_toggle_favourite_state(mod_forum_toggle_favourite_state_request)

Toggle the favourite state

Toggle the favourite state

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_set_subscription_state200_response import ModForumSetSubscriptionState200Response
from openapi_client.models.mod_forum_toggle_favourite_state_request import ModForumToggleFavouriteStateRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_toggle_favourite_state_request = openapi_client.ModForumToggleFavouriteStateRequest() # ModForumToggleFavouriteStateRequest | 

    try:
        # Toggle the favourite state
        api_response = api_instance.mod_forum_toggle_favourite_state(mod_forum_toggle_favourite_state_request)
        print("The response of ModForumApi->mod_forum_toggle_favourite_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_toggle_favourite_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_toggle_favourite_state_request** | [**ModForumToggleFavouriteStateRequest**](ModForumToggleFavouriteStateRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_update_discussion_post**
> ModForumUpdateDiscussionPost200Response mod_forum_update_discussion_post(mod_forum_update_discussion_post_request)

Updates a post or a discussion topic post.

Updates a post or a discussion topic post.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_forum_update_discussion_post200_response import ModForumUpdateDiscussionPost200Response
from openapi_client.models.mod_forum_update_discussion_post_request import ModForumUpdateDiscussionPostRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_update_discussion_post_request = openapi_client.ModForumUpdateDiscussionPostRequest() # ModForumUpdateDiscussionPostRequest | 

    try:
        # Updates a post or a discussion topic post.
        api_response = api_instance.mod_forum_update_discussion_post(mod_forum_update_discussion_post_request)
        print("The response of ModForumApi->mod_forum_update_discussion_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_update_discussion_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_update_discussion_post_request** | [**ModForumUpdateDiscussionPostRequest**](ModForumUpdateDiscussionPostRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mod_forum_view_forum**
> CoreCalendarDeleteSubscription200Response mod_forum_view_forum(mod_forum_view_forum_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_forum_view_forum_request import ModForumViewForumRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_view_forum_request = openapi_client.ModForumViewForumRequest() # ModForumViewForumRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_forum_view_forum(mod_forum_view_forum_request)
        print("The response of ModForumApi->mod_forum_view_forum:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_view_forum: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_view_forum_request** | [**ModForumViewForumRequest**](ModForumViewForumRequest.md)|  | 

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

# **mod_forum_view_forum_discussion**
> CoreCalendarDeleteSubscription200Response mod_forum_view_forum_discussion(mod_forum_view_forum_discussion_request)

Trigger the forum discussion viewed event.

Trigger the forum discussion viewed event.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_forum_view_forum_discussion_request import ModForumViewForumDiscussionRequest
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
    api_instance = openapi_client.ModForumApi(api_client)
    mod_forum_view_forum_discussion_request = openapi_client.ModForumViewForumDiscussionRequest() # ModForumViewForumDiscussionRequest | 

    try:
        # Trigger the forum discussion viewed event.
        api_response = api_instance.mod_forum_view_forum_discussion(mod_forum_view_forum_discussion_request)
        print("The response of ModForumApi->mod_forum_view_forum_discussion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModForumApi->mod_forum_view_forum_discussion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_forum_view_forum_discussion_request** | [**ModForumViewForumDiscussionRequest**](ModForumViewForumDiscussionRequest.md)|  | 

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


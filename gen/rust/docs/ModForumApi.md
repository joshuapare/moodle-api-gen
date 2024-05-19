# \ModForumApi

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



## mod_forum_add_discussion

> models::ModForumAddDiscussion200Response mod_forum_add_discussion(mod_forum_add_discussion_request)
Add a new discussion into an existing forum.

Add a new discussion into an existing forum.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_add_discussion_request** | [**ModForumAddDiscussionRequest**](ModForumAddDiscussionRequest.md) |  | [required] |

### Return type

[**models::ModForumAddDiscussion200Response**](mod_forum_add_discussion_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_add_discussion_post

> models::ModForumAddDiscussionPost200Response mod_forum_add_discussion_post(mod_forum_add_discussion_post_request)
Create new posts into an existing discussion.

Create new posts into an existing discussion.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_add_discussion_post_request** | [**ModForumAddDiscussionPostRequest**](ModForumAddDiscussionPostRequest.md) |  | [required] |

### Return type

[**models::ModForumAddDiscussionPost200Response**](mod_forum_add_discussion_post_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_can_add_discussion

> models::ModForumCanAddDiscussion200Response mod_forum_can_add_discussion(mod_forum_can_add_discussion_request)
Check if the current user can add discussions in the given forum (and optionally for the given group).

Check if the current user can add discussions in the given forum (and optionally for the given group).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_can_add_discussion_request** | [**ModForumCanAddDiscussionRequest**](ModForumCanAddDiscussionRequest.md) |  | [required] |

### Return type

[**models::ModForumCanAddDiscussion200Response**](mod_forum_can_add_discussion_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_delete_post

> models::ModForumDeletePost200Response mod_forum_delete_post(mod_forum_delete_post_request)
Deletes a post or a discussion completely when the post is the discussion topic.

Deletes a post or a discussion completely when the post is the discussion topic.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_delete_post_request** | [**ModForumDeletePostRequest**](ModForumDeletePostRequest.md) |  | [required] |

### Return type

[**models::ModForumDeletePost200Response**](mod_forum_delete_post_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_get_discussion_post

> models::ModForumGetDiscussionPost200Response mod_forum_get_discussion_post(mod_forum_get_discussion_post_request)
Get a particular discussion post.

Get a particular discussion post.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_get_discussion_post_request** | [**ModForumGetDiscussionPostRequest**](ModForumGetDiscussionPostRequest.md) |  | [required] |

### Return type

[**models::ModForumGetDiscussionPost200Response**](mod_forum_get_discussion_post_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_get_discussion_posts

> models::ModForumGetDiscussionPosts200Response mod_forum_get_discussion_posts(mod_forum_get_discussion_posts_request)
Returns a list of forum posts for a discussion.

Returns a list of forum posts for a discussion.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_get_discussion_posts_request** | [**ModForumGetDiscussionPostsRequest**](ModForumGetDiscussionPostsRequest.md) |  | [required] |

### Return type

[**models::ModForumGetDiscussionPosts200Response**](mod_forum_get_discussion_posts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_get_discussion_posts_by_userid

> models::ModForumGetDiscussionPostsByUserid200Response mod_forum_get_discussion_posts_by_userid(mod_forum_get_discussion_posts_by_userid_request)
Returns a list of forum posts for a discussion for a user.

Returns a list of forum posts for a discussion for a user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_get_discussion_posts_by_userid_request** | [**ModForumGetDiscussionPostsByUseridRequest**](ModForumGetDiscussionPostsByUseridRequest.md) |  | [required] |

### Return type

[**models::ModForumGetDiscussionPostsByUserid200Response**](mod_forum_get_discussion_posts_by_userid_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_get_forum_access_information

> models::ModForumGetForumAccessInformation200Response mod_forum_get_forum_access_information(mod_forum_get_forum_access_information_request)
Return capabilities information for a given forum.

Return capabilities information for a given forum.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_get_forum_access_information_request** | [**ModForumGetForumAccessInformationRequest**](ModForumGetForumAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModForumGetForumAccessInformation200Response**](mod_forum_get_forum_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_get_forum_discussions

> models::ModForumGetForumDiscussions200Response mod_forum_get_forum_discussions(mod_forum_get_forum_discussions_request)
Returns a list of forum discussions optionally sorted and paginated.

Returns a list of forum discussions optionally sorted and paginated.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_get_forum_discussions_request** | [**ModForumGetForumDiscussionsRequest**](ModForumGetForumDiscussionsRequest.md) |  | [required] |

### Return type

[**models::ModForumGetForumDiscussions200Response**](mod_forum_get_forum_discussions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_get_forum_discussions_paginated

> models::ModForumGetForumDiscussionsPaginated200Response mod_forum_get_forum_discussions_paginated(mod_forum_get_forum_discussions_paginated_request)
** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_get_forum_discussions_paginated_request** | [**ModForumGetForumDiscussionsPaginatedRequest**](ModForumGetForumDiscussionsPaginatedRequest.md) |  | [required] |

### Return type

[**models::ModForumGetForumDiscussionsPaginated200Response**](mod_forum_get_forum_discussions_paginated_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_get_forums_by_courses

> serde_json::Value mod_forum_get_forums_by_courses(mod_forum_get_forums_by_courses_request)
Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_get_forums_by_courses_request** | [**ModForumGetForumsByCoursesRequest**](ModForumGetForumsByCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_prepare_draft_area_for_post

> models::ModForumPrepareDraftAreaForPost200Response mod_forum_prepare_draft_area_for_post(mod_forum_prepare_draft_area_for_post_request)
Prepares a draft area for editing a post.

Prepares a draft area for editing a post.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_prepare_draft_area_for_post_request** | [**ModForumPrepareDraftAreaForPostRequest**](ModForumPrepareDraftAreaForPostRequest.md) |  | [required] |

### Return type

[**models::ModForumPrepareDraftAreaForPost200Response**](mod_forum_prepare_draft_area_for_post_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_set_lock_state

> models::ModForumSetLockState200Response mod_forum_set_lock_state(mod_forum_set_lock_state_request)
Set the lock state for the discussion

Set the lock state for the discussion

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_set_lock_state_request** | [**ModForumSetLockStateRequest**](ModForumSetLockStateRequest.md) |  | [required] |

### Return type

[**models::ModForumSetLockState200Response**](mod_forum_set_lock_state_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_set_pin_state

> models::ModForumSetPinState200Response mod_forum_set_pin_state(mod_forum_set_pin_state_request)
Set the pin state

Set the pin state

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_set_pin_state_request** | [**ModForumSetPinStateRequest**](ModForumSetPinStateRequest.md) |  | [required] |

### Return type

[**models::ModForumSetPinState200Response**](mod_forum_set_pin_state_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_set_subscription_state

> models::ModForumSetSubscriptionState200Response mod_forum_set_subscription_state(mod_forum_set_subscription_state_request)
Set the subscription state

Set the subscription state

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_set_subscription_state_request** | [**ModForumSetSubscriptionStateRequest**](ModForumSetSubscriptionStateRequest.md) |  | [required] |

### Return type

[**models::ModForumSetSubscriptionState200Response**](mod_forum_set_subscription_state_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_toggle_favourite_state

> models::ModForumSetSubscriptionState200Response mod_forum_toggle_favourite_state(mod_forum_toggle_favourite_state_request)
Toggle the favourite state

Toggle the favourite state

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_toggle_favourite_state_request** | [**ModForumToggleFavouriteStateRequest**](ModForumToggleFavouriteStateRequest.md) |  | [required] |

### Return type

[**models::ModForumSetSubscriptionState200Response**](mod_forum_set_subscription_state_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_update_discussion_post

> models::ModForumUpdateDiscussionPost200Response mod_forum_update_discussion_post(mod_forum_update_discussion_post_request)
Updates a post or a discussion topic post.

Updates a post or a discussion topic post.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_update_discussion_post_request** | [**ModForumUpdateDiscussionPostRequest**](ModForumUpdateDiscussionPostRequest.md) |  | [required] |

### Return type

[**models::ModForumUpdateDiscussionPost200Response**](mod_forum_update_discussion_post_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_view_forum

> models::CoreCalendarDeleteSubscription200Response mod_forum_view_forum(mod_forum_view_forum_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_view_forum_request** | [**ModForumViewForumRequest**](ModForumViewForumRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_forum_view_forum_discussion

> models::CoreCalendarDeleteSubscription200Response mod_forum_view_forum_discussion(mod_forum_view_forum_discussion_request)
Trigger the forum discussion viewed event.

Trigger the forum discussion viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_forum_view_forum_discussion_request** | [**ModForumViewForumDiscussionRequest**](ModForumViewForumDiscussionRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


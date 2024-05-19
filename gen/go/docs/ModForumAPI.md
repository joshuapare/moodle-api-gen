# \ModForumAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModForumAddDiscussion**](ModForumAPI.md#ModForumAddDiscussion) | **Post** /mod_forum_add_discussion | Add a new discussion into an existing forum.
[**ModForumAddDiscussionPost**](ModForumAPI.md#ModForumAddDiscussionPost) | **Post** /mod_forum_add_discussion_post | Create new posts into an existing discussion.
[**ModForumCanAddDiscussion**](ModForumAPI.md#ModForumCanAddDiscussion) | **Post** /mod_forum_can_add_discussion | Check if the current user can add discussions in the given forum (and optionally for the given group).
[**ModForumDeletePost**](ModForumAPI.md#ModForumDeletePost) | **Post** /mod_forum_delete_post | Deletes a post or a discussion completely when the post is the discussion topic.
[**ModForumGetDiscussionPost**](ModForumAPI.md#ModForumGetDiscussionPost) | **Post** /mod_forum_get_discussion_post | Get a particular discussion post.
[**ModForumGetDiscussionPosts**](ModForumAPI.md#ModForumGetDiscussionPosts) | **Post** /mod_forum_get_discussion_posts | Returns a list of forum posts for a discussion.
[**ModForumGetDiscussionPostsByUserid**](ModForumAPI.md#ModForumGetDiscussionPostsByUserid) | **Post** /mod_forum_get_discussion_posts_by_userid | Returns a list of forum posts for a discussion for a user.
[**ModForumGetForumAccessInformation**](ModForumAPI.md#ModForumGetForumAccessInformation) | **Post** /mod_forum_get_forum_access_information | Return capabilities information for a given forum.
[**ModForumGetForumDiscussions**](ModForumAPI.md#ModForumGetForumDiscussions) | **Post** /mod_forum_get_forum_discussions | Returns a list of forum discussions optionally sorted and paginated.
[**ModForumGetForumDiscussionsPaginated**](ModForumAPI.md#ModForumGetForumDiscussionsPaginated) | **Post** /mod_forum_get_forum_discussions_paginated | ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
[**ModForumGetForumsByCourses**](ModForumAPI.md#ModForumGetForumsByCourses) | **Post** /mod_forum_get_forums_by_courses | Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
[**ModForumPrepareDraftAreaForPost**](ModForumAPI.md#ModForumPrepareDraftAreaForPost) | **Post** /mod_forum_prepare_draft_area_for_post | Prepares a draft area for editing a post.
[**ModForumSetLockState**](ModForumAPI.md#ModForumSetLockState) | **Post** /mod_forum_set_lock_state | Set the lock state for the discussion
[**ModForumSetPinState**](ModForumAPI.md#ModForumSetPinState) | **Post** /mod_forum_set_pin_state | Set the pin state
[**ModForumSetSubscriptionState**](ModForumAPI.md#ModForumSetSubscriptionState) | **Post** /mod_forum_set_subscription_state | Set the subscription state
[**ModForumToggleFavouriteState**](ModForumAPI.md#ModForumToggleFavouriteState) | **Post** /mod_forum_toggle_favourite_state | Toggle the favourite state
[**ModForumUpdateDiscussionPost**](ModForumAPI.md#ModForumUpdateDiscussionPost) | **Post** /mod_forum_update_discussion_post | Updates a post or a discussion topic post.
[**ModForumViewForum**](ModForumAPI.md#ModForumViewForum) | **Post** /mod_forum_view_forum | Trigger the course module viewed event and update the module completion status.
[**ModForumViewForumDiscussion**](ModForumAPI.md#ModForumViewForumDiscussion) | **Post** /mod_forum_view_forum_discussion | Trigger the forum discussion viewed event.



## ModForumAddDiscussion

> ModForumAddDiscussion200Response ModForumAddDiscussion(ctx).ModForumAddDiscussionRequest(modForumAddDiscussionRequest).Execute()

Add a new discussion into an existing forum.



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
	modForumAddDiscussionRequest := *openapiclient.NewModForumAddDiscussionRequest(int32(123), "Message_example", "Subject_example") // ModForumAddDiscussionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumAddDiscussion(context.Background()).ModForumAddDiscussionRequest(modForumAddDiscussionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumAddDiscussion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumAddDiscussion`: ModForumAddDiscussion200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumAddDiscussion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumAddDiscussionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumAddDiscussionRequest** | [**ModForumAddDiscussionRequest**](ModForumAddDiscussionRequest.md) |  | 

### Return type

[**ModForumAddDiscussion200Response**](ModForumAddDiscussion200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumAddDiscussionPost

> ModForumAddDiscussionPost200Response ModForumAddDiscussionPost(ctx).ModForumAddDiscussionPostRequest(modForumAddDiscussionPostRequest).Execute()

Create new posts into an existing discussion.



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
	modForumAddDiscussionPostRequest := *openapiclient.NewModForumAddDiscussionPostRequest("Message_example", int32(123), "Subject_example") // ModForumAddDiscussionPostRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumAddDiscussionPost(context.Background()).ModForumAddDiscussionPostRequest(modForumAddDiscussionPostRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumAddDiscussionPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumAddDiscussionPost`: ModForumAddDiscussionPost200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumAddDiscussionPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumAddDiscussionPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumAddDiscussionPostRequest** | [**ModForumAddDiscussionPostRequest**](ModForumAddDiscussionPostRequest.md) |  | 

### Return type

[**ModForumAddDiscussionPost200Response**](ModForumAddDiscussionPost200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumCanAddDiscussion

> ModForumCanAddDiscussion200Response ModForumCanAddDiscussion(ctx).ModForumCanAddDiscussionRequest(modForumCanAddDiscussionRequest).Execute()

Check if the current user can add discussions in the given forum (and optionally for the given group).



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
	modForumCanAddDiscussionRequest := *openapiclient.NewModForumCanAddDiscussionRequest(int32(123)) // ModForumCanAddDiscussionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumCanAddDiscussion(context.Background()).ModForumCanAddDiscussionRequest(modForumCanAddDiscussionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumCanAddDiscussion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumCanAddDiscussion`: ModForumCanAddDiscussion200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumCanAddDiscussion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumCanAddDiscussionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumCanAddDiscussionRequest** | [**ModForumCanAddDiscussionRequest**](ModForumCanAddDiscussionRequest.md) |  | 

### Return type

[**ModForumCanAddDiscussion200Response**](ModForumCanAddDiscussion200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumDeletePost

> ModForumDeletePost200Response ModForumDeletePost(ctx).ModForumDeletePostRequest(modForumDeletePostRequest).Execute()

Deletes a post or a discussion completely when the post is the discussion topic.



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
	modForumDeletePostRequest := *openapiclient.NewModForumDeletePostRequest(int32(123)) // ModForumDeletePostRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumDeletePost(context.Background()).ModForumDeletePostRequest(modForumDeletePostRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumDeletePost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumDeletePost`: ModForumDeletePost200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumDeletePost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumDeletePostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumDeletePostRequest** | [**ModForumDeletePostRequest**](ModForumDeletePostRequest.md) |  | 

### Return type

[**ModForumDeletePost200Response**](ModForumDeletePost200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumGetDiscussionPost

> ModForumGetDiscussionPost200Response ModForumGetDiscussionPost(ctx).ModForumGetDiscussionPostRequest(modForumGetDiscussionPostRequest).Execute()

Get a particular discussion post.



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
	modForumGetDiscussionPostRequest := *openapiclient.NewModForumGetDiscussionPostRequest(int32(123)) // ModForumGetDiscussionPostRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumGetDiscussionPost(context.Background()).ModForumGetDiscussionPostRequest(modForumGetDiscussionPostRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumGetDiscussionPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumGetDiscussionPost`: ModForumGetDiscussionPost200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumGetDiscussionPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumGetDiscussionPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumGetDiscussionPostRequest** | [**ModForumGetDiscussionPostRequest**](ModForumGetDiscussionPostRequest.md) |  | 

### Return type

[**ModForumGetDiscussionPost200Response**](ModForumGetDiscussionPost200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumGetDiscussionPosts

> ModForumGetDiscussionPosts200Response ModForumGetDiscussionPosts(ctx).ModForumGetDiscussionPostsRequest(modForumGetDiscussionPostsRequest).Execute()

Returns a list of forum posts for a discussion.



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
	modForumGetDiscussionPostsRequest := *openapiclient.NewModForumGetDiscussionPostsRequest(int32(123)) // ModForumGetDiscussionPostsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumGetDiscussionPosts(context.Background()).ModForumGetDiscussionPostsRequest(modForumGetDiscussionPostsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumGetDiscussionPosts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumGetDiscussionPosts`: ModForumGetDiscussionPosts200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumGetDiscussionPosts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumGetDiscussionPostsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumGetDiscussionPostsRequest** | [**ModForumGetDiscussionPostsRequest**](ModForumGetDiscussionPostsRequest.md) |  | 

### Return type

[**ModForumGetDiscussionPosts200Response**](ModForumGetDiscussionPosts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumGetDiscussionPostsByUserid

> ModForumGetDiscussionPostsByUserid200Response ModForumGetDiscussionPostsByUserid(ctx).ModForumGetDiscussionPostsByUseridRequest(modForumGetDiscussionPostsByUseridRequest).Execute()

Returns a list of forum posts for a discussion for a user.



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
	modForumGetDiscussionPostsByUseridRequest := *openapiclient.NewModForumGetDiscussionPostsByUseridRequest(int32(123), int32(123)) // ModForumGetDiscussionPostsByUseridRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumGetDiscussionPostsByUserid(context.Background()).ModForumGetDiscussionPostsByUseridRequest(modForumGetDiscussionPostsByUseridRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumGetDiscussionPostsByUserid``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumGetDiscussionPostsByUserid`: ModForumGetDiscussionPostsByUserid200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumGetDiscussionPostsByUserid`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumGetDiscussionPostsByUseridRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumGetDiscussionPostsByUseridRequest** | [**ModForumGetDiscussionPostsByUseridRequest**](ModForumGetDiscussionPostsByUseridRequest.md) |  | 

### Return type

[**ModForumGetDiscussionPostsByUserid200Response**](ModForumGetDiscussionPostsByUserid200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumGetForumAccessInformation

> ModForumGetForumAccessInformation200Response ModForumGetForumAccessInformation(ctx).ModForumGetForumAccessInformationRequest(modForumGetForumAccessInformationRequest).Execute()

Return capabilities information for a given forum.



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
	modForumGetForumAccessInformationRequest := *openapiclient.NewModForumGetForumAccessInformationRequest(int32(123)) // ModForumGetForumAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumGetForumAccessInformation(context.Background()).ModForumGetForumAccessInformationRequest(modForumGetForumAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumGetForumAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumGetForumAccessInformation`: ModForumGetForumAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumGetForumAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumGetForumAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumGetForumAccessInformationRequest** | [**ModForumGetForumAccessInformationRequest**](ModForumGetForumAccessInformationRequest.md) |  | 

### Return type

[**ModForumGetForumAccessInformation200Response**](ModForumGetForumAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumGetForumDiscussions

> ModForumGetForumDiscussions200Response ModForumGetForumDiscussions(ctx).ModForumGetForumDiscussionsRequest(modForumGetForumDiscussionsRequest).Execute()

Returns a list of forum discussions optionally sorted and paginated.



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
	modForumGetForumDiscussionsRequest := *openapiclient.NewModForumGetForumDiscussionsRequest(int32(123)) // ModForumGetForumDiscussionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumGetForumDiscussions(context.Background()).ModForumGetForumDiscussionsRequest(modForumGetForumDiscussionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumGetForumDiscussions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumGetForumDiscussions`: ModForumGetForumDiscussions200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumGetForumDiscussions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumGetForumDiscussionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumGetForumDiscussionsRequest** | [**ModForumGetForumDiscussionsRequest**](ModForumGetForumDiscussionsRequest.md) |  | 

### Return type

[**ModForumGetForumDiscussions200Response**](ModForumGetForumDiscussions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumGetForumDiscussionsPaginated

> ModForumGetForumDiscussionsPaginated200Response ModForumGetForumDiscussionsPaginated(ctx).ModForumGetForumDiscussionsPaginatedRequest(modForumGetForumDiscussionsPaginatedRequest).Execute()

** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.



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
	modForumGetForumDiscussionsPaginatedRequest := *openapiclient.NewModForumGetForumDiscussionsPaginatedRequest(int32(123)) // ModForumGetForumDiscussionsPaginatedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumGetForumDiscussionsPaginated(context.Background()).ModForumGetForumDiscussionsPaginatedRequest(modForumGetForumDiscussionsPaginatedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumGetForumDiscussionsPaginated``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumGetForumDiscussionsPaginated`: ModForumGetForumDiscussionsPaginated200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumGetForumDiscussionsPaginated`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumGetForumDiscussionsPaginatedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumGetForumDiscussionsPaginatedRequest** | [**ModForumGetForumDiscussionsPaginatedRequest**](ModForumGetForumDiscussionsPaginatedRequest.md) |  | 

### Return type

[**ModForumGetForumDiscussionsPaginated200Response**](ModForumGetForumDiscussionsPaginated200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumGetForumsByCourses

> map[string]interface{} ModForumGetForumsByCourses(ctx).ModForumGetForumsByCoursesRequest(modForumGetForumsByCoursesRequest).Execute()

Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.



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
	modForumGetForumsByCoursesRequest := *openapiclient.NewModForumGetForumsByCoursesRequest() // ModForumGetForumsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumGetForumsByCourses(context.Background()).ModForumGetForumsByCoursesRequest(modForumGetForumsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumGetForumsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumGetForumsByCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumGetForumsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumGetForumsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumGetForumsByCoursesRequest** | [**ModForumGetForumsByCoursesRequest**](ModForumGetForumsByCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumPrepareDraftAreaForPost

> ModForumPrepareDraftAreaForPost200Response ModForumPrepareDraftAreaForPost(ctx).ModForumPrepareDraftAreaForPostRequest(modForumPrepareDraftAreaForPostRequest).Execute()

Prepares a draft area for editing a post.



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
	modForumPrepareDraftAreaForPostRequest := *openapiclient.NewModForumPrepareDraftAreaForPostRequest("Area_example", int32(123)) // ModForumPrepareDraftAreaForPostRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumPrepareDraftAreaForPost(context.Background()).ModForumPrepareDraftAreaForPostRequest(modForumPrepareDraftAreaForPostRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumPrepareDraftAreaForPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumPrepareDraftAreaForPost`: ModForumPrepareDraftAreaForPost200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumPrepareDraftAreaForPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumPrepareDraftAreaForPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumPrepareDraftAreaForPostRequest** | [**ModForumPrepareDraftAreaForPostRequest**](ModForumPrepareDraftAreaForPostRequest.md) |  | 

### Return type

[**ModForumPrepareDraftAreaForPost200Response**](ModForumPrepareDraftAreaForPost200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumSetLockState

> ModForumSetLockState200Response ModForumSetLockState(ctx).ModForumSetLockStateRequest(modForumSetLockStateRequest).Execute()

Set the lock state for the discussion



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
	modForumSetLockStateRequest := *openapiclient.NewModForumSetLockStateRequest(int32(123), int32(123), int32(123)) // ModForumSetLockStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumSetLockState(context.Background()).ModForumSetLockStateRequest(modForumSetLockStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumSetLockState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumSetLockState`: ModForumSetLockState200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumSetLockState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumSetLockStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumSetLockStateRequest** | [**ModForumSetLockStateRequest**](ModForumSetLockStateRequest.md) |  | 

### Return type

[**ModForumSetLockState200Response**](ModForumSetLockState200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumSetPinState

> ModForumSetPinState200Response ModForumSetPinState(ctx).ModForumSetPinStateRequest(modForumSetPinStateRequest).Execute()

Set the pin state



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
	modForumSetPinStateRequest := *openapiclient.NewModForumSetPinStateRequest(int32(123), int32(123)) // ModForumSetPinStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumSetPinState(context.Background()).ModForumSetPinStateRequest(modForumSetPinStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumSetPinState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumSetPinState`: ModForumSetPinState200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumSetPinState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumSetPinStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumSetPinStateRequest** | [**ModForumSetPinStateRequest**](ModForumSetPinStateRequest.md) |  | 

### Return type

[**ModForumSetPinState200Response**](ModForumSetPinState200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumSetSubscriptionState

> ModForumSetSubscriptionState200Response ModForumSetSubscriptionState(ctx).ModForumSetSubscriptionStateRequest(modForumSetSubscriptionStateRequest).Execute()

Set the subscription state



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
	modForumSetSubscriptionStateRequest := *openapiclient.NewModForumSetSubscriptionStateRequest(int32(123), int32(123), false) // ModForumSetSubscriptionStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumSetSubscriptionState(context.Background()).ModForumSetSubscriptionStateRequest(modForumSetSubscriptionStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumSetSubscriptionState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumSetSubscriptionState`: ModForumSetSubscriptionState200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumSetSubscriptionState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumSetSubscriptionStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumSetSubscriptionStateRequest** | [**ModForumSetSubscriptionStateRequest**](ModForumSetSubscriptionStateRequest.md) |  | 

### Return type

[**ModForumSetSubscriptionState200Response**](ModForumSetSubscriptionState200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumToggleFavouriteState

> ModForumSetSubscriptionState200Response ModForumToggleFavouriteState(ctx).ModForumToggleFavouriteStateRequest(modForumToggleFavouriteStateRequest).Execute()

Toggle the favourite state



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
	modForumToggleFavouriteStateRequest := *openapiclient.NewModForumToggleFavouriteStateRequest(int32(123), false) // ModForumToggleFavouriteStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumToggleFavouriteState(context.Background()).ModForumToggleFavouriteStateRequest(modForumToggleFavouriteStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumToggleFavouriteState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumToggleFavouriteState`: ModForumSetSubscriptionState200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumToggleFavouriteState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumToggleFavouriteStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumToggleFavouriteStateRequest** | [**ModForumToggleFavouriteStateRequest**](ModForumToggleFavouriteStateRequest.md) |  | 

### Return type

[**ModForumSetSubscriptionState200Response**](ModForumSetSubscriptionState200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumUpdateDiscussionPost

> ModForumUpdateDiscussionPost200Response ModForumUpdateDiscussionPost(ctx).ModForumUpdateDiscussionPostRequest(modForumUpdateDiscussionPostRequest).Execute()

Updates a post or a discussion topic post.



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
	modForumUpdateDiscussionPostRequest := *openapiclient.NewModForumUpdateDiscussionPostRequest(int32(123)) // ModForumUpdateDiscussionPostRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumUpdateDiscussionPost(context.Background()).ModForumUpdateDiscussionPostRequest(modForumUpdateDiscussionPostRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumUpdateDiscussionPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumUpdateDiscussionPost`: ModForumUpdateDiscussionPost200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumUpdateDiscussionPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumUpdateDiscussionPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumUpdateDiscussionPostRequest** | [**ModForumUpdateDiscussionPostRequest**](ModForumUpdateDiscussionPostRequest.md) |  | 

### Return type

[**ModForumUpdateDiscussionPost200Response**](ModForumUpdateDiscussionPost200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModForumViewForum

> CoreCalendarDeleteSubscription200Response ModForumViewForum(ctx).ModForumViewForumRequest(modForumViewForumRequest).Execute()

Trigger the course module viewed event and update the module completion status.



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
	modForumViewForumRequest := *openapiclient.NewModForumViewForumRequest(int32(123)) // ModForumViewForumRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumViewForum(context.Background()).ModForumViewForumRequest(modForumViewForumRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumViewForum``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumViewForum`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumViewForum`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumViewForumRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumViewForumRequest** | [**ModForumViewForumRequest**](ModForumViewForumRequest.md) |  | 

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


## ModForumViewForumDiscussion

> CoreCalendarDeleteSubscription200Response ModForumViewForumDiscussion(ctx).ModForumViewForumDiscussionRequest(modForumViewForumDiscussionRequest).Execute()

Trigger the forum discussion viewed event.



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
	modForumViewForumDiscussionRequest := *openapiclient.NewModForumViewForumDiscussionRequest(int32(123)) // ModForumViewForumDiscussionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModForumAPI.ModForumViewForumDiscussion(context.Background()).ModForumViewForumDiscussionRequest(modForumViewForumDiscussionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModForumAPI.ModForumViewForumDiscussion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModForumViewForumDiscussion`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `ModForumAPI.ModForumViewForumDiscussion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModForumViewForumDiscussionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modForumViewForumDiscussionRequest** | [**ModForumViewForumDiscussionRequest**](ModForumViewForumDiscussionRequest.md) |  | 

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


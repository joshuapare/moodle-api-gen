# ModForumGetDiscussionPosts200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The forum course id | [default to null]
**forumid** | **int** | The forum id | [default to null]
**posts** | [**List[ModForumGetDiscussionPosts200ResponsePostsInner]**](ModForumGetDiscussionPosts200ResponsePostsInner.md) |  | 
**ratinginfo** | [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts200_response import ModForumGetDiscussionPosts200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPosts200Response from a JSON string
mod_forum_get_discussion_posts200_response_instance = ModForumGetDiscussionPosts200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPosts200Response.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts200_response_dict = mod_forum_get_discussion_posts200_response_instance.to_dict()
# create an instance of ModForumGetDiscussionPosts200Response from a dict
mod_forum_get_discussion_posts200_response_from_dict = ModForumGetDiscussionPosts200Response.from_dict(mod_forum_get_discussion_posts200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



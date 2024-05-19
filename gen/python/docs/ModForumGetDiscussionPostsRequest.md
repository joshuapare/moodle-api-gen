# ModForumGetDiscussionPostsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussionid** | **int** | The ID of the discussion from which to fetch posts. | [default to null]
**includeinlineattachments** | **bool** | Whether inline attachments should be included or not | [optional] [default to False]
**sortby** | **str** | Sort by this element: id, created or modified | [optional] [default to 'created']
**sortdirection** | **str** | Sort direction: ASC or DESC | [optional] [default to 'DESC']

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts_request import ModForumGetDiscussionPostsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPostsRequest from a JSON string
mod_forum_get_discussion_posts_request_instance = ModForumGetDiscussionPostsRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPostsRequest.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts_request_dict = mod_forum_get_discussion_posts_request_instance.to_dict()
# create an instance of ModForumGetDiscussionPostsRequest from a dict
mod_forum_get_discussion_posts_request_from_dict = ModForumGetDiscussionPostsRequest.from_dict(mod_forum_get_discussion_posts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



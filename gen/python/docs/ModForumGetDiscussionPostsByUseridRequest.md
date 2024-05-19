# ModForumGetDiscussionPostsByUseridRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | The ID of the module of which to fetch items. | [default to null]
**sortby** | **str** | Sort by this element: id, created or modified | [optional] [default to 'created']
**sortdirection** | **str** | Sort direction: ASC or DESC | [optional] [default to 'DESC']
**userid** | **int** | The ID of the user of whom to fetch posts. | [default to null]

## Example

```python
from openapi_client.models.mod_forum_get_discussion_posts_by_userid_request import ModForumGetDiscussionPostsByUseridRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPostsByUseridRequest from a JSON string
mod_forum_get_discussion_posts_by_userid_request_instance = ModForumGetDiscussionPostsByUseridRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPostsByUseridRequest.to_json())

# convert the object into a dict
mod_forum_get_discussion_posts_by_userid_request_dict = mod_forum_get_discussion_posts_by_userid_request_instance.to_dict()
# create an instance of ModForumGetDiscussionPostsByUseridRequest from a dict
mod_forum_get_discussion_posts_by_userid_request_from_dict = ModForumGetDiscussionPostsByUseridRequest.from_dict(mod_forum_get_discussion_posts_by_userid_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



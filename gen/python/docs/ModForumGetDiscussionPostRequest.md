# ModForumGetDiscussionPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postid** | **int** | Post to fetch. | [default to null]

## Example

```python
from openapi_client.models.mod_forum_get_discussion_post_request import ModForumGetDiscussionPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetDiscussionPostRequest from a JSON string
mod_forum_get_discussion_post_request_instance = ModForumGetDiscussionPostRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumGetDiscussionPostRequest.to_json())

# convert the object into a dict
mod_forum_get_discussion_post_request_dict = mod_forum_get_discussion_post_request_instance.to_dict()
# create an instance of ModForumGetDiscussionPostRequest from a dict
mod_forum_get_discussion_post_request_from_dict = ModForumGetDiscussionPostRequest.from_dict(mod_forum_get_discussion_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



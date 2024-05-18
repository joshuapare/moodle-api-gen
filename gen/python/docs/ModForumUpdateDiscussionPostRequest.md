# ModForumUpdateDiscussionPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Updated post message (HTML assumed if messageformat is not provided) | [optional] [default to '']
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**options** | [**List[ModForumUpdateDiscussionPostRequestOptionsInner]**](ModForumUpdateDiscussionPostRequestOptionsInner.md) |  | [optional] 
**postid** | **int** | Post to be updated. It can be a discussion topic post. | [default to null]
**subject** | **str** | Updated post subject | [optional] [default to '']

## Example

```python
from openapi_client.models.mod_forum_update_discussion_post_request import ModForumUpdateDiscussionPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumUpdateDiscussionPostRequest from a JSON string
mod_forum_update_discussion_post_request_instance = ModForumUpdateDiscussionPostRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumUpdateDiscussionPostRequest.to_json())

# convert the object into a dict
mod_forum_update_discussion_post_request_dict = mod_forum_update_discussion_post_request_instance.to_dict()
# create an instance of ModForumUpdateDiscussionPostRequest from a dict
mod_forum_update_discussion_post_request_from_dict = ModForumUpdateDiscussionPostRequest.from_dict(mod_forum_update_discussion_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



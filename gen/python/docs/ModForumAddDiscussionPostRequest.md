# ModForumAddDiscussionPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | new post message (html assumed if messageformat is not provided) | [default to 'null']
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**options** | [**List[ModForumAddDiscussionPostRequestOptionsInner]**](ModForumAddDiscussionPostRequestOptionsInner.md) |  | [optional] 
**postid** | **int** | the post id we are going to reply to                                                 (can be the initial discussion post | [default to null]
**subject** | **str** | new post subject | [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_add_discussion_post_request import ModForumAddDiscussionPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionPostRequest from a JSON string
mod_forum_add_discussion_post_request_instance = ModForumAddDiscussionPostRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionPostRequest.to_json())

# convert the object into a dict
mod_forum_add_discussion_post_request_dict = mod_forum_add_discussion_post_request_instance.to_dict()
# create an instance of ModForumAddDiscussionPostRequest from a dict
mod_forum_add_discussion_post_request_from_dict = ModForumAddDiscussionPostRequest.from_dict(mod_forum_add_discussion_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModForumAddDiscussionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forumid** | **int** | Forum instance ID | [default to null]
**groupid** | **int** | The group, default to 0 | [optional] [default to 0]
**message** | **str** | New Discussion message (only html format allowed) | [default to 'null']
**options** | [**List[ModForumAddDiscussionRequestOptionsInner]**](ModForumAddDiscussionRequestOptionsInner.md) |  | [optional] 
**subject** | **str** | New Discussion subject | [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_add_discussion_request import ModForumAddDiscussionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumAddDiscussionRequest from a JSON string
mod_forum_add_discussion_request_instance = ModForumAddDiscussionRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumAddDiscussionRequest.to_json())

# convert the object into a dict
mod_forum_add_discussion_request_dict = mod_forum_add_discussion_request_instance.to_dict()
# create an instance of ModForumAddDiscussionRequest from a dict
mod_forum_add_discussion_request_from_dict = ModForumAddDiscussionRequest.from_dict(mod_forum_add_discussion_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



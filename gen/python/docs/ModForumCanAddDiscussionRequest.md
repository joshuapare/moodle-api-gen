# ModForumCanAddDiscussionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forumid** | **int** | Forum instance ID | 
**groupid** | **int** | The group to check, default to active group.                                                 Use -1 to check if the user can post in all the groups. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_forum_can_add_discussion_request import ModForumCanAddDiscussionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumCanAddDiscussionRequest from a JSON string
mod_forum_can_add_discussion_request_instance = ModForumCanAddDiscussionRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumCanAddDiscussionRequest.to_json())

# convert the object into a dict
mod_forum_can_add_discussion_request_dict = mod_forum_can_add_discussion_request_instance.to_dict()
# create an instance of ModForumCanAddDiscussionRequest from a dict
mod_forum_can_add_discussion_request_from_dict = ModForumCanAddDiscussionRequest.from_dict(mod_forum_can_add_discussion_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModForumGetForumDiscussionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forumid** | **int** | forum instance id | [default to null]
**groupid** | **int** | group id | [optional] [default to 0]
**page** | **int** | current page | [optional] [default to -1]
**perpage** | **int** | items per page | [optional] [default to 0]
**sortorder** | **int** | sort by this element: numreplies, , created or timemodified | [optional] [default to -1]

## Example

```python
from openapi_client.models.mod_forum_get_forum_discussions_request import ModForumGetForumDiscussionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumDiscussionsRequest from a JSON string
mod_forum_get_forum_discussions_request_instance = ModForumGetForumDiscussionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumDiscussionsRequest.to_json())

# convert the object into a dict
mod_forum_get_forum_discussions_request_dict = mod_forum_get_forum_discussions_request_instance.to_dict()
# create an instance of ModForumGetForumDiscussionsRequest from a dict
mod_forum_get_forum_discussions_request_from_dict = ModForumGetForumDiscussionsRequest.from_dict(mod_forum_get_forum_discussions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



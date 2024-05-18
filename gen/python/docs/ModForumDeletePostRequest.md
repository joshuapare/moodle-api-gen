# ModForumDeletePostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postid** | **int** | Post to be deleted. It can be a discussion topic post. | [default to null]

## Example

```python
from openapi_client.models.mod_forum_delete_post_request import ModForumDeletePostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumDeletePostRequest from a JSON string
mod_forum_delete_post_request_instance = ModForumDeletePostRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumDeletePostRequest.to_json())

# convert the object into a dict
mod_forum_delete_post_request_dict = mod_forum_delete_post_request_instance.to_dict()
# create an instance of ModForumDeletePostRequest from a dict
mod_forum_delete_post_request_from_dict = ModForumDeletePostRequest.from_dict(mod_forum_delete_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



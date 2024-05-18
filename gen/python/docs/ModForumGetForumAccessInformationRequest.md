# ModForumGetForumAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forumid** | **int** | Forum instance id. | [default to null]

## Example

```python
from openapi_client.models.mod_forum_get_forum_access_information_request import ModForumGetForumAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumAccessInformationRequest from a JSON string
mod_forum_get_forum_access_information_request_instance = ModForumGetForumAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumAccessInformationRequest.to_json())

# convert the object into a dict
mod_forum_get_forum_access_information_request_dict = mod_forum_get_forum_access_information_request_instance.to_dict()
# create an instance of ModForumGetForumAccessInformationRequest from a dict
mod_forum_get_forum_access_information_request_from_dict = ModForumGetForumAccessInformationRequest.from_dict(mod_forum_get_forum_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModForumSetLockState200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The discussion we are locking. | [default to null]
**locked** | **bool** | The locked state of the discussion. | [default to False]
**times** | [**ModForumSetLockState200ResponseTimes**](ModForumSetLockState200ResponseTimes.md) |  | 

## Example

```python
from openapi_client.models.mod_forum_set_lock_state200_response import ModForumSetLockState200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetLockState200Response from a JSON string
mod_forum_set_lock_state200_response_instance = ModForumSetLockState200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumSetLockState200Response.to_json())

# convert the object into a dict
mod_forum_set_lock_state200_response_dict = mod_forum_set_lock_state200_response_instance.to_dict()
# create an instance of ModForumSetLockState200Response from a dict
mod_forum_set_lock_state200_response_from_dict = ModForumSetLockState200Response.from_dict(mod_forum_set_lock_state200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



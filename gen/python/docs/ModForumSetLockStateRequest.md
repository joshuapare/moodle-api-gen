# ModForumSetLockStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussionid** | **int** | The discussion to lock / unlock | [default to null]
**forumid** | **int** | Forum that the discussion is in | [default to null]
**targetstate** | **int** | The timestamp for the lock state | [default to null]

## Example

```python
from openapi_client.models.mod_forum_set_lock_state_request import ModForumSetLockStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetLockStateRequest from a JSON string
mod_forum_set_lock_state_request_instance = ModForumSetLockStateRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumSetLockStateRequest.to_json())

# convert the object into a dict
mod_forum_set_lock_state_request_dict = mod_forum_set_lock_state_request_instance.to_dict()
# create an instance of ModForumSetLockStateRequest from a dict
mod_forum_set_lock_state_request_from_dict = ModForumSetLockStateRequest.from_dict(mod_forum_set_lock_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



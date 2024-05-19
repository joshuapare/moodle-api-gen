# ModForumSetPinStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussionid** | **int** | The discussion to pin or unpin | [default to null]
**targetstate** | **int** | The target state | [default to null]

## Example

```python
from openapi_client.models.mod_forum_set_pin_state_request import ModForumSetPinStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetPinStateRequest from a JSON string
mod_forum_set_pin_state_request_instance = ModForumSetPinStateRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumSetPinStateRequest.to_json())

# convert the object into a dict
mod_forum_set_pin_state_request_dict = mod_forum_set_pin_state_request_instance.to_dict()
# create an instance of ModForumSetPinStateRequest from a dict
mod_forum_set_pin_state_request_from_dict = ModForumSetPinStateRequest.from_dict(mod_forum_set_pin_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



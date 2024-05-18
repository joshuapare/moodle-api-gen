# ModForumSetPinState200ResponseCapabilities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**favourite** | **bool** | favourite | [default to False]
**manage** | **bool** | manage | [default to False]
**move** | **bool** | move | [default to False]
**pin** | **bool** | pin | [default to False]
**post** | **bool** | post | [default to False]
**subscribe** | **bool** | subscribe | [default to False]

## Example

```python
from openapi_client.models.mod_forum_set_pin_state200_response_capabilities import ModForumSetPinState200ResponseCapabilities

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetPinState200ResponseCapabilities from a JSON string
mod_forum_set_pin_state200_response_capabilities_instance = ModForumSetPinState200ResponseCapabilities.from_json(json)
# print the JSON string representation of the object
print(ModForumSetPinState200ResponseCapabilities.to_json())

# convert the object into a dict
mod_forum_set_pin_state200_response_capabilities_dict = mod_forum_set_pin_state200_response_capabilities_instance.to_dict()
# create an instance of ModForumSetPinState200ResponseCapabilities from a dict
mod_forum_set_pin_state200_response_capabilities_from_dict = ModForumSetPinState200ResponseCapabilities.from_dict(mod_forum_set_pin_state200_response_capabilities_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



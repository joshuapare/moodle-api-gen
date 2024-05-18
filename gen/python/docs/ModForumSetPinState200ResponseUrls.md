# ModForumSetPinState200ResponseUrls


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**markasread** | **str** | markasread | [default to 'null']
**pin** | **str** | pin | [optional] [default to 'null']
**subscribe** | **str** | subscribe | [default to 'null']
**view** | **str** | view | 
**viewfirstunread** | **str** | viewfirstunread | [optional] [default to 'null']
**viewlatest** | **str** | viewlatest | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_forum_set_pin_state200_response_urls import ModForumSetPinState200ResponseUrls

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetPinState200ResponseUrls from a JSON string
mod_forum_set_pin_state200_response_urls_instance = ModForumSetPinState200ResponseUrls.from_json(json)
# print the JSON string representation of the object
print(ModForumSetPinState200ResponseUrls.to_json())

# convert the object into a dict
mod_forum_set_pin_state200_response_urls_dict = mod_forum_set_pin_state200_response_urls_instance.to_dict()
# create an instance of ModForumSetPinState200ResponseUrls from a dict
mod_forum_set_pin_state200_response_urls_from_dict = ModForumSetPinState200ResponseUrls.from_dict(mod_forum_set_pin_state200_response_urls_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



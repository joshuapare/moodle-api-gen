# ModForumSetPinState200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | [**ModForumSetPinState200ResponseCapabilities**](ModForumSetPinState200ResponseCapabilities.md) |  | 
**firstpostid** | **int** | firstpostid | [default to null]
**forumid** | **int** | forumid | [default to null]
**group** | [**ModForumSetPinState200ResponseGroup**](ModForumSetPinState200ResponseGroup.md) |  | [optional] 
**id** | **int** | id | 
**istimelocked** | **bool** | istimelocked | [default to False]
**locked** | **bool** | locked | [default to False]
**name** | **str** | name | 
**pinned** | **bool** | pinned | [default to False]
**timed** | [**ModForumSetPinState200ResponseTimed**](ModForumSetPinState200ResponseTimed.md) |  | 
**times** | [**ModForumSetPinState200ResponseTimes**](ModForumSetPinState200ResponseTimes.md) |  | 
**urls** | [**ModForumSetPinState200ResponseUrls**](ModForumSetPinState200ResponseUrls.md) |  | 
**userstate** | [**ModForumSetPinState200ResponseUserstate**](ModForumSetPinState200ResponseUserstate.md) |  | 

## Example

```python
from openapi_client.models.mod_forum_set_pin_state200_response import ModForumSetPinState200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetPinState200Response from a JSON string
mod_forum_set_pin_state200_response_instance = ModForumSetPinState200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumSetPinState200Response.to_json())

# convert the object into a dict
mod_forum_set_pin_state200_response_dict = mod_forum_set_pin_state200_response_instance.to_dict()
# create an instance of ModForumSetPinState200Response from a dict
mod_forum_set_pin_state200_response_from_dict = ModForumSetPinState200Response.from_dict(mod_forum_set_pin_state200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



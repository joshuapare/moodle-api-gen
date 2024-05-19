# ModForumToggleFavouriteStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussionid** | **int** | The discussion to subscribe or unsubscribe | 
**targetstate** | **bool** | The target state | 

## Example

```python
from openapi_client.models.mod_forum_toggle_favourite_state_request import ModForumToggleFavouriteStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumToggleFavouriteStateRequest from a JSON string
mod_forum_toggle_favourite_state_request_instance = ModForumToggleFavouriteStateRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumToggleFavouriteStateRequest.to_json())

# convert the object into a dict
mod_forum_toggle_favourite_state_request_dict = mod_forum_toggle_favourite_state_request_instance.to_dict()
# create an instance of ModForumToggleFavouriteStateRequest from a dict
mod_forum_toggle_favourite_state_request_from_dict = ModForumToggleFavouriteStateRequest.from_dict(mod_forum_toggle_favourite_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



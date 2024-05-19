# ModForumSetSubscriptionStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussionid** | **int** | The discussion to subscribe or unsubscribe | [default to null]
**forumid** | **int** | Forum that the discussion is in | 
**targetstate** | **bool** | The target state | [default to False]

## Example

```python
from openapi_client.models.mod_forum_set_subscription_state_request import ModForumSetSubscriptionStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetSubscriptionStateRequest from a JSON string
mod_forum_set_subscription_state_request_instance = ModForumSetSubscriptionStateRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumSetSubscriptionStateRequest.to_json())

# convert the object into a dict
mod_forum_set_subscription_state_request_dict = mod_forum_set_subscription_state_request_instance.to_dict()
# create an instance of ModForumSetSubscriptionStateRequest from a dict
mod_forum_set_subscription_state_request_from_dict = ModForumSetSubscriptionStateRequest.from_dict(mod_forum_set_subscription_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



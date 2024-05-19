# ModForumSetSubscriptionState200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | [**ModForumSetSubscriptionState200ResponseCapabilities**](ModForumSetSubscriptionState200ResponseCapabilities.md) |  | 
**firstpostid** | **int** | firstpostid | 
**forumid** | **int** | forumid | 
**group** | [**ModForumSetSubscriptionState200ResponseGroup**](ModForumSetSubscriptionState200ResponseGroup.md) |  | [optional] 
**id** | **int** | id | 
**istimelocked** | **bool** | istimelocked | 
**locked** | **bool** | locked | 
**name** | **str** | name | 
**pinned** | **bool** | pinned | 
**timed** | [**ModForumSetSubscriptionState200ResponseTimed**](ModForumSetSubscriptionState200ResponseTimed.md) |  | 
**times** | [**ModForumSetSubscriptionState200ResponseTimes**](ModForumSetSubscriptionState200ResponseTimes.md) |  | 
**urls** | [**ModForumSetSubscriptionState200ResponseUrls**](ModForumSetSubscriptionState200ResponseUrls.md) |  | 
**userstate** | [**ModForumSetSubscriptionState200ResponseUserstate**](ModForumSetSubscriptionState200ResponseUserstate.md) |  | 

## Example

```python
from openapi_client.models.mod_forum_set_subscription_state200_response import ModForumSetSubscriptionState200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetSubscriptionState200Response from a JSON string
mod_forum_set_subscription_state200_response_instance = ModForumSetSubscriptionState200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumSetSubscriptionState200Response.to_json())

# convert the object into a dict
mod_forum_set_subscription_state200_response_dict = mod_forum_set_subscription_state200_response_instance.to_dict()
# create an instance of ModForumSetSubscriptionState200Response from a dict
mod_forum_set_subscription_state200_response_from_dict = ModForumSetSubscriptionState200Response.from_dict(mod_forum_set_subscription_state200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



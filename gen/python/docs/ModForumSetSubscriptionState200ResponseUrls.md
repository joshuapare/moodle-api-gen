# ModForumSetSubscriptionState200ResponseUrls


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**markasread** | **str** | markasread | 
**pin** | **str** | pin | [optional] 
**subscribe** | **str** | subscribe | 
**view** | **str** | view | 
**viewfirstunread** | **str** | viewfirstunread | [optional] 
**viewlatest** | **str** | viewlatest | [optional] 

## Example

```python
from openapi_client.models.mod_forum_set_subscription_state200_response_urls import ModForumSetSubscriptionState200ResponseUrls

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumSetSubscriptionState200ResponseUrls from a JSON string
mod_forum_set_subscription_state200_response_urls_instance = ModForumSetSubscriptionState200ResponseUrls.from_json(json)
# print the JSON string representation of the object
print(ModForumSetSubscriptionState200ResponseUrls.to_json())

# convert the object into a dict
mod_forum_set_subscription_state200_response_urls_dict = mod_forum_set_subscription_state200_response_urls_instance.to_dict()
# create an instance of ModForumSetSubscriptionState200ResponseUrls from a dict
mod_forum_set_subscription_state200_response_urls_from_dict = ModForumSetSubscriptionState200ResponseUrls.from_dict(mod_forum_set_subscription_state200_response_urls_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



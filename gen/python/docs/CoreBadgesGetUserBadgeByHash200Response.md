# CoreBadgesGetUserBadgeByHash200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**badge** | [**List[CoreBadgesGetUserBadgeByHash200ResponseBadgeInner]**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_badges_get_user_badge_by_hash200_response import CoreBadgesGetUserBadgeByHash200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadgeByHash200Response from a JSON string
core_badges_get_user_badge_by_hash200_response_instance = CoreBadgesGetUserBadgeByHash200Response.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadgeByHash200Response.to_json())

# convert the object into a dict
core_badges_get_user_badge_by_hash200_response_dict = core_badges_get_user_badge_by_hash200_response_instance.to_dict()
# create an instance of CoreBadgesGetUserBadgeByHash200Response from a dict
core_badges_get_user_badge_by_hash200_response_from_dict = CoreBadgesGetUserBadgeByHash200Response.from_dict(core_badges_get_user_badge_by_hash200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



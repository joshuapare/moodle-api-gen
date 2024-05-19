# CoreBadgesGetUserBadgeByHashRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hash** | **str** | Badge issued hash | [default to 'null']

## Example

```python
from openapi_client.models.core_badges_get_user_badge_by_hash_request import CoreBadgesGetUserBadgeByHashRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadgeByHashRequest from a JSON string
core_badges_get_user_badge_by_hash_request_instance = CoreBadgesGetUserBadgeByHashRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadgeByHashRequest.to_json())

# convert the object into a dict
core_badges_get_user_badge_by_hash_request_dict = core_badges_get_user_badge_by_hash_request_instance.to_dict()
# create an instance of CoreBadgesGetUserBadgeByHashRequest from a dict
core_badges_get_user_badge_by_hash_request_from_dict = CoreBadgesGetUserBadgeByHashRequest.from_dict(core_badges_get_user_badge_by_hash_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



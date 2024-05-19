# CoreBadgesGetUserBadges200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**badges** | [**List[CoreBadgesGetUserBadges200ResponseBadgesInner]**](CoreBadgesGetUserBadges200ResponseBadgesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_badges_get_user_badges200_response import CoreBadgesGetUserBadges200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBadgesGetUserBadges200Response from a JSON string
core_badges_get_user_badges200_response_instance = CoreBadgesGetUserBadges200Response.from_json(json)
# print the JSON string representation of the object
print(CoreBadgesGetUserBadges200Response.to_json())

# convert the object into a dict
core_badges_get_user_badges200_response_dict = core_badges_get_user_badges200_response_instance.to_dict()
# create an instance of CoreBadgesGetUserBadges200Response from a dict
core_badges_get_user_badges200_response_from_dict = CoreBadgesGetUserBadges200Response.from_dict(core_badges_get_user_badges200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreGroupGetActivityAllowedGroups200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canaccessallgroups** | **bool** | Whether the user will be able to access all the activity groups. | [optional] [default to False]
**groups** | [**List[CoreGroupGetActivityAllowedGroups200ResponseGroupsInner]**](CoreGroupGetActivityAllowedGroups200ResponseGroupsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_group_get_activity_allowed_groups200_response import CoreGroupGetActivityAllowedGroups200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetActivityAllowedGroups200Response from a JSON string
core_group_get_activity_allowed_groups200_response_instance = CoreGroupGetActivityAllowedGroups200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetActivityAllowedGroups200Response.to_json())

# convert the object into a dict
core_group_get_activity_allowed_groups200_response_dict = core_group_get_activity_allowed_groups200_response_instance.to_dict()
# create an instance of CoreGroupGetActivityAllowedGroups200Response from a dict
core_group_get_activity_allowed_groups200_response_from_dict = CoreGroupGetActivityAllowedGroups200Response.from_dict(core_group_get_activity_allowed_groups200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



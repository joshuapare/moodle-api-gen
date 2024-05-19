# CoreGroupGetActivityAllowedGroupsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | course module id | 
**userid** | **int** | id of user, empty for current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_group_get_activity_allowed_groups_request import CoreGroupGetActivityAllowedGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupGetActivityAllowedGroupsRequest from a JSON string
core_group_get_activity_allowed_groups_request_instance = CoreGroupGetActivityAllowedGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupGetActivityAllowedGroupsRequest.to_json())

# convert the object into a dict
core_group_get_activity_allowed_groups_request_dict = core_group_get_activity_allowed_groups_request_instance.to_dict()
# create an instance of CoreGroupGetActivityAllowedGroupsRequest from a dict
core_group_get_activity_allowed_groups_request_from_dict = CoreGroupGetActivityAllowedGroupsRequest.from_dict(core_group_get_activity_allowed_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



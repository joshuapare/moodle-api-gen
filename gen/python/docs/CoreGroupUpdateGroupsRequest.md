# CoreGroupUpdateGroupsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[CoreGroupUpdateGroupsRequestGroupsInner]**](CoreGroupUpdateGroupsRequestGroupsInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_update_groups_request import CoreGroupUpdateGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupUpdateGroupsRequest from a JSON string
core_group_update_groups_request_instance = CoreGroupUpdateGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupUpdateGroupsRequest.to_json())

# convert the object into a dict
core_group_update_groups_request_dict = core_group_update_groups_request_instance.to_dict()
# create an instance of CoreGroupUpdateGroupsRequest from a dict
core_group_update_groups_request_from_dict = CoreGroupUpdateGroupsRequest.from_dict(core_group_update_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



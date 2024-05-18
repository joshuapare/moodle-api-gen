# CoreGroupAssignGroupingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignments** | [**List[CoreGroupAssignGroupingRequestAssignmentsInner]**](CoreGroupAssignGroupingRequestAssignmentsInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_assign_grouping_request import CoreGroupAssignGroupingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupAssignGroupingRequest from a JSON string
core_group_assign_grouping_request_instance = CoreGroupAssignGroupingRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupAssignGroupingRequest.to_json())

# convert the object into a dict
core_group_assign_grouping_request_dict = core_group_assign_grouping_request_instance.to_dict()
# create an instance of CoreGroupAssignGroupingRequest from a dict
core_group_assign_grouping_request_from_dict = CoreGroupAssignGroupingRequest.from_dict(core_group_assign_grouping_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



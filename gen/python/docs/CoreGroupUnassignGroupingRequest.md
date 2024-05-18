# CoreGroupUnassignGroupingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unassignments** | [**List[CoreGroupUnassignGroupingRequestUnassignmentsInner]**](CoreGroupUnassignGroupingRequestUnassignmentsInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_unassign_grouping_request import CoreGroupUnassignGroupingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupUnassignGroupingRequest from a JSON string
core_group_unassign_grouping_request_instance = CoreGroupUnassignGroupingRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupUnassignGroupingRequest.to_json())

# convert the object into a dict
core_group_unassign_grouping_request_dict = core_group_unassign_grouping_request_instance.to_dict()
# create an instance of CoreGroupUnassignGroupingRequest from a dict
core_group_unassign_grouping_request_from_dict = CoreGroupUnassignGroupingRequest.from_dict(core_group_unassign_grouping_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreGroupCreateGroupsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[CoreGroupCreateGroupsRequestGroupsInner]**](CoreGroupCreateGroupsRequestGroupsInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_create_groups_request import CoreGroupCreateGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupCreateGroupsRequest from a JSON string
core_group_create_groups_request_instance = CoreGroupCreateGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupCreateGroupsRequest.to_json())

# convert the object into a dict
core_group_create_groups_request_dict = core_group_create_groups_request_instance.to_dict()
# create an instance of CoreGroupCreateGroupsRequest from a dict
core_group_create_groups_request_from_dict = CoreGroupCreateGroupsRequest.from_dict(core_group_create_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



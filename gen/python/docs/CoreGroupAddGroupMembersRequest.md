# CoreGroupAddGroupMembersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List[CoreGroupAddGroupMembersRequestMembersInner]**](CoreGroupAddGroupMembersRequestMembersInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_add_group_members_request import CoreGroupAddGroupMembersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupAddGroupMembersRequest from a JSON string
core_group_add_group_members_request_instance = CoreGroupAddGroupMembersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupAddGroupMembersRequest.to_json())

# convert the object into a dict
core_group_add_group_members_request_dict = core_group_add_group_members_request_instance.to_dict()
# create an instance of CoreGroupAddGroupMembersRequest from a dict
core_group_add_group_members_request_from_dict = CoreGroupAddGroupMembersRequest.from_dict(core_group_add_group_members_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



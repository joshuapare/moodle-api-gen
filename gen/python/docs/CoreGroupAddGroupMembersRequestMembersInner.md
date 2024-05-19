# CoreGroupAddGroupMembersRequestMembersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | group record id | [optional] [default to null]
**userid** | **int** | user id | [optional] 

## Example

```python
from openapi_client.models.core_group_add_group_members_request_members_inner import CoreGroupAddGroupMembersRequestMembersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupAddGroupMembersRequestMembersInner from a JSON string
core_group_add_group_members_request_members_inner_instance = CoreGroupAddGroupMembersRequestMembersInner.from_json(json)
# print the JSON string representation of the object
print(CoreGroupAddGroupMembersRequestMembersInner.to_json())

# convert the object into a dict
core_group_add_group_members_request_members_inner_dict = core_group_add_group_members_request_members_inner_instance.to_dict()
# create an instance of CoreGroupAddGroupMembersRequestMembersInner from a dict
core_group_add_group_members_request_members_inner_from_dict = CoreGroupAddGroupMembersRequestMembersInner.from_dict(core_group_add_group_members_request_members_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



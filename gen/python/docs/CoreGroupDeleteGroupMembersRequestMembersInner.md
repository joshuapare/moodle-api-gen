# CoreGroupDeleteGroupMembersRequestMembersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | group record id | [optional] 
**userid** | **int** | user id | [optional] 

## Example

```python
from openapi_client.models.core_group_delete_group_members_request_members_inner import CoreGroupDeleteGroupMembersRequestMembersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupDeleteGroupMembersRequestMembersInner from a JSON string
core_group_delete_group_members_request_members_inner_instance = CoreGroupDeleteGroupMembersRequestMembersInner.from_json(json)
# print the JSON string representation of the object
print(CoreGroupDeleteGroupMembersRequestMembersInner.to_json())

# convert the object into a dict
core_group_delete_group_members_request_members_inner_dict = core_group_delete_group_members_request_members_inner_instance.to_dict()
# create an instance of CoreGroupDeleteGroupMembersRequestMembersInner from a dict
core_group_delete_group_members_request_members_inner_from_dict = CoreGroupDeleteGroupMembersRequestMembersInner.from_dict(core_group_delete_group_members_request_members_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



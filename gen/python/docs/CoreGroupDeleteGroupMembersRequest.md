# CoreGroupDeleteGroupMembersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List[CoreGroupDeleteGroupMembersRequestMembersInner]**](CoreGroupDeleteGroupMembersRequestMembersInner.md) |  | 

## Example

```python
from openapi_client.models.core_group_delete_group_members_request import CoreGroupDeleteGroupMembersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGroupDeleteGroupMembersRequest from a JSON string
core_group_delete_group_members_request_instance = CoreGroupDeleteGroupMembersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGroupDeleteGroupMembersRequest.to_json())

# convert the object into a dict
core_group_delete_group_members_request_dict = core_group_delete_group_members_request_instance.to_dict()
# create an instance of CoreGroupDeleteGroupMembersRequest from a dict
core_group_delete_group_members_request_from_dict = CoreGroupDeleteGroupMembersRequest.from_dict(core_group_delete_group_members_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



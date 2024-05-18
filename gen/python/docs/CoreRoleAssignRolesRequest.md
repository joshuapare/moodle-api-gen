# CoreRoleAssignRolesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignments** | [**List[CoreRoleAssignRolesRequestAssignmentsInner]**](CoreRoleAssignRolesRequestAssignmentsInner.md) |  | 

## Example

```python
from openapi_client.models.core_role_assign_roles_request import CoreRoleAssignRolesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRoleAssignRolesRequest from a JSON string
core_role_assign_roles_request_instance = CoreRoleAssignRolesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreRoleAssignRolesRequest.to_json())

# convert the object into a dict
core_role_assign_roles_request_dict = core_role_assign_roles_request_instance.to_dict()
# create an instance of CoreRoleAssignRolesRequest from a dict
core_role_assign_roles_request_from_dict = CoreRoleAssignRolesRequest.from_dict(core_role_assign_roles_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



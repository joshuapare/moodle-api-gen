# CoreRoleUnassignRolesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unassignments** | [**List[CoreRoleUnassignRolesRequestUnassignmentsInner]**](CoreRoleUnassignRolesRequestUnassignmentsInner.md) |  | 

## Example

```python
from openapi_client.models.core_role_unassign_roles_request import CoreRoleUnassignRolesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRoleUnassignRolesRequest from a JSON string
core_role_unassign_roles_request_instance = CoreRoleUnassignRolesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreRoleUnassignRolesRequest.to_json())

# convert the object into a dict
core_role_unassign_roles_request_dict = core_role_unassign_roles_request_instance.to_dict()
# create an instance of CoreRoleUnassignRolesRequest from a dict
core_role_unassign_roles_request_from_dict = CoreRoleUnassignRolesRequest.from_dict(core_role_unassign_roles_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



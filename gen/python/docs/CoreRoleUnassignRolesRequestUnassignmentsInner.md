# CoreRoleUnassignRolesRequestUnassignmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context to unassign the user role from | [optional] [default to null]
**contextlevel** | **str** | The context level to unassign the user role in +                                    (block, course, coursecat, system, user, module) | [optional] [default to 'null']
**instanceid** | **int** | The Instance id of item where the role needs to be unassigned | [optional] [default to null]
**roleid** | **int** | Role to assign to the user | [optional] 
**userid** | **int** | The user that is going to be assigned | [optional] 

## Example

```python
from openapi_client.models.core_role_unassign_roles_request_unassignments_inner import CoreRoleUnassignRolesRequestUnassignmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRoleUnassignRolesRequestUnassignmentsInner from a JSON string
core_role_unassign_roles_request_unassignments_inner_instance = CoreRoleUnassignRolesRequestUnassignmentsInner.from_json(json)
# print the JSON string representation of the object
print(CoreRoleUnassignRolesRequestUnassignmentsInner.to_json())

# convert the object into a dict
core_role_unassign_roles_request_unassignments_inner_dict = core_role_unassign_roles_request_unassignments_inner_instance.to_dict()
# create an instance of CoreRoleUnassignRolesRequestUnassignmentsInner from a dict
core_role_unassign_roles_request_unassignments_inner_from_dict = CoreRoleUnassignRolesRequestUnassignmentsInner.from_dict(core_role_unassign_roles_request_unassignments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



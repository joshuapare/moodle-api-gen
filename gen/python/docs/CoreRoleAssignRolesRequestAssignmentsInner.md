# CoreRoleAssignRolesRequestAssignmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context to assign the user role in | [optional] [default to null]
**contextlevel** | **str** | The context level to assign the user role in                                     (block, course, coursecat, system, user, module) | [optional] [default to 'null']
**instanceid** | **int** | The Instance id of item where the role needs to be assigned | [optional] [default to null]
**roleid** | **int** | Role to assign to the user | [optional] 
**userid** | **int** | The user that is going to be assigned | [optional] [default to null]

## Example

```python
from openapi_client.models.core_role_assign_roles_request_assignments_inner import CoreRoleAssignRolesRequestAssignmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreRoleAssignRolesRequestAssignmentsInner from a JSON string
core_role_assign_roles_request_assignments_inner_instance = CoreRoleAssignRolesRequestAssignmentsInner.from_json(json)
# print the JSON string representation of the object
print(CoreRoleAssignRolesRequestAssignmentsInner.to_json())

# convert the object into a dict
core_role_assign_roles_request_assignments_inner_dict = core_role_assign_roles_request_assignments_inner_instance.to_dict()
# create an instance of CoreRoleAssignRolesRequestAssignmentsInner from a dict
core_role_assign_roles_request_assignments_inner_from_dict = CoreRoleAssignRolesRequestAssignmentsInner.from_dict(core_role_assign_roles_request_assignments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



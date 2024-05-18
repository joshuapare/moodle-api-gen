# ModAssignGetAssignmentsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | **List[object]** |  | [optional] 
**courseids** | **List[object]** |  | [optional] 
**includenotenrolledcourses** | **bool** | whether to return courses that the user can see                                                                     even if is not enroled in. This requires the parameter courseids                                                                     to not be empty. | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_assign_get_assignments_request import ModAssignGetAssignmentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetAssignmentsRequest from a JSON string
mod_assign_get_assignments_request_instance = ModAssignGetAssignmentsRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetAssignmentsRequest.to_json())

# convert the object into a dict
mod_assign_get_assignments_request_dict = mod_assign_get_assignments_request_instance.to_dict()
# create an instance of ModAssignGetAssignmentsRequest from a dict
mod_assign_get_assignments_request_from_dict = ModAssignGetAssignmentsRequest.from_dict(mod_assign_get_assignments_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



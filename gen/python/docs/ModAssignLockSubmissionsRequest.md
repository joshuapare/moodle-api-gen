# ModAssignLockSubmissionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | The assignment id to operate on | 
**userids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.mod_assign_lock_submissions_request import ModAssignLockSubmissionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignLockSubmissionsRequest from a JSON string
mod_assign_lock_submissions_request_instance = ModAssignLockSubmissionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignLockSubmissionsRequest.to_json())

# convert the object into a dict
mod_assign_lock_submissions_request_dict = mod_assign_lock_submissions_request_instance.to_dict()
# create an instance of ModAssignLockSubmissionsRequest from a dict
mod_assign_lock_submissions_request_from_dict = ModAssignLockSubmissionsRequest.from_dict(mod_assign_lock_submissions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



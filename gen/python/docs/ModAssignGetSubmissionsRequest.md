# ModAssignGetSubmissionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentids** | **List[object]** |  | 
**before** | **int** | submitted before | [optional] [default to 0]
**since** | **int** | submitted since | [optional] [default to 0]
**status** | **str** | status | [optional] [default to '']

## Example

```python
from openapi_client.models.mod_assign_get_submissions_request import ModAssignGetSubmissionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionsRequest from a JSON string
mod_assign_get_submissions_request_instance = ModAssignGetSubmissionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionsRequest.to_json())

# convert the object into a dict
mod_assign_get_submissions_request_dict = mod_assign_get_submissions_request_instance.to_dict()
# create an instance of ModAssignGetSubmissionsRequest from a dict
mod_assign_get_submissions_request_from_dict = ModAssignGetSubmissionsRequest.from_dict(mod_assign_get_submissions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



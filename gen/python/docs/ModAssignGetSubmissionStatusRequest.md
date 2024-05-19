# ModAssignGetSubmissionStatusRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignid** | **int** | assignment instance id | [default to null]
**groupid** | **int** | filter by users in group (used for generating the grading summary).                     0 for all groups information, any other empty value will calculate currrent group. | [optional] [default to 0]
**userid** | **int** | user id (empty for current user) | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_assign_get_submission_status_request import ModAssignGetSubmissionStatusRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatusRequest from a JSON string
mod_assign_get_submission_status_request_instance = ModAssignGetSubmissionStatusRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatusRequest.to_json())

# convert the object into a dict
mod_assign_get_submission_status_request_dict = mod_assign_get_submission_status_request_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatusRequest from a dict
mod_assign_get_submission_status_request_from_dict = ModAssignGetSubmissionStatusRequest.from_dict(mod_assign_get_submission_status_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



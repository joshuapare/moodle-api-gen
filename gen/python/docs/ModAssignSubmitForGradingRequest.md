# ModAssignSubmitForGradingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptsubmissionstatement** | **bool** | Accept the assignment submission statement | [default to False]
**assignmentid** | **int** | The assignment id to operate on | 

## Example

```python
from openapi_client.models.mod_assign_submit_for_grading_request import ModAssignSubmitForGradingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSubmitForGradingRequest from a JSON string
mod_assign_submit_for_grading_request_instance = ModAssignSubmitForGradingRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignSubmitForGradingRequest.to_json())

# convert the object into a dict
mod_assign_submit_for_grading_request_dict = mod_assign_submit_for_grading_request_instance.to_dict()
# create an instance of ModAssignSubmitForGradingRequest from a dict
mod_assign_submit_for_grading_request_from_dict = ModAssignSubmitForGradingRequest.from_dict(mod_assign_submit_for_grading_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



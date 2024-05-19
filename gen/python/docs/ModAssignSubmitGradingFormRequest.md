# ModAssignSubmitGradingFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignmentid** | **int** | The assignment id to operate on | 
**jsonformdata** | **str** | The data from the grading form, encoded as a json array | [default to 'null']
**userid** | **int** | The user id the submission belongs to | [default to null]

## Example

```python
from openapi_client.models.mod_assign_submit_grading_form_request import ModAssignSubmitGradingFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSubmitGradingFormRequest from a JSON string
mod_assign_submit_grading_form_request_instance = ModAssignSubmitGradingFormRequest.from_json(json)
# print the JSON string representation of the object
print(ModAssignSubmitGradingFormRequest.to_json())

# convert the object into a dict
mod_assign_submit_grading_form_request_dict = mod_assign_submit_grading_form_request_instance.to_dict()
# create an instance of ModAssignSubmitGradingFormRequest from a dict
mod_assign_submit_grading_form_request_from_dict = ModAssignSubmitGradingFormRequest.from_dict(mod_assign_submit_grading_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



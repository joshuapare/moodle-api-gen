# CoreCreateUserfeedbackActionRecordRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The action taken by user | [default to 'null']
**contextid** | **int** | The context id of the page the user is in | [default to null]

## Example

```python
from openapi_client.models.core_create_userfeedback_action_record_request import CoreCreateUserfeedbackActionRecordRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCreateUserfeedbackActionRecordRequest from a JSON string
core_create_userfeedback_action_record_request_instance = CoreCreateUserfeedbackActionRecordRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCreateUserfeedbackActionRecordRequest.to_json())

# convert the object into a dict
core_create_userfeedback_action_record_request_dict = core_create_userfeedback_action_record_request_instance.to_dict()
# create an instance of CoreCreateUserfeedbackActionRecordRequest from a dict
core_create_userfeedback_action_record_request_from_dict = CoreCreateUserfeedbackActionRecordRequest.from_dict(core_create_userfeedback_action_record_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



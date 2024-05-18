# CoreQuestionUpdateFlagRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checksum** | **str** | computed checksum with the last three arguments and                              the users username | [default to 'null']
**newstate** | **bool** | the new state of the flag. true &#x3D; flagged | [default to False]
**qaid** | **int** | the question_attempt id | [default to null]
**qubaid** | **int** | the question usage id. | [default to null]
**questionid** | **int** | the question id | [default to null]
**slot** | **int** | the slot number within the usage | [default to null]

## Example

```python
from openapi_client.models.core_question_update_flag_request import CoreQuestionUpdateFlagRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreQuestionUpdateFlagRequest from a JSON string
core_question_update_flag_request_instance = CoreQuestionUpdateFlagRequest.from_json(json)
# print the JSON string representation of the object
print(CoreQuestionUpdateFlagRequest.to_json())

# convert the object into a dict
core_question_update_flag_request_dict = core_question_update_flag_request_instance.to_dict()
# create an instance of CoreQuestionUpdateFlagRequest from a dict
core_question_update_flag_request_from_dict = CoreQuestionUpdateFlagRequest.from_dict(core_question_update_flag_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



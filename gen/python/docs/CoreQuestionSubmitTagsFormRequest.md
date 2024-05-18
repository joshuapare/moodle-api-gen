# CoreQuestionSubmitTagsFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The editing context id | [default to null]
**formdata** | **str** | The data from the tag form | [default to 'null']
**questionid** | **int** | The question id | [default to null]

## Example

```python
from openapi_client.models.core_question_submit_tags_form_request import CoreQuestionSubmitTagsFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreQuestionSubmitTagsFormRequest from a JSON string
core_question_submit_tags_form_request_instance = CoreQuestionSubmitTagsFormRequest.from_json(json)
# print the JSON string representation of the object
print(CoreQuestionSubmitTagsFormRequest.to_json())

# convert the object into a dict
core_question_submit_tags_form_request_dict = core_question_submit_tags_form_request_instance.to_dict()
# create an instance of CoreQuestionSubmitTagsFormRequest from a dict
core_question_submit_tags_form_request_from_dict = CoreQuestionSubmitTagsFormRequest.from_dict(core_question_submit_tags_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



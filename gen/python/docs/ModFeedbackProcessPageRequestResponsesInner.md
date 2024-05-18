# ModFeedbackProcessPageRequestResponsesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The response name (usually type[index]_id). | [optional] [default to 'null']
**value** | **str** | The response value. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_feedback_process_page_request_responses_inner import ModFeedbackProcessPageRequestResponsesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackProcessPageRequestResponsesInner from a JSON string
mod_feedback_process_page_request_responses_inner_instance = ModFeedbackProcessPageRequestResponsesInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackProcessPageRequestResponsesInner.to_json())

# convert the object into a dict
mod_feedback_process_page_request_responses_inner_dict = mod_feedback_process_page_request_responses_inner_instance.to_dict()
# create an instance of ModFeedbackProcessPageRequestResponsesInner from a dict
mod_feedback_process_page_request_responses_inner_from_dict = ModFeedbackProcessPageRequestResponsesInner.from_dict(mod_feedback_process_page_request_responses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



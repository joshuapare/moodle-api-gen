# CoreQuestionGetRandomQuestionSummariesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | Category id to find random questions | [default to null]
**contextid** | **int** | Context id that the questions will be rendered in (used for exporting) | [default to null]
**includesubcategories** | **bool** | Include the subcategories in the search | [default to False]
**limit** | **int** | Maximum number of results to return | [optional] [default to 0]
**offset** | **int** | Number of items to skip from the begging of the result set | [optional] [default to 0]
**tagids** | **List[object]** |  | 

## Example

```python
from openapi_client.models.core_question_get_random_question_summaries_request import CoreQuestionGetRandomQuestionSummariesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreQuestionGetRandomQuestionSummariesRequest from a JSON string
core_question_get_random_question_summaries_request_instance = CoreQuestionGetRandomQuestionSummariesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreQuestionGetRandomQuestionSummariesRequest.to_json())

# convert the object into a dict
core_question_get_random_question_summaries_request_dict = core_question_get_random_question_summaries_request_instance.to_dict()
# create an instance of CoreQuestionGetRandomQuestionSummariesRequest from a dict
core_question_get_random_question_summaries_request_from_dict = CoreQuestionGetRandomQuestionSummariesRequest.from_dict(core_question_get_random_question_summaries_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



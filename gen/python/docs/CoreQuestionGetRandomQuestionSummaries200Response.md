# CoreQuestionGetRandomQuestionSummaries200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [**List[CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner]**](CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.md) |  | 
**totalcount** | **int** | total number of questions in result set | [default to null]

## Example

```python
from openapi_client.models.core_question_get_random_question_summaries200_response import CoreQuestionGetRandomQuestionSummaries200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreQuestionGetRandomQuestionSummaries200Response from a JSON string
core_question_get_random_question_summaries200_response_instance = CoreQuestionGetRandomQuestionSummaries200Response.from_json(json)
# print the JSON string representation of the object
print(CoreQuestionGetRandomQuestionSummaries200Response.to_json())

# convert the object into a dict
core_question_get_random_question_summaries200_response_dict = core_question_get_random_question_summaries200_response_instance.to_dict()
# create an instance of CoreQuestionGetRandomQuestionSummaries200Response from a dict
core_question_get_random_question_summaries200_response_from_dict = CoreQuestionGetRandomQuestionSummaries200Response.from_dict(core_question_get_random_question_summaries200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



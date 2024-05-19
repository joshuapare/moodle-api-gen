# CoreGradesGetFeedbackRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course ID | 
**itemid** | **int** | Grade Item ID | [default to null]
**userid** | **int** | User ID | 

## Example

```python
from openapi_client.models.core_grades_get_feedback_request import CoreGradesGetFeedbackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetFeedbackRequest from a JSON string
core_grades_get_feedback_request_instance = CoreGradesGetFeedbackRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetFeedbackRequest.to_json())

# convert the object into a dict
core_grades_get_feedback_request_dict = core_grades_get_feedback_request_instance.to_dict()
# create an instance of CoreGradesGetFeedbackRequest from a dict
core_grades_get_feedback_request_from_dict = CoreGradesGetFeedbackRequest.from_dict(core_grades_get_feedback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



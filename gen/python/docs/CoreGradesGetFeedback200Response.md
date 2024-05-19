# CoreGradesGetFeedback200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalfield** | **str** | Additional field for the user (email or ID number, for example) | [default to 'null']
**feedbacktext** | **str** | The full feedback text | [default to 'null']
**fullname** | **str** | Students name | [default to 'null']
**picture** | **str** | Students picture | [default to 'null']
**title** | **str** | Title of the grade item that the feedback is for | [default to 'null']

## Example

```python
from openapi_client.models.core_grades_get_feedback200_response import CoreGradesGetFeedback200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGetFeedback200Response from a JSON string
core_grades_get_feedback200_response_instance = CoreGradesGetFeedback200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGetFeedback200Response.to_json())

# convert the object into a dict
core_grades_get_feedback200_response_dict = core_grades_get_feedback200_response_instance.to_dict()
# create an instance of CoreGradesGetFeedback200Response from a dict
core_grades_get_feedback200_response_from_dict = CoreGradesGetFeedback200Response.from_dict(core_grades_get_feedback200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreGradesGraderGradingpanelPointStoreRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | The name of the component | 
**contextid** | **int** | The ID of the context being graded | 
**formdata** | **str** | The serialised form data representing the grade | [default to 'null']
**gradeduserid** | **int** | The ID of the user show | 
**itemname** | **str** | The grade item itemname being graded | 
**notifyuser** | **bool** | Wheteher to notify the user or not | [optional] [default to False]

## Example

```python
from openapi_client.models.core_grades_grader_gradingpanel_point_store_request import CoreGradesGraderGradingpanelPointStoreRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGraderGradingpanelPointStoreRequest from a JSON string
core_grades_grader_gradingpanel_point_store_request_instance = CoreGradesGraderGradingpanelPointStoreRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGraderGradingpanelPointStoreRequest.to_json())

# convert the object into a dict
core_grades_grader_gradingpanel_point_store_request_dict = core_grades_grader_gradingpanel_point_store_request_instance.to_dict()
# create an instance of CoreGradesGraderGradingpanelPointStoreRequest from a dict
core_grades_grader_gradingpanel_point_store_request_from_dict = CoreGradesGraderGradingpanelPointStoreRequest.from_dict(core_grades_grader_gradingpanel_point_store_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreGradesGraderGradingpanelScaleFetchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | The name of the component | 
**contextid** | **int** | The ID of the context being graded | 
**gradeduserid** | **int** | The ID of the user show | 
**itemname** | **str** | The grade item itemname being graded | 

## Example

```python
from openapi_client.models.core_grades_grader_gradingpanel_scale_fetch_request import CoreGradesGraderGradingpanelScaleFetchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGraderGradingpanelScaleFetchRequest from a JSON string
core_grades_grader_gradingpanel_scale_fetch_request_instance = CoreGradesGraderGradingpanelScaleFetchRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGraderGradingpanelScaleFetchRequest.to_json())

# convert the object into a dict
core_grades_grader_gradingpanel_scale_fetch_request_dict = core_grades_grader_gradingpanel_scale_fetch_request_instance.to_dict()
# create an instance of CoreGradesGraderGradingpanelScaleFetchRequest from a dict
core_grades_grader_gradingpanel_scale_fetch_request_from_dict = CoreGradesGraderGradingpanelScaleFetchRequest.from_dict(core_grades_grader_gradingpanel_scale_fetch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



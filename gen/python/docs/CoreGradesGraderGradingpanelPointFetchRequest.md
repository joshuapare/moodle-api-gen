# CoreGradesGraderGradingpanelPointFetchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | The name of the component | [default to 'null']
**contextid** | **int** | The ID of the context being graded | [default to null]
**gradeduserid** | **int** | The ID of the user show | [default to null]
**itemname** | **str** | The grade item itemname being graded | [default to 'null']

## Example

```python
from openapi_client.models.core_grades_grader_gradingpanel_point_fetch_request import CoreGradesGraderGradingpanelPointFetchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGraderGradingpanelPointFetchRequest from a JSON string
core_grades_grader_gradingpanel_point_fetch_request_instance = CoreGradesGraderGradingpanelPointFetchRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGraderGradingpanelPointFetchRequest.to_json())

# convert the object into a dict
core_grades_grader_gradingpanel_point_fetch_request_dict = core_grades_grader_gradingpanel_point_fetch_request_instance.to_dict()
# create an instance of CoreGradesGraderGradingpanelPointFetchRequest from a dict
core_grades_grader_gradingpanel_point_fetch_request_from_dict = CoreGradesGraderGradingpanelPointFetchRequest.from_dict(core_grades_grader_gradingpanel_point_fetch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



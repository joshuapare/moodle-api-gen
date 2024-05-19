# CoreGradesGraderGradingpanelPointFetch200ResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | **float** | The numeric grade | [default to null]
**gradedby** | **str** | The assumed grader of this grading instance | [default to 'null']
**maxgrade** | **str** | Max possible grade | [default to 'null']
**timecreated** | **int** | The time that the grade was created | [default to null]
**timemodified** | **int** | The time that the grade was last updated | [default to null]
**usergrade** | **str** | Current user grade | [default to 'null']

## Example

```python
from openapi_client.models.core_grades_grader_gradingpanel_point_fetch200_response_grade import CoreGradesGraderGradingpanelPointFetch200ResponseGrade

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGraderGradingpanelPointFetch200ResponseGrade from a JSON string
core_grades_grader_gradingpanel_point_fetch200_response_grade_instance = CoreGradesGraderGradingpanelPointFetch200ResponseGrade.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGraderGradingpanelPointFetch200ResponseGrade.to_json())

# convert the object into a dict
core_grades_grader_gradingpanel_point_fetch200_response_grade_dict = core_grades_grader_gradingpanel_point_fetch200_response_grade_instance.to_dict()
# create an instance of CoreGradesGraderGradingpanelPointFetch200ResponseGrade from a dict
core_grades_grader_gradingpanel_point_fetch200_response_grade_from_dict = CoreGradesGraderGradingpanelPointFetch200ResponseGrade.from_dict(core_grades_grader_gradingpanel_point_fetch200_response_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



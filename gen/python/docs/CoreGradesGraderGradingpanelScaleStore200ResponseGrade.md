# CoreGradesGraderGradingpanelScaleStore200ResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gradedby** | **str** | The assumed grader of this grading instance | 
**maxgrade** | **str** | Max possible grade | 
**options** | [**List[CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner]**](CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner.md) |  | 
**timecreated** | **int** | The time that the grade was created | 
**timemodified** | **int** | The time that the grade was last updated | 
**usergrade** | **str** | Current user grade | 

## Example

```python
from openapi_client.models.core_grades_grader_gradingpanel_scale_store200_response_grade import CoreGradesGraderGradingpanelScaleStore200ResponseGrade

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGraderGradingpanelScaleStore200ResponseGrade from a JSON string
core_grades_grader_gradingpanel_scale_store200_response_grade_instance = CoreGradesGraderGradingpanelScaleStore200ResponseGrade.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGraderGradingpanelScaleStore200ResponseGrade.to_json())

# convert the object into a dict
core_grades_grader_gradingpanel_scale_store200_response_grade_dict = core_grades_grader_gradingpanel_scale_store200_response_grade_instance.to_dict()
# create an instance of CoreGradesGraderGradingpanelScaleStore200ResponseGrade from a dict
core_grades_grader_gradingpanel_scale_store200_response_grade_from_dict = CoreGradesGraderGradingpanelScaleStore200ResponseGrade.from_dict(core_grades_grader_gradingpanel_scale_store200_response_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



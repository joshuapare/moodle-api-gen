# GradingformRubricGraderGradingpanelStore200ResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canedit** | **bool** | Can the user edit this | 
**criteria** | [**List[GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner]**](GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner.md) |  | 
**gradedby** | **str** | The assumed grader of this grading instance | 
**instanceid** | **int** | The id of the current grading instance | 
**maxgrade** | **str** | Max possible grade | 
**rubricmode** | **str** | The mode i.e. evaluate editable | 
**timecreated** | **int** | The time that the grade was created | 
**timemodified** | **int** | The time that the grade was last updated | 
**usergrade** | **str** | Current user grade | 

## Example

```python
from openapi_client.models.gradingform_rubric_grader_gradingpanel_store200_response_grade import GradingformRubricGraderGradingpanelStore200ResponseGrade

# TODO update the JSON string below
json = "{}"
# create an instance of GradingformRubricGraderGradingpanelStore200ResponseGrade from a JSON string
gradingform_rubric_grader_gradingpanel_store200_response_grade_instance = GradingformRubricGraderGradingpanelStore200ResponseGrade.from_json(json)
# print the JSON string representation of the object
print(GradingformRubricGraderGradingpanelStore200ResponseGrade.to_json())

# convert the object into a dict
gradingform_rubric_grader_gradingpanel_store200_response_grade_dict = gradingform_rubric_grader_gradingpanel_store200_response_grade_instance.to_dict()
# create an instance of GradingformRubricGraderGradingpanelStore200ResponseGrade from a dict
gradingform_rubric_grader_gradingpanel_store200_response_grade_from_dict = GradingformRubricGraderGradingpanelStore200ResponseGrade.from_dict(gradingform_rubric_grader_gradingpanel_store200_response_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# GradingformRubricGraderGradingpanelFetch200ResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canedit** | **bool** | Can the user edit this | [default to False]
**criteria** | [**List[GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner]**](GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner.md) |  | 
**gradedby** | **str** | The assumed grader of this grading instance | 
**instanceid** | **int** | The id of the current grading instance | 
**maxgrade** | **str** | Max possible grade | 
**rubricmode** | **str** | The mode i.e. evaluate editable | [default to 'null']
**timecreated** | **int** | The time that the grade was created | 
**timemodified** | **int** | The time that the grade was last updated | 
**usergrade** | **str** | Current user grade | 

## Example

```python
from openapi_client.models.gradingform_rubric_grader_gradingpanel_fetch200_response_grade import GradingformRubricGraderGradingpanelFetch200ResponseGrade

# TODO update the JSON string below
json = "{}"
# create an instance of GradingformRubricGraderGradingpanelFetch200ResponseGrade from a JSON string
gradingform_rubric_grader_gradingpanel_fetch200_response_grade_instance = GradingformRubricGraderGradingpanelFetch200ResponseGrade.from_json(json)
# print the JSON string representation of the object
print(GradingformRubricGraderGradingpanelFetch200ResponseGrade.to_json())

# convert the object into a dict
gradingform_rubric_grader_gradingpanel_fetch200_response_grade_dict = gradingform_rubric_grader_gradingpanel_fetch200_response_grade_instance.to_dict()
# create an instance of GradingformRubricGraderGradingpanelFetch200ResponseGrade from a dict
gradingform_rubric_grader_gradingpanel_fetch200_response_grade_from_dict = GradingformRubricGraderGradingpanelFetch200ResponseGrade.from_dict(gradingform_rubric_grader_gradingpanel_fetch200_response_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



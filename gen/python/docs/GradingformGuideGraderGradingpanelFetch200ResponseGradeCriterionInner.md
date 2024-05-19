# GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The description of the criterion | [optional] [default to 'null']
**descriptionmarkers** | **str** | The description of the criterion for markers | [optional] [default to 'null']
**id** | **int** | The id of the criterion | [optional] [default to null]
**maxscore** | **float** | The maximum score for this criterion | [optional] [default to null]
**name** | **str** | The name of the criterion | [optional] [default to 'null']
**remark** | **str** | Any remarks for this criterion for the user being assessed | [optional] [default to 'null']
**score** | **float** | The current score for user being assessed | [optional] [default to null]

## Example

```python
from openapi_client.models.gradingform_guide_grader_gradingpanel_fetch200_response_grade_criterion_inner import GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner

# TODO update the JSON string below
json = "{}"
# create an instance of GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner from a JSON string
gradingform_guide_grader_gradingpanel_fetch200_response_grade_criterion_inner_instance = GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner.from_json(json)
# print the JSON string representation of the object
print(GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner.to_json())

# convert the object into a dict
gradingform_guide_grader_gradingpanel_fetch200_response_grade_criterion_inner_dict = gradingform_guide_grader_gradingpanel_fetch200_response_grade_criterion_inner_instance.to_dict()
# create an instance of GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner from a dict
gradingform_guide_grader_gradingpanel_fetch200_response_grade_criterion_inner_from_dict = GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner.from_dict(gradingform_guide_grader_gradingpanel_fetch200_response_grade_criterion_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



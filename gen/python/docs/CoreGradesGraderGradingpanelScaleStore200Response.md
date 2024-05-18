# CoreGradesGraderGradingpanelScaleStore200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | [**CoreGradesGraderGradingpanelScaleStore200ResponseGrade**](CoreGradesGraderGradingpanelScaleStore200ResponseGrade.md) |  | 
**hasgrade** | **bool** | Does the user have a grade? | 
**templatename** | **str** | The template to use when rendering this data | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grades_grader_gradingpanel_scale_store200_response import CoreGradesGraderGradingpanelScaleStore200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGraderGradingpanelScaleStore200Response from a JSON string
core_grades_grader_gradingpanel_scale_store200_response_instance = CoreGradesGraderGradingpanelScaleStore200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGraderGradingpanelScaleStore200Response.to_json())

# convert the object into a dict
core_grades_grader_gradingpanel_scale_store200_response_dict = core_grades_grader_gradingpanel_scale_store200_response_instance.to_dict()
# create an instance of CoreGradesGraderGradingpanelScaleStore200Response from a dict
core_grades_grader_gradingpanel_scale_store200_response_from_dict = CoreGradesGraderGradingpanelScaleStore200Response.from_dict(core_grades_grader_gradingpanel_scale_store200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



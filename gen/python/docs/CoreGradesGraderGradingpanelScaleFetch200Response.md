# CoreGradesGraderGradingpanelScaleFetch200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | [**CoreGradesGraderGradingpanelScaleFetch200ResponseGrade**](CoreGradesGraderGradingpanelScaleFetch200ResponseGrade.md) |  | 
**hasgrade** | **bool** | Does the user have a grade? | 
**templatename** | **str** | The template to use when rendering this data | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grades_grader_gradingpanel_scale_fetch200_response import CoreGradesGraderGradingpanelScaleFetch200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesGraderGradingpanelScaleFetch200Response from a JSON string
core_grades_grader_gradingpanel_scale_fetch200_response_instance = CoreGradesGraderGradingpanelScaleFetch200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGradesGraderGradingpanelScaleFetch200Response.to_json())

# convert the object into a dict
core_grades_grader_gradingpanel_scale_fetch200_response_dict = core_grades_grader_gradingpanel_scale_fetch200_response_instance.to_dict()
# create an instance of CoreGradesGraderGradingpanelScaleFetch200Response from a dict
core_grades_grader_gradingpanel_scale_fetch200_response_from_dict = CoreGradesGraderGradingpanelScaleFetch200Response.from_dict(core_grades_grader_gradingpanel_scale_fetch200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# GradingformGuideGraderGradingpanelFetch200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | [**GradingformGuideGraderGradingpanelFetch200ResponseGrade**](GradingformGuideGraderGradingpanelFetch200ResponseGrade.md) |  | 
**hasgrade** | **bool** | Does the user have a grade? | 
**templatename** | **str** | The template to use when rendering this data | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.gradingform_guide_grader_gradingpanel_fetch200_response import GradingformGuideGraderGradingpanelFetch200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GradingformGuideGraderGradingpanelFetch200Response from a JSON string
gradingform_guide_grader_gradingpanel_fetch200_response_instance = GradingformGuideGraderGradingpanelFetch200Response.from_json(json)
# print the JSON string representation of the object
print(GradingformGuideGraderGradingpanelFetch200Response.to_json())

# convert the object into a dict
gradingform_guide_grader_gradingpanel_fetch200_response_dict = gradingform_guide_grader_gradingpanel_fetch200_response_instance.to_dict()
# create an instance of GradingformGuideGraderGradingpanelFetch200Response from a dict
gradingform_guide_grader_gradingpanel_fetch200_response_from_dict = GradingformGuideGraderGradingpanelFetch200Response.from_dict(gradingform_guide_grader_gradingpanel_fetch200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



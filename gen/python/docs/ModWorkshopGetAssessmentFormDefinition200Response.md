# ModWorkshopGetAssessmentFormDefinition200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current** | [**List[ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner]**](ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner.md) |  | 
**descriptionfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**dimensionsinfo** | [**List[ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner]**](ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.md) |  | 
**dimenssionscount** | **int** | The number of dimenssions used by the form. | [default to null]
**fields** | [**List[ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner]**](ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner.md) |  | 
**options** | [**List[ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner]**](ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_assessment_form_definition200_response import ModWorkshopGetAssessmentFormDefinition200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetAssessmentFormDefinition200Response from a JSON string
mod_workshop_get_assessment_form_definition200_response_instance = ModWorkshopGetAssessmentFormDefinition200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetAssessmentFormDefinition200Response.to_json())

# convert the object into a dict
mod_workshop_get_assessment_form_definition200_response_dict = mod_workshop_get_assessment_form_definition200_response_instance.to_dict()
# create an instance of ModWorkshopGetAssessmentFormDefinition200Response from a dict
mod_workshop_get_assessment_form_definition200_response_from_dict = ModWorkshopGetAssessmentFormDefinition200Response.from_dict(mod_workshop_get_assessment_form_definition200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



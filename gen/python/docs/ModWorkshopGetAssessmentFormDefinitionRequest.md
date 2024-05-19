# ModWorkshopGetAssessmentFormDefinitionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentid** | **int** | Assessment id | 
**mode** | **str** | The form mode (assessment or preview) | [optional] [default to 'assessment']

## Example

```python
from openapi_client.models.mod_workshop_get_assessment_form_definition_request import ModWorkshopGetAssessmentFormDefinitionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetAssessmentFormDefinitionRequest from a JSON string
mod_workshop_get_assessment_form_definition_request_instance = ModWorkshopGetAssessmentFormDefinitionRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetAssessmentFormDefinitionRequest.to_json())

# convert the object into a dict
mod_workshop_get_assessment_form_definition_request_dict = mod_workshop_get_assessment_form_definition_request_instance.to_dict()
# create an instance of ModWorkshopGetAssessmentFormDefinitionRequest from a dict
mod_workshop_get_assessment_form_definition_request_from_dict = ModWorkshopGetAssessmentFormDefinitionRequest.from_dict(mod_workshop_get_assessment_form_definition_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



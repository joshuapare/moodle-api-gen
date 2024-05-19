# ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Dimension id. | [optional] [default to null]
**max** | **float** | Maximum grade for the dimension. | [optional] [default to null]
**min** | **float** | Minimum grade for the dimension. | [optional] [default to null]
**scale** | **str** | Scale items (if used). | [optional] [default to 'null']
**weight** | **str** | The weight of the dimension. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_workshop_get_assessment_form_definition200_response_dimensionsinfo_inner import ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner from a JSON string
mod_workshop_get_assessment_form_definition200_response_dimensionsinfo_inner_instance = ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.to_json())

# convert the object into a dict
mod_workshop_get_assessment_form_definition200_response_dimensionsinfo_inner_dict = mod_workshop_get_assessment_form_definition200_response_dimensionsinfo_inner_instance.to_dict()
# create an instance of ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner from a dict
mod_workshop_get_assessment_form_definition200_response_dimensionsinfo_inner_from_dict = ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.from_dict(mod_workshop_get_assessment_form_definition200_response_dimensionsinfo_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



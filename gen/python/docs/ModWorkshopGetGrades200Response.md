# ModWorkshopGetGrades200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentgradehidden** | **bool** | Whether the grade is hidden or not. | [optional] [default to False]
**assessmentlongstrgrade** | **str** | The assessment string grade. | [optional] [default to 'null']
**assessmentrawgrade** | **float** | The assessment raw (numeric) grade. | [optional] [default to null]
**submissiongradehidden** | **bool** | Whether the grade is hidden or not. | [optional] 
**submissionlongstrgrade** | **str** | The submission string grade. | [optional] [default to 'null']
**submissionrawgrade** | **float** | The submission raw (numeric) grade. | [optional] [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_grades200_response import ModWorkshopGetGrades200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGrades200Response from a JSON string
mod_workshop_get_grades200_response_instance = ModWorkshopGetGrades200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGrades200Response.to_json())

# convert the object into a dict
mod_workshop_get_grades200_response_dict = mod_workshop_get_grades200_response_instance.to_dict()
# create an instance of ModWorkshopGetGrades200Response from a dict
mod_workshop_get_grades200_response_from_dict = ModWorkshopGetGrades200Response.from_dict(mod_workshop_get_grades200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



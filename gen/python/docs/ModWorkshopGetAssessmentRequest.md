# ModWorkshopGetAssessmentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentid** | **int** | Assessment id | [default to null]

## Example

```python
from openapi_client.models.mod_workshop_get_assessment_request import ModWorkshopGetAssessmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetAssessmentRequest from a JSON string
mod_workshop_get_assessment_request_instance = ModWorkshopGetAssessmentRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetAssessmentRequest.to_json())

# convert the object into a dict
mod_workshop_get_assessment_request_dict = mod_workshop_get_assessment_request_instance.to_dict()
# create an instance of ModWorkshopGetAssessmentRequest from a dict
mod_workshop_get_assessment_request_from_dict = ModWorkshopGetAssessmentRequest.from_dict(mod_workshop_get_assessment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



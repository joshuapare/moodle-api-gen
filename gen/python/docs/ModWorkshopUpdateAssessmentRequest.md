# ModWorkshopUpdateAssessmentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessmentid** | **int** | Assessment id. | 
**data** | [**List[ModWorkshopUpdateAssessmentRequestDataInner]**](ModWorkshopUpdateAssessmentRequestDataInner.md) |  | 

## Example

```python
from openapi_client.models.mod_workshop_update_assessment_request import ModWorkshopUpdateAssessmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopUpdateAssessmentRequest from a JSON string
mod_workshop_update_assessment_request_instance = ModWorkshopUpdateAssessmentRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopUpdateAssessmentRequest.to_json())

# convert the object into a dict
mod_workshop_update_assessment_request_dict = mod_workshop_update_assessment_request_instance.to_dict()
# create an instance of ModWorkshopUpdateAssessmentRequest from a dict
mod_workshop_update_assessment_request_from_dict = ModWorkshopUpdateAssessmentRequest.from_dict(mod_workshop_update_assessment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



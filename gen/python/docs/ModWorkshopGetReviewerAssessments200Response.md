# ModWorkshopGetReviewerAssessments200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessments** | [**List[ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner]**](ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_reviewer_assessments200_response import ModWorkshopGetReviewerAssessments200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetReviewerAssessments200Response from a JSON string
mod_workshop_get_reviewer_assessments200_response_instance = ModWorkshopGetReviewerAssessments200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetReviewerAssessments200Response.to_json())

# convert the object into a dict
mod_workshop_get_reviewer_assessments200_response_dict = mod_workshop_get_reviewer_assessments200_response_instance.to_dict()
# create an instance of ModWorkshopGetReviewerAssessments200Response from a dict
mod_workshop_get_reviewer_assessments200_response_from_dict = ModWorkshopGetReviewerAssessments200Response.from_dict(mod_workshop_get_reviewer_assessments200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



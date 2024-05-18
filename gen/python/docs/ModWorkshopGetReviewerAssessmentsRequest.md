# ModWorkshopGetReviewerAssessmentsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | User id who did the assessment review (empty or 0 for current user). | [optional] [default to 0]
**workshopid** | **int** | Workshop instance id. | 

## Example

```python
from openapi_client.models.mod_workshop_get_reviewer_assessments_request import ModWorkshopGetReviewerAssessmentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetReviewerAssessmentsRequest from a JSON string
mod_workshop_get_reviewer_assessments_request_instance = ModWorkshopGetReviewerAssessmentsRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetReviewerAssessmentsRequest.to_json())

# convert the object into a dict
mod_workshop_get_reviewer_assessments_request_dict = mod_workshop_get_reviewer_assessments_request_instance.to_dict()
# create an instance of ModWorkshopGetReviewerAssessmentsRequest from a dict
mod_workshop_get_reviewer_assessments_request_from_dict = ModWorkshopGetReviewerAssessmentsRequest.from_dict(mod_workshop_get_reviewer_assessments_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



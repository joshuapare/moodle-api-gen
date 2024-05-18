# CoreCompetencyUserCompetencyRequestReviewRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency ID | 
**userid** | **int** | The user ID | 

## Example

```python
from openapi_client.models.core_competency_user_competency_request_review_request import CoreCompetencyUserCompetencyRequestReviewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUserCompetencyRequestReviewRequest from a JSON string
core_competency_user_competency_request_review_request_instance = CoreCompetencyUserCompetencyRequestReviewRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUserCompetencyRequestReviewRequest.to_json())

# convert the object into a dict
core_competency_user_competency_request_review_request_dict = core_competency_user_competency_request_review_request_instance.to_dict()
# create an instance of CoreCompetencyUserCompetencyRequestReviewRequest from a dict
core_competency_user_competency_request_review_request_from_dict = CoreCompetencyUserCompetencyRequestReviewRequest.from_dict(core_competency_user_competency_request_review_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



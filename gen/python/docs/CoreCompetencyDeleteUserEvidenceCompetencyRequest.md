# CoreCompetencyDeleteUserEvidenceCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency ID. | 
**userevidenceid** | **int** | The user evidence ID. | 

## Example

```python
from openapi_client.models.core_competency_delete_user_evidence_competency_request import CoreCompetencyDeleteUserEvidenceCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyDeleteUserEvidenceCompetencyRequest from a JSON string
core_competency_delete_user_evidence_competency_request_instance = CoreCompetencyDeleteUserEvidenceCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyDeleteUserEvidenceCompetencyRequest.to_json())

# convert the object into a dict
core_competency_delete_user_evidence_competency_request_dict = core_competency_delete_user_evidence_competency_request_instance.to_dict()
# create an instance of CoreCompetencyDeleteUserEvidenceCompetencyRequest from a dict
core_competency_delete_user_evidence_competency_request_from_dict = CoreCompetencyDeleteUserEvidenceCompetencyRequest.from_dict(core_competency_delete_user_evidence_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



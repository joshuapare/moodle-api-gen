# CoreCompetencyCreateUserEvidenceCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency ID. | [default to null]
**userevidenceid** | **int** | The user evidence ID. | [default to null]

## Example

```python
from openapi_client.models.core_competency_create_user_evidence_competency_request import CoreCompetencyCreateUserEvidenceCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateUserEvidenceCompetencyRequest from a JSON string
core_competency_create_user_evidence_competency_request_instance = CoreCompetencyCreateUserEvidenceCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateUserEvidenceCompetencyRequest.to_json())

# convert the object into a dict
core_competency_create_user_evidence_competency_request_dict = core_competency_create_user_evidence_competency_request_instance.to_dict()
# create an instance of CoreCompetencyCreateUserEvidenceCompetencyRequest from a dict
core_competency_create_user_evidence_competency_request_from_dict = CoreCompetencyCreateUserEvidenceCompetencyRequest.from_dict(core_competency_create_user_evidence_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



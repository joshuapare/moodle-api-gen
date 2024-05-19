# CoreCompetencyCreateUserEvidenceCompetency200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | competencyid | [default to null]
**id** | **int** | id | [default to 0]
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**userevidenceid** | **int** | userevidenceid | [default to null]
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_competency_create_user_evidence_competency200_response import CoreCompetencyCreateUserEvidenceCompetency200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateUserEvidenceCompetency200Response from a JSON string
core_competency_create_user_evidence_competency200_response_instance = CoreCompetencyCreateUserEvidenceCompetency200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateUserEvidenceCompetency200Response.to_json())

# convert the object into a dict
core_competency_create_user_evidence_competency200_response_dict = core_competency_create_user_evidence_competency200_response_instance.to_dict()
# create an instance of CoreCompetencyCreateUserEvidenceCompetency200Response from a dict
core_competency_create_user_evidence_competency200_response_from_dict = CoreCompetencyCreateUserEvidenceCompetency200Response.from_dict(core_competency_create_user_evidence_competency200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



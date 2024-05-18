# CoreCompetencyReadUserEvidence200ResponseCompetenciesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyframeworkid** | **int** | competencyframeworkid | [optional] [default to 0]
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id | [optional] [default to 0]
**idnumber** | **str** | idnumber | [optional] 
**parentid** | **int** | parentid | [optional] [default to 0]
**path** | **str** | path | [optional] [default to '/0/']
**ruleconfig** | **str** | ruleconfig | [optional] 
**ruleoutcome** | **int** | ruleoutcome | [optional] [default to 0]
**ruletype** | **str** | ruletype | [optional] 
**scaleconfiguration** | **str** | scaleconfiguration | [optional] 
**scaleid** | **int** | scaleid | [optional] 
**shortname** | **str** | shortname | [optional] 
**sortorder** | **int** | sortorder | [optional] [default to 0]
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**usermodified** | **int** | usermodified | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_competency_read_user_evidence200_response_competencies_inner import CoreCompetencyReadUserEvidence200ResponseCompetenciesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyReadUserEvidence200ResponseCompetenciesInner from a JSON string
core_competency_read_user_evidence200_response_competencies_inner_instance = CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.to_json())

# convert the object into a dict
core_competency_read_user_evidence200_response_competencies_inner_dict = core_competency_read_user_evidence200_response_competencies_inner_instance.to_dict()
# create an instance of CoreCompetencyReadUserEvidence200ResponseCompetenciesInner from a dict
core_competency_read_user_evidence200_response_competencies_inner_from_dict = CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.from_dict(core_competency_read_user_evidence200_response_competencies_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



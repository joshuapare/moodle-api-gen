# CoreCompetencyReadUserEvidence200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | canmanage | 
**competencies** | [**List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**competencycount** | **int** | competencycount | [default to null]
**description** | **str** | description | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**filecount** | **int** | filecount | [default to null]
**files** | [**List[CoreCompetencyReadUserEvidence200ResponseFilesInner]**](CoreCompetencyReadUserEvidence200ResponseFilesInner.md) |  | 
**hasurlorfiles** | **bool** | hasurlorfiles | [default to False]
**id** | **int** | id | [default to 0]
**name** | **str** | name | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | [default to '']
**urlshort** | **str** | urlshort | [default to 'null']
**userid** | **int** | userid | 
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_competency_read_user_evidence200_response import CoreCompetencyReadUserEvidence200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyReadUserEvidence200Response from a JSON string
core_competency_read_user_evidence200_response_instance = CoreCompetencyReadUserEvidence200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyReadUserEvidence200Response.to_json())

# convert the object into a dict
core_competency_read_user_evidence200_response_dict = core_competency_read_user_evidence200_response_instance.to_dict()
# create an instance of CoreCompetencyReadUserEvidence200Response from a dict
core_competency_read_user_evidence200_response_from_dict = CoreCompetencyReadUserEvidence200Response.from_dict(core_competency_read_user_evidence200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



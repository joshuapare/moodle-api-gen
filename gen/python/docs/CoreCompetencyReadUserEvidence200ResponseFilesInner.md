# CoreCompetencyReadUserEvidence200ResponseFilesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | **str** | author | [optional] [default to 'null']
**component** | **str** | component | [optional] 
**contextid** | **int** | contextid | [optional] 
**filearea** | **str** | filearea | [optional] [default to 'null']
**filename** | **str** | filename | [optional] [default to 'null']
**filenameshort** | **str** | filenameshort | [optional] [default to 'null']
**filepath** | **str** | filepath | [optional] [default to 'null']
**filesize** | **int** | filesize | [optional] [default to null]
**filesizeformatted** | **str** | filesizeformatted | [optional] [default to 'null']
**icon** | **str** | icon | [optional] [default to 'null']
**isdir** | **bool** | isdir | [optional] [default to False]
**isimage** | **bool** | isimage | [optional] [default to False]
**itemid** | **int** | itemid | [optional] 
**license** | **str** | license | [optional] [default to 'null']
**timecreated** | **int** | timecreated | [optional] [default to null]
**timecreatedformatted** | **str** | timecreatedformatted | [optional] [default to 'null']
**timemodified** | **int** | timemodified | [optional] 
**timemodifiedformatted** | **str** | timemodifiedformatted | [optional] [default to 'null']
**url** | **str** | url | [optional] 

## Example

```python
from openapi_client.models.core_competency_read_user_evidence200_response_files_inner import CoreCompetencyReadUserEvidence200ResponseFilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyReadUserEvidence200ResponseFilesInner from a JSON string
core_competency_read_user_evidence200_response_files_inner_instance = CoreCompetencyReadUserEvidence200ResponseFilesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyReadUserEvidence200ResponseFilesInner.to_json())

# convert the object into a dict
core_competency_read_user_evidence200_response_files_inner_dict = core_competency_read_user_evidence200_response_files_inner_instance.to_dict()
# create an instance of CoreCompetencyReadUserEvidence200ResponseFilesInner from a dict
core_competency_read_user_evidence200_response_files_inner_from_dict = CoreCompetencyReadUserEvidence200ResponseFilesInner.from_dict(core_competency_read_user_evidence200_response_files_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



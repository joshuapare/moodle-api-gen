# CoreCompetencyUpdateCompetencyRequestCompetency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyframeworkid** | **int** | competencyframeworkid | [optional] [default to null]
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id | 
**idnumber** | **str** | idnumber | [optional] 
**parentid** | **int** | parentid | [optional] [default to null]
**path** | **str** | path | [optional] [default to 'null']
**ruleconfig** | **str** | ruleconfig | [optional] 
**ruleoutcome** | **int** | ruleoutcome | [optional] [default to null]
**ruletype** | **str** | ruletype | [optional] 
**scaleconfiguration** | **str** | scaleconfiguration | [optional] 
**scaleid** | **int** | scaleid | [optional] 
**shortname** | **str** | shortname | [optional] 
**sortorder** | **int** | sortorder | [optional] [default to null]
**timecreated** | **int** | timecreated | [optional] 
**timemodified** | **int** | timemodified | [optional] 
**usermodified** | **int** | usermodified | [optional] [default to null]

## Example

```python
from openapi_client.models.core_competency_update_competency_request_competency import CoreCompetencyUpdateCompetencyRequestCompetency

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUpdateCompetencyRequestCompetency from a JSON string
core_competency_update_competency_request_competency_instance = CoreCompetencyUpdateCompetencyRequestCompetency.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUpdateCompetencyRequestCompetency.to_json())

# convert the object into a dict
core_competency_update_competency_request_competency_dict = core_competency_update_competency_request_competency_instance.to_dict()
# create an instance of CoreCompetencyUpdateCompetencyRequestCompetency from a dict
core_competency_update_competency_request_competency_from_dict = CoreCompetencyUpdateCompetencyRequestCompetency.from_dict(core_competency_update_competency_request_competency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCompetencyCreateCompetencyRequestCompetency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyframeworkid** | **int** | competencyframeworkid | [optional] [default to 0]
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**idnumber** | **str** | idnumber | 
**parentid** | **int** | parentid | [optional] [default to 0]
**path** | **str** | path | [optional] [default to '/0/']
**ruleconfig** | **str** | ruleconfig | [optional] [default to 'null']
**ruleoutcome** | **int** | ruleoutcome | [optional] [default to 0]
**ruletype** | **str** | ruletype | [optional] [default to 'null']
**scaleconfiguration** | **str** | scaleconfiguration | [optional] [default to 'null']
**scaleid** | **int** | scaleid | [optional] [default to null]
**shortname** | **str** | shortname | 
**sortorder** | **int** | sortorder | [optional] [default to 0]
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**usermodified** | **int** | usermodified | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_competency_create_competency_request_competency import CoreCompetencyCreateCompetencyRequestCompetency

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateCompetencyRequestCompetency from a JSON string
core_competency_create_competency_request_competency_instance = CoreCompetencyCreateCompetencyRequestCompetency.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateCompetencyRequestCompetency.to_json())

# convert the object into a dict
core_competency_create_competency_request_competency_dict = core_competency_create_competency_request_competency_instance.to_dict()
# create an instance of CoreCompetencyCreateCompetencyRequestCompetency from a dict
core_competency_create_competency_request_competency_from_dict = CoreCompetencyCreateCompetencyRequestCompetency.from_dict(core_competency_create_competency_request_competency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



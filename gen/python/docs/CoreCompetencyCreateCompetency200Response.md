# CoreCompetencyCreateCompetency200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyframeworkid** | **int** | competencyframeworkid | [default to 0]
**description** | **str** | description | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id | [default to 0]
**idnumber** | **str** | idnumber | 
**parentid** | **int** | parentid | [default to 0]
**path** | **str** | path | [default to '/0/']
**ruleconfig** | **str** | ruleconfig | 
**ruleoutcome** | **int** | ruleoutcome | [default to 0]
**ruletype** | **str** | ruletype | 
**scaleconfiguration** | **str** | scaleconfiguration | 
**scaleid** | **int** | scaleid | 
**shortname** | **str** | shortname | 
**sortorder** | **int** | sortorder | [default to 0]
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_competency_create_competency200_response import CoreCompetencyCreateCompetency200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateCompetency200Response from a JSON string
core_competency_create_competency200_response_instance = CoreCompetencyCreateCompetency200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateCompetency200Response.to_json())

# convert the object into a dict
core_competency_create_competency200_response_dict = core_competency_create_competency200_response_instance.to_dict()
# create an instance of CoreCompetencyCreateCompetency200Response from a dict
core_competency_create_competency200_response_from_dict = CoreCompetencyCreateCompetency200Response.from_dict(core_competency_create_competency200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id | [optional] 
**contextlevel** | **str** | The context level | [optional] 
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id | 
**idnumber** | **str** | idnumber | [optional] 
**instanceid** | **int** | The Instance id | [optional] 
**scaleconfiguration** | **str** | scaleconfiguration | [optional] 
**scaleid** | **int** | scaleid | [optional] 
**shortname** | **str** | shortname | [optional] 
**taxonomies** | **str** | taxonomies | [optional] [default to 'null']
**timecreated** | **int** | timecreated | [optional] 
**timemodified** | **int** | timemodified | [optional] 
**usermodified** | **int** | usermodified | [optional] 
**visible** | **bool** | visible | [optional] 

## Example

```python
from openapi_client.models.core_competency_update_competency_framework_request_competencyframework import CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework from a JSON string
core_competency_update_competency_framework_request_competencyframework_instance = CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework.to_json())

# convert the object into a dict
core_competency_update_competency_framework_request_competencyframework_dict = core_competency_update_competency_framework_request_competencyframework_instance.to_dict()
# create an instance of CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework from a dict
core_competency_update_competency_framework_request_competencyframework_from_dict = CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework.from_dict(core_competency_update_competency_framework_request_competencyframework_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



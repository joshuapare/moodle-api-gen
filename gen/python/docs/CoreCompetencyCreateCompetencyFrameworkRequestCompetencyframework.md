# CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id | [optional] [default to null]
**contextlevel** | **str** | The context level | [optional] [default to 'null']
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**idnumber** | **str** | idnumber | 
**instanceid** | **int** | The Instance id | [optional] [default to null]
**scaleconfiguration** | **str** | scaleconfiguration | [default to 'null']
**scaleid** | **int** | scaleid | [default to null]
**shortname** | **str** | shortname | 
**taxonomies** | **str** | taxonomies | [optional] [default to '']
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**usermodified** | **int** | usermodified | [optional] [default to 0]
**visible** | **bool** | visible | [optional] [default to False]

## Example

```python
from openapi_client.models.core_competency_create_competency_framework_request_competencyframework import CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework from a JSON string
core_competency_create_competency_framework_request_competencyframework_instance = CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework.to_json())

# convert the object into a dict
core_competency_create_competency_framework_request_competencyframework_dict = core_competency_create_competency_framework_request_competencyframework_instance.to_dict()
# create an instance of CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework from a dict
core_competency_create_competency_framework_request_competencyframework_from_dict = CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework.from_dict(core_competency_create_competency_framework_request_competencyframework_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCompetencyCreateTemplateRequestTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id | [optional] 
**contextlevel** | **str** | The context level | [optional] 
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [optional] [default to 0]
**instanceid** | **int** | The Instance id | [optional] 
**shortname** | **str** | shortname | 
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**usermodified** | **int** | usermodified | [optional] [default to 0]
**visible** | **bool** | visible | [optional] [default to False]

## Example

```python
from openapi_client.models.core_competency_create_template_request_template import CoreCompetencyCreateTemplateRequestTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateTemplateRequestTemplate from a JSON string
core_competency_create_template_request_template_instance = CoreCompetencyCreateTemplateRequestTemplate.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateTemplateRequestTemplate.to_json())

# convert the object into a dict
core_competency_create_template_request_template_dict = core_competency_create_template_request_template_instance.to_dict()
# create an instance of CoreCompetencyCreateTemplateRequestTemplate from a dict
core_competency_create_template_request_template_from_dict = CoreCompetencyCreateTemplateRequestTemplate.from_dict(core_competency_create_template_request_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



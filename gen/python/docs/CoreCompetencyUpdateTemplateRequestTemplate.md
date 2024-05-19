# CoreCompetencyUpdateTemplateRequestTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id | [optional] 
**contextlevel** | **str** | The context level | [optional] 
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [optional] 
**id** | **int** | id | 
**instanceid** | **int** | The Instance id | [optional] 
**shortname** | **str** | shortname | [optional] 
**timecreated** | **int** | timecreated | [optional] 
**timemodified** | **int** | timemodified | [optional] 
**usermodified** | **int** | usermodified | [optional] 
**visible** | **bool** | visible | [optional] 

## Example

```python
from openapi_client.models.core_competency_update_template_request_template import CoreCompetencyUpdateTemplateRequestTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUpdateTemplateRequestTemplate from a JSON string
core_competency_update_template_request_template_instance = CoreCompetencyUpdateTemplateRequestTemplate.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUpdateTemplateRequestTemplate.to_json())

# convert the object into a dict
core_competency_update_template_request_template_dict = core_competency_update_template_request_template_instance.to_dict()
# create an instance of CoreCompetencyUpdateTemplateRequestTemplate from a dict
core_competency_update_template_request_template_from_dict = CoreCompetencyUpdateTemplateRequestTemplate.from_dict(core_competency_update_template_request_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



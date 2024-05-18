# CoreCompetencyCreatePlan200ResponseTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | canmanage | 
**canread** | **bool** | canread | [default to False]
**cohortscount** | **int** | cohortscount | [default to null]
**contextid** | **int** | contextid | 
**contextname** | **str** | contextname | 
**contextnamenoprefix** | **str** | contextnamenoprefix | 
**description** | **str** | description | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [default to 0]
**duedateformatted** | **str** | duedateformatted | 
**id** | **int** | id | [default to 0]
**planscount** | **int** | planscount | [default to null]
**shortname** | **str** | shortname | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**usermodified** | **int** | usermodified | [default to 0]
**visible** | **bool** | visible | [default to False]

## Example

```python
from openapi_client.models.core_competency_create_plan200_response_template import CoreCompetencyCreatePlan200ResponseTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreatePlan200ResponseTemplate from a JSON string
core_competency_create_plan200_response_template_instance = CoreCompetencyCreatePlan200ResponseTemplate.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreatePlan200ResponseTemplate.to_json())

# convert the object into a dict
core_competency_create_plan200_response_template_dict = core_competency_create_plan200_response_template_instance.to_dict()
# create an instance of CoreCompetencyCreatePlan200ResponseTemplate from a dict
core_competency_create_plan200_response_template_from_dict = CoreCompetencyCreatePlan200ResponseTemplate.from_dict(core_competency_create_plan200_response_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



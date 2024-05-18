# CoreCompetencyCreateTemplate200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | canmanage | 
**canread** | **bool** | canread | 
**cohortscount** | **int** | cohortscount | 
**contextid** | **int** | contextid | 
**contextname** | **str** | contextname | 
**contextnamenoprefix** | **str** | contextnamenoprefix | 
**description** | **str** | description | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [default to 0]
**duedateformatted** | **str** | duedateformatted | 
**id** | **int** | id | [default to 0]
**planscount** | **int** | planscount | 
**shortname** | **str** | shortname | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**usermodified** | **int** | usermodified | [default to 0]
**visible** | **bool** | visible | [default to False]

## Example

```python
from openapi_client.models.core_competency_create_template200_response import CoreCompetencyCreateTemplate200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreateTemplate200Response from a JSON string
core_competency_create_template200_response_instance = CoreCompetencyCreateTemplate200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreateTemplate200Response.to_json())

# convert the object into a dict
core_competency_create_template200_response_dict = core_competency_create_template200_response_instance.to_dict()
# create an instance of CoreCompetencyCreateTemplate200Response from a dict
core_competency_create_template200_response_from_dict = CoreCompetencyCreateTemplate200Response.from_dict(core_competency_create_template200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



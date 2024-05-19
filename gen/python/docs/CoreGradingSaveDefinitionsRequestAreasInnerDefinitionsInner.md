# CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copiedfromid** | **int** | copied from id | [optional] 
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**guide** | [**CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide**](CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide.md) |  | [optional] 
**id** | **int** | definition id | [optional] 
**method** | **str** | method | [optional] 
**name** | **str** | name | [optional] 
**rubric** | [**CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric**](CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.md) |  | [optional] 
**status** | **int** | status | [optional] 
**timecopied** | **int** | time copied | [optional] 
**timecreated** | **int** | creation time | [optional] 
**timemodified** | **int** | last modified time | [optional] 
**usercreated** | **int** | user who created definition | [optional] 
**usermodified** | **int** | user who modified definition | [optional] 

## Example

```python
from openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner import CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner from a JSON string
core_grading_save_definitions_request_areas_inner_definitions_inner_instance = CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner.to_json())

# convert the object into a dict
core_grading_save_definitions_request_areas_inner_definitions_inner_dict = core_grading_save_definitions_request_areas_inner_definitions_inner_instance.to_dict()
# create an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner from a dict
core_grading_save_definitions_request_areas_inner_definitions_inner_from_dict = CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner.from_dict(core_grading_save_definitions_request_areas_inner_definitions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**id** | **int** | criterion id | [optional] 
**levels** | [**List[CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner]**](CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner.md) |  | [optional] 
**sortorder** | **int** | sortorder | [optional] 

## Example

```python
from openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner import CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner from a JSON string
core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_instance = CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner.to_json())

# convert the object into a dict
core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_dict = core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_instance.to_dict()
# create an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner from a dict
core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_from_dict = CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner.from_dict(core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



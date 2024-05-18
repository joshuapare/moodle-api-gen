# CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**descriptionmarkers** | **str** | markers description | [optional] 
**descriptionmarkersformat** | **int** | descriptionmarkers format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**id** | **int** | criterion id | [optional] 
**maxscore** | **float** | maximum score | [optional] 
**shortname** | **str** | description | [optional] 
**sortorder** | **int** | sortorder | [optional] 

## Example

```python
from openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner import CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner from a JSON string
core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner_instance = CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner.to_json())

# convert the object into a dict
core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner_dict = core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner_instance.to_dict()
# create an instance of CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner from a dict
core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner_from_dict = CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner.from_dict(core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



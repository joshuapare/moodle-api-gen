# CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**descriptionmarkers** | **str** | markers description | [optional] [default to 'null']
**descriptionmarkersformat** | **int** | descriptionmarkers format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**id** | **int** | criterion id | [optional] 
**maxscore** | **float** | maximum score | [optional] [default to null]
**shortname** | **str** | description | [optional] 
**sortorder** | **int** | sortorder | [optional] 

## Example

```python
from openapi_client.models.core_grading_get_definitions200_response_areas_inner_definitions_inner_guide_guide_criteria_inner import CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner from a JSON string
core_grading_get_definitions200_response_areas_inner_definitions_inner_guide_guide_criteria_inner_instance = CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner.to_json())

# convert the object into a dict
core_grading_get_definitions200_response_areas_inner_definitions_inner_guide_guide_criteria_inner_dict = core_grading_get_definitions200_response_areas_inner_definitions_inner_guide_guide_criteria_inner_instance.to_dict()
# create an instance of CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner from a dict
core_grading_get_definitions200_response_areas_inner_definitions_inner_guide_guide_criteria_inner_from_dict = CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner.from_dict(core_grading_get_definitions200_response_areas_inner_definitions_inner_guide_guide_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



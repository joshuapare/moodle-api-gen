# CoreGradingSaveDefinitionsRequestAreasInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activemethod** | **str** | active method | [optional] 
**areaname** | **str** | area name | [optional] 
**cmid** | **int** | course module id | [optional] 
**component** | **str** | component name | [optional] 
**contextid** | **int** | context id | [optional] 
**definitions** | [**List[CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner]**](CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grading_save_definitions_request_areas_inner import CoreGradingSaveDefinitionsRequestAreasInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingSaveDefinitionsRequestAreasInner from a JSON string
core_grading_save_definitions_request_areas_inner_instance = CoreGradingSaveDefinitionsRequestAreasInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingSaveDefinitionsRequestAreasInner.to_json())

# convert the object into a dict
core_grading_save_definitions_request_areas_inner_dict = core_grading_save_definitions_request_areas_inner_instance.to_dict()
# create an instance of CoreGradingSaveDefinitionsRequestAreasInner from a dict
core_grading_save_definitions_request_areas_inner_from_dict = CoreGradingSaveDefinitionsRequestAreasInner.from_dict(core_grading_save_definitions_request_areas_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



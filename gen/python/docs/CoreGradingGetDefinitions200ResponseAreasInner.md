# CoreGradingGetDefinitions200ResponseAreasInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activemethod** | **str** | active method | [optional] [default to 'null']
**areaname** | **str** | area name | [optional] 
**cmid** | **int** | course module id | [optional] 
**component** | **str** | component name | [optional] [default to 'null']
**contextid** | **int** | context id | [optional] 
**definitions** | [**List[CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner]**](CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grading_get_definitions200_response_areas_inner import CoreGradingGetDefinitions200ResponseAreasInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetDefinitions200ResponseAreasInner from a JSON string
core_grading_get_definitions200_response_areas_inner_instance = CoreGradingGetDefinitions200ResponseAreasInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetDefinitions200ResponseAreasInner.to_json())

# convert the object into a dict
core_grading_get_definitions200_response_areas_inner_dict = core_grading_get_definitions200_response_areas_inner_instance.to_dict()
# create an instance of CoreGradingGetDefinitions200ResponseAreasInner from a dict
core_grading_get_definitions200_response_areas_inner_from_dict = CoreGradingGetDefinitions200ResponseAreasInner.from_dict(core_grading_get_definitions200_response_areas_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



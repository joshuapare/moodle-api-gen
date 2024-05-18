# CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copiedfromid** | **int** | copied from id | [optional] [default to null]
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**guide** | [**CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide**](CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide.md) |  | [optional] 
**id** | **int** | definition id | [optional] [default to null]
**method** | **str** | method | [optional] [default to 'null']
**name** | **str** | name | [optional] 
**rubric** | [**CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric**](CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric.md) |  | [optional] 
**status** | **int** | status | [optional] [default to null]
**timecopied** | **int** | time copied | [optional] [default to null]
**timecreated** | **int** | creation time | [optional] [default to null]
**timemodified** | **int** | last modified time | [optional] [default to null]
**usercreated** | **int** | user who created definition | [optional] [default to null]
**usermodified** | **int** | user who modified definition | [optional] [default to null]

## Example

```python
from openapi_client.models.core_grading_get_definitions200_response_areas_inner_definitions_inner import CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner from a JSON string
core_grading_get_definitions200_response_areas_inner_definitions_inner_instance = CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner.to_json())

# convert the object into a dict
core_grading_get_definitions200_response_areas_inner_definitions_inner_dict = core_grading_get_definitions200_response_areas_inner_definitions_inner_instance.to_dict()
# create an instance of CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner from a dict
core_grading_get_definitions200_response_areas_inner_definitions_inner_from_dict = CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner.from_dict(core_grading_get_definitions200_response_areas_inner_definitions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



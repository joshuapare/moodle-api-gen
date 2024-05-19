# CoreTagGetTagAreas200ResponseAreasInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callback** | **str** | Component callback for processing tags. | [optional] [default to 'null']
**callbackfile** | **str** | Component callback file. | [optional] [default to 'null']
**component** | **str** | Component the area is related to. | [optional] [default to 'null']
**enabled** | **bool** | Whether this area is enabled. | [optional] [default to True]
**id** | **int** | Area id. | [optional] [default to null]
**itemtype** | **str** | Type of item in the component. | [optional] [default to 'null']
**locked** | **bool** | Whether the area is locked. | [optional] [default to False]
**multiplecontexts** | **bool** | Whether the tag area allows tag instances to be created in multiple contexts.  | [optional] [default to False]
**showstandard** | **int** | Return whether to display only standard, only non-standard or both tags. | [optional] [default to 0]
**tagcollid** | **int** | The tag collection this are belongs to. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_tag_get_tag_areas200_response_areas_inner import CoreTagGetTagAreas200ResponseAreasInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagAreas200ResponseAreasInner from a JSON string
core_tag_get_tag_areas200_response_areas_inner_instance = CoreTagGetTagAreas200ResponseAreasInner.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagAreas200ResponseAreasInner.to_json())

# convert the object into a dict
core_tag_get_tag_areas200_response_areas_inner_dict = core_tag_get_tag_areas200_response_areas_inner_instance.to_dict()
# create an instance of CoreTagGetTagAreas200ResponseAreasInner from a dict
core_tag_get_tag_areas200_response_areas_inner_from_dict = CoreTagGetTagAreas200ResponseAreasInner.from_dict(core_tag_get_tag_areas200_response_areas_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



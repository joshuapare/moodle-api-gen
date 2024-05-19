# CoreSearchGetSearchAreasList200ResponseAreasInner

Search area

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **str** | category id | [optional] [default to 'null']
**categoryname** | **str** | category name | [optional] 
**id** | **str** | search area id | [optional] [default to 'null']
**name** | **str** | search area name | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_search_get_search_areas_list200_response_areas_inner import CoreSearchGetSearchAreasList200ResponseAreasInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetSearchAreasList200ResponseAreasInner from a JSON string
core_search_get_search_areas_list200_response_areas_inner_instance = CoreSearchGetSearchAreasList200ResponseAreasInner.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetSearchAreasList200ResponseAreasInner.to_json())

# convert the object into a dict
core_search_get_search_areas_list200_response_areas_inner_dict = core_search_get_search_areas_list200_response_areas_inner_instance.to_dict()
# create an instance of CoreSearchGetSearchAreasList200ResponseAreasInner from a dict
core_search_get_search_areas_list200_response_areas_inner_from_dict = CoreSearchGetSearchAreasList200ResponseAreasInner.from_dict(core_search_get_search_areas_list200_response_areas_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



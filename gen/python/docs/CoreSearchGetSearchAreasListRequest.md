# CoreSearchGetSearchAreasListRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cat** | **str** | category to filter areas | [optional] [default to '']

## Example

```python
from openapi_client.models.core_search_get_search_areas_list_request import CoreSearchGetSearchAreasListRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreSearchGetSearchAreasListRequest from a JSON string
core_search_get_search_areas_list_request_instance = CoreSearchGetSearchAreasListRequest.from_json(json)
# print the JSON string representation of the object
print(CoreSearchGetSearchAreasListRequest.to_json())

# convert the object into a dict
core_search_get_search_areas_list_request_dict = core_search_get_search_areas_list_request_instance.to_dict()
# create an instance of CoreSearchGetSearchAreasListRequest from a dict
core_search_get_search_areas_list_request_from_dict = CoreSearchGetSearchAreasListRequest.from_dict(core_search_get_search_areas_list_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



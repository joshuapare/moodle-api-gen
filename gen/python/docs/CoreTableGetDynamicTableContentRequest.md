# CoreTableGetDynamicTableContentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | Component | 
**filters** | [**List[CoreTableGetDynamicTableContentRequestFiltersInner]**](CoreTableGetDynamicTableContentRequestFiltersInner.md) |  | [optional] 
**firstinitial** | **str** | The first initial to sort filter on | [default to 'null']
**handler** | **str** | Handler | [default to 'null']
**hiddencolumns** | **List[object]** |  | 
**jointype** | **int** | Type of join to join all filters together | [default to null]
**lastinitial** | **str** | The last initial to sort filter on | [default to 'null']
**pagenumber** | **int** | The page number | [default to null]
**pagesize** | **int** | The number of records per page | [default to null]
**resetpreferences** | **bool** | Whether the table preferences should be reset | [default to False]
**sortdata** | [**List[CoreTableGetDynamicTableContentRequestSortdataInner]**](CoreTableGetDynamicTableContentRequestSortdataInner.md) |  | [optional] 
**uniqueid** | **str** | Unique ID for the container | [default to 'null']

## Example

```python
from openapi_client.models.core_table_get_dynamic_table_content_request import CoreTableGetDynamicTableContentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTableGetDynamicTableContentRequest from a JSON string
core_table_get_dynamic_table_content_request_instance = CoreTableGetDynamicTableContentRequest.from_json(json)
# print the JSON string representation of the object
print(CoreTableGetDynamicTableContentRequest.to_json())

# convert the object into a dict
core_table_get_dynamic_table_content_request_dict = core_table_get_dynamic_table_content_request_instance.to_dict()
# create an instance of CoreTableGetDynamicTableContentRequest from a dict
core_table_get_dynamic_table_content_request_from_dict = CoreTableGetDynamicTableContentRequest.from_dict(core_table_get_dynamic_table_content_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



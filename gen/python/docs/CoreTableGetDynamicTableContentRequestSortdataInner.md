# CoreTableGetDynamicTableContentRequestSortdataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sortby** | **str** | The name of a sortable column | [optional] [default to 'null']
**sortorder** | **str** | The direction that this column should be sorted by | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_table_get_dynamic_table_content_request_sortdata_inner import CoreTableGetDynamicTableContentRequestSortdataInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTableGetDynamicTableContentRequestSortdataInner from a JSON string
core_table_get_dynamic_table_content_request_sortdata_inner_instance = CoreTableGetDynamicTableContentRequestSortdataInner.from_json(json)
# print the JSON string representation of the object
print(CoreTableGetDynamicTableContentRequestSortdataInner.to_json())

# convert the object into a dict
core_table_get_dynamic_table_content_request_sortdata_inner_dict = core_table_get_dynamic_table_content_request_sortdata_inner_instance.to_dict()
# create an instance of CoreTableGetDynamicTableContentRequestSortdataInner from a dict
core_table_get_dynamic_table_content_request_sortdata_inner_from_dict = CoreTableGetDynamicTableContentRequestSortdataInner.from_dict(core_table_get_dynamic_table_content_request_sortdata_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



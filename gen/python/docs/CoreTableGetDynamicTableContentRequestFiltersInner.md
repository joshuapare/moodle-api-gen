# CoreTableGetDynamicTableContentRequestFiltersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filteroptions** | [**List[CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner]**](CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner.md) |  | [optional] 
**jointype** | **int** | Type of join for filter values | [optional] [default to null]
**name** | **str** | Name of the filter | [optional] [default to 'null']
**values** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.core_table_get_dynamic_table_content_request_filters_inner import CoreTableGetDynamicTableContentRequestFiltersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTableGetDynamicTableContentRequestFiltersInner from a JSON string
core_table_get_dynamic_table_content_request_filters_inner_instance = CoreTableGetDynamicTableContentRequestFiltersInner.from_json(json)
# print the JSON string representation of the object
print(CoreTableGetDynamicTableContentRequestFiltersInner.to_json())

# convert the object into a dict
core_table_get_dynamic_table_content_request_filters_inner_dict = core_table_get_dynamic_table_content_request_filters_inner_instance.to_dict()
# create an instance of CoreTableGetDynamicTableContentRequestFiltersInner from a dict
core_table_get_dynamic_table_content_request_filters_inner_from_dict = CoreTableGetDynamicTableContentRequestFiltersInner.from_dict(core_table_get_dynamic_table_content_request_filters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



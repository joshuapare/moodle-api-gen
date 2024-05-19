# CoreReportbuilderColumnsSortReorderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnid** | **int** | Column ID | 
**position** | **int** | New column sort position | [default to null]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_columns_sort_reorder_request import CoreReportbuilderColumnsSortReorderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsSortReorderRequest from a JSON string
core_reportbuilder_columns_sort_reorder_request_instance = CoreReportbuilderColumnsSortReorderRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsSortReorderRequest.to_json())

# convert the object into a dict
core_reportbuilder_columns_sort_reorder_request_dict = core_reportbuilder_columns_sort_reorder_request_instance.to_dict()
# create an instance of CoreReportbuilderColumnsSortReorderRequest from a dict
core_reportbuilder_columns_sort_reorder_request_from_dict = CoreReportbuilderColumnsSortReorderRequest.from_dict(core_reportbuilder_columns_sort_reorder_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreReportbuilderColumnsReorderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnid** | **int** | Column ID | 
**position** | **int** | New column position | [default to null]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_columns_reorder_request import CoreReportbuilderColumnsReorderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsReorderRequest from a JSON string
core_reportbuilder_columns_reorder_request_instance = CoreReportbuilderColumnsReorderRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsReorderRequest.to_json())

# convert the object into a dict
core_reportbuilder_columns_reorder_request_dict = core_reportbuilder_columns_reorder_request_instance.to_dict()
# create an instance of CoreReportbuilderColumnsReorderRequest from a dict
core_reportbuilder_columns_reorder_request_from_dict = CoreReportbuilderColumnsReorderRequest.from_dict(core_reportbuilder_columns_reorder_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



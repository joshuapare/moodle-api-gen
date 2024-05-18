# CoreReportbuilderColumnsDeleteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnid** | **int** | Column ID | [default to null]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_columns_delete_request import CoreReportbuilderColumnsDeleteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsDeleteRequest from a JSON string
core_reportbuilder_columns_delete_request_instance = CoreReportbuilderColumnsDeleteRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsDeleteRequest.to_json())

# convert the object into a dict
core_reportbuilder_columns_delete_request_dict = core_reportbuilder_columns_delete_request_instance.to_dict()
# create an instance of CoreReportbuilderColumnsDeleteRequest from a dict
core_reportbuilder_columns_delete_request_from_dict = CoreReportbuilderColumnsDeleteRequest.from_dict(core_reportbuilder_columns_delete_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



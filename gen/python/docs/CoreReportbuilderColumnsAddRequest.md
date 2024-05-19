# CoreReportbuilderColumnsAddRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportid** | **int** | Report ID | [default to null]
**uniqueidentifier** | **str** | Unique identifier of the column | [default to 'null']

## Example

```python
from openapi_client.models.core_reportbuilder_columns_add_request import CoreReportbuilderColumnsAddRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsAddRequest from a JSON string
core_reportbuilder_columns_add_request_instance = CoreReportbuilderColumnsAddRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsAddRequest.to_json())

# convert the object into a dict
core_reportbuilder_columns_add_request_dict = core_reportbuilder_columns_add_request_instance.to_dict()
# create an instance of CoreReportbuilderColumnsAddRequest from a dict
core_reportbuilder_columns_add_request_from_dict = CoreReportbuilderColumnsAddRequest.from_dict(core_reportbuilder_columns_add_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



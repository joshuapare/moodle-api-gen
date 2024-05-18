# CoreReportbuilderColumnsSortToggleRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnid** | **int** | Column ID | 
**direction** | **int** | Sort direction | [optional] [default to 4]
**enabled** | **bool** | Sort enabled | [default to False]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_columns_sort_toggle_request import CoreReportbuilderColumnsSortToggleRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsSortToggleRequest from a JSON string
core_reportbuilder_columns_sort_toggle_request_instance = CoreReportbuilderColumnsSortToggleRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsSortToggleRequest.to_json())

# convert the object into a dict
core_reportbuilder_columns_sort_toggle_request_dict = core_reportbuilder_columns_sort_toggle_request_instance.to_dict()
# create an instance of CoreReportbuilderColumnsSortToggleRequest from a dict
core_reportbuilder_columns_sort_toggle_request_from_dict = CoreReportbuilderColumnsSortToggleRequest.from_dict(core_reportbuilder_columns_sort_toggle_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



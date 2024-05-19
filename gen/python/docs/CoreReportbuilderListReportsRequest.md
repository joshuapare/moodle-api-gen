# CoreReportbuilderListReportsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **int** | Page number | [optional] [default to 0]
**perpage** | **int** | Reports per page | [optional] [default to 10]

## Example

```python
from openapi_client.models.core_reportbuilder_list_reports_request import CoreReportbuilderListReportsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderListReportsRequest from a JSON string
core_reportbuilder_list_reports_request_instance = CoreReportbuilderListReportsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderListReportsRequest.to_json())

# convert the object into a dict
core_reportbuilder_list_reports_request_dict = core_reportbuilder_list_reports_request_instance.to_dict()
# create an instance of CoreReportbuilderListReportsRequest from a dict
core_reportbuilder_list_reports_request_from_dict = CoreReportbuilderListReportsRequest.from_dict(core_reportbuilder_list_reports_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreReportbuilderReportsGetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**editmode** | **bool** | Whether editing mode is enabled | [optional] [default to False]
**pagesize** | **int** | Page size | [optional] [default to 0]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_reports_get_request import CoreReportbuilderReportsGetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderReportsGetRequest from a JSON string
core_reportbuilder_reports_get_request_instance = CoreReportbuilderReportsGetRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderReportsGetRequest.to_json())

# convert the object into a dict
core_reportbuilder_reports_get_request_dict = core_reportbuilder_reports_get_request_instance.to_dict()
# create an instance of CoreReportbuilderReportsGetRequest from a dict
core_reportbuilder_reports_get_request_from_dict = CoreReportbuilderReportsGetRequest.from_dict(core_reportbuilder_reports_get_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



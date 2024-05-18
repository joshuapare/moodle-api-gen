# CoreReportbuilderRetrieveReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **int** | Page number | [optional] [default to 0]
**perpage** | **int** | Reports per page | [optional] [default to 10]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_retrieve_report_request import CoreReportbuilderRetrieveReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderRetrieveReportRequest from a JSON string
core_reportbuilder_retrieve_report_request_instance = CoreReportbuilderRetrieveReportRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderRetrieveReportRequest.to_json())

# convert the object into a dict
core_reportbuilder_retrieve_report_request_dict = core_reportbuilder_retrieve_report_request_instance.to_dict()
# create an instance of CoreReportbuilderRetrieveReportRequest from a dict
core_reportbuilder_retrieve_report_request_from_dict = CoreReportbuilderRetrieveReportRequest.from_dict(core_reportbuilder_retrieve_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



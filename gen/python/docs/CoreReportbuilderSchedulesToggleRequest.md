# CoreReportbuilderSchedulesToggleRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** | Schedule enabled | [default to False]
**reportid** | **int** | Report ID | 
**scheduleid** | **int** | Schedule ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_schedules_toggle_request import CoreReportbuilderSchedulesToggleRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderSchedulesToggleRequest from a JSON string
core_reportbuilder_schedules_toggle_request_instance = CoreReportbuilderSchedulesToggleRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderSchedulesToggleRequest.to_json())

# convert the object into a dict
core_reportbuilder_schedules_toggle_request_dict = core_reportbuilder_schedules_toggle_request_instance.to_dict()
# create an instance of CoreReportbuilderSchedulesToggleRequest from a dict
core_reportbuilder_schedules_toggle_request_from_dict = CoreReportbuilderSchedulesToggleRequest.from_dict(core_reportbuilder_schedules_toggle_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



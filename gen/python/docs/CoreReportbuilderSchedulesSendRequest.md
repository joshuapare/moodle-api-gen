# CoreReportbuilderSchedulesSendRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportid** | **int** | Report ID | 
**scheduleid** | **int** | Schedule ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_schedules_send_request import CoreReportbuilderSchedulesSendRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderSchedulesSendRequest from a JSON string
core_reportbuilder_schedules_send_request_instance = CoreReportbuilderSchedulesSendRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderSchedulesSendRequest.to_json())

# convert the object into a dict
core_reportbuilder_schedules_send_request_dict = core_reportbuilder_schedules_send_request_instance.to_dict()
# create an instance of CoreReportbuilderSchedulesSendRequest from a dict
core_reportbuilder_schedules_send_request_from_dict = CoreReportbuilderSchedulesSendRequest.from_dict(core_reportbuilder_schedules_send_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



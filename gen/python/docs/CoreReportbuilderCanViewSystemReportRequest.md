# CoreReportbuilderCanViewSystemReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | Report area | [optional] [default to '']
**component** | **str** | Report component | [optional] [default to '']
**context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**itemid** | **int** | Report item ID | [optional] [default to 0]
**parameters** | [**List[CoreReportbuilderCanViewSystemReportRequestParametersInner]**](CoreReportbuilderCanViewSystemReportRequestParametersInner.md) |  | [optional] 
**source** | **str** | Report class path | [default to 'null']

## Example

```python
from openapi_client.models.core_reportbuilder_can_view_system_report_request import CoreReportbuilderCanViewSystemReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderCanViewSystemReportRequest from a JSON string
core_reportbuilder_can_view_system_report_request_instance = CoreReportbuilderCanViewSystemReportRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderCanViewSystemReportRequest.to_json())

# convert the object into a dict
core_reportbuilder_can_view_system_report_request_dict = core_reportbuilder_can_view_system_report_request_instance.to_dict()
# create an instance of CoreReportbuilderCanViewSystemReportRequest from a dict
core_reportbuilder_can_view_system_report_request_from_dict = CoreReportbuilderCanViewSystemReportRequest.from_dict(core_reportbuilder_can_view_system_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



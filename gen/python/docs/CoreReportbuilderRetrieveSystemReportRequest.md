# CoreReportbuilderRetrieveSystemReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | Report area | [optional] [default to '']
**component** | **str** | Report component | [optional] [default to '']
**context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**itemid** | **int** | Report item ID | [optional] [default to 0]
**page** | **int** | Page number | [optional] [default to 0]
**parameters** | [**List[CoreReportbuilderCanViewSystemReportRequestParametersInner]**](CoreReportbuilderCanViewSystemReportRequestParametersInner.md) |  | [optional] 
**perpage** | **int** | Reports per page | [optional] [default to 10]
**source** | **str** | Report class path | 

## Example

```python
from openapi_client.models.core_reportbuilder_retrieve_system_report_request import CoreReportbuilderRetrieveSystemReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderRetrieveSystemReportRequest from a JSON string
core_reportbuilder_retrieve_system_report_request_instance = CoreReportbuilderRetrieveSystemReportRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderRetrieveSystemReportRequest.to_json())

# convert the object into a dict
core_reportbuilder_retrieve_system_report_request_dict = core_reportbuilder_retrieve_system_report_request_instance.to_dict()
# create an instance of CoreReportbuilderRetrieveSystemReportRequest from a dict
core_reportbuilder_retrieve_system_report_request_from_dict = CoreReportbuilderRetrieveSystemReportRequest.from_dict(core_reportbuilder_retrieve_system_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreReportbuilderFiltersResetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameters** | **str** | JSON encoded report parameters | [optional] [default to '']
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_filters_reset_request import CoreReportbuilderFiltersResetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderFiltersResetRequest from a JSON string
core_reportbuilder_filters_reset_request_instance = CoreReportbuilderFiltersResetRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderFiltersResetRequest.to_json())

# convert the object into a dict
core_reportbuilder_filters_reset_request_dict = core_reportbuilder_filters_reset_request_instance.to_dict()
# create an instance of CoreReportbuilderFiltersResetRequest from a dict
core_reportbuilder_filters_reset_request_from_dict = CoreReportbuilderFiltersResetRequest.from_dict(core_reportbuilder_filters_reset_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



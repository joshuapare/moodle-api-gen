# CoreReportbuilderFiltersReorderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterid** | **int** | Filter ID | 
**position** | **int** | New filter position | [default to null]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_filters_reorder_request import CoreReportbuilderFiltersReorderRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderFiltersReorderRequest from a JSON string
core_reportbuilder_filters_reorder_request_instance = CoreReportbuilderFiltersReorderRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderFiltersReorderRequest.to_json())

# convert the object into a dict
core_reportbuilder_filters_reorder_request_dict = core_reportbuilder_filters_reorder_request_instance.to_dict()
# create an instance of CoreReportbuilderFiltersReorderRequest from a dict
core_reportbuilder_filters_reorder_request_from_dict = CoreReportbuilderFiltersReorderRequest.from_dict(core_reportbuilder_filters_reorder_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



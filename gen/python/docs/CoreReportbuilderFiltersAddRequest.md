# CoreReportbuilderFiltersAddRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportid** | **int** | Report ID | 
**uniqueidentifier** | **str** | Unique identifier of the filter | [default to 'null']

## Example

```python
from openapi_client.models.core_reportbuilder_filters_add_request import CoreReportbuilderFiltersAddRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderFiltersAddRequest from a JSON string
core_reportbuilder_filters_add_request_instance = CoreReportbuilderFiltersAddRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderFiltersAddRequest.to_json())

# convert the object into a dict
core_reportbuilder_filters_add_request_dict = core_reportbuilder_filters_add_request_instance.to_dict()
# create an instance of CoreReportbuilderFiltersAddRequest from a dict
core_reportbuilder_filters_add_request_from_dict = CoreReportbuilderFiltersAddRequest.from_dict(core_reportbuilder_filters_add_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



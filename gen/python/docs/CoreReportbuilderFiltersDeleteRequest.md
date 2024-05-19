# CoreReportbuilderFiltersDeleteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterid** | **int** | Filter ID | [default to null]
**reportid** | **int** | Report ID | 

## Example

```python
from openapi_client.models.core_reportbuilder_filters_delete_request import CoreReportbuilderFiltersDeleteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderFiltersDeleteRequest from a JSON string
core_reportbuilder_filters_delete_request_instance = CoreReportbuilderFiltersDeleteRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderFiltersDeleteRequest.to_json())

# convert the object into a dict
core_reportbuilder_filters_delete_request_dict = core_reportbuilder_filters_delete_request_instance.to_dict()
# create an instance of CoreReportbuilderFiltersDeleteRequest from a dict
core_reportbuilder_filters_delete_request_from_dict = CoreReportbuilderFiltersDeleteRequest.from_dict(core_reportbuilder_filters_delete_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



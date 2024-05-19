# CoreReportbuilderSetFiltersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameters** | **str** | JSON encoded report parameters | [optional] [default to '']
**reportid** | **int** | Report ID | 
**values** | **str** | JSON encoded filter values | [default to 'null']

## Example

```python
from openapi_client.models.core_reportbuilder_set_filters_request import CoreReportbuilderSetFiltersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderSetFiltersRequest from a JSON string
core_reportbuilder_set_filters_request_instance = CoreReportbuilderSetFiltersRequest.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderSetFiltersRequest.to_json())

# convert the object into a dict
core_reportbuilder_set_filters_request_dict = core_reportbuilder_set_filters_request_instance.to_dict()
# create an instance of CoreReportbuilderSetFiltersRequest from a dict
core_reportbuilder_set_filters_request_from_dict = CoreReportbuilderSetFiltersRequest.from_dict(core_reportbuilder_set_filters_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



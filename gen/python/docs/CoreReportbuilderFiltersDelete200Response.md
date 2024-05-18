# CoreReportbuilderFiltersDelete200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activefilters** | [**List[CoreReportbuilderFiltersDelete200ResponseActivefiltersInner]**](CoreReportbuilderFiltersDelete200ResponseActivefiltersInner.md) |  | 
**availablefilters** | [**List[CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner]**](CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner.md) |  | 
**hasactivefilters** | **bool** | hasactivefilters | 
**hasavailablefilters** | **bool** | hasavailablefilters | 
**helpicon** | **str** | helpicon | 

## Example

```python
from openapi_client.models.core_reportbuilder_filters_delete200_response import CoreReportbuilderFiltersDelete200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderFiltersDelete200Response from a JSON string
core_reportbuilder_filters_delete200_response_instance = CoreReportbuilderFiltersDelete200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderFiltersDelete200Response.to_json())

# convert the object into a dict
core_reportbuilder_filters_delete200_response_dict = core_reportbuilder_filters_delete200_response_instance.to_dict()
# create an instance of CoreReportbuilderFiltersDelete200Response from a dict
core_reportbuilder_filters_delete200_response_from_dict = CoreReportbuilderFiltersDelete200Response.from_dict(core_reportbuilder_filters_delete200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



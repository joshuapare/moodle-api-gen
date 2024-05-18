# CoreReportbuilderFiltersAdd200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activefilters** | [**List[CoreReportbuilderFiltersAdd200ResponseActivefiltersInner]**](CoreReportbuilderFiltersAdd200ResponseActivefiltersInner.md) |  | 
**availablefilters** | [**List[CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner]**](CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner.md) |  | 
**hasactivefilters** | **bool** | hasactivefilters | [default to False]
**hasavailablefilters** | **bool** | hasavailablefilters | [default to False]
**helpicon** | **str** | helpicon | 

## Example

```python
from openapi_client.models.core_reportbuilder_filters_add200_response import CoreReportbuilderFiltersAdd200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderFiltersAdd200Response from a JSON string
core_reportbuilder_filters_add200_response_instance = CoreReportbuilderFiltersAdd200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderFiltersAdd200Response.to_json())

# convert the object into a dict
core_reportbuilder_filters_add200_response_dict = core_reportbuilder_filters_add200_response_instance.to_dict()
# create an instance of CoreReportbuilderFiltersAdd200Response from a dict
core_reportbuilder_filters_add200_response_from_dict = CoreReportbuilderFiltersAdd200Response.from_dict(core_reportbuilder_filters_add200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



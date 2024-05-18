# CoreReportbuilderConditionsAdd200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeconditionsform** | **str** | activeconditionsform | [default to 'null']
**availableconditions** | [**List[CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner]**](CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner.md) |  | 
**hasactiveconditions** | **bool** | hasactiveconditions | [default to False]
**hasavailableconditions** | **bool** | hasavailableconditions | [default to False]
**helpicon** | **str** | helpicon | 
**javascript** | **str** | javascript | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_reportbuilder_conditions_add200_response import CoreReportbuilderConditionsAdd200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderConditionsAdd200Response from a JSON string
core_reportbuilder_conditions_add200_response_instance = CoreReportbuilderConditionsAdd200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderConditionsAdd200Response.to_json())

# convert the object into a dict
core_reportbuilder_conditions_add200_response_dict = core_reportbuilder_conditions_add200_response_instance.to_dict()
# create an instance of CoreReportbuilderConditionsAdd200Response from a dict
core_reportbuilder_conditions_add200_response_from_dict = CoreReportbuilderConditionsAdd200Response.from_dict(core_reportbuilder_conditions_add200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreReportbuilderConditionsDelete200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeconditionsform** | **str** | activeconditionsform | 
**availableconditions** | [**List[CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner]**](CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner.md) |  | 
**hasactiveconditions** | **bool** | hasactiveconditions | 
**hasavailableconditions** | **bool** | hasavailableconditions | 
**helpicon** | **str** | helpicon | 
**javascript** | **str** | javascript | [optional] 

## Example

```python
from openapi_client.models.core_reportbuilder_conditions_delete200_response import CoreReportbuilderConditionsDelete200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderConditionsDelete200Response from a JSON string
core_reportbuilder_conditions_delete200_response_instance = CoreReportbuilderConditionsDelete200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderConditionsDelete200Response.to_json())

# convert the object into a dict
core_reportbuilder_conditions_delete200_response_dict = core_reportbuilder_conditions_delete200_response_instance.to_dict()
# create an instance of CoreReportbuilderConditionsDelete200Response from a dict
core_reportbuilder_conditions_delete200_response_from_dict = CoreReportbuilderConditionsDelete200Response.from_dict(core_reportbuilder_conditions_delete200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



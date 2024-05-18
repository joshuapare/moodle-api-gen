# CoreFiltersGetAvailableInContext200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[CoreFiltersGetAvailableInContext200ResponseFiltersInner]**](CoreFiltersGetAvailableInContext200ResponseFiltersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_filters_get_available_in_context200_response import CoreFiltersGetAvailableInContext200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFiltersGetAvailableInContext200Response from a JSON string
core_filters_get_available_in_context200_response_instance = CoreFiltersGetAvailableInContext200Response.from_json(json)
# print the JSON string representation of the object
print(CoreFiltersGetAvailableInContext200Response.to_json())

# convert the object into a dict
core_filters_get_available_in_context200_response_dict = core_filters_get_available_in_context200_response_instance.to_dict()
# create an instance of CoreFiltersGetAvailableInContext200Response from a dict
core_filters_get_available_in_context200_response_from_dict = CoreFiltersGetAvailableInContext200Response.from_dict(core_filters_get_available_in_context200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



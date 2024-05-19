# CoreGradingGetDefinitions200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areas** | [**List[CoreGradingGetDefinitions200ResponseAreasInner]**](CoreGradingGetDefinitions200ResponseAreasInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grading_get_definitions200_response import CoreGradingGetDefinitions200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetDefinitions200Response from a JSON string
core_grading_get_definitions200_response_instance = CoreGradingGetDefinitions200Response.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetDefinitions200Response.to_json())

# convert the object into a dict
core_grading_get_definitions200_response_dict = core_grading_get_definitions200_response_instance.to_dict()
# create an instance of CoreGradingGetDefinitions200Response from a dict
core_grading_get_definitions200_response_from_dict = CoreGradingGetDefinitions200Response.from_dict(core_grading_get_definitions200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



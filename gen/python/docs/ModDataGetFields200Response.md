# ModDataGetFields200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List[ModDataGetFields200ResponseFieldsInner]**](ModDataGetFields200ResponseFieldsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_get_fields200_response import ModDataGetFields200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetFields200Response from a JSON string
mod_data_get_fields200_response_instance = ModDataGetFields200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataGetFields200Response.to_json())

# convert the object into a dict
mod_data_get_fields200_response_dict = mod_data_get_fields200_response_instance.to_dict()
# create an instance of ModDataGetFields200Response from a dict
mod_data_get_fields200_response_from_dict = ModDataGetFields200Response.from_dict(mod_data_get_fields200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModDataGetMappingInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**ModDataGetMappingInformation200ResponseData**](ModDataGetMappingInformation200ResponseData.md) |  | [optional] 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_get_mapping_information200_response import ModDataGetMappingInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetMappingInformation200Response from a JSON string
mod_data_get_mapping_information200_response_instance = ModDataGetMappingInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataGetMappingInformation200Response.to_json())

# convert the object into a dict
mod_data_get_mapping_information200_response_dict = mod_data_get_mapping_information200_response_instance.to_dict()
# create an instance of ModDataGetMappingInformation200Response from a dict
mod_data_get_mapping_information200_response_from_dict = ModDataGetMappingInformation200Response.from_dict(mod_data_get_mapping_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



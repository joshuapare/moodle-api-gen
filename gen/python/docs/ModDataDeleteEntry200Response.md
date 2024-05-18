# ModDataDeleteEntry200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | Always true. If we see this field it means that the entry was deleted. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_delete_entry200_response import ModDataDeleteEntry200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataDeleteEntry200Response from a JSON string
mod_data_delete_entry200_response_instance = ModDataDeleteEntry200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataDeleteEntry200Response.to_json())

# convert the object into a dict
mod_data_delete_entry200_response_dict = mod_data_delete_entry200_response_instance.to_dict()
# create an instance of ModDataDeleteEntry200Response from a dict
mod_data_delete_entry200_response_from_dict = ModDataDeleteEntry200Response.from_dict(mod_data_delete_entry200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



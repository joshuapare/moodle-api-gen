# ModDataUpdateEntry200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldnotifications** | [**List[ModDataUpdateEntry200ResponseFieldnotificationsInner]**](ModDataUpdateEntry200ResponseFieldnotificationsInner.md) |  | 
**generalnotifications** | **List[object]** |  | 
**updated** | **bool** | True if the entry was successfully updated, false other wise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_update_entry200_response import ModDataUpdateEntry200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataUpdateEntry200Response from a JSON string
mod_data_update_entry200_response_instance = ModDataUpdateEntry200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataUpdateEntry200Response.to_json())

# convert the object into a dict
mod_data_update_entry200_response_dict = mod_data_update_entry200_response_instance.to_dict()
# create an instance of ModDataUpdateEntry200Response from a dict
mod_data_update_entry200_response_from_dict = ModDataUpdateEntry200Response.from_dict(mod_data_update_entry200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



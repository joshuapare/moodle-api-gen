# ModDataAddEntry200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldnotifications** | [**List[ModDataAddEntry200ResponseFieldnotificationsInner]**](ModDataAddEntry200ResponseFieldnotificationsInner.md) |  | 
**generalnotifications** | **List[object]** |  | 
**newentryid** | **int** | True new created entry id. 0 if the entry was not created. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_data_add_entry200_response import ModDataAddEntry200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataAddEntry200Response from a JSON string
mod_data_add_entry200_response_instance = ModDataAddEntry200Response.from_json(json)
# print the JSON string representation of the object
print(ModDataAddEntry200Response.to_json())

# convert the object into a dict
mod_data_add_entry200_response_dict = mod_data_add_entry200_response_instance.to_dict()
# create an instance of ModDataAddEntry200Response from a dict
mod_data_add_entry200_response_from_dict = ModDataAddEntry200Response.from_dict(mod_data_add_entry200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



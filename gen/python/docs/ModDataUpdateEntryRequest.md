# ModDataUpdateEntryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[ModDataUpdateEntryRequestDataInner]**](ModDataUpdateEntryRequestDataInner.md) |  | 
**entryid** | **int** | The entry record id. | [default to null]

## Example

```python
from openapi_client.models.mod_data_update_entry_request import ModDataUpdateEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataUpdateEntryRequest from a JSON string
mod_data_update_entry_request_instance = ModDataUpdateEntryRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataUpdateEntryRequest.to_json())

# convert the object into a dict
mod_data_update_entry_request_dict = mod_data_update_entry_request_instance.to_dict()
# create an instance of ModDataUpdateEntryRequest from a dict
mod_data_update_entry_request_from_dict = ModDataUpdateEntryRequest.from_dict(mod_data_update_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



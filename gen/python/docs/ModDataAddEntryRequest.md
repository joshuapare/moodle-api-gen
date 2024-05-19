# ModDataAddEntryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[ModDataAddEntryRequestDataInner]**](ModDataAddEntryRequestDataInner.md) |  | 
**databaseid** | **int** | data instance id | [default to null]
**groupid** | **int** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_data_add_entry_request import ModDataAddEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataAddEntryRequest from a JSON string
mod_data_add_entry_request_instance = ModDataAddEntryRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataAddEntryRequest.to_json())

# convert the object into a dict
mod_data_add_entry_request_dict = mod_data_add_entry_request_instance.to_dict()
# create an instance of ModDataAddEntryRequest from a dict
mod_data_add_entry_request_from_dict = ModDataAddEntryRequest.from_dict(mod_data_add_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModDataDeleteEntryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryid** | **int** | Record entry id. | 

## Example

```python
from openapi_client.models.mod_data_delete_entry_request import ModDataDeleteEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataDeleteEntryRequest from a JSON string
mod_data_delete_entry_request_instance = ModDataDeleteEntryRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataDeleteEntryRequest.to_json())

# convert the object into a dict
mod_data_delete_entry_request_dict = mod_data_delete_entry_request_instance.to_dict()
# create an instance of ModDataDeleteEntryRequest from a dict
mod_data_delete_entry_request_from_dict = ModDataDeleteEntryRequest.from_dict(mod_data_delete_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModDataGetEntryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryid** | **int** | record entry id | [default to null]
**returncontents** | **bool** | Whether to return contents or not. | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_data_get_entry_request import ModDataGetEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetEntryRequest from a JSON string
mod_data_get_entry_request_instance = ModDataGetEntryRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataGetEntryRequest.to_json())

# convert the object into a dict
mod_data_get_entry_request_dict = mod_data_get_entry_request_instance.to_dict()
# create an instance of ModDataGetEntryRequest from a dict
mod_data_get_entry_request_from_dict = ModDataGetEntryRequest.from_dict(mod_data_get_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



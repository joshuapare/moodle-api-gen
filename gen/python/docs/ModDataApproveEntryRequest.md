# ModDataApproveEntryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approve** | **bool** | Whether to approve (true) or unapprove the entry. | [optional] [default to True]
**entryid** | **int** | Record entry id. | [default to null]

## Example

```python
from openapi_client.models.mod_data_approve_entry_request import ModDataApproveEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataApproveEntryRequest from a JSON string
mod_data_approve_entry_request_instance = ModDataApproveEntryRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataApproveEntryRequest.to_json())

# convert the object into a dict
mod_data_approve_entry_request_dict = mod_data_approve_entry_request_instance.to_dict()
# create an instance of ModDataApproveEntryRequest from a dict
mod_data_approve_entry_request_from_dict = ModDataApproveEntryRequest.from_dict(mod_data_approve_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



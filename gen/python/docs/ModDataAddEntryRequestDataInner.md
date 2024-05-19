# ModDataAddEntryRequestDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldid** | **int** | The field id. | [optional] [default to null]
**subfield** | **str** | The subfield name (if required). | [optional] [default to '']
**value** | **str** | The contents for the field always JSON encoded. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_data_add_entry_request_data_inner import ModDataAddEntryRequestDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataAddEntryRequestDataInner from a JSON string
mod_data_add_entry_request_data_inner_instance = ModDataAddEntryRequestDataInner.from_json(json)
# print the JSON string representation of the object
print(ModDataAddEntryRequestDataInner.to_json())

# convert the object into a dict
mod_data_add_entry_request_data_inner_dict = mod_data_add_entry_request_data_inner_instance.to_dict()
# create an instance of ModDataAddEntryRequestDataInner from a dict
mod_data_add_entry_request_data_inner_from_dict = ModDataAddEntryRequestDataInner.from_dict(mod_data_add_entry_request_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



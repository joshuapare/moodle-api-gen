# ModGlossaryDeleteEntryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryid** | **int** | Glossary entry id to delete | [default to null]

## Example

```python
from openapi_client.models.mod_glossary_delete_entry_request import ModGlossaryDeleteEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryDeleteEntryRequest from a JSON string
mod_glossary_delete_entry_request_instance = ModGlossaryDeleteEntryRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryDeleteEntryRequest.to_json())

# convert the object into a dict
mod_glossary_delete_entry_request_dict = mod_glossary_delete_entry_request_instance.to_dict()
# create an instance of ModGlossaryDeleteEntryRequest from a dict
mod_glossary_delete_entry_request_from_dict = ModGlossaryDeleteEntryRequest.from_dict(mod_glossary_delete_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



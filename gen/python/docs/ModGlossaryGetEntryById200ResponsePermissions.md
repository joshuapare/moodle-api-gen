# ModGlossaryGetEntryById200ResponsePermissions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candelete** | **bool** | Whether the user can delete the entry. | [default to False]
**canupdate** | **bool** | Whether the user can update the entry. | [default to False]

## Example

```python
from openapi_client.models.mod_glossary_get_entry_by_id200_response_permissions import ModGlossaryGetEntryById200ResponsePermissions

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntryById200ResponsePermissions from a JSON string
mod_glossary_get_entry_by_id200_response_permissions_instance = ModGlossaryGetEntryById200ResponsePermissions.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntryById200ResponsePermissions.to_json())

# convert the object into a dict
mod_glossary_get_entry_by_id200_response_permissions_dict = mod_glossary_get_entry_by_id200_response_permissions_instance.to_dict()
# create an instance of ModGlossaryGetEntryById200ResponsePermissions from a dict
mod_glossary_get_entry_by_id200_response_permissions_from_dict = ModGlossaryGetEntryById200ResponsePermissions.from_dict(mod_glossary_get_entry_by_id200_response_permissions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



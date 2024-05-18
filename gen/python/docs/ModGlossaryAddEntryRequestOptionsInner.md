# ModGlossaryAddEntryRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The allowed keys (value format) are:                             inlineattachmentsid (int); the draft file area id for inline attachments                             attachmentsid (int); the draft file area id for attachments                             categories (comma separated int); comma separated category ids                             aliases (comma separated str); comma separated aliases                             usedynalink (bool); whether the entry should be automatically linked.                             casesensitive (bool); whether the entry is case sensitive.                             fullmatch (bool); whether to match whole words only. | [optional] [default to 'null']
**value** | **str** | the value of the option (validated inside the function) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_glossary_add_entry_request_options_inner import ModGlossaryAddEntryRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryAddEntryRequestOptionsInner from a JSON string
mod_glossary_add_entry_request_options_inner_instance = ModGlossaryAddEntryRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryAddEntryRequestOptionsInner.to_json())

# convert the object into a dict
mod_glossary_add_entry_request_options_inner_dict = mod_glossary_add_entry_request_options_inner_instance.to_dict()
# create an instance of ModGlossaryAddEntryRequestOptionsInner from a dict
mod_glossary_add_entry_request_options_inner_from_dict = ModGlossaryAddEntryRequestOptionsInner.from_dict(mod_glossary_add_entry_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



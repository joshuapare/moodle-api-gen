# ModGlossaryGetEntriesByAuthorRequestOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includenotapproved** | **bool** | When false, includes the non-approved entries created by the user. When true, also includes the ones that the user has the permission to approve. | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_author_request_options import ModGlossaryGetEntriesByAuthorRequestOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByAuthorRequestOptions from a JSON string
mod_glossary_get_entries_by_author_request_options_instance = ModGlossaryGetEntriesByAuthorRequestOptions.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByAuthorRequestOptions.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_author_request_options_dict = mod_glossary_get_entries_by_author_request_options_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByAuthorRequestOptions from a dict
mod_glossary_get_entries_by_author_request_options_from_dict = ModGlossaryGetEntriesByAuthorRequestOptions.from_dict(mod_glossary_get_entries_by_author_request_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



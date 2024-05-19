# ModGlossaryGetAuthorsRequestOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includenotapproved** | **bool** | When false, includes self even if all of their entries require approval. When true, also includes authors only having entries pending approval. | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_glossary_get_authors_request_options import ModGlossaryGetAuthorsRequestOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetAuthorsRequestOptions from a JSON string
mod_glossary_get_authors_request_options_instance = ModGlossaryGetAuthorsRequestOptions.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetAuthorsRequestOptions.to_json())

# convert the object into a dict
mod_glossary_get_authors_request_options_dict = mod_glossary_get_authors_request_options_instance.to_dict()
# create an instance of ModGlossaryGetAuthorsRequestOptions from a dict
mod_glossary_get_authors_request_options_from_dict = ModGlossaryGetAuthorsRequestOptions.from_dict(mod_glossary_get_authors_request_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



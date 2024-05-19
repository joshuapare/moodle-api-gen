# ModGlossaryGetEntriesByTermRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | Glossary entry ID | 
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**term** | **str** | The entry concept, or alias | [default to 'null']

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_term_request import ModGlossaryGetEntriesByTermRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByTermRequest from a JSON string
mod_glossary_get_entries_by_term_request_instance = ModGlossaryGetEntriesByTermRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByTermRequest.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_term_request_dict = mod_glossary_get_entries_by_term_request_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByTermRequest from a dict
mod_glossary_get_entries_by_term_request_from_dict = ModGlossaryGetEntriesByTermRequest.from_dict(mod_glossary_get_entries_by_term_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



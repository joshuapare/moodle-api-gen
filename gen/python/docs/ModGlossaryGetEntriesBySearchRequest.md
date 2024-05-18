# ModGlossaryGetEntriesBySearchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**fullsearch** | **bool** | The query | [optional] [default to False]
**id** | **int** | Glossary entry ID | 
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**order** | **str** | Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39; | [optional] [default to 'CONCEPT']
**query** | **str** | The query string | [default to 'null']
**sort** | **str** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to 'ASC']

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_search_request import ModGlossaryGetEntriesBySearchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesBySearchRequest from a JSON string
mod_glossary_get_entries_by_search_request_instance = ModGlossaryGetEntriesBySearchRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesBySearchRequest.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_search_request_dict = mod_glossary_get_entries_by_search_request_instance.to_dict()
# create an instance of ModGlossaryGetEntriesBySearchRequest from a dict
mod_glossary_get_entries_by_search_request_from_dict = ModGlossaryGetEntriesBySearchRequest.from_dict(mod_glossary_get_entries_by_search_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModGlossaryGetEntriesByAuthorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** | Search and order using: &#39;FIRSTNAME&#39; or &#39;LASTNAME&#39; | [optional] [default to 'LASTNAME']
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | Glossary entry ID | 
**letter** | **str** | First letter of firstname or lastname, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | [default to 'null']
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**sort** | **str** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to 'ASC']

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_author_request import ModGlossaryGetEntriesByAuthorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByAuthorRequest from a JSON string
mod_glossary_get_entries_by_author_request_instance = ModGlossaryGetEntriesByAuthorRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByAuthorRequest.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_author_request_dict = mod_glossary_get_entries_by_author_request_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByAuthorRequest from a dict
mod_glossary_get_entries_by_author_request_from_dict = ModGlossaryGetEntriesByAuthorRequest.from_dict(mod_glossary_get_entries_by_author_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



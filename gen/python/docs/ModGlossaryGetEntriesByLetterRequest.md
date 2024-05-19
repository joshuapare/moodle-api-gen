# ModGlossaryGetEntriesByLetterRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | Glossary entry ID | 
**letter** | **str** | A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | [default to 'null']
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_letter_request import ModGlossaryGetEntriesByLetterRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByLetterRequest from a JSON string
mod_glossary_get_entries_by_letter_request_instance = ModGlossaryGetEntriesByLetterRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByLetterRequest.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_letter_request_dict = mod_glossary_get_entries_by_letter_request_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByLetterRequest from a dict
mod_glossary_get_entries_by_letter_request_from_dict = ModGlossaryGetEntriesByLetterRequest.from_dict(mod_glossary_get_entries_by_letter_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



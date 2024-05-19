# ModGlossaryGetEntriesByDateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | Glossary entry ID | 
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**order** | **str** | Order the records by: &#39;CREATION&#39; or &#39;UPDATE&#39;. | [optional] [default to 'UPDATE']
**sort** | **str** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to 'DESC']

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_date_request import ModGlossaryGetEntriesByDateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByDateRequest from a JSON string
mod_glossary_get_entries_by_date_request_instance = ModGlossaryGetEntriesByDateRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByDateRequest.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_date_request_dict = mod_glossary_get_entries_by_date_request_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByDateRequest from a dict
mod_glossary_get_entries_by_date_request_from_dict = ModGlossaryGetEntriesByDateRequest.from_dict(mod_glossary_get_entries_by_date_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



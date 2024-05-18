# ModGlossaryGetEntriesByCategoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | The category ID. Use &#39;0&#39; for all categories, or &#39;-1&#39; for uncategorised entries. | [default to null]
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | The glossary ID. | [default to null]
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_category_request import ModGlossaryGetEntriesByCategoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByCategoryRequest from a JSON string
mod_glossary_get_entries_by_category_request_instance = ModGlossaryGetEntriesByCategoryRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByCategoryRequest.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_category_request_dict = mod_glossary_get_entries_by_category_request_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByCategoryRequest from a dict
mod_glossary_get_entries_by_category_request_from_dict = ModGlossaryGetEntriesByCategoryRequest.from_dict(mod_glossary_get_entries_by_category_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



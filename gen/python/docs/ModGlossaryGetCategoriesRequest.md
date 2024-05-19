# ModGlossaryGetCategoriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | The glossary ID | [default to null]
**limit** | **int** | Number of records to return | [optional] [default to 20]

## Example

```python
from openapi_client.models.mod_glossary_get_categories_request import ModGlossaryGetCategoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetCategoriesRequest from a JSON string
mod_glossary_get_categories_request_instance = ModGlossaryGetCategoriesRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetCategoriesRequest.to_json())

# convert the object into a dict
mod_glossary_get_categories_request_dict = mod_glossary_get_categories_request_instance.to_dict()
# create an instance of ModGlossaryGetCategoriesRequest from a dict
mod_glossary_get_categories_request_from_dict = ModGlossaryGetCategoriesRequest.from_dict(mod_glossary_get_categories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModGlossaryGetAuthors200ResponseAuthorsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullname** | **str** | The fullname | [optional] [default to 'null']
**id** | **int** | The user ID | [optional] 
**pictureurl** | **str** | The picture URL | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_glossary_get_authors200_response_authors_inner import ModGlossaryGetAuthors200ResponseAuthorsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetAuthors200ResponseAuthorsInner from a JSON string
mod_glossary_get_authors200_response_authors_inner_instance = ModGlossaryGetAuthors200ResponseAuthorsInner.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetAuthors200ResponseAuthorsInner.to_json())

# convert the object into a dict
mod_glossary_get_authors200_response_authors_inner_dict = mod_glossary_get_authors200_response_authors_inner_instance.to_dict()
# create an instance of ModGlossaryGetAuthors200ResponseAuthorsInner from a dict
mod_glossary_get_authors200_response_authors_inner_from_dict = ModGlossaryGetAuthors200ResponseAuthorsInner.from_dict(mod_glossary_get_authors200_response_authors_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



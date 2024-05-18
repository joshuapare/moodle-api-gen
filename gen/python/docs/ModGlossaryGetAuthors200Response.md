# ModGlossaryGetAuthors200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authors** | [**List[ModGlossaryGetAuthors200ResponseAuthorsInner]**](ModGlossaryGetAuthors200ResponseAuthorsInner.md) |  | 
**count** | **int** | The total number of records. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_authors200_response import ModGlossaryGetAuthors200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetAuthors200Response from a JSON string
mod_glossary_get_authors200_response_instance = ModGlossaryGetAuthors200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetAuthors200Response.to_json())

# convert the object into a dict
mod_glossary_get_authors200_response_dict = mod_glossary_get_authors200_response_instance.to_dict()
# create an instance of ModGlossaryGetAuthors200Response from a dict
mod_glossary_get_authors200_response_from_dict = ModGlossaryGetAuthors200Response.from_dict(mod_glossary_get_authors200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModGlossaryGetCategories200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[ModGlossaryGetCategories200ResponseCategoriesInner]**](ModGlossaryGetCategories200ResponseCategoriesInner.md) |  | 
**count** | **int** | The total number of records. | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_categories200_response import ModGlossaryGetCategories200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetCategories200Response from a JSON string
mod_glossary_get_categories200_response_instance = ModGlossaryGetCategories200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetCategories200Response.to_json())

# convert the object into a dict
mod_glossary_get_categories200_response_dict = mod_glossary_get_categories200_response_instance.to_dict()
# create an instance of ModGlossaryGetCategories200Response from a dict
mod_glossary_get_categories200_response_from_dict = ModGlossaryGetCategories200Response.from_dict(mod_glossary_get_categories200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



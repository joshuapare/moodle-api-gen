# ModGlossaryAddEntry200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryid** | **int** | New glossary entry ID | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_add_entry200_response import ModGlossaryAddEntry200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryAddEntry200Response from a JSON string
mod_glossary_add_entry200_response_instance = ModGlossaryAddEntry200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryAddEntry200Response.to_json())

# convert the object into a dict
mod_glossary_add_entry200_response_dict = mod_glossary_add_entry200_response_instance.to_dict()
# create an instance of ModGlossaryAddEntry200Response from a dict
mod_glossary_add_entry200_response_from_dict = ModGlossaryAddEntry200Response.from_dict(mod_glossary_add_entry200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



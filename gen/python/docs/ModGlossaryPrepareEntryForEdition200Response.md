# ModGlossaryPrepareEntryForEdition200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | **List[object]** |  | 
**areas** | [**List[ModGlossaryPrepareEntryForEdition200ResponseAreasInner]**](ModGlossaryPrepareEntryForEdition200ResponseAreasInner.md) |  | 
**attachmentsid** | **int** | Draft item id for the file manager. | [default to null]
**categories** | **List[object]** |  | 
**inlineattachmentsid** | **int** | Draft item id for the text editor. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_prepare_entry_for_edition200_response import ModGlossaryPrepareEntryForEdition200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryPrepareEntryForEdition200Response from a JSON string
mod_glossary_prepare_entry_for_edition200_response_instance = ModGlossaryPrepareEntryForEdition200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryPrepareEntryForEdition200Response.to_json())

# convert the object into a dict
mod_glossary_prepare_entry_for_edition200_response_dict = mod_glossary_prepare_entry_for_edition200_response_instance.to_dict()
# create an instance of ModGlossaryPrepareEntryForEdition200Response from a dict
mod_glossary_prepare_entry_for_edition200_response_from_dict = ModGlossaryPrepareEntryForEdition200Response.from_dict(mod_glossary_prepare_entry_for_edition200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



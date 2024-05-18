# ModGlossaryAddEntryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**concept** | **str** | Glossary concept | [default to 'null']
**definition** | **str** | Glossary concept definition | [default to 'null']
**definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**glossaryid** | **int** | Glossary id | [default to null]
**options** | [**List[ModGlossaryAddEntryRequestOptionsInner]**](ModGlossaryAddEntryRequestOptionsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_add_entry_request import ModGlossaryAddEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryAddEntryRequest from a JSON string
mod_glossary_add_entry_request_instance = ModGlossaryAddEntryRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryAddEntryRequest.to_json())

# convert the object into a dict
mod_glossary_add_entry_request_dict = mod_glossary_add_entry_request_instance.to_dict()
# create an instance of ModGlossaryAddEntryRequest from a dict
mod_glossary_add_entry_request_from_dict = ModGlossaryAddEntryRequest.from_dict(mod_glossary_add_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModGlossaryViewGlossaryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Glossary instance ID | [default to null]
**mode** | **str** | The mode in which the glossary is viewed | [default to 'null']

## Example

```python
from openapi_client.models.mod_glossary_view_glossary_request import ModGlossaryViewGlossaryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryViewGlossaryRequest from a JSON string
mod_glossary_view_glossary_request_instance = ModGlossaryViewGlossaryRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryViewGlossaryRequest.to_json())

# convert the object into a dict
mod_glossary_view_glossary_request_dict = mod_glossary_view_glossary_request_instance.to_dict()
# create an instance of ModGlossaryViewGlossaryRequest from a dict
mod_glossary_view_glossary_request_from_dict = ModGlossaryViewGlossaryRequest.from_dict(mod_glossary_view_glossary_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



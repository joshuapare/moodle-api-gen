# ModGlossaryViewEntry200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True on success | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_view_entry200_response import ModGlossaryViewEntry200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryViewEntry200Response from a JSON string
mod_glossary_view_entry200_response_instance = ModGlossaryViewEntry200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryViewEntry200Response.to_json())

# convert the object into a dict
mod_glossary_view_entry200_response_dict = mod_glossary_view_entry200_response_instance.to_dict()
# create an instance of ModGlossaryViewEntry200Response from a dict
mod_glossary_view_entry200_response_from_dict = ModGlossaryViewEntry200Response.from_dict(mod_glossary_view_entry200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



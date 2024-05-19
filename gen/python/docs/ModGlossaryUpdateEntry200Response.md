# ModGlossaryUpdateEntry200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **bool** | The update result | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_update_entry200_response import ModGlossaryUpdateEntry200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryUpdateEntry200Response from a JSON string
mod_glossary_update_entry200_response_instance = ModGlossaryUpdateEntry200Response.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryUpdateEntry200Response.to_json())

# convert the object into a dict
mod_glossary_update_entry200_response_dict = mod_glossary_update_entry200_response_instance.to_dict()
# create an instance of ModGlossaryUpdateEntry200Response from a dict
mod_glossary_update_entry200_response_from_dict = ModGlossaryUpdateEntry200Response.from_dict(mod_glossary_update_entry200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



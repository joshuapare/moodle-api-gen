# ModWikiGetSubwikis200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subwikis** | [**List[ModWikiGetSubwikis200ResponseSubwikisInner]**](ModWikiGetSubwikis200ResponseSubwikisInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_wiki_get_subwikis200_response import ModWikiGetSubwikis200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetSubwikis200Response from a JSON string
mod_wiki_get_subwikis200_response_instance = ModWikiGetSubwikis200Response.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetSubwikis200Response.to_json())

# convert the object into a dict
mod_wiki_get_subwikis200_response_dict = mod_wiki_get_subwikis200_response_instance.to_dict()
# create an instance of ModWikiGetSubwikis200Response from a dict
mod_wiki_get_subwikis200_response_from_dict = ModWikiGetSubwikis200Response.from_dict(mod_wiki_get_subwikis200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



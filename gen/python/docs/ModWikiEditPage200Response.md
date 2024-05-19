# ModWikiEditPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pageid** | **int** | Edited page id. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_wiki_edit_page200_response import ModWikiEditPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiEditPage200Response from a JSON string
mod_wiki_edit_page200_response_instance = ModWikiEditPage200Response.from_json(json)
# print the JSON string representation of the object
print(ModWikiEditPage200Response.to_json())

# convert the object into a dict
mod_wiki_edit_page200_response_dict = mod_wiki_edit_page200_response_instance.to_dict()
# create an instance of ModWikiEditPage200Response from a dict
mod_wiki_edit_page200_response_from_dict = ModWikiEditPage200Response.from_dict(mod_wiki_edit_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



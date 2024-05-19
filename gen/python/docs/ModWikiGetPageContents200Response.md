# ModWikiGetPageContents200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | [**ModWikiGetPageContents200ResponsePage**](ModWikiGetPageContents200ResponsePage.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_wiki_get_page_contents200_response import ModWikiGetPageContents200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetPageContents200Response from a JSON string
mod_wiki_get_page_contents200_response_instance = ModWikiGetPageContents200Response.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetPageContents200Response.to_json())

# convert the object into a dict
mod_wiki_get_page_contents200_response_dict = mod_wiki_get_page_contents200_response_instance.to_dict()
# create an instance of ModWikiGetPageContents200Response from a dict
mod_wiki_get_page_contents200_response_from_dict = ModWikiGetPageContents200Response.from_dict(mod_wiki_get_page_contents200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



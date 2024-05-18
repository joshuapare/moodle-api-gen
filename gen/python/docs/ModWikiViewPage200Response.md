# ModWikiViewPage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | Status: true if success. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_wiki_view_page200_response import ModWikiViewPage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiViewPage200Response from a JSON string
mod_wiki_view_page200_response_instance = ModWikiViewPage200Response.from_json(json)
# print the JSON string representation of the object
print(ModWikiViewPage200Response.to_json())

# convert the object into a dict
mod_wiki_view_page200_response_dict = mod_wiki_view_page200_response_instance.to_dict()
# create an instance of ModWikiViewPage200Response from a dict
mod_wiki_view_page200_response_from_dict = ModWikiViewPage200Response.from_dict(mod_wiki_view_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



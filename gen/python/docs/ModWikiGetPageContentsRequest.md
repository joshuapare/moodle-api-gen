# ModWikiGetPageContentsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pageid** | **int** | Page ID. | 

## Example

```python
from openapi_client.models.mod_wiki_get_page_contents_request import ModWikiGetPageContentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetPageContentsRequest from a JSON string
mod_wiki_get_page_contents_request_instance = ModWikiGetPageContentsRequest.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetPageContentsRequest.to_json())

# convert the object into a dict
mod_wiki_get_page_contents_request_dict = mod_wiki_get_page_contents_request_instance.to_dict()
# create an instance of ModWikiGetPageContentsRequest from a dict
mod_wiki_get_page_contents_request_from_dict = ModWikiGetPageContentsRequest.from_dict(mod_wiki_get_page_contents_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



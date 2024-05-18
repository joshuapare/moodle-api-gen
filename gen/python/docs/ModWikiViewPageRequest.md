# ModWikiViewPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pageid** | **int** | Wiki page ID. | [default to null]

## Example

```python
from openapi_client.models.mod_wiki_view_page_request import ModWikiViewPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiViewPageRequest from a JSON string
mod_wiki_view_page_request_instance = ModWikiViewPageRequest.from_json(json)
# print the JSON string representation of the object
print(ModWikiViewPageRequest.to_json())

# convert the object into a dict
mod_wiki_view_page_request_dict = mod_wiki_view_page_request_instance.to_dict()
# create an instance of ModWikiViewPageRequest from a dict
mod_wiki_view_page_request_from_dict = ModWikiViewPageRequest.from_dict(mod_wiki_view_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



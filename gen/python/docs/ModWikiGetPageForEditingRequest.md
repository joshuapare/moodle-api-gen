# ModWikiGetPageForEditingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lockonly** | **bool** | Just renew lock and not return content. | [optional] [default to False]
**pageid** | **int** | Page ID to edit. | [default to null]
**section** | **str** | Section page title. | [optional] 

## Example

```python
from openapi_client.models.mod_wiki_get_page_for_editing_request import ModWikiGetPageForEditingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetPageForEditingRequest from a JSON string
mod_wiki_get_page_for_editing_request_instance = ModWikiGetPageForEditingRequest.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetPageForEditingRequest.to_json())

# convert the object into a dict
mod_wiki_get_page_for_editing_request_dict = mod_wiki_get_page_for_editing_request_instance.to_dict()
# create an instance of ModWikiGetPageForEditingRequest from a dict
mod_wiki_get_page_for_editing_request_from_dict = ModWikiGetPageForEditingRequest.from_dict(mod_wiki_get_page_for_editing_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



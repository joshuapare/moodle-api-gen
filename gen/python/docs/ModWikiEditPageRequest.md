# ModWikiEditPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Page contents. | 
**pageid** | **int** | Page ID. | [default to null]
**section** | **str** | Section page title. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_wiki_edit_page_request import ModWikiEditPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiEditPageRequest from a JSON string
mod_wiki_edit_page_request_instance = ModWikiEditPageRequest.from_json(json)
# print the JSON string representation of the object
print(ModWikiEditPageRequest.to_json())

# convert the object into a dict
mod_wiki_edit_page_request_dict = mod_wiki_edit_page_request_instance.to_dict()
# create an instance of ModWikiEditPageRequest from a dict
mod_wiki_edit_page_request_from_dict = ModWikiEditPageRequest.from_dict(mod_wiki_edit_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



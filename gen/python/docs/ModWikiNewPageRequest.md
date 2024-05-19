# ModWikiNewPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Page contents. | 
**contentformat** | **str** | Page contents format. If an invalid format is provided, default                     wiki format is used. | [optional] [default to 'null']
**groupid** | **int** | Subwiki&#39;s group ID. Used if subwiki does not exists. | [optional] [default to null]
**subwikiid** | **int** | Page&#39;s subwiki ID. | [optional] 
**title** | **str** | New page title. | [default to 'null']
**userid** | **int** | Subwiki&#39;s user ID. Used if subwiki does not exists. | [optional] [default to null]
**wikiid** | **int** | Page&#39;s wiki ID. Used if subwiki does not exists. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_wiki_new_page_request import ModWikiNewPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiNewPageRequest from a JSON string
mod_wiki_new_page_request_instance = ModWikiNewPageRequest.from_json(json)
# print the JSON string representation of the object
print(ModWikiNewPageRequest.to_json())

# convert the object into a dict
mod_wiki_new_page_request_dict = mod_wiki_new_page_request_instance.to_dict()
# create an instance of ModWikiNewPageRequest from a dict
mod_wiki_new_page_request_from_dict = ModWikiNewPageRequest.from_dict(mod_wiki_new_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



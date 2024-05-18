# ModWikiGetSubwikiPagesRequestOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includecontent** | **int** | Include each page contents or just the contents size. | [optional] [default to 1]
**sortby** | **str** | Field to sort by (id, title, ...). | [optional] [default to 'title']
**sortdirection** | **str** | Sort direction: ASC or DESC. | [optional] [default to 'ASC']

## Example

```python
from openapi_client.models.mod_wiki_get_subwiki_pages_request_options import ModWikiGetSubwikiPagesRequestOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetSubwikiPagesRequestOptions from a JSON string
mod_wiki_get_subwiki_pages_request_options_instance = ModWikiGetSubwikiPagesRequestOptions.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetSubwikiPagesRequestOptions.to_json())

# convert the object into a dict
mod_wiki_get_subwiki_pages_request_options_dict = mod_wiki_get_subwiki_pages_request_options_instance.to_dict()
# create an instance of ModWikiGetSubwikiPagesRequestOptions from a dict
mod_wiki_get_subwiki_pages_request_options_from_dict = ModWikiGetSubwikiPagesRequestOptions.from_dict(mod_wiki_get_subwiki_pages_request_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



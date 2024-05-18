# ModWikiGetSubwikiFilesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | **int** | Subwiki&#39;s group ID, -1 means current group. It will be ignored if the wiki doesn&#39;t use groups. | [optional] [default to -1]
**userid** | **int** | Subwiki&#39;s user ID, 0 means current user. It will be ignored in collaborative wikis. | [optional] [default to 0]
**wikiid** | **int** | Wiki instance ID. | [default to null]

## Example

```python
from openapi_client.models.mod_wiki_get_subwiki_files_request import ModWikiGetSubwikiFilesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetSubwikiFilesRequest from a JSON string
mod_wiki_get_subwiki_files_request_instance = ModWikiGetSubwikiFilesRequest.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetSubwikiFilesRequest.to_json())

# convert the object into a dict
mod_wiki_get_subwiki_files_request_dict = mod_wiki_get_subwiki_files_request_instance.to_dict()
# create an instance of ModWikiGetSubwikiFilesRequest from a dict
mod_wiki_get_subwiki_files_request_from_dict = ModWikiGetSubwikiFilesRequest.from_dict(mod_wiki_get_subwiki_files_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



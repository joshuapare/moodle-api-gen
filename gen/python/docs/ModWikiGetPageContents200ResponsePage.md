# ModWikiGetPageContents200ResponsePage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachedcontent** | **str** | Page contents. | 
**caneditpage** | **bool** | True if user can edit the page. | [default to False]
**contentformat** | **int** | cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**groupid** | **int** | Page&#39;s group ID. | [default to null]
**id** | **int** | Page ID. | 
**subwikiid** | **int** | Page&#39;s subwiki ID. | [default to null]
**tags** | [**List[ModDataGetEntries200ResponseEntriesInnerTagsInner]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**title** | **str** | Page title. | 
**userid** | **int** | Page&#39;s user ID. | [default to null]
**version** | **int** | Latest version of the page. | [optional] [default to null]
**wikiid** | **int** | Page&#39;s wiki ID. | [default to null]

## Example

```python
from openapi_client.models.mod_wiki_get_page_contents200_response_page import ModWikiGetPageContents200ResponsePage

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetPageContents200ResponsePage from a JSON string
mod_wiki_get_page_contents200_response_page_instance = ModWikiGetPageContents200ResponsePage.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetPageContents200ResponsePage.to_json())

# convert the object into a dict
mod_wiki_get_page_contents200_response_page_dict = mod_wiki_get_page_contents200_response_page_instance.to_dict()
# create an instance of ModWikiGetPageContents200ResponsePage from a dict
mod_wiki_get_page_contents200_response_page_from_dict = ModWikiGetPageContents200ResponsePage.from_dict(mod_wiki_get_page_contents200_response_page_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



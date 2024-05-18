# ModWikiGetSubwikiPages200ResponsePagesInner

Pages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachedcontent** | **str** | Page contents. | [optional] 
**caneditpage** | **bool** | True if user can edit the page. | [optional] 
**contentformat** | **int** | cachedcontent format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**contentsize** | **int** | Size of page contents in bytes (doesn&#39;t include size of attached files). | [optional] [default to null]
**firstpage** | **bool** | True if it&#39;s the first page. | [optional] [default to False]
**id** | **int** | Page ID. | [optional] 
**pageviews** | **int** | Number of times the page has been viewed. | [optional] [default to null]
**readonly** | **int** | 1 if readonly, 0 otherwise. | [optional] [default to null]
**subwikiid** | **int** | Page&#39;s subwiki ID. | [optional] 
**tags** | [**List[ModDataGetEntries200ResponseEntriesInnerTagsInner]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**timecreated** | **int** | Time of creation. | [optional] [default to null]
**timemodified** | **int** | Time of last modification. | [optional] [default to null]
**timerendered** | **int** | Time of last renderization. | [optional] [default to null]
**title** | **str** | Page title. | [optional] 
**userid** | **int** | ID of the user that last modified the page. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_wiki_get_subwiki_pages200_response_pages_inner import ModWikiGetSubwikiPages200ResponsePagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetSubwikiPages200ResponsePagesInner from a JSON string
mod_wiki_get_subwiki_pages200_response_pages_inner_instance = ModWikiGetSubwikiPages200ResponsePagesInner.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetSubwikiPages200ResponsePagesInner.to_json())

# convert the object into a dict
mod_wiki_get_subwiki_pages200_response_pages_inner_dict = mod_wiki_get_subwiki_pages200_response_pages_inner_instance.to_dict()
# create an instance of ModWikiGetSubwikiPages200ResponsePagesInner from a dict
mod_wiki_get_subwiki_pages200_response_pages_inner_from_dict = ModWikiGetSubwikiPages200ResponsePagesInner.from_dict(mod_wiki_get_subwiki_pages200_response_pages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



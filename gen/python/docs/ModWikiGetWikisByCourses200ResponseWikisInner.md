# ModWikiGetWikisByCourses200ResponseWikisInner

Wikis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancreatepages** | **bool** | True if user can create pages. | [optional] [default to False]
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**defaultformat** | **str** | Wiki&#39;s default format (html, creole, nwiki). | [optional] [default to 'null']
**editbegin** | **int** | Edit begin. | [optional] [default to null]
**editend** | **int** | Edit end. | [optional] [default to null]
**firstpagetitle** | **str** | First page title. | [optional] [default to 'null']
**forceformat** | **int** | 1 if format is forced, 0 otherwise. | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**section** | **int** | Course section id | [optional] 
**timecreated** | **int** | Time of creation. | [optional] 
**timemodified** | **int** | Time of last modification. | [optional] 
**visible** | **bool** | Visible | [optional] 
**wikimode** | **str** | Wiki mode (individual, collaborative). | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_wiki_get_wikis_by_courses200_response_wikis_inner import ModWikiGetWikisByCourses200ResponseWikisInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetWikisByCourses200ResponseWikisInner from a JSON string
mod_wiki_get_wikis_by_courses200_response_wikis_inner_instance = ModWikiGetWikisByCourses200ResponseWikisInner.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetWikisByCourses200ResponseWikisInner.to_json())

# convert the object into a dict
mod_wiki_get_wikis_by_courses200_response_wikis_inner_dict = mod_wiki_get_wikis_by_courses200_response_wikis_inner_instance.to_dict()
# create an instance of ModWikiGetWikisByCourses200ResponseWikisInner from a dict
mod_wiki_get_wikis_by_courses200_response_wikis_inner_from_dict = ModWikiGetWikisByCourses200ResponseWikisInner.from_dict(mod_wiki_get_wikis_by_courses200_response_wikis_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



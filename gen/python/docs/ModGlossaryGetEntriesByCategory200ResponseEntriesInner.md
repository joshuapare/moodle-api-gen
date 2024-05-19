# ModGlossaryGetEntriesByCategory200ResponseEntriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry was approved | [optional] 
**attachment** | **bool** | Whether or not the entry has attachments | [optional] 
**attachments** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**casesensitive** | **bool** | When true, the matching is case sensitive | [optional] 
**categoryid** | **int** | The category ID. This may be &#39;-1&#39; when the entry is not categorised | [optional] [default to -1]
**categoryname** | **str** | The category name. May be empty when the entry is not categorised, or the request was limited to one category. | [optional] [default to '']
**concept** | **str** | The concept | [optional] 
**definition** | **str** | The definition | [optional] 
**definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**definitioninlinefiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**definitiontrust** | **bool** | The definition trust flag | [optional] 
**fullmatch** | **bool** | When true, the matching is done on full words only | [optional] 
**glossaryid** | **int** | The glossary ID | [optional] 
**id** | **int** | The entry ID | [optional] 
**sourceglossaryid** | **int** | The source glossary ID | [optional] 
**tags** | [**List[ModDataGetEntries200ResponseEntriesInnerTagsInner]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | [optional] 
**timecreated** | **int** | Time created | [optional] 
**timemodified** | **int** | Time modified | [optional] 
**usedynalink** | **bool** | Whether the concept should be automatically linked | [optional] 
**userfullname** | **str** | Author full name | [optional] 
**userid** | **int** | Author ID | [optional] 
**userpictureurl** | **str** | Author picture | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_entries_by_category200_response_entries_inner import ModGlossaryGetEntriesByCategory200ResponseEntriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesByCategory200ResponseEntriesInner from a JSON string
mod_glossary_get_entries_by_category200_response_entries_inner_instance = ModGlossaryGetEntriesByCategory200ResponseEntriesInner.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesByCategory200ResponseEntriesInner.to_json())

# convert the object into a dict
mod_glossary_get_entries_by_category200_response_entries_inner_dict = mod_glossary_get_entries_by_category200_response_entries_inner_instance.to_dict()
# create an instance of ModGlossaryGetEntriesByCategory200ResponseEntriesInner from a dict
mod_glossary_get_entries_by_category200_response_entries_inner_from_dict = ModGlossaryGetEntriesByCategory200ResponseEntriesInner.from_dict(mod_glossary_get_entries_by_category200_response_entries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



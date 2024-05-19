# ModGlossaryGetEntryById200ResponseEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **bool** | Whether the entry was approved | 
**attachment** | **bool** | Whether or not the entry has attachments | 
**attachments** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**casesensitive** | **bool** | When true, the matching is case sensitive | 
**concept** | **str** | The concept | 
**definition** | **str** | The definition | 
**definitionformat** | **int** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**definitioninlinefiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**definitiontrust** | **bool** | The definition trust flag | 
**fullmatch** | **bool** | When true, the matching is done on full words only | 
**glossaryid** | **int** | The glossary ID | 
**id** | **int** | The entry ID | 
**sourceglossaryid** | **int** | The source glossary ID | 
**tags** | [**List[ModDataGetEntries200ResponseEntriesInnerTagsInner]**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | 
**timecreated** | **int** | Time created | 
**timemodified** | **int** | Time modified | 
**usedynalink** | **bool** | Whether the concept should be automatically linked | 
**userfullname** | **str** | Author full name | 
**userid** | **int** | Author ID | 
**userpictureurl** | **str** | Author picture | 

## Example

```python
from openapi_client.models.mod_glossary_get_entry_by_id200_response_entry import ModGlossaryGetEntryById200ResponseEntry

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntryById200ResponseEntry from a JSON string
mod_glossary_get_entry_by_id200_response_entry_instance = ModGlossaryGetEntryById200ResponseEntry.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntryById200ResponseEntry.to_json())

# convert the object into a dict
mod_glossary_get_entry_by_id200_response_entry_dict = mod_glossary_get_entry_by_id200_response_entry_instance.to_dict()
# create an instance of ModGlossaryGetEntryById200ResponseEntry from a dict
mod_glossary_get_entry_by_id200_response_entry_from_dict = ModGlossaryGetEntryById200ResponseEntry.from_dict(mod_glossary_get_entry_by_id200_response_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



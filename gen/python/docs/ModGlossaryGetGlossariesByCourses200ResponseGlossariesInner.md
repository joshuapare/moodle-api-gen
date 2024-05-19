# ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner

Glossaries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowcomments** | **int** | If enabled, all participants with permission to create comments will be able to add comments to glossary entries | [optional] [default to null]
**allowduplicatedentries** | **int** | If enabled, multiple entries can have the same concept name | [optional] [default to null]
**allowprintview** | **int** | If enabled, students are provided with a link to a printer-friendly version of the glossary. The link is always available to teachers | [optional] [default to null]
**approvaldisplayformat** | **str** | When approving glossary items you may wish to use a different display format | [optional] [default to 'null']
**assessed** | **int** | Aggregate type | [optional] [default to null]
**assesstimefinish** | **int** | Restrict rating to items created before this | [optional] [default to null]
**assesstimestart** | **int** | Restrict rating to items created after this | [optional] [default to null]
**browsemodes** | **List[object]** |  | [optional] 
**canaddentry** | **int** | Whether the user can add a new entry | [optional] [default to null]
**completionentries** | **int** | Number of entries to complete | [optional] [default to null]
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**defaultapproval** | **int** | If set to no, entries require approving by a teacher before they are viewable by everyone. | [optional] [default to null]
**displayformat** | **str** | Display format type | [optional] [default to 'null']
**editalways** | **int** | Always allow editing | [optional] [default to null]
**entbypage** | **int** | Entries shown per page | [optional] [default to null]
**globalglossary** | **int** |  | [optional] 
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**mainglossary** | **int** | If enabled this glossary is a main glossary. | [optional] [default to null]
**name** | **str** | Activity name | [optional] 
**rssarticles** | **int** | This setting specifies the number of glossary entry concepts to include in the RSS feed. Between 5 and 20 generally acceptable | [optional] [default to null]
**rsstype** | **int** | To enable the RSS feed for this activity, select either concepts with author or concepts without author to be included in the feed | [optional] [default to null]
**scale** | **int** | Scale ID | [optional] [default to null]
**section** | **int** | Course section id | [optional] 
**showall** | **int** | If enabled, participants can browse all entries at once | [optional] [default to null]
**showalphabet** | **int** | If enabled, participants can browse the glossary by letters of the alphabet | [optional] [default to null]
**showspecial** | **int** | If enabled, participants can browse the glossary by special characters, such as @ and # | [optional] [default to null]
**timecreated** | **int** | Time created | [optional] 
**timemodified** | **int** | Time modified | [optional] 
**usedynalink** | **int** | If site-wide glossary auto-linking has been enabled by an administrator and this checkbox is ticked, the entry will be automatically linked wherever the concept words and phrases appear throughout the rest of the course. | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_glossary_get_glossaries_by_courses200_response_glossaries_inner import ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner from a JSON string
mod_glossary_get_glossaries_by_courses200_response_glossaries_inner_instance = ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner.to_json())

# convert the object into a dict
mod_glossary_get_glossaries_by_courses200_response_glossaries_inner_dict = mod_glossary_get_glossaries_by_courses200_response_glossaries_inner_instance.to_dict()
# create an instance of ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner from a dict
mod_glossary_get_glossaries_by_courses200_response_glossaries_inner_from_dict = ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner.from_dict(mod_glossary_get_glossaries_by_courses200_response_glossaries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



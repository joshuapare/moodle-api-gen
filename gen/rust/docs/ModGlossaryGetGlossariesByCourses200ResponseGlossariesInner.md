# ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowcomments** | Option<**i32**> | If enabled, all participants with permission to create comments will be able to add comments to glossary entries | [optional][default to null]
**allowduplicatedentries** | Option<**i32**> | If enabled, multiple entries can have the same concept name | [optional][default to null]
**allowprintview** | Option<**i32**> | If enabled, students are provided with a link to a printer-friendly version of the glossary. The link is always available to teachers | [optional][default to null]
**approvaldisplayformat** | Option<**String**> | When approving glossary items you may wish to use a different display format | [optional][default to null]
**assessed** | Option<**i32**> | Aggregate type | [optional][default to null]
**assesstimefinish** | Option<**i32**> | Restrict rating to items created before this | [optional][default to null]
**assesstimestart** | Option<**i32**> | Restrict rating to items created after this | [optional][default to null]
**browsemodes** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**canaddentry** | Option<**i32**> | Whether the user can add a new entry | [optional][default to null]
**completionentries** | Option<**i32**> | Number of entries to complete | [optional][default to null]
**course** | Option<**i32**> | Course id | [optional]
**coursemodule** | Option<**i32**> | Course module id | [optional]
**defaultapproval** | Option<**i32**> | If set to no, entries require approving by a teacher before they are viewable by everyone. | [optional][default to null]
**displayformat** | Option<**String**> | Display format type | [optional][default to null]
**editalways** | Option<**i32**> | Always allow editing | [optional][default to null]
**entbypage** | Option<**i32**> | Entries shown per page | [optional][default to null]
**globalglossary** | Option<**i32**> |  | [optional]
**groupingid** | Option<**i32**> | Group id | [optional]
**groupmode** | Option<**i32**> | Group mode | [optional]
**id** | Option<**i32**> | Activity instance id | [optional]
**intro** | Option<**String**> | Activity introduction | [optional]
**introfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**lang** | Option<**String**> | Forced activity language | [optional]
**mainglossary** | Option<**i32**> | If enabled this glossary is a main glossary. | [optional][default to null]
**name** | Option<**String**> | Activity name | [optional]
**rssarticles** | Option<**i32**> | This setting specifies the number of glossary entry concepts to include in the RSS feed. Between 5 and 20 generally acceptable | [optional][default to null]
**rsstype** | Option<**i32**> | To enable the RSS feed for this activity, select either concepts with author or concepts without author to be included in the feed | [optional][default to null]
**scale** | Option<**i32**> | Scale ID | [optional][default to null]
**section** | Option<**i32**> | Course section id | [optional]
**showall** | Option<**i32**> | If enabled, participants can browse all entries at once | [optional][default to null]
**showalphabet** | Option<**i32**> | If enabled, participants can browse the glossary by letters of the alphabet | [optional][default to null]
**showspecial** | Option<**i32**> | If enabled, participants can browse the glossary by special characters, such as @ and # | [optional][default to null]
**timecreated** | Option<**i32**> | Time created | [optional]
**timemodified** | Option<**i32**> | Time modified | [optional]
**usedynalink** | Option<**i32**> | If site-wide glossary auto-linking has been enabled by an administrator and this checkbox is ticked, the entry will be automatically linked wherever the concept words and phrases appear throughout the rest of the course. | [optional][default to null]
**visible** | Option<**bool**> | Visible | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# MoodleClient.Model.ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner
Glossaries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowcomments** | **int** | If enabled, all participants with permission to create comments will be able to add comments to glossary entries | [optional] [default to null]
**Allowduplicatedentries** | **int** | If enabled, multiple entries can have the same concept name | [optional] [default to null]
**Allowprintview** | **int** | If enabled, students are provided with a link to a printer-friendly version of the glossary. The link is always available to teachers | [optional] [default to null]
**Approvaldisplayformat** | **string** | When approving glossary items you may wish to use a different display format | [optional] [default to "null"]
**Assessed** | **int** | Aggregate type | [optional] [default to null]
**Assesstimefinish** | **int** | Restrict rating to items created before this | [optional] [default to null]
**Assesstimestart** | **int** | Restrict rating to items created after this | [optional] [default to null]
**Browsemodes** | **List&lt;Object&gt;** |  | [optional] 
**Canaddentry** | **int** | Whether the user can add a new entry | [optional] [default to null]
**Completionentries** | **int** | Number of entries to complete | [optional] [default to null]
**Course** | **int** | Course id | [optional] 
**Coursemodule** | **int** | Course module id | [optional] 
**Defaultapproval** | **int** | If set to no, entries require approving by a teacher before they are viewable by everyone. | [optional] [default to null]
**Displayformat** | **string** | Display format type | [optional] [default to "null"]
**Editalways** | **int** | Always allow editing | [optional] [default to null]
**Entbypage** | **int** | Entries shown per page | [optional] [default to null]
**Globalglossary** | **int** |  | [optional] 
**Groupingid** | **int** | Group id | [optional] 
**Groupmode** | **int** | Group mode | [optional] 
**Id** | **int** | Activity instance id | [optional] 
**Intro** | **string** | Activity introduction | [optional] 
**Introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | **string** | Forced activity language | [optional] 
**Mainglossary** | **int** | If enabled this glossary is a main glossary. | [optional] [default to null]
**Name** | **string** | Activity name | [optional] 
**Rssarticles** | **int** | This setting specifies the number of glossary entry concepts to include in the RSS feed. Between 5 and 20 generally acceptable | [optional] [default to null]
**Rsstype** | **int** | To enable the RSS feed for this activity, select either concepts with author or concepts without author to be included in the feed | [optional] [default to null]
**Scale** | **int** | Scale ID | [optional] [default to null]
**Section** | **int** | Course section id | [optional] 
**Showall** | **int** | If enabled, participants can browse all entries at once | [optional] [default to null]
**Showalphabet** | **int** | If enabled, participants can browse the glossary by letters of the alphabet | [optional] [default to null]
**Showspecial** | **int** | If enabled, participants can browse the glossary by special characters, such as @ and # | [optional] [default to null]
**Timecreated** | **int** | Time created | [optional] 
**Timemodified** | **int** | Time modified | [optional] 
**Usedynalink** | **int** | If site-wide glossary auto-linking has been enabled by an administrator and this checkbox is ticked, the entry will be automatically linked wherever the concept words and phrases appear throughout the rest of the course. | [optional] [default to null]
**Visible** | **bool** | Visible | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


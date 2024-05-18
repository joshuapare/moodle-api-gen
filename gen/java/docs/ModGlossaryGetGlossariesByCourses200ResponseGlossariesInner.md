

# ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner

Glossaries

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowcomments** | **Integer** | If enabled, all participants with permission to create comments will be able to add comments to glossary entries |  [optional] |
|**allowduplicatedentries** | **Integer** | If enabled, multiple entries can have the same concept name |  [optional] |
|**allowprintview** | **Integer** | If enabled, students are provided with a link to a printer-friendly version of the glossary. The link is always available to teachers |  [optional] |
|**approvaldisplayformat** | **String** | When approving glossary items you may wish to use a different display format |  [optional] |
|**assessed** | **Integer** | Aggregate type |  [optional] |
|**assesstimefinish** | **Integer** | Restrict rating to items created before this |  [optional] |
|**assesstimestart** | **Integer** | Restrict rating to items created after this |  [optional] |
|**browsemodes** | **List&lt;Object&gt;** |  |  [optional] |
|**canaddentry** | **Integer** | Whether the user can add a new entry |  [optional] |
|**completionentries** | **Integer** | Number of entries to complete |  [optional] |
|**course** | **Integer** | Course id |  [optional] |
|**coursemodule** | **Integer** | Course module id |  [optional] |
|**defaultapproval** | **Integer** | If set to no, entries require approving by a teacher before they are viewable by everyone. |  [optional] |
|**displayformat** | **String** | Display format type |  [optional] |
|**editalways** | **Integer** | Always allow editing |  [optional] |
|**entbypage** | **Integer** | Entries shown per page |  [optional] |
|**globalglossary** | **Integer** |  |  [optional] |
|**groupingid** | **Integer** | Group id |  [optional] |
|**groupmode** | **Integer** | Group mode |  [optional] |
|**id** | **Integer** | Activity instance id |  [optional] |
|**intro** | **String** | Activity introduction |  [optional] |
|**introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  |  [optional] |
|**introformat** | **Integer** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**lang** | **String** | Forced activity language |  [optional] |
|**mainglossary** | **Integer** | If enabled this glossary is a main glossary. |  [optional] |
|**name** | **String** | Activity name |  [optional] |
|**rssarticles** | **Integer** | This setting specifies the number of glossary entry concepts to include in the RSS feed. Between 5 and 20 generally acceptable |  [optional] |
|**rsstype** | **Integer** | To enable the RSS feed for this activity, select either concepts with author or concepts without author to be included in the feed |  [optional] |
|**scale** | **Integer** | Scale ID |  [optional] |
|**section** | **Integer** | Course section id |  [optional] |
|**showall** | **Integer** | If enabled, participants can browse all entries at once |  [optional] |
|**showalphabet** | **Integer** | If enabled, participants can browse the glossary by letters of the alphabet |  [optional] |
|**showspecial** | **Integer** | If enabled, participants can browse the glossary by special characters, such as @ and # |  [optional] |
|**timecreated** | **Integer** | Time created |  [optional] |
|**timemodified** | **Integer** | Time modified |  [optional] |
|**usedynalink** | **Integer** | If site-wide glossary auto-linking has been enabled by an administrator and this checkbox is ticked, the entry will be automatically linked wherever the concept words and phrases appear throughout the rest of the course. |  [optional] |
|**visible** | **Boolean** | Visible |  [optional] |




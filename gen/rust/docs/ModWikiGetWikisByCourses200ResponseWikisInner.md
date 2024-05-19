# ModWikiGetWikisByCourses200ResponseWikisInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancreatepages** | Option<**bool**> | True if user can create pages. | [optional][default to null]
**course** | Option<**i32**> | Course id | [optional]
**coursemodule** | Option<**i32**> | Course module id | [optional]
**defaultformat** | Option<**String**> | Wiki's default format (html, creole, nwiki). | [optional][default to null]
**editbegin** | Option<**i32**> | Edit begin. | [optional][default to null]
**editend** | Option<**i32**> | Edit end. | [optional][default to null]
**firstpagetitle** | Option<**String**> | First page title. | [optional][default to null]
**forceformat** | Option<**i32**> | 1 if format is forced, 0 otherwise. | [optional][default to null]
**groupingid** | Option<**i32**> | Group id | [optional]
**groupmode** | Option<**i32**> | Group mode | [optional]
**id** | Option<**i32**> | Activity instance id | [optional]
**intro** | Option<**String**> | Activity introduction | [optional]
**introfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**lang** | Option<**String**> | Forced activity language | [optional]
**name** | Option<**String**> | Activity name | [optional]
**section** | Option<**i32**> | Course section id | [optional]
**timecreated** | Option<**i32**> | Time of creation. | [optional]
**timemodified** | Option<**i32**> | Time of last modification. | [optional]
**visible** | Option<**bool**> | Visible | [optional]
**wikimode** | Option<**String**> | Wiki mode (individual, collaborative). | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



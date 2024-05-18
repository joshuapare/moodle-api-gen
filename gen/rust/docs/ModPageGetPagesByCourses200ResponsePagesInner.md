# ModPageGetPagesByCourses200ResponsePagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | Option<**String**> | Page content | [optional][default to null]
**contentfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**contentformat** | Option<**i32**> | content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**course** | Option<**i32**> | Course id | [optional]
**coursemodule** | Option<**i32**> | Course module id | [optional]
**display** | Option<**i32**> | How to display the page | [optional][default to null]
**displayoptions** | Option<**String**> | Display options (width, height) | [optional][default to null]
**groupingid** | Option<**i32**> | Group id | [optional]
**groupmode** | Option<**i32**> | Group mode | [optional]
**id** | Option<**i32**> | Activity instance id | [optional]
**intro** | Option<**String**> | Activity introduction | [optional]
**introfiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**introformat** | Option<**i32**> | intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**lang** | Option<**String**> | Forced activity language | [optional]
**legacyfiles** | Option<**i32**> | Legacy files flag | [optional][default to null]
**legacyfileslast** | Option<**i32**> | Legacy files last control flag | [optional][default to null]
**name** | Option<**String**> | Activity name | [optional]
**revision** | Option<**i32**> | Incremented when after each file changes, to avoid cache | [optional]
**section** | Option<**i32**> | Course section id | [optional]
**timemodified** | Option<**i32**> | Last time the page was modified | [optional][default to null]
**visible** | Option<**bool**> | Visible | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



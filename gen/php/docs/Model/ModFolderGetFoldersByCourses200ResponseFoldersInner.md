# # ModFolderGetFoldersByCourses200ResponseFoldersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional]
**coursemodule** | **int** | Course module id | [optional]
**display** | **int** | Display type of folder contents on a separate page or inline | [optional] [default to null]
**forcedownload** | **int** | Whether file download is forced | [optional] [default to null]
**groupingid** | **int** | Group id | [optional]
**groupmode** | **int** | Group mode | [optional]
**id** | **int** | Activity instance id | [optional]
**intro** | **string** | Activity introduction | [optional]
**introfiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**lang** | **string** | Forced activity language | [optional]
**name** | **string** | Activity name | [optional]
**revision** | **int** | Incremented when after each file changes, to avoid cache | [optional] [default to null]
**section** | **int** | Course section id | [optional]
**showdownloadfolder** | **int** | Whether to show the download folder button | [optional] [default to null]
**showexpanded** | **int** | 1 &#x3D; expanded, 0 &#x3D; collapsed for sub-folders | [optional] [default to null]
**timemodified** | **int** | Last time the folder was modified | [optional] [default to null]
**visible** | **bool** | Visible | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

# MoodleClient.Model.ModFolderGetFoldersByCourses200ResponseFoldersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | **int** | Course id | [optional] 
**Coursemodule** | **int** | Course module id | [optional] 
**Display** | **int** | Display type of folder contents on a separate page or inline | [optional] [default to null]
**Forcedownload** | **int** | Whether file download is forced | [optional] [default to null]
**Groupingid** | **int** | Group id | [optional] 
**Groupmode** | **int** | Group mode | [optional] 
**Id** | **int** | Activity instance id | [optional] 
**Intro** | **string** | Activity introduction | [optional] 
**Introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | **string** | Forced activity language | [optional] 
**Name** | **string** | Activity name | [optional] 
**Revision** | **int** | Incremented when after each file changes, to avoid cache | [optional] [default to null]
**Section** | **int** | Course section id | [optional] 
**Showdownloadfolder** | **int** | Whether to show the download folder button | [optional] [default to null]
**Showexpanded** | **int** | 1 &#x3D; expanded, 0 &#x3D; collapsed for sub-folders | [optional] [default to null]
**Timemodified** | **int** | Last time the folder was modified | [optional] [default to null]
**Visible** | **bool** | Visible | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


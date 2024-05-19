# # ModPageGetPagesByCourses200ResponsePagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **string** | Page content | [optional] [default to 'null']
**contentfiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**course** | **int** | Course id | [optional]
**coursemodule** | **int** | Course module id | [optional]
**display** | **int** | How to display the page | [optional] [default to null]
**displayoptions** | **string** | Display options (width, height) | [optional] [default to 'null']
**groupingid** | **int** | Group id | [optional]
**groupmode** | **int** | Group mode | [optional]
**id** | **int** | Activity instance id | [optional]
**intro** | **string** | Activity introduction | [optional]
**introfiles** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner[]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional]
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**lang** | **string** | Forced activity language | [optional]
**legacyfiles** | **int** | Legacy files flag | [optional] [default to null]
**legacyfileslast** | **int** | Legacy files last control flag | [optional] [default to null]
**name** | **string** | Activity name | [optional]
**revision** | **int** | Incremented when after each file changes, to avoid cache | [optional]
**section** | **int** | Course section id | [optional]
**timemodified** | **int** | Last time the page was modified | [optional] [default to null]
**visible** | **bool** | Visible | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

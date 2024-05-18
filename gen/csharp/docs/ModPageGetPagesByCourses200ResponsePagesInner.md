# Org.OpenAPITools.Model.ModPageGetPagesByCourses200ResponsePagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | Page content | [optional] [default to "null"]
**Contentfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Course** | **int** | Course id | [optional] 
**Coursemodule** | **int** | Course module id | [optional] 
**Display** | **int** | How to display the page | [optional] [default to null]
**Displayoptions** | **string** | Display options (width, height) | [optional] [default to "null"]
**Groupingid** | **int** | Group id | [optional] 
**Groupmode** | **int** | Group mode | [optional] 
**Id** | **int** | Activity instance id | [optional] 
**Intro** | **string** | Activity introduction | [optional] 
**Introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | **string** | Forced activity language | [optional] 
**Legacyfiles** | **int** | Legacy files flag | [optional] [default to null]
**Legacyfileslast** | **int** | Legacy files last control flag | [optional] [default to null]
**Name** | **string** | Activity name | [optional] 
**Revision** | **int** | Incremented when after each file changes, to avoid cache | [optional] 
**Section** | **int** | Course section id | [optional] 
**Timemodified** | **int** | Last time the page was modified | [optional] [default to null]
**Visible** | **bool** | Visible | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


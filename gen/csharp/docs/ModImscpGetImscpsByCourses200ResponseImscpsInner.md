# MoodleClient.Model.ModImscpGetImscpsByCourses200ResponseImscpsInner
IMS content packages

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | **int** | Course id | [optional] 
**Coursemodule** | **int** | Course module id | [optional] 
**Groupingid** | **int** | Group id | [optional] 
**Groupmode** | **int** | Group mode | [optional] 
**Id** | **int** | Activity instance id | [optional] 
**Intro** | **string** | Activity introduction | [optional] 
**Introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Keepold** | **int** | Number of old IMSCP to keep | [optional] [default to null]
**Lang** | **string** | Forced activity language | [optional] 
**Name** | **string** | Activity name | [optional] 
**Revision** | **int** | Revision | [optional] [default to null]
**Section** | **int** | Course section id | [optional] 
**Structure** | **string** | IMSCP structure | [optional] [default to "null"]
**Timemodified** | **string** | Time of last modification | [optional] [default to "null"]
**Visible** | **bool** | Visible | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


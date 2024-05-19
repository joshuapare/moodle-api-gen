# Org.OpenAPITools.Model.ModWikiGetWikisByCourses200ResponseWikisInner
Wikis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cancreatepages** | **bool** | True if user can create pages. | [optional] [default to null]
**Course** | **int** | Course id | [optional] 
**Coursemodule** | **int** | Course module id | [optional] 
**Defaultformat** | **string** | Wiki&#39;s default format (html, creole, nwiki). | [optional] [default to "null"]
**Editbegin** | **int** | Edit begin. | [optional] [default to null]
**Editend** | **int** | Edit end. | [optional] [default to null]
**Firstpagetitle** | **string** | First page title. | [optional] [default to "null"]
**Forceformat** | **int** | 1 if format is forced, 0 otherwise. | [optional] [default to null]
**Groupingid** | **int** | Group id | [optional] 
**Groupmode** | **int** | Group mode | [optional] 
**Id** | **int** | Activity instance id | [optional] 
**Intro** | **string** | Activity introduction | [optional] 
**Introfiles** | [**List&lt;CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner&gt;**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | **string** | Forced activity language | [optional] 
**Name** | **string** | Activity name | [optional] 
**Section** | **int** | Course section id | [optional] 
**Timecreated** | **int** | Time of creation. | [optional] 
**Timemodified** | **int** | Time of last modification. | [optional] 
**Visible** | **bool** | Visible | [optional] 
**Wikimode** | **string** | Wiki mode (individual, collaborative). | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


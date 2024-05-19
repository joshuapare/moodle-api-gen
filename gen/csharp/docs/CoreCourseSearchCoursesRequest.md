# MoodleClient.Model.CoreCourseSearchCoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Criterianame** | **string** | criteria name                                                         (search, modulelist (only admins), blocklist (only admins), tagid) | [default to "null"]
**Criteriavalue** | **string** | criteria value | [default to "null"]
**Limittoenrolled** | **bool** | limit to enrolled courses | [optional] [default to 0]
**Onlywithcompletion** | **bool** | limit to courses where completion is enabled | [optional] [default to 0]
**Page** | **int** | page number (0 based) | [optional] [default to 0]
**Perpage** | **int** | items per page | [optional] [default to 0]
**Requiredcapabilities** | **List&lt;Object&gt;** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


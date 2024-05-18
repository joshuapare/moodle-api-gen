# # CoreCourseSearchCoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterianame** | **string** | criteria name                                                         (search, modulelist (only admins), blocklist (only admins), tagid) | [default to 'null']
**criteriavalue** | **string** | criteria value | [default to 'null']
**limittoenrolled** | **bool** | limit to enrolled courses | [optional] [default to 0]
**onlywithcompletion** | **bool** | limit to courses where completion is enabled | [optional] [default to 0]
**page** | **int** | page number (0 based) | [optional] [default to 0]
**perpage** | **int** | items per page | [optional] [default to 0]
**requiredcapabilities** | **object[]** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

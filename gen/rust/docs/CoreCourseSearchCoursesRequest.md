# CoreCourseSearchCoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterianame** | **String** | criteria name                                                         (search, modulelist (only admins), blocklist (only admins), tagid) | [default to null]
**criteriavalue** | **String** | criteria value | [default to null]
**limittoenrolled** | Option<**bool**> | limit to enrolled courses | [optional][default to 0]
**onlywithcompletion** | Option<**bool**> | limit to courses where completion is enabled | [optional][default to 0]
**page** | Option<**i32**> | page number (0 based) | [optional][default to 0]
**perpage** | Option<**i32**> | items per page | [optional][default to 0]
**requiredcapabilities** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


